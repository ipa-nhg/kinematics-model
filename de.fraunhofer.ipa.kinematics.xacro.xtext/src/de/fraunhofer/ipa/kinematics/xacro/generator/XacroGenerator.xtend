/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.kinematics.xacro.generator

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import xacro.Body
import xacro.Joint
import xacro.Link
import xacro.LinkRef
import xacro.Macro
import xacro.MacroCall
import xacro.Parameter
import xacro.ParameterCall
import xacro.ParameterLink
import xacro.ParameterPose
import xacro.ParameterString
import xacro.Pose
import xacro.Robot
import java.util.ArrayList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class XacroGenerator extends AbstractGenerator {

		override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (robot : resource.allContents.toIterable.filter(Robot)) {
			fsa.generateFile(robot.name + ".xacro", robot.compile)
		}
	}

	private def get_prefix(Parameter param) {
		var prefix = "";
		if (param !== null) {
			prefix = "${" + param.name + "}"
		}
		return prefix;
	}

	private def compile_parameter_string(ParameterString paramStr) {
		return get_prefix(paramStr.ref) + paramStr.value;
	}

	private def compile_link(Link link)'''
<link name="«compile_parameter_string(link.name)»" >
	«IF link.visual !== null»
	<visual>
		«IF link.visual.geometry !== null»
		<geometry>
			«IF link.visual.geometry.mesh !== null»
			<mesh filename="«link.visual.geometry.mesh.filename»" />
			«ENDIF»
			«IF link.visual.geometry.box !== null»
			<box size="«link.visual.geometry.box.size»" />
			«ENDIF»
			«IF link.visual.geometry.cylinder !== null»
			<cylinder length="«link.visual.geometry.cylinder.length»" radius"«link.visual.geometry.cylinder.radius»"/>
			«ENDIF»
		</geometry>
		«ENDIF»
	</visual>
	«ENDIF»
	«IF link.collision !== null»
	<collision>
		«IF link.collision.geometry !== null»
		<geometry>
			«IF link.collision.geometry.mesh !== null»
			<mesh filename="«link.collision.geometry.mesh.filename»" />
			«ENDIF»
			«IF link.collision.geometry.box !== null»
			<box size="«link.collision.geometry.box.size»" />
			«ENDIF»
			«IF link.collision.geometry.cylinder !== null»
			<cylinder length="«link.collision.geometry.cylinder.length»" radius"«link.collision.geometry.cylinder.radius»"/>
			«ENDIF»
		</geometry>
		«ENDIF»
	</collision>
	«ENDIF»
	«IF link.inertial !== null»
	<inertial>
		«IF link.inertial.mass !== null»
		<mass value="«link.inertial.mass.value»">
		«ENDIF»
		«IF link.inertial.origin !== null»
		<origin xyz="«link.inertial.origin.xyz»" rpy="«link.inertial.origin.rpy»" />
		«ENDIF»
		«IF link.inertial.inertia !== null»
		<inertia ixx="«link.inertial.inertia.ixx»" ixy="«link.inertial.inertia.ixy»" ixz="«link.inertial.inertia.ixz»"
			iyy="«link.inertial.inertia.iyy»" iyz="«link.inertial.inertia.iyz»"
			izz="«link.inertial.inertia.izz»" />
		«ENDIF»
	</inertial>
	«ENDIF»
</link>
	'''

	private def get_link_name(ParameterLink paramLink) {
		var link_name = "";
		if (paramLink.param !== null) {
			var param = paramLink.param as Parameter
			link_name = "${" + param.name + "}";
		} else if (paramLink.link !== null) {
			var link = paramLink.link as Link
			link_name = compile_parameter_string(link.name);
		}
		return link_name;
	}

	private def compile_origin(ParameterPose pose) {
		var originStr = "";
		if (pose.value !== null) {
			originStr = "<origin xyz=\"" + pose.value.xyz + "\" rpy=\"" + pose.value.rpy + "\" />"; 
		} else if (pose.ref !== null) {
			var param = pose.ref as Parameter;
			originStr = "<xacro:insert_block name=\"" + param.name + "\"/>"
		}
		return originStr;
	}

	private def compile_joint(Joint joint)'''
<joint name="«compile_parameter_string(joint.name)»" type="«joint.type»">
	<parent link="«get_link_name(joint.parent)»" />
	<child link="«get_link_name(joint.child)»" />
	«compile_origin(joint.origin)»
	«IF joint.axis !== null»
	<axis xyz="«joint.axis.xyz»">
	«ENDIF»
</joint>
	'''

	private def compile_body(Body body)'''
	«FOR link : body.link»
	«compile_link(link)»
	«ENDFOR»
	«FOR joint : body.joint»
	«compile_joint(joint)»
	«ENDFOR»
	'''

	private def compile_macro(Macro macro) '''
	<xacro:macro name="«macro.name»" params="«FOR param : macro.parameter»«param.name» «ENDFOR»">
		«IF macro.body !== null»
		«compile_body(macro.body)»
		«ENDIF»
	</xacro:macro>
	'''

	private def get_params(EList<ParameterCall> params) {
		var paramStr = "";
		for(param : params) {
			if(!(param.value instanceof Pose) && !(param.value instanceof LinkRef)) {
				paramStr += " " + param.parameter.name + "=\"" + param.value.value + "\"";
			} else if(param.value instanceof LinkRef) {
				paramStr += " " + param.parameter.name + "=\"" + compile_parameter_string(((param.value as LinkRef).ref as Link).name) + "\"";
			}
		}
		paramStr += ">";
		for(param : params) {
			if(param.value instanceof Pose) {
				var pose = param.value as Pose;
				paramStr += "\n\t" + "<origin xyz=\"" + pose.xyz + "\" rpy=\"" + pose.rpy + "\" />";
			}
		}
		return paramStr;
	}

	private def compile_macroCall(MacroCall macroCall)'''
	<xacro:«macroCall.macro.name» «get_params(macroCall.parameterCall)»
	</xacro:«macroCall.macro.name»>
	'''

	private def get_include_robots(Robot robot) {
		var rNames = new ArrayList<String>();
		for (macroCall : robot.macroCall) {
			var rName = (macroCall.macro.eContainer() as Robot).name
			if (!rNames.contains(rName)) {
				rNames.add(rName);
			}
		}
		return rNames;
	}

	private def compile(Robot robot) '''
	<?xml version="«robot.version»"?>
	<robot xmlns:xacro="http://wiki.ros.org/xacro" name="«robot.name»" >

	«val includes = get_include_robots(robot)»
		«FOR include : includes»
		<xacro:include filename="$(find «robot.name»_description)/urdf/«include».xacro" />
		«ENDFOR»

		«FOR macro : robot.macro»
		«compile_macro(macro)»
		«ENDFOR»
		«FOR macroCall : robot.macroCall»
		«compile_macroCall(macroCall)»
		«ENDFOR»

		«IF robot.body !== null»
		«compile_body(robot.body)»
		«ENDIF»
	</robot>
	'''
}

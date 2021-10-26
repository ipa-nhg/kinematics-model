/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.kinematics.xacro.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.kinematics.xacro.services.XacroGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import urdf.ActuatorTransmission;
import urdf.Axis;
import urdf.Box;
import urdf.Calibration;
import urdf.Collision;
import urdf.Color;
import urdf.Cylinder;
import urdf.Dynamics;
import urdf.GapJointTransmission;
import urdf.Geometry;
import urdf.Inertia;
import urdf.Inertial;
import urdf.Joint;
import urdf.Limit;
import urdf.Link;
import urdf.Mass;
import urdf.Material;
import urdf.MaterialGlobal;
import urdf.Mesh;
import urdf.Mimic;
import urdf.Name;
import urdf.PassiveJointTransmission;
import urdf.Pose;
import urdf.SafetyController;
import urdf.Sphere;
import urdf.Texture;
import urdf.Transmission;
import urdf.UrdfPackage;
import urdf.UseSimulatedGripperJointType;
import urdf.Verbose;
import urdf.Visual;
import xacro.Body;
import xacro.Macro;
import xacro.Robot;
import xacro.XacroPackage;

@SuppressWarnings("all")
public class XacroSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XacroGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UrdfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UrdfPackage.ACTUATOR_TRANSMISSION:
				sequence_ActuatorTransmission(context, (ActuatorTransmission) semanticObject); 
				return; 
			case UrdfPackage.AXIS:
				sequence_Axis(context, (Axis) semanticObject); 
				return; 
			case UrdfPackage.BOX:
				sequence_Box(context, (Box) semanticObject); 
				return; 
			case UrdfPackage.CALIBRATION:
				sequence_Calibration(context, (Calibration) semanticObject); 
				return; 
			case UrdfPackage.COLLISION:
				sequence_Collision(context, (Collision) semanticObject); 
				return; 
			case UrdfPackage.COLOR:
				sequence_Color(context, (Color) semanticObject); 
				return; 
			case UrdfPackage.CYLINDER:
				sequence_Cylinder(context, (Cylinder) semanticObject); 
				return; 
			case UrdfPackage.DYNAMICS:
				sequence_Dynamics(context, (Dynamics) semanticObject); 
				return; 
			case UrdfPackage.GAP_JOINT_TRANSMISSION:
				sequence_GapJointTransmission(context, (GapJointTransmission) semanticObject); 
				return; 
			case UrdfPackage.GEOMETRY:
				sequence_Geometry(context, (Geometry) semanticObject); 
				return; 
			case UrdfPackage.INERTIA:
				sequence_Inertia(context, (Inertia) semanticObject); 
				return; 
			case UrdfPackage.INERTIAL:
				sequence_Inertial(context, (Inertial) semanticObject); 
				return; 
			case UrdfPackage.JOINT:
				sequence_Joint(context, (Joint) semanticObject); 
				return; 
			case UrdfPackage.LIMIT:
				sequence_Limit(context, (Limit) semanticObject); 
				return; 
			case UrdfPackage.LINK:
				sequence_Link(context, (Link) semanticObject); 
				return; 
			case UrdfPackage.MASS:
				sequence_Mass(context, (Mass) semanticObject); 
				return; 
			case UrdfPackage.MATERIAL:
				sequence_Material(context, (Material) semanticObject); 
				return; 
			case UrdfPackage.MATERIAL_GLOBAL:
				sequence_MaterialGlobal(context, (MaterialGlobal) semanticObject); 
				return; 
			case UrdfPackage.MESH:
				sequence_Mesh(context, (Mesh) semanticObject); 
				return; 
			case UrdfPackage.MIMIC:
				sequence_Mimic(context, (Mimic) semanticObject); 
				return; 
			case UrdfPackage.NAME:
				sequence_Name(context, (Name) semanticObject); 
				return; 
			case UrdfPackage.PASSIVE_JOINT_TRANSMISSION:
				sequence_PassiveJointTransmission(context, (PassiveJointTransmission) semanticObject); 
				return; 
			case UrdfPackage.POSE:
				sequence_Pose(context, (Pose) semanticObject); 
				return; 
			case UrdfPackage.SAFETY_CONTROLLER:
				sequence_SafetyController(context, (SafetyController) semanticObject); 
				return; 
			case UrdfPackage.SPHERE:
				sequence_Sphere(context, (Sphere) semanticObject); 
				return; 
			case UrdfPackage.TEXTURE:
				sequence_Texture(context, (Texture) semanticObject); 
				return; 
			case UrdfPackage.TRANSMISSION:
				sequence_Transmission(context, (Transmission) semanticObject); 
				return; 
			case UrdfPackage.USE_SIMULATED_GRIPPER_JOINT_TYPE:
				sequence_UseSimulatedGripperJointType(context, (UseSimulatedGripperJointType) semanticObject); 
				return; 
			case UrdfPackage.VERBOSE:
				sequence_Verbose(context, (Verbose) semanticObject); 
				return; 
			case UrdfPackage.VISUAL:
				sequence_Visual(context, (Visual) semanticObject); 
				return; 
			}
		else if (epackage == XacroPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XacroPackage.BODY:
				sequence_Body(context, (Body) semanticObject); 
				return; 
			case XacroPackage.MACRO:
				sequence_Macro(context, (Macro) semanticObject); 
				return; 
			case XacroPackage.PARAMETER:
				sequence_Parameter(context, (xacro.Parameter) semanticObject); 
				return; 
			case XacroPackage.ROBOT:
				sequence_Robot(context, (Robot) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActuatorTransmission returns ActuatorTransmission
	 *
	 * Constraint:
	 *     (mechanicalReduction=Double0 name=EString)
	 */
	protected void sequence_ActuatorTransmission(ISerializationContext context, ActuatorTransmission semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.ACTUATOR_TRANSMISSION__MECHANICAL_REDUCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.ACTUATOR_TRANSMISSION__MECHANICAL_REDUCTION));
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.ACTUATOR_TRANSMISSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.ACTUATOR_TRANSMISSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActuatorTransmissionAccess().getMechanicalReductionDouble0ParserRuleCall_3_0(), semanticObject.getMechanicalReduction());
		feeder.accept(grammarAccess.getActuatorTransmissionAccess().getNameEStringParserRuleCall_5_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Axis returns Axis
	 *
	 * Constraint:
	 *     xyz=EString?
	 */
	protected void sequence_Axis(ISerializationContext context, Axis semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Body returns Body
	 *
	 * Constraint:
	 *     (
	 *         (link+=Link link+=Link*)? 
	 *         (joint+=Joint joint+=Joint*)? 
	 *         (link+=Link link+=Link*)? 
	 *         (material+=MaterialGlobal material+=MaterialGlobal*)? 
	 *         (transmission+=Transmission transmission+=Transmission*)?
	 *     )
	 */
	protected void sequence_Body(ISerializationContext context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Box returns Box
	 *
	 * Constraint:
	 *     size=EString?
	 */
	protected void sequence_Box(ISerializationContext context, Box semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Calibration returns Calibration
	 *
	 * Constraint:
	 *     (falling=Double0? referencePosition=Double0? rising=Double0?)
	 */
	protected void sequence_Calibration(ISerializationContext context, Calibration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Collision returns Collision
	 *
	 * Constraint:
	 *     (name=EString? origin=Pose? geometry=Geometry verbose=Verbose?)
	 */
	protected void sequence_Collision(ISerializationContext context, Collision semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Color returns Color
	 *
	 * Constraint:
	 *     rgba=EString?
	 */
	protected void sequence_Color(ISerializationContext context, Color semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Cylinder returns Cylinder
	 *
	 * Constraint:
	 *     (length=Double0 radius=Double0)
	 */
	protected void sequence_Cylinder(ISerializationContext context, Cylinder semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.CYLINDER__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.CYLINDER__LENGTH));
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.CYLINDER__RADIUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.CYLINDER__RADIUS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_3_0(), semanticObject.getLength());
		feeder.accept(grammarAccess.getCylinderAccess().getRadiusDouble0ParserRuleCall_5_0(), semanticObject.getRadius());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Dynamics returns Dynamics
	 *
	 * Constraint:
	 *     (damping=Double0? friction=Double0?)
	 */
	protected void sequence_Dynamics(ISerializationContext context, Dynamics semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GapJointTransmission returns GapJointTransmission
	 *
	 * Constraint:
	 *     (
	 *         a=Double0 
	 *         b=Double0 
	 *         gearRatio=Double0 
	 *         h=Double0 
	 *         l0=Double0 
	 *         mechanicalReduction=Double0 
	 *         name=EString 
	 *         phi0=Double0 
	 *         r=Double0 
	 *         screwReduction=Double0 
	 *         t0=Double0 
	 *         theta0=Double0
	 *     )
	 */
	protected void sequence_GapJointTransmission(ISerializationContext context, GapJointTransmission semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__A) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__A));
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__B) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__B));
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__GEAR_RATIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__GEAR_RATIO));
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__H) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__H));
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__L0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__L0));
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__MECHANICAL_REDUCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__MECHANICAL_REDUCTION));
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__NAME));
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__PHI0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__PHI0));
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__R) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__R));
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__SCREW_REDUCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__SCREW_REDUCTION));
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__T0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__T0));
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__THETA0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__THETA0));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGapJointTransmissionAccess().getADouble0ParserRuleCall_3_0(), semanticObject.getA());
		feeder.accept(grammarAccess.getGapJointTransmissionAccess().getBDouble0ParserRuleCall_5_0(), semanticObject.getB());
		feeder.accept(grammarAccess.getGapJointTransmissionAccess().getGearRatioDouble0ParserRuleCall_7_0(), semanticObject.getGearRatio());
		feeder.accept(grammarAccess.getGapJointTransmissionAccess().getHDouble0ParserRuleCall_9_0(), semanticObject.getH());
		feeder.accept(grammarAccess.getGapJointTransmissionAccess().getL0Double0ParserRuleCall_11_0(), semanticObject.getL0());
		feeder.accept(grammarAccess.getGapJointTransmissionAccess().getMechanicalReductionDouble0ParserRuleCall_13_0(), semanticObject.getMechanicalReduction());
		feeder.accept(grammarAccess.getGapJointTransmissionAccess().getNameEStringParserRuleCall_15_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGapJointTransmissionAccess().getPhi0Double0ParserRuleCall_17_0(), semanticObject.getPhi0());
		feeder.accept(grammarAccess.getGapJointTransmissionAccess().getRDouble0ParserRuleCall_19_0(), semanticObject.getR());
		feeder.accept(grammarAccess.getGapJointTransmissionAccess().getScrewReductionDouble0ParserRuleCall_21_0(), semanticObject.getScrewReduction());
		feeder.accept(grammarAccess.getGapJointTransmissionAccess().getT0Double0ParserRuleCall_23_0(), semanticObject.getT0());
		feeder.accept(grammarAccess.getGapJointTransmissionAccess().getTheta0Double0ParserRuleCall_25_0(), semanticObject.getTheta0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Geometry returns Geometry
	 *
	 * Constraint:
	 *     (box=Box? cylinder=Cylinder? sphere=Sphere? mesh=Mesh?)
	 */
	protected void sequence_Geometry(ISerializationContext context, Geometry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Inertia returns Inertia
	 *
	 * Constraint:
	 *     (
	 *         ixx=Double0? 
	 *         ixy=Double0? 
	 *         ixz=Double0? 
	 *         iyy=Double0? 
	 *         iyz=Double0? 
	 *         izz=Double0?
	 *     )
	 */
	protected void sequence_Inertia(ISerializationContext context, Inertia semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Inertial returns Inertial
	 *
	 * Constraint:
	 *     (origin=Pose? mass=Mass? inertia=Inertia?)
	 */
	protected void sequence_Inertial(ISerializationContext context, Inertial semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Joint returns Joint
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         type=JOINTTYPE 
	 *         parent=[Link|EString] 
	 *         child=[Link|EString] 
	 *         origin=Pose? 
	 *         axis=Axis? 
	 *         calibration=Calibration? 
	 *         dynamics=Dynamics? 
	 *         limit=Limit? 
	 *         safetyController=SafetyController? 
	 *         mimic=Mimic?
	 *     )
	 */
	protected void sequence_Joint(ISerializationContext context, Joint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Limit returns Limit
	 *
	 * Constraint:
	 *     (effort=Double0? lower=Double0? upper=Double0? velocity=Double0?)
	 */
	protected void sequence_Limit(ISerializationContext context, Limit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Link returns Link
	 *
	 * Constraint:
	 *     (name=EString type=EString? inertial=Inertial? visual=Visual? collision=Collision?)
	 */
	protected void sequence_Link(ISerializationContext context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Macro returns Macro
	 *
	 * Constraint:
	 *     (name=EString (parameter+=Parameter parameter+=Parameter*)? body=Body?)
	 */
	protected void sequence_Macro(ISerializationContext context, Macro semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mass returns Mass
	 *
	 * Constraint:
	 *     value=Double0?
	 */
	protected void sequence_Mass(ISerializationContext context, Mass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MaterialGlobal returns MaterialGlobal
	 *
	 * Constraint:
	 *     (name=EString color=Color? texture=Texture?)
	 */
	protected void sequence_MaterialGlobal(ISerializationContext context, MaterialGlobal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Material returns Material
	 *
	 * Constraint:
	 *     (name=EString? color=Color? texture=Texture?)
	 */
	protected void sequence_Material(ISerializationContext context, Material semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mesh returns Mesh
	 *
	 * Constraint:
	 *     (filename=AnyURI scale=EString?)
	 */
	protected void sequence_Mesh(ISerializationContext context, Mesh semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mimic returns Mimic
	 *
	 * Constraint:
	 *     (joint=EString multiplier=Double0? offset=Double0?)
	 */
	protected void sequence_Mimic(ISerializationContext context, Mimic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Name returns Name
	 *
	 * Constraint:
	 *     name=EString?
	 */
	protected void sequence_Name(ISerializationContext context, Name semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=EString default=EString? value=EString?)
	 */
	protected void sequence_Parameter(ISerializationContext context, xacro.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PassiveJointTransmission returns PassiveJointTransmission
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_PassiveJointTransmission(ISerializationContext context, PassiveJointTransmission semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.PASSIVE_JOINT_TRANSMISSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.PASSIVE_JOINT_TRANSMISSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPassiveJointTransmissionAccess().getNameEStringParserRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pose returns Pose
	 *
	 * Constraint:
	 *     (rpy=EString? xyz=EString?)
	 */
	protected void sequence_Pose(ISerializationContext context, Pose semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Robot returns Robot
	 *
	 * Constraint:
	 *     (name=EString version=EString? (macro+=Macro macro+=Macro*)? body=Body?)
	 */
	protected void sequence_Robot(ISerializationContext context, Robot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SafetyController returns SafetyController
	 *
	 * Constraint:
	 *     (kPosition=Double0? kVelocity=Double0 softLowerLimit=Double0? softUpperLimit=Double0?)
	 */
	protected void sequence_SafetyController(ISerializationContext context, SafetyController semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sphere returns Sphere
	 *
	 * Constraint:
	 *     radius=Double0
	 */
	protected void sequence_Sphere(ISerializationContext context, Sphere semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.SPHERE__RADIUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.SPHERE__RADIUS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_3_0(), semanticObject.getRadius());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Texture returns Texture
	 *
	 * Constraint:
	 *     filename=AnyURI?
	 */
	protected void sequence_Texture(ISerializationContext context, Texture semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transmission returns Transmission
	 *
	 * Constraint:
	 *     (
	 *         (mechanicalReduction+=Double0 mechanicalReduction+=Double0*)? 
	 *         name=EString 
	 *         type=EString 
	 *         (leftActuator+=ActuatorTransmission leftActuator+=ActuatorTransmission*)? 
	 *         (rightActuator+=ActuatorTransmission rightActuator+=ActuatorTransmission*)? 
	 *         (flexJoint+=ActuatorTransmission flexJoint+=ActuatorTransmission*)? 
	 *         (rollJoint+=ActuatorTransmission rollJoint+=ActuatorTransmission*)? 
	 *         (gapJoint+=GapJointTransmission gapJoint+=GapJointTransmission*)? 
	 *         (passiveJoint+=PassiveJointTransmission passiveJoint+=PassiveJointTransmission*)? 
	 *         (useSimulatedGripperJoint+=UseSimulatedGripperJointType useSimulatedGripperJoint+=UseSimulatedGripperJointType*)? 
	 *         (actuator+=Name actuator+=Name*)? 
	 *         (joint+=Name joint+=Name*)?
	 *     )
	 */
	protected void sequence_Transmission(ISerializationContext context, Transmission semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UseSimulatedGripperJointType returns UseSimulatedGripperJointType
	 *
	 * Constraint:
	 *     {UseSimulatedGripperJointType}
	 */
	protected void sequence_UseSimulatedGripperJointType(ISerializationContext context, UseSimulatedGripperJointType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Verbose returns Verbose
	 *
	 * Constraint:
	 *     value=EString?
	 */
	protected void sequence_Verbose(ISerializationContext context, Verbose semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Visual returns Visual
	 *
	 * Constraint:
	 *     (origin=Pose? geometry=Geometry material=Material?)
	 */
	protected void sequence_Visual(ISerializationContext context, Visual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

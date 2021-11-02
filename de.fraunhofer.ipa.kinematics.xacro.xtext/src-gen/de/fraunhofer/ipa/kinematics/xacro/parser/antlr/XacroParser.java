/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.kinematics.xacro.parser.antlr;

import com.google.inject.Inject;
import de.fraunhofer.ipa.kinematics.xacro.parser.antlr.internal.InternalXacroParser;
import de.fraunhofer.ipa.kinematics.xacro.services.XacroGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class XacroParser extends AbstractAntlrParser {

	@Inject
	private XacroGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalXacroParser createParser(XtextTokenStream stream) {
		return new InternalXacroParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Robot";
	}

	public XacroGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XacroGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

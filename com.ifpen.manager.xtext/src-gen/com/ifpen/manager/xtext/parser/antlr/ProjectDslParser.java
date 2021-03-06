/*
 * generated by Xtext 2.9.2
 */
package com.ifpen.manager.xtext.parser.antlr;

import com.google.inject.Inject;
import com.ifpen.manager.xtext.parser.antlr.internal.InternalProjectDslParser;
import com.ifpen.manager.xtext.services.ProjectDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ProjectDslParser extends AbstractAntlrParser {

	@Inject
	private ProjectDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalProjectDslParser createParser(XtextTokenStream stream) {
		return new InternalProjectDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Company";
	}

	public ProjectDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ProjectDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

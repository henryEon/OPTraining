package com.ifpen.manager.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.ifpen.manager.xtext.services.ProjectDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'development'", "'documentation'", "'Company'", "'employees'", "'{'", "'}'", "'Employee'", "'weight'", "'height'", "'Project'", "'type'", "'Task'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalProjectDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProjectDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProjectDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProjectDsl.g"; }


    	private ProjectDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(ProjectDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCompany"
    // InternalProjectDsl.g:53:1: entryRuleCompany : ruleCompany EOF ;
    public final void entryRuleCompany() throws RecognitionException {
        try {
            // InternalProjectDsl.g:54:1: ( ruleCompany EOF )
            // InternalProjectDsl.g:55:1: ruleCompany EOF
            {
             before(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            ruleCompany();

            state._fsp--;

             after(grammarAccess.getCompanyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalProjectDsl.g:62:1: ruleCompany : ( ( rule__Company__Group__0 ) ) ;
    public final void ruleCompany() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:66:2: ( ( ( rule__Company__Group__0 ) ) )
            // InternalProjectDsl.g:67:2: ( ( rule__Company__Group__0 ) )
            {
            // InternalProjectDsl.g:67:2: ( ( rule__Company__Group__0 ) )
            // InternalProjectDsl.g:68:3: ( rule__Company__Group__0 )
            {
             before(grammarAccess.getCompanyAccess().getGroup()); 
            // InternalProjectDsl.g:69:3: ( rule__Company__Group__0 )
            // InternalProjectDsl.g:69:4: rule__Company__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleEmployees"
    // InternalProjectDsl.g:78:1: entryRuleEmployees : ruleEmployees EOF ;
    public final void entryRuleEmployees() throws RecognitionException {
        try {
            // InternalProjectDsl.g:79:1: ( ruleEmployees EOF )
            // InternalProjectDsl.g:80:1: ruleEmployees EOF
            {
             before(grammarAccess.getEmployeesRule()); 
            pushFollow(FOLLOW_1);
            ruleEmployees();

            state._fsp--;

             after(grammarAccess.getEmployeesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmployees"


    // $ANTLR start "ruleEmployees"
    // InternalProjectDsl.g:87:1: ruleEmployees : ( ( rule__Employees__Group__0 ) ) ;
    public final void ruleEmployees() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:91:2: ( ( ( rule__Employees__Group__0 ) ) )
            // InternalProjectDsl.g:92:2: ( ( rule__Employees__Group__0 ) )
            {
            // InternalProjectDsl.g:92:2: ( ( rule__Employees__Group__0 ) )
            // InternalProjectDsl.g:93:3: ( rule__Employees__Group__0 )
            {
             before(grammarAccess.getEmployeesAccess().getGroup()); 
            // InternalProjectDsl.g:94:3: ( rule__Employees__Group__0 )
            // InternalProjectDsl.g:94:4: rule__Employees__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Employees__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmployeesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmployees"


    // $ANTLR start "entryRuleEmployee"
    // InternalProjectDsl.g:103:1: entryRuleEmployee : ruleEmployee EOF ;
    public final void entryRuleEmployee() throws RecognitionException {
        try {
            // InternalProjectDsl.g:104:1: ( ruleEmployee EOF )
            // InternalProjectDsl.g:105:1: ruleEmployee EOF
            {
             before(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            ruleEmployee();

            state._fsp--;

             after(grammarAccess.getEmployeeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalProjectDsl.g:112:1: ruleEmployee : ( ( rule__Employee__Group__0 ) ) ;
    public final void ruleEmployee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:116:2: ( ( ( rule__Employee__Group__0 ) ) )
            // InternalProjectDsl.g:117:2: ( ( rule__Employee__Group__0 ) )
            {
            // InternalProjectDsl.g:117:2: ( ( rule__Employee__Group__0 ) )
            // InternalProjectDsl.g:118:3: ( rule__Employee__Group__0 )
            {
             before(grammarAccess.getEmployeeAccess().getGroup()); 
            // InternalProjectDsl.g:119:3: ( rule__Employee__Group__0 )
            // InternalProjectDsl.g:119:4: rule__Employee__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleProject"
    // InternalProjectDsl.g:128:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalProjectDsl.g:129:1: ( ruleProject EOF )
            // InternalProjectDsl.g:130:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalProjectDsl.g:137:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:141:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalProjectDsl.g:142:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalProjectDsl.g:142:2: ( ( rule__Project__Group__0 ) )
            // InternalProjectDsl.g:143:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalProjectDsl.g:144:3: ( rule__Project__Group__0 )
            // InternalProjectDsl.g:144:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleTask"
    // InternalProjectDsl.g:153:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalProjectDsl.g:154:1: ( ruleTask EOF )
            // InternalProjectDsl.g:155:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalProjectDsl.g:162:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:166:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalProjectDsl.g:167:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalProjectDsl.g:167:2: ( ( rule__Task__Group__0 ) )
            // InternalProjectDsl.g:168:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalProjectDsl.g:169:3: ( rule__Task__Group__0 )
            // InternalProjectDsl.g:169:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "ruletaskType"
    // InternalProjectDsl.g:178:1: ruletaskType : ( ( rule__TaskType__Alternatives ) ) ;
    public final void ruletaskType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:182:1: ( ( ( rule__TaskType__Alternatives ) ) )
            // InternalProjectDsl.g:183:2: ( ( rule__TaskType__Alternatives ) )
            {
            // InternalProjectDsl.g:183:2: ( ( rule__TaskType__Alternatives ) )
            // InternalProjectDsl.g:184:3: ( rule__TaskType__Alternatives )
            {
             before(grammarAccess.getTaskTypeAccess().getAlternatives()); 
            // InternalProjectDsl.g:185:3: ( rule__TaskType__Alternatives )
            // InternalProjectDsl.g:185:4: rule__TaskType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TaskType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTaskTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletaskType"


    // $ANTLR start "rule__TaskType__Alternatives"
    // InternalProjectDsl.g:193:1: rule__TaskType__Alternatives : ( ( ( 'development' ) ) | ( ( 'documentation' ) ) );
    public final void rule__TaskType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:197:1: ( ( ( 'development' ) ) | ( ( 'documentation' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalProjectDsl.g:198:2: ( ( 'development' ) )
                    {
                    // InternalProjectDsl.g:198:2: ( ( 'development' ) )
                    // InternalProjectDsl.g:199:3: ( 'development' )
                    {
                     before(grammarAccess.getTaskTypeAccess().getDevelopmentEnumLiteralDeclaration_0()); 
                    // InternalProjectDsl.g:200:3: ( 'development' )
                    // InternalProjectDsl.g:200:4: 'development'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskTypeAccess().getDevelopmentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectDsl.g:204:2: ( ( 'documentation' ) )
                    {
                    // InternalProjectDsl.g:204:2: ( ( 'documentation' ) )
                    // InternalProjectDsl.g:205:3: ( 'documentation' )
                    {
                     before(grammarAccess.getTaskTypeAccess().getDocumentationEnumLiteralDeclaration_1()); 
                    // InternalProjectDsl.g:206:3: ( 'documentation' )
                    // InternalProjectDsl.g:206:4: 'documentation'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskTypeAccess().getDocumentationEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskType__Alternatives"


    // $ANTLR start "rule__Company__Group__0"
    // InternalProjectDsl.g:214:1: rule__Company__Group__0 : rule__Company__Group__0__Impl rule__Company__Group__1 ;
    public final void rule__Company__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:218:1: ( rule__Company__Group__0__Impl rule__Company__Group__1 )
            // InternalProjectDsl.g:219:2: rule__Company__Group__0__Impl rule__Company__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Company__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__0"


    // $ANTLR start "rule__Company__Group__0__Impl"
    // InternalProjectDsl.g:226:1: rule__Company__Group__0__Impl : ( 'Company' ) ;
    public final void rule__Company__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:230:1: ( ( 'Company' ) )
            // InternalProjectDsl.g:231:1: ( 'Company' )
            {
            // InternalProjectDsl.g:231:1: ( 'Company' )
            // InternalProjectDsl.g:232:2: 'Company'
            {
             before(grammarAccess.getCompanyAccess().getCompanyKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getCompanyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__0__Impl"


    // $ANTLR start "rule__Company__Group__1"
    // InternalProjectDsl.g:241:1: rule__Company__Group__1 : rule__Company__Group__1__Impl rule__Company__Group__2 ;
    public final void rule__Company__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:245:1: ( rule__Company__Group__1__Impl rule__Company__Group__2 )
            // InternalProjectDsl.g:246:2: rule__Company__Group__1__Impl rule__Company__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Company__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__1"


    // $ANTLR start "rule__Company__Group__1__Impl"
    // InternalProjectDsl.g:253:1: rule__Company__Group__1__Impl : ( ( rule__Company__NameAssignment_1 ) ) ;
    public final void rule__Company__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:257:1: ( ( ( rule__Company__NameAssignment_1 ) ) )
            // InternalProjectDsl.g:258:1: ( ( rule__Company__NameAssignment_1 ) )
            {
            // InternalProjectDsl.g:258:1: ( ( rule__Company__NameAssignment_1 ) )
            // InternalProjectDsl.g:259:2: ( rule__Company__NameAssignment_1 )
            {
             before(grammarAccess.getCompanyAccess().getNameAssignment_1()); 
            // InternalProjectDsl.g:260:2: ( rule__Company__NameAssignment_1 )
            // InternalProjectDsl.g:260:3: rule__Company__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Company__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__1__Impl"


    // $ANTLR start "rule__Company__Group__2"
    // InternalProjectDsl.g:268:1: rule__Company__Group__2 : rule__Company__Group__2__Impl rule__Company__Group__3 ;
    public final void rule__Company__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:272:1: ( rule__Company__Group__2__Impl rule__Company__Group__3 )
            // InternalProjectDsl.g:273:2: rule__Company__Group__2__Impl rule__Company__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Company__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__2"


    // $ANTLR start "rule__Company__Group__2__Impl"
    // InternalProjectDsl.g:280:1: rule__Company__Group__2__Impl : ( ( rule__Company__EmployeesAssignment_2 ) ) ;
    public final void rule__Company__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:284:1: ( ( ( rule__Company__EmployeesAssignment_2 ) ) )
            // InternalProjectDsl.g:285:1: ( ( rule__Company__EmployeesAssignment_2 ) )
            {
            // InternalProjectDsl.g:285:1: ( ( rule__Company__EmployeesAssignment_2 ) )
            // InternalProjectDsl.g:286:2: ( rule__Company__EmployeesAssignment_2 )
            {
             before(grammarAccess.getCompanyAccess().getEmployeesAssignment_2()); 
            // InternalProjectDsl.g:287:2: ( rule__Company__EmployeesAssignment_2 )
            // InternalProjectDsl.g:287:3: rule__Company__EmployeesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Company__EmployeesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getEmployeesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__2__Impl"


    // $ANTLR start "rule__Company__Group__3"
    // InternalProjectDsl.g:295:1: rule__Company__Group__3 : rule__Company__Group__3__Impl ;
    public final void rule__Company__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:299:1: ( rule__Company__Group__3__Impl )
            // InternalProjectDsl.g:300:2: rule__Company__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__3"


    // $ANTLR start "rule__Company__Group__3__Impl"
    // InternalProjectDsl.g:306:1: rule__Company__Group__3__Impl : ( ( rule__Company__ProjectAssignment_3 ) ) ;
    public final void rule__Company__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:310:1: ( ( ( rule__Company__ProjectAssignment_3 ) ) )
            // InternalProjectDsl.g:311:1: ( ( rule__Company__ProjectAssignment_3 ) )
            {
            // InternalProjectDsl.g:311:1: ( ( rule__Company__ProjectAssignment_3 ) )
            // InternalProjectDsl.g:312:2: ( rule__Company__ProjectAssignment_3 )
            {
             before(grammarAccess.getCompanyAccess().getProjectAssignment_3()); 
            // InternalProjectDsl.g:313:2: ( rule__Company__ProjectAssignment_3 )
            // InternalProjectDsl.g:313:3: rule__Company__ProjectAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Company__ProjectAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getProjectAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__3__Impl"


    // $ANTLR start "rule__Employees__Group__0"
    // InternalProjectDsl.g:322:1: rule__Employees__Group__0 : rule__Employees__Group__0__Impl rule__Employees__Group__1 ;
    public final void rule__Employees__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:326:1: ( rule__Employees__Group__0__Impl rule__Employees__Group__1 )
            // InternalProjectDsl.g:327:2: rule__Employees__Group__0__Impl rule__Employees__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Employees__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employees__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employees__Group__0"


    // $ANTLR start "rule__Employees__Group__0__Impl"
    // InternalProjectDsl.g:334:1: rule__Employees__Group__0__Impl : ( 'employees' ) ;
    public final void rule__Employees__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:338:1: ( ( 'employees' ) )
            // InternalProjectDsl.g:339:1: ( 'employees' )
            {
            // InternalProjectDsl.g:339:1: ( 'employees' )
            // InternalProjectDsl.g:340:2: 'employees'
            {
             before(grammarAccess.getEmployeesAccess().getEmployeesKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEmployeesAccess().getEmployeesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employees__Group__0__Impl"


    // $ANTLR start "rule__Employees__Group__1"
    // InternalProjectDsl.g:349:1: rule__Employees__Group__1 : rule__Employees__Group__1__Impl rule__Employees__Group__2 ;
    public final void rule__Employees__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:353:1: ( rule__Employees__Group__1__Impl rule__Employees__Group__2 )
            // InternalProjectDsl.g:354:2: rule__Employees__Group__1__Impl rule__Employees__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Employees__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employees__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employees__Group__1"


    // $ANTLR start "rule__Employees__Group__1__Impl"
    // InternalProjectDsl.g:361:1: rule__Employees__Group__1__Impl : ( '{' ) ;
    public final void rule__Employees__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:365:1: ( ( '{' ) )
            // InternalProjectDsl.g:366:1: ( '{' )
            {
            // InternalProjectDsl.g:366:1: ( '{' )
            // InternalProjectDsl.g:367:2: '{'
            {
             before(grammarAccess.getEmployeesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEmployeesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employees__Group__1__Impl"


    // $ANTLR start "rule__Employees__Group__2"
    // InternalProjectDsl.g:376:1: rule__Employees__Group__2 : rule__Employees__Group__2__Impl rule__Employees__Group__3 ;
    public final void rule__Employees__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:380:1: ( rule__Employees__Group__2__Impl rule__Employees__Group__3 )
            // InternalProjectDsl.g:381:2: rule__Employees__Group__2__Impl rule__Employees__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Employees__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employees__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employees__Group__2"


    // $ANTLR start "rule__Employees__Group__2__Impl"
    // InternalProjectDsl.g:388:1: rule__Employees__Group__2__Impl : ( ( ( rule__Employees__EmployeesAssignment_2 ) ) ( ( rule__Employees__EmployeesAssignment_2 )* ) ) ;
    public final void rule__Employees__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:392:1: ( ( ( ( rule__Employees__EmployeesAssignment_2 ) ) ( ( rule__Employees__EmployeesAssignment_2 )* ) ) )
            // InternalProjectDsl.g:393:1: ( ( ( rule__Employees__EmployeesAssignment_2 ) ) ( ( rule__Employees__EmployeesAssignment_2 )* ) )
            {
            // InternalProjectDsl.g:393:1: ( ( ( rule__Employees__EmployeesAssignment_2 ) ) ( ( rule__Employees__EmployeesAssignment_2 )* ) )
            // InternalProjectDsl.g:394:2: ( ( rule__Employees__EmployeesAssignment_2 ) ) ( ( rule__Employees__EmployeesAssignment_2 )* )
            {
            // InternalProjectDsl.g:394:2: ( ( rule__Employees__EmployeesAssignment_2 ) )
            // InternalProjectDsl.g:395:3: ( rule__Employees__EmployeesAssignment_2 )
            {
             before(grammarAccess.getEmployeesAccess().getEmployeesAssignment_2()); 
            // InternalProjectDsl.g:396:3: ( rule__Employees__EmployeesAssignment_2 )
            // InternalProjectDsl.g:396:4: rule__Employees__EmployeesAssignment_2
            {
            pushFollow(FOLLOW_9);
            rule__Employees__EmployeesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEmployeesAccess().getEmployeesAssignment_2()); 

            }

            // InternalProjectDsl.g:399:2: ( ( rule__Employees__EmployeesAssignment_2 )* )
            // InternalProjectDsl.g:400:3: ( rule__Employees__EmployeesAssignment_2 )*
            {
             before(grammarAccess.getEmployeesAccess().getEmployeesAssignment_2()); 
            // InternalProjectDsl.g:401:3: ( rule__Employees__EmployeesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalProjectDsl.g:401:4: rule__Employees__EmployeesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Employees__EmployeesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getEmployeesAccess().getEmployeesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employees__Group__2__Impl"


    // $ANTLR start "rule__Employees__Group__3"
    // InternalProjectDsl.g:410:1: rule__Employees__Group__3 : rule__Employees__Group__3__Impl ;
    public final void rule__Employees__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:414:1: ( rule__Employees__Group__3__Impl )
            // InternalProjectDsl.g:415:2: rule__Employees__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employees__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employees__Group__3"


    // $ANTLR start "rule__Employees__Group__3__Impl"
    // InternalProjectDsl.g:421:1: rule__Employees__Group__3__Impl : ( '}' ) ;
    public final void rule__Employees__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:425:1: ( ( '}' ) )
            // InternalProjectDsl.g:426:1: ( '}' )
            {
            // InternalProjectDsl.g:426:1: ( '}' )
            // InternalProjectDsl.g:427:2: '}'
            {
             before(grammarAccess.getEmployeesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEmployeesAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employees__Group__3__Impl"


    // $ANTLR start "rule__Employee__Group__0"
    // InternalProjectDsl.g:437:1: rule__Employee__Group__0 : rule__Employee__Group__0__Impl rule__Employee__Group__1 ;
    public final void rule__Employee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:441:1: ( rule__Employee__Group__0__Impl rule__Employee__Group__1 )
            // InternalProjectDsl.g:442:2: rule__Employee__Group__0__Impl rule__Employee__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Employee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__0"


    // $ANTLR start "rule__Employee__Group__0__Impl"
    // InternalProjectDsl.g:449:1: rule__Employee__Group__0__Impl : ( 'Employee' ) ;
    public final void rule__Employee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:453:1: ( ( 'Employee' ) )
            // InternalProjectDsl.g:454:1: ( 'Employee' )
            {
            // InternalProjectDsl.g:454:1: ( 'Employee' )
            // InternalProjectDsl.g:455:2: 'Employee'
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getEmployeeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__0__Impl"


    // $ANTLR start "rule__Employee__Group__1"
    // InternalProjectDsl.g:464:1: rule__Employee__Group__1 : rule__Employee__Group__1__Impl rule__Employee__Group__2 ;
    public final void rule__Employee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:468:1: ( rule__Employee__Group__1__Impl rule__Employee__Group__2 )
            // InternalProjectDsl.g:469:2: rule__Employee__Group__1__Impl rule__Employee__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Employee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__1"


    // $ANTLR start "rule__Employee__Group__1__Impl"
    // InternalProjectDsl.g:476:1: rule__Employee__Group__1__Impl : ( ( rule__Employee__NameAssignment_1 ) ) ;
    public final void rule__Employee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:480:1: ( ( ( rule__Employee__NameAssignment_1 ) ) )
            // InternalProjectDsl.g:481:1: ( ( rule__Employee__NameAssignment_1 ) )
            {
            // InternalProjectDsl.g:481:1: ( ( rule__Employee__NameAssignment_1 ) )
            // InternalProjectDsl.g:482:2: ( rule__Employee__NameAssignment_1 )
            {
             before(grammarAccess.getEmployeeAccess().getNameAssignment_1()); 
            // InternalProjectDsl.g:483:2: ( rule__Employee__NameAssignment_1 )
            // InternalProjectDsl.g:483:3: rule__Employee__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Employee__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__1__Impl"


    // $ANTLR start "rule__Employee__Group__2"
    // InternalProjectDsl.g:491:1: rule__Employee__Group__2 : rule__Employee__Group__2__Impl rule__Employee__Group__3 ;
    public final void rule__Employee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:495:1: ( rule__Employee__Group__2__Impl rule__Employee__Group__3 )
            // InternalProjectDsl.g:496:2: rule__Employee__Group__2__Impl rule__Employee__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Employee__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__2"


    // $ANTLR start "rule__Employee__Group__2__Impl"
    // InternalProjectDsl.g:503:1: rule__Employee__Group__2__Impl : ( ( rule__Employee__Group_2__0 )? ) ;
    public final void rule__Employee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:507:1: ( ( ( rule__Employee__Group_2__0 )? ) )
            // InternalProjectDsl.g:508:1: ( ( rule__Employee__Group_2__0 )? )
            {
            // InternalProjectDsl.g:508:1: ( ( rule__Employee__Group_2__0 )? )
            // InternalProjectDsl.g:509:2: ( rule__Employee__Group_2__0 )?
            {
             before(grammarAccess.getEmployeeAccess().getGroup_2()); 
            // InternalProjectDsl.g:510:2: ( rule__Employee__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalProjectDsl.g:510:3: rule__Employee__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Employee__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmployeeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__2__Impl"


    // $ANTLR start "rule__Employee__Group__3"
    // InternalProjectDsl.g:518:1: rule__Employee__Group__3 : rule__Employee__Group__3__Impl ;
    public final void rule__Employee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:522:1: ( rule__Employee__Group__3__Impl )
            // InternalProjectDsl.g:523:2: rule__Employee__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__3"


    // $ANTLR start "rule__Employee__Group__3__Impl"
    // InternalProjectDsl.g:529:1: rule__Employee__Group__3__Impl : ( ( rule__Employee__Group_3__0 )? ) ;
    public final void rule__Employee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:533:1: ( ( ( rule__Employee__Group_3__0 )? ) )
            // InternalProjectDsl.g:534:1: ( ( rule__Employee__Group_3__0 )? )
            {
            // InternalProjectDsl.g:534:1: ( ( rule__Employee__Group_3__0 )? )
            // InternalProjectDsl.g:535:2: ( rule__Employee__Group_3__0 )?
            {
             before(grammarAccess.getEmployeeAccess().getGroup_3()); 
            // InternalProjectDsl.g:536:2: ( rule__Employee__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProjectDsl.g:536:3: rule__Employee__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Employee__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmployeeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__3__Impl"


    // $ANTLR start "rule__Employee__Group_2__0"
    // InternalProjectDsl.g:545:1: rule__Employee__Group_2__0 : rule__Employee__Group_2__0__Impl rule__Employee__Group_2__1 ;
    public final void rule__Employee__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:549:1: ( rule__Employee__Group_2__0__Impl rule__Employee__Group_2__1 )
            // InternalProjectDsl.g:550:2: rule__Employee__Group_2__0__Impl rule__Employee__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Employee__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_2__0"


    // $ANTLR start "rule__Employee__Group_2__0__Impl"
    // InternalProjectDsl.g:557:1: rule__Employee__Group_2__0__Impl : ( 'weight' ) ;
    public final void rule__Employee__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:561:1: ( ( 'weight' ) )
            // InternalProjectDsl.g:562:1: ( 'weight' )
            {
            // InternalProjectDsl.g:562:1: ( 'weight' )
            // InternalProjectDsl.g:563:2: 'weight'
            {
             before(grammarAccess.getEmployeeAccess().getWeightKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getWeightKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_2__0__Impl"


    // $ANTLR start "rule__Employee__Group_2__1"
    // InternalProjectDsl.g:572:1: rule__Employee__Group_2__1 : rule__Employee__Group_2__1__Impl ;
    public final void rule__Employee__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:576:1: ( rule__Employee__Group_2__1__Impl )
            // InternalProjectDsl.g:577:2: rule__Employee__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_2__1"


    // $ANTLR start "rule__Employee__Group_2__1__Impl"
    // InternalProjectDsl.g:583:1: rule__Employee__Group_2__1__Impl : ( ( rule__Employee__WeightAssignment_2_1 ) ) ;
    public final void rule__Employee__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:587:1: ( ( ( rule__Employee__WeightAssignment_2_1 ) ) )
            // InternalProjectDsl.g:588:1: ( ( rule__Employee__WeightAssignment_2_1 ) )
            {
            // InternalProjectDsl.g:588:1: ( ( rule__Employee__WeightAssignment_2_1 ) )
            // InternalProjectDsl.g:589:2: ( rule__Employee__WeightAssignment_2_1 )
            {
             before(grammarAccess.getEmployeeAccess().getWeightAssignment_2_1()); 
            // InternalProjectDsl.g:590:2: ( rule__Employee__WeightAssignment_2_1 )
            // InternalProjectDsl.g:590:3: rule__Employee__WeightAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Employee__WeightAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getWeightAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_2__1__Impl"


    // $ANTLR start "rule__Employee__Group_3__0"
    // InternalProjectDsl.g:599:1: rule__Employee__Group_3__0 : rule__Employee__Group_3__0__Impl rule__Employee__Group_3__1 ;
    public final void rule__Employee__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:603:1: ( rule__Employee__Group_3__0__Impl rule__Employee__Group_3__1 )
            // InternalProjectDsl.g:604:2: rule__Employee__Group_3__0__Impl rule__Employee__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Employee__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_3__0"


    // $ANTLR start "rule__Employee__Group_3__0__Impl"
    // InternalProjectDsl.g:611:1: rule__Employee__Group_3__0__Impl : ( 'height' ) ;
    public final void rule__Employee__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:615:1: ( ( 'height' ) )
            // InternalProjectDsl.g:616:1: ( 'height' )
            {
            // InternalProjectDsl.g:616:1: ( 'height' )
            // InternalProjectDsl.g:617:2: 'height'
            {
             before(grammarAccess.getEmployeeAccess().getHeightKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getHeightKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_3__0__Impl"


    // $ANTLR start "rule__Employee__Group_3__1"
    // InternalProjectDsl.g:626:1: rule__Employee__Group_3__1 : rule__Employee__Group_3__1__Impl ;
    public final void rule__Employee__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:630:1: ( rule__Employee__Group_3__1__Impl )
            // InternalProjectDsl.g:631:2: rule__Employee__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_3__1"


    // $ANTLR start "rule__Employee__Group_3__1__Impl"
    // InternalProjectDsl.g:637:1: rule__Employee__Group_3__1__Impl : ( ( rule__Employee__HeightAssignment_3_1 ) ) ;
    public final void rule__Employee__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:641:1: ( ( ( rule__Employee__HeightAssignment_3_1 ) ) )
            // InternalProjectDsl.g:642:1: ( ( rule__Employee__HeightAssignment_3_1 ) )
            {
            // InternalProjectDsl.g:642:1: ( ( rule__Employee__HeightAssignment_3_1 ) )
            // InternalProjectDsl.g:643:2: ( rule__Employee__HeightAssignment_3_1 )
            {
             before(grammarAccess.getEmployeeAccess().getHeightAssignment_3_1()); 
            // InternalProjectDsl.g:644:2: ( rule__Employee__HeightAssignment_3_1 )
            // InternalProjectDsl.g:644:3: rule__Employee__HeightAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Employee__HeightAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getHeightAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_3__1__Impl"


    // $ANTLR start "rule__Project__Group__0"
    // InternalProjectDsl.g:653:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:657:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalProjectDsl.g:658:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalProjectDsl.g:665:1: rule__Project__Group__0__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:669:1: ( ( 'Project' ) )
            // InternalProjectDsl.g:670:1: ( 'Project' )
            {
            // InternalProjectDsl.g:670:1: ( 'Project' )
            // InternalProjectDsl.g:671:2: 'Project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalProjectDsl.g:680:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:684:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalProjectDsl.g:685:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalProjectDsl.g:692:1: rule__Project__Group__1__Impl : ( ( rule__Project__NameAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:696:1: ( ( ( rule__Project__NameAssignment_1 ) ) )
            // InternalProjectDsl.g:697:1: ( ( rule__Project__NameAssignment_1 ) )
            {
            // InternalProjectDsl.g:697:1: ( ( rule__Project__NameAssignment_1 ) )
            // InternalProjectDsl.g:698:2: ( rule__Project__NameAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_1()); 
            // InternalProjectDsl.g:699:2: ( rule__Project__NameAssignment_1 )
            // InternalProjectDsl.g:699:3: rule__Project__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // InternalProjectDsl.g:707:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:711:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalProjectDsl.g:712:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // InternalProjectDsl.g:719:1: rule__Project__Group__2__Impl : ( 'type' ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:723:1: ( ( 'type' ) )
            // InternalProjectDsl.g:724:1: ( 'type' )
            {
            // InternalProjectDsl.g:724:1: ( 'type' )
            // InternalProjectDsl.g:725:2: 'type'
            {
             before(grammarAccess.getProjectAccess().getTypeKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // InternalProjectDsl.g:734:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:738:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalProjectDsl.g:739:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // InternalProjectDsl.g:746:1: rule__Project__Group__3__Impl : ( ( rule__Project__TypeAssignment_3 ) ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:750:1: ( ( ( rule__Project__TypeAssignment_3 ) ) )
            // InternalProjectDsl.g:751:1: ( ( rule__Project__TypeAssignment_3 ) )
            {
            // InternalProjectDsl.g:751:1: ( ( rule__Project__TypeAssignment_3 ) )
            // InternalProjectDsl.g:752:2: ( rule__Project__TypeAssignment_3 )
            {
             before(grammarAccess.getProjectAccess().getTypeAssignment_3()); 
            // InternalProjectDsl.g:753:2: ( rule__Project__TypeAssignment_3 )
            // InternalProjectDsl.g:753:3: rule__Project__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Project__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // InternalProjectDsl.g:761:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:765:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalProjectDsl.g:766:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // InternalProjectDsl.g:773:1: rule__Project__Group__4__Impl : ( '{' ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:777:1: ( ( '{' ) )
            // InternalProjectDsl.g:778:1: ( '{' )
            {
            // InternalProjectDsl.g:778:1: ( '{' )
            // InternalProjectDsl.g:779:2: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // InternalProjectDsl.g:788:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:792:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // InternalProjectDsl.g:793:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // InternalProjectDsl.g:800:1: rule__Project__Group__5__Impl : ( ( ( rule__Project__TasksAssignment_5 ) ) ( ( rule__Project__TasksAssignment_5 )* ) ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:804:1: ( ( ( ( rule__Project__TasksAssignment_5 ) ) ( ( rule__Project__TasksAssignment_5 )* ) ) )
            // InternalProjectDsl.g:805:1: ( ( ( rule__Project__TasksAssignment_5 ) ) ( ( rule__Project__TasksAssignment_5 )* ) )
            {
            // InternalProjectDsl.g:805:1: ( ( ( rule__Project__TasksAssignment_5 ) ) ( ( rule__Project__TasksAssignment_5 )* ) )
            // InternalProjectDsl.g:806:2: ( ( rule__Project__TasksAssignment_5 ) ) ( ( rule__Project__TasksAssignment_5 )* )
            {
            // InternalProjectDsl.g:806:2: ( ( rule__Project__TasksAssignment_5 ) )
            // InternalProjectDsl.g:807:3: ( rule__Project__TasksAssignment_5 )
            {
             before(grammarAccess.getProjectAccess().getTasksAssignment_5()); 
            // InternalProjectDsl.g:808:3: ( rule__Project__TasksAssignment_5 )
            // InternalProjectDsl.g:808:4: rule__Project__TasksAssignment_5
            {
            pushFollow(FOLLOW_15);
            rule__Project__TasksAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getTasksAssignment_5()); 

            }

            // InternalProjectDsl.g:811:2: ( ( rule__Project__TasksAssignment_5 )* )
            // InternalProjectDsl.g:812:3: ( rule__Project__TasksAssignment_5 )*
            {
             before(grammarAccess.getProjectAccess().getTasksAssignment_5()); 
            // InternalProjectDsl.g:813:3: ( rule__Project__TasksAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalProjectDsl.g:813:4: rule__Project__TasksAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Project__TasksAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getTasksAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Project__Group__6"
    // InternalProjectDsl.g:822:1: rule__Project__Group__6 : rule__Project__Group__6__Impl ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:826:1: ( rule__Project__Group__6__Impl )
            // InternalProjectDsl.g:827:2: rule__Project__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6"


    // $ANTLR start "rule__Project__Group__6__Impl"
    // InternalProjectDsl.g:833:1: rule__Project__Group__6__Impl : ( '}' ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:837:1: ( ( '}' ) )
            // InternalProjectDsl.g:838:1: ( '}' )
            {
            // InternalProjectDsl.g:838:1: ( '}' )
            // InternalProjectDsl.g:839:2: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalProjectDsl.g:849:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:853:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalProjectDsl.g:854:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalProjectDsl.g:861:1: rule__Task__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:865:1: ( ( 'Task' ) )
            // InternalProjectDsl.g:866:1: ( 'Task' )
            {
            // InternalProjectDsl.g:866:1: ( 'Task' )
            // InternalProjectDsl.g:867:2: 'Task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalProjectDsl.g:876:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:880:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalProjectDsl.g:881:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalProjectDsl.g:888:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:892:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalProjectDsl.g:893:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalProjectDsl.g:893:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalProjectDsl.g:894:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalProjectDsl.g:895:2: ( rule__Task__NameAssignment_1 )
            // InternalProjectDsl.g:895:3: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalProjectDsl.g:903:1: rule__Task__Group__2 : rule__Task__Group__2__Impl ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:907:1: ( rule__Task__Group__2__Impl )
            // InternalProjectDsl.g:908:2: rule__Task__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalProjectDsl.g:914:1: rule__Task__Group__2__Impl : ( ( rule__Task__TypeAssignment_2 ) ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:918:1: ( ( ( rule__Task__TypeAssignment_2 ) ) )
            // InternalProjectDsl.g:919:1: ( ( rule__Task__TypeAssignment_2 ) )
            {
            // InternalProjectDsl.g:919:1: ( ( rule__Task__TypeAssignment_2 ) )
            // InternalProjectDsl.g:920:2: ( rule__Task__TypeAssignment_2 )
            {
             before(grammarAccess.getTaskAccess().getTypeAssignment_2()); 
            // InternalProjectDsl.g:921:2: ( rule__Task__TypeAssignment_2 )
            // InternalProjectDsl.g:921:3: rule__Task__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Company__NameAssignment_1"
    // InternalProjectDsl.g:930:1: rule__Company__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Company__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:934:1: ( ( RULE_ID ) )
            // InternalProjectDsl.g:935:2: ( RULE_ID )
            {
            // InternalProjectDsl.g:935:2: ( RULE_ID )
            // InternalProjectDsl.g:936:3: RULE_ID
            {
             before(grammarAccess.getCompanyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__NameAssignment_1"


    // $ANTLR start "rule__Company__EmployeesAssignment_2"
    // InternalProjectDsl.g:945:1: rule__Company__EmployeesAssignment_2 : ( ruleEmployees ) ;
    public final void rule__Company__EmployeesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:949:1: ( ( ruleEmployees ) )
            // InternalProjectDsl.g:950:2: ( ruleEmployees )
            {
            // InternalProjectDsl.g:950:2: ( ruleEmployees )
            // InternalProjectDsl.g:951:3: ruleEmployees
            {
             before(grammarAccess.getCompanyAccess().getEmployeesEmployeesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEmployees();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getEmployeesEmployeesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__EmployeesAssignment_2"


    // $ANTLR start "rule__Company__ProjectAssignment_3"
    // InternalProjectDsl.g:960:1: rule__Company__ProjectAssignment_3 : ( ruleProject ) ;
    public final void rule__Company__ProjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:964:1: ( ( ruleProject ) )
            // InternalProjectDsl.g:965:2: ( ruleProject )
            {
            // InternalProjectDsl.g:965:2: ( ruleProject )
            // InternalProjectDsl.g:966:3: ruleProject
            {
             before(grammarAccess.getCompanyAccess().getProjectProjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getProjectProjectParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__ProjectAssignment_3"


    // $ANTLR start "rule__Employees__EmployeesAssignment_2"
    // InternalProjectDsl.g:975:1: rule__Employees__EmployeesAssignment_2 : ( ruleEmployee ) ;
    public final void rule__Employees__EmployeesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:979:1: ( ( ruleEmployee ) )
            // InternalProjectDsl.g:980:2: ( ruleEmployee )
            {
            // InternalProjectDsl.g:980:2: ( ruleEmployee )
            // InternalProjectDsl.g:981:3: ruleEmployee
            {
             before(grammarAccess.getEmployeesAccess().getEmployeesEmployeeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEmployee();

            state._fsp--;

             after(grammarAccess.getEmployeesAccess().getEmployeesEmployeeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employees__EmployeesAssignment_2"


    // $ANTLR start "rule__Employee__NameAssignment_1"
    // InternalProjectDsl.g:990:1: rule__Employee__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Employee__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:994:1: ( ( RULE_ID ) )
            // InternalProjectDsl.g:995:2: ( RULE_ID )
            {
            // InternalProjectDsl.g:995:2: ( RULE_ID )
            // InternalProjectDsl.g:996:3: RULE_ID
            {
             before(grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__NameAssignment_1"


    // $ANTLR start "rule__Employee__WeightAssignment_2_1"
    // InternalProjectDsl.g:1005:1: rule__Employee__WeightAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Employee__WeightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:1009:1: ( ( RULE_INT ) )
            // InternalProjectDsl.g:1010:2: ( RULE_INT )
            {
            // InternalProjectDsl.g:1010:2: ( RULE_INT )
            // InternalProjectDsl.g:1011:3: RULE_INT
            {
             before(grammarAccess.getEmployeeAccess().getWeightINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getWeightINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__WeightAssignment_2_1"


    // $ANTLR start "rule__Employee__HeightAssignment_3_1"
    // InternalProjectDsl.g:1020:1: rule__Employee__HeightAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Employee__HeightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:1024:1: ( ( RULE_INT ) )
            // InternalProjectDsl.g:1025:2: ( RULE_INT )
            {
            // InternalProjectDsl.g:1025:2: ( RULE_INT )
            // InternalProjectDsl.g:1026:3: RULE_INT
            {
             before(grammarAccess.getEmployeeAccess().getHeightINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getHeightINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__HeightAssignment_3_1"


    // $ANTLR start "rule__Project__NameAssignment_1"
    // InternalProjectDsl.g:1035:1: rule__Project__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:1039:1: ( ( RULE_ID ) )
            // InternalProjectDsl.g:1040:2: ( RULE_ID )
            {
            // InternalProjectDsl.g:1040:2: ( RULE_ID )
            // InternalProjectDsl.g:1041:3: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__NameAssignment_1"


    // $ANTLR start "rule__Project__TypeAssignment_3"
    // InternalProjectDsl.g:1050:1: rule__Project__TypeAssignment_3 : ( ruletaskType ) ;
    public final void rule__Project__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:1054:1: ( ( ruletaskType ) )
            // InternalProjectDsl.g:1055:2: ( ruletaskType )
            {
            // InternalProjectDsl.g:1055:2: ( ruletaskType )
            // InternalProjectDsl.g:1056:3: ruletaskType
            {
             before(grammarAccess.getProjectAccess().getTypeTaskTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruletaskType();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getTypeTaskTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TypeAssignment_3"


    // $ANTLR start "rule__Project__TasksAssignment_5"
    // InternalProjectDsl.g:1065:1: rule__Project__TasksAssignment_5 : ( ruleTask ) ;
    public final void rule__Project__TasksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:1069:1: ( ( ruleTask ) )
            // InternalProjectDsl.g:1070:2: ( ruleTask )
            {
            // InternalProjectDsl.g:1070:2: ( ruleTask )
            // InternalProjectDsl.g:1071:3: ruleTask
            {
             before(grammarAccess.getProjectAccess().getTasksTaskParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getTasksTaskParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TasksAssignment_5"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // InternalProjectDsl.g:1080:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:1084:1: ( ( RULE_ID ) )
            // InternalProjectDsl.g:1085:2: ( RULE_ID )
            {
            // InternalProjectDsl.g:1085:2: ( RULE_ID )
            // InternalProjectDsl.g:1086:3: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__NameAssignment_1"


    // $ANTLR start "rule__Task__TypeAssignment_2"
    // InternalProjectDsl.g:1095:1: rule__Task__TypeAssignment_2 : ( ruletaskType ) ;
    public final void rule__Task__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:1099:1: ( ( ruletaskType ) )
            // InternalProjectDsl.g:1100:2: ( ruletaskType )
            {
            // InternalProjectDsl.g:1100:2: ( ruletaskType )
            // InternalProjectDsl.g:1101:3: ruletaskType
            {
             before(grammarAccess.getTaskAccess().getTypeTaskTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletaskType();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getTypeTaskTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TypeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'development'", "'documentation'", "'Company'", "'employees'", "'{'", "'}'", "'Employee'", "'weigh'", "'height'", "'Project'", "'type'"
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


    // $ANTLR start "ruletaskType"
    // InternalProjectDsl.g:153:1: ruletaskType : ( ( rule__TaskType__Alternatives ) ) ;
    public final void ruletaskType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:157:1: ( ( ( rule__TaskType__Alternatives ) ) )
            // InternalProjectDsl.g:158:2: ( ( rule__TaskType__Alternatives ) )
            {
            // InternalProjectDsl.g:158:2: ( ( rule__TaskType__Alternatives ) )
            // InternalProjectDsl.g:159:3: ( rule__TaskType__Alternatives )
            {
             before(grammarAccess.getTaskTypeAccess().getAlternatives()); 
            // InternalProjectDsl.g:160:3: ( rule__TaskType__Alternatives )
            // InternalProjectDsl.g:160:4: rule__TaskType__Alternatives
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
    // InternalProjectDsl.g:168:1: rule__TaskType__Alternatives : ( ( ( 'development' ) ) | ( ( 'documentation' ) ) );
    public final void rule__TaskType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:172:1: ( ( ( 'development' ) ) | ( ( 'documentation' ) ) )
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
                    // InternalProjectDsl.g:173:2: ( ( 'development' ) )
                    {
                    // InternalProjectDsl.g:173:2: ( ( 'development' ) )
                    // InternalProjectDsl.g:174:3: ( 'development' )
                    {
                     before(grammarAccess.getTaskTypeAccess().getDevelopmentEnumLiteralDeclaration_0()); 
                    // InternalProjectDsl.g:175:3: ( 'development' )
                    // InternalProjectDsl.g:175:4: 'development'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskTypeAccess().getDevelopmentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectDsl.g:179:2: ( ( 'documentation' ) )
                    {
                    // InternalProjectDsl.g:179:2: ( ( 'documentation' ) )
                    // InternalProjectDsl.g:180:3: ( 'documentation' )
                    {
                     before(grammarAccess.getTaskTypeAccess().getDocumentationEnumLiteralDeclaration_1()); 
                    // InternalProjectDsl.g:181:3: ( 'documentation' )
                    // InternalProjectDsl.g:181:4: 'documentation'
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
    // InternalProjectDsl.g:189:1: rule__Company__Group__0 : rule__Company__Group__0__Impl rule__Company__Group__1 ;
    public final void rule__Company__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:193:1: ( rule__Company__Group__0__Impl rule__Company__Group__1 )
            // InternalProjectDsl.g:194:2: rule__Company__Group__0__Impl rule__Company__Group__1
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
    // InternalProjectDsl.g:201:1: rule__Company__Group__0__Impl : ( 'Company' ) ;
    public final void rule__Company__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:205:1: ( ( 'Company' ) )
            // InternalProjectDsl.g:206:1: ( 'Company' )
            {
            // InternalProjectDsl.g:206:1: ( 'Company' )
            // InternalProjectDsl.g:207:2: 'Company'
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
    // InternalProjectDsl.g:216:1: rule__Company__Group__1 : rule__Company__Group__1__Impl rule__Company__Group__2 ;
    public final void rule__Company__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:220:1: ( rule__Company__Group__1__Impl rule__Company__Group__2 )
            // InternalProjectDsl.g:221:2: rule__Company__Group__1__Impl rule__Company__Group__2
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
    // InternalProjectDsl.g:228:1: rule__Company__Group__1__Impl : ( ( rule__Company__NameAssignment_1 ) ) ;
    public final void rule__Company__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:232:1: ( ( ( rule__Company__NameAssignment_1 ) ) )
            // InternalProjectDsl.g:233:1: ( ( rule__Company__NameAssignment_1 ) )
            {
            // InternalProjectDsl.g:233:1: ( ( rule__Company__NameAssignment_1 ) )
            // InternalProjectDsl.g:234:2: ( rule__Company__NameAssignment_1 )
            {
             before(grammarAccess.getCompanyAccess().getNameAssignment_1()); 
            // InternalProjectDsl.g:235:2: ( rule__Company__NameAssignment_1 )
            // InternalProjectDsl.g:235:3: rule__Company__NameAssignment_1
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
    // InternalProjectDsl.g:243:1: rule__Company__Group__2 : rule__Company__Group__2__Impl rule__Company__Group__3 ;
    public final void rule__Company__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:247:1: ( rule__Company__Group__2__Impl rule__Company__Group__3 )
            // InternalProjectDsl.g:248:2: rule__Company__Group__2__Impl rule__Company__Group__3
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
    // InternalProjectDsl.g:255:1: rule__Company__Group__2__Impl : ( ( rule__Company__EmployeesAssignment_2 ) ) ;
    public final void rule__Company__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:259:1: ( ( ( rule__Company__EmployeesAssignment_2 ) ) )
            // InternalProjectDsl.g:260:1: ( ( rule__Company__EmployeesAssignment_2 ) )
            {
            // InternalProjectDsl.g:260:1: ( ( rule__Company__EmployeesAssignment_2 ) )
            // InternalProjectDsl.g:261:2: ( rule__Company__EmployeesAssignment_2 )
            {
             before(grammarAccess.getCompanyAccess().getEmployeesAssignment_2()); 
            // InternalProjectDsl.g:262:2: ( rule__Company__EmployeesAssignment_2 )
            // InternalProjectDsl.g:262:3: rule__Company__EmployeesAssignment_2
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
    // InternalProjectDsl.g:270:1: rule__Company__Group__3 : rule__Company__Group__3__Impl ;
    public final void rule__Company__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:274:1: ( rule__Company__Group__3__Impl )
            // InternalProjectDsl.g:275:2: rule__Company__Group__3__Impl
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
    // InternalProjectDsl.g:281:1: rule__Company__Group__3__Impl : ( ( rule__Company__ProjectAssignment_3 ) ) ;
    public final void rule__Company__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:285:1: ( ( ( rule__Company__ProjectAssignment_3 ) ) )
            // InternalProjectDsl.g:286:1: ( ( rule__Company__ProjectAssignment_3 ) )
            {
            // InternalProjectDsl.g:286:1: ( ( rule__Company__ProjectAssignment_3 ) )
            // InternalProjectDsl.g:287:2: ( rule__Company__ProjectAssignment_3 )
            {
             before(grammarAccess.getCompanyAccess().getProjectAssignment_3()); 
            // InternalProjectDsl.g:288:2: ( rule__Company__ProjectAssignment_3 )
            // InternalProjectDsl.g:288:3: rule__Company__ProjectAssignment_3
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
    // InternalProjectDsl.g:297:1: rule__Employees__Group__0 : rule__Employees__Group__0__Impl rule__Employees__Group__1 ;
    public final void rule__Employees__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:301:1: ( rule__Employees__Group__0__Impl rule__Employees__Group__1 )
            // InternalProjectDsl.g:302:2: rule__Employees__Group__0__Impl rule__Employees__Group__1
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
    // InternalProjectDsl.g:309:1: rule__Employees__Group__0__Impl : ( 'employees' ) ;
    public final void rule__Employees__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:313:1: ( ( 'employees' ) )
            // InternalProjectDsl.g:314:1: ( 'employees' )
            {
            // InternalProjectDsl.g:314:1: ( 'employees' )
            // InternalProjectDsl.g:315:2: 'employees'
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
    // InternalProjectDsl.g:324:1: rule__Employees__Group__1 : rule__Employees__Group__1__Impl rule__Employees__Group__2 ;
    public final void rule__Employees__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:328:1: ( rule__Employees__Group__1__Impl rule__Employees__Group__2 )
            // InternalProjectDsl.g:329:2: rule__Employees__Group__1__Impl rule__Employees__Group__2
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
    // InternalProjectDsl.g:336:1: rule__Employees__Group__1__Impl : ( '{' ) ;
    public final void rule__Employees__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:340:1: ( ( '{' ) )
            // InternalProjectDsl.g:341:1: ( '{' )
            {
            // InternalProjectDsl.g:341:1: ( '{' )
            // InternalProjectDsl.g:342:2: '{'
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
    // InternalProjectDsl.g:351:1: rule__Employees__Group__2 : rule__Employees__Group__2__Impl rule__Employees__Group__3 ;
    public final void rule__Employees__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:355:1: ( rule__Employees__Group__2__Impl rule__Employees__Group__3 )
            // InternalProjectDsl.g:356:2: rule__Employees__Group__2__Impl rule__Employees__Group__3
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
    // InternalProjectDsl.g:363:1: rule__Employees__Group__2__Impl : ( ( ( rule__Employees__EmployeesAssignment_2 ) ) ( ( rule__Employees__EmployeesAssignment_2 )* ) ) ;
    public final void rule__Employees__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:367:1: ( ( ( ( rule__Employees__EmployeesAssignment_2 ) ) ( ( rule__Employees__EmployeesAssignment_2 )* ) ) )
            // InternalProjectDsl.g:368:1: ( ( ( rule__Employees__EmployeesAssignment_2 ) ) ( ( rule__Employees__EmployeesAssignment_2 )* ) )
            {
            // InternalProjectDsl.g:368:1: ( ( ( rule__Employees__EmployeesAssignment_2 ) ) ( ( rule__Employees__EmployeesAssignment_2 )* ) )
            // InternalProjectDsl.g:369:2: ( ( rule__Employees__EmployeesAssignment_2 ) ) ( ( rule__Employees__EmployeesAssignment_2 )* )
            {
            // InternalProjectDsl.g:369:2: ( ( rule__Employees__EmployeesAssignment_2 ) )
            // InternalProjectDsl.g:370:3: ( rule__Employees__EmployeesAssignment_2 )
            {
             before(grammarAccess.getEmployeesAccess().getEmployeesAssignment_2()); 
            // InternalProjectDsl.g:371:3: ( rule__Employees__EmployeesAssignment_2 )
            // InternalProjectDsl.g:371:4: rule__Employees__EmployeesAssignment_2
            {
            pushFollow(FOLLOW_9);
            rule__Employees__EmployeesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEmployeesAccess().getEmployeesAssignment_2()); 

            }

            // InternalProjectDsl.g:374:2: ( ( rule__Employees__EmployeesAssignment_2 )* )
            // InternalProjectDsl.g:375:3: ( rule__Employees__EmployeesAssignment_2 )*
            {
             before(grammarAccess.getEmployeesAccess().getEmployeesAssignment_2()); 
            // InternalProjectDsl.g:376:3: ( rule__Employees__EmployeesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalProjectDsl.g:376:4: rule__Employees__EmployeesAssignment_2
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
    // InternalProjectDsl.g:385:1: rule__Employees__Group__3 : rule__Employees__Group__3__Impl ;
    public final void rule__Employees__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:389:1: ( rule__Employees__Group__3__Impl )
            // InternalProjectDsl.g:390:2: rule__Employees__Group__3__Impl
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
    // InternalProjectDsl.g:396:1: rule__Employees__Group__3__Impl : ( '}' ) ;
    public final void rule__Employees__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:400:1: ( ( '}' ) )
            // InternalProjectDsl.g:401:1: ( '}' )
            {
            // InternalProjectDsl.g:401:1: ( '}' )
            // InternalProjectDsl.g:402:2: '}'
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
    // InternalProjectDsl.g:412:1: rule__Employee__Group__0 : rule__Employee__Group__0__Impl rule__Employee__Group__1 ;
    public final void rule__Employee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:416:1: ( rule__Employee__Group__0__Impl rule__Employee__Group__1 )
            // InternalProjectDsl.g:417:2: rule__Employee__Group__0__Impl rule__Employee__Group__1
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
    // InternalProjectDsl.g:424:1: rule__Employee__Group__0__Impl : ( 'Employee' ) ;
    public final void rule__Employee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:428:1: ( ( 'Employee' ) )
            // InternalProjectDsl.g:429:1: ( 'Employee' )
            {
            // InternalProjectDsl.g:429:1: ( 'Employee' )
            // InternalProjectDsl.g:430:2: 'Employee'
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
    // InternalProjectDsl.g:439:1: rule__Employee__Group__1 : rule__Employee__Group__1__Impl rule__Employee__Group__2 ;
    public final void rule__Employee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:443:1: ( rule__Employee__Group__1__Impl rule__Employee__Group__2 )
            // InternalProjectDsl.g:444:2: rule__Employee__Group__1__Impl rule__Employee__Group__2
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
    // InternalProjectDsl.g:451:1: rule__Employee__Group__1__Impl : ( ( rule__Employee__NameAssignment_1 ) ) ;
    public final void rule__Employee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:455:1: ( ( ( rule__Employee__NameAssignment_1 ) ) )
            // InternalProjectDsl.g:456:1: ( ( rule__Employee__NameAssignment_1 ) )
            {
            // InternalProjectDsl.g:456:1: ( ( rule__Employee__NameAssignment_1 ) )
            // InternalProjectDsl.g:457:2: ( rule__Employee__NameAssignment_1 )
            {
             before(grammarAccess.getEmployeeAccess().getNameAssignment_1()); 
            // InternalProjectDsl.g:458:2: ( rule__Employee__NameAssignment_1 )
            // InternalProjectDsl.g:458:3: rule__Employee__NameAssignment_1
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
    // InternalProjectDsl.g:466:1: rule__Employee__Group__2 : rule__Employee__Group__2__Impl rule__Employee__Group__3 ;
    public final void rule__Employee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:470:1: ( rule__Employee__Group__2__Impl rule__Employee__Group__3 )
            // InternalProjectDsl.g:471:2: rule__Employee__Group__2__Impl rule__Employee__Group__3
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
    // InternalProjectDsl.g:478:1: rule__Employee__Group__2__Impl : ( ( rule__Employee__Group_2__0 )? ) ;
    public final void rule__Employee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:482:1: ( ( ( rule__Employee__Group_2__0 )? ) )
            // InternalProjectDsl.g:483:1: ( ( rule__Employee__Group_2__0 )? )
            {
            // InternalProjectDsl.g:483:1: ( ( rule__Employee__Group_2__0 )? )
            // InternalProjectDsl.g:484:2: ( rule__Employee__Group_2__0 )?
            {
             before(grammarAccess.getEmployeeAccess().getGroup_2()); 
            // InternalProjectDsl.g:485:2: ( rule__Employee__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalProjectDsl.g:485:3: rule__Employee__Group_2__0
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
    // InternalProjectDsl.g:493:1: rule__Employee__Group__3 : rule__Employee__Group__3__Impl ;
    public final void rule__Employee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:497:1: ( rule__Employee__Group__3__Impl )
            // InternalProjectDsl.g:498:2: rule__Employee__Group__3__Impl
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
    // InternalProjectDsl.g:504:1: rule__Employee__Group__3__Impl : ( ( rule__Employee__Group_3__0 )? ) ;
    public final void rule__Employee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:508:1: ( ( ( rule__Employee__Group_3__0 )? ) )
            // InternalProjectDsl.g:509:1: ( ( rule__Employee__Group_3__0 )? )
            {
            // InternalProjectDsl.g:509:1: ( ( rule__Employee__Group_3__0 )? )
            // InternalProjectDsl.g:510:2: ( rule__Employee__Group_3__0 )?
            {
             before(grammarAccess.getEmployeeAccess().getGroup_3()); 
            // InternalProjectDsl.g:511:2: ( rule__Employee__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProjectDsl.g:511:3: rule__Employee__Group_3__0
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
    // InternalProjectDsl.g:520:1: rule__Employee__Group_2__0 : rule__Employee__Group_2__0__Impl rule__Employee__Group_2__1 ;
    public final void rule__Employee__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:524:1: ( rule__Employee__Group_2__0__Impl rule__Employee__Group_2__1 )
            // InternalProjectDsl.g:525:2: rule__Employee__Group_2__0__Impl rule__Employee__Group_2__1
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
    // InternalProjectDsl.g:532:1: rule__Employee__Group_2__0__Impl : ( 'weigh' ) ;
    public final void rule__Employee__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:536:1: ( ( 'weigh' ) )
            // InternalProjectDsl.g:537:1: ( 'weigh' )
            {
            // InternalProjectDsl.g:537:1: ( 'weigh' )
            // InternalProjectDsl.g:538:2: 'weigh'
            {
             before(grammarAccess.getEmployeeAccess().getWeighKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getWeighKeyword_2_0()); 

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
    // InternalProjectDsl.g:547:1: rule__Employee__Group_2__1 : rule__Employee__Group_2__1__Impl ;
    public final void rule__Employee__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:551:1: ( rule__Employee__Group_2__1__Impl )
            // InternalProjectDsl.g:552:2: rule__Employee__Group_2__1__Impl
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
    // InternalProjectDsl.g:558:1: rule__Employee__Group_2__1__Impl : ( ( rule__Employee__WeightAssignment_2_1 ) ) ;
    public final void rule__Employee__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:562:1: ( ( ( rule__Employee__WeightAssignment_2_1 ) ) )
            // InternalProjectDsl.g:563:1: ( ( rule__Employee__WeightAssignment_2_1 ) )
            {
            // InternalProjectDsl.g:563:1: ( ( rule__Employee__WeightAssignment_2_1 ) )
            // InternalProjectDsl.g:564:2: ( rule__Employee__WeightAssignment_2_1 )
            {
             before(grammarAccess.getEmployeeAccess().getWeightAssignment_2_1()); 
            // InternalProjectDsl.g:565:2: ( rule__Employee__WeightAssignment_2_1 )
            // InternalProjectDsl.g:565:3: rule__Employee__WeightAssignment_2_1
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
    // InternalProjectDsl.g:574:1: rule__Employee__Group_3__0 : rule__Employee__Group_3__0__Impl rule__Employee__Group_3__1 ;
    public final void rule__Employee__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:578:1: ( rule__Employee__Group_3__0__Impl rule__Employee__Group_3__1 )
            // InternalProjectDsl.g:579:2: rule__Employee__Group_3__0__Impl rule__Employee__Group_3__1
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
    // InternalProjectDsl.g:586:1: rule__Employee__Group_3__0__Impl : ( 'height' ) ;
    public final void rule__Employee__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:590:1: ( ( 'height' ) )
            // InternalProjectDsl.g:591:1: ( 'height' )
            {
            // InternalProjectDsl.g:591:1: ( 'height' )
            // InternalProjectDsl.g:592:2: 'height'
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
    // InternalProjectDsl.g:601:1: rule__Employee__Group_3__1 : rule__Employee__Group_3__1__Impl ;
    public final void rule__Employee__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:605:1: ( rule__Employee__Group_3__1__Impl )
            // InternalProjectDsl.g:606:2: rule__Employee__Group_3__1__Impl
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
    // InternalProjectDsl.g:612:1: rule__Employee__Group_3__1__Impl : ( ( rule__Employee__HeightAssignment_3_1 ) ) ;
    public final void rule__Employee__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:616:1: ( ( ( rule__Employee__HeightAssignment_3_1 ) ) )
            // InternalProjectDsl.g:617:1: ( ( rule__Employee__HeightAssignment_3_1 ) )
            {
            // InternalProjectDsl.g:617:1: ( ( rule__Employee__HeightAssignment_3_1 ) )
            // InternalProjectDsl.g:618:2: ( rule__Employee__HeightAssignment_3_1 )
            {
             before(grammarAccess.getEmployeeAccess().getHeightAssignment_3_1()); 
            // InternalProjectDsl.g:619:2: ( rule__Employee__HeightAssignment_3_1 )
            // InternalProjectDsl.g:619:3: rule__Employee__HeightAssignment_3_1
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
    // InternalProjectDsl.g:628:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:632:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalProjectDsl.g:633:2: rule__Project__Group__0__Impl rule__Project__Group__1
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
    // InternalProjectDsl.g:640:1: rule__Project__Group__0__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:644:1: ( ( 'Project' ) )
            // InternalProjectDsl.g:645:1: ( 'Project' )
            {
            // InternalProjectDsl.g:645:1: ( 'Project' )
            // InternalProjectDsl.g:646:2: 'Project'
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
    // InternalProjectDsl.g:655:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:659:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalProjectDsl.g:660:2: rule__Project__Group__1__Impl rule__Project__Group__2
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
    // InternalProjectDsl.g:667:1: rule__Project__Group__1__Impl : ( ( rule__Project__NameAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:671:1: ( ( ( rule__Project__NameAssignment_1 ) ) )
            // InternalProjectDsl.g:672:1: ( ( rule__Project__NameAssignment_1 ) )
            {
            // InternalProjectDsl.g:672:1: ( ( rule__Project__NameAssignment_1 ) )
            // InternalProjectDsl.g:673:2: ( rule__Project__NameAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_1()); 
            // InternalProjectDsl.g:674:2: ( rule__Project__NameAssignment_1 )
            // InternalProjectDsl.g:674:3: rule__Project__NameAssignment_1
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
    // InternalProjectDsl.g:682:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:686:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalProjectDsl.g:687:2: rule__Project__Group__2__Impl rule__Project__Group__3
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
    // InternalProjectDsl.g:694:1: rule__Project__Group__2__Impl : ( 'type' ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:698:1: ( ( 'type' ) )
            // InternalProjectDsl.g:699:1: ( 'type' )
            {
            // InternalProjectDsl.g:699:1: ( 'type' )
            // InternalProjectDsl.g:700:2: 'type'
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
    // InternalProjectDsl.g:709:1: rule__Project__Group__3 : rule__Project__Group__3__Impl ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:713:1: ( rule__Project__Group__3__Impl )
            // InternalProjectDsl.g:714:2: rule__Project__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__3__Impl();

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
    // InternalProjectDsl.g:720:1: rule__Project__Group__3__Impl : ( ( rule__Project__TypeAssignment_3 ) ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:724:1: ( ( ( rule__Project__TypeAssignment_3 ) ) )
            // InternalProjectDsl.g:725:1: ( ( rule__Project__TypeAssignment_3 ) )
            {
            // InternalProjectDsl.g:725:1: ( ( rule__Project__TypeAssignment_3 ) )
            // InternalProjectDsl.g:726:2: ( rule__Project__TypeAssignment_3 )
            {
             before(grammarAccess.getProjectAccess().getTypeAssignment_3()); 
            // InternalProjectDsl.g:727:2: ( rule__Project__TypeAssignment_3 )
            // InternalProjectDsl.g:727:3: rule__Project__TypeAssignment_3
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


    // $ANTLR start "rule__Company__NameAssignment_1"
    // InternalProjectDsl.g:736:1: rule__Company__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Company__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:740:1: ( ( RULE_ID ) )
            // InternalProjectDsl.g:741:2: ( RULE_ID )
            {
            // InternalProjectDsl.g:741:2: ( RULE_ID )
            // InternalProjectDsl.g:742:3: RULE_ID
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
    // InternalProjectDsl.g:751:1: rule__Company__EmployeesAssignment_2 : ( ruleEmployees ) ;
    public final void rule__Company__EmployeesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:755:1: ( ( ruleEmployees ) )
            // InternalProjectDsl.g:756:2: ( ruleEmployees )
            {
            // InternalProjectDsl.g:756:2: ( ruleEmployees )
            // InternalProjectDsl.g:757:3: ruleEmployees
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
    // InternalProjectDsl.g:766:1: rule__Company__ProjectAssignment_3 : ( ruleProject ) ;
    public final void rule__Company__ProjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:770:1: ( ( ruleProject ) )
            // InternalProjectDsl.g:771:2: ( ruleProject )
            {
            // InternalProjectDsl.g:771:2: ( ruleProject )
            // InternalProjectDsl.g:772:3: ruleProject
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
    // InternalProjectDsl.g:781:1: rule__Employees__EmployeesAssignment_2 : ( ruleEmployee ) ;
    public final void rule__Employees__EmployeesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:785:1: ( ( ruleEmployee ) )
            // InternalProjectDsl.g:786:2: ( ruleEmployee )
            {
            // InternalProjectDsl.g:786:2: ( ruleEmployee )
            // InternalProjectDsl.g:787:3: ruleEmployee
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
    // InternalProjectDsl.g:796:1: rule__Employee__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Employee__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:800:1: ( ( RULE_ID ) )
            // InternalProjectDsl.g:801:2: ( RULE_ID )
            {
            // InternalProjectDsl.g:801:2: ( RULE_ID )
            // InternalProjectDsl.g:802:3: RULE_ID
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
    // InternalProjectDsl.g:811:1: rule__Employee__WeightAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Employee__WeightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:815:1: ( ( RULE_INT ) )
            // InternalProjectDsl.g:816:2: ( RULE_INT )
            {
            // InternalProjectDsl.g:816:2: ( RULE_INT )
            // InternalProjectDsl.g:817:3: RULE_INT
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
    // InternalProjectDsl.g:826:1: rule__Employee__HeightAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Employee__HeightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:830:1: ( ( RULE_INT ) )
            // InternalProjectDsl.g:831:2: ( RULE_INT )
            {
            // InternalProjectDsl.g:831:2: ( RULE_INT )
            // InternalProjectDsl.g:832:3: RULE_INT
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
    // InternalProjectDsl.g:841:1: rule__Project__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:845:1: ( ( RULE_ID ) )
            // InternalProjectDsl.g:846:2: ( RULE_ID )
            {
            // InternalProjectDsl.g:846:2: ( RULE_ID )
            // InternalProjectDsl.g:847:3: RULE_ID
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
    // InternalProjectDsl.g:856:1: rule__Project__TypeAssignment_3 : ( ruletaskType ) ;
    public final void rule__Project__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDsl.g:860:1: ( ( ruletaskType ) )
            // InternalProjectDsl.g:861:2: ( ruletaskType )
            {
            // InternalProjectDsl.g:861:2: ( ruletaskType )
            // InternalProjectDsl.g:862:3: ruletaskType
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

}
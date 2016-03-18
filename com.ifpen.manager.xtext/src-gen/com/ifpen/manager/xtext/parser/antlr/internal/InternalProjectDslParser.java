package com.ifpen.manager.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ifpen.manager.xtext.services.ProjectDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Company'", "'employees'", "'{'", "'}'", "'Employee'", "'weigh'", "'height'", "'Project'", "'type'", "'development'", "'documentation'"
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

        public InternalProjectDslParser(TokenStream input, ProjectDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Company";
       	}

       	@Override
       	protected ProjectDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCompany"
    // InternalProjectDsl.g:65:1: entryRuleCompany returns [EObject current=null] : iv_ruleCompany= ruleCompany EOF ;
    public final EObject entryRuleCompany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompany = null;


        try {
            // InternalProjectDsl.g:65:48: (iv_ruleCompany= ruleCompany EOF )
            // InternalProjectDsl.g:66:2: iv_ruleCompany= ruleCompany EOF
            {
             newCompositeNode(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompany=ruleCompany();

            state._fsp--;

             current =iv_ruleCompany; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalProjectDsl.g:72:1: ruleCompany returns [EObject current=null] : (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_employees_2_0= ruleEmployees ) ) ( (lv_project_3_0= ruleProject ) ) ) ;
    public final EObject ruleCompany() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_employees_2_0 = null;

        EObject lv_project_3_0 = null;



        	enterRule();

        try {
            // InternalProjectDsl.g:78:2: ( (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_employees_2_0= ruleEmployees ) ) ( (lv_project_3_0= ruleProject ) ) ) )
            // InternalProjectDsl.g:79:2: (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_employees_2_0= ruleEmployees ) ) ( (lv_project_3_0= ruleProject ) ) )
            {
            // InternalProjectDsl.g:79:2: (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_employees_2_0= ruleEmployees ) ) ( (lv_project_3_0= ruleProject ) ) )
            // InternalProjectDsl.g:80:3: otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_employees_2_0= ruleEmployees ) ) ( (lv_project_3_0= ruleProject ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompanyAccess().getCompanyKeyword_0());
            		
            // InternalProjectDsl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectDsl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectDsl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalProjectDsl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompanyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompanyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalProjectDsl.g:102:3: ( (lv_employees_2_0= ruleEmployees ) )
            // InternalProjectDsl.g:103:4: (lv_employees_2_0= ruleEmployees )
            {
            // InternalProjectDsl.g:103:4: (lv_employees_2_0= ruleEmployees )
            // InternalProjectDsl.g:104:5: lv_employees_2_0= ruleEmployees
            {

            					newCompositeNode(grammarAccess.getCompanyAccess().getEmployeesEmployeesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_employees_2_0=ruleEmployees();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompanyRule());
            					}
            					set(
            						current,
            						"employees",
            						lv_employees_2_0,
            						"com.ifpen.manager.xtext.ProjectDsl.Employees");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProjectDsl.g:121:3: ( (lv_project_3_0= ruleProject ) )
            // InternalProjectDsl.g:122:4: (lv_project_3_0= ruleProject )
            {
            // InternalProjectDsl.g:122:4: (lv_project_3_0= ruleProject )
            // InternalProjectDsl.g:123:5: lv_project_3_0= ruleProject
            {

            					newCompositeNode(grammarAccess.getCompanyAccess().getProjectProjectParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_project_3_0=ruleProject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompanyRule());
            					}
            					set(
            						current,
            						"project",
            						lv_project_3_0,
            						"com.ifpen.manager.xtext.ProjectDsl.Project");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleEmployees"
    // InternalProjectDsl.g:144:1: entryRuleEmployees returns [EObject current=null] : iv_ruleEmployees= ruleEmployees EOF ;
    public final EObject entryRuleEmployees() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployees = null;


        try {
            // InternalProjectDsl.g:144:50: (iv_ruleEmployees= ruleEmployees EOF )
            // InternalProjectDsl.g:145:2: iv_ruleEmployees= ruleEmployees EOF
            {
             newCompositeNode(grammarAccess.getEmployeesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmployees=ruleEmployees();

            state._fsp--;

             current =iv_ruleEmployees; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmployees"


    // $ANTLR start "ruleEmployees"
    // InternalProjectDsl.g:151:1: ruleEmployees returns [EObject current=null] : (otherlv_0= 'employees' otherlv_1= '{' ( (lv_employees_2_0= ruleEmployee ) )+ otherlv_3= '}' ) ;
    public final EObject ruleEmployees() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_employees_2_0 = null;



        	enterRule();

        try {
            // InternalProjectDsl.g:157:2: ( (otherlv_0= 'employees' otherlv_1= '{' ( (lv_employees_2_0= ruleEmployee ) )+ otherlv_3= '}' ) )
            // InternalProjectDsl.g:158:2: (otherlv_0= 'employees' otherlv_1= '{' ( (lv_employees_2_0= ruleEmployee ) )+ otherlv_3= '}' )
            {
            // InternalProjectDsl.g:158:2: (otherlv_0= 'employees' otherlv_1= '{' ( (lv_employees_2_0= ruleEmployee ) )+ otherlv_3= '}' )
            // InternalProjectDsl.g:159:3: otherlv_0= 'employees' otherlv_1= '{' ( (lv_employees_2_0= ruleEmployee ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEmployeesAccess().getEmployeesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getEmployeesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalProjectDsl.g:167:3: ( (lv_employees_2_0= ruleEmployee ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProjectDsl.g:168:4: (lv_employees_2_0= ruleEmployee )
            	    {
            	    // InternalProjectDsl.g:168:4: (lv_employees_2_0= ruleEmployee )
            	    // InternalProjectDsl.g:169:5: lv_employees_2_0= ruleEmployee
            	    {

            	    					newCompositeNode(grammarAccess.getEmployeesAccess().getEmployeesEmployeeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_employees_2_0=ruleEmployee();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEmployeesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"employees",
            	    						lv_employees_2_0,
            	    						"com.ifpen.manager.xtext.ProjectDsl.Employee");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEmployeesAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmployees"


    // $ANTLR start "entryRuleEmployee"
    // InternalProjectDsl.g:194:1: entryRuleEmployee returns [EObject current=null] : iv_ruleEmployee= ruleEmployee EOF ;
    public final EObject entryRuleEmployee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployee = null;


        try {
            // InternalProjectDsl.g:194:49: (iv_ruleEmployee= ruleEmployee EOF )
            // InternalProjectDsl.g:195:2: iv_ruleEmployee= ruleEmployee EOF
            {
             newCompositeNode(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmployee=ruleEmployee();

            state._fsp--;

             current =iv_ruleEmployee; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalProjectDsl.g:201:1: ruleEmployee returns [EObject current=null] : (otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weigh' ( (lv_weight_3_0= RULE_INT ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_INT ) ) )? ) ;
    public final EObject ruleEmployee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_weight_3_0=null;
        Token otherlv_4=null;
        Token lv_height_5_0=null;


        	enterRule();

        try {
            // InternalProjectDsl.g:207:2: ( (otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weigh' ( (lv_weight_3_0= RULE_INT ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_INT ) ) )? ) )
            // InternalProjectDsl.g:208:2: (otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weigh' ( (lv_weight_3_0= RULE_INT ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_INT ) ) )? )
            {
            // InternalProjectDsl.g:208:2: (otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weigh' ( (lv_weight_3_0= RULE_INT ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_INT ) ) )? )
            // InternalProjectDsl.g:209:3: otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weigh' ( (lv_weight_3_0= RULE_INT ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEmployeeAccess().getEmployeeKeyword_0());
            		
            // InternalProjectDsl.g:213:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectDsl.g:214:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectDsl.g:214:4: (lv_name_1_0= RULE_ID )
            // InternalProjectDsl.g:215:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalProjectDsl.g:231:3: (otherlv_2= 'weigh' ( (lv_weight_3_0= RULE_INT ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalProjectDsl.g:232:4: otherlv_2= 'weigh' ( (lv_weight_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getEmployeeAccess().getWeighKeyword_2_0());
                    			
                    // InternalProjectDsl.g:236:4: ( (lv_weight_3_0= RULE_INT ) )
                    // InternalProjectDsl.g:237:5: (lv_weight_3_0= RULE_INT )
                    {
                    // InternalProjectDsl.g:237:5: (lv_weight_3_0= RULE_INT )
                    // InternalProjectDsl.g:238:6: lv_weight_3_0= RULE_INT
                    {
                    lv_weight_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    						newLeafNode(lv_weight_3_0, grammarAccess.getEmployeeAccess().getWeightINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEmployeeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"weight",
                    							lv_weight_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProjectDsl.g:255:3: (otherlv_4= 'height' ( (lv_height_5_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalProjectDsl.g:256:4: otherlv_4= 'height' ( (lv_height_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getEmployeeAccess().getHeightKeyword_3_0());
                    			
                    // InternalProjectDsl.g:260:4: ( (lv_height_5_0= RULE_INT ) )
                    // InternalProjectDsl.g:261:5: (lv_height_5_0= RULE_INT )
                    {
                    // InternalProjectDsl.g:261:5: (lv_height_5_0= RULE_INT )
                    // InternalProjectDsl.g:262:6: lv_height_5_0= RULE_INT
                    {
                    lv_height_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_height_5_0, grammarAccess.getEmployeeAccess().getHeightINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEmployeeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"height",
                    							lv_height_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleProject"
    // InternalProjectDsl.g:283:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalProjectDsl.g:283:48: (iv_ruleProject= ruleProject EOF )
            // InternalProjectDsl.g:284:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalProjectDsl.g:290:1: ruleProject returns [EObject current=null] : (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruletaskType ) ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalProjectDsl.g:296:2: ( (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruletaskType ) ) ) )
            // InternalProjectDsl.g:297:2: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruletaskType ) ) )
            {
            // InternalProjectDsl.g:297:2: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruletaskType ) ) )
            // InternalProjectDsl.g:298:3: otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruletaskType ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
            		
            // InternalProjectDsl.g:302:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectDsl.g:303:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectDsl.g:303:4: (lv_name_1_0= RULE_ID )
            // InternalProjectDsl.g:304:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getTypeKeyword_2());
            		
            // InternalProjectDsl.g:324:3: ( (lv_type_3_0= ruletaskType ) )
            // InternalProjectDsl.g:325:4: (lv_type_3_0= ruletaskType )
            {
            // InternalProjectDsl.g:325:4: (lv_type_3_0= ruletaskType )
            // InternalProjectDsl.g:326:5: lv_type_3_0= ruletaskType
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getTypeTaskTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruletaskType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"com.ifpen.manager.xtext.ProjectDsl.taskType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "ruletaskType"
    // InternalProjectDsl.g:347:1: ruletaskType returns [Enumerator current=null] : ( (enumLiteral_0= 'development' ) | (enumLiteral_1= 'documentation' ) ) ;
    public final Enumerator ruletaskType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProjectDsl.g:353:2: ( ( (enumLiteral_0= 'development' ) | (enumLiteral_1= 'documentation' ) ) )
            // InternalProjectDsl.g:354:2: ( (enumLiteral_0= 'development' ) | (enumLiteral_1= 'documentation' ) )
            {
            // InternalProjectDsl.g:354:2: ( (enumLiteral_0= 'development' ) | (enumLiteral_1= 'documentation' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalProjectDsl.g:355:3: (enumLiteral_0= 'development' )
                    {
                    // InternalProjectDsl.g:355:3: (enumLiteral_0= 'development' )
                    // InternalProjectDsl.g:356:4: enumLiteral_0= 'development'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getTaskTypeAccess().getDevelopmentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTaskTypeAccess().getDevelopmentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectDsl.g:363:3: (enumLiteral_1= 'documentation' )
                    {
                    // InternalProjectDsl.g:363:3: (enumLiteral_1= 'documentation' )
                    // InternalProjectDsl.g:364:4: enumLiteral_1= 'documentation'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getTaskTypeAccess().getDocumentationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTaskTypeAccess().getDocumentationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletaskType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300000L});

}
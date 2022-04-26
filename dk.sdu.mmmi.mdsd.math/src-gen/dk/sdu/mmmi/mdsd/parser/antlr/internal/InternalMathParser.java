package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'external'", "'var'", "'='", "'pi'", "'('", "')'", "'sqrt'", "'int'", "'pow'", "','", "'+'", "'-'", "'*'", "'/'", "'let'", "'in'", "'end'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMath.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMath.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMath.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMath.g:71:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDef ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_externals_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDef ) ) ) )
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDef ) ) )
            {
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDef ) ) )
            // InternalMath.g:79:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDef ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalMath.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:101:3: ( (lv_externals_2_0= ruleExternalDef ) )
            // InternalMath.g:102:4: (lv_externals_2_0= ruleExternalDef )
            {
            // InternalMath.g:102:4: (lv_externals_2_0= ruleExternalDef )
            // InternalMath.g:103:5: lv_externals_2_0= ruleExternalDef
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getExternalsExternalDefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_externals_2_0=ruleExternalDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"externals",
            						lv_externals_2_0,
            						"dk.sdu.mmmi.mdsd.Math.ExternalDef");
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExternalDef"
    // InternalMath.g:124:1: entryRuleExternalDef returns [EObject current=null] : iv_ruleExternalDef= ruleExternalDef EOF ;
    public final EObject entryRuleExternalDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDef = null;


        try {
            // InternalMath.g:124:52: (iv_ruleExternalDef= ruleExternalDef EOF )
            // InternalMath.g:125:2: iv_ruleExternalDef= ruleExternalDef EOF
            {
             newCompositeNode(grammarAccess.getExternalDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalDef=ruleExternalDef();

            state._fsp--;

             current =iv_ruleExternalDef; 
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
    // $ANTLR end "entryRuleExternalDef"


    // $ANTLR start "ruleExternalDef"
    // InternalMath.g:131:1: ruleExternalDef returns [EObject current=null] : ( (otherlv_0= 'external' ( (lv_functions_1_0= ruleFunction ) ) )* ( (lv_exp_2_0= ruleMathExp ) ) ) ;
    public final EObject ruleExternalDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functions_1_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:137:2: ( ( (otherlv_0= 'external' ( (lv_functions_1_0= ruleFunction ) ) )* ( (lv_exp_2_0= ruleMathExp ) ) ) )
            // InternalMath.g:138:2: ( (otherlv_0= 'external' ( (lv_functions_1_0= ruleFunction ) ) )* ( (lv_exp_2_0= ruleMathExp ) ) )
            {
            // InternalMath.g:138:2: ( (otherlv_0= 'external' ( (lv_functions_1_0= ruleFunction ) ) )* ( (lv_exp_2_0= ruleMathExp ) ) )
            // InternalMath.g:139:3: (otherlv_0= 'external' ( (lv_functions_1_0= ruleFunction ) ) )* ( (lv_exp_2_0= ruleMathExp ) )
            {
            // InternalMath.g:139:3: (otherlv_0= 'external' ( (lv_functions_1_0= ruleFunction ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:140:4: otherlv_0= 'external' ( (lv_functions_1_0= ruleFunction ) )
            	    {
            	    otherlv_0=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_0, grammarAccess.getExternalDefAccess().getExternalKeyword_0_0());
            	    			
            	    // InternalMath.g:144:4: ( (lv_functions_1_0= ruleFunction ) )
            	    // InternalMath.g:145:5: (lv_functions_1_0= ruleFunction )
            	    {
            	    // InternalMath.g:145:5: (lv_functions_1_0= ruleFunction )
            	    // InternalMath.g:146:6: lv_functions_1_0= ruleFunction
            	    {

            	    						newCompositeNode(grammarAccess.getExternalDefAccess().getFunctionsFunctionParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_functions_1_0=ruleFunction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternalDefRule());
            	    						}
            	    						add(
            	    							current,
            	    							"functions",
            	    							lv_functions_1_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Function");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMath.g:164:3: ( (lv_exp_2_0= ruleMathExp ) )
            // InternalMath.g:165:4: (lv_exp_2_0= ruleMathExp )
            {
            // InternalMath.g:165:4: (lv_exp_2_0= ruleMathExp )
            // InternalMath.g:166:5: lv_exp_2_0= ruleMathExp
            {

            					newCompositeNode(grammarAccess.getExternalDefAccess().getExpMathExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleMathExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalDefRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"dk.sdu.mmmi.mdsd.Math.MathExp");
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
    // $ANTLR end "ruleExternalDef"


    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:187:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:187:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:188:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:194:1: ruleMathExp returns [EObject current=null] : ( () ( (lv_variables_1_0= ruleVarBinding ) )* ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:200:2: ( ( () ( (lv_variables_1_0= ruleVarBinding ) )* ) )
            // InternalMath.g:201:2: ( () ( (lv_variables_1_0= ruleVarBinding ) )* )
            {
            // InternalMath.g:201:2: ( () ( (lv_variables_1_0= ruleVarBinding ) )* )
            // InternalMath.g:202:3: () ( (lv_variables_1_0= ruleVarBinding ) )*
            {
            // InternalMath.g:202:3: ()
            // InternalMath.g:203:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMathExpAccess().getMathExpAction_0(),
            					current);
            			

            }

            // InternalMath.g:209:3: ( (lv_variables_1_0= ruleVarBinding ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:210:4: (lv_variables_1_0= ruleVarBinding )
            	    {
            	    // InternalMath.g:210:4: (lv_variables_1_0= ruleVarBinding )
            	    // InternalMath.g:211:5: lv_variables_1_0= ruleVarBinding
            	    {

            	    					newCompositeNode(grammarAccess.getMathExpAccess().getVariablesVarBindingParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_variables_1_0=ruleVarBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_1_0,
            	    						"dk.sdu.mmmi.mdsd.Math.VarBinding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleVarBinding"
    // InternalMath.g:232:1: entryRuleVarBinding returns [EObject current=null] : iv_ruleVarBinding= ruleVarBinding EOF ;
    public final EObject entryRuleVarBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarBinding = null;


        try {
            // InternalMath.g:232:51: (iv_ruleVarBinding= ruleVarBinding EOF )
            // InternalMath.g:233:2: iv_ruleVarBinding= ruleVarBinding EOF
            {
             newCompositeNode(grammarAccess.getVarBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarBinding=ruleVarBinding();

            state._fsp--;

             current =iv_ruleVarBinding; 
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
    // $ANTLR end "entryRuleVarBinding"


    // $ANTLR start "ruleVarBinding"
    // InternalMath.g:239:1: ruleVarBinding returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) ;
    public final EObject ruleVarBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:245:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) )
            // InternalMath.g:246:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            {
            // InternalMath.g:246:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            // InternalMath.g:247:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarBindingAccess().getVarKeyword_0());
            		
            // InternalMath.g:251:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:252:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:252:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:253:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getVarBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:273:3: ( (lv_expression_3_0= ruleExp ) )
            // InternalMath.g:274:4: (lv_expression_3_0= ruleExp )
            {
            // InternalMath.g:274:4: (lv_expression_3_0= ruleExp )
            // InternalMath.g:275:5: lv_expression_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVarBindingAccess().getExpressionExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarBindingRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
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
    // $ANTLR end "ruleVarBinding"


    // $ANTLR start "entryRuleFunction"
    // InternalMath.g:296:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMath.g:296:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMath.g:297:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMath.g:303:1: ruleFunction returns [EObject current=null] : ( ( () ( (lv_f_1_0= 'pi' ) ) otherlv_2= '(' otherlv_3= ')' ) | ( ( (lv_f_4_0= 'sqrt' ) ) otherlv_5= '(' otherlv_6= 'int' otherlv_7= ')' ) | ( ( (lv_f_8_0= 'pow' ) ) otherlv_9= '(' otherlv_10= 'int' otherlv_11= ',' otherlv_12= 'int' otherlv_13= ')' ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_f_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_f_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_f_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalMath.g:309:2: ( ( ( () ( (lv_f_1_0= 'pi' ) ) otherlv_2= '(' otherlv_3= ')' ) | ( ( (lv_f_4_0= 'sqrt' ) ) otherlv_5= '(' otherlv_6= 'int' otherlv_7= ')' ) | ( ( (lv_f_8_0= 'pow' ) ) otherlv_9= '(' otherlv_10= 'int' otherlv_11= ',' otherlv_12= 'int' otherlv_13= ')' ) ) )
            // InternalMath.g:310:2: ( ( () ( (lv_f_1_0= 'pi' ) ) otherlv_2= '(' otherlv_3= ')' ) | ( ( (lv_f_4_0= 'sqrt' ) ) otherlv_5= '(' otherlv_6= 'int' otherlv_7= ')' ) | ( ( (lv_f_8_0= 'pow' ) ) otherlv_9= '(' otherlv_10= 'int' otherlv_11= ',' otherlv_12= 'int' otherlv_13= ')' ) )
            {
            // InternalMath.g:310:2: ( ( () ( (lv_f_1_0= 'pi' ) ) otherlv_2= '(' otherlv_3= ')' ) | ( ( (lv_f_4_0= 'sqrt' ) ) otherlv_5= '(' otherlv_6= 'int' otherlv_7= ')' ) | ( ( (lv_f_8_0= 'pow' ) ) otherlv_9= '(' otherlv_10= 'int' otherlv_11= ',' otherlv_12= 'int' otherlv_13= ')' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMath.g:311:3: ( () ( (lv_f_1_0= 'pi' ) ) otherlv_2= '(' otherlv_3= ')' )
                    {
                    // InternalMath.g:311:3: ( () ( (lv_f_1_0= 'pi' ) ) otherlv_2= '(' otherlv_3= ')' )
                    // InternalMath.g:312:4: () ( (lv_f_1_0= 'pi' ) ) otherlv_2= '(' otherlv_3= ')'
                    {
                    // InternalMath.g:312:4: ()
                    // InternalMath.g:313:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFunctionAccess().getFunctionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:319:4: ( (lv_f_1_0= 'pi' ) )
                    // InternalMath.g:320:5: (lv_f_1_0= 'pi' )
                    {
                    // InternalMath.g:320:5: (lv_f_1_0= 'pi' )
                    // InternalMath.g:321:6: lv_f_1_0= 'pi'
                    {
                    lv_f_1_0=(Token)match(input,15,FOLLOW_9); 

                    						newLeafNode(lv_f_1_0, grammarAccess.getFunctionAccess().getFPiKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionRule());
                    						}
                    						setWithLastConsumed(current, "f", lv_f_1_0, "pi");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:343:3: ( ( (lv_f_4_0= 'sqrt' ) ) otherlv_5= '(' otherlv_6= 'int' otherlv_7= ')' )
                    {
                    // InternalMath.g:343:3: ( ( (lv_f_4_0= 'sqrt' ) ) otherlv_5= '(' otherlv_6= 'int' otherlv_7= ')' )
                    // InternalMath.g:344:4: ( (lv_f_4_0= 'sqrt' ) ) otherlv_5= '(' otherlv_6= 'int' otherlv_7= ')'
                    {
                    // InternalMath.g:344:4: ( (lv_f_4_0= 'sqrt' ) )
                    // InternalMath.g:345:5: (lv_f_4_0= 'sqrt' )
                    {
                    // InternalMath.g:345:5: (lv_f_4_0= 'sqrt' )
                    // InternalMath.g:346:6: lv_f_4_0= 'sqrt'
                    {
                    lv_f_4_0=(Token)match(input,18,FOLLOW_9); 

                    						newLeafNode(lv_f_4_0, grammarAccess.getFunctionAccess().getFSqrtKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionRule());
                    						}
                    						setWithLastConsumed(current, "f", lv_f_4_0, "sqrt");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_1());
                    			
                    otherlv_6=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getIntKeyword_1_2());
                    			
                    otherlv_7=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:372:3: ( ( (lv_f_8_0= 'pow' ) ) otherlv_9= '(' otherlv_10= 'int' otherlv_11= ',' otherlv_12= 'int' otherlv_13= ')' )
                    {
                    // InternalMath.g:372:3: ( ( (lv_f_8_0= 'pow' ) ) otherlv_9= '(' otherlv_10= 'int' otherlv_11= ',' otherlv_12= 'int' otherlv_13= ')' )
                    // InternalMath.g:373:4: ( (lv_f_8_0= 'pow' ) ) otherlv_9= '(' otherlv_10= 'int' otherlv_11= ',' otherlv_12= 'int' otherlv_13= ')'
                    {
                    // InternalMath.g:373:4: ( (lv_f_8_0= 'pow' ) )
                    // InternalMath.g:374:5: (lv_f_8_0= 'pow' )
                    {
                    // InternalMath.g:374:5: (lv_f_8_0= 'pow' )
                    // InternalMath.g:375:6: lv_f_8_0= 'pow'
                    {
                    lv_f_8_0=(Token)match(input,20,FOLLOW_9); 

                    						newLeafNode(lv_f_8_0, grammarAccess.getFunctionAccess().getFPowKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionRule());
                    						}
                    						setWithLastConsumed(current, "f", lv_f_8_0, "pow");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2_1());
                    			
                    otherlv_10=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getIntKeyword_2_2());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getFunctionAccess().getCommaKeyword_2_3());
                    			
                    otherlv_12=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getFunctionAccess().getIntKeyword_2_4());
                    			
                    otherlv_13=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2_5());
                    			

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFunctionUse"
    // InternalMath.g:412:1: entryRuleFunctionUse returns [EObject current=null] : iv_ruleFunctionUse= ruleFunctionUse EOF ;
    public final EObject entryRuleFunctionUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionUse = null;


        try {
            // InternalMath.g:412:52: (iv_ruleFunctionUse= ruleFunctionUse EOF )
            // InternalMath.g:413:2: iv_ruleFunctionUse= ruleFunctionUse EOF
            {
             newCompositeNode(grammarAccess.getFunctionUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionUse=ruleFunctionUse();

            state._fsp--;

             current =iv_ruleFunctionUse; 
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
    // $ANTLR end "entryRuleFunctionUse"


    // $ANTLR start "ruleFunctionUse"
    // InternalMath.g:419:1: ruleFunctionUse returns [EObject current=null] : (this_SqrtUse_0= ruleSqrtUse | this_PowerUse_1= rulePowerUse | ( () ( (lv_value_3_0= rulePI ) ) ) ) ;
    public final EObject ruleFunctionUse() throws RecognitionException {
        EObject current = null;

        EObject this_SqrtUse_0 = null;

        EObject this_PowerUse_1 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:425:2: ( (this_SqrtUse_0= ruleSqrtUse | this_PowerUse_1= rulePowerUse | ( () ( (lv_value_3_0= rulePI ) ) ) ) )
            // InternalMath.g:426:2: (this_SqrtUse_0= ruleSqrtUse | this_PowerUse_1= rulePowerUse | ( () ( (lv_value_3_0= rulePI ) ) ) )
            {
            // InternalMath.g:426:2: (this_SqrtUse_0= ruleSqrtUse | this_PowerUse_1= rulePowerUse | ( () ( (lv_value_3_0= rulePI ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMath.g:427:3: this_SqrtUse_0= ruleSqrtUse
                    {

                    			newCompositeNode(grammarAccess.getFunctionUseAccess().getSqrtUseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SqrtUse_0=ruleSqrtUse();

                    state._fsp--;


                    			current = this_SqrtUse_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:436:3: this_PowerUse_1= rulePowerUse
                    {

                    			newCompositeNode(grammarAccess.getFunctionUseAccess().getPowerUseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PowerUse_1=rulePowerUse();

                    state._fsp--;


                    			current = this_PowerUse_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:445:3: ( () ( (lv_value_3_0= rulePI ) ) )
                    {
                    // InternalMath.g:445:3: ( () ( (lv_value_3_0= rulePI ) ) )
                    // InternalMath.g:446:4: () ( (lv_value_3_0= rulePI ) )
                    {
                    // InternalMath.g:446:4: ()
                    // InternalMath.g:447:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFunctionUseAccess().getPiUseAction_2_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:453:4: ( (lv_value_3_0= rulePI ) )
                    // InternalMath.g:454:5: (lv_value_3_0= rulePI )
                    {
                    // InternalMath.g:454:5: (lv_value_3_0= rulePI )
                    // InternalMath.g:455:6: lv_value_3_0= rulePI
                    {

                    						newCompositeNode(grammarAccess.getFunctionUseAccess().getValuePIParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=rulePI();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionUseRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"dk.sdu.mmmi.mdsd.Math.PI");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleFunctionUse"


    // $ANTLR start "entryRuleSqrtUse"
    // InternalMath.g:477:1: entryRuleSqrtUse returns [EObject current=null] : iv_ruleSqrtUse= ruleSqrtUse EOF ;
    public final EObject entryRuleSqrtUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqrtUse = null;


        try {
            // InternalMath.g:477:48: (iv_ruleSqrtUse= ruleSqrtUse EOF )
            // InternalMath.g:478:2: iv_ruleSqrtUse= ruleSqrtUse EOF
            {
             newCompositeNode(grammarAccess.getSqrtUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSqrtUse=ruleSqrtUse();

            state._fsp--;

             current =iv_ruleSqrtUse; 
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
    // $ANTLR end "entryRuleSqrtUse"


    // $ANTLR start "ruleSqrtUse"
    // InternalMath.g:484:1: ruleSqrtUse returns [EObject current=null] : (otherlv_0= 'sqrt' otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' ) ;
    public final EObject ruleSqrtUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:490:2: ( (otherlv_0= 'sqrt' otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' ) )
            // InternalMath.g:491:2: (otherlv_0= 'sqrt' otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' )
            {
            // InternalMath.g:491:2: (otherlv_0= 'sqrt' otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' )
            // InternalMath.g:492:3: otherlv_0= 'sqrt' otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSqrtUseAccess().getSqrtKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSqrtUseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:500:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalMath.g:501:4: (lv_exp_2_0= ruleExp )
            {
            // InternalMath.g:501:4: (lv_exp_2_0= ruleExp )
            // InternalMath.g:502:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getSqrtUseAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSqrtUseRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSqrtUseAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleSqrtUse"


    // $ANTLR start "entryRulePowerUse"
    // InternalMath.g:527:1: entryRulePowerUse returns [EObject current=null] : iv_rulePowerUse= rulePowerUse EOF ;
    public final EObject entryRulePowerUse() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerUse = null;


        try {
            // InternalMath.g:527:49: (iv_rulePowerUse= rulePowerUse EOF )
            // InternalMath.g:528:2: iv_rulePowerUse= rulePowerUse EOF
            {
             newCompositeNode(grammarAccess.getPowerUseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePowerUse=rulePowerUse();

            state._fsp--;

             current =iv_rulePowerUse; 
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
    // $ANTLR end "entryRulePowerUse"


    // $ANTLR start "rulePowerUse"
    // InternalMath.g:534:1: rulePowerUse returns [EObject current=null] : (otherlv_0= 'pow' otherlv_1= '(' ( (lv_first_2_0= ruleExp ) ) otherlv_3= ',' ( (lv_second_4_0= ruleExp ) ) otherlv_5= ')' ) ;
    public final EObject rulePowerUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_first_2_0 = null;

        EObject lv_second_4_0 = null;



        	enterRule();

        try {
            // InternalMath.g:540:2: ( (otherlv_0= 'pow' otherlv_1= '(' ( (lv_first_2_0= ruleExp ) ) otherlv_3= ',' ( (lv_second_4_0= ruleExp ) ) otherlv_5= ')' ) )
            // InternalMath.g:541:2: (otherlv_0= 'pow' otherlv_1= '(' ( (lv_first_2_0= ruleExp ) ) otherlv_3= ',' ( (lv_second_4_0= ruleExp ) ) otherlv_5= ')' )
            {
            // InternalMath.g:541:2: (otherlv_0= 'pow' otherlv_1= '(' ( (lv_first_2_0= ruleExp ) ) otherlv_3= ',' ( (lv_second_4_0= ruleExp ) ) otherlv_5= ')' )
            // InternalMath.g:542:3: otherlv_0= 'pow' otherlv_1= '(' ( (lv_first_2_0= ruleExp ) ) otherlv_3= ',' ( (lv_second_4_0= ruleExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPowerUseAccess().getPowKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPowerUseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:550:3: ( (lv_first_2_0= ruleExp ) )
            // InternalMath.g:551:4: (lv_first_2_0= ruleExp )
            {
            // InternalMath.g:551:4: (lv_first_2_0= ruleExp )
            // InternalMath.g:552:5: lv_first_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getPowerUseAccess().getFirstExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_first_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowerUseRule());
            					}
            					set(
            						current,
            						"first",
            						lv_first_2_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPowerUseAccess().getCommaKeyword_3());
            		
            // InternalMath.g:573:3: ( (lv_second_4_0= ruleExp ) )
            // InternalMath.g:574:4: (lv_second_4_0= ruleExp )
            {
            // InternalMath.g:574:4: (lv_second_4_0= ruleExp )
            // InternalMath.g:575:5: lv_second_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getPowerUseAccess().getSecondExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_second_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowerUseRule());
            					}
            					set(
            						current,
            						"second",
            						lv_second_4_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPowerUseAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "rulePowerUse"


    // $ANTLR start "entryRulePI"
    // InternalMath.g:600:1: entryRulePI returns [String current=null] : iv_rulePI= rulePI EOF ;
    public final String entryRulePI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePI = null;


        try {
            // InternalMath.g:600:42: (iv_rulePI= rulePI EOF )
            // InternalMath.g:601:2: iv_rulePI= rulePI EOF
            {
             newCompositeNode(grammarAccess.getPIRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePI=rulePI();

            state._fsp--;

             current =iv_rulePI.getText(); 
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
    // $ANTLR end "entryRulePI"


    // $ANTLR start "rulePI"
    // InternalMath.g:607:1: rulePI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'pi' kw= '(' kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulePI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMath.g:613:2: ( (kw= 'pi' kw= '(' kw= ')' ) )
            // InternalMath.g:614:2: (kw= 'pi' kw= '(' kw= ')' )
            {
            // InternalMath.g:614:2: (kw= 'pi' kw= '(' kw= ')' )
            // InternalMath.g:615:3: kw= 'pi' kw= '(' kw= ')'
            {
            kw=(Token)match(input,15,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPIAccess().getPiKeyword_0());
            		
            kw=(Token)match(input,16,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPIAccess().getLeftParenthesisKeyword_1());
            		
            kw=(Token)match(input,17,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPIAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "rulePI"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:634:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:634:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:635:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:641:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:647:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMath.g:648:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMath.g:648:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMath.g:649:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:657:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=22 && LA6_0<=23)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:658:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMath.g:658:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==22) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==23) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalMath.g:659:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMath.g:659:5: ( () otherlv_2= '+' )
            	            // InternalMath.g:660:6: () otherlv_2= '+'
            	            {
            	            // InternalMath.g:660:6: ()
            	            // InternalMath.g:661:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,22,FOLLOW_8); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:673:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMath.g:673:5: ( () otherlv_4= '-' )
            	            // InternalMath.g:674:6: () otherlv_4= '-'
            	            {
            	            // InternalMath.g:674:6: ()
            	            // InternalMath.g:675:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,23,FOLLOW_8); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:687:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMath.g:688:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMath.g:688:5: (lv_right_5_0= ruleFactor )
            	    // InternalMath.g:689:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:711:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMath.g:711:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMath.g:712:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:718:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:724:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMath.g:725:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:725:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMath.g:726:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:734:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=24 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMath.g:735:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:735:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==24) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==25) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalMath.g:736:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMath.g:736:5: ( () otherlv_2= '*' )
            	            // InternalMath.g:737:6: () otherlv_2= '*'
            	            {
            	            // InternalMath.g:737:6: ()
            	            // InternalMath.g:738:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,24,FOLLOW_8); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:750:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMath.g:750:5: ( () otherlv_4= '/' )
            	            // InternalMath.g:751:6: () otherlv_4= '/'
            	            {
            	            // InternalMath.g:751:6: ()
            	            // InternalMath.g:752:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,25,FOLLOW_8); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:764:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMath.g:765:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMath.g:765:5: (lv_right_5_0= rulePrimary )
            	    // InternalMath.g:766:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:788:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:788:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:789:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:795:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_FunctionUse_5= ruleFunctionUse ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject this_Parenthesis_2 = null;

        EObject this_VariableUse_3 = null;

        EObject this_LetBinding_4 = null;

        EObject this_FunctionUse_5 = null;



        	enterRule();

        try {
            // InternalMath.g:801:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_FunctionUse_5= ruleFunctionUse ) )
            // InternalMath.g:802:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_FunctionUse_5= ruleFunctionUse )
            {
            // InternalMath.g:802:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_FunctionUse_5= ruleFunctionUse )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            case 26:
                {
                alt9=4;
                }
                break;
            case 15:
            case 18:
            case 20:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMath.g:803:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMath.g:803:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMath.g:804:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMath.g:804:4: ()
                    // InternalMath.g:805:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMathNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:811:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMath.g:812:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMath.g:812:5: (lv_value_1_0= RULE_INT )
                    // InternalMath.g:813:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:831:3: this_Parenthesis_2= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_2=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:840:3: this_VariableUse_3= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_3=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:849:3: this_LetBinding_4= ruleLetBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetBinding_4=ruleLetBinding();

                    state._fsp--;


                    			current = this_LetBinding_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMath.g:858:3: this_FunctionUse_5= ruleFunctionUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getFunctionUseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionUse_5=ruleFunctionUse();

                    state._fsp--;


                    			current = this_FunctionUse_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:870:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:870:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:871:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:877:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:883:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalMath.g:884:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalMath.g:884:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalMath.g:885:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMath.g:889:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalMath.g:890:4: (lv_exp_1_0= ruleExp )
            {
            // InternalMath.g:890:4: (lv_exp_1_0= ruleExp )
            // InternalMath.g:891:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_exp_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleLetBinding"
    // InternalMath.g:916:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalMath.g:916:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalMath.g:917:2: iv_ruleLetBinding= ruleLetBinding EOF
            {
             newCompositeNode(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetBinding=ruleLetBinding();

            state._fsp--;

             current =iv_ruleLetBinding; 
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
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalMath.g:923:1: ruleLetBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_binding_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:929:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalMath.g:930:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalMath.g:930:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalMath.g:931:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetBindingAccess().getLetKeyword_0());
            		
            // InternalMath.g:935:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:936:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:936:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:937:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:957:3: ( (lv_binding_3_0= ruleExp ) )
            // InternalMath.g:958:4: (lv_binding_3_0= ruleExp )
            {
            // InternalMath.g:958:4: (lv_binding_3_0= ruleExp )
            // InternalMath.g:959:5: lv_binding_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_binding_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getLetBindingAccess().getInKeyword_4());
            		
            // InternalMath.g:980:3: ( (lv_body_5_0= ruleExp ) )
            // InternalMath.g:981:4: (lv_body_5_0= ruleExp )
            {
            // InternalMath.g:981:4: (lv_body_5_0= ruleExp )
            // InternalMath.g:982:5: lv_body_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_body_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetBindingAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:1007:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:1007:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:1008:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:1014:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMath.g:1020:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMath.g:1021:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMath.g:1021:2: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:1022:3: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:1022:3: (otherlv_0= RULE_ID )
            // InternalMath.g:1023:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefBindingCrossReference_0());
            			

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
    // $ANTLR end "ruleVariableUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000148000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004158030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});

}
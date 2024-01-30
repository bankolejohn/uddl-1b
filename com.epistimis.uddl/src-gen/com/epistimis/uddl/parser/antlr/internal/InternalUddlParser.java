package com.epistimis.uddl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.epistimis.uddl.services.UddlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUddlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SIGNED_INT", "RULE_FLOAT", "RULE_LONG", "RULE_DEC", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'dm'", "'{'", "'}'", "'.'", "'import'", "';'", "'.*'", "'cdm'", "'ldm'", "'pdm'", "'basis'", "'domain'", "'['", "']'", "'observable'", "'centity'", "':'", "'basis:'", "'};'", "'cassoc'", "'participants:'", "'src:'", "'path:'", "'/'", "'#'", "'cquery'", "'spec:'", "'ccquery'", "'isUnion'", "'lunit'", "'conv'", "'-()>'", "'aconv'", "'-('", "'m:'", "'b:'", "')->'", "'str'", "'ch'", "'bool'", "'int'", "'nat'", "'real'", "'real+'", "'enum'", "'stdRef:'", "','", "'('", "')'", "'coord'", "'axis:'", "'angleEq:'", "'distanceEq:'", "'csa'", "'smsys'", "'refStd:'", "'landmark'", "'msys'", "'msa:'", "'coord:'", "'extRefStd:'", "'orient:'", "'refPt:'", "'!['", "'msa'", "'vtu:'", "'landmark:'", "'vtu'", "'!'", "'irc'", "'rrc'", "'rec'", "'flsc'", "'ec'", "'msc'", "')>'", "'loss:'", "'meas'", "'->'", "'sys:'", "'maxis'", "'msaxis:'", "'mc'", "'lentity'", "'lassoc'", "'source:'", "'lquery'", "'lcquery'", "'octet'", "'char'", "'string'", "'string['", "'char['", "'short'", "'long'", "'llong'", "'double'", "'ldouble'", "'float'", "'fixed['", "'ushort'", "'ulong'", "'ullong'", "'seq'", "'arr'", "'struct'", "'pentity'", "'prec:'", "'passoc'", "'pquery'", "'pcquery'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DEC=10;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SIGNED_INT=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=11;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int RULE_LONG=9;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalUddlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUddlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUddlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUddl.g"; }



     	private UddlGrammarAccess grammarAccess;

        public InternalUddlParser(TokenStream input, UddlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ModelFile";
       	}

       	@Override
       	protected UddlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModelFile"
    // InternalUddl.g:67:1: entryRuleModelFile returns [EObject current=null] : iv_ruleModelFile= ruleModelFile EOF ;
    public final EObject entryRuleModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFile = null;


        try {
            // InternalUddl.g:67:50: (iv_ruleModelFile= ruleModelFile EOF )
            // InternalUddl.g:68:2: iv_ruleModelFile= ruleModelFile EOF
            {
             newCompositeNode(grammarAccess.getModelFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelFile=ruleModelFile();

            state._fsp--;

             current =iv_ruleModelFile; 
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
    // $ANTLR end "entryRuleModelFile"


    // $ANTLR start "ruleModelFile"
    // InternalUddl.g:74:1: ruleModelFile returns [EObject current=null] : ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_dataModel_1_0= ruleDataModel ) ) ) ;
    public final EObject ruleModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_0_0 = null;

        EObject lv_dataModel_1_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:80:2: ( ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_dataModel_1_0= ruleDataModel ) ) ) )
            // InternalUddl.g:81:2: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_dataModel_1_0= ruleDataModel ) ) )
            {
            // InternalUddl.g:81:2: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_dataModel_1_0= ruleDataModel ) ) )
            // InternalUddl.g:82:3: ( (lv_includes_0_0= ruleInclude ) )* ( (lv_dataModel_1_0= ruleDataModel ) )
            {
            // InternalUddl.g:82:3: ( (lv_includes_0_0= ruleInclude ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUddl.g:83:4: (lv_includes_0_0= ruleInclude )
            	    {
            	    // InternalUddl.g:83:4: (lv_includes_0_0= ruleInclude )
            	    // InternalUddl.g:84:5: lv_includes_0_0= ruleInclude
            	    {

            	    					newCompositeNode(grammarAccess.getModelFileAccess().getIncludesIncludeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_includes_0_0=ruleInclude();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"includes",
            	    						lv_includes_0_0,
            	    						"com.epistimis.uddl.Uddl.Include");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalUddl.g:101:3: ( (lv_dataModel_1_0= ruleDataModel ) )
            // InternalUddl.g:102:4: (lv_dataModel_1_0= ruleDataModel )
            {
            // InternalUddl.g:102:4: (lv_dataModel_1_0= ruleDataModel )
            // InternalUddl.g:103:5: lv_dataModel_1_0= ruleDataModel
            {

            					newCompositeNode(grammarAccess.getModelFileAccess().getDataModelDataModelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_dataModel_1_0=ruleDataModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelFileRule());
            					}
            					set(
            						current,
            						"dataModel",
            						lv_dataModel_1_0,
            						"com.epistimis.uddl.Uddl.DataModel");
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
    // $ANTLR end "ruleModelFile"


    // $ANTLR start "entryRuleDataModel"
    // InternalUddl.g:124:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // InternalUddl.g:124:50: (iv_ruleDataModel= ruleDataModel EOF )
            // InternalUddl.g:125:2: iv_ruleDataModel= ruleDataModel EOF
            {
             newCompositeNode(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataModel=ruleDataModel();

            state._fsp--;

             current =iv_ruleDataModel; 
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
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // InternalUddl.g:131:1: ruleDataModel returns [EObject current=null] : (otherlv_0= 'dm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_cdm_4_0= ruleConceptualDataModel ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) | ( (lv_pdm_6_0= rulePlatformDataModel ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_cdm_4_0 = null;

        EObject lv_ldm_5_0 = null;

        EObject lv_pdm_6_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:137:2: ( (otherlv_0= 'dm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_cdm_4_0= ruleConceptualDataModel ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) | ( (lv_pdm_6_0= rulePlatformDataModel ) ) )* otherlv_7= '}' ) )
            // InternalUddl.g:138:2: (otherlv_0= 'dm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_cdm_4_0= ruleConceptualDataModel ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) | ( (lv_pdm_6_0= rulePlatformDataModel ) ) )* otherlv_7= '}' )
            {
            // InternalUddl.g:138:2: (otherlv_0= 'dm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_cdm_4_0= ruleConceptualDataModel ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) | ( (lv_pdm_6_0= rulePlatformDataModel ) ) )* otherlv_7= '}' )
            // InternalUddl.g:139:3: otherlv_0= 'dm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_cdm_4_0= ruleConceptualDataModel ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) | ( (lv_pdm_6_0= rulePlatformDataModel ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataModelAccess().getDmKeyword_0());
            		
            // InternalUddl.g:143:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:144:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:144:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:145:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:161:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalUddl.g:162:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:162:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:163:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getDataModelAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataModelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:183:3: ( ( (lv_cdm_4_0= ruleConceptualDataModel ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) | ( (lv_pdm_6_0= rulePlatformDataModel ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    alt3=1;
                    }
                    break;
                case 24:
                    {
                    alt3=2;
                    }
                    break;
                case 25:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalUddl.g:184:4: ( (lv_cdm_4_0= ruleConceptualDataModel ) )
            	    {
            	    // InternalUddl.g:184:4: ( (lv_cdm_4_0= ruleConceptualDataModel ) )
            	    // InternalUddl.g:185:5: (lv_cdm_4_0= ruleConceptualDataModel )
            	    {
            	    // InternalUddl.g:185:5: (lv_cdm_4_0= ruleConceptualDataModel )
            	    // InternalUddl.g:186:6: lv_cdm_4_0= ruleConceptualDataModel
            	    {

            	    						newCompositeNode(grammarAccess.getDataModelAccess().getCdmConceptualDataModelParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_cdm_4_0=ruleConceptualDataModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cdm",
            	    							lv_cdm_4_0,
            	    							"com.epistimis.uddl.Uddl.ConceptualDataModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUddl.g:204:4: ( (lv_ldm_5_0= ruleLogicalDataModel ) )
            	    {
            	    // InternalUddl.g:204:4: ( (lv_ldm_5_0= ruleLogicalDataModel ) )
            	    // InternalUddl.g:205:5: (lv_ldm_5_0= ruleLogicalDataModel )
            	    {
            	    // InternalUddl.g:205:5: (lv_ldm_5_0= ruleLogicalDataModel )
            	    // InternalUddl.g:206:6: lv_ldm_5_0= ruleLogicalDataModel
            	    {

            	    						newCompositeNode(grammarAccess.getDataModelAccess().getLdmLogicalDataModelParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_ldm_5_0=ruleLogicalDataModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ldm",
            	    							lv_ldm_5_0,
            	    							"com.epistimis.uddl.Uddl.LogicalDataModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUddl.g:224:4: ( (lv_pdm_6_0= rulePlatformDataModel ) )
            	    {
            	    // InternalUddl.g:224:4: ( (lv_pdm_6_0= rulePlatformDataModel ) )
            	    // InternalUddl.g:225:5: (lv_pdm_6_0= rulePlatformDataModel )
            	    {
            	    // InternalUddl.g:225:5: (lv_pdm_6_0= rulePlatformDataModel )
            	    // InternalUddl.g:226:6: lv_pdm_6_0= rulePlatformDataModel
            	    {

            	    						newCompositeNode(grammarAccess.getDataModelAccess().getPdmPlatformDataModelParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_pdm_6_0=rulePlatformDataModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pdm",
            	    							lv_pdm_6_0,
            	    							"com.epistimis.uddl.Uddl.PlatformDataModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleQN"
    // InternalUddl.g:252:1: entryRuleQN returns [String current=null] : iv_ruleQN= ruleQN EOF ;
    public final String entryRuleQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQN = null;


        try {
            // InternalUddl.g:252:42: (iv_ruleQN= ruleQN EOF )
            // InternalUddl.g:253:2: iv_ruleQN= ruleQN EOF
            {
             newCompositeNode(grammarAccess.getQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQN=ruleQN();

            state._fsp--;

             current =iv_ruleQN.getText(); 
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
    // $ANTLR end "entryRuleQN"


    // $ANTLR start "ruleQN"
    // InternalUddl.g:259:1: ruleQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUddl.g:265:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUddl.g:266:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUddl.g:266:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUddl.g:267:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalUddl.g:274:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUddl.g:275:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleQN"


    // $ANTLR start "entryRuleInclude"
    // InternalUddl.g:292:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalUddl.g:292:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalUddl.g:293:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalUddl.g:299:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:305:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // InternalUddl.g:306:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // InternalUddl.g:306:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // InternalUddl.g:307:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getImportKeyword_0());
            		
            // InternalUddl.g:311:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalUddl.g:312:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalUddl.g:312:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalUddl.g:313:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getIncludeAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIncludeRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"com.epistimis.uddl.Uddl.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalUddl.g:338:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalUddl.g:338:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalUddl.g:339:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalUddl.g:345:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QN_0= ruleQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QN_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:351:2: ( (this_QN_0= ruleQN (kw= '.*' )? ) )
            // InternalUddl.g:352:2: (this_QN_0= ruleQN (kw= '.*' )? )
            {
            // InternalUddl.g:352:2: (this_QN_0= ruleQN (kw= '.*' )? )
            // InternalUddl.g:353:3: this_QN_0= ruleQN (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_QN_0=ruleQN();

            state._fsp--;


            			current.merge(this_QN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalUddl.g:363:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUddl.g:364:4: kw= '.*'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleConceptualDataModel"
    // InternalUddl.g:374:1: entryRuleConceptualDataModel returns [EObject current=null] : iv_ruleConceptualDataModel= ruleConceptualDataModel EOF ;
    public final EObject entryRuleConceptualDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualDataModel = null;


        try {
            // InternalUddl.g:374:60: (iv_ruleConceptualDataModel= ruleConceptualDataModel EOF )
            // InternalUddl.g:375:2: iv_ruleConceptualDataModel= ruleConceptualDataModel EOF
            {
             newCompositeNode(grammarAccess.getConceptualDataModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualDataModel=ruleConceptualDataModel();

            state._fsp--;

             current =iv_ruleConceptualDataModel; 
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
    // $ANTLR end "entryRuleConceptualDataModel"


    // $ANTLR start "ruleConceptualDataModel"
    // InternalUddl.g:381:1: ruleConceptualDataModel returns [EObject current=null] : (otherlv_0= 'cdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleConceptualElement ) ) | ( (lv_cdm_5_0= ruleConceptualDataModel ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleConceptualDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_element_4_0 = null;

        EObject lv_cdm_5_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:387:2: ( (otherlv_0= 'cdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleConceptualElement ) ) | ( (lv_cdm_5_0= ruleConceptualDataModel ) ) )* otherlv_6= '}' ) )
            // InternalUddl.g:388:2: (otherlv_0= 'cdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleConceptualElement ) ) | ( (lv_cdm_5_0= ruleConceptualDataModel ) ) )* otherlv_6= '}' )
            {
            // InternalUddl.g:388:2: (otherlv_0= 'cdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleConceptualElement ) ) | ( (lv_cdm_5_0= ruleConceptualDataModel ) ) )* otherlv_6= '}' )
            // InternalUddl.g:389:3: otherlv_0= 'cdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleConceptualElement ) ) | ( (lv_cdm_5_0= ruleConceptualDataModel ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualDataModelAccess().getCdmKeyword_0());
            		
            // InternalUddl.g:393:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:394:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:394:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:395:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptualDataModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualDataModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:411:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUddl.g:412:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:412:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:413:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConceptualDataModelAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualDataModelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getConceptualDataModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:433:3: ( ( (lv_element_4_0= ruleConceptualElement ) ) | ( (lv_cdm_5_0= ruleConceptualDataModel ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=26 && LA7_0<=27)||(LA7_0>=30 && LA7_0<=31)||LA7_0==35||LA7_0==41||LA7_0==43) ) {
                    alt7=1;
                }
                else if ( (LA7_0==23) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUddl.g:434:4: ( (lv_element_4_0= ruleConceptualElement ) )
            	    {
            	    // InternalUddl.g:434:4: ( (lv_element_4_0= ruleConceptualElement ) )
            	    // InternalUddl.g:435:5: (lv_element_4_0= ruleConceptualElement )
            	    {
            	    // InternalUddl.g:435:5: (lv_element_4_0= ruleConceptualElement )
            	    // InternalUddl.g:436:6: lv_element_4_0= ruleConceptualElement
            	    {

            	    						newCompositeNode(grammarAccess.getConceptualDataModelAccess().getElementConceptualElementParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_element_4_0=ruleConceptualElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConceptualDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"element",
            	    							lv_element_4_0,
            	    							"com.epistimis.uddl.Uddl.ConceptualElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUddl.g:454:4: ( (lv_cdm_5_0= ruleConceptualDataModel ) )
            	    {
            	    // InternalUddl.g:454:4: ( (lv_cdm_5_0= ruleConceptualDataModel ) )
            	    // InternalUddl.g:455:5: (lv_cdm_5_0= ruleConceptualDataModel )
            	    {
            	    // InternalUddl.g:455:5: (lv_cdm_5_0= ruleConceptualDataModel )
            	    // InternalUddl.g:456:6: lv_cdm_5_0= ruleConceptualDataModel
            	    {

            	    						newCompositeNode(grammarAccess.getConceptualDataModelAccess().getCdmConceptualDataModelParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_cdm_5_0=ruleConceptualDataModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConceptualDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cdm",
            	    							lv_cdm_5_0,
            	    							"com.epistimis.uddl.Uddl.ConceptualDataModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConceptualDataModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleConceptualDataModel"


    // $ANTLR start "entryRuleLogicalDataModel"
    // InternalUddl.g:482:1: entryRuleLogicalDataModel returns [EObject current=null] : iv_ruleLogicalDataModel= ruleLogicalDataModel EOF ;
    public final EObject entryRuleLogicalDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalDataModel = null;


        try {
            // InternalUddl.g:482:57: (iv_ruleLogicalDataModel= ruleLogicalDataModel EOF )
            // InternalUddl.g:483:2: iv_ruleLogicalDataModel= ruleLogicalDataModel EOF
            {
             newCompositeNode(grammarAccess.getLogicalDataModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalDataModel=ruleLogicalDataModel();

            state._fsp--;

             current =iv_ruleLogicalDataModel; 
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
    // $ANTLR end "entryRuleLogicalDataModel"


    // $ANTLR start "ruleLogicalDataModel"
    // InternalUddl.g:489:1: ruleLogicalDataModel returns [EObject current=null] : (otherlv_0= 'ldm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleLogicalElement ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleLogicalDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_element_4_0 = null;

        EObject lv_ldm_5_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:495:2: ( (otherlv_0= 'ldm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleLogicalElement ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) )* otherlv_6= '}' ) )
            // InternalUddl.g:496:2: (otherlv_0= 'ldm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleLogicalElement ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) )* otherlv_6= '}' )
            {
            // InternalUddl.g:496:2: (otherlv_0= 'ldm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleLogicalElement ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) )* otherlv_6= '}' )
            // InternalUddl.g:497:3: otherlv_0= 'ldm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= ruleLogicalElement ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalDataModelAccess().getLdmKeyword_0());
            		
            // InternalUddl.g:501:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:502:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:502:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:503:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalDataModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalDataModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:519:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUddl.g:520:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:520:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:521:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalDataModelAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalDataModelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalDataModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:541:3: ( ( (lv_element_4_0= ruleLogicalElement ) ) | ( (lv_ldm_5_0= ruleLogicalDataModel ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=45 && LA9_0<=46)||LA9_0==48||(LA9_0>=53 && LA9_0<=60)||LA9_0==63||LA9_0==65||(LA9_0>=69 && LA9_0<=70)||(LA9_0>=72 && LA9_0<=73)||LA9_0==80||LA9_0==83||LA9_0==90||LA9_0==93||LA9_0==96||(LA9_0>=98 && LA9_0<=100)||(LA9_0>=102 && LA9_0<=103)) ) {
                    alt9=1;
                }
                else if ( (LA9_0==24) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUddl.g:542:4: ( (lv_element_4_0= ruleLogicalElement ) )
            	    {
            	    // InternalUddl.g:542:4: ( (lv_element_4_0= ruleLogicalElement ) )
            	    // InternalUddl.g:543:5: (lv_element_4_0= ruleLogicalElement )
            	    {
            	    // InternalUddl.g:543:5: (lv_element_4_0= ruleLogicalElement )
            	    // InternalUddl.g:544:6: lv_element_4_0= ruleLogicalElement
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalDataModelAccess().getElementLogicalElementParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_element_4_0=ruleLogicalElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"element",
            	    							lv_element_4_0,
            	    							"com.epistimis.uddl.Uddl.LogicalElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUddl.g:562:4: ( (lv_ldm_5_0= ruleLogicalDataModel ) )
            	    {
            	    // InternalUddl.g:562:4: ( (lv_ldm_5_0= ruleLogicalDataModel ) )
            	    // InternalUddl.g:563:5: (lv_ldm_5_0= ruleLogicalDataModel )
            	    {
            	    // InternalUddl.g:563:5: (lv_ldm_5_0= ruleLogicalDataModel )
            	    // InternalUddl.g:564:6: lv_ldm_5_0= ruleLogicalDataModel
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalDataModelAccess().getLdmLogicalDataModelParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_ldm_5_0=ruleLogicalDataModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ldm",
            	    							lv_ldm_5_0,
            	    							"com.epistimis.uddl.Uddl.LogicalDataModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalDataModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLogicalDataModel"


    // $ANTLR start "entryRulePlatformDataModel"
    // InternalUddl.g:590:1: entryRulePlatformDataModel returns [EObject current=null] : iv_rulePlatformDataModel= rulePlatformDataModel EOF ;
    public final EObject entryRulePlatformDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformDataModel = null;


        try {
            // InternalUddl.g:590:58: (iv_rulePlatformDataModel= rulePlatformDataModel EOF )
            // InternalUddl.g:591:2: iv_rulePlatformDataModel= rulePlatformDataModel EOF
            {
             newCompositeNode(grammarAccess.getPlatformDataModelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformDataModel=rulePlatformDataModel();

            state._fsp--;

             current =iv_rulePlatformDataModel; 
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
    // $ANTLR end "entryRulePlatformDataModel"


    // $ANTLR start "rulePlatformDataModel"
    // InternalUddl.g:597:1: rulePlatformDataModel returns [EObject current=null] : (otherlv_0= 'pdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= rulePlatformElement ) ) | ( (lv_pdm_5_0= rulePlatformDataModel ) ) )* otherlv_6= '}' ) ;
    public final EObject rulePlatformDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_element_4_0 = null;

        EObject lv_pdm_5_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:603:2: ( (otherlv_0= 'pdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= rulePlatformElement ) ) | ( (lv_pdm_5_0= rulePlatformDataModel ) ) )* otherlv_6= '}' ) )
            // InternalUddl.g:604:2: (otherlv_0= 'pdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= rulePlatformElement ) ) | ( (lv_pdm_5_0= rulePlatformDataModel ) ) )* otherlv_6= '}' )
            {
            // InternalUddl.g:604:2: (otherlv_0= 'pdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= rulePlatformElement ) ) | ( (lv_pdm_5_0= rulePlatformDataModel ) ) )* otherlv_6= '}' )
            // InternalUddl.g:605:3: otherlv_0= 'pdm' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( (lv_element_4_0= rulePlatformElement ) ) | ( (lv_pdm_5_0= rulePlatformDataModel ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformDataModelAccess().getPdmKeyword_0());
            		
            // InternalUddl.g:609:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:610:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:610:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:611:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformDataModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformDataModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:627:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUddl.g:628:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:628:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:629:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformDataModelAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformDataModelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformDataModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:649:3: ( ( (lv_element_4_0= rulePlatformElement ) ) | ( (lv_pdm_5_0= rulePlatformDataModel ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==55||LA11_0==60||(LA11_0>=104 && LA11_0<=122)||(LA11_0>=124 && LA11_0<=126)) ) {
                    alt11=1;
                }
                else if ( (LA11_0==25) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUddl.g:650:4: ( (lv_element_4_0= rulePlatformElement ) )
            	    {
            	    // InternalUddl.g:650:4: ( (lv_element_4_0= rulePlatformElement ) )
            	    // InternalUddl.g:651:5: (lv_element_4_0= rulePlatformElement )
            	    {
            	    // InternalUddl.g:651:5: (lv_element_4_0= rulePlatformElement )
            	    // InternalUddl.g:652:6: lv_element_4_0= rulePlatformElement
            	    {

            	    						newCompositeNode(grammarAccess.getPlatformDataModelAccess().getElementPlatformElementParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_element_4_0=rulePlatformElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlatformDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"element",
            	    							lv_element_4_0,
            	    							"com.epistimis.uddl.Uddl.PlatformElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUddl.g:670:4: ( (lv_pdm_5_0= rulePlatformDataModel ) )
            	    {
            	    // InternalUddl.g:670:4: ( (lv_pdm_5_0= rulePlatformDataModel ) )
            	    // InternalUddl.g:671:5: (lv_pdm_5_0= rulePlatformDataModel )
            	    {
            	    // InternalUddl.g:671:5: (lv_pdm_5_0= rulePlatformDataModel )
            	    // InternalUddl.g:672:6: lv_pdm_5_0= rulePlatformDataModel
            	    {

            	    						newCompositeNode(grammarAccess.getPlatformDataModelAccess().getPdmPlatformDataModelParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_pdm_5_0=rulePlatformDataModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlatformDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pdm",
            	    							lv_pdm_5_0,
            	    							"com.epistimis.uddl.Uddl.PlatformDataModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPlatformDataModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePlatformDataModel"


    // $ANTLR start "entryRuleConceptualElement"
    // InternalUddl.g:698:1: entryRuleConceptualElement returns [EObject current=null] : iv_ruleConceptualElement= ruleConceptualElement EOF ;
    public final EObject entryRuleConceptualElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualElement = null;


        try {
            // InternalUddl.g:698:58: (iv_ruleConceptualElement= ruleConceptualElement EOF )
            // InternalUddl.g:699:2: iv_ruleConceptualElement= ruleConceptualElement EOF
            {
             newCompositeNode(grammarAccess.getConceptualElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualElement=ruleConceptualElement();

            state._fsp--;

             current =iv_ruleConceptualElement; 
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
    // $ANTLR end "entryRuleConceptualElement"


    // $ANTLR start "ruleConceptualElement"
    // InternalUddl.g:705:1: ruleConceptualElement returns [EObject current=null] : (this_ConceptualDomain_0= ruleConceptualDomain | this_ConceptualBasisEntity_1= ruleConceptualBasisEntity | this_ConceptualComposableElement_2= ruleConceptualComposableElement | this_ConceptualView_3= ruleConceptualView ) ;
    public final EObject ruleConceptualElement() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptualDomain_0 = null;

        EObject this_ConceptualBasisEntity_1 = null;

        EObject this_ConceptualComposableElement_2 = null;

        EObject this_ConceptualView_3 = null;



        	enterRule();

        try {
            // InternalUddl.g:711:2: ( (this_ConceptualDomain_0= ruleConceptualDomain | this_ConceptualBasisEntity_1= ruleConceptualBasisEntity | this_ConceptualComposableElement_2= ruleConceptualComposableElement | this_ConceptualView_3= ruleConceptualView ) )
            // InternalUddl.g:712:2: (this_ConceptualDomain_0= ruleConceptualDomain | this_ConceptualBasisEntity_1= ruleConceptualBasisEntity | this_ConceptualComposableElement_2= ruleConceptualComposableElement | this_ConceptualView_3= ruleConceptualView )
            {
            // InternalUddl.g:712:2: (this_ConceptualDomain_0= ruleConceptualDomain | this_ConceptualBasisEntity_1= ruleConceptualBasisEntity | this_ConceptualComposableElement_2= ruleConceptualComposableElement | this_ConceptualView_3= ruleConceptualView )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 30:
            case 31:
            case 35:
                {
                alt12=3;
                }
                break;
            case 41:
            case 43:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUddl.g:713:3: this_ConceptualDomain_0= ruleConceptualDomain
                    {

                    			newCompositeNode(grammarAccess.getConceptualElementAccess().getConceptualDomainParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualDomain_0=ruleConceptualDomain();

                    state._fsp--;


                    			current = this_ConceptualDomain_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:722:3: this_ConceptualBasisEntity_1= ruleConceptualBasisEntity
                    {

                    			newCompositeNode(grammarAccess.getConceptualElementAccess().getConceptualBasisEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualBasisEntity_1=ruleConceptualBasisEntity();

                    state._fsp--;


                    			current = this_ConceptualBasisEntity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:731:3: this_ConceptualComposableElement_2= ruleConceptualComposableElement
                    {

                    			newCompositeNode(grammarAccess.getConceptualElementAccess().getConceptualComposableElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualComposableElement_2=ruleConceptualComposableElement();

                    state._fsp--;


                    			current = this_ConceptualComposableElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:740:3: this_ConceptualView_3= ruleConceptualView
                    {

                    			newCompositeNode(grammarAccess.getConceptualElementAccess().getConceptualViewParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualView_3=ruleConceptualView();

                    state._fsp--;


                    			current = this_ConceptualView_3;
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
    // $ANTLR end "ruleConceptualElement"


    // $ANTLR start "entryRuleConceptualComposableElement"
    // InternalUddl.g:752:1: entryRuleConceptualComposableElement returns [EObject current=null] : iv_ruleConceptualComposableElement= ruleConceptualComposableElement EOF ;
    public final EObject entryRuleConceptualComposableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualComposableElement = null;


        try {
            // InternalUddl.g:752:68: (iv_ruleConceptualComposableElement= ruleConceptualComposableElement EOF )
            // InternalUddl.g:753:2: iv_ruleConceptualComposableElement= ruleConceptualComposableElement EOF
            {
             newCompositeNode(grammarAccess.getConceptualComposableElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualComposableElement=ruleConceptualComposableElement();

            state._fsp--;

             current =iv_ruleConceptualComposableElement; 
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
    // $ANTLR end "entryRuleConceptualComposableElement"


    // $ANTLR start "ruleConceptualComposableElement"
    // InternalUddl.g:759:1: ruleConceptualComposableElement returns [EObject current=null] : (this_ConceptualEntity_0= ruleConceptualEntity | this_ConceptualObservable_1= ruleConceptualObservable ) ;
    public final EObject ruleConceptualComposableElement() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptualEntity_0 = null;

        EObject this_ConceptualObservable_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:765:2: ( (this_ConceptualEntity_0= ruleConceptualEntity | this_ConceptualObservable_1= ruleConceptualObservable ) )
            // InternalUddl.g:766:2: (this_ConceptualEntity_0= ruleConceptualEntity | this_ConceptualObservable_1= ruleConceptualObservable )
            {
            // InternalUddl.g:766:2: (this_ConceptualEntity_0= ruleConceptualEntity | this_ConceptualObservable_1= ruleConceptualObservable )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31||LA13_0==35) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalUddl.g:767:3: this_ConceptualEntity_0= ruleConceptualEntity
                    {

                    			newCompositeNode(grammarAccess.getConceptualComposableElementAccess().getConceptualEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualEntity_0=ruleConceptualEntity();

                    state._fsp--;


                    			current = this_ConceptualEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:776:3: this_ConceptualObservable_1= ruleConceptualObservable
                    {

                    			newCompositeNode(grammarAccess.getConceptualComposableElementAccess().getConceptualObservableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualObservable_1=ruleConceptualObservable();

                    state._fsp--;


                    			current = this_ConceptualObservable_1;
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
    // $ANTLR end "ruleConceptualComposableElement"


    // $ANTLR start "entryRuleConceptualBasisEntity"
    // InternalUddl.g:788:1: entryRuleConceptualBasisEntity returns [EObject current=null] : iv_ruleConceptualBasisEntity= ruleConceptualBasisEntity EOF ;
    public final EObject entryRuleConceptualBasisEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualBasisEntity = null;


        try {
            // InternalUddl.g:788:62: (iv_ruleConceptualBasisEntity= ruleConceptualBasisEntity EOF )
            // InternalUddl.g:789:2: iv_ruleConceptualBasisEntity= ruleConceptualBasisEntity EOF
            {
             newCompositeNode(grammarAccess.getConceptualBasisEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualBasisEntity=ruleConceptualBasisEntity();

            state._fsp--;

             current =iv_ruleConceptualBasisEntity; 
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
    // $ANTLR end "entryRuleConceptualBasisEntity"


    // $ANTLR start "ruleConceptualBasisEntity"
    // InternalUddl.g:795:1: ruleConceptualBasisEntity returns [EObject current=null] : (otherlv_0= 'basis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleConceptualBasisEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:801:2: ( (otherlv_0= 'basis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:802:2: (otherlv_0= 'basis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:802:2: (otherlv_0= 'basis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:803:3: otherlv_0= 'basis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualBasisEntityAccess().getBasisKeyword_0());
            		
            // InternalUddl.g:807:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:808:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:808:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:809:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptualBasisEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualBasisEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:825:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUddl.g:826:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:826:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:827:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConceptualBasisEntityAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualBasisEntityRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConceptualBasisEntityAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleConceptualBasisEntity"


    // $ANTLR start "entryRuleConceptualDomain"
    // InternalUddl.g:851:1: entryRuleConceptualDomain returns [EObject current=null] : iv_ruleConceptualDomain= ruleConceptualDomain EOF ;
    public final EObject entryRuleConceptualDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualDomain = null;


        try {
            // InternalUddl.g:851:57: (iv_ruleConceptualDomain= ruleConceptualDomain EOF )
            // InternalUddl.g:852:2: iv_ruleConceptualDomain= ruleConceptualDomain EOF
            {
             newCompositeNode(grammarAccess.getConceptualDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualDomain=ruleConceptualDomain();

            state._fsp--;

             current =iv_ruleConceptualDomain; 
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
    // $ANTLR end "entryRuleConceptualDomain"


    // $ANTLR start "ruleConceptualDomain"
    // InternalUddl.g:858:1: ruleConceptualDomain returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '[' ( ( ruleQN ) )+ otherlv_5= ']' )? otherlv_6= ';' ) ;
    public final EObject ruleConceptualDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalUddl.g:864:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '[' ( ( ruleQN ) )+ otherlv_5= ']' )? otherlv_6= ';' ) )
            // InternalUddl.g:865:2: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '[' ( ( ruleQN ) )+ otherlv_5= ']' )? otherlv_6= ';' )
            {
            // InternalUddl.g:865:2: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '[' ( ( ruleQN ) )+ otherlv_5= ']' )? otherlv_6= ';' )
            // InternalUddl.g:866:3: otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '[' ( ( ruleQN ) )+ otherlv_5= ']' )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualDomainAccess().getDomainKeyword_0());
            		
            // InternalUddl.g:870:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:871:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:871:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:872:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptualDomainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:888:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUddl.g:889:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:889:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:890:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConceptualDomainAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualDomainRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:906:3: (otherlv_3= '[' ( ( ruleQN ) )+ otherlv_5= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUddl.g:907:4: otherlv_3= '[' ( ( ruleQN ) )+ otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getConceptualDomainAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalUddl.g:911:4: ( ( ruleQN ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalUddl.g:912:5: ( ruleQN )
                    	    {
                    	    // InternalUddl.g:912:5: ( ruleQN )
                    	    // InternalUddl.g:913:6: ruleQN
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getConceptualDomainRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getConceptualDomainAccess().getBasisEntityConceptualBasisEntityCrossReference_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    ruleQN();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    otherlv_5=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getConceptualDomainAccess().getRightSquareBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConceptualDomainAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleConceptualDomain"


    // $ANTLR start "entryRuleConceptualObservable"
    // InternalUddl.g:940:1: entryRuleConceptualObservable returns [EObject current=null] : iv_ruleConceptualObservable= ruleConceptualObservable EOF ;
    public final EObject entryRuleConceptualObservable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualObservable = null;


        try {
            // InternalUddl.g:940:61: (iv_ruleConceptualObservable= ruleConceptualObservable EOF )
            // InternalUddl.g:941:2: iv_ruleConceptualObservable= ruleConceptualObservable EOF
            {
             newCompositeNode(grammarAccess.getConceptualObservableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualObservable=ruleConceptualObservable();

            state._fsp--;

             current =iv_ruleConceptualObservable; 
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
    // $ANTLR end "entryRuleConceptualObservable"


    // $ANTLR start "ruleConceptualObservable"
    // InternalUddl.g:947:1: ruleConceptualObservable returns [EObject current=null] : (otherlv_0= 'observable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleConceptualObservable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:953:2: ( (otherlv_0= 'observable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:954:2: (otherlv_0= 'observable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:954:2: (otherlv_0= 'observable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:955:3: otherlv_0= 'observable' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualObservableAccess().getObservableKeyword_0());
            		
            // InternalUddl.g:959:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:960:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:960:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:961:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptualObservableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualObservableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:977:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUddl.g:978:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:978:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:979:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConceptualObservableAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualObservableRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConceptualObservableAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleConceptualObservable"


    // $ANTLR start "entryRuleConceptualEntity"
    // InternalUddl.g:1003:1: entryRuleConceptualEntity returns [EObject current=null] : iv_ruleConceptualEntity= ruleConceptualEntity EOF ;
    public final EObject entryRuleConceptualEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualEntity = null;


        try {
            // InternalUddl.g:1003:57: (iv_ruleConceptualEntity= ruleConceptualEntity EOF )
            // InternalUddl.g:1004:2: iv_ruleConceptualEntity= ruleConceptualEntity EOF
            {
             newCompositeNode(grammarAccess.getConceptualEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualEntity=ruleConceptualEntity();

            state._fsp--;

             current =iv_ruleConceptualEntity; 
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
    // $ANTLR end "entryRuleConceptualEntity"


    // $ANTLR start "ruleConceptualEntity"
    // InternalUddl.g:1010:1: ruleConceptualEntity returns [EObject current=null] : (this_ConceptualAssociation_0= ruleConceptualAssociation | (otherlv_1= 'centity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= ':' ( ( ruleQN ) ) )? otherlv_6= '{' ( (lv_composition_7_0= ruleConceptualComposition ) )* (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? otherlv_12= '};' ) ) ;
    public final EObject ruleConceptualEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject this_ConceptualAssociation_0 = null;

        EObject lv_composition_7_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:1016:2: ( (this_ConceptualAssociation_0= ruleConceptualAssociation | (otherlv_1= 'centity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= ':' ( ( ruleQN ) ) )? otherlv_6= '{' ( (lv_composition_7_0= ruleConceptualComposition ) )* (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? otherlv_12= '};' ) ) )
            // InternalUddl.g:1017:2: (this_ConceptualAssociation_0= ruleConceptualAssociation | (otherlv_1= 'centity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= ':' ( ( ruleQN ) ) )? otherlv_6= '{' ( (lv_composition_7_0= ruleConceptualComposition ) )* (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? otherlv_12= '};' ) )
            {
            // InternalUddl.g:1017:2: (this_ConceptualAssociation_0= ruleConceptualAssociation | (otherlv_1= 'centity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= ':' ( ( ruleQN ) ) )? otherlv_6= '{' ( (lv_composition_7_0= ruleConceptualComposition ) )* (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? otherlv_12= '};' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            else if ( (LA24_0==31) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalUddl.g:1018:3: this_ConceptualAssociation_0= ruleConceptualAssociation
                    {

                    			newCompositeNode(grammarAccess.getConceptualEntityAccess().getConceptualAssociationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualAssociation_0=ruleConceptualAssociation();

                    state._fsp--;


                    			current = this_ConceptualAssociation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:1027:3: (otherlv_1= 'centity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= ':' ( ( ruleQN ) ) )? otherlv_6= '{' ( (lv_composition_7_0= ruleConceptualComposition ) )* (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? otherlv_12= '};' )
                    {
                    // InternalUddl.g:1027:3: (otherlv_1= 'centity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= ':' ( ( ruleQN ) ) )? otherlv_6= '{' ( (lv_composition_7_0= ruleConceptualComposition ) )* (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? otherlv_12= '};' )
                    // InternalUddl.g:1028:4: otherlv_1= 'centity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= ':' ( ( ruleQN ) ) )? otherlv_6= '{' ( (lv_composition_7_0= ruleConceptualComposition ) )* (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? otherlv_12= '};'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getConceptualEntityAccess().getCentityKeyword_1_0());
                    			
                    // InternalUddl.g:1032:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalUddl.g:1033:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalUddl.g:1033:5: (lv_name_2_0= RULE_ID )
                    // InternalUddl.g:1034:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getConceptualEntityAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConceptualEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalUddl.g:1050:4: ( (lv_description_3_0= RULE_STRING ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_STRING) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalUddl.g:1051:5: (lv_description_3_0= RULE_STRING )
                            {
                            // InternalUddl.g:1051:5: (lv_description_3_0= RULE_STRING )
                            // InternalUddl.g:1052:6: lv_description_3_0= RULE_STRING
                            {
                            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                            						newLeafNode(lv_description_3_0, grammarAccess.getConceptualEntityAccess().getDescriptionSTRINGTerminalRuleCall_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConceptualEntityRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"description",
                            							lv_description_3_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }

                    // InternalUddl.g:1068:4: (otherlv_4= ':' ( ( ruleQN ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==32) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalUddl.g:1069:5: otherlv_4= ':' ( ( ruleQN ) )
                            {
                            otherlv_4=(Token)match(input,32,FOLLOW_4); 

                            					newLeafNode(otherlv_4, grammarAccess.getConceptualEntityAccess().getColonKeyword_1_3_0());
                            				
                            // InternalUddl.g:1073:5: ( ( ruleQN ) )
                            // InternalUddl.g:1074:6: ( ruleQN )
                            {
                            // InternalUddl.g:1074:6: ( ruleQN )
                            // InternalUddl.g:1075:7: ruleQN
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConceptualEntityRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConceptualEntityAccess().getSpecializesConceptualEntityCrossReference_1_3_1_0());
                            						
                            pushFollow(FOLLOW_6);
                            ruleQN();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getConceptualEntityAccess().getLeftCurlyBracketKeyword_1_4());
                    			
                    // InternalUddl.g:1094:4: ( (lv_composition_7_0= ruleConceptualComposition ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalUddl.g:1095:5: (lv_composition_7_0= ruleConceptualComposition )
                    	    {
                    	    // InternalUddl.g:1095:5: (lv_composition_7_0= ruleConceptualComposition )
                    	    // InternalUddl.g:1096:6: lv_composition_7_0= ruleConceptualComposition
                    	    {

                    	    						newCompositeNode(grammarAccess.getConceptualEntityAccess().getCompositionConceptualCompositionParserRuleCall_1_5_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_composition_7_0=ruleConceptualComposition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConceptualEntityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"composition",
                    	    							lv_composition_7_0,
                    	    							"com.epistimis.uddl.Uddl.ConceptualComposition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    // InternalUddl.g:1113:4: (otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==33) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalUddl.g:1114:5: otherlv_8= 'basis:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']'
                            {
                            otherlv_8=(Token)match(input,33,FOLLOW_21); 

                            					newLeafNode(otherlv_8, grammarAccess.getConceptualEntityAccess().getBasisKeyword_1_6_0());
                            				
                            otherlv_9=(Token)match(input,28,FOLLOW_4); 

                            					newLeafNode(otherlv_9, grammarAccess.getConceptualEntityAccess().getLeftSquareBracketKeyword_1_6_1());
                            				
                            // InternalUddl.g:1122:5: ( ( ruleQN ) )+
                            int cnt22=0;
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==RULE_ID) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalUddl.g:1123:6: ( ruleQN )
                            	    {
                            	    // InternalUddl.g:1123:6: ( ruleQN )
                            	    // InternalUddl.g:1124:7: ruleQN
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getConceptualEntityRule());
                            	    							}
                            	    						

                            	    							newCompositeNode(grammarAccess.getConceptualEntityAccess().getBasisEntityConceptualBasisEntityCrossReference_1_6_2_0());
                            	    						
                            	    pushFollow(FOLLOW_17);
                            	    ruleQN();

                            	    state._fsp--;


                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt22 >= 1 ) break loop22;
                                        EarlyExitException eee =
                                            new EarlyExitException(22, input);
                                        throw eee;
                                }
                                cnt22++;
                            } while (true);

                            otherlv_11=(Token)match(input,29,FOLLOW_22); 

                            					newLeafNode(otherlv_11, grammarAccess.getConceptualEntityAccess().getRightSquareBracketKeyword_1_6_3());
                            				

                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getConceptualEntityAccess().getRightCurlyBracketSemicolonKeyword_1_7());
                    			

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
    // $ANTLR end "ruleConceptualEntity"


    // $ANTLR start "entryRuleConceptualComposition"
    // InternalUddl.g:1152:1: entryRuleConceptualComposition returns [EObject current=null] : iv_ruleConceptualComposition= ruleConceptualComposition EOF ;
    public final EObject entryRuleConceptualComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualComposition = null;


        try {
            // InternalUddl.g:1152:62: (iv_ruleConceptualComposition= ruleConceptualComposition EOF )
            // InternalUddl.g:1153:2: iv_ruleConceptualComposition= ruleConceptualComposition EOF
            {
             newCompositeNode(grammarAccess.getConceptualCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualComposition=ruleConceptualComposition();

            state._fsp--;

             current =iv_ruleConceptualComposition; 
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
    // $ANTLR end "entryRuleConceptualComposition"


    // $ANTLR start "ruleConceptualComposition"
    // InternalUddl.g:1159:1: ruleConceptualComposition returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= ';' ) ;
    public final EObject ruleConceptualComposition() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_1=null;
        Token lv_upperBound_5_2=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalUddl.g:1165:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= ';' ) )
            // InternalUddl.g:1166:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= ';' )
            {
            // InternalUddl.g:1166:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= ';' )
            // InternalUddl.g:1167:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= ';'
            {
            // InternalUddl.g:1167:3: ( ( ruleQN ) )
            // InternalUddl.g:1168:4: ( ruleQN )
            {
            // InternalUddl.g:1168:4: ( ruleQN )
            // InternalUddl.g:1169:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptualCompositionAccess().getTypeConceptualComposableElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:1183:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:1184:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:1184:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:1185:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getConceptualCompositionAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:1201:3: (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )? otherlv_6= ']' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUddl.g:1202:4: otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )? otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getConceptualCompositionAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalUddl.g:1206:4: ( (lv_lowerBound_3_0= RULE_INT ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_INT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalUddl.g:1207:5: (lv_lowerBound_3_0= RULE_INT )
                            {
                            // InternalUddl.g:1207:5: (lv_lowerBound_3_0= RULE_INT )
                            // InternalUddl.g:1208:6: lv_lowerBound_3_0= RULE_INT
                            {
                            lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                            						newLeafNode(lv_lowerBound_3_0, grammarAccess.getConceptualCompositionAccess().getLowerBoundINTTerminalRuleCall_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConceptualCompositionRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"lowerBound",
                            							lv_lowerBound_3_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getConceptualCompositionAccess().getColonKeyword_2_2());
                    			
                    // InternalUddl.g:1228:4: ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=RULE_INT && LA27_0<=RULE_SIGNED_INT)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalUddl.g:1229:5: ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) )
                            {
                            // InternalUddl.g:1229:5: ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) )
                            // InternalUddl.g:1230:6: (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT )
                            {
                            // InternalUddl.g:1230:6: (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT )
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==RULE_INT) ) {
                                alt26=1;
                            }
                            else if ( (LA26_0==RULE_SIGNED_INT) ) {
                                alt26=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 26, 0, input);

                                throw nvae;
                            }
                            switch (alt26) {
                                case 1 :
                                    // InternalUddl.g:1231:7: lv_upperBound_5_1= RULE_INT
                                    {
                                    lv_upperBound_5_1=(Token)match(input,RULE_INT,FOLLOW_27); 

                                    							newLeafNode(lv_upperBound_5_1, grammarAccess.getConceptualCompositionAccess().getUpperBoundINTTerminalRuleCall_2_3_0_0());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getConceptualCompositionRule());
                                    							}
                                    							setWithLastConsumed(
                                    								current,
                                    								"upperBound",
                                    								lv_upperBound_5_1,
                                    								"org.eclipse.xtext.common.Terminals.INT");
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalUddl.g:1246:7: lv_upperBound_5_2= RULE_SIGNED_INT
                                    {
                                    lv_upperBound_5_2=(Token)match(input,RULE_SIGNED_INT,FOLLOW_27); 

                                    							newLeafNode(lv_upperBound_5_2, grammarAccess.getConceptualCompositionAccess().getUpperBoundSIGNED_INTTerminalRuleCall_2_3_0_1());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getConceptualCompositionRule());
                                    							}
                                    							setWithLastConsumed(
                                    								current,
                                    								"upperBound",
                                    								lv_upperBound_5_2,
                                    								"com.epistimis.uddl.Uddl.SIGNED_INT");
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getConceptualCompositionAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalUddl.g:1268:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUddl.g:1269:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:1269:4: (lv_description_7_0= RULE_STRING )
                    // InternalUddl.g:1270:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getConceptualCompositionAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualCompositionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:1286:3: (otherlv_8= ':' ( ( ruleQN ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUddl.g:1287:4: otherlv_8= ':' ( ( ruleQN ) )
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getConceptualCompositionAccess().getColonKeyword_4_0());
                    			
                    // InternalUddl.g:1291:4: ( ( ruleQN ) )
                    // InternalUddl.g:1292:5: ( ruleQN )
                    {
                    // InternalUddl.g:1292:5: ( ruleQN )
                    // InternalUddl.g:1293:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConceptualCompositionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConceptualCompositionAccess().getSpecializesConceptualCharacteristicCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getConceptualCompositionAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleConceptualComposition"


    // $ANTLR start "entryRuleConceptualAssociation"
    // InternalUddl.g:1316:1: entryRuleConceptualAssociation returns [EObject current=null] : iv_ruleConceptualAssociation= ruleConceptualAssociation EOF ;
    public final EObject entryRuleConceptualAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualAssociation = null;


        try {
            // InternalUddl.g:1316:62: (iv_ruleConceptualAssociation= ruleConceptualAssociation EOF )
            // InternalUddl.g:1317:2: iv_ruleConceptualAssociation= ruleConceptualAssociation EOF
            {
             newCompositeNode(grammarAccess.getConceptualAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualAssociation=ruleConceptualAssociation();

            state._fsp--;

             current =iv_ruleConceptualAssociation; 
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
    // $ANTLR end "entryRuleConceptualAssociation"


    // $ANTLR start "ruleConceptualAssociation"
    // InternalUddl.g:1323:1: ruleConceptualAssociation returns [EObject current=null] : (otherlv_0= 'cassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_composition_6_0= ruleConceptualComposition ) )* (otherlv_7= 'basis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? (otherlv_11= 'participants:' otherlv_12= '[' ( (lv_participant_13_0= ruleConceptualParticipant ) )+ otherlv_14= ']' )? otherlv_15= '};' ) ;
    public final EObject ruleConceptualAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_composition_6_0 = null;

        EObject lv_participant_13_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:1329:2: ( (otherlv_0= 'cassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_composition_6_0= ruleConceptualComposition ) )* (otherlv_7= 'basis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? (otherlv_11= 'participants:' otherlv_12= '[' ( (lv_participant_13_0= ruleConceptualParticipant ) )+ otherlv_14= ']' )? otherlv_15= '};' ) )
            // InternalUddl.g:1330:2: (otherlv_0= 'cassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_composition_6_0= ruleConceptualComposition ) )* (otherlv_7= 'basis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? (otherlv_11= 'participants:' otherlv_12= '[' ( (lv_participant_13_0= ruleConceptualParticipant ) )+ otherlv_14= ']' )? otherlv_15= '};' )
            {
            // InternalUddl.g:1330:2: (otherlv_0= 'cassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_composition_6_0= ruleConceptualComposition ) )* (otherlv_7= 'basis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? (otherlv_11= 'participants:' otherlv_12= '[' ( (lv_participant_13_0= ruleConceptualParticipant ) )+ otherlv_14= ']' )? otherlv_15= '};' )
            // InternalUddl.g:1331:3: otherlv_0= 'cassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_composition_6_0= ruleConceptualComposition ) )* (otherlv_7= 'basis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? (otherlv_11= 'participants:' otherlv_12= '[' ( (lv_participant_13_0= ruleConceptualParticipant ) )+ otherlv_14= ']' )? otherlv_15= '};'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualAssociationAccess().getCassocKeyword_0());
            		
            // InternalUddl.g:1335:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:1336:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:1336:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:1337:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptualAssociationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualAssociationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:1353:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUddl.g:1354:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:1354:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:1355:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConceptualAssociationAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualAssociationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:1371:3: (otherlv_3= ':' ( ( ruleQN ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUddl.g:1372:4: otherlv_3= ':' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getConceptualAssociationAccess().getColonKeyword_3_0());
                    			
                    // InternalUddl.g:1376:4: ( ( ruleQN ) )
                    // InternalUddl.g:1377:5: ( ruleQN )
                    {
                    // InternalUddl.g:1377:5: ( ruleQN )
                    // InternalUddl.g:1378:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConceptualAssociationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConceptualAssociationAccess().getSpecializesConceptualEntityCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getConceptualAssociationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUddl.g:1397:3: ( (lv_composition_6_0= ruleConceptualComposition ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalUddl.g:1398:4: (lv_composition_6_0= ruleConceptualComposition )
            	    {
            	    // InternalUddl.g:1398:4: (lv_composition_6_0= ruleConceptualComposition )
            	    // InternalUddl.g:1399:5: lv_composition_6_0= ruleConceptualComposition
            	    {

            	    					newCompositeNode(grammarAccess.getConceptualAssociationAccess().getCompositionConceptualCompositionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_composition_6_0=ruleConceptualComposition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConceptualAssociationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"composition",
            	    						lv_composition_6_0,
            	    						"com.epistimis.uddl.Uddl.ConceptualComposition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalUddl.g:1416:3: (otherlv_7= 'basis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUddl.g:1417:4: otherlv_7= 'basis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']'
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getConceptualAssociationAccess().getBasisKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getConceptualAssociationAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalUddl.g:1425:4: ( ( ruleQN ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ID) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalUddl.g:1426:5: ( ruleQN )
                    	    {
                    	    // InternalUddl.g:1426:5: ( ruleQN )
                    	    // InternalUddl.g:1427:6: ruleQN
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getConceptualAssociationRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getConceptualAssociationAccess().getBasisEntityConceptualBasisEntityCrossReference_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    ruleQN();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    otherlv_10=(Token)match(input,29,FOLLOW_31); 

                    				newLeafNode(otherlv_10, grammarAccess.getConceptualAssociationAccess().getRightSquareBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalUddl.g:1446:3: (otherlv_11= 'participants:' otherlv_12= '[' ( (lv_participant_13_0= ruleConceptualParticipant ) )+ otherlv_14= ']' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUddl.g:1447:4: otherlv_11= 'participants:' otherlv_12= '[' ( (lv_participant_13_0= ruleConceptualParticipant ) )+ otherlv_14= ']'
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getConceptualAssociationAccess().getParticipantsKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getConceptualAssociationAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalUddl.g:1455:4: ( (lv_participant_13_0= ruleConceptualParticipant ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_ID) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalUddl.g:1456:5: (lv_participant_13_0= ruleConceptualParticipant )
                    	    {
                    	    // InternalUddl.g:1456:5: (lv_participant_13_0= ruleConceptualParticipant )
                    	    // InternalUddl.g:1457:6: lv_participant_13_0= ruleConceptualParticipant
                    	    {

                    	    						newCompositeNode(grammarAccess.getConceptualAssociationAccess().getParticipantConceptualParticipantParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_participant_13_0=ruleConceptualParticipant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConceptualAssociationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"participant",
                    	    							lv_participant_13_0,
                    	    							"com.epistimis.uddl.Uddl.ConceptualParticipant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    otherlv_14=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getConceptualAssociationAccess().getRightSquareBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getConceptualAssociationAccess().getRightCurlyBracketSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleConceptualAssociation"


    // $ANTLR start "entryRuleConceptualParticipant"
    // InternalUddl.g:1487:1: entryRuleConceptualParticipant returns [EObject current=null] : iv_ruleConceptualParticipant= ruleConceptualParticipant EOF ;
    public final EObject entryRuleConceptualParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualParticipant = null;


        try {
            // InternalUddl.g:1487:62: (iv_ruleConceptualParticipant= ruleConceptualParticipant EOF )
            // InternalUddl.g:1488:2: iv_ruleConceptualParticipant= ruleConceptualParticipant EOF
            {
             newCompositeNode(grammarAccess.getConceptualParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualParticipant=ruleConceptualParticipant();

            state._fsp--;

             current =iv_ruleConceptualParticipant; 
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
    // $ANTLR end "entryRuleConceptualParticipant"


    // $ANTLR start "ruleConceptualParticipant"
    // InternalUddl.g:1494:1: ruleConceptualParticipant returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '{' otherlv_11= 'src:' otherlv_12= '[' ( (lv_sourceLowerBound_13_0= RULE_INT ) ) otherlv_14= ':' ( ( (lv_sourceUpperBound_15_1= RULE_INT | lv_sourceUpperBound_15_2= RULE_SIGNED_INT ) ) ) otherlv_16= ']' (otherlv_17= 'path:' ( (lv_path_18_0= ruleConceptualPathNode ) ) )? otherlv_19= '}' otherlv_20= ';' ) ;
    public final EObject ruleConceptualParticipant() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_1=null;
        Token lv_upperBound_5_2=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_sourceLowerBound_13_0=null;
        Token otherlv_14=null;
        Token lv_sourceUpperBound_15_1=null;
        Token lv_sourceUpperBound_15_2=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_path_18_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:1500:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '{' otherlv_11= 'src:' otherlv_12= '[' ( (lv_sourceLowerBound_13_0= RULE_INT ) ) otherlv_14= ':' ( ( (lv_sourceUpperBound_15_1= RULE_INT | lv_sourceUpperBound_15_2= RULE_SIGNED_INT ) ) ) otherlv_16= ']' (otherlv_17= 'path:' ( (lv_path_18_0= ruleConceptualPathNode ) ) )? otherlv_19= '}' otherlv_20= ';' ) )
            // InternalUddl.g:1501:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '{' otherlv_11= 'src:' otherlv_12= '[' ( (lv_sourceLowerBound_13_0= RULE_INT ) ) otherlv_14= ':' ( ( (lv_sourceUpperBound_15_1= RULE_INT | lv_sourceUpperBound_15_2= RULE_SIGNED_INT ) ) ) otherlv_16= ']' (otherlv_17= 'path:' ( (lv_path_18_0= ruleConceptualPathNode ) ) )? otherlv_19= '}' otherlv_20= ';' )
            {
            // InternalUddl.g:1501:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '{' otherlv_11= 'src:' otherlv_12= '[' ( (lv_sourceLowerBound_13_0= RULE_INT ) ) otherlv_14= ':' ( ( (lv_sourceUpperBound_15_1= RULE_INT | lv_sourceUpperBound_15_2= RULE_SIGNED_INT ) ) ) otherlv_16= ']' (otherlv_17= 'path:' ( (lv_path_18_0= ruleConceptualPathNode ) ) )? otherlv_19= '}' otherlv_20= ';' )
            // InternalUddl.g:1502:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )? otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '{' otherlv_11= 'src:' otherlv_12= '[' ( (lv_sourceLowerBound_13_0= RULE_INT ) ) otherlv_14= ':' ( ( (lv_sourceUpperBound_15_1= RULE_INT | lv_sourceUpperBound_15_2= RULE_SIGNED_INT ) ) ) otherlv_16= ']' (otherlv_17= 'path:' ( (lv_path_18_0= ruleConceptualPathNode ) ) )? otherlv_19= '}' otherlv_20= ';'
            {
            // InternalUddl.g:1502:3: ( ( ruleQN ) )
            // InternalUddl.g:1503:4: ( ruleQN )
            {
            // InternalUddl.g:1503:4: ( ruleQN )
            // InternalUddl.g:1504:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptualParticipantAccess().getTypeConceptualEntityCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:1518:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:1519:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:1519:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:1520:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getConceptualParticipantAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:1536:3: (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )? otherlv_6= ']' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==28) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUddl.g:1537:4: otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) )? otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )? otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getConceptualParticipantAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalUddl.g:1541:4: ( (lv_lowerBound_3_0= RULE_INT ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_INT) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalUddl.g:1542:5: (lv_lowerBound_3_0= RULE_INT )
                            {
                            // InternalUddl.g:1542:5: (lv_lowerBound_3_0= RULE_INT )
                            // InternalUddl.g:1543:6: lv_lowerBound_3_0= RULE_INT
                            {
                            lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                            						newLeafNode(lv_lowerBound_3_0, grammarAccess.getConceptualParticipantAccess().getLowerBoundINTTerminalRuleCall_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConceptualParticipantRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"lowerBound",
                            							lv_lowerBound_3_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getConceptualParticipantAccess().getColonKeyword_2_2());
                    			
                    // InternalUddl.g:1563:4: ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=RULE_INT && LA40_0<=RULE_SIGNED_INT)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalUddl.g:1564:5: ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) )
                            {
                            // InternalUddl.g:1564:5: ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) )
                            // InternalUddl.g:1565:6: (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT )
                            {
                            // InternalUddl.g:1565:6: (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT )
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==RULE_INT) ) {
                                alt39=1;
                            }
                            else if ( (LA39_0==RULE_SIGNED_INT) ) {
                                alt39=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 39, 0, input);

                                throw nvae;
                            }
                            switch (alt39) {
                                case 1 :
                                    // InternalUddl.g:1566:7: lv_upperBound_5_1= RULE_INT
                                    {
                                    lv_upperBound_5_1=(Token)match(input,RULE_INT,FOLLOW_27); 

                                    							newLeafNode(lv_upperBound_5_1, grammarAccess.getConceptualParticipantAccess().getUpperBoundINTTerminalRuleCall_2_3_0_0());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getConceptualParticipantRule());
                                    							}
                                    							setWithLastConsumed(
                                    								current,
                                    								"upperBound",
                                    								lv_upperBound_5_1,
                                    								"org.eclipse.xtext.common.Terminals.INT");
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalUddl.g:1581:7: lv_upperBound_5_2= RULE_SIGNED_INT
                                    {
                                    lv_upperBound_5_2=(Token)match(input,RULE_SIGNED_INT,FOLLOW_27); 

                                    							newLeafNode(lv_upperBound_5_2, grammarAccess.getConceptualParticipantAccess().getUpperBoundSIGNED_INTTerminalRuleCall_2_3_0_1());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getConceptualParticipantRule());
                                    							}
                                    							setWithLastConsumed(
                                    								current,
                                    								"upperBound",
                                    								lv_upperBound_5_2,
                                    								"com.epistimis.uddl.Uddl.SIGNED_INT");
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getConceptualParticipantAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalUddl.g:1603:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUddl.g:1604:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:1604:4: (lv_description_7_0= RULE_STRING )
                    // InternalUddl.g:1605:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getConceptualParticipantAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualParticipantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:1621:3: (otherlv_8= ':' ( ( ruleQN ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==32) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUddl.g:1622:4: otherlv_8= ':' ( ( ruleQN ) )
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getConceptualParticipantAccess().getColonKeyword_4_0());
                    			
                    // InternalUddl.g:1626:4: ( ( ruleQN ) )
                    // InternalUddl.g:1627:5: ( ruleQN )
                    {
                    // InternalUddl.g:1627:5: ( ruleQN )
                    // InternalUddl.g:1628:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConceptualParticipantRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConceptualParticipantAccess().getSpecializesConceptualCharacteristicCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_33); 

            			newLeafNode(otherlv_10, grammarAccess.getConceptualParticipantAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_11=(Token)match(input,37,FOLLOW_21); 

            			newLeafNode(otherlv_11, grammarAccess.getConceptualParticipantAccess().getSrcKeyword_6());
            		
            otherlv_12=(Token)match(input,28,FOLLOW_34); 

            			newLeafNode(otherlv_12, grammarAccess.getConceptualParticipantAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalUddl.g:1655:3: ( (lv_sourceLowerBound_13_0= RULE_INT ) )
            // InternalUddl.g:1656:4: (lv_sourceLowerBound_13_0= RULE_INT )
            {
            // InternalUddl.g:1656:4: (lv_sourceLowerBound_13_0= RULE_INT )
            // InternalUddl.g:1657:5: lv_sourceLowerBound_13_0= RULE_INT
            {
            lv_sourceLowerBound_13_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_sourceLowerBound_13_0, grammarAccess.getConceptualParticipantAccess().getSourceLowerBoundINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceLowerBound",
            						lv_sourceLowerBound_13_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_14=(Token)match(input,32,FOLLOW_35); 

            			newLeafNode(otherlv_14, grammarAccess.getConceptualParticipantAccess().getColonKeyword_9());
            		
            // InternalUddl.g:1677:3: ( ( (lv_sourceUpperBound_15_1= RULE_INT | lv_sourceUpperBound_15_2= RULE_SIGNED_INT ) ) )
            // InternalUddl.g:1678:4: ( (lv_sourceUpperBound_15_1= RULE_INT | lv_sourceUpperBound_15_2= RULE_SIGNED_INT ) )
            {
            // InternalUddl.g:1678:4: ( (lv_sourceUpperBound_15_1= RULE_INT | lv_sourceUpperBound_15_2= RULE_SIGNED_INT ) )
            // InternalUddl.g:1679:5: (lv_sourceUpperBound_15_1= RULE_INT | lv_sourceUpperBound_15_2= RULE_SIGNED_INT )
            {
            // InternalUddl.g:1679:5: (lv_sourceUpperBound_15_1= RULE_INT | lv_sourceUpperBound_15_2= RULE_SIGNED_INT )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_SIGNED_INT) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalUddl.g:1680:6: lv_sourceUpperBound_15_1= RULE_INT
                    {
                    lv_sourceUpperBound_15_1=(Token)match(input,RULE_INT,FOLLOW_27); 

                    						newLeafNode(lv_sourceUpperBound_15_1, grammarAccess.getConceptualParticipantAccess().getSourceUpperBoundINTTerminalRuleCall_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConceptualParticipantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sourceUpperBound",
                    							lv_sourceUpperBound_15_1,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }
                    break;
                case 2 :
                    // InternalUddl.g:1695:6: lv_sourceUpperBound_15_2= RULE_SIGNED_INT
                    {
                    lv_sourceUpperBound_15_2=(Token)match(input,RULE_SIGNED_INT,FOLLOW_27); 

                    						newLeafNode(lv_sourceUpperBound_15_2, grammarAccess.getConceptualParticipantAccess().getSourceUpperBoundSIGNED_INTTerminalRuleCall_10_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConceptualParticipantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sourceUpperBound",
                    							lv_sourceUpperBound_15_2,
                    							"com.epistimis.uddl.Uddl.SIGNED_INT");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_16=(Token)match(input,29,FOLLOW_36); 

            			newLeafNode(otherlv_16, grammarAccess.getConceptualParticipantAccess().getRightSquareBracketKeyword_11());
            		
            // InternalUddl.g:1716:3: (otherlv_17= 'path:' ( (lv_path_18_0= ruleConceptualPathNode ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUddl.g:1717:4: otherlv_17= 'path:' ( (lv_path_18_0= ruleConceptualPathNode ) )
                    {
                    otherlv_17=(Token)match(input,38,FOLLOW_37); 

                    				newLeafNode(otherlv_17, grammarAccess.getConceptualParticipantAccess().getPathKeyword_12_0());
                    			
                    // InternalUddl.g:1721:4: ( (lv_path_18_0= ruleConceptualPathNode ) )
                    // InternalUddl.g:1722:5: (lv_path_18_0= ruleConceptualPathNode )
                    {
                    // InternalUddl.g:1722:5: (lv_path_18_0= ruleConceptualPathNode )
                    // InternalUddl.g:1723:6: lv_path_18_0= ruleConceptualPathNode
                    {

                    						newCompositeNode(grammarAccess.getConceptualParticipantAccess().getPathConceptualPathNodeParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_path_18_0=ruleConceptualPathNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConceptualParticipantRule());
                    						}
                    						set(
                    							current,
                    							"path",
                    							lv_path_18_0,
                    							"com.epistimis.uddl.Uddl.ConceptualPathNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_19, grammarAccess.getConceptualParticipantAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_20=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getConceptualParticipantAccess().getSemicolonKeyword_14());
            		

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
    // $ANTLR end "ruleConceptualParticipant"


    // $ANTLR start "entryRuleConceptualPathNode"
    // InternalUddl.g:1753:1: entryRuleConceptualPathNode returns [EObject current=null] : iv_ruleConceptualPathNode= ruleConceptualPathNode EOF ;
    public final EObject entryRuleConceptualPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualPathNode = null;


        try {
            // InternalUddl.g:1753:59: (iv_ruleConceptualPathNode= ruleConceptualPathNode EOF )
            // InternalUddl.g:1754:2: iv_ruleConceptualPathNode= ruleConceptualPathNode EOF
            {
             newCompositeNode(grammarAccess.getConceptualPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualPathNode=ruleConceptualPathNode();

            state._fsp--;

             current =iv_ruleConceptualPathNode; 
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
    // $ANTLR end "entryRuleConceptualPathNode"


    // $ANTLR start "ruleConceptualPathNode"
    // InternalUddl.g:1760:1: ruleConceptualPathNode returns [EObject current=null] : (this_ConceptualParticipantPathNode_0= ruleConceptualParticipantPathNode | this_ConceptualCharacteristicPathNode_1= ruleConceptualCharacteristicPathNode ) ;
    public final EObject ruleConceptualPathNode() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptualParticipantPathNode_0 = null;

        EObject this_ConceptualCharacteristicPathNode_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:1766:2: ( (this_ConceptualParticipantPathNode_0= ruleConceptualParticipantPathNode | this_ConceptualCharacteristicPathNode_1= ruleConceptualCharacteristicPathNode ) )
            // InternalUddl.g:1767:2: (this_ConceptualParticipantPathNode_0= ruleConceptualParticipantPathNode | this_ConceptualCharacteristicPathNode_1= ruleConceptualCharacteristicPathNode )
            {
            // InternalUddl.g:1767:2: (this_ConceptualParticipantPathNode_0= ruleConceptualParticipantPathNode | this_ConceptualCharacteristicPathNode_1= ruleConceptualCharacteristicPathNode )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==39) ) {
                alt46=1;
            }
            else if ( (LA46_0==40) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalUddl.g:1768:3: this_ConceptualParticipantPathNode_0= ruleConceptualParticipantPathNode
                    {

                    			newCompositeNode(grammarAccess.getConceptualPathNodeAccess().getConceptualParticipantPathNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualParticipantPathNode_0=ruleConceptualParticipantPathNode();

                    state._fsp--;


                    			current = this_ConceptualParticipantPathNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:1777:3: this_ConceptualCharacteristicPathNode_1= ruleConceptualCharacteristicPathNode
                    {

                    			newCompositeNode(grammarAccess.getConceptualPathNodeAccess().getConceptualCharacteristicPathNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualCharacteristicPathNode_1=ruleConceptualCharacteristicPathNode();

                    state._fsp--;


                    			current = this_ConceptualCharacteristicPathNode_1;
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
    // $ANTLR end "ruleConceptualPathNode"


    // $ANTLR start "entryRuleConceptualParticipantPathNode"
    // InternalUddl.g:1789:1: entryRuleConceptualParticipantPathNode returns [EObject current=null] : iv_ruleConceptualParticipantPathNode= ruleConceptualParticipantPathNode EOF ;
    public final EObject entryRuleConceptualParticipantPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualParticipantPathNode = null;


        try {
            // InternalUddl.g:1789:70: (iv_ruleConceptualParticipantPathNode= ruleConceptualParticipantPathNode EOF )
            // InternalUddl.g:1790:2: iv_ruleConceptualParticipantPathNode= ruleConceptualParticipantPathNode EOF
            {
             newCompositeNode(grammarAccess.getConceptualParticipantPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualParticipantPathNode=ruleConceptualParticipantPathNode();

            state._fsp--;

             current =iv_ruleConceptualParticipantPathNode; 
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
    // $ANTLR end "entryRuleConceptualParticipantPathNode"


    // $ANTLR start "ruleConceptualParticipantPathNode"
    // InternalUddl.g:1796:1: ruleConceptualParticipantPathNode returns [EObject current=null] : (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? ) ;
    public final EObject ruleConceptualParticipantPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:1802:2: ( (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? ) )
            // InternalUddl.g:1803:2: (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? )
            {
            // InternalUddl.g:1803:2: (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? )
            // InternalUddl.g:1804:3: otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualParticipantPathNodeAccess().getSolidusKeyword_0());
            		
            // InternalUddl.g:1808:3: ( ( ruleQN ) )
            // InternalUddl.g:1809:4: ( ruleQN )
            {
            // InternalUddl.g:1809:4: ( ruleQN )
            // InternalUddl.g:1810:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualParticipantPathNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptualParticipantPathNodeAccess().getProjectedParticipantConceptualParticipantCrossReference_1_0());
            				
            pushFollow(FOLLOW_39);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:1824:3: ( (lv_node_2_0= ruleConceptualPathNode ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=39 && LA47_0<=40)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUddl.g:1825:4: (lv_node_2_0= ruleConceptualPathNode )
                    {
                    // InternalUddl.g:1825:4: (lv_node_2_0= ruleConceptualPathNode )
                    // InternalUddl.g:1826:5: lv_node_2_0= ruleConceptualPathNode
                    {

                    					newCompositeNode(grammarAccess.getConceptualParticipantPathNodeAccess().getNodeConceptualPathNodeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_node_2_0=ruleConceptualPathNode();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConceptualParticipantPathNodeRule());
                    					}
                    					set(
                    						current,
                    						"node",
                    						lv_node_2_0,
                    						"com.epistimis.uddl.Uddl.ConceptualPathNode");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleConceptualParticipantPathNode"


    // $ANTLR start "entryRuleConceptualCharacteristicPathNode"
    // InternalUddl.g:1847:1: entryRuleConceptualCharacteristicPathNode returns [EObject current=null] : iv_ruleConceptualCharacteristicPathNode= ruleConceptualCharacteristicPathNode EOF ;
    public final EObject entryRuleConceptualCharacteristicPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualCharacteristicPathNode = null;


        try {
            // InternalUddl.g:1847:73: (iv_ruleConceptualCharacteristicPathNode= ruleConceptualCharacteristicPathNode EOF )
            // InternalUddl.g:1848:2: iv_ruleConceptualCharacteristicPathNode= ruleConceptualCharacteristicPathNode EOF
            {
             newCompositeNode(grammarAccess.getConceptualCharacteristicPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualCharacteristicPathNode=ruleConceptualCharacteristicPathNode();

            state._fsp--;

             current =iv_ruleConceptualCharacteristicPathNode; 
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
    // $ANTLR end "entryRuleConceptualCharacteristicPathNode"


    // $ANTLR start "ruleConceptualCharacteristicPathNode"
    // InternalUddl.g:1854:1: ruleConceptualCharacteristicPathNode returns [EObject current=null] : (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? ) ;
    public final EObject ruleConceptualCharacteristicPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:1860:2: ( (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? ) )
            // InternalUddl.g:1861:2: (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? )
            {
            // InternalUddl.g:1861:2: (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )? )
            // InternalUddl.g:1862:3: otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleConceptualPathNode ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualCharacteristicPathNodeAccess().getNumberSignKeyword_0());
            		
            // InternalUddl.g:1866:3: ( ( ruleQN ) )
            // InternalUddl.g:1867:4: ( ruleQN )
            {
            // InternalUddl.g:1867:4: ( ruleQN )
            // InternalUddl.g:1868:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualCharacteristicPathNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptualCharacteristicPathNodeAccess().getProjectedCharacteristicConceptualCharacteristicCrossReference_1_0());
            				
            pushFollow(FOLLOW_39);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:1882:3: ( (lv_node_2_0= ruleConceptualPathNode ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=39 && LA48_0<=40)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUddl.g:1883:4: (lv_node_2_0= ruleConceptualPathNode )
                    {
                    // InternalUddl.g:1883:4: (lv_node_2_0= ruleConceptualPathNode )
                    // InternalUddl.g:1884:5: lv_node_2_0= ruleConceptualPathNode
                    {

                    					newCompositeNode(grammarAccess.getConceptualCharacteristicPathNodeAccess().getNodeConceptualPathNodeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_node_2_0=ruleConceptualPathNode();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConceptualCharacteristicPathNodeRule());
                    					}
                    					set(
                    						current,
                    						"node",
                    						lv_node_2_0,
                    						"com.epistimis.uddl.Uddl.ConceptualPathNode");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleConceptualCharacteristicPathNode"


    // $ANTLR start "entryRuleConceptualView"
    // InternalUddl.g:1905:1: entryRuleConceptualView returns [EObject current=null] : iv_ruleConceptualView= ruleConceptualView EOF ;
    public final EObject entryRuleConceptualView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualView = null;


        try {
            // InternalUddl.g:1905:55: (iv_ruleConceptualView= ruleConceptualView EOF )
            // InternalUddl.g:1906:2: iv_ruleConceptualView= ruleConceptualView EOF
            {
             newCompositeNode(grammarAccess.getConceptualViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualView=ruleConceptualView();

            state._fsp--;

             current =iv_ruleConceptualView; 
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
    // $ANTLR end "entryRuleConceptualView"


    // $ANTLR start "ruleConceptualView"
    // InternalUddl.g:1912:1: ruleConceptualView returns [EObject current=null] : (this_ConceptualQuery_0= ruleConceptualQuery | this_ConceptualCompositeQuery_1= ruleConceptualCompositeQuery ) ;
    public final EObject ruleConceptualView() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptualQuery_0 = null;

        EObject this_ConceptualCompositeQuery_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:1918:2: ( (this_ConceptualQuery_0= ruleConceptualQuery | this_ConceptualCompositeQuery_1= ruleConceptualCompositeQuery ) )
            // InternalUddl.g:1919:2: (this_ConceptualQuery_0= ruleConceptualQuery | this_ConceptualCompositeQuery_1= ruleConceptualCompositeQuery )
            {
            // InternalUddl.g:1919:2: (this_ConceptualQuery_0= ruleConceptualQuery | this_ConceptualCompositeQuery_1= ruleConceptualCompositeQuery )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==41) ) {
                alt49=1;
            }
            else if ( (LA49_0==43) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalUddl.g:1920:3: this_ConceptualQuery_0= ruleConceptualQuery
                    {

                    			newCompositeNode(grammarAccess.getConceptualViewAccess().getConceptualQueryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualQuery_0=ruleConceptualQuery();

                    state._fsp--;


                    			current = this_ConceptualQuery_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:1929:3: this_ConceptualCompositeQuery_1= ruleConceptualCompositeQuery
                    {

                    			newCompositeNode(grammarAccess.getConceptualViewAccess().getConceptualCompositeQueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptualCompositeQuery_1=ruleConceptualCompositeQuery();

                    state._fsp--;


                    			current = this_ConceptualCompositeQuery_1;
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
    // $ANTLR end "ruleConceptualView"


    // $ANTLR start "entryRuleConceptualQuery"
    // InternalUddl.g:1941:1: entryRuleConceptualQuery returns [EObject current=null] : iv_ruleConceptualQuery= ruleConceptualQuery EOF ;
    public final EObject entryRuleConceptualQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualQuery = null;


        try {
            // InternalUddl.g:1941:56: (iv_ruleConceptualQuery= ruleConceptualQuery EOF )
            // InternalUddl.g:1942:2: iv_ruleConceptualQuery= ruleConceptualQuery EOF
            {
             newCompositeNode(grammarAccess.getConceptualQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualQuery=ruleConceptualQuery();

            state._fsp--;

             current =iv_ruleConceptualQuery; 
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
    // $ANTLR end "entryRuleConceptualQuery"


    // $ANTLR start "ruleConceptualQuery"
    // InternalUddl.g:1948:1: ruleConceptualQuery returns [EObject current=null] : (otherlv_0= 'cquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'spec:' ( (lv_specification_5_0= RULE_STRING ) ) otherlv_6= '};' ) ;
    public final EObject ruleConceptualQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_specification_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalUddl.g:1954:2: ( (otherlv_0= 'cquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'spec:' ( (lv_specification_5_0= RULE_STRING ) ) otherlv_6= '};' ) )
            // InternalUddl.g:1955:2: (otherlv_0= 'cquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'spec:' ( (lv_specification_5_0= RULE_STRING ) ) otherlv_6= '};' )
            {
            // InternalUddl.g:1955:2: (otherlv_0= 'cquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'spec:' ( (lv_specification_5_0= RULE_STRING ) ) otherlv_6= '};' )
            // InternalUddl.g:1956:3: otherlv_0= 'cquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'spec:' ( (lv_specification_5_0= RULE_STRING ) ) otherlv_6= '};'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualQueryAccess().getCqueryKeyword_0());
            		
            // InternalUddl.g:1960:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:1961:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:1961:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:1962:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptualQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:1978:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalUddl.g:1979:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:1979:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:1980:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConceptualQueryAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualQueryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getConceptualQueryAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,42,FOLLOW_41); 

            			newLeafNode(otherlv_4, grammarAccess.getConceptualQueryAccess().getSpecKeyword_4());
            		
            // InternalUddl.g:2004:3: ( (lv_specification_5_0= RULE_STRING ) )
            // InternalUddl.g:2005:4: (lv_specification_5_0= RULE_STRING )
            {
            // InternalUddl.g:2005:4: (lv_specification_5_0= RULE_STRING )
            // InternalUddl.g:2006:5: lv_specification_5_0= RULE_STRING
            {
            lv_specification_5_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_specification_5_0, grammarAccess.getConceptualQueryAccess().getSpecificationSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"specification",
            						lv_specification_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConceptualQueryAccess().getRightCurlyBracketSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleConceptualQuery"


    // $ANTLR start "entryRuleConceptualCompositeQuery"
    // InternalUddl.g:2030:1: entryRuleConceptualCompositeQuery returns [EObject current=null] : iv_ruleConceptualCompositeQuery= ruleConceptualCompositeQuery EOF ;
    public final EObject entryRuleConceptualCompositeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualCompositeQuery = null;


        try {
            // InternalUddl.g:2030:65: (iv_ruleConceptualCompositeQuery= ruleConceptualCompositeQuery EOF )
            // InternalUddl.g:2031:2: iv_ruleConceptualCompositeQuery= ruleConceptualCompositeQuery EOF
            {
             newCompositeNode(grammarAccess.getConceptualCompositeQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualCompositeQuery=ruleConceptualCompositeQuery();

            state._fsp--;

             current =iv_ruleConceptualCompositeQuery; 
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
    // $ANTLR end "entryRuleConceptualCompositeQuery"


    // $ANTLR start "ruleConceptualCompositeQuery"
    // InternalUddl.g:2037:1: ruleConceptualCompositeQuery returns [EObject current=null] : (otherlv_0= 'ccquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_isUnion_4_0= 'isUnion' ) ) ( (lv_composition_5_0= ruleConceptualQueryComposition ) ) ( (lv_composition_6_0= ruleConceptualQueryComposition ) )+ otherlv_7= '};' ) ;
    public final EObject ruleConceptualCompositeQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token lv_isUnion_4_0=null;
        Token otherlv_7=null;
        EObject lv_composition_5_0 = null;

        EObject lv_composition_6_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:2043:2: ( (otherlv_0= 'ccquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_isUnion_4_0= 'isUnion' ) ) ( (lv_composition_5_0= ruleConceptualQueryComposition ) ) ( (lv_composition_6_0= ruleConceptualQueryComposition ) )+ otherlv_7= '};' ) )
            // InternalUddl.g:2044:2: (otherlv_0= 'ccquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_isUnion_4_0= 'isUnion' ) ) ( (lv_composition_5_0= ruleConceptualQueryComposition ) ) ( (lv_composition_6_0= ruleConceptualQueryComposition ) )+ otherlv_7= '};' )
            {
            // InternalUddl.g:2044:2: (otherlv_0= 'ccquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_isUnion_4_0= 'isUnion' ) ) ( (lv_composition_5_0= ruleConceptualQueryComposition ) ) ( (lv_composition_6_0= ruleConceptualQueryComposition ) )+ otherlv_7= '};' )
            // InternalUddl.g:2045:3: otherlv_0= 'ccquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_isUnion_4_0= 'isUnion' ) ) ( (lv_composition_5_0= ruleConceptualQueryComposition ) ) ( (lv_composition_6_0= ruleConceptualQueryComposition ) )+ otherlv_7= '};'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptualCompositeQueryAccess().getCcqueryKeyword_0());
            		
            // InternalUddl.g:2049:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:2050:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:2050:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:2051:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptualCompositeQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualCompositeQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:2067:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_STRING) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalUddl.g:2068:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:2068:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:2069:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConceptualCompositeQueryAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConceptualCompositeQueryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getConceptualCompositeQueryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:2089:3: ( (lv_isUnion_4_0= 'isUnion' ) )
            // InternalUddl.g:2090:4: (lv_isUnion_4_0= 'isUnion' )
            {
            // InternalUddl.g:2090:4: (lv_isUnion_4_0= 'isUnion' )
            // InternalUddl.g:2091:5: lv_isUnion_4_0= 'isUnion'
            {
            lv_isUnion_4_0=(Token)match(input,44,FOLLOW_4); 

            					newLeafNode(lv_isUnion_4_0, grammarAccess.getConceptualCompositeQueryAccess().getIsUnionIsUnionKeyword_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualCompositeQueryRule());
            					}
            					setWithLastConsumed(current, "isUnion", lv_isUnion_4_0 != null, "isUnion");
            				

            }


            }

            // InternalUddl.g:2103:3: ( (lv_composition_5_0= ruleConceptualQueryComposition ) )
            // InternalUddl.g:2104:4: (lv_composition_5_0= ruleConceptualQueryComposition )
            {
            // InternalUddl.g:2104:4: (lv_composition_5_0= ruleConceptualQueryComposition )
            // InternalUddl.g:2105:5: lv_composition_5_0= ruleConceptualQueryComposition
            {

            					newCompositeNode(grammarAccess.getConceptualCompositeQueryAccess().getCompositionConceptualQueryCompositionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_4);
            lv_composition_5_0=ruleConceptualQueryComposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConceptualCompositeQueryRule());
            					}
            					add(
            						current,
            						"composition",
            						lv_composition_5_0,
            						"com.epistimis.uddl.Uddl.ConceptualQueryComposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:2122:3: ( (lv_composition_6_0= ruleConceptualQueryComposition ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalUddl.g:2123:4: (lv_composition_6_0= ruleConceptualQueryComposition )
            	    {
            	    // InternalUddl.g:2123:4: (lv_composition_6_0= ruleConceptualQueryComposition )
            	    // InternalUddl.g:2124:5: lv_composition_6_0= ruleConceptualQueryComposition
            	    {

            	    					newCompositeNode(grammarAccess.getConceptualCompositeQueryAccess().getCompositionConceptualQueryCompositionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_composition_6_0=ruleConceptualQueryComposition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConceptualCompositeQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"composition",
            	    						lv_composition_6_0,
            	    						"com.epistimis.uddl.Uddl.ConceptualQueryComposition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);

            otherlv_7=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConceptualCompositeQueryAccess().getRightCurlyBracketSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleConceptualCompositeQuery"


    // $ANTLR start "entryRuleConceptualQueryComposition"
    // InternalUddl.g:2149:1: entryRuleConceptualQueryComposition returns [EObject current=null] : iv_ruleConceptualQueryComposition= ruleConceptualQueryComposition EOF ;
    public final EObject entryRuleConceptualQueryComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptualQueryComposition = null;


        try {
            // InternalUddl.g:2149:67: (iv_ruleConceptualQueryComposition= ruleConceptualQueryComposition EOF )
            // InternalUddl.g:2150:2: iv_ruleConceptualQueryComposition= ruleConceptualQueryComposition EOF
            {
             newCompositeNode(grammarAccess.getConceptualQueryCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptualQueryComposition=ruleConceptualQueryComposition();

            state._fsp--;

             current =iv_ruleConceptualQueryComposition; 
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
    // $ANTLR end "entryRuleConceptualQueryComposition"


    // $ANTLR start "ruleConceptualQueryComposition"
    // InternalUddl.g:2156:1: ruleConceptualQueryComposition returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleConceptualQueryComposition() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUddl.g:2162:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalUddl.g:2163:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalUddl.g:2163:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalUddl.g:2164:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalUddl.g:2164:3: ( ( ruleQN ) )
            // InternalUddl.g:2165:4: ( ruleQN )
            {
            // InternalUddl.g:2165:4: ( ruleQN )
            // InternalUddl.g:2166:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualQueryCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConceptualQueryCompositionAccess().getTypeConceptualViewCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:2180:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:2181:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:2181:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:2182:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getConceptualQueryCompositionAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptualQueryCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getConceptualQueryCompositionAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleConceptualQueryComposition"


    // $ANTLR start "entryRuleLogicalElement"
    // InternalUddl.g:2206:1: entryRuleLogicalElement returns [EObject current=null] : iv_ruleLogicalElement= ruleLogicalElement EOF ;
    public final EObject entryRuleLogicalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalElement = null;


        try {
            // InternalUddl.g:2206:55: (iv_ruleLogicalElement= ruleLogicalElement EOF )
            // InternalUddl.g:2207:2: iv_ruleLogicalElement= ruleLogicalElement EOF
            {
             newCompositeNode(grammarAccess.getLogicalElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalElement=ruleLogicalElement();

            state._fsp--;

             current =iv_ruleLogicalElement; 
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
    // $ANTLR end "entryRuleLogicalElement"


    // $ANTLR start "ruleLogicalElement"
    // InternalUddl.g:2213:1: ruleLogicalElement returns [EObject current=null] : (this_LogicalComposableElement_0= ruleLogicalComposableElement | this_LogicalConversion_1= ruleLogicalConversion | this_LogicalUnit_2= ruleLogicalUnit | this_LogicalCoordinateSystem_3= ruleLogicalCoordinateSystem | this_LogicalCoordinateSystemAxis_4= ruleLogicalCoordinateSystemAxis | this_LogicalMeasurementConversion_5= ruleLogicalMeasurementConversion | this_LogicalMeasurementSystemConversion_6= ruleLogicalMeasurementSystemConversion | this_LogicalMeasurementAxis_7= ruleLogicalMeasurementAxis | this_LogicalAbstractMeasurementSystem_8= ruleLogicalAbstractMeasurementSystem | this_LogicalMeasurementSystemAxis_9= ruleLogicalMeasurementSystemAxis | this_LogicalValueType_10= ruleLogicalValueType | this_LogicalView_11= ruleLogicalView | this_LogicalLandmark_12= ruleLogicalLandmark | this_LogicalValueTypeUnit_13= ruleLogicalValueTypeUnit ) ;
    public final EObject ruleLogicalElement() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalComposableElement_0 = null;

        EObject this_LogicalConversion_1 = null;

        EObject this_LogicalUnit_2 = null;

        EObject this_LogicalCoordinateSystem_3 = null;

        EObject this_LogicalCoordinateSystemAxis_4 = null;

        EObject this_LogicalMeasurementConversion_5 = null;

        EObject this_LogicalMeasurementSystemConversion_6 = null;

        EObject this_LogicalMeasurementAxis_7 = null;

        EObject this_LogicalAbstractMeasurementSystem_8 = null;

        EObject this_LogicalMeasurementSystemAxis_9 = null;

        EObject this_LogicalValueType_10 = null;

        EObject this_LogicalView_11 = null;

        EObject this_LogicalLandmark_12 = null;

        EObject this_LogicalValueTypeUnit_13 = null;



        	enterRule();

        try {
            // InternalUddl.g:2219:2: ( (this_LogicalComposableElement_0= ruleLogicalComposableElement | this_LogicalConversion_1= ruleLogicalConversion | this_LogicalUnit_2= ruleLogicalUnit | this_LogicalCoordinateSystem_3= ruleLogicalCoordinateSystem | this_LogicalCoordinateSystemAxis_4= ruleLogicalCoordinateSystemAxis | this_LogicalMeasurementConversion_5= ruleLogicalMeasurementConversion | this_LogicalMeasurementSystemConversion_6= ruleLogicalMeasurementSystemConversion | this_LogicalMeasurementAxis_7= ruleLogicalMeasurementAxis | this_LogicalAbstractMeasurementSystem_8= ruleLogicalAbstractMeasurementSystem | this_LogicalMeasurementSystemAxis_9= ruleLogicalMeasurementSystemAxis | this_LogicalValueType_10= ruleLogicalValueType | this_LogicalView_11= ruleLogicalView | this_LogicalLandmark_12= ruleLogicalLandmark | this_LogicalValueTypeUnit_13= ruleLogicalValueTypeUnit ) )
            // InternalUddl.g:2220:2: (this_LogicalComposableElement_0= ruleLogicalComposableElement | this_LogicalConversion_1= ruleLogicalConversion | this_LogicalUnit_2= ruleLogicalUnit | this_LogicalCoordinateSystem_3= ruleLogicalCoordinateSystem | this_LogicalCoordinateSystemAxis_4= ruleLogicalCoordinateSystemAxis | this_LogicalMeasurementConversion_5= ruleLogicalMeasurementConversion | this_LogicalMeasurementSystemConversion_6= ruleLogicalMeasurementSystemConversion | this_LogicalMeasurementAxis_7= ruleLogicalMeasurementAxis | this_LogicalAbstractMeasurementSystem_8= ruleLogicalAbstractMeasurementSystem | this_LogicalMeasurementSystemAxis_9= ruleLogicalMeasurementSystemAxis | this_LogicalValueType_10= ruleLogicalValueType | this_LogicalView_11= ruleLogicalView | this_LogicalLandmark_12= ruleLogicalLandmark | this_LogicalValueTypeUnit_13= ruleLogicalValueTypeUnit )
            {
            // InternalUddl.g:2220:2: (this_LogicalComposableElement_0= ruleLogicalComposableElement | this_LogicalConversion_1= ruleLogicalConversion | this_LogicalUnit_2= ruleLogicalUnit | this_LogicalCoordinateSystem_3= ruleLogicalCoordinateSystem | this_LogicalCoordinateSystemAxis_4= ruleLogicalCoordinateSystemAxis | this_LogicalMeasurementConversion_5= ruleLogicalMeasurementConversion | this_LogicalMeasurementSystemConversion_6= ruleLogicalMeasurementSystemConversion | this_LogicalMeasurementAxis_7= ruleLogicalMeasurementAxis | this_LogicalAbstractMeasurementSystem_8= ruleLogicalAbstractMeasurementSystem | this_LogicalMeasurementSystemAxis_9= ruleLogicalMeasurementSystemAxis | this_LogicalValueType_10= ruleLogicalValueType | this_LogicalView_11= ruleLogicalView | this_LogicalLandmark_12= ruleLogicalLandmark | this_LogicalValueTypeUnit_13= ruleLogicalValueTypeUnit )
            int alt53=14;
            switch ( input.LA(1) ) {
            case 93:
            case 99:
            case 100:
                {
                alt53=1;
                }
                break;
            case 46:
            case 48:
                {
                alt53=2;
                }
                break;
            case 45:
                {
                alt53=3;
                }
                break;
            case 65:
                {
                alt53=4;
                }
                break;
            case 69:
                {
                alt53=5;
                }
                break;
            case 98:
                {
                alt53=6;
                }
                break;
            case 90:
                {
                alt53=7;
                }
                break;
            case 96:
                {
                alt53=8;
                }
                break;
            case 70:
            case 73:
                {
                alt53=9;
                }
                break;
            case 80:
                {
                alt53=10;
                }
                break;
            case RULE_ID:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 63:
                {
                alt53=11;
                }
                break;
            case 102:
            case 103:
                {
                alt53=12;
                }
                break;
            case 72:
                {
                alt53=13;
                }
                break;
            case 83:
                {
                alt53=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalUddl.g:2221:3: this_LogicalComposableElement_0= ruleLogicalComposableElement
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalComposableElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalComposableElement_0=ruleLogicalComposableElement();

                    state._fsp--;


                    			current = this_LogicalComposableElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:2230:3: this_LogicalConversion_1= ruleLogicalConversion
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalConversionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalConversion_1=ruleLogicalConversion();

                    state._fsp--;


                    			current = this_LogicalConversion_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:2239:3: this_LogicalUnit_2= ruleLogicalUnit
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalUnitParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalUnit_2=ruleLogicalUnit();

                    state._fsp--;


                    			current = this_LogicalUnit_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:2248:3: this_LogicalCoordinateSystem_3= ruleLogicalCoordinateSystem
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalCoordinateSystemParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalCoordinateSystem_3=ruleLogicalCoordinateSystem();

                    state._fsp--;


                    			current = this_LogicalCoordinateSystem_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUddl.g:2257:3: this_LogicalCoordinateSystemAxis_4= ruleLogicalCoordinateSystemAxis
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalCoordinateSystemAxisParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalCoordinateSystemAxis_4=ruleLogicalCoordinateSystemAxis();

                    state._fsp--;


                    			current = this_LogicalCoordinateSystemAxis_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalUddl.g:2266:3: this_LogicalMeasurementConversion_5= ruleLogicalMeasurementConversion
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalMeasurementConversionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalMeasurementConversion_5=ruleLogicalMeasurementConversion();

                    state._fsp--;


                    			current = this_LogicalMeasurementConversion_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalUddl.g:2275:3: this_LogicalMeasurementSystemConversion_6= ruleLogicalMeasurementSystemConversion
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalMeasurementSystemConversionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalMeasurementSystemConversion_6=ruleLogicalMeasurementSystemConversion();

                    state._fsp--;


                    			current = this_LogicalMeasurementSystemConversion_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalUddl.g:2284:3: this_LogicalMeasurementAxis_7= ruleLogicalMeasurementAxis
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalMeasurementAxisParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalMeasurementAxis_7=ruleLogicalMeasurementAxis();

                    state._fsp--;


                    			current = this_LogicalMeasurementAxis_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalUddl.g:2293:3: this_LogicalAbstractMeasurementSystem_8= ruleLogicalAbstractMeasurementSystem
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalAbstractMeasurementSystemParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalAbstractMeasurementSystem_8=ruleLogicalAbstractMeasurementSystem();

                    state._fsp--;


                    			current = this_LogicalAbstractMeasurementSystem_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalUddl.g:2302:3: this_LogicalMeasurementSystemAxis_9= ruleLogicalMeasurementSystemAxis
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalMeasurementSystemAxisParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalMeasurementSystemAxis_9=ruleLogicalMeasurementSystemAxis();

                    state._fsp--;


                    			current = this_LogicalMeasurementSystemAxis_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalUddl.g:2311:3: this_LogicalValueType_10= ruleLogicalValueType
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalValueTypeParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalValueType_10=ruleLogicalValueType();

                    state._fsp--;


                    			current = this_LogicalValueType_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalUddl.g:2320:3: this_LogicalView_11= ruleLogicalView
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalViewParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalView_11=ruleLogicalView();

                    state._fsp--;


                    			current = this_LogicalView_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalUddl.g:2329:3: this_LogicalLandmark_12= ruleLogicalLandmark
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalLandmarkParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalLandmark_12=ruleLogicalLandmark();

                    state._fsp--;


                    			current = this_LogicalLandmark_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalUddl.g:2338:3: this_LogicalValueTypeUnit_13= ruleLogicalValueTypeUnit
                    {

                    			newCompositeNode(grammarAccess.getLogicalElementAccess().getLogicalValueTypeUnitParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalValueTypeUnit_13=ruleLogicalValueTypeUnit();

                    state._fsp--;


                    			current = this_LogicalValueTypeUnit_13;
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
    // $ANTLR end "ruleLogicalElement"


    // $ANTLR start "entryRuleLogicalUnit"
    // InternalUddl.g:2350:1: entryRuleLogicalUnit returns [EObject current=null] : iv_ruleLogicalUnit= ruleLogicalUnit EOF ;
    public final EObject entryRuleLogicalUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalUnit = null;


        try {
            // InternalUddl.g:2350:52: (iv_ruleLogicalUnit= ruleLogicalUnit EOF )
            // InternalUddl.g:2351:2: iv_ruleLogicalUnit= ruleLogicalUnit EOF
            {
             newCompositeNode(grammarAccess.getLogicalUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalUnit=ruleLogicalUnit();

            state._fsp--;

             current =iv_ruleLogicalUnit; 
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
    // $ANTLR end "entryRuleLogicalUnit"


    // $ANTLR start "ruleLogicalUnit"
    // InternalUddl.g:2357:1: ruleLogicalUnit returns [EObject current=null] : (otherlv_0= 'lunit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:2363:2: ( (otherlv_0= 'lunit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:2364:2: (otherlv_0= 'lunit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:2364:2: (otherlv_0= 'lunit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:2365:3: otherlv_0= 'lunit' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalUnitAccess().getLunitKeyword_0());
            		
            // InternalUddl.g:2369:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:2370:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:2370:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:2371:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalUnitAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalUnitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:2387:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalUddl.g:2388:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:2388:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:2389:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalUnitAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalUnitRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalUnitAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalUnit"


    // $ANTLR start "entryRuleLogicalConversion"
    // InternalUddl.g:2413:1: entryRuleLogicalConversion returns [EObject current=null] : iv_ruleLogicalConversion= ruleLogicalConversion EOF ;
    public final EObject entryRuleLogicalConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalConversion = null;


        try {
            // InternalUddl.g:2413:58: (iv_ruleLogicalConversion= ruleLogicalConversion EOF )
            // InternalUddl.g:2414:2: iv_ruleLogicalConversion= ruleLogicalConversion EOF
            {
             newCompositeNode(grammarAccess.getLogicalConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalConversion=ruleLogicalConversion();

            state._fsp--;

             current =iv_ruleLogicalConversion; 
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
    // $ANTLR end "entryRuleLogicalConversion"


    // $ANTLR start "ruleLogicalConversion"
    // InternalUddl.g:2420:1: ruleLogicalConversion returns [EObject current=null] : ( (otherlv_0= 'conv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-()>' ( ( ruleQN ) ) otherlv_7= '};' ) | this_LogicalAffineConversion_8= ruleLogicalAffineConversion ) ;
    public final EObject ruleLogicalConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_LogicalAffineConversion_8 = null;



        	enterRule();

        try {
            // InternalUddl.g:2426:2: ( ( (otherlv_0= 'conv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-()>' ( ( ruleQN ) ) otherlv_7= '};' ) | this_LogicalAffineConversion_8= ruleLogicalAffineConversion ) )
            // InternalUddl.g:2427:2: ( (otherlv_0= 'conv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-()>' ( ( ruleQN ) ) otherlv_7= '};' ) | this_LogicalAffineConversion_8= ruleLogicalAffineConversion )
            {
            // InternalUddl.g:2427:2: ( (otherlv_0= 'conv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-()>' ( ( ruleQN ) ) otherlv_7= '};' ) | this_LogicalAffineConversion_8= ruleLogicalAffineConversion )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==46) ) {
                alt56=1;
            }
            else if ( (LA56_0==48) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalUddl.g:2428:3: (otherlv_0= 'conv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-()>' ( ( ruleQN ) ) otherlv_7= '};' )
                    {
                    // InternalUddl.g:2428:3: (otherlv_0= 'conv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-()>' ( ( ruleQN ) ) otherlv_7= '};' )
                    // InternalUddl.g:2429:4: otherlv_0= 'conv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-()>' ( ( ruleQN ) ) otherlv_7= '};'
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLogicalConversionAccess().getConvKeyword_0_0());
                    			
                    // InternalUddl.g:2433:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalUddl.g:2434:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUddl.g:2434:5: (lv_name_1_0= RULE_ID )
                    // InternalUddl.g:2435:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getLogicalConversionAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalConversionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalUddl.g:2451:4: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_STRING) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalUddl.g:2452:5: (lv_description_2_0= RULE_STRING )
                            {
                            // InternalUddl.g:2452:5: (lv_description_2_0= RULE_STRING )
                            // InternalUddl.g:2453:6: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                            						newLeafNode(lv_description_2_0, grammarAccess.getLogicalConversionAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getLogicalConversionRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"description",
                            							lv_description_2_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalConversionAccess().getLeftCurlyBracketKeyword_0_3());
                    			
                    // InternalUddl.g:2473:4: ( ( ruleQN ) )
                    // InternalUddl.g:2474:5: ( ruleQN )
                    {
                    // InternalUddl.g:2474:5: ( ruleQN )
                    // InternalUddl.g:2475:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalConversionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalConversionAccess().getSourceLogicalUnitCrossReference_0_4_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogicalConversionAccess().getHyphenMinusLeftParenthesisRightParenthesisGreaterThanSignKeyword_0_5());
                    			
                    // InternalUddl.g:2493:4: ( ( ruleQN ) )
                    // InternalUddl.g:2494:5: ( ruleQN )
                    {
                    // InternalUddl.g:2494:5: ( ruleQN )
                    // InternalUddl.g:2495:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalConversionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalConversionAccess().getDestinationLogicalUnitCrossReference_0_6_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalConversionAccess().getRightCurlyBracketSemicolonKeyword_0_7());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUddl.g:2515:3: this_LogicalAffineConversion_8= ruleLogicalAffineConversion
                    {

                    			newCompositeNode(grammarAccess.getLogicalConversionAccess().getLogicalAffineConversionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalAffineConversion_8=ruleLogicalAffineConversion();

                    state._fsp--;


                    			current = this_LogicalAffineConversion_8;
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
    // $ANTLR end "ruleLogicalConversion"


    // $ANTLR start "entryRuleLogicalAffineConversion"
    // InternalUddl.g:2527:1: entryRuleLogicalAffineConversion returns [EObject current=null] : iv_ruleLogicalAffineConversion= ruleLogicalAffineConversion EOF ;
    public final EObject entryRuleLogicalAffineConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAffineConversion = null;


        try {
            // InternalUddl.g:2527:64: (iv_ruleLogicalAffineConversion= ruleLogicalAffineConversion EOF )
            // InternalUddl.g:2528:2: iv_ruleLogicalAffineConversion= ruleLogicalAffineConversion EOF
            {
             newCompositeNode(grammarAccess.getLogicalAffineConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAffineConversion=ruleLogicalAffineConversion();

            state._fsp--;

             current =iv_ruleLogicalAffineConversion; 
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
    // $ANTLR end "entryRuleLogicalAffineConversion"


    // $ANTLR start "ruleLogicalAffineConversion"
    // InternalUddl.g:2534:1: ruleLogicalAffineConversion returns [EObject current=null] : (otherlv_0= 'aconv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' otherlv_6= 'm:' ( (lv_conversionFactor_7_0= RULE_FLOAT ) ) otherlv_8= 'b:' ( (lv_offset_9_0= RULE_FLOAT ) ) otherlv_10= ')->' ( ( ruleQN ) ) otherlv_12= '};' ) ;
    public final EObject ruleLogicalAffineConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_conversionFactor_7_0=null;
        Token otherlv_8=null;
        Token lv_offset_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalUddl.g:2540:2: ( (otherlv_0= 'aconv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' otherlv_6= 'm:' ( (lv_conversionFactor_7_0= RULE_FLOAT ) ) otherlv_8= 'b:' ( (lv_offset_9_0= RULE_FLOAT ) ) otherlv_10= ')->' ( ( ruleQN ) ) otherlv_12= '};' ) )
            // InternalUddl.g:2541:2: (otherlv_0= 'aconv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' otherlv_6= 'm:' ( (lv_conversionFactor_7_0= RULE_FLOAT ) ) otherlv_8= 'b:' ( (lv_offset_9_0= RULE_FLOAT ) ) otherlv_10= ')->' ( ( ruleQN ) ) otherlv_12= '};' )
            {
            // InternalUddl.g:2541:2: (otherlv_0= 'aconv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' otherlv_6= 'm:' ( (lv_conversionFactor_7_0= RULE_FLOAT ) ) otherlv_8= 'b:' ( (lv_offset_9_0= RULE_FLOAT ) ) otherlv_10= ')->' ( ( ruleQN ) ) otherlv_12= '};' )
            // InternalUddl.g:2542:3: otherlv_0= 'aconv' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' otherlv_6= 'm:' ( (lv_conversionFactor_7_0= RULE_FLOAT ) ) otherlv_8= 'b:' ( (lv_offset_9_0= RULE_FLOAT ) ) otherlv_10= ')->' ( ( ruleQN ) ) otherlv_12= '};'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalAffineConversionAccess().getAconvKeyword_0());
            		
            // InternalUddl.g:2546:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:2547:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:2547:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:2548:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalAffineConversionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalAffineConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:2564:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalUddl.g:2565:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:2565:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:2566:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalAffineConversionAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalAffineConversionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalAffineConversionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:2586:3: ( ( ruleQN ) )
            // InternalUddl.g:2587:4: ( ruleQN )
            {
            // InternalUddl.g:2587:4: ( ruleQN )
            // InternalUddl.g:2588:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalAffineConversionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalAffineConversionAccess().getSourceLogicalUnitCrossReference_4_0());
            				
            pushFollow(FOLLOW_45);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,49,FOLLOW_46); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalAffineConversionAccess().getHyphenMinusLeftParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,50,FOLLOW_47); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalAffineConversionAccess().getMKeyword_6());
            		
            // InternalUddl.g:2610:3: ( (lv_conversionFactor_7_0= RULE_FLOAT ) )
            // InternalUddl.g:2611:4: (lv_conversionFactor_7_0= RULE_FLOAT )
            {
            // InternalUddl.g:2611:4: (lv_conversionFactor_7_0= RULE_FLOAT )
            // InternalUddl.g:2612:5: lv_conversionFactor_7_0= RULE_FLOAT
            {
            lv_conversionFactor_7_0=(Token)match(input,RULE_FLOAT,FOLLOW_48); 

            					newLeafNode(lv_conversionFactor_7_0, grammarAccess.getLogicalAffineConversionAccess().getConversionFactorFLOATTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalAffineConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"conversionFactor",
            						lv_conversionFactor_7_0,
            						"com.epistimis.uddl.Uddl.FLOAT");
            				

            }


            }

            otherlv_8=(Token)match(input,51,FOLLOW_47); 

            			newLeafNode(otherlv_8, grammarAccess.getLogicalAffineConversionAccess().getBKeyword_8());
            		
            // InternalUddl.g:2632:3: ( (lv_offset_9_0= RULE_FLOAT ) )
            // InternalUddl.g:2633:4: (lv_offset_9_0= RULE_FLOAT )
            {
            // InternalUddl.g:2633:4: (lv_offset_9_0= RULE_FLOAT )
            // InternalUddl.g:2634:5: lv_offset_9_0= RULE_FLOAT
            {
            lv_offset_9_0=(Token)match(input,RULE_FLOAT,FOLLOW_49); 

            					newLeafNode(lv_offset_9_0, grammarAccess.getLogicalAffineConversionAccess().getOffsetFLOATTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalAffineConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"offset",
            						lv_offset_9_0,
            						"com.epistimis.uddl.Uddl.FLOAT");
            				

            }


            }

            otherlv_10=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalAffineConversionAccess().getRightParenthesisHyphenMinusGreaterThanSignKeyword_10());
            		
            // InternalUddl.g:2654:3: ( ( ruleQN ) )
            // InternalUddl.g:2655:4: ( ruleQN )
            {
            // InternalUddl.g:2655:4: ( ruleQN )
            // InternalUddl.g:2656:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalAffineConversionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalAffineConversionAccess().getTargetLogicalUnitCrossReference_11_0());
            				
            pushFollow(FOLLOW_22);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLogicalAffineConversionAccess().getRightCurlyBracketSemicolonKeyword_12());
            		

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
    // $ANTLR end "ruleLogicalAffineConversion"


    // $ANTLR start "entryRuleLogicalValueType"
    // InternalUddl.g:2678:1: entryRuleLogicalValueType returns [EObject current=null] : iv_ruleLogicalValueType= ruleLogicalValueType EOF ;
    public final EObject entryRuleLogicalValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalValueType = null;


        try {
            // InternalUddl.g:2678:57: (iv_ruleLogicalValueType= ruleLogicalValueType EOF )
            // InternalUddl.g:2679:2: iv_ruleLogicalValueType= ruleLogicalValueType EOF
            {
             newCompositeNode(grammarAccess.getLogicalValueTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalValueType=ruleLogicalValueType();

            state._fsp--;

             current =iv_ruleLogicalValueType; 
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
    // $ANTLR end "entryRuleLogicalValueType"


    // $ANTLR start "ruleLogicalValueType"
    // InternalUddl.g:2685:1: ruleLogicalValueType returns [EObject current=null] : (this_LogicalBoolean_0= ruleLogicalBoolean | this_LogicalNumeric_1= ruleLogicalNumeric | this_LogicalCharacter_2= ruleLogicalCharacter | this_LogicalString_3= ruleLogicalString | this_LogicalEnumeratedBase_4= ruleLogicalEnumeratedBase ) ;
    public final EObject ruleLogicalValueType() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalBoolean_0 = null;

        EObject this_LogicalNumeric_1 = null;

        EObject this_LogicalCharacter_2 = null;

        EObject this_LogicalString_3 = null;

        EObject this_LogicalEnumeratedBase_4 = null;



        	enterRule();

        try {
            // InternalUddl.g:2691:2: ( (this_LogicalBoolean_0= ruleLogicalBoolean | this_LogicalNumeric_1= ruleLogicalNumeric | this_LogicalCharacter_2= ruleLogicalCharacter | this_LogicalString_3= ruleLogicalString | this_LogicalEnumeratedBase_4= ruleLogicalEnumeratedBase ) )
            // InternalUddl.g:2692:2: (this_LogicalBoolean_0= ruleLogicalBoolean | this_LogicalNumeric_1= ruleLogicalNumeric | this_LogicalCharacter_2= ruleLogicalCharacter | this_LogicalString_3= ruleLogicalString | this_LogicalEnumeratedBase_4= ruleLogicalEnumeratedBase )
            {
            // InternalUddl.g:2692:2: (this_LogicalBoolean_0= ruleLogicalBoolean | this_LogicalNumeric_1= ruleLogicalNumeric | this_LogicalCharacter_2= ruleLogicalCharacter | this_LogicalString_3= ruleLogicalString | this_LogicalEnumeratedBase_4= ruleLogicalEnumeratedBase )
            int alt58=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt58=1;
                }
                break;
            case 56:
            case 57:
            case 58:
            case 59:
                {
                alt58=2;
                }
                break;
            case 54:
                {
                alt58=3;
                }
                break;
            case 53:
                {
                alt58=4;
                }
                break;
            case RULE_ID:
            case 60:
            case 63:
                {
                alt58=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalUddl.g:2693:3: this_LogicalBoolean_0= ruleLogicalBoolean
                    {

                    			newCompositeNode(grammarAccess.getLogicalValueTypeAccess().getLogicalBooleanParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalBoolean_0=ruleLogicalBoolean();

                    state._fsp--;


                    			current = this_LogicalBoolean_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:2702:3: this_LogicalNumeric_1= ruleLogicalNumeric
                    {

                    			newCompositeNode(grammarAccess.getLogicalValueTypeAccess().getLogicalNumericParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalNumeric_1=ruleLogicalNumeric();

                    state._fsp--;


                    			current = this_LogicalNumeric_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:2711:3: this_LogicalCharacter_2= ruleLogicalCharacter
                    {

                    			newCompositeNode(grammarAccess.getLogicalValueTypeAccess().getLogicalCharacterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalCharacter_2=ruleLogicalCharacter();

                    state._fsp--;


                    			current = this_LogicalCharacter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:2720:3: this_LogicalString_3= ruleLogicalString
                    {

                    			newCompositeNode(grammarAccess.getLogicalValueTypeAccess().getLogicalStringParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalString_3=ruleLogicalString();

                    state._fsp--;


                    			current = this_LogicalString_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUddl.g:2729:3: this_LogicalEnumeratedBase_4= ruleLogicalEnumeratedBase
                    {

                    			newCompositeNode(grammarAccess.getLogicalValueTypeAccess().getLogicalEnumeratedBaseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalEnumeratedBase_4=ruleLogicalEnumeratedBase();

                    state._fsp--;


                    			current = this_LogicalEnumeratedBase_4;
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
    // $ANTLR end "ruleLogicalValueType"


    // $ANTLR start "entryRuleLogicalString"
    // InternalUddl.g:2741:1: entryRuleLogicalString returns [EObject current=null] : iv_ruleLogicalString= ruleLogicalString EOF ;
    public final EObject entryRuleLogicalString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalString = null;


        try {
            // InternalUddl.g:2741:54: (iv_ruleLogicalString= ruleLogicalString EOF )
            // InternalUddl.g:2742:2: iv_ruleLogicalString= ruleLogicalString EOF
            {
             newCompositeNode(grammarAccess.getLogicalStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalString=ruleLogicalString();

            state._fsp--;

             current =iv_ruleLogicalString; 
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
    // $ANTLR end "entryRuleLogicalString"


    // $ANTLR start "ruleLogicalString"
    // InternalUddl.g:2748:1: ruleLogicalString returns [EObject current=null] : (otherlv_0= 'str' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:2754:2: ( (otherlv_0= 'str' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:2755:2: (otherlv_0= 'str' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:2755:2: (otherlv_0= 'str' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:2756:3: otherlv_0= 'str' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalStringAccess().getStrKeyword_0());
            		
            // InternalUddl.g:2760:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:2761:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:2761:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:2762:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalStringAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:2778:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_STRING) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalUddl.g:2779:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:2779:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:2780:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalStringAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalStringAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalString"


    // $ANTLR start "entryRuleLogicalCharacter"
    // InternalUddl.g:2804:1: entryRuleLogicalCharacter returns [EObject current=null] : iv_ruleLogicalCharacter= ruleLogicalCharacter EOF ;
    public final EObject entryRuleLogicalCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalCharacter = null;


        try {
            // InternalUddl.g:2804:57: (iv_ruleLogicalCharacter= ruleLogicalCharacter EOF )
            // InternalUddl.g:2805:2: iv_ruleLogicalCharacter= ruleLogicalCharacter EOF
            {
             newCompositeNode(grammarAccess.getLogicalCharacterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalCharacter=ruleLogicalCharacter();

            state._fsp--;

             current =iv_ruleLogicalCharacter; 
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
    // $ANTLR end "entryRuleLogicalCharacter"


    // $ANTLR start "ruleLogicalCharacter"
    // InternalUddl.g:2811:1: ruleLogicalCharacter returns [EObject current=null] : (otherlv_0= 'ch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:2817:2: ( (otherlv_0= 'ch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:2818:2: (otherlv_0= 'ch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:2818:2: (otherlv_0= 'ch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:2819:3: otherlv_0= 'ch' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalCharacterAccess().getChKeyword_0());
            		
            // InternalUddl.g:2823:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:2824:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:2824:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:2825:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalCharacterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:2841:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalUddl.g:2842:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:2842:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:2843:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalCharacterAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalCharacterRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalCharacterAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalCharacter"


    // $ANTLR start "entryRuleLogicalBoolean"
    // InternalUddl.g:2867:1: entryRuleLogicalBoolean returns [EObject current=null] : iv_ruleLogicalBoolean= ruleLogicalBoolean EOF ;
    public final EObject entryRuleLogicalBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalBoolean = null;


        try {
            // InternalUddl.g:2867:55: (iv_ruleLogicalBoolean= ruleLogicalBoolean EOF )
            // InternalUddl.g:2868:2: iv_ruleLogicalBoolean= ruleLogicalBoolean EOF
            {
             newCompositeNode(grammarAccess.getLogicalBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalBoolean=ruleLogicalBoolean();

            state._fsp--;

             current =iv_ruleLogicalBoolean; 
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
    // $ANTLR end "entryRuleLogicalBoolean"


    // $ANTLR start "ruleLogicalBoolean"
    // InternalUddl.g:2874:1: ruleLogicalBoolean returns [EObject current=null] : (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:2880:2: ( (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:2881:2: (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:2881:2: (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:2882:3: otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalBooleanAccess().getBoolKeyword_0());
            		
            // InternalUddl.g:2886:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:2887:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:2887:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:2888:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalBooleanAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalBooleanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:2904:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_STRING) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalUddl.g:2905:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:2905:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:2906:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalBooleanAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalBooleanRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalBooleanAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalBoolean"


    // $ANTLR start "entryRuleLogicalNumeric"
    // InternalUddl.g:2930:1: entryRuleLogicalNumeric returns [EObject current=null] : iv_ruleLogicalNumeric= ruleLogicalNumeric EOF ;
    public final EObject entryRuleLogicalNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNumeric = null;


        try {
            // InternalUddl.g:2930:55: (iv_ruleLogicalNumeric= ruleLogicalNumeric EOF )
            // InternalUddl.g:2931:2: iv_ruleLogicalNumeric= ruleLogicalNumeric EOF
            {
             newCompositeNode(grammarAccess.getLogicalNumericRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalNumeric=ruleLogicalNumeric();

            state._fsp--;

             current =iv_ruleLogicalNumeric; 
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
    // $ANTLR end "entryRuleLogicalNumeric"


    // $ANTLR start "ruleLogicalNumeric"
    // InternalUddl.g:2937:1: ruleLogicalNumeric returns [EObject current=null] : (this_LogicalInteger_0= ruleLogicalInteger | this_LogicalNatural_1= ruleLogicalNatural | this_LogicalReal_2= ruleLogicalReal | this_LogicalNonNegativeReal_3= ruleLogicalNonNegativeReal ) ;
    public final EObject ruleLogicalNumeric() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalInteger_0 = null;

        EObject this_LogicalNatural_1 = null;

        EObject this_LogicalReal_2 = null;

        EObject this_LogicalNonNegativeReal_3 = null;



        	enterRule();

        try {
            // InternalUddl.g:2943:2: ( (this_LogicalInteger_0= ruleLogicalInteger | this_LogicalNatural_1= ruleLogicalNatural | this_LogicalReal_2= ruleLogicalReal | this_LogicalNonNegativeReal_3= ruleLogicalNonNegativeReal ) )
            // InternalUddl.g:2944:2: (this_LogicalInteger_0= ruleLogicalInteger | this_LogicalNatural_1= ruleLogicalNatural | this_LogicalReal_2= ruleLogicalReal | this_LogicalNonNegativeReal_3= ruleLogicalNonNegativeReal )
            {
            // InternalUddl.g:2944:2: (this_LogicalInteger_0= ruleLogicalInteger | this_LogicalNatural_1= ruleLogicalNatural | this_LogicalReal_2= ruleLogicalReal | this_LogicalNonNegativeReal_3= ruleLogicalNonNegativeReal )
            int alt62=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt62=1;
                }
                break;
            case 57:
                {
                alt62=2;
                }
                break;
            case 58:
                {
                alt62=3;
                }
                break;
            case 59:
                {
                alt62=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalUddl.g:2945:3: this_LogicalInteger_0= ruleLogicalInteger
                    {

                    			newCompositeNode(grammarAccess.getLogicalNumericAccess().getLogicalIntegerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalInteger_0=ruleLogicalInteger();

                    state._fsp--;


                    			current = this_LogicalInteger_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:2954:3: this_LogicalNatural_1= ruleLogicalNatural
                    {

                    			newCompositeNode(grammarAccess.getLogicalNumericAccess().getLogicalNaturalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalNatural_1=ruleLogicalNatural();

                    state._fsp--;


                    			current = this_LogicalNatural_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:2963:3: this_LogicalReal_2= ruleLogicalReal
                    {

                    			newCompositeNode(grammarAccess.getLogicalNumericAccess().getLogicalRealParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalReal_2=ruleLogicalReal();

                    state._fsp--;


                    			current = this_LogicalReal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:2972:3: this_LogicalNonNegativeReal_3= ruleLogicalNonNegativeReal
                    {

                    			newCompositeNode(grammarAccess.getLogicalNumericAccess().getLogicalNonNegativeRealParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalNonNegativeReal_3=ruleLogicalNonNegativeReal();

                    state._fsp--;


                    			current = this_LogicalNonNegativeReal_3;
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
    // $ANTLR end "ruleLogicalNumeric"


    // $ANTLR start "entryRuleLogicalInteger"
    // InternalUddl.g:2984:1: entryRuleLogicalInteger returns [EObject current=null] : iv_ruleLogicalInteger= ruleLogicalInteger EOF ;
    public final EObject entryRuleLogicalInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalInteger = null;


        try {
            // InternalUddl.g:2984:55: (iv_ruleLogicalInteger= ruleLogicalInteger EOF )
            // InternalUddl.g:2985:2: iv_ruleLogicalInteger= ruleLogicalInteger EOF
            {
             newCompositeNode(grammarAccess.getLogicalIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalInteger=ruleLogicalInteger();

            state._fsp--;

             current =iv_ruleLogicalInteger; 
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
    // $ANTLR end "entryRuleLogicalInteger"


    // $ANTLR start "ruleLogicalInteger"
    // InternalUddl.g:2991:1: ruleLogicalInteger returns [EObject current=null] : (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:2997:2: ( (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:2998:2: (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:2998:2: (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:2999:3: otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalIntegerAccess().getIntKeyword_0());
            		
            // InternalUddl.g:3003:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3004:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3004:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3005:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalIntegerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalIntegerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3021:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_STRING) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalUddl.g:3022:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3022:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3023:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalIntegerAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalIntegerRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalIntegerAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalInteger"


    // $ANTLR start "entryRuleLogicalNatural"
    // InternalUddl.g:3047:1: entryRuleLogicalNatural returns [EObject current=null] : iv_ruleLogicalNatural= ruleLogicalNatural EOF ;
    public final EObject entryRuleLogicalNatural() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNatural = null;


        try {
            // InternalUddl.g:3047:55: (iv_ruleLogicalNatural= ruleLogicalNatural EOF )
            // InternalUddl.g:3048:2: iv_ruleLogicalNatural= ruleLogicalNatural EOF
            {
             newCompositeNode(grammarAccess.getLogicalNaturalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalNatural=ruleLogicalNatural();

            state._fsp--;

             current =iv_ruleLogicalNatural; 
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
    // $ANTLR end "entryRuleLogicalNatural"


    // $ANTLR start "ruleLogicalNatural"
    // InternalUddl.g:3054:1: ruleLogicalNatural returns [EObject current=null] : (otherlv_0= 'nat' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalNatural() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:3060:2: ( (otherlv_0= 'nat' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:3061:2: (otherlv_0= 'nat' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:3061:2: (otherlv_0= 'nat' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:3062:3: otherlv_0= 'nat' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalNaturalAccess().getNatKeyword_0());
            		
            // InternalUddl.g:3066:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3067:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3067:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3068:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalNaturalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalNaturalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3084:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_STRING) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalUddl.g:3085:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3085:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3086:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalNaturalAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalNaturalRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalNaturalAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalNatural"


    // $ANTLR start "entryRuleLogicalReal"
    // InternalUddl.g:3110:1: entryRuleLogicalReal returns [EObject current=null] : iv_ruleLogicalReal= ruleLogicalReal EOF ;
    public final EObject entryRuleLogicalReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalReal = null;


        try {
            // InternalUddl.g:3110:52: (iv_ruleLogicalReal= ruleLogicalReal EOF )
            // InternalUddl.g:3111:2: iv_ruleLogicalReal= ruleLogicalReal EOF
            {
             newCompositeNode(grammarAccess.getLogicalRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalReal=ruleLogicalReal();

            state._fsp--;

             current =iv_ruleLogicalReal; 
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
    // $ANTLR end "entryRuleLogicalReal"


    // $ANTLR start "ruleLogicalReal"
    // InternalUddl.g:3117:1: ruleLogicalReal returns [EObject current=null] : (otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:3123:2: ( (otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:3124:2: (otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:3124:2: (otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:3125:3: otherlv_0= 'real' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalRealAccess().getRealKeyword_0());
            		
            // InternalUddl.g:3129:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3130:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3130:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3131:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalRealAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalRealRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3147:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_STRING) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalUddl.g:3148:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3148:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3149:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalRealAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalRealRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalRealAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalReal"


    // $ANTLR start "entryRuleLogicalNonNegativeReal"
    // InternalUddl.g:3173:1: entryRuleLogicalNonNegativeReal returns [EObject current=null] : iv_ruleLogicalNonNegativeReal= ruleLogicalNonNegativeReal EOF ;
    public final EObject entryRuleLogicalNonNegativeReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNonNegativeReal = null;


        try {
            // InternalUddl.g:3173:63: (iv_ruleLogicalNonNegativeReal= ruleLogicalNonNegativeReal EOF )
            // InternalUddl.g:3174:2: iv_ruleLogicalNonNegativeReal= ruleLogicalNonNegativeReal EOF
            {
             newCompositeNode(grammarAccess.getLogicalNonNegativeRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalNonNegativeReal=ruleLogicalNonNegativeReal();

            state._fsp--;

             current =iv_ruleLogicalNonNegativeReal; 
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
    // $ANTLR end "entryRuleLogicalNonNegativeReal"


    // $ANTLR start "ruleLogicalNonNegativeReal"
    // InternalUddl.g:3180:1: ruleLogicalNonNegativeReal returns [EObject current=null] : (otherlv_0= 'real+' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalNonNegativeReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:3186:2: ( (otherlv_0= 'real+' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:3187:2: (otherlv_0= 'real+' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:3187:2: (otherlv_0= 'real+' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:3188:3: otherlv_0= 'real+' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalNonNegativeRealAccess().getRealKeyword_0());
            		
            // InternalUddl.g:3192:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3193:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3193:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3194:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalNonNegativeRealAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalNonNegativeRealRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3210:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_STRING) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalUddl.g:3211:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3211:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3212:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalNonNegativeRealAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalNonNegativeRealRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalNonNegativeRealAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalNonNegativeReal"


    // $ANTLR start "entryRuleLogicalEnumerated"
    // InternalUddl.g:3236:1: entryRuleLogicalEnumerated returns [EObject current=null] : iv_ruleLogicalEnumerated= ruleLogicalEnumerated EOF ;
    public final EObject entryRuleLogicalEnumerated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalEnumerated = null;


        try {
            // InternalUddl.g:3236:58: (iv_ruleLogicalEnumerated= ruleLogicalEnumerated EOF )
            // InternalUddl.g:3237:2: iv_ruleLogicalEnumerated= ruleLogicalEnumerated EOF
            {
             newCompositeNode(grammarAccess.getLogicalEnumeratedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalEnumerated=ruleLogicalEnumerated();

            state._fsp--;

             current =iv_ruleLogicalEnumerated; 
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
    // $ANTLR end "entryRuleLogicalEnumerated"


    // $ANTLR start "ruleLogicalEnumerated"
    // InternalUddl.g:3243:1: ruleLogicalEnumerated returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'stdRef:' ( (lv_standardReference_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? ( ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' otherlv_11= ';' ) ;
    public final EObject ruleLogicalEnumerated() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token lv_standardReference_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_label_6_1 = null;

        EObject lv_label_6_2 = null;

        EObject lv_label_8_1 = null;

        EObject lv_label_8_2 = null;



        	enterRule();

        try {
            // InternalUddl.g:3249:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'stdRef:' ( (lv_standardReference_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? ( ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' otherlv_11= ';' ) )
            // InternalUddl.g:3250:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'stdRef:' ( (lv_standardReference_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? ( ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' otherlv_11= ';' )
            {
            // InternalUddl.g:3250:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'stdRef:' ( (lv_standardReference_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? ( ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' otherlv_11= ';' )
            // InternalUddl.g:3251:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'stdRef:' ( (lv_standardReference_4_0= RULE_STRING ) ) )? otherlv_5= '[' ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? ( ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_9= ',' )? )* otherlv_10= ']' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalEnumeratedAccess().getEnumKeyword_0());
            		
            // InternalUddl.g:3255:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3256:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3256:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3257:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_50); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalEnumeratedAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalEnumeratedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3273:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalUddl.g:3274:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3274:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3275:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalEnumeratedAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalEnumeratedRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:3291:3: (otherlv_3= 'stdRef:' ( (lv_standardReference_4_0= RULE_STRING ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==61) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalUddl.g:3292:4: otherlv_3= 'stdRef:' ( (lv_standardReference_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_41); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalEnumeratedAccess().getStdRefKeyword_3_0());
                    			
                    // InternalUddl.g:3296:4: ( (lv_standardReference_4_0= RULE_STRING ) )
                    // InternalUddl.g:3297:5: (lv_standardReference_4_0= RULE_STRING )
                    {
                    // InternalUddl.g:3297:5: (lv_standardReference_4_0= RULE_STRING )
                    // InternalUddl.g:3298:6: lv_standardReference_4_0= RULE_STRING
                    {
                    lv_standardReference_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_standardReference_4_0, grammarAccess.getLogicalEnumeratedAccess().getStandardReferenceSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalEnumeratedRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"standardReference",
                    							lv_standardReference_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_52); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalEnumeratedAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalUddl.g:3319:3: ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) )
            // InternalUddl.g:3320:4: ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) )
            {
            // InternalUddl.g:3320:4: ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) )
            // InternalUddl.g:3321:5: (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet )
            {
            // InternalUddl.g:3321:5: (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                alt69=1;
            }
            else if ( (LA69_0==63) ) {
                int LA69_2 = input.LA(2);

                if ( (LA69_2==RULE_ID) ) {
                    int LA69_3 = input.LA(3);

                    if ( (LA69_3==RULE_STRING) ) {
                        int LA69_4 = input.LA(4);

                        if ( (LA69_4==64) ) {
                            alt69=1;
                        }
                        else if ( (LA69_4==28) ) {
                            alt69=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 69, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA69_3==28) ) {
                        alt69=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalUddl.g:3322:6: lv_label_6_1= ruleLogicalEnumerationLabel
                    {

                    						newCompositeNode(grammarAccess.getLogicalEnumeratedAccess().getLabelLogicalEnumerationLabelParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_label_6_1=ruleLogicalEnumerationLabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalEnumeratedRule());
                    						}
                    						add(
                    							current,
                    							"label",
                    							lv_label_6_1,
                    							"com.epistimis.uddl.Uddl.LogicalEnumerationLabel");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalUddl.g:3338:6: lv_label_6_2= ruleLogicalEnumeratedSet
                    {

                    						newCompositeNode(grammarAccess.getLogicalEnumeratedAccess().getLabelLogicalEnumeratedSetParserRuleCall_5_0_1());
                    					
                    pushFollow(FOLLOW_53);
                    lv_label_6_2=ruleLogicalEnumeratedSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalEnumeratedRule());
                    						}
                    						add(
                    							current,
                    							"label",
                    							lv_label_6_2,
                    							"com.epistimis.uddl.Uddl.LogicalEnumeratedSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalUddl.g:3356:3: (otherlv_7= ',' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==62) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalUddl.g:3357:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,62,FOLLOW_54); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalEnumeratedAccess().getCommaKeyword_6());
                    			

                    }
                    break;

            }

            // InternalUddl.g:3362:3: ( ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_9= ',' )? )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ID||LA73_0==63) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalUddl.g:3363:4: ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_9= ',' )?
            	    {
            	    // InternalUddl.g:3363:4: ( ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) ) )
            	    // InternalUddl.g:3364:5: ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) )
            	    {
            	    // InternalUddl.g:3364:5: ( (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet ) )
            	    // InternalUddl.g:3365:6: (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet )
            	    {
            	    // InternalUddl.g:3365:6: (lv_label_8_1= ruleLogicalEnumerationLabel | lv_label_8_2= ruleLogicalEnumeratedSet )
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==RULE_ID) ) {
            	        alt71=1;
            	    }
            	    else if ( (LA71_0==63) ) {
            	        int LA71_2 = input.LA(2);

            	        if ( (LA71_2==RULE_ID) ) {
            	            int LA71_3 = input.LA(3);

            	            if ( (LA71_3==RULE_STRING) ) {
            	                int LA71_4 = input.LA(4);

            	                if ( (LA71_4==28) ) {
            	                    alt71=2;
            	                }
            	                else if ( (LA71_4==64) ) {
            	                    alt71=1;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 71, 4, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA71_3==28) ) {
            	                alt71=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 71, 3, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 71, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 71, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // InternalUddl.g:3366:7: lv_label_8_1= ruleLogicalEnumerationLabel
            	            {

            	            							newCompositeNode(grammarAccess.getLogicalEnumeratedAccess().getLabelLogicalEnumerationLabelParserRuleCall_7_0_0_0());
            	            						
            	            pushFollow(FOLLOW_53);
            	            lv_label_8_1=ruleLogicalEnumerationLabel();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getLogicalEnumeratedRule());
            	            							}
            	            							add(
            	            								current,
            	            								"label",
            	            								lv_label_8_1,
            	            								"com.epistimis.uddl.Uddl.LogicalEnumerationLabel");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalUddl.g:3382:7: lv_label_8_2= ruleLogicalEnumeratedSet
            	            {

            	            							newCompositeNode(grammarAccess.getLogicalEnumeratedAccess().getLabelLogicalEnumeratedSetParserRuleCall_7_0_0_1());
            	            						
            	            pushFollow(FOLLOW_53);
            	            lv_label_8_2=ruleLogicalEnumeratedSet();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getLogicalEnumeratedRule());
            	            							}
            	            							add(
            	            								current,
            	            								"label",
            	            								lv_label_8_2,
            	            								"com.epistimis.uddl.Uddl.LogicalEnumeratedSet");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalUddl.g:3400:4: (otherlv_9= ',' )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==62) ) {
            	        alt72=1;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // InternalUddl.g:3401:5: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,62,FOLLOW_54); 

            	            					newLeafNode(otherlv_9, grammarAccess.getLogicalEnumeratedAccess().getCommaKeyword_7_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_10=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalEnumeratedAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLogicalEnumeratedAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleLogicalEnumerated"


    // $ANTLR start "entryRuleLogicalEnumeratedBase"
    // InternalUddl.g:3419:1: entryRuleLogicalEnumeratedBase returns [EObject current=null] : iv_ruleLogicalEnumeratedBase= ruleLogicalEnumeratedBase EOF ;
    public final EObject entryRuleLogicalEnumeratedBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalEnumeratedBase = null;


        try {
            // InternalUddl.g:3419:62: (iv_ruleLogicalEnumeratedBase= ruleLogicalEnumeratedBase EOF )
            // InternalUddl.g:3420:2: iv_ruleLogicalEnumeratedBase= ruleLogicalEnumeratedBase EOF
            {
             newCompositeNode(grammarAccess.getLogicalEnumeratedBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalEnumeratedBase=ruleLogicalEnumeratedBase();

            state._fsp--;

             current =iv_ruleLogicalEnumeratedBase; 
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
    // $ANTLR end "entryRuleLogicalEnumeratedBase"


    // $ANTLR start "ruleLogicalEnumeratedBase"
    // InternalUddl.g:3426:1: ruleLogicalEnumeratedBase returns [EObject current=null] : (this_LogicalEnumeratedSet_0= ruleLogicalEnumeratedSet | this_LogicalEnumerationLabel_1= ruleLogicalEnumerationLabel | this_LogicalEnumerated_2= ruleLogicalEnumerated ) ;
    public final EObject ruleLogicalEnumeratedBase() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalEnumeratedSet_0 = null;

        EObject this_LogicalEnumerationLabel_1 = null;

        EObject this_LogicalEnumerated_2 = null;



        	enterRule();

        try {
            // InternalUddl.g:3432:2: ( (this_LogicalEnumeratedSet_0= ruleLogicalEnumeratedSet | this_LogicalEnumerationLabel_1= ruleLogicalEnumerationLabel | this_LogicalEnumerated_2= ruleLogicalEnumerated ) )
            // InternalUddl.g:3433:2: (this_LogicalEnumeratedSet_0= ruleLogicalEnumeratedSet | this_LogicalEnumerationLabel_1= ruleLogicalEnumerationLabel | this_LogicalEnumerated_2= ruleLogicalEnumerated )
            {
            // InternalUddl.g:3433:2: (this_LogicalEnumeratedSet_0= ruleLogicalEnumeratedSet | this_LogicalEnumerationLabel_1= ruleLogicalEnumerationLabel | this_LogicalEnumerated_2= ruleLogicalEnumerated )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==RULE_ID) ) {
                    int LA74_4 = input.LA(3);

                    if ( (LA74_4==RULE_STRING) ) {
                        int LA74_5 = input.LA(4);

                        if ( (LA74_5==64) ) {
                            alt74=2;
                        }
                        else if ( (LA74_5==28) ) {
                            alt74=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA74_4==28) ) {
                        alt74=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt74=2;
                }
                break;
            case 60:
                {
                alt74=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalUddl.g:3434:3: this_LogicalEnumeratedSet_0= ruleLogicalEnumeratedSet
                    {

                    			newCompositeNode(grammarAccess.getLogicalEnumeratedBaseAccess().getLogicalEnumeratedSetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalEnumeratedSet_0=ruleLogicalEnumeratedSet();

                    state._fsp--;


                    			current = this_LogicalEnumeratedSet_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:3443:3: this_LogicalEnumerationLabel_1= ruleLogicalEnumerationLabel
                    {

                    			newCompositeNode(grammarAccess.getLogicalEnumeratedBaseAccess().getLogicalEnumerationLabelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalEnumerationLabel_1=ruleLogicalEnumerationLabel();

                    state._fsp--;


                    			current = this_LogicalEnumerationLabel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:3452:3: this_LogicalEnumerated_2= ruleLogicalEnumerated
                    {

                    			newCompositeNode(grammarAccess.getLogicalEnumeratedBaseAccess().getLogicalEnumeratedParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalEnumerated_2=ruleLogicalEnumerated();

                    state._fsp--;


                    			current = this_LogicalEnumerated_2;
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
    // $ANTLR end "ruleLogicalEnumeratedBase"


    // $ANTLR start "entryRuleLogicalEnumeratedSet"
    // InternalUddl.g:3464:1: entryRuleLogicalEnumeratedSet returns [EObject current=null] : iv_ruleLogicalEnumeratedSet= ruleLogicalEnumeratedSet EOF ;
    public final EObject entryRuleLogicalEnumeratedSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalEnumeratedSet = null;


        try {
            // InternalUddl.g:3464:61: (iv_ruleLogicalEnumeratedSet= ruleLogicalEnumeratedSet EOF )
            // InternalUddl.g:3465:2: iv_ruleLogicalEnumeratedSet= ruleLogicalEnumeratedSet EOF
            {
             newCompositeNode(grammarAccess.getLogicalEnumeratedSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalEnumeratedSet=ruleLogicalEnumeratedSet();

            state._fsp--;

             current =iv_ruleLogicalEnumeratedSet; 
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
    // $ANTLR end "entryRuleLogicalEnumeratedSet"


    // $ANTLR start "ruleLogicalEnumeratedSet"
    // InternalUddl.g:3471:1: ruleLogicalEnumeratedSet returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '[' ( ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_5= ',' )? ( ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? )* otherlv_8= ']' otherlv_9= ')' ) ;
    public final EObject ruleLogicalEnumeratedSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_label_4_1 = null;

        EObject lv_label_4_2 = null;

        EObject lv_label_6_1 = null;

        EObject lv_label_6_2 = null;



        	enterRule();

        try {
            // InternalUddl.g:3477:2: ( (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '[' ( ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_5= ',' )? ( ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? )* otherlv_8= ']' otherlv_9= ')' ) )
            // InternalUddl.g:3478:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '[' ( ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_5= ',' )? ( ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? )* otherlv_8= ']' otherlv_9= ')' )
            {
            // InternalUddl.g:3478:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '[' ( ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_5= ',' )? ( ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? )* otherlv_8= ']' otherlv_9= ')' )
            // InternalUddl.g:3479:3: otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '[' ( ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_5= ',' )? ( ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? )* otherlv_8= ']' otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalEnumeratedSetAccess().getLeftParenthesisKeyword_0());
            		
            // InternalUddl.g:3483:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3484:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3484:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3485:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalEnumeratedSetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalEnumeratedSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3501:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_STRING) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalUddl.g:3502:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3502:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3503:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalEnumeratedSetAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalEnumeratedSetRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FOLLOW_52); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalEnumeratedSetAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalUddl.g:3523:3: ( ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) ) )
            // InternalUddl.g:3524:4: ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) )
            {
            // InternalUddl.g:3524:4: ( (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet ) )
            // InternalUddl.g:3525:5: (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet )
            {
            // InternalUddl.g:3525:5: (lv_label_4_1= ruleLogicalEnumerationLabel | lv_label_4_2= ruleLogicalEnumeratedSet )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                alt76=1;
            }
            else if ( (LA76_0==63) ) {
                int LA76_2 = input.LA(2);

                if ( (LA76_2==RULE_ID) ) {
                    int LA76_3 = input.LA(3);

                    if ( (LA76_3==RULE_STRING) ) {
                        int LA76_4 = input.LA(4);

                        if ( (LA76_4==28) ) {
                            alt76=2;
                        }
                        else if ( (LA76_4==64) ) {
                            alt76=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 76, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA76_3==28) ) {
                        alt76=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalUddl.g:3526:6: lv_label_4_1= ruleLogicalEnumerationLabel
                    {

                    						newCompositeNode(grammarAccess.getLogicalEnumeratedSetAccess().getLabelLogicalEnumerationLabelParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_label_4_1=ruleLogicalEnumerationLabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalEnumeratedSetRule());
                    						}
                    						add(
                    							current,
                    							"label",
                    							lv_label_4_1,
                    							"com.epistimis.uddl.Uddl.LogicalEnumerationLabel");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalUddl.g:3542:6: lv_label_4_2= ruleLogicalEnumeratedSet
                    {

                    						newCompositeNode(grammarAccess.getLogicalEnumeratedSetAccess().getLabelLogicalEnumeratedSetParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_53);
                    lv_label_4_2=ruleLogicalEnumeratedSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalEnumeratedSetRule());
                    						}
                    						add(
                    							current,
                    							"label",
                    							lv_label_4_2,
                    							"com.epistimis.uddl.Uddl.LogicalEnumeratedSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalUddl.g:3560:3: (otherlv_5= ',' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==62) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalUddl.g:3561:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_54); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogicalEnumeratedSetAccess().getCommaKeyword_5());
                    			

                    }
                    break;

            }

            // InternalUddl.g:3566:3: ( ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )? )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==RULE_ID||LA80_0==63) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalUddl.g:3567:4: ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) ) (otherlv_7= ',' )?
            	    {
            	    // InternalUddl.g:3567:4: ( ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) ) )
            	    // InternalUddl.g:3568:5: ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) )
            	    {
            	    // InternalUddl.g:3568:5: ( (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet ) )
            	    // InternalUddl.g:3569:6: (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet )
            	    {
            	    // InternalUddl.g:3569:6: (lv_label_6_1= ruleLogicalEnumerationLabel | lv_label_6_2= ruleLogicalEnumeratedSet )
            	    int alt78=2;
            	    int LA78_0 = input.LA(1);

            	    if ( (LA78_0==RULE_ID) ) {
            	        alt78=1;
            	    }
            	    else if ( (LA78_0==63) ) {
            	        int LA78_2 = input.LA(2);

            	        if ( (LA78_2==RULE_ID) ) {
            	            int LA78_3 = input.LA(3);

            	            if ( (LA78_3==RULE_STRING) ) {
            	                int LA78_4 = input.LA(4);

            	                if ( (LA78_4==64) ) {
            	                    alt78=1;
            	                }
            	                else if ( (LA78_4==28) ) {
            	                    alt78=2;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 78, 4, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA78_3==28) ) {
            	                alt78=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 78, 3, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 78, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 78, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt78) {
            	        case 1 :
            	            // InternalUddl.g:3570:7: lv_label_6_1= ruleLogicalEnumerationLabel
            	            {

            	            							newCompositeNode(grammarAccess.getLogicalEnumeratedSetAccess().getLabelLogicalEnumerationLabelParserRuleCall_6_0_0_0());
            	            						
            	            pushFollow(FOLLOW_53);
            	            lv_label_6_1=ruleLogicalEnumerationLabel();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getLogicalEnumeratedSetRule());
            	            							}
            	            							add(
            	            								current,
            	            								"label",
            	            								lv_label_6_1,
            	            								"com.epistimis.uddl.Uddl.LogicalEnumerationLabel");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalUddl.g:3586:7: lv_label_6_2= ruleLogicalEnumeratedSet
            	            {

            	            							newCompositeNode(grammarAccess.getLogicalEnumeratedSetAccess().getLabelLogicalEnumeratedSetParserRuleCall_6_0_0_1());
            	            						
            	            pushFollow(FOLLOW_53);
            	            lv_label_6_2=ruleLogicalEnumeratedSet();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getLogicalEnumeratedSetRule());
            	            							}
            	            							add(
            	            								current,
            	            								"label",
            	            								lv_label_6_2,
            	            								"com.epistimis.uddl.Uddl.LogicalEnumeratedSet");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalUddl.g:3604:4: (otherlv_7= ',' )?
            	    int alt79=2;
            	    int LA79_0 = input.LA(1);

            	    if ( (LA79_0==62) ) {
            	        alt79=1;
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // InternalUddl.g:3605:5: otherlv_7= ','
            	            {
            	            otherlv_7=(Token)match(input,62,FOLLOW_54); 

            	            					newLeafNode(otherlv_7, grammarAccess.getLogicalEnumeratedSetAccess().getCommaKeyword_6_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            otherlv_8=(Token)match(input,29,FOLLOW_56); 

            			newLeafNode(otherlv_8, grammarAccess.getLogicalEnumeratedSetAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,64,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLogicalEnumeratedSetAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleLogicalEnumeratedSet"


    // $ANTLR start "entryRuleLogicalEnumerationLabel"
    // InternalUddl.g:3623:1: entryRuleLogicalEnumerationLabel returns [EObject current=null] : iv_ruleLogicalEnumerationLabel= ruleLogicalEnumerationLabel EOF ;
    public final EObject entryRuleLogicalEnumerationLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalEnumerationLabel = null;


        try {
            // InternalUddl.g:3623:64: (iv_ruleLogicalEnumerationLabel= ruleLogicalEnumerationLabel EOF )
            // InternalUddl.g:3624:2: iv_ruleLogicalEnumerationLabel= ruleLogicalEnumerationLabel EOF
            {
             newCompositeNode(grammarAccess.getLogicalEnumerationLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalEnumerationLabel=ruleLogicalEnumerationLabel();

            state._fsp--;

             current =iv_ruleLogicalEnumerationLabel; 
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
    // $ANTLR end "entryRuleLogicalEnumerationLabel"


    // $ANTLR start "ruleLogicalEnumerationLabel"
    // InternalUddl.g:3630:1: ruleLogicalEnumerationLabel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleLogicalEnumerationLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUddl.g:3636:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' ) ) )
            // InternalUddl.g:3637:2: ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            {
            // InternalUddl.g:3637:2: ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            else if ( (LA81_0==63) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalUddl.g:3638:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalUddl.g:3638:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalUddl.g:3639:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalUddl.g:3639:4: (lv_name_0_0= RULE_ID )
                    // InternalUddl.g:3640:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getLogicalEnumerationLabelAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalEnumerationLabelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUddl.g:3657:3: (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )
                    {
                    // InternalUddl.g:3657:3: (otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )
                    // InternalUddl.g:3658:4: otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getLogicalEnumerationLabelAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalUddl.g:3662:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalUddl.g:3663:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalUddl.g:3663:5: (lv_name_2_0= RULE_ID )
                    // InternalUddl.g:3664:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_41); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getLogicalEnumerationLabelAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalEnumerationLabelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalUddl.g:3680:4: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalUddl.g:3681:5: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalUddl.g:3681:5: (lv_description_3_0= RULE_STRING )
                    // InternalUddl.g:3682:6: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

                    						newLeafNode(lv_description_3_0, grammarAccess.getLogicalEnumerationLabelAccess().getDescriptionSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalEnumerationLabelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,64,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogicalEnumerationLabelAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleLogicalEnumerationLabel"


    // $ANTLR start "entryRuleLogicalCoordinateSystem"
    // InternalUddl.g:3707:1: entryRuleLogicalCoordinateSystem returns [EObject current=null] : iv_ruleLogicalCoordinateSystem= ruleLogicalCoordinateSystem EOF ;
    public final EObject entryRuleLogicalCoordinateSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalCoordinateSystem = null;


        try {
            // InternalUddl.g:3707:64: (iv_ruleLogicalCoordinateSystem= ruleLogicalCoordinateSystem EOF )
            // InternalUddl.g:3708:2: iv_ruleLogicalCoordinateSystem= ruleLogicalCoordinateSystem EOF
            {
             newCompositeNode(grammarAccess.getLogicalCoordinateSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalCoordinateSystem=ruleLogicalCoordinateSystem();

            state._fsp--;

             current =iv_ruleLogicalCoordinateSystem; 
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
    // $ANTLR end "entryRuleLogicalCoordinateSystem"


    // $ANTLR start "ruleLogicalCoordinateSystem"
    // InternalUddl.g:3714:1: ruleLogicalCoordinateSystem returns [EObject current=null] : (otherlv_0= 'coord' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= 'axis:' ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) ) )? (otherlv_6= 'angleEq:' ( (lv_angleEquation_7_0= RULE_STRING ) ) )? (otherlv_8= 'distanceEq:' ( (lv_distanceEquation_9_0= RULE_STRING ) ) )? otherlv_10= '[' ( ( ruleQN ) )+ otherlv_12= ']' otherlv_13= '};' ) ;
    public final EObject ruleLogicalCoordinateSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_axisRelationshipDescription_5_0=null;
        Token otherlv_6=null;
        Token lv_angleEquation_7_0=null;
        Token otherlv_8=null;
        Token lv_distanceEquation_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalUddl.g:3720:2: ( (otherlv_0= 'coord' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= 'axis:' ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) ) )? (otherlv_6= 'angleEq:' ( (lv_angleEquation_7_0= RULE_STRING ) ) )? (otherlv_8= 'distanceEq:' ( (lv_distanceEquation_9_0= RULE_STRING ) ) )? otherlv_10= '[' ( ( ruleQN ) )+ otherlv_12= ']' otherlv_13= '};' ) )
            // InternalUddl.g:3721:2: (otherlv_0= 'coord' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= 'axis:' ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) ) )? (otherlv_6= 'angleEq:' ( (lv_angleEquation_7_0= RULE_STRING ) ) )? (otherlv_8= 'distanceEq:' ( (lv_distanceEquation_9_0= RULE_STRING ) ) )? otherlv_10= '[' ( ( ruleQN ) )+ otherlv_12= ']' otherlv_13= '};' )
            {
            // InternalUddl.g:3721:2: (otherlv_0= 'coord' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= 'axis:' ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) ) )? (otherlv_6= 'angleEq:' ( (lv_angleEquation_7_0= RULE_STRING ) ) )? (otherlv_8= 'distanceEq:' ( (lv_distanceEquation_9_0= RULE_STRING ) ) )? otherlv_10= '[' ( ( ruleQN ) )+ otherlv_12= ']' otherlv_13= '};' )
            // InternalUddl.g:3722:3: otherlv_0= 'coord' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' (otherlv_4= 'axis:' ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) ) )? (otherlv_6= 'angleEq:' ( (lv_angleEquation_7_0= RULE_STRING ) ) )? (otherlv_8= 'distanceEq:' ( (lv_distanceEquation_9_0= RULE_STRING ) ) )? otherlv_10= '[' ( ( ruleQN ) )+ otherlv_12= ']' otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalCoordinateSystemAccess().getCoordKeyword_0());
            		
            // InternalUddl.g:3726:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3727:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3727:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3728:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalCoordinateSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCoordinateSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3744:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_STRING) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalUddl.g:3745:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3745:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3746:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalCoordinateSystemAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalCoordinateSystemRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalCoordinateSystemAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:3766:3: (otherlv_4= 'axis:' ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==66) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalUddl.g:3767:4: otherlv_4= 'axis:' ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,66,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogicalCoordinateSystemAccess().getAxisKeyword_4_0());
                    			
                    // InternalUddl.g:3771:4: ( (lv_axisRelationshipDescription_5_0= RULE_STRING ) )
                    // InternalUddl.g:3772:5: (lv_axisRelationshipDescription_5_0= RULE_STRING )
                    {
                    // InternalUddl.g:3772:5: (lv_axisRelationshipDescription_5_0= RULE_STRING )
                    // InternalUddl.g:3773:6: lv_axisRelationshipDescription_5_0= RULE_STRING
                    {
                    lv_axisRelationshipDescription_5_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

                    						newLeafNode(lv_axisRelationshipDescription_5_0, grammarAccess.getLogicalCoordinateSystemAccess().getAxisRelationshipDescriptionSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalCoordinateSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"axisRelationshipDescription",
                    							lv_axisRelationshipDescription_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUddl.g:3790:3: (otherlv_6= 'angleEq:' ( (lv_angleEquation_7_0= RULE_STRING ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==67) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalUddl.g:3791:4: otherlv_6= 'angleEq:' ( (lv_angleEquation_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,67,FOLLOW_41); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalCoordinateSystemAccess().getAngleEqKeyword_5_0());
                    			
                    // InternalUddl.g:3795:4: ( (lv_angleEquation_7_0= RULE_STRING ) )
                    // InternalUddl.g:3796:5: (lv_angleEquation_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:3796:5: (lv_angleEquation_7_0= RULE_STRING )
                    // InternalUddl.g:3797:6: lv_angleEquation_7_0= RULE_STRING
                    {
                    lv_angleEquation_7_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

                    						newLeafNode(lv_angleEquation_7_0, grammarAccess.getLogicalCoordinateSystemAccess().getAngleEquationSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalCoordinateSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"angleEquation",
                    							lv_angleEquation_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUddl.g:3814:3: (otherlv_8= 'distanceEq:' ( (lv_distanceEquation_9_0= RULE_STRING ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==68) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalUddl.g:3815:4: otherlv_8= 'distanceEq:' ( (lv_distanceEquation_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,68,FOLLOW_41); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalCoordinateSystemAccess().getDistanceEqKeyword_6_0());
                    			
                    // InternalUddl.g:3819:4: ( (lv_distanceEquation_9_0= RULE_STRING ) )
                    // InternalUddl.g:3820:5: (lv_distanceEquation_9_0= RULE_STRING )
                    {
                    // InternalUddl.g:3820:5: (lv_distanceEquation_9_0= RULE_STRING )
                    // InternalUddl.g:3821:6: lv_distanceEquation_9_0= RULE_STRING
                    {
                    lv_distanceEquation_9_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_distanceEquation_9_0, grammarAccess.getLogicalCoordinateSystemAccess().getDistanceEquationSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalCoordinateSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"distanceEquation",
                    							lv_distanceEquation_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalCoordinateSystemAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalUddl.g:3842:3: ( ( ruleQN ) )+
            int cnt86=0;
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==RULE_ID) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalUddl.g:3843:4: ( ruleQN )
            	    {
            	    // InternalUddl.g:3843:4: ( ruleQN )
            	    // InternalUddl.g:3844:5: ruleQN
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLogicalCoordinateSystemRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getLogicalCoordinateSystemAccess().getAxisLogicalCoordinateSystemAxisCrossReference_8_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    ruleQN();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt86 >= 1 ) break loop86;
                        EarlyExitException eee =
                            new EarlyExitException(86, input);
                        throw eee;
                }
                cnt86++;
            } while (true);

            otherlv_12=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_12, grammarAccess.getLogicalCoordinateSystemAccess().getRightSquareBracketKeyword_9());
            		
            otherlv_13=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalCoordinateSystemAccess().getRightCurlyBracketSemicolonKeyword_10());
            		

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
    // $ANTLR end "ruleLogicalCoordinateSystem"


    // $ANTLR start "entryRuleLogicalCoordinateSystemAxis"
    // InternalUddl.g:3870:1: entryRuleLogicalCoordinateSystemAxis returns [EObject current=null] : iv_ruleLogicalCoordinateSystemAxis= ruleLogicalCoordinateSystemAxis EOF ;
    public final EObject entryRuleLogicalCoordinateSystemAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalCoordinateSystemAxis = null;


        try {
            // InternalUddl.g:3870:68: (iv_ruleLogicalCoordinateSystemAxis= ruleLogicalCoordinateSystemAxis EOF )
            // InternalUddl.g:3871:2: iv_ruleLogicalCoordinateSystemAxis= ruleLogicalCoordinateSystemAxis EOF
            {
             newCompositeNode(grammarAccess.getLogicalCoordinateSystemAxisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalCoordinateSystemAxis=ruleLogicalCoordinateSystemAxis();

            state._fsp--;

             current =iv_ruleLogicalCoordinateSystemAxis; 
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
    // $ANTLR end "entryRuleLogicalCoordinateSystemAxis"


    // $ANTLR start "ruleLogicalCoordinateSystemAxis"
    // InternalUddl.g:3877:1: ruleLogicalCoordinateSystemAxis returns [EObject current=null] : (otherlv_0= 'csa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalCoordinateSystemAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:3883:2: ( (otherlv_0= 'csa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:3884:2: (otherlv_0= 'csa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:3884:2: (otherlv_0= 'csa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:3885:3: otherlv_0= 'csa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalCoordinateSystemAxisAccess().getCsaKeyword_0());
            		
            // InternalUddl.g:3889:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3890:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3890:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3891:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalCoordinateSystemAxisAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCoordinateSystemAxisRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:3907:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_STRING) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalUddl.g:3908:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:3908:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:3909:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalCoordinateSystemAxisAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalCoordinateSystemAxisRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalCoordinateSystemAxisAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalCoordinateSystemAxis"


    // $ANTLR start "entryRuleLogicalAbstractMeasurementSystem"
    // InternalUddl.g:3933:1: entryRuleLogicalAbstractMeasurementSystem returns [EObject current=null] : iv_ruleLogicalAbstractMeasurementSystem= ruleLogicalAbstractMeasurementSystem EOF ;
    public final EObject entryRuleLogicalAbstractMeasurementSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAbstractMeasurementSystem = null;


        try {
            // InternalUddl.g:3933:73: (iv_ruleLogicalAbstractMeasurementSystem= ruleLogicalAbstractMeasurementSystem EOF )
            // InternalUddl.g:3934:2: iv_ruleLogicalAbstractMeasurementSystem= ruleLogicalAbstractMeasurementSystem EOF
            {
             newCompositeNode(grammarAccess.getLogicalAbstractMeasurementSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAbstractMeasurementSystem=ruleLogicalAbstractMeasurementSystem();

            state._fsp--;

             current =iv_ruleLogicalAbstractMeasurementSystem; 
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
    // $ANTLR end "entryRuleLogicalAbstractMeasurementSystem"


    // $ANTLR start "ruleLogicalAbstractMeasurementSystem"
    // InternalUddl.g:3940:1: ruleLogicalAbstractMeasurementSystem returns [EObject current=null] : (this_LogicalStandardMeasurementSystem_0= ruleLogicalStandardMeasurementSystem | this_LogicalMeasurementSystem_1= ruleLogicalMeasurementSystem ) ;
    public final EObject ruleLogicalAbstractMeasurementSystem() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalStandardMeasurementSystem_0 = null;

        EObject this_LogicalMeasurementSystem_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:3946:2: ( (this_LogicalStandardMeasurementSystem_0= ruleLogicalStandardMeasurementSystem | this_LogicalMeasurementSystem_1= ruleLogicalMeasurementSystem ) )
            // InternalUddl.g:3947:2: (this_LogicalStandardMeasurementSystem_0= ruleLogicalStandardMeasurementSystem | this_LogicalMeasurementSystem_1= ruleLogicalMeasurementSystem )
            {
            // InternalUddl.g:3947:2: (this_LogicalStandardMeasurementSystem_0= ruleLogicalStandardMeasurementSystem | this_LogicalMeasurementSystem_1= ruleLogicalMeasurementSystem )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==70) ) {
                alt88=1;
            }
            else if ( (LA88_0==73) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalUddl.g:3948:3: this_LogicalStandardMeasurementSystem_0= ruleLogicalStandardMeasurementSystem
                    {

                    			newCompositeNode(grammarAccess.getLogicalAbstractMeasurementSystemAccess().getLogicalStandardMeasurementSystemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalStandardMeasurementSystem_0=ruleLogicalStandardMeasurementSystem();

                    state._fsp--;


                    			current = this_LogicalStandardMeasurementSystem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:3957:3: this_LogicalMeasurementSystem_1= ruleLogicalMeasurementSystem
                    {

                    			newCompositeNode(grammarAccess.getLogicalAbstractMeasurementSystemAccess().getLogicalMeasurementSystemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalMeasurementSystem_1=ruleLogicalMeasurementSystem();

                    state._fsp--;


                    			current = this_LogicalMeasurementSystem_1;
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
    // $ANTLR end "ruleLogicalAbstractMeasurementSystem"


    // $ANTLR start "entryRuleLogicalStandardMeasurementSystem"
    // InternalUddl.g:3969:1: entryRuleLogicalStandardMeasurementSystem returns [EObject current=null] : iv_ruleLogicalStandardMeasurementSystem= ruleLogicalStandardMeasurementSystem EOF ;
    public final EObject entryRuleLogicalStandardMeasurementSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalStandardMeasurementSystem = null;


        try {
            // InternalUddl.g:3969:73: (iv_ruleLogicalStandardMeasurementSystem= ruleLogicalStandardMeasurementSystem EOF )
            // InternalUddl.g:3970:2: iv_ruleLogicalStandardMeasurementSystem= ruleLogicalStandardMeasurementSystem EOF
            {
             newCompositeNode(grammarAccess.getLogicalStandardMeasurementSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalStandardMeasurementSystem=ruleLogicalStandardMeasurementSystem();

            state._fsp--;

             current =iv_ruleLogicalStandardMeasurementSystem; 
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
    // $ANTLR end "entryRuleLogicalStandardMeasurementSystem"


    // $ANTLR start "ruleLogicalStandardMeasurementSystem"
    // InternalUddl.g:3976:1: ruleLogicalStandardMeasurementSystem returns [EObject current=null] : (otherlv_0= 'smsys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'refStd:' ( (lv_referenceStandard_5_0= RULE_STRING ) ) otherlv_6= '};' ) ;
    public final EObject ruleLogicalStandardMeasurementSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_referenceStandard_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalUddl.g:3982:2: ( (otherlv_0= 'smsys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'refStd:' ( (lv_referenceStandard_5_0= RULE_STRING ) ) otherlv_6= '};' ) )
            // InternalUddl.g:3983:2: (otherlv_0= 'smsys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'refStd:' ( (lv_referenceStandard_5_0= RULE_STRING ) ) otherlv_6= '};' )
            {
            // InternalUddl.g:3983:2: (otherlv_0= 'smsys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'refStd:' ( (lv_referenceStandard_5_0= RULE_STRING ) ) otherlv_6= '};' )
            // InternalUddl.g:3984:3: otherlv_0= 'smsys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'refStd:' ( (lv_referenceStandard_5_0= RULE_STRING ) ) otherlv_6= '};'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalStandardMeasurementSystemAccess().getSmsysKeyword_0());
            		
            // InternalUddl.g:3988:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:3989:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:3989:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:3990:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalStandardMeasurementSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalStandardMeasurementSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:4006:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_STRING) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalUddl.g:4007:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:4007:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:4008:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalStandardMeasurementSystemAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalStandardMeasurementSystemRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalStandardMeasurementSystemAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,71,FOLLOW_41); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalStandardMeasurementSystemAccess().getRefStdKeyword_4());
            		
            // InternalUddl.g:4032:3: ( (lv_referenceStandard_5_0= RULE_STRING ) )
            // InternalUddl.g:4033:4: (lv_referenceStandard_5_0= RULE_STRING )
            {
            // InternalUddl.g:4033:4: (lv_referenceStandard_5_0= RULE_STRING )
            // InternalUddl.g:4034:5: lv_referenceStandard_5_0= RULE_STRING
            {
            lv_referenceStandard_5_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_referenceStandard_5_0, grammarAccess.getLogicalStandardMeasurementSystemAccess().getReferenceStandardSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalStandardMeasurementSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"referenceStandard",
            						lv_referenceStandard_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalStandardMeasurementSystemAccess().getRightCurlyBracketSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleLogicalStandardMeasurementSystem"


    // $ANTLR start "entryRuleLogicalLandmark"
    // InternalUddl.g:4058:1: entryRuleLogicalLandmark returns [EObject current=null] : iv_ruleLogicalLandmark= ruleLogicalLandmark EOF ;
    public final EObject entryRuleLogicalLandmark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalLandmark = null;


        try {
            // InternalUddl.g:4058:56: (iv_ruleLogicalLandmark= ruleLogicalLandmark EOF )
            // InternalUddl.g:4059:2: iv_ruleLogicalLandmark= ruleLogicalLandmark EOF
            {
             newCompositeNode(grammarAccess.getLogicalLandmarkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalLandmark=ruleLogicalLandmark();

            state._fsp--;

             current =iv_ruleLogicalLandmark; 
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
    // $ANTLR end "entryRuleLogicalLandmark"


    // $ANTLR start "ruleLogicalLandmark"
    // InternalUddl.g:4065:1: ruleLogicalLandmark returns [EObject current=null] : (otherlv_0= 'landmark' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleLogicalLandmark() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUddl.g:4071:2: ( (otherlv_0= 'landmark' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUddl.g:4072:2: (otherlv_0= 'landmark' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUddl.g:4072:2: (otherlv_0= 'landmark' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUddl.g:4073:3: otherlv_0= 'landmark' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalLandmarkAccess().getLandmarkKeyword_0());
            		
            // InternalUddl.g:4077:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:4078:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:4078:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:4079:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalLandmarkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalLandmarkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:4095:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_STRING) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalUddl.g:4096:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:4096:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:4097:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalLandmarkAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalLandmarkRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalLandmarkAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalLandmark"


    // $ANTLR start "entryRuleLogicalMeasurementSystem"
    // InternalUddl.g:4121:1: entryRuleLogicalMeasurementSystem returns [EObject current=null] : iv_ruleLogicalMeasurementSystem= ruleLogicalMeasurementSystem EOF ;
    public final EObject entryRuleLogicalMeasurementSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurementSystem = null;


        try {
            // InternalUddl.g:4121:65: (iv_ruleLogicalMeasurementSystem= ruleLogicalMeasurementSystem EOF )
            // InternalUddl.g:4122:2: iv_ruleLogicalMeasurementSystem= ruleLogicalMeasurementSystem EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurementSystem=ruleLogicalMeasurementSystem();

            state._fsp--;

             current =iv_ruleLogicalMeasurementSystem; 
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
    // $ANTLR end "entryRuleLogicalMeasurementSystem"


    // $ANTLR start "ruleLogicalMeasurementSystem"
    // InternalUddl.g:4128:1: ruleLogicalMeasurementSystem returns [EObject current=null] : (otherlv_0= 'msys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'msa:' otherlv_5= '[' ( ( ruleQN ) )+ otherlv_7= ']' otherlv_8= 'coord:' ( ( ruleQN ) ) (otherlv_10= 'extRefStd:' ( (lv_externalStandardReference_11_0= RULE_STRING ) ) )? (otherlv_12= 'orient:' ( (lv_orientation_13_0= RULE_STRING ) ) )? (otherlv_14= 'refPt:' otherlv_15= '[' ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+ otherlv_17= ']' )? (otherlv_18= '![' ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+ otherlv_20= ']' )? otherlv_21= '};' ) ;
    public final EObject ruleLogicalMeasurementSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_externalStandardReference_11_0=null;
        Token otherlv_12=null;
        Token lv_orientation_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_referencePoint_16_0 = null;

        EObject lv_constraint_19_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:4134:2: ( (otherlv_0= 'msys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'msa:' otherlv_5= '[' ( ( ruleQN ) )+ otherlv_7= ']' otherlv_8= 'coord:' ( ( ruleQN ) ) (otherlv_10= 'extRefStd:' ( (lv_externalStandardReference_11_0= RULE_STRING ) ) )? (otherlv_12= 'orient:' ( (lv_orientation_13_0= RULE_STRING ) ) )? (otherlv_14= 'refPt:' otherlv_15= '[' ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+ otherlv_17= ']' )? (otherlv_18= '![' ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+ otherlv_20= ']' )? otherlv_21= '};' ) )
            // InternalUddl.g:4135:2: (otherlv_0= 'msys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'msa:' otherlv_5= '[' ( ( ruleQN ) )+ otherlv_7= ']' otherlv_8= 'coord:' ( ( ruleQN ) ) (otherlv_10= 'extRefStd:' ( (lv_externalStandardReference_11_0= RULE_STRING ) ) )? (otherlv_12= 'orient:' ( (lv_orientation_13_0= RULE_STRING ) ) )? (otherlv_14= 'refPt:' otherlv_15= '[' ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+ otherlv_17= ']' )? (otherlv_18= '![' ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+ otherlv_20= ']' )? otherlv_21= '};' )
            {
            // InternalUddl.g:4135:2: (otherlv_0= 'msys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'msa:' otherlv_5= '[' ( ( ruleQN ) )+ otherlv_7= ']' otherlv_8= 'coord:' ( ( ruleQN ) ) (otherlv_10= 'extRefStd:' ( (lv_externalStandardReference_11_0= RULE_STRING ) ) )? (otherlv_12= 'orient:' ( (lv_orientation_13_0= RULE_STRING ) ) )? (otherlv_14= 'refPt:' otherlv_15= '[' ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+ otherlv_17= ']' )? (otherlv_18= '![' ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+ otherlv_20= ']' )? otherlv_21= '};' )
            // InternalUddl.g:4136:3: otherlv_0= 'msys' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'msa:' otherlv_5= '[' ( ( ruleQN ) )+ otherlv_7= ']' otherlv_8= 'coord:' ( ( ruleQN ) ) (otherlv_10= 'extRefStd:' ( (lv_externalStandardReference_11_0= RULE_STRING ) ) )? (otherlv_12= 'orient:' ( (lv_orientation_13_0= RULE_STRING ) ) )? (otherlv_14= 'refPt:' otherlv_15= '[' ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+ otherlv_17= ']' )? (otherlv_18= '![' ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+ otherlv_20= ']' )? otherlv_21= '};'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalMeasurementSystemAccess().getMsysKeyword_0());
            		
            // InternalUddl.g:4140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:4141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:4141:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:4142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalMeasurementSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:4158:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_STRING) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalUddl.g:4159:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:4159:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:4160:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalMeasurementSystemAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalMeasurementSystemRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalMeasurementSystemAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,74,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalMeasurementSystemAccess().getMsaKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalMeasurementSystemAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalUddl.g:4188:3: ( ( ruleQN ) )+
            int cnt92=0;
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==RULE_ID) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalUddl.g:4189:4: ( ruleQN )
            	    {
            	    // InternalUddl.g:4189:4: ( ruleQN )
            	    // InternalUddl.g:4190:5: ruleQN
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLogicalMeasurementSystemRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getLogicalMeasurementSystemAccess().getMeasurementSystemAxisLogicalMeasurementSystemAxisCrossReference_6_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    ruleQN();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt92 >= 1 ) break loop92;
                        EarlyExitException eee =
                            new EarlyExitException(92, input);
                        throw eee;
                }
                cnt92++;
            } while (true);

            otherlv_7=(Token)match(input,29,FOLLOW_62); 

            			newLeafNode(otherlv_7, grammarAccess.getLogicalMeasurementSystemAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,75,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getLogicalMeasurementSystemAccess().getCoordKeyword_8());
            		
            // InternalUddl.g:4212:3: ( ( ruleQN ) )
            // InternalUddl.g:4213:4: ( ruleQN )
            {
            // InternalUddl.g:4213:4: ( ruleQN )
            // InternalUddl.g:4214:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementSystemAccess().getCoordinateSystemLogicalCoordinateSystemCrossReference_9_0());
            				
            pushFollow(FOLLOW_63);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:4228:3: (otherlv_10= 'extRefStd:' ( (lv_externalStandardReference_11_0= RULE_STRING ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==76) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalUddl.g:4229:4: otherlv_10= 'extRefStd:' ( (lv_externalStandardReference_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,76,FOLLOW_41); 

                    				newLeafNode(otherlv_10, grammarAccess.getLogicalMeasurementSystemAccess().getExtRefStdKeyword_10_0());
                    			
                    // InternalUddl.g:4233:4: ( (lv_externalStandardReference_11_0= RULE_STRING ) )
                    // InternalUddl.g:4234:5: (lv_externalStandardReference_11_0= RULE_STRING )
                    {
                    // InternalUddl.g:4234:5: (lv_externalStandardReference_11_0= RULE_STRING )
                    // InternalUddl.g:4235:6: lv_externalStandardReference_11_0= RULE_STRING
                    {
                    lv_externalStandardReference_11_0=(Token)match(input,RULE_STRING,FOLLOW_64); 

                    						newLeafNode(lv_externalStandardReference_11_0, grammarAccess.getLogicalMeasurementSystemAccess().getExternalStandardReferenceSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalMeasurementSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"externalStandardReference",
                    							lv_externalStandardReference_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUddl.g:4252:3: (otherlv_12= 'orient:' ( (lv_orientation_13_0= RULE_STRING ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==77) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalUddl.g:4253:4: otherlv_12= 'orient:' ( (lv_orientation_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,77,FOLLOW_41); 

                    				newLeafNode(otherlv_12, grammarAccess.getLogicalMeasurementSystemAccess().getOrientKeyword_11_0());
                    			
                    // InternalUddl.g:4257:4: ( (lv_orientation_13_0= RULE_STRING ) )
                    // InternalUddl.g:4258:5: (lv_orientation_13_0= RULE_STRING )
                    {
                    // InternalUddl.g:4258:5: (lv_orientation_13_0= RULE_STRING )
                    // InternalUddl.g:4259:6: lv_orientation_13_0= RULE_STRING
                    {
                    lv_orientation_13_0=(Token)match(input,RULE_STRING,FOLLOW_65); 

                    						newLeafNode(lv_orientation_13_0, grammarAccess.getLogicalMeasurementSystemAccess().getOrientationSTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalMeasurementSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"orientation",
                    							lv_orientation_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUddl.g:4276:3: (otherlv_14= 'refPt:' otherlv_15= '[' ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+ otherlv_17= ']' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==78) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalUddl.g:4277:4: otherlv_14= 'refPt:' otherlv_15= '[' ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+ otherlv_17= ']'
                    {
                    otherlv_14=(Token)match(input,78,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getLogicalMeasurementSystemAccess().getRefPtKeyword_12_0());
                    			
                    otherlv_15=(Token)match(input,28,FOLLOW_66); 

                    				newLeafNode(otherlv_15, grammarAccess.getLogicalMeasurementSystemAccess().getLeftSquareBracketKeyword_12_1());
                    			
                    // InternalUddl.g:4285:4: ( (lv_referencePoint_16_0= ruleLogicalReferencePoint ) )+
                    int cnt95=0;
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==63) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalUddl.g:4286:5: (lv_referencePoint_16_0= ruleLogicalReferencePoint )
                    	    {
                    	    // InternalUddl.g:4286:5: (lv_referencePoint_16_0= ruleLogicalReferencePoint )
                    	    // InternalUddl.g:4287:6: lv_referencePoint_16_0= ruleLogicalReferencePoint
                    	    {

                    	    						newCompositeNode(grammarAccess.getLogicalMeasurementSystemAccess().getReferencePointLogicalReferencePointParserRuleCall_12_2_0());
                    	    					
                    	    pushFollow(FOLLOW_67);
                    	    lv_referencePoint_16_0=ruleLogicalReferencePoint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLogicalMeasurementSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"referencePoint",
                    	    							lv_referencePoint_16_0,
                    	    							"com.epistimis.uddl.Uddl.LogicalReferencePoint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt95 >= 1 ) break loop95;
                                EarlyExitException eee =
                                    new EarlyExitException(95, input);
                                throw eee;
                        }
                        cnt95++;
                    } while (true);

                    otherlv_17=(Token)match(input,29,FOLLOW_68); 

                    				newLeafNode(otherlv_17, grammarAccess.getLogicalMeasurementSystemAccess().getRightSquareBracketKeyword_12_3());
                    			

                    }
                    break;

            }

            // InternalUddl.g:4309:3: (otherlv_18= '![' ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+ otherlv_20= ']' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==79) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalUddl.g:4310:4: otherlv_18= '![' ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+ otherlv_20= ']'
                    {
                    otherlv_18=(Token)match(input,79,FOLLOW_41); 

                    				newLeafNode(otherlv_18, grammarAccess.getLogicalMeasurementSystemAccess().getExclamationMarkLeftSquareBracketKeyword_13_0());
                    			
                    // InternalUddl.g:4314:4: ( (lv_constraint_19_0= ruleLogicalMeasurementConstraint ) )+
                    int cnt97=0;
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==RULE_STRING) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalUddl.g:4315:5: (lv_constraint_19_0= ruleLogicalMeasurementConstraint )
                    	    {
                    	    // InternalUddl.g:4315:5: (lv_constraint_19_0= ruleLogicalMeasurementConstraint )
                    	    // InternalUddl.g:4316:6: lv_constraint_19_0= ruleLogicalMeasurementConstraint
                    	    {

                    	    						newCompositeNode(grammarAccess.getLogicalMeasurementSystemAccess().getConstraintLogicalMeasurementConstraintParserRuleCall_13_1_0());
                    	    					
                    	    pushFollow(FOLLOW_69);
                    	    lv_constraint_19_0=ruleLogicalMeasurementConstraint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLogicalMeasurementSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"constraint",
                    	    							lv_constraint_19_0,
                    	    							"com.epistimis.uddl.Uddl.LogicalMeasurementConstraint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt97 >= 1 ) break loop97;
                                EarlyExitException eee =
                                    new EarlyExitException(97, input);
                                throw eee;
                        }
                        cnt97++;
                    } while (true);

                    otherlv_20=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_20, grammarAccess.getLogicalMeasurementSystemAccess().getRightSquareBracketKeyword_13_2());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getLogicalMeasurementSystemAccess().getRightCurlyBracketSemicolonKeyword_14());
            		

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
    // $ANTLR end "ruleLogicalMeasurementSystem"


    // $ANTLR start "entryRuleLogicalMeasurementSystemAxis"
    // InternalUddl.g:4346:1: entryRuleLogicalMeasurementSystemAxis returns [EObject current=null] : iv_ruleLogicalMeasurementSystemAxis= ruleLogicalMeasurementSystemAxis EOF ;
    public final EObject entryRuleLogicalMeasurementSystemAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurementSystemAxis = null;


        try {
            // InternalUddl.g:4346:69: (iv_ruleLogicalMeasurementSystemAxis= ruleLogicalMeasurementSystemAxis EOF )
            // InternalUddl.g:4347:2: iv_ruleLogicalMeasurementSystemAxis= ruleLogicalMeasurementSystemAxis EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementSystemAxisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurementSystemAxis=ruleLogicalMeasurementSystemAxis();

            state._fsp--;

             current =iv_ruleLogicalMeasurementSystemAxis; 
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
    // $ANTLR end "entryRuleLogicalMeasurementSystemAxis"


    // $ANTLR start "ruleLogicalMeasurementSystemAxis"
    // InternalUddl.g:4353:1: ruleLogicalMeasurementSystemAxis returns [EObject current=null] : (otherlv_0= 'msa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'axis:' ( ( ruleQN ) ) otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' (otherlv_10= '![' ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+ otherlv_12= ']' )? otherlv_13= '};' ) ;
    public final EObject ruleLogicalMeasurementSystemAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_constraint_11_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:4359:2: ( (otherlv_0= 'msa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'axis:' ( ( ruleQN ) ) otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' (otherlv_10= '![' ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+ otherlv_12= ']' )? otherlv_13= '};' ) )
            // InternalUddl.g:4360:2: (otherlv_0= 'msa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'axis:' ( ( ruleQN ) ) otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' (otherlv_10= '![' ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+ otherlv_12= ']' )? otherlv_13= '};' )
            {
            // InternalUddl.g:4360:2: (otherlv_0= 'msa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'axis:' ( ( ruleQN ) ) otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' (otherlv_10= '![' ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+ otherlv_12= ']' )? otherlv_13= '};' )
            // InternalUddl.g:4361:3: otherlv_0= 'msa' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' otherlv_4= 'axis:' ( ( ruleQN ) ) otherlv_6= 'vtu:' otherlv_7= '[' ( ( ruleQN ) )+ otherlv_9= ']' (otherlv_10= '![' ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+ otherlv_12= ']' )? otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalMeasurementSystemAxisAccess().getMsaKeyword_0());
            		
            // InternalUddl.g:4365:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:4366:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:4366:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:4367:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalMeasurementSystemAxisAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemAxisRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:4383:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_STRING) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalUddl.g:4384:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:4384:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:4385:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalMeasurementSystemAxisAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalMeasurementSystemAxisRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_70); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalMeasurementSystemAxisAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,66,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalMeasurementSystemAxisAccess().getAxisKeyword_4());
            		
            // InternalUddl.g:4409:3: ( ( ruleQN ) )
            // InternalUddl.g:4410:4: ( ruleQN )
            {
            // InternalUddl.g:4410:4: ( ruleQN )
            // InternalUddl.g:4411:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemAxisRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementSystemAxisAccess().getAxisLogicalCoordinateSystemAxisCrossReference_5_0());
            				
            pushFollow(FOLLOW_71);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,81,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalMeasurementSystemAxisAccess().getVtuKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getLogicalMeasurementSystemAxisAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalUddl.g:4433:3: ( ( ruleQN ) )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==RULE_ID) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalUddl.g:4434:4: ( ruleQN )
            	    {
            	    // InternalUddl.g:4434:4: ( ruleQN )
            	    // InternalUddl.g:4435:5: ruleQN
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLogicalMeasurementSystemAxisRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getLogicalMeasurementSystemAxisAccess().getDefaultValueTypeUnitLogicalValueTypeUnitCrossReference_8_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    ruleQN();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt100 >= 1 ) break loop100;
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_68); 

            			newLeafNode(otherlv_9, grammarAccess.getLogicalMeasurementSystemAxisAccess().getRightSquareBracketKeyword_9());
            		
            // InternalUddl.g:4453:3: (otherlv_10= '![' ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+ otherlv_12= ']' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==79) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalUddl.g:4454:4: otherlv_10= '![' ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+ otherlv_12= ']'
                    {
                    otherlv_10=(Token)match(input,79,FOLLOW_41); 

                    				newLeafNode(otherlv_10, grammarAccess.getLogicalMeasurementSystemAxisAccess().getExclamationMarkLeftSquareBracketKeyword_10_0());
                    			
                    // InternalUddl.g:4458:4: ( (lv_constraint_11_0= ruleLogicalMeasurementConstraint ) )+
                    int cnt101=0;
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==RULE_STRING) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalUddl.g:4459:5: (lv_constraint_11_0= ruleLogicalMeasurementConstraint )
                    	    {
                    	    // InternalUddl.g:4459:5: (lv_constraint_11_0= ruleLogicalMeasurementConstraint )
                    	    // InternalUddl.g:4460:6: lv_constraint_11_0= ruleLogicalMeasurementConstraint
                    	    {

                    	    						newCompositeNode(grammarAccess.getLogicalMeasurementSystemAxisAccess().getConstraintLogicalMeasurementConstraintParserRuleCall_10_1_0());
                    	    					
                    	    pushFollow(FOLLOW_69);
                    	    lv_constraint_11_0=ruleLogicalMeasurementConstraint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLogicalMeasurementSystemAxisRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"constraint",
                    	    							lv_constraint_11_0,
                    	    							"com.epistimis.uddl.Uddl.LogicalMeasurementConstraint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt101 >= 1 ) break loop101;
                                EarlyExitException eee =
                                    new EarlyExitException(101, input);
                                throw eee;
                        }
                        cnt101++;
                    } while (true);

                    otherlv_12=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getLogicalMeasurementSystemAxisAccess().getRightSquareBracketKeyword_10_2());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalMeasurementSystemAxisAccess().getRightCurlyBracketSemicolonKeyword_11());
            		

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
    // $ANTLR end "ruleLogicalMeasurementSystemAxis"


    // $ANTLR start "entryRuleLogicalReferencePoint"
    // InternalUddl.g:4490:1: entryRuleLogicalReferencePoint returns [EObject current=null] : iv_ruleLogicalReferencePoint= ruleLogicalReferencePoint EOF ;
    public final EObject entryRuleLogicalReferencePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalReferencePoint = null;


        try {
            // InternalUddl.g:4490:62: (iv_ruleLogicalReferencePoint= ruleLogicalReferencePoint EOF )
            // InternalUddl.g:4491:2: iv_ruleLogicalReferencePoint= ruleLogicalReferencePoint EOF
            {
             newCompositeNode(grammarAccess.getLogicalReferencePointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalReferencePoint=ruleLogicalReferencePoint();

            state._fsp--;

             current =iv_ruleLogicalReferencePoint; 
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
    // $ANTLR end "entryRuleLogicalReferencePoint"


    // $ANTLR start "ruleLogicalReferencePoint"
    // InternalUddl.g:4497:1: ruleLogicalReferencePoint returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'landmark:' ( ( ruleQN ) ) otherlv_5= '[' ( (lv_referencePointPart_6_0= ruleLogicalReferencePointPart ) )+ otherlv_7= ']' otherlv_8= ')' ) ;
    public final EObject ruleLogicalReferencePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_referencePointPart_6_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:4503:2: ( (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'landmark:' ( ( ruleQN ) ) otherlv_5= '[' ( (lv_referencePointPart_6_0= ruleLogicalReferencePointPart ) )+ otherlv_7= ']' otherlv_8= ')' ) )
            // InternalUddl.g:4504:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'landmark:' ( ( ruleQN ) ) otherlv_5= '[' ( (lv_referencePointPart_6_0= ruleLogicalReferencePointPart ) )+ otherlv_7= ']' otherlv_8= ')' )
            {
            // InternalUddl.g:4504:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'landmark:' ( ( ruleQN ) ) otherlv_5= '[' ( (lv_referencePointPart_6_0= ruleLogicalReferencePointPart ) )+ otherlv_7= ']' otherlv_8= ')' )
            // InternalUddl.g:4505:3: otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'landmark:' ( ( ruleQN ) ) otherlv_5= '[' ( (lv_referencePointPart_6_0= ruleLogicalReferencePointPart ) )+ otherlv_7= ']' otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalReferencePointAccess().getLeftParenthesisKeyword_0());
            		
            // InternalUddl.g:4509:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:4510:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:4510:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:4511:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_72); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalReferencePointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalReferencePointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:4527:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_STRING) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalUddl.g:4528:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:4528:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:4529:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_73); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalReferencePointAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalReferencePointRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,82,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalReferencePointAccess().getLandmarkKeyword_3());
            		
            // InternalUddl.g:4549:3: ( ( ruleQN ) )
            // InternalUddl.g:4550:4: ( ruleQN )
            {
            // InternalUddl.g:4550:4: ( ruleQN )
            // InternalUddl.g:4551:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalReferencePointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalReferencePointAccess().getLandmarkLogicalLandmarkCrossReference_4_0());
            				
            pushFollow(FOLLOW_21);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_66); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalReferencePointAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalUddl.g:4569:3: ( (lv_referencePointPart_6_0= ruleLogicalReferencePointPart ) )+
            int cnt104=0;
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==63) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalUddl.g:4570:4: (lv_referencePointPart_6_0= ruleLogicalReferencePointPart )
            	    {
            	    // InternalUddl.g:4570:4: (lv_referencePointPart_6_0= ruleLogicalReferencePointPart )
            	    // InternalUddl.g:4571:5: lv_referencePointPart_6_0= ruleLogicalReferencePointPart
            	    {

            	    					newCompositeNode(grammarAccess.getLogicalReferencePointAccess().getReferencePointPartLogicalReferencePointPartParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_67);
            	    lv_referencePointPart_6_0=ruleLogicalReferencePointPart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLogicalReferencePointRule());
            	    					}
            	    					add(
            	    						current,
            	    						"referencePointPart",
            	    						lv_referencePointPart_6_0,
            	    						"com.epistimis.uddl.Uddl.LogicalReferencePointPart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt104 >= 1 ) break loop104;
                        EarlyExitException eee =
                            new EarlyExitException(104, input);
                        throw eee;
                }
                cnt104++;
            } while (true);

            otherlv_7=(Token)match(input,29,FOLLOW_56); 

            			newLeafNode(otherlv_7, grammarAccess.getLogicalReferencePointAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,64,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLogicalReferencePointAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleLogicalReferencePoint"


    // $ANTLR start "entryRuleLogicalReferencePointPart"
    // InternalUddl.g:4600:1: entryRuleLogicalReferencePointPart returns [EObject current=null] : iv_ruleLogicalReferencePointPart= ruleLogicalReferencePointPart EOF ;
    public final EObject entryRuleLogicalReferencePointPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalReferencePointPart = null;


        try {
            // InternalUddl.g:4600:66: (iv_ruleLogicalReferencePointPart= ruleLogicalReferencePointPart EOF )
            // InternalUddl.g:4601:2: iv_ruleLogicalReferencePointPart= ruleLogicalReferencePointPart EOF
            {
             newCompositeNode(grammarAccess.getLogicalReferencePointPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalReferencePointPart=ruleLogicalReferencePointPart();

            state._fsp--;

             current =iv_ruleLogicalReferencePointPart; 
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
    // $ANTLR end "entryRuleLogicalReferencePointPart"


    // $ANTLR start "ruleLogicalReferencePointPart"
    // InternalUddl.g:4607:1: ruleLogicalReferencePointPart returns [EObject current=null] : (otherlv_0= '(' ( ( ruleQN ) )? ( (lv_value_2_0= RULE_STRING ) ) ( ( ruleQN ) )? otherlv_4= ')' ) ;
    public final EObject ruleLogicalReferencePointPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUddl.g:4613:2: ( (otherlv_0= '(' ( ( ruleQN ) )? ( (lv_value_2_0= RULE_STRING ) ) ( ( ruleQN ) )? otherlv_4= ')' ) )
            // InternalUddl.g:4614:2: (otherlv_0= '(' ( ( ruleQN ) )? ( (lv_value_2_0= RULE_STRING ) ) ( ( ruleQN ) )? otherlv_4= ')' )
            {
            // InternalUddl.g:4614:2: (otherlv_0= '(' ( ( ruleQN ) )? ( (lv_value_2_0= RULE_STRING ) ) ( ( ruleQN ) )? otherlv_4= ')' )
            // InternalUddl.g:4615:3: otherlv_0= '(' ( ( ruleQN ) )? ( (lv_value_2_0= RULE_STRING ) ) ( ( ruleQN ) )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_74); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalReferencePointPartAccess().getLeftParenthesisKeyword_0());
            		
            // InternalUddl.g:4619:3: ( ( ruleQN ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_ID) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalUddl.g:4620:4: ( ruleQN )
                    {
                    // InternalUddl.g:4620:4: ( ruleQN )
                    // InternalUddl.g:4621:5: ruleQN
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalReferencePointPartRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getLogicalReferencePointPartAccess().getAxisLogicalMeasurementSystemAxisCrossReference_1_0());
                    				
                    pushFollow(FOLLOW_41);
                    ruleQN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:4635:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalUddl.g:4636:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalUddl.g:4636:4: (lv_value_2_0= RULE_STRING )
            // InternalUddl.g:4637:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_75); 

            					newLeafNode(lv_value_2_0, grammarAccess.getLogicalReferencePointPartAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalReferencePointPartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUddl.g:4653:3: ( ( ruleQN ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_ID) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalUddl.g:4654:4: ( ruleQN )
                    {
                    // InternalUddl.g:4654:4: ( ruleQN )
                    // InternalUddl.g:4655:5: ruleQN
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalReferencePointPartRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getLogicalReferencePointPartAccess().getValueTypeUnitLogicalValueTypeUnitCrossReference_3_0());
                    				
                    pushFollow(FOLLOW_56);
                    ruleQN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,64,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalReferencePointPartAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleLogicalReferencePointPart"


    // $ANTLR start "entryRuleLogicalValueTypeUnit"
    // InternalUddl.g:4677:1: entryRuleLogicalValueTypeUnit returns [EObject current=null] : iv_ruleLogicalValueTypeUnit= ruleLogicalValueTypeUnit EOF ;
    public final EObject entryRuleLogicalValueTypeUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalValueTypeUnit = null;


        try {
            // InternalUddl.g:4677:61: (iv_ruleLogicalValueTypeUnit= ruleLogicalValueTypeUnit EOF )
            // InternalUddl.g:4678:2: iv_ruleLogicalValueTypeUnit= ruleLogicalValueTypeUnit EOF
            {
             newCompositeNode(grammarAccess.getLogicalValueTypeUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalValueTypeUnit=ruleLogicalValueTypeUnit();

            state._fsp--;

             current =iv_ruleLogicalValueTypeUnit; 
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
    // $ANTLR end "entryRuleLogicalValueTypeUnit"


    // $ANTLR start "ruleLogicalValueTypeUnit"
    // InternalUddl.g:4684:1: ruleLogicalValueTypeUnit returns [EObject current=null] : (otherlv_0= 'vtu' ( ( ruleQN ) ) ( ( ruleQN ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? (otherlv_5= '{' otherlv_6= '!' ( (lv_constraint_7_0= ruleLogicalConstraint ) ) otherlv_8= '}' )? otherlv_9= ';' ) ;
    public final EObject ruleLogicalValueTypeUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_3_0=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_constraint_7_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:4690:2: ( (otherlv_0= 'vtu' ( ( ruleQN ) ) ( ( ruleQN ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? (otherlv_5= '{' otherlv_6= '!' ( (lv_constraint_7_0= ruleLogicalConstraint ) ) otherlv_8= '}' )? otherlv_9= ';' ) )
            // InternalUddl.g:4691:2: (otherlv_0= 'vtu' ( ( ruleQN ) ) ( ( ruleQN ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? (otherlv_5= '{' otherlv_6= '!' ( (lv_constraint_7_0= ruleLogicalConstraint ) ) otherlv_8= '}' )? otherlv_9= ';' )
            {
            // InternalUddl.g:4691:2: (otherlv_0= 'vtu' ( ( ruleQN ) ) ( ( ruleQN ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? (otherlv_5= '{' otherlv_6= '!' ( (lv_constraint_7_0= ruleLogicalConstraint ) ) otherlv_8= '}' )? otherlv_9= ';' )
            // InternalUddl.g:4692:3: otherlv_0= 'vtu' ( ( ruleQN ) ) ( ( ruleQN ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? (otherlv_5= '{' otherlv_6= '!' ( (lv_constraint_7_0= ruleLogicalConstraint ) ) otherlv_8= '}' )? otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalValueTypeUnitAccess().getVtuKeyword_0());
            		
            // InternalUddl.g:4696:3: ( ( ruleQN ) )
            // InternalUddl.g:4697:4: ( ruleQN )
            {
            // InternalUddl.g:4697:4: ( ruleQN )
            // InternalUddl.g:4698:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalValueTypeUnitRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalValueTypeUnitAccess().getValueTypeLogicalValueTypeCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:4712:3: ( ( ruleQN ) )
            // InternalUddl.g:4713:4: ( ruleQN )
            {
            // InternalUddl.g:4713:4: ( ruleQN )
            // InternalUddl.g:4714:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalValueTypeUnitRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalValueTypeUnitAccess().getUnitLogicalUnitCrossReference_2_0());
            				
            pushFollow(FOLLOW_4);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:4728:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalUddl.g:4729:4: (lv_name_3_0= RULE_ID )
            {
            // InternalUddl.g:4729:4: (lv_name_3_0= RULE_ID )
            // InternalUddl.g:4730:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_76); 

            					newLeafNode(lv_name_3_0, grammarAccess.getLogicalValueTypeUnitAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalValueTypeUnitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:4746:3: ( (lv_description_4_0= RULE_STRING ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_STRING) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalUddl.g:4747:4: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalUddl.g:4747:4: (lv_description_4_0= RULE_STRING )
                    // InternalUddl.g:4748:5: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_77); 

                    					newLeafNode(lv_description_4_0, grammarAccess.getLogicalValueTypeUnitAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalValueTypeUnitRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:4764:3: (otherlv_5= '{' otherlv_6= '!' ( (lv_constraint_7_0= ruleLogicalConstraint ) ) otherlv_8= '}' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==17) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalUddl.g:4765:4: otherlv_5= '{' otherlv_6= '!' ( (lv_constraint_7_0= ruleLogicalConstraint ) ) otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_78); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogicalValueTypeUnitAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,84,FOLLOW_79); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalValueTypeUnitAccess().getExclamationMarkKeyword_5_1());
                    			
                    // InternalUddl.g:4773:4: ( (lv_constraint_7_0= ruleLogicalConstraint ) )
                    // InternalUddl.g:4774:5: (lv_constraint_7_0= ruleLogicalConstraint )
                    {
                    // InternalUddl.g:4774:5: (lv_constraint_7_0= ruleLogicalConstraint )
                    // InternalUddl.g:4775:6: lv_constraint_7_0= ruleLogicalConstraint
                    {

                    						newCompositeNode(grammarAccess.getLogicalValueTypeUnitAccess().getConstraintLogicalConstraintParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_constraint_7_0=ruleLogicalConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalValueTypeUnitRule());
                    						}
                    						set(
                    							current,
                    							"constraint",
                    							lv_constraint_7_0,
                    							"com.epistimis.uddl.Uddl.LogicalConstraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalValueTypeUnitAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLogicalValueTypeUnitAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleLogicalValueTypeUnit"


    // $ANTLR start "entryRuleLogicalConstraint"
    // InternalUddl.g:4805:1: entryRuleLogicalConstraint returns [EObject current=null] : iv_ruleLogicalConstraint= ruleLogicalConstraint EOF ;
    public final EObject entryRuleLogicalConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalConstraint = null;


        try {
            // InternalUddl.g:4805:58: (iv_ruleLogicalConstraint= ruleLogicalConstraint EOF )
            // InternalUddl.g:4806:2: iv_ruleLogicalConstraint= ruleLogicalConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalConstraint=ruleLogicalConstraint();

            state._fsp--;

             current =iv_ruleLogicalConstraint; 
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
    // $ANTLR end "entryRuleLogicalConstraint"


    // $ANTLR start "ruleLogicalConstraint"
    // InternalUddl.g:4812:1: ruleLogicalConstraint returns [EObject current=null] : (this_LogicalStringConstraint_0= ruleLogicalStringConstraint | this_LogicalRealRangeConstraint_1= ruleLogicalRealRangeConstraint | this_LogicalIntegerRangeConstraint_2= ruleLogicalIntegerRangeConstraint | this_LogicalEnumerationConstraint_3= ruleLogicalEnumerationConstraint ) ;
    public final EObject ruleLogicalConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalStringConstraint_0 = null;

        EObject this_LogicalRealRangeConstraint_1 = null;

        EObject this_LogicalIntegerRangeConstraint_2 = null;

        EObject this_LogicalEnumerationConstraint_3 = null;



        	enterRule();

        try {
            // InternalUddl.g:4818:2: ( (this_LogicalStringConstraint_0= ruleLogicalStringConstraint | this_LogicalRealRangeConstraint_1= ruleLogicalRealRangeConstraint | this_LogicalIntegerRangeConstraint_2= ruleLogicalIntegerRangeConstraint | this_LogicalEnumerationConstraint_3= ruleLogicalEnumerationConstraint ) )
            // InternalUddl.g:4819:2: (this_LogicalStringConstraint_0= ruleLogicalStringConstraint | this_LogicalRealRangeConstraint_1= ruleLogicalRealRangeConstraint | this_LogicalIntegerRangeConstraint_2= ruleLogicalIntegerRangeConstraint | this_LogicalEnumerationConstraint_3= ruleLogicalEnumerationConstraint )
            {
            // InternalUddl.g:4819:2: (this_LogicalStringConstraint_0= ruleLogicalStringConstraint | this_LogicalRealRangeConstraint_1= ruleLogicalRealRangeConstraint | this_LogicalIntegerRangeConstraint_2= ruleLogicalIntegerRangeConstraint | this_LogicalEnumerationConstraint_3= ruleLogicalEnumerationConstraint )
            int alt109=4;
            switch ( input.LA(1) ) {
            case 87:
            case 88:
                {
                alt109=1;
                }
                break;
            case 86:
                {
                alt109=2;
                }
                break;
            case 85:
                {
                alt109=3;
                }
                break;
            case 89:
                {
                alt109=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // InternalUddl.g:4820:3: this_LogicalStringConstraint_0= ruleLogicalStringConstraint
                    {

                    			newCompositeNode(grammarAccess.getLogicalConstraintAccess().getLogicalStringConstraintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalStringConstraint_0=ruleLogicalStringConstraint();

                    state._fsp--;


                    			current = this_LogicalStringConstraint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:4829:3: this_LogicalRealRangeConstraint_1= ruleLogicalRealRangeConstraint
                    {

                    			newCompositeNode(grammarAccess.getLogicalConstraintAccess().getLogicalRealRangeConstraintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalRealRangeConstraint_1=ruleLogicalRealRangeConstraint();

                    state._fsp--;


                    			current = this_LogicalRealRangeConstraint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:4838:3: this_LogicalIntegerRangeConstraint_2= ruleLogicalIntegerRangeConstraint
                    {

                    			newCompositeNode(grammarAccess.getLogicalConstraintAccess().getLogicalIntegerRangeConstraintParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalIntegerRangeConstraint_2=ruleLogicalIntegerRangeConstraint();

                    state._fsp--;


                    			current = this_LogicalIntegerRangeConstraint_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:4847:3: this_LogicalEnumerationConstraint_3= ruleLogicalEnumerationConstraint
                    {

                    			newCompositeNode(grammarAccess.getLogicalConstraintAccess().getLogicalEnumerationConstraintParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalEnumerationConstraint_3=ruleLogicalEnumerationConstraint();

                    state._fsp--;


                    			current = this_LogicalEnumerationConstraint_3;
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
    // $ANTLR end "ruleLogicalConstraint"


    // $ANTLR start "entryRuleLogicalIntegerRangeConstraint"
    // InternalUddl.g:4859:1: entryRuleLogicalIntegerRangeConstraint returns [EObject current=null] : iv_ruleLogicalIntegerRangeConstraint= ruleLogicalIntegerRangeConstraint EOF ;
    public final EObject entryRuleLogicalIntegerRangeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalIntegerRangeConstraint = null;


        try {
            // InternalUddl.g:4859:70: (iv_ruleLogicalIntegerRangeConstraint= ruleLogicalIntegerRangeConstraint EOF )
            // InternalUddl.g:4860:2: iv_ruleLogicalIntegerRangeConstraint= ruleLogicalIntegerRangeConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalIntegerRangeConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalIntegerRangeConstraint=ruleLogicalIntegerRangeConstraint();

            state._fsp--;

             current =iv_ruleLogicalIntegerRangeConstraint; 
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
    // $ANTLR end "entryRuleLogicalIntegerRangeConstraint"


    // $ANTLR start "ruleLogicalIntegerRangeConstraint"
    // InternalUddl.g:4866:1: ruleLogicalIntegerRangeConstraint returns [EObject current=null] : (otherlv_0= 'irc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_lowerBound_3_1= RULE_INT | lv_lowerBound_3_2= RULE_SIGNED_INT ) ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= ';' ) ;
    public final EObject ruleLogicalIntegerRangeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_1=null;
        Token lv_lowerBound_3_2=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_1=null;
        Token lv_upperBound_5_2=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalUddl.g:4872:2: ( (otherlv_0= 'irc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_lowerBound_3_1= RULE_INT | lv_lowerBound_3_2= RULE_SIGNED_INT ) ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= ';' ) )
            // InternalUddl.g:4873:2: (otherlv_0= 'irc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_lowerBound_3_1= RULE_INT | lv_lowerBound_3_2= RULE_SIGNED_INT ) ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= ';' )
            {
            // InternalUddl.g:4873:2: (otherlv_0= 'irc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_lowerBound_3_1= RULE_INT | lv_lowerBound_3_2= RULE_SIGNED_INT ) ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= ';' )
            // InternalUddl.g:4874:3: otherlv_0= 'irc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_lowerBound_3_1= RULE_INT | lv_lowerBound_3_2= RULE_SIGNED_INT ) ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalIntegerRangeConstraintAccess().getIrcKeyword_0());
            		
            // InternalUddl.g:4878:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:4879:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:4879:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:4880:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalIntegerRangeConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalIntegerRangeConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getLogicalIntegerRangeConstraintAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalUddl.g:4900:3: ( ( (lv_lowerBound_3_1= RULE_INT | lv_lowerBound_3_2= RULE_SIGNED_INT ) ) )
            // InternalUddl.g:4901:4: ( (lv_lowerBound_3_1= RULE_INT | lv_lowerBound_3_2= RULE_SIGNED_INT ) )
            {
            // InternalUddl.g:4901:4: ( (lv_lowerBound_3_1= RULE_INT | lv_lowerBound_3_2= RULE_SIGNED_INT ) )
            // InternalUddl.g:4902:5: (lv_lowerBound_3_1= RULE_INT | lv_lowerBound_3_2= RULE_SIGNED_INT )
            {
            // InternalUddl.g:4902:5: (lv_lowerBound_3_1= RULE_INT | lv_lowerBound_3_2= RULE_SIGNED_INT )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==RULE_INT) ) {
                alt110=1;
            }
            else if ( (LA110_0==RULE_SIGNED_INT) ) {
                alt110=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // InternalUddl.g:4903:6: lv_lowerBound_3_1= RULE_INT
                    {
                    lv_lowerBound_3_1=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_lowerBound_3_1, grammarAccess.getLogicalIntegerRangeConstraintAccess().getLowerBoundINTTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalIntegerRangeConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_3_1,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }
                    break;
                case 2 :
                    // InternalUddl.g:4918:6: lv_lowerBound_3_2= RULE_SIGNED_INT
                    {
                    lv_lowerBound_3_2=(Token)match(input,RULE_SIGNED_INT,FOLLOW_25); 

                    						newLeafNode(lv_lowerBound_3_2, grammarAccess.getLogicalIntegerRangeConstraintAccess().getLowerBoundSIGNED_INTTerminalRuleCall_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalIntegerRangeConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_3_2,
                    							"com.epistimis.uddl.Uddl.SIGNED_INT");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalIntegerRangeConstraintAccess().getColonKeyword_4());
            		
            // InternalUddl.g:4939:3: ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )
            // InternalUddl.g:4940:4: ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) )
            {
            // InternalUddl.g:4940:4: ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) )
            // InternalUddl.g:4941:5: (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT )
            {
            // InternalUddl.g:4941:5: (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==RULE_INT) ) {
                alt111=1;
            }
            else if ( (LA111_0==RULE_SIGNED_INT) ) {
                alt111=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalUddl.g:4942:6: lv_upperBound_5_1= RULE_INT
                    {
                    lv_upperBound_5_1=(Token)match(input,RULE_INT,FOLLOW_27); 

                    						newLeafNode(lv_upperBound_5_1, grammarAccess.getLogicalIntegerRangeConstraintAccess().getUpperBoundINTTerminalRuleCall_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalIntegerRangeConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"upperBound",
                    							lv_upperBound_5_1,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }
                    break;
                case 2 :
                    // InternalUddl.g:4957:6: lv_upperBound_5_2= RULE_SIGNED_INT
                    {
                    lv_upperBound_5_2=(Token)match(input,RULE_SIGNED_INT,FOLLOW_27); 

                    						newLeafNode(lv_upperBound_5_2, grammarAccess.getLogicalIntegerRangeConstraintAccess().getUpperBoundSIGNED_INTTerminalRuleCall_5_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalIntegerRangeConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"upperBound",
                    							lv_upperBound_5_2,
                    							"com.epistimis.uddl.Uddl.SIGNED_INT");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalIntegerRangeConstraintAccess().getRightSquareBracketKeyword_6());
            		
            // InternalUddl.g:4978:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==RULE_STRING) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalUddl.g:4979:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:4979:4: (lv_description_7_0= RULE_STRING )
                    // InternalUddl.g:4980:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getLogicalIntegerRangeConstraintAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalIntegerRangeConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLogicalIntegerRangeConstraintAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleLogicalIntegerRangeConstraint"


    // $ANTLR start "entryRuleLogicalRealRangeConstraint"
    // InternalUddl.g:5004:1: entryRuleLogicalRealRangeConstraint returns [EObject current=null] : iv_ruleLogicalRealRangeConstraint= ruleLogicalRealRangeConstraint EOF ;
    public final EObject entryRuleLogicalRealRangeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRealRangeConstraint = null;


        try {
            // InternalUddl.g:5004:67: (iv_ruleLogicalRealRangeConstraint= ruleLogicalRealRangeConstraint EOF )
            // InternalUddl.g:5005:2: iv_ruleLogicalRealRangeConstraint= ruleLogicalRealRangeConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalRealRangeConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalRealRangeConstraint=ruleLogicalRealRangeConstraint();

            state._fsp--;

             current =iv_ruleLogicalRealRangeConstraint; 
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
    // $ANTLR end "entryRuleLogicalRealRangeConstraint"


    // $ANTLR start "ruleLogicalRealRangeConstraint"
    // InternalUddl.g:5011:1: ruleLogicalRealRangeConstraint returns [EObject current=null] : (otherlv_0= 'rrc' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' | ( (lv_lowerBoundInclusive_3_0= '[' ) ) ) ( (lv_lowerBound_4_0= RULE_FLOAT ) ) otherlv_5= ':' ( (lv_upperBound_6_0= RULE_FLOAT ) ) (otherlv_7= ')' | ( (lv_upperBoundInclusive_8_0= ']' ) ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ';' ) ;
    public final EObject ruleLogicalRealRangeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBoundInclusive_3_0=null;
        Token lv_lowerBound_4_0=null;
        Token otherlv_5=null;
        Token lv_upperBound_6_0=null;
        Token otherlv_7=null;
        Token lv_upperBoundInclusive_8_0=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalUddl.g:5017:2: ( (otherlv_0= 'rrc' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' | ( (lv_lowerBoundInclusive_3_0= '[' ) ) ) ( (lv_lowerBound_4_0= RULE_FLOAT ) ) otherlv_5= ':' ( (lv_upperBound_6_0= RULE_FLOAT ) ) (otherlv_7= ')' | ( (lv_upperBoundInclusive_8_0= ']' ) ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ';' ) )
            // InternalUddl.g:5018:2: (otherlv_0= 'rrc' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' | ( (lv_lowerBoundInclusive_3_0= '[' ) ) ) ( (lv_lowerBound_4_0= RULE_FLOAT ) ) otherlv_5= ':' ( (lv_upperBound_6_0= RULE_FLOAT ) ) (otherlv_7= ')' | ( (lv_upperBoundInclusive_8_0= ']' ) ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ';' )
            {
            // InternalUddl.g:5018:2: (otherlv_0= 'rrc' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' | ( (lv_lowerBoundInclusive_3_0= '[' ) ) ) ( (lv_lowerBound_4_0= RULE_FLOAT ) ) otherlv_5= ':' ( (lv_upperBound_6_0= RULE_FLOAT ) ) (otherlv_7= ')' | ( (lv_upperBoundInclusive_8_0= ']' ) ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ';' )
            // InternalUddl.g:5019:3: otherlv_0= 'rrc' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' | ( (lv_lowerBoundInclusive_3_0= '[' ) ) ) ( (lv_lowerBound_4_0= RULE_FLOAT ) ) otherlv_5= ':' ( (lv_upperBound_6_0= RULE_FLOAT ) ) (otherlv_7= ')' | ( (lv_upperBoundInclusive_8_0= ']' ) ) ) ( (lv_description_9_0= RULE_STRING ) )? otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalRealRangeConstraintAccess().getRrcKeyword_0());
            		
            // InternalUddl.g:5023:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:5024:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:5024:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:5025:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_80); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalRealRangeConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalRealRangeConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:5041:3: (otherlv_2= '(' | ( (lv_lowerBoundInclusive_3_0= '[' ) ) )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==63) ) {
                alt113=1;
            }
            else if ( (LA113_0==28) ) {
                alt113=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalUddl.g:5042:4: otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_47); 

                    				newLeafNode(otherlv_2, grammarAccess.getLogicalRealRangeConstraintAccess().getLeftParenthesisKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUddl.g:5047:4: ( (lv_lowerBoundInclusive_3_0= '[' ) )
                    {
                    // InternalUddl.g:5047:4: ( (lv_lowerBoundInclusive_3_0= '[' ) )
                    // InternalUddl.g:5048:5: (lv_lowerBoundInclusive_3_0= '[' )
                    {
                    // InternalUddl.g:5048:5: (lv_lowerBoundInclusive_3_0= '[' )
                    // InternalUddl.g:5049:6: lv_lowerBoundInclusive_3_0= '['
                    {
                    lv_lowerBoundInclusive_3_0=(Token)match(input,28,FOLLOW_47); 

                    						newLeafNode(lv_lowerBoundInclusive_3_0, grammarAccess.getLogicalRealRangeConstraintAccess().getLowerBoundInclusiveLeftSquareBracketKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalRealRangeConstraintRule());
                    						}
                    						setWithLastConsumed(current, "lowerBoundInclusive", lv_lowerBoundInclusive_3_0 != null, "[");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUddl.g:5062:3: ( (lv_lowerBound_4_0= RULE_FLOAT ) )
            // InternalUddl.g:5063:4: (lv_lowerBound_4_0= RULE_FLOAT )
            {
            // InternalUddl.g:5063:4: (lv_lowerBound_4_0= RULE_FLOAT )
            // InternalUddl.g:5064:5: lv_lowerBound_4_0= RULE_FLOAT
            {
            lv_lowerBound_4_0=(Token)match(input,RULE_FLOAT,FOLLOW_25); 

            					newLeafNode(lv_lowerBound_4_0, grammarAccess.getLogicalRealRangeConstraintAccess().getLowerBoundFLOATTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalRealRangeConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lowerBound",
            						lv_lowerBound_4_0,
            						"com.epistimis.uddl.Uddl.FLOAT");
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_47); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalRealRangeConstraintAccess().getColonKeyword_4());
            		
            // InternalUddl.g:5084:3: ( (lv_upperBound_6_0= RULE_FLOAT ) )
            // InternalUddl.g:5085:4: (lv_upperBound_6_0= RULE_FLOAT )
            {
            // InternalUddl.g:5085:4: (lv_upperBound_6_0= RULE_FLOAT )
            // InternalUddl.g:5086:5: lv_upperBound_6_0= RULE_FLOAT
            {
            lv_upperBound_6_0=(Token)match(input,RULE_FLOAT,FOLLOW_81); 

            					newLeafNode(lv_upperBound_6_0, grammarAccess.getLogicalRealRangeConstraintAccess().getUpperBoundFLOATTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalRealRangeConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"upperBound",
            						lv_upperBound_6_0,
            						"com.epistimis.uddl.Uddl.FLOAT");
            				

            }


            }

            // InternalUddl.g:5102:3: (otherlv_7= ')' | ( (lv_upperBoundInclusive_8_0= ']' ) ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==64) ) {
                alt114=1;
            }
            else if ( (LA114_0==29) ) {
                alt114=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // InternalUddl.g:5103:4: otherlv_7= ')'
                    {
                    otherlv_7=(Token)match(input,64,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalRealRangeConstraintAccess().getRightParenthesisKeyword_6_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUddl.g:5108:4: ( (lv_upperBoundInclusive_8_0= ']' ) )
                    {
                    // InternalUddl.g:5108:4: ( (lv_upperBoundInclusive_8_0= ']' ) )
                    // InternalUddl.g:5109:5: (lv_upperBoundInclusive_8_0= ']' )
                    {
                    // InternalUddl.g:5109:5: (lv_upperBoundInclusive_8_0= ']' )
                    // InternalUddl.g:5110:6: lv_upperBoundInclusive_8_0= ']'
                    {
                    lv_upperBoundInclusive_8_0=(Token)match(input,29,FOLLOW_14); 

                    						newLeafNode(lv_upperBoundInclusive_8_0, grammarAccess.getLogicalRealRangeConstraintAccess().getUpperBoundInclusiveRightSquareBracketKeyword_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalRealRangeConstraintRule());
                    						}
                    						setWithLastConsumed(current, "upperBoundInclusive", lv_upperBoundInclusive_8_0 != null, "]");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUddl.g:5123:3: ( (lv_description_9_0= RULE_STRING ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==RULE_STRING) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalUddl.g:5124:4: (lv_description_9_0= RULE_STRING )
                    {
                    // InternalUddl.g:5124:4: (lv_description_9_0= RULE_STRING )
                    // InternalUddl.g:5125:5: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_9_0, grammarAccess.getLogicalRealRangeConstraintAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalRealRangeConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_9_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalRealRangeConstraintAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleLogicalRealRangeConstraint"


    // $ANTLR start "entryRuleLogicalStringConstraint"
    // InternalUddl.g:5149:1: entryRuleLogicalStringConstraint returns [EObject current=null] : iv_ruleLogicalStringConstraint= ruleLogicalStringConstraint EOF ;
    public final EObject entryRuleLogicalStringConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalStringConstraint = null;


        try {
            // InternalUddl.g:5149:64: (iv_ruleLogicalStringConstraint= ruleLogicalStringConstraint EOF )
            // InternalUddl.g:5150:2: iv_ruleLogicalStringConstraint= ruleLogicalStringConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalStringConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalStringConstraint=ruleLogicalStringConstraint();

            state._fsp--;

             current =iv_ruleLogicalStringConstraint; 
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
    // $ANTLR end "entryRuleLogicalStringConstraint"


    // $ANTLR start "ruleLogicalStringConstraint"
    // InternalUddl.g:5156:1: ruleLogicalStringConstraint returns [EObject current=null] : (this_LogicalRegularExpressionConstraint_0= ruleLogicalRegularExpressionConstraint | this_LogicalFixedLengthStringConstraint_1= ruleLogicalFixedLengthStringConstraint ) ;
    public final EObject ruleLogicalStringConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalRegularExpressionConstraint_0 = null;

        EObject this_LogicalFixedLengthStringConstraint_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:5162:2: ( (this_LogicalRegularExpressionConstraint_0= ruleLogicalRegularExpressionConstraint | this_LogicalFixedLengthStringConstraint_1= ruleLogicalFixedLengthStringConstraint ) )
            // InternalUddl.g:5163:2: (this_LogicalRegularExpressionConstraint_0= ruleLogicalRegularExpressionConstraint | this_LogicalFixedLengthStringConstraint_1= ruleLogicalFixedLengthStringConstraint )
            {
            // InternalUddl.g:5163:2: (this_LogicalRegularExpressionConstraint_0= ruleLogicalRegularExpressionConstraint | this_LogicalFixedLengthStringConstraint_1= ruleLogicalFixedLengthStringConstraint )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==87) ) {
                alt116=1;
            }
            else if ( (LA116_0==88) ) {
                alt116=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // InternalUddl.g:5164:3: this_LogicalRegularExpressionConstraint_0= ruleLogicalRegularExpressionConstraint
                    {

                    			newCompositeNode(grammarAccess.getLogicalStringConstraintAccess().getLogicalRegularExpressionConstraintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalRegularExpressionConstraint_0=ruleLogicalRegularExpressionConstraint();

                    state._fsp--;


                    			current = this_LogicalRegularExpressionConstraint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:5173:3: this_LogicalFixedLengthStringConstraint_1= ruleLogicalFixedLengthStringConstraint
                    {

                    			newCompositeNode(grammarAccess.getLogicalStringConstraintAccess().getLogicalFixedLengthStringConstraintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalFixedLengthStringConstraint_1=ruleLogicalFixedLengthStringConstraint();

                    state._fsp--;


                    			current = this_LogicalFixedLengthStringConstraint_1;
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
    // $ANTLR end "ruleLogicalStringConstraint"


    // $ANTLR start "entryRuleLogicalRegularExpressionConstraint"
    // InternalUddl.g:5185:1: entryRuleLogicalRegularExpressionConstraint returns [EObject current=null] : iv_ruleLogicalRegularExpressionConstraint= ruleLogicalRegularExpressionConstraint EOF ;
    public final EObject entryRuleLogicalRegularExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRegularExpressionConstraint = null;


        try {
            // InternalUddl.g:5185:75: (iv_ruleLogicalRegularExpressionConstraint= ruleLogicalRegularExpressionConstraint EOF )
            // InternalUddl.g:5186:2: iv_ruleLogicalRegularExpressionConstraint= ruleLogicalRegularExpressionConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalRegularExpressionConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalRegularExpressionConstraint=ruleLogicalRegularExpressionConstraint();

            state._fsp--;

             current =iv_ruleLogicalRegularExpressionConstraint; 
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
    // $ANTLR end "entryRuleLogicalRegularExpressionConstraint"


    // $ANTLR start "ruleLogicalRegularExpressionConstraint"
    // InternalUddl.g:5192:1: ruleLogicalRegularExpressionConstraint returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' ) ;
    public final EObject ruleLogicalRegularExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_expression_3_0=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalUddl.g:5198:2: ( (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' ) )
            // InternalUddl.g:5199:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' )
            {
            // InternalUddl.g:5199:2: (otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' )
            // InternalUddl.g:5200:3: otherlv_0= 'rec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalRegularExpressionConstraintAccess().getRecKeyword_0());
            		
            // InternalUddl.g:5204:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:5205:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:5205:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:5206:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalRegularExpressionConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalRegularExpressionConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getLogicalRegularExpressionConstraintAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalUddl.g:5226:3: ( (lv_expression_3_0= RULE_STRING ) )
            // InternalUddl.g:5227:4: (lv_expression_3_0= RULE_STRING )
            {
            // InternalUddl.g:5227:4: (lv_expression_3_0= RULE_STRING )
            // InternalUddl.g:5228:5: lv_expression_3_0= RULE_STRING
            {
            lv_expression_3_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_expression_3_0, grammarAccess.getLogicalRegularExpressionConstraintAccess().getExpressionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalRegularExpressionConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalRegularExpressionConstraintAccess().getRightSquareBracketKeyword_4());
            		
            // InternalUddl.g:5248:3: ( (lv_description_5_0= RULE_STRING ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==RULE_STRING) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalUddl.g:5249:4: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalUddl.g:5249:4: (lv_description_5_0= RULE_STRING )
                    // InternalUddl.g:5250:5: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_5_0, grammarAccess.getLogicalRegularExpressionConstraintAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalRegularExpressionConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalRegularExpressionConstraintAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleLogicalRegularExpressionConstraint"


    // $ANTLR start "entryRuleLogicalFixedLengthStringConstraint"
    // InternalUddl.g:5274:1: entryRuleLogicalFixedLengthStringConstraint returns [EObject current=null] : iv_ruleLogicalFixedLengthStringConstraint= ruleLogicalFixedLengthStringConstraint EOF ;
    public final EObject entryRuleLogicalFixedLengthStringConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalFixedLengthStringConstraint = null;


        try {
            // InternalUddl.g:5274:75: (iv_ruleLogicalFixedLengthStringConstraint= ruleLogicalFixedLengthStringConstraint EOF )
            // InternalUddl.g:5275:2: iv_ruleLogicalFixedLengthStringConstraint= ruleLogicalFixedLengthStringConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalFixedLengthStringConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalFixedLengthStringConstraint=ruleLogicalFixedLengthStringConstraint();

            state._fsp--;

             current =iv_ruleLogicalFixedLengthStringConstraint; 
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
    // $ANTLR end "entryRuleLogicalFixedLengthStringConstraint"


    // $ANTLR start "ruleLogicalFixedLengthStringConstraint"
    // InternalUddl.g:5281:1: ruleLogicalFixedLengthStringConstraint returns [EObject current=null] : (otherlv_0= 'flsc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' ) ;
    public final EObject ruleLogicalFixedLengthStringConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_length_3_0=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalUddl.g:5287:2: ( (otherlv_0= 'flsc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' ) )
            // InternalUddl.g:5288:2: (otherlv_0= 'flsc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' )
            {
            // InternalUddl.g:5288:2: (otherlv_0= 'flsc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';' )
            // InternalUddl.g:5289:3: otherlv_0= 'flsc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalFixedLengthStringConstraintAccess().getFlscKeyword_0());
            		
            // InternalUddl.g:5293:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:5294:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:5294:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:5295:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalFixedLengthStringConstraintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalFixedLengthStringConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getLogicalFixedLengthStringConstraintAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalUddl.g:5315:3: ( (lv_length_3_0= RULE_INT ) )
            // InternalUddl.g:5316:4: (lv_length_3_0= RULE_INT )
            {
            // InternalUddl.g:5316:4: (lv_length_3_0= RULE_INT )
            // InternalUddl.g:5317:5: lv_length_3_0= RULE_INT
            {
            lv_length_3_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_length_3_0, grammarAccess.getLogicalFixedLengthStringConstraintAccess().getLengthINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalFixedLengthStringConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"length",
            						lv_length_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalFixedLengthStringConstraintAccess().getRightSquareBracketKeyword_4());
            		
            // InternalUddl.g:5337:3: ( (lv_description_5_0= RULE_STRING ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==RULE_STRING) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalUddl.g:5338:4: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalUddl.g:5338:4: (lv_description_5_0= RULE_STRING )
                    // InternalUddl.g:5339:5: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_description_5_0, grammarAccess.getLogicalFixedLengthStringConstraintAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalFixedLengthStringConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalFixedLengthStringConstraintAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleLogicalFixedLengthStringConstraint"


    // $ANTLR start "entryRuleLogicalEnumerationConstraint"
    // InternalUddl.g:5363:1: entryRuleLogicalEnumerationConstraint returns [EObject current=null] : iv_ruleLogicalEnumerationConstraint= ruleLogicalEnumerationConstraint EOF ;
    public final EObject entryRuleLogicalEnumerationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalEnumerationConstraint = null;


        try {
            // InternalUddl.g:5363:69: (iv_ruleLogicalEnumerationConstraint= ruleLogicalEnumerationConstraint EOF )
            // InternalUddl.g:5364:2: iv_ruleLogicalEnumerationConstraint= ruleLogicalEnumerationConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalEnumerationConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalEnumerationConstraint=ruleLogicalEnumerationConstraint();

            state._fsp--;

             current =iv_ruleLogicalEnumerationConstraint; 
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
    // $ANTLR end "entryRuleLogicalEnumerationConstraint"


    // $ANTLR start "ruleLogicalEnumerationConstraint"
    // InternalUddl.g:5370:1: ruleLogicalEnumerationConstraint returns [EObject current=null] : ( () otherlv_1= 'ec' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= '[' ( ( ruleQN ) )+ otherlv_6= ']' )? ) ;
    public final EObject ruleLogicalEnumerationConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalUddl.g:5376:2: ( ( () otherlv_1= 'ec' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= '[' ( ( ruleQN ) )+ otherlv_6= ']' )? ) )
            // InternalUddl.g:5377:2: ( () otherlv_1= 'ec' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= '[' ( ( ruleQN ) )+ otherlv_6= ']' )? )
            {
            // InternalUddl.g:5377:2: ( () otherlv_1= 'ec' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= '[' ( ( ruleQN ) )+ otherlv_6= ']' )? )
            // InternalUddl.g:5378:3: () otherlv_1= 'ec' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= '[' ( ( ruleQN ) )+ otherlv_6= ']' )?
            {
            // InternalUddl.g:5378:3: ()
            // InternalUddl.g:5379:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogicalEnumerationConstraintAccess().getLogicalEnumerationConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,89,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLogicalEnumerationConstraintAccess().getEcKeyword_1());
            		
            // InternalUddl.g:5389:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUddl.g:5390:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUddl.g:5390:4: (lv_name_2_0= RULE_ID )
            // InternalUddl.g:5391:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_82); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLogicalEnumerationConstraintAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalEnumerationConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:5407:3: ( (lv_description_3_0= RULE_STRING ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==RULE_STRING) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalUddl.g:5408:4: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalUddl.g:5408:4: (lv_description_3_0= RULE_STRING )
                    // InternalUddl.g:5409:5: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_83); 

                    					newLeafNode(lv_description_3_0, grammarAccess.getLogicalEnumerationConstraintAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalEnumerationConstraintRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:5425:3: (otherlv_4= '[' ( ( ruleQN ) )+ otherlv_6= ']' )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==28) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalUddl.g:5426:4: otherlv_4= '[' ( ( ruleQN ) )+ otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogicalEnumerationConstraintAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalUddl.g:5430:4: ( ( ruleQN ) )+
                    int cnt120=0;
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==RULE_ID) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalUddl.g:5431:5: ( ruleQN )
                    	    {
                    	    // InternalUddl.g:5431:5: ( ruleQN )
                    	    // InternalUddl.g:5432:6: ruleQN
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getLogicalEnumerationConstraintRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getLogicalEnumerationConstraintAccess().getAllowedValueLogicalEnumeratedBaseCrossReference_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    ruleQN();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt120 >= 1 ) break loop120;
                                EarlyExitException eee =
                                    new EarlyExitException(120, input);
                                throw eee;
                        }
                        cnt120++;
                    } while (true);

                    otherlv_6=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalEnumerationConstraintAccess().getRightSquareBracketKeyword_4_2());
                    			

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
    // $ANTLR end "ruleLogicalEnumerationConstraint"


    // $ANTLR start "entryRuleLogicalMeasurementConstraint"
    // InternalUddl.g:5455:1: entryRuleLogicalMeasurementConstraint returns [EObject current=null] : iv_ruleLogicalMeasurementConstraint= ruleLogicalMeasurementConstraint EOF ;
    public final EObject entryRuleLogicalMeasurementConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurementConstraint = null;


        try {
            // InternalUddl.g:5455:69: (iv_ruleLogicalMeasurementConstraint= ruleLogicalMeasurementConstraint EOF )
            // InternalUddl.g:5456:2: iv_ruleLogicalMeasurementConstraint= ruleLogicalMeasurementConstraint EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurementConstraint=ruleLogicalMeasurementConstraint();

            state._fsp--;

             current =iv_ruleLogicalMeasurementConstraint; 
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
    // $ANTLR end "entryRuleLogicalMeasurementConstraint"


    // $ANTLR start "ruleLogicalMeasurementConstraint"
    // InternalUddl.g:5462:1: ruleLogicalMeasurementConstraint returns [EObject current=null] : ( (lv_constraintText_0_0= RULE_STRING ) ) ;
    public final EObject ruleLogicalMeasurementConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraintText_0_0=null;


        	enterRule();

        try {
            // InternalUddl.g:5468:2: ( ( (lv_constraintText_0_0= RULE_STRING ) ) )
            // InternalUddl.g:5469:2: ( (lv_constraintText_0_0= RULE_STRING ) )
            {
            // InternalUddl.g:5469:2: ( (lv_constraintText_0_0= RULE_STRING ) )
            // InternalUddl.g:5470:3: (lv_constraintText_0_0= RULE_STRING )
            {
            // InternalUddl.g:5470:3: (lv_constraintText_0_0= RULE_STRING )
            // InternalUddl.g:5471:4: lv_constraintText_0_0= RULE_STRING
            {
            lv_constraintText_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_constraintText_0_0, grammarAccess.getLogicalMeasurementConstraintAccess().getConstraintTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLogicalMeasurementConstraintRule());
            				}
            				setWithLastConsumed(
            					current,
            					"constraintText",
            					lv_constraintText_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleLogicalMeasurementConstraint"


    // $ANTLR start "entryRuleLogicalMeasurementSystemConversion"
    // InternalUddl.g:5490:1: entryRuleLogicalMeasurementSystemConversion returns [EObject current=null] : iv_ruleLogicalMeasurementSystemConversion= ruleLogicalMeasurementSystemConversion EOF ;
    public final EObject entryRuleLogicalMeasurementSystemConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurementSystemConversion = null;


        try {
            // InternalUddl.g:5490:75: (iv_ruleLogicalMeasurementSystemConversion= ruleLogicalMeasurementSystemConversion EOF )
            // InternalUddl.g:5491:2: iv_ruleLogicalMeasurementSystemConversion= ruleLogicalMeasurementSystemConversion EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementSystemConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurementSystemConversion=ruleLogicalMeasurementSystemConversion();

            state._fsp--;

             current =iv_ruleLogicalMeasurementSystemConversion; 
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
    // $ANTLR end "entryRuleLogicalMeasurementSystemConversion"


    // $ANTLR start "ruleLogicalMeasurementSystemConversion"
    // InternalUddl.g:5497:1: ruleLogicalMeasurementSystemConversion returns [EObject current=null] : (otherlv_0= 'msc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' ) ;
    public final EObject ruleLogicalMeasurementSystemConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_equation_6_0=null;
        Token otherlv_7=null;
        Token lv_equation_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_conversionLossDescription_12_0=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalUddl.g:5503:2: ( (otherlv_0= 'msc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' ) )
            // InternalUddl.g:5504:2: (otherlv_0= 'msc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' )
            {
            // InternalUddl.g:5504:2: (otherlv_0= 'msc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' )
            // InternalUddl.g:5505:3: otherlv_0= 'msc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,90,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalMeasurementSystemConversionAccess().getMscKeyword_0());
            		
            // InternalUddl.g:5509:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:5510:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:5510:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:5511:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalMeasurementSystemConversionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:5527:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==RULE_STRING) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalUddl.g:5528:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:5528:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:5529:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalMeasurementSystemConversionAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalMeasurementSystemConversionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalMeasurementSystemConversionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:5549:3: ( ( ruleQN ) )
            // InternalUddl.g:5550:4: ( ruleQN )
            {
            // InternalUddl.g:5550:4: ( ruleQN )
            // InternalUddl.g:5551:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemConversionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementSystemConversionAccess().getSourceLogicalMeasurementSystemCrossReference_4_0());
            				
            pushFollow(FOLLOW_45);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,49,FOLLOW_41); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalMeasurementSystemConversionAccess().getHyphenMinusLeftParenthesisKeyword_5());
            		
            // InternalUddl.g:5569:3: ( (lv_equation_6_0= RULE_STRING ) )
            // InternalUddl.g:5570:4: (lv_equation_6_0= RULE_STRING )
            {
            // InternalUddl.g:5570:4: (lv_equation_6_0= RULE_STRING )
            // InternalUddl.g:5571:5: lv_equation_6_0= RULE_STRING
            {
            lv_equation_6_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

            					newLeafNode(lv_equation_6_0, grammarAccess.getLogicalMeasurementSystemConversionAccess().getEquationSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemConversionRule());
            					}
            					addWithLastConsumed(
            						current,
            						"equation",
            						lv_equation_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUddl.g:5587:3: (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==62) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalUddl.g:5588:4: otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,62,FOLLOW_41); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalMeasurementSystemConversionAccess().getCommaKeyword_7_0());
                    			
                    // InternalUddl.g:5592:4: ( (lv_equation_8_0= RULE_STRING ) )
                    // InternalUddl.g:5593:5: (lv_equation_8_0= RULE_STRING )
                    {
                    // InternalUddl.g:5593:5: (lv_equation_8_0= RULE_STRING )
                    // InternalUddl.g:5594:6: lv_equation_8_0= RULE_STRING
                    {
                    lv_equation_8_0=(Token)match(input,RULE_STRING,FOLLOW_85); 

                    						newLeafNode(lv_equation_8_0, grammarAccess.getLogicalMeasurementSystemConversionAccess().getEquationSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalMeasurementSystemConversionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"equation",
                    							lv_equation_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,91,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getLogicalMeasurementSystemConversionAccess().getRightParenthesisGreaterThanSignKeyword_8());
            		
            // InternalUddl.g:5615:3: ( ( ruleQN ) )
            // InternalUddl.g:5616:4: ( ruleQN )
            {
            // InternalUddl.g:5616:4: ( ruleQN )
            // InternalUddl.g:5617:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemConversionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementSystemConversionAccess().getDestinationLogicalMeasurementSystemCrossReference_9_0());
            				
            pushFollow(FOLLOW_86);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,92,FOLLOW_41); 

            			newLeafNode(otherlv_11, grammarAccess.getLogicalMeasurementSystemConversionAccess().getLossKeyword_10());
            		
            // InternalUddl.g:5635:3: ( (lv_conversionLossDescription_12_0= RULE_STRING ) )
            // InternalUddl.g:5636:4: (lv_conversionLossDescription_12_0= RULE_STRING )
            {
            // InternalUddl.g:5636:4: (lv_conversionLossDescription_12_0= RULE_STRING )
            // InternalUddl.g:5637:5: lv_conversionLossDescription_12_0= RULE_STRING
            {
            lv_conversionLossDescription_12_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_conversionLossDescription_12_0, grammarAccess.getLogicalMeasurementSystemConversionAccess().getConversionLossDescriptionSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementSystemConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"conversionLossDescription",
            						lv_conversionLossDescription_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalMeasurementSystemConversionAccess().getRightCurlyBracketSemicolonKeyword_12());
            		

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
    // $ANTLR end "ruleLogicalMeasurementSystemConversion"


    // $ANTLR start "entryRuleLogicalMeasurement"
    // InternalUddl.g:5661:1: entryRuleLogicalMeasurement returns [EObject current=null] : iv_ruleLogicalMeasurement= ruleLogicalMeasurement EOF ;
    public final EObject entryRuleLogicalMeasurement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurement = null;


        try {
            // InternalUddl.g:5661:59: (iv_ruleLogicalMeasurement= ruleLogicalMeasurement EOF )
            // InternalUddl.g:5662:2: iv_ruleLogicalMeasurement= ruleLogicalMeasurement EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurement=ruleLogicalMeasurement();

            state._fsp--;

             current =iv_ruleLogicalMeasurement; 
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
    // $ANTLR end "entryRuleLogicalMeasurement"


    // $ANTLR start "ruleLogicalMeasurement"
    // InternalUddl.g:5668:1: ruleLogicalMeasurement returns [EObject current=null] : (otherlv_0= 'meas' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_attribute_6_0= ruleLogicalMeasurementAttribute ) )* (otherlv_7= 'axis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? otherlv_11= 'sys:' ( ( ruleQN ) ) (otherlv_13= '![' ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) ) otherlv_15= ']' )? otherlv_16= '};' ) ;
    public final EObject ruleLogicalMeasurement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_attribute_6_0 = null;

        EObject lv_constraint_14_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:5674:2: ( (otherlv_0= 'meas' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_attribute_6_0= ruleLogicalMeasurementAttribute ) )* (otherlv_7= 'axis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? otherlv_11= 'sys:' ( ( ruleQN ) ) (otherlv_13= '![' ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) ) otherlv_15= ']' )? otherlv_16= '};' ) )
            // InternalUddl.g:5675:2: (otherlv_0= 'meas' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_attribute_6_0= ruleLogicalMeasurementAttribute ) )* (otherlv_7= 'axis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? otherlv_11= 'sys:' ( ( ruleQN ) ) (otherlv_13= '![' ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) ) otherlv_15= ']' )? otherlv_16= '};' )
            {
            // InternalUddl.g:5675:2: (otherlv_0= 'meas' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_attribute_6_0= ruleLogicalMeasurementAttribute ) )* (otherlv_7= 'axis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? otherlv_11= 'sys:' ( ( ruleQN ) ) (otherlv_13= '![' ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) ) otherlv_15= ']' )? otherlv_16= '};' )
            // InternalUddl.g:5676:3: otherlv_0= 'meas' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_attribute_6_0= ruleLogicalMeasurementAttribute ) )* (otherlv_7= 'axis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )? otherlv_11= 'sys:' ( ( ruleQN ) ) (otherlv_13= '![' ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) ) otherlv_15= ']' )? otherlv_16= '};'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalMeasurementAccess().getMeasKeyword_0());
            		
            // InternalUddl.g:5680:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:5681:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:5681:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:5682:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalMeasurementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:5698:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==RULE_STRING) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalUddl.g:5699:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:5699:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:5700:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalMeasurementAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalMeasurementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalMeasurementAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:5720:3: ( ( ruleQN ) )
            // InternalUddl.g:5721:4: ( ruleQN )
            {
            // InternalUddl.g:5721:4: ( ruleQN )
            // InternalUddl.g:5722:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementAccess().getRealizesConceptualObservableCrossReference_4_0());
            				
            pushFollow(FOLLOW_6);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_89); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalMeasurementAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalUddl.g:5740:3: ( (lv_attribute_6_0= ruleLogicalMeasurementAttribute ) )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==RULE_ID) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // InternalUddl.g:5741:4: (lv_attribute_6_0= ruleLogicalMeasurementAttribute )
            	    {
            	    // InternalUddl.g:5741:4: (lv_attribute_6_0= ruleLogicalMeasurementAttribute )
            	    // InternalUddl.g:5742:5: lv_attribute_6_0= ruleLogicalMeasurementAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getLogicalMeasurementAccess().getAttributeLogicalMeasurementAttributeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_89);
            	    lv_attribute_6_0=ruleLogicalMeasurementAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLogicalMeasurementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attribute",
            	    						lv_attribute_6_0,
            	    						"com.epistimis.uddl.Uddl.LogicalMeasurementAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);

            // InternalUddl.g:5759:3: (otherlv_7= 'axis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']' )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==66) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalUddl.g:5760:4: otherlv_7= 'axis:' otherlv_8= '[' ( ( ruleQN ) )+ otherlv_10= ']'
                    {
                    otherlv_7=(Token)match(input,66,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalMeasurementAccess().getAxisKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalMeasurementAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalUddl.g:5768:4: ( ( ruleQN ) )+
                    int cnt126=0;
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==RULE_ID) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // InternalUddl.g:5769:5: ( ruleQN )
                    	    {
                    	    // InternalUddl.g:5769:5: ( ruleQN )
                    	    // InternalUddl.g:5770:6: ruleQN
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getLogicalMeasurementRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getLogicalMeasurementAccess().getMeasurementAxisLogicalMeasurementAxisCrossReference_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    ruleQN();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt126 >= 1 ) break loop126;
                                EarlyExitException eee =
                                    new EarlyExitException(126, input);
                                throw eee;
                        }
                        cnt126++;
                    } while (true);

                    otherlv_10=(Token)match(input,29,FOLLOW_90); 

                    				newLeafNode(otherlv_10, grammarAccess.getLogicalMeasurementAccess().getRightSquareBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,95,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getLogicalMeasurementAccess().getSysKeyword_8());
            		
            // InternalUddl.g:5793:3: ( ( ruleQN ) )
            // InternalUddl.g:5794:4: ( ruleQN )
            {
            // InternalUddl.g:5794:4: ( ruleQN )
            // InternalUddl.g:5795:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementAccess().getMeasurementSystemLogicalAbstractMeasurementSystemCrossReference_9_0());
            				
            pushFollow(FOLLOW_68);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:5809:3: (otherlv_13= '![' ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) ) otherlv_15= ']' )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==79) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalUddl.g:5810:4: otherlv_13= '![' ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) ) otherlv_15= ']'
                    {
                    otherlv_13=(Token)match(input,79,FOLLOW_41); 

                    				newLeafNode(otherlv_13, grammarAccess.getLogicalMeasurementAccess().getExclamationMarkLeftSquareBracketKeyword_10_0());
                    			
                    // InternalUddl.g:5814:4: ( (lv_constraint_14_0= ruleLogicalMeasurementConstraint ) )
                    // InternalUddl.g:5815:5: (lv_constraint_14_0= ruleLogicalMeasurementConstraint )
                    {
                    // InternalUddl.g:5815:5: (lv_constraint_14_0= ruleLogicalMeasurementConstraint )
                    // InternalUddl.g:5816:6: lv_constraint_14_0= ruleLogicalMeasurementConstraint
                    {

                    						newCompositeNode(grammarAccess.getLogicalMeasurementAccess().getConstraintLogicalMeasurementConstraintParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_constraint_14_0=ruleLogicalMeasurementConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalMeasurementRule());
                    						}
                    						add(
                    							current,
                    							"constraint",
                    							lv_constraint_14_0,
                    							"com.epistimis.uddl.Uddl.LogicalMeasurementConstraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_15, grammarAccess.getLogicalMeasurementAccess().getRightSquareBracketKeyword_10_2());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getLogicalMeasurementAccess().getRightCurlyBracketSemicolonKeyword_11());
            		

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
    // $ANTLR end "ruleLogicalMeasurement"


    // $ANTLR start "entryRuleLogicalMeasurementAxis"
    // InternalUddl.g:5846:1: entryRuleLogicalMeasurementAxis returns [EObject current=null] : iv_ruleLogicalMeasurementAxis= ruleLogicalMeasurementAxis EOF ;
    public final EObject entryRuleLogicalMeasurementAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurementAxis = null;


        try {
            // InternalUddl.g:5846:63: (iv_ruleLogicalMeasurementAxis= ruleLogicalMeasurementAxis EOF )
            // InternalUddl.g:5847:2: iv_ruleLogicalMeasurementAxis= ruleLogicalMeasurementAxis EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementAxisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurementAxis=ruleLogicalMeasurementAxis();

            state._fsp--;

             current =iv_ruleLogicalMeasurementAxis; 
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
    // $ANTLR end "entryRuleLogicalMeasurementAxis"


    // $ANTLR start "ruleLogicalMeasurementAxis"
    // InternalUddl.g:5853:1: ruleLogicalMeasurementAxis returns [EObject current=null] : (otherlv_0= 'maxis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'msaxis:' ( ( ruleQN ) ) (otherlv_8= 'vtu:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? (otherlv_12= '![' ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+ otherlv_14= ']' )? otherlv_15= '};' ) ;
    public final EObject ruleLogicalMeasurementAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_constraint_13_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:5859:2: ( (otherlv_0= 'maxis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'msaxis:' ( ( ruleQN ) ) (otherlv_8= 'vtu:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? (otherlv_12= '![' ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+ otherlv_14= ']' )? otherlv_15= '};' ) )
            // InternalUddl.g:5860:2: (otherlv_0= 'maxis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'msaxis:' ( ( ruleQN ) ) (otherlv_8= 'vtu:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? (otherlv_12= '![' ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+ otherlv_14= ']' )? otherlv_15= '};' )
            {
            // InternalUddl.g:5860:2: (otherlv_0= 'maxis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'msaxis:' ( ( ruleQN ) ) (otherlv_8= 'vtu:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? (otherlv_12= '![' ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+ otherlv_14= ']' )? otherlv_15= '};' )
            // InternalUddl.g:5861:3: otherlv_0= 'maxis' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'msaxis:' ( ( ruleQN ) ) (otherlv_8= 'vtu:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )? (otherlv_12= '![' ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+ otherlv_14= ']' )? otherlv_15= '};'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalMeasurementAxisAccess().getMaxisKeyword_0());
            		
            // InternalUddl.g:5865:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:5866:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:5866:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:5867:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_91); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalMeasurementAxisAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementAxisRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:5883:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==RULE_STRING) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalUddl.g:5884:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:5884:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:5885:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalMeasurementAxisAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalMeasurementAxisRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:5901:3: (otherlv_3= '->' ( ( ruleQN ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==94) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalUddl.g:5902:4: otherlv_3= '->' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,94,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalMeasurementAxisAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalUddl.g:5906:4: ( ( ruleQN ) )
                    // InternalUddl.g:5907:5: ( ruleQN )
                    {
                    // InternalUddl.g:5907:5: ( ruleQN )
                    // InternalUddl.g:5908:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalMeasurementAxisRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalMeasurementAxisAccess().getRealizesConceptualObservableCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_93); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalMeasurementAxisAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,97,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalMeasurementAxisAccess().getMsaxisKeyword_5());
            		
            // InternalUddl.g:5931:3: ( ( ruleQN ) )
            // InternalUddl.g:5932:4: ( ruleQN )
            {
            // InternalUddl.g:5932:4: ( ruleQN )
            // InternalUddl.g:5933:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementAxisRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementAxisAccess().getMeasurementSystemAxisLogicalMeasurementSystemAxisCrossReference_6_0());
            				
            pushFollow(FOLLOW_94);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:5947:3: (otherlv_8= 'vtu:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']' )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==81) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalUddl.g:5948:4: otherlv_8= 'vtu:' otherlv_9= '[' ( ( ruleQN ) )+ otherlv_11= ']'
                    {
                    otherlv_8=(Token)match(input,81,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalMeasurementAxisAccess().getVtuKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getLogicalMeasurementAxisAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalUddl.g:5956:4: ( ( ruleQN ) )+
                    int cnt131=0;
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==RULE_ID) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // InternalUddl.g:5957:5: ( ruleQN )
                    	    {
                    	    // InternalUddl.g:5957:5: ( ruleQN )
                    	    // InternalUddl.g:5958:6: ruleQN
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getLogicalMeasurementAxisRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getLogicalMeasurementAxisAccess().getValueTypeUnitLogicalValueTypeUnitCrossReference_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    ruleQN();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt131 >= 1 ) break loop131;
                                EarlyExitException eee =
                                    new EarlyExitException(131, input);
                                throw eee;
                        }
                        cnt131++;
                    } while (true);

                    otherlv_11=(Token)match(input,29,FOLLOW_68); 

                    				newLeafNode(otherlv_11, grammarAccess.getLogicalMeasurementAxisAccess().getRightSquareBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            // InternalUddl.g:5977:3: (otherlv_12= '![' ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+ otherlv_14= ']' )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==79) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalUddl.g:5978:4: otherlv_12= '![' ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+ otherlv_14= ']'
                    {
                    otherlv_12=(Token)match(input,79,FOLLOW_41); 

                    				newLeafNode(otherlv_12, grammarAccess.getLogicalMeasurementAxisAccess().getExclamationMarkLeftSquareBracketKeyword_8_0());
                    			
                    // InternalUddl.g:5982:4: ( (lv_constraint_13_0= ruleLogicalMeasurementConstraint ) )+
                    int cnt133=0;
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==RULE_STRING) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // InternalUddl.g:5983:5: (lv_constraint_13_0= ruleLogicalMeasurementConstraint )
                    	    {
                    	    // InternalUddl.g:5983:5: (lv_constraint_13_0= ruleLogicalMeasurementConstraint )
                    	    // InternalUddl.g:5984:6: lv_constraint_13_0= ruleLogicalMeasurementConstraint
                    	    {

                    	    						newCompositeNode(grammarAccess.getLogicalMeasurementAxisAccess().getConstraintLogicalMeasurementConstraintParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_69);
                    	    lv_constraint_13_0=ruleLogicalMeasurementConstraint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLogicalMeasurementAxisRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"constraint",
                    	    							lv_constraint_13_0,
                    	    							"com.epistimis.uddl.Uddl.LogicalMeasurementConstraint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt133 >= 1 ) break loop133;
                                EarlyExitException eee =
                                    new EarlyExitException(133, input);
                                throw eee;
                        }
                        cnt133++;
                    } while (true);

                    otherlv_14=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getLogicalMeasurementAxisAccess().getRightSquareBracketKeyword_8_2());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getLogicalMeasurementAxisAccess().getRightCurlyBracketSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleLogicalMeasurementAxis"


    // $ANTLR start "entryRuleLogicalMeasurementAttribute"
    // InternalUddl.g:6014:1: entryRuleLogicalMeasurementAttribute returns [EObject current=null] : iv_ruleLogicalMeasurementAttribute= ruleLogicalMeasurementAttribute EOF ;
    public final EObject entryRuleLogicalMeasurementAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurementAttribute = null;


        try {
            // InternalUddl.g:6014:68: (iv_ruleLogicalMeasurementAttribute= ruleLogicalMeasurementAttribute EOF )
            // InternalUddl.g:6015:2: iv_ruleLogicalMeasurementAttribute= ruleLogicalMeasurementAttribute EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurementAttribute=ruleLogicalMeasurementAttribute();

            state._fsp--;

             current =iv_ruleLogicalMeasurementAttribute; 
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
    // $ANTLR end "entryRuleLogicalMeasurementAttribute"


    // $ANTLR start "ruleLogicalMeasurementAttribute"
    // InternalUddl.g:6021:1: ruleLogicalMeasurementAttribute returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleLogicalMeasurementAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUddl.g:6027:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalUddl.g:6028:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalUddl.g:6028:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalUddl.g:6029:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalUddl.g:6029:3: ( ( ruleQN ) )
            // InternalUddl.g:6030:4: ( ruleQN )
            {
            // InternalUddl.g:6030:4: ( ruleQN )
            // InternalUddl.g:6031:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementAttributeAccess().getTypeLogicalMeasurementCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:6045:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:6046:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:6046:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:6047:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getLogicalMeasurementAttributeAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLogicalMeasurementAttributeAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleLogicalMeasurementAttribute"


    // $ANTLR start "entryRuleLogicalMeasurementConversion"
    // InternalUddl.g:6071:1: entryRuleLogicalMeasurementConversion returns [EObject current=null] : iv_ruleLogicalMeasurementConversion= ruleLogicalMeasurementConversion EOF ;
    public final EObject entryRuleLogicalMeasurementConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalMeasurementConversion = null;


        try {
            // InternalUddl.g:6071:69: (iv_ruleLogicalMeasurementConversion= ruleLogicalMeasurementConversion EOF )
            // InternalUddl.g:6072:2: iv_ruleLogicalMeasurementConversion= ruleLogicalMeasurementConversion EOF
            {
             newCompositeNode(grammarAccess.getLogicalMeasurementConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalMeasurementConversion=ruleLogicalMeasurementConversion();

            state._fsp--;

             current =iv_ruleLogicalMeasurementConversion; 
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
    // $ANTLR end "entryRuleLogicalMeasurementConversion"


    // $ANTLR start "ruleLogicalMeasurementConversion"
    // InternalUddl.g:6078:1: ruleLogicalMeasurementConversion returns [EObject current=null] : (otherlv_0= 'mc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' ) ;
    public final EObject ruleLogicalMeasurementConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_equation_6_0=null;
        Token otherlv_7=null;
        Token lv_equation_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_conversionLossDescription_12_0=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalUddl.g:6084:2: ( (otherlv_0= 'mc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' ) )
            // InternalUddl.g:6085:2: (otherlv_0= 'mc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' )
            {
            // InternalUddl.g:6085:2: (otherlv_0= 'mc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};' )
            // InternalUddl.g:6086:3: otherlv_0= 'mc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( ( ruleQN ) ) otherlv_5= '-(' ( (lv_equation_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )? otherlv_9= ')>' ( ( ruleQN ) ) otherlv_11= 'loss:' ( (lv_conversionLossDescription_12_0= RULE_STRING ) ) otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,98,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalMeasurementConversionAccess().getMcKeyword_0());
            		
            // InternalUddl.g:6090:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:6091:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:6091:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:6092:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalMeasurementConversionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:6108:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==RULE_STRING) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalUddl.g:6109:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:6109:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:6110:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalMeasurementConversionAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalMeasurementConversionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalMeasurementConversionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUddl.g:6130:3: ( ( ruleQN ) )
            // InternalUddl.g:6131:4: ( ruleQN )
            {
            // InternalUddl.g:6131:4: ( ruleQN )
            // InternalUddl.g:6132:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementConversionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementConversionAccess().getSourceLogicalMeasurementCrossReference_4_0());
            				
            pushFollow(FOLLOW_45);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,49,FOLLOW_41); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalMeasurementConversionAccess().getHyphenMinusLeftParenthesisKeyword_5());
            		
            // InternalUddl.g:6150:3: ( (lv_equation_6_0= RULE_STRING ) )
            // InternalUddl.g:6151:4: (lv_equation_6_0= RULE_STRING )
            {
            // InternalUddl.g:6151:4: (lv_equation_6_0= RULE_STRING )
            // InternalUddl.g:6152:5: lv_equation_6_0= RULE_STRING
            {
            lv_equation_6_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

            					newLeafNode(lv_equation_6_0, grammarAccess.getLogicalMeasurementConversionAccess().getEquationSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementConversionRule());
            					}
            					addWithLastConsumed(
            						current,
            						"equation",
            						lv_equation_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUddl.g:6168:3: (otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==62) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalUddl.g:6169:4: otherlv_7= ',' ( (lv_equation_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,62,FOLLOW_41); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalMeasurementConversionAccess().getCommaKeyword_7_0());
                    			
                    // InternalUddl.g:6173:4: ( (lv_equation_8_0= RULE_STRING ) )
                    // InternalUddl.g:6174:5: (lv_equation_8_0= RULE_STRING )
                    {
                    // InternalUddl.g:6174:5: (lv_equation_8_0= RULE_STRING )
                    // InternalUddl.g:6175:6: lv_equation_8_0= RULE_STRING
                    {
                    lv_equation_8_0=(Token)match(input,RULE_STRING,FOLLOW_85); 

                    						newLeafNode(lv_equation_8_0, grammarAccess.getLogicalMeasurementConversionAccess().getEquationSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalMeasurementConversionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"equation",
                    							lv_equation_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,91,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getLogicalMeasurementConversionAccess().getRightParenthesisGreaterThanSignKeyword_8());
            		
            // InternalUddl.g:6196:3: ( ( ruleQN ) )
            // InternalUddl.g:6197:4: ( ruleQN )
            {
            // InternalUddl.g:6197:4: ( ruleQN )
            // InternalUddl.g:6198:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementConversionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalMeasurementConversionAccess().getTargetLogicalMeasurementCrossReference_9_0());
            				
            pushFollow(FOLLOW_86);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,92,FOLLOW_41); 

            			newLeafNode(otherlv_11, grammarAccess.getLogicalMeasurementConversionAccess().getLossKeyword_10());
            		
            // InternalUddl.g:6216:3: ( (lv_conversionLossDescription_12_0= RULE_STRING ) )
            // InternalUddl.g:6217:4: (lv_conversionLossDescription_12_0= RULE_STRING )
            {
            // InternalUddl.g:6217:4: (lv_conversionLossDescription_12_0= RULE_STRING )
            // InternalUddl.g:6218:5: lv_conversionLossDescription_12_0= RULE_STRING
            {
            lv_conversionLossDescription_12_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_conversionLossDescription_12_0, grammarAccess.getLogicalMeasurementConversionAccess().getConversionLossDescriptionSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalMeasurementConversionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"conversionLossDescription",
            						lv_conversionLossDescription_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalMeasurementConversionAccess().getRightCurlyBracketSemicolonKeyword_12());
            		

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
    // $ANTLR end "ruleLogicalMeasurementConversion"


    // $ANTLR start "entryRuleLogicalComposableElement"
    // InternalUddl.g:6242:1: entryRuleLogicalComposableElement returns [EObject current=null] : iv_ruleLogicalComposableElement= ruleLogicalComposableElement EOF ;
    public final EObject entryRuleLogicalComposableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalComposableElement = null;


        try {
            // InternalUddl.g:6242:65: (iv_ruleLogicalComposableElement= ruleLogicalComposableElement EOF )
            // InternalUddl.g:6243:2: iv_ruleLogicalComposableElement= ruleLogicalComposableElement EOF
            {
             newCompositeNode(grammarAccess.getLogicalComposableElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalComposableElement=ruleLogicalComposableElement();

            state._fsp--;

             current =iv_ruleLogicalComposableElement; 
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
    // $ANTLR end "entryRuleLogicalComposableElement"


    // $ANTLR start "ruleLogicalComposableElement"
    // InternalUddl.g:6249:1: ruleLogicalComposableElement returns [EObject current=null] : (this_LogicalEntity_0= ruleLogicalEntity | this_LogicalMeasurement_1= ruleLogicalMeasurement ) ;
    public final EObject ruleLogicalComposableElement() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalEntity_0 = null;

        EObject this_LogicalMeasurement_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:6255:2: ( (this_LogicalEntity_0= ruleLogicalEntity | this_LogicalMeasurement_1= ruleLogicalMeasurement ) )
            // InternalUddl.g:6256:2: (this_LogicalEntity_0= ruleLogicalEntity | this_LogicalMeasurement_1= ruleLogicalMeasurement )
            {
            // InternalUddl.g:6256:2: (this_LogicalEntity_0= ruleLogicalEntity | this_LogicalMeasurement_1= ruleLogicalMeasurement )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( ((LA137_0>=99 && LA137_0<=100)) ) {
                alt137=1;
            }
            else if ( (LA137_0==93) ) {
                alt137=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // InternalUddl.g:6257:3: this_LogicalEntity_0= ruleLogicalEntity
                    {

                    			newCompositeNode(grammarAccess.getLogicalComposableElementAccess().getLogicalEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalEntity_0=ruleLogicalEntity();

                    state._fsp--;


                    			current = this_LogicalEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:6266:3: this_LogicalMeasurement_1= ruleLogicalMeasurement
                    {

                    			newCompositeNode(grammarAccess.getLogicalComposableElementAccess().getLogicalMeasurementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalMeasurement_1=ruleLogicalMeasurement();

                    state._fsp--;


                    			current = this_LogicalMeasurement_1;
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
    // $ANTLR end "ruleLogicalComposableElement"


    // $ANTLR start "entryRuleLogicalEntity"
    // InternalUddl.g:6278:1: entryRuleLogicalEntity returns [EObject current=null] : iv_ruleLogicalEntity= ruleLogicalEntity EOF ;
    public final EObject entryRuleLogicalEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalEntity = null;


        try {
            // InternalUddl.g:6278:54: (iv_ruleLogicalEntity= ruleLogicalEntity EOF )
            // InternalUddl.g:6279:2: iv_ruleLogicalEntity= ruleLogicalEntity EOF
            {
             newCompositeNode(grammarAccess.getLogicalEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalEntity=ruleLogicalEntity();

            state._fsp--;

             current =iv_ruleLogicalEntity; 
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
    // $ANTLR end "entryRuleLogicalEntity"


    // $ANTLR start "ruleLogicalEntity"
    // InternalUddl.g:6285:1: ruleLogicalEntity returns [EObject current=null] : ( (otherlv_0= 'lentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* otherlv_9= '};' ) | this_LogicalAssociation_10= ruleLogicalAssociation ) ;
    public final EObject ruleLogicalEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_composition_8_0 = null;

        EObject this_LogicalAssociation_10 = null;



        	enterRule();

        try {
            // InternalUddl.g:6291:2: ( ( (otherlv_0= 'lentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* otherlv_9= '};' ) | this_LogicalAssociation_10= ruleLogicalAssociation ) )
            // InternalUddl.g:6292:2: ( (otherlv_0= 'lentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* otherlv_9= '};' ) | this_LogicalAssociation_10= ruleLogicalAssociation )
            {
            // InternalUddl.g:6292:2: ( (otherlv_0= 'lentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* otherlv_9= '};' ) | this_LogicalAssociation_10= ruleLogicalAssociation )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==99) ) {
                alt141=1;
            }
            else if ( (LA141_0==100) ) {
                alt141=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // InternalUddl.g:6293:3: (otherlv_0= 'lentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* otherlv_9= '};' )
                    {
                    // InternalUddl.g:6293:3: (otherlv_0= 'lentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* otherlv_9= '};' )
                    // InternalUddl.g:6294:4: otherlv_0= 'lentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* otherlv_9= '};'
                    {
                    otherlv_0=(Token)match(input,99,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getLogicalEntityAccess().getLentityKeyword_0_0());
                    			
                    // InternalUddl.g:6298:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalUddl.g:6299:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUddl.g:6299:5: (lv_name_1_0= RULE_ID )
                    // InternalUddl.g:6300:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_95); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getLogicalEntityAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalUddl.g:6316:4: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==RULE_STRING) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // InternalUddl.g:6317:5: (lv_description_2_0= RULE_STRING )
                            {
                            // InternalUddl.g:6317:5: (lv_description_2_0= RULE_STRING )
                            // InternalUddl.g:6318:6: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_96); 

                            						newLeafNode(lv_description_2_0, grammarAccess.getLogicalEntityAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getLogicalEntityRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"description",
                            							lv_description_2_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }

                    // InternalUddl.g:6334:4: (otherlv_3= ':' ( ( ruleQN ) ) )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==32) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // InternalUddl.g:6335:5: otherlv_3= ':' ( ( ruleQN ) )
                            {
                            otherlv_3=(Token)match(input,32,FOLLOW_4); 

                            					newLeafNode(otherlv_3, grammarAccess.getLogicalEntityAccess().getColonKeyword_0_3_0());
                            				
                            // InternalUddl.g:6339:5: ( ( ruleQN ) )
                            // InternalUddl.g:6340:6: ( ruleQN )
                            {
                            // InternalUddl.g:6340:6: ( ruleQN )
                            // InternalUddl.g:6341:7: ruleQN
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLogicalEntityRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getLogicalEntityAccess().getSpecializesLogicalEntityCrossReference_0_3_1_0());
                            						
                            pushFollow(FOLLOW_88);
                            ruleQN();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,94,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogicalEntityAccess().getHyphenMinusGreaterThanSignKeyword_0_4());
                    			
                    // InternalUddl.g:6360:4: ( ( ruleQN ) )
                    // InternalUddl.g:6361:5: ( ruleQN )
                    {
                    // InternalUddl.g:6361:5: ( ruleQN )
                    // InternalUddl.g:6362:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalEntityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalEntityAccess().getRealizesConceptualEntityCrossReference_0_5_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_43); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicalEntityAccess().getLeftCurlyBracketKeyword_0_6());
                    			
                    // InternalUddl.g:6380:4: ( (lv_composition_8_0= ruleLogicalComposition ) )*
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==RULE_ID) ) {
                            alt140=1;
                        }


                        switch (alt140) {
                    	case 1 :
                    	    // InternalUddl.g:6381:5: (lv_composition_8_0= ruleLogicalComposition )
                    	    {
                    	    // InternalUddl.g:6381:5: (lv_composition_8_0= ruleLogicalComposition )
                    	    // InternalUddl.g:6382:6: lv_composition_8_0= ruleLogicalComposition
                    	    {

                    	    						newCompositeNode(grammarAccess.getLogicalEntityAccess().getCompositionLogicalCompositionParserRuleCall_0_7_0());
                    	    					
                    	    pushFollow(FOLLOW_43);
                    	    lv_composition_8_0=ruleLogicalComposition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLogicalEntityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"composition",
                    	    							lv_composition_8_0,
                    	    							"com.epistimis.uddl.Uddl.LogicalComposition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop140;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getLogicalEntityAccess().getRightCurlyBracketSemicolonKeyword_0_8());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUddl.g:6405:3: this_LogicalAssociation_10= ruleLogicalAssociation
                    {

                    			newCompositeNode(grammarAccess.getLogicalEntityAccess().getLogicalAssociationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalAssociation_10=ruleLogicalAssociation();

                    state._fsp--;


                    			current = this_LogicalAssociation_10;
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
    // $ANTLR end "ruleLogicalEntity"


    // $ANTLR start "entryRuleLogicalComposition"
    // InternalUddl.g:6417:1: entryRuleLogicalComposition returns [EObject current=null] : iv_ruleLogicalComposition= ruleLogicalComposition EOF ;
    public final EObject entryRuleLogicalComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalComposition = null;


        try {
            // InternalUddl.g:6417:59: (iv_ruleLogicalComposition= ruleLogicalComposition EOF )
            // InternalUddl.g:6418:2: iv_ruleLogicalComposition= ruleLogicalComposition EOF
            {
             newCompositeNode(grammarAccess.getLogicalCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalComposition=ruleLogicalComposition();

            state._fsp--;

             current =iv_ruleLogicalComposition; 
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
    // $ANTLR end "entryRuleLogicalComposition"


    // $ANTLR start "ruleLogicalComposition"
    // InternalUddl.g:6424:1: ruleLogicalComposition returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= ';' ) ;
    public final EObject ruleLogicalComposition() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_1=null;
        Token lv_upperBound_5_2=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalUddl.g:6430:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= ';' ) )
            // InternalUddl.g:6431:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= ';' )
            {
            // InternalUddl.g:6431:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= ';' )
            // InternalUddl.g:6432:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= ';'
            {
            // InternalUddl.g:6432:3: ( ( ruleQN ) )
            // InternalUddl.g:6433:4: ( ruleQN )
            {
            // InternalUddl.g:6433:4: ( ruleQN )
            // InternalUddl.g:6434:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalCompositionAccess().getTypeLogicalComposableElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:6448:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:6449:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:6449:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:6450:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_97); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getLogicalCompositionAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:6466:3: (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==28) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalUddl.g:6467:4: otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getLogicalCompositionAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalUddl.g:6471:4: ( (lv_lowerBound_3_0= RULE_INT ) )
                    // InternalUddl.g:6472:5: (lv_lowerBound_3_0= RULE_INT )
                    {
                    // InternalUddl.g:6472:5: (lv_lowerBound_3_0= RULE_INT )
                    // InternalUddl.g:6473:6: lv_lowerBound_3_0= RULE_INT
                    {
                    lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_lowerBound_3_0, grammarAccess.getLogicalCompositionAccess().getLowerBoundINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalCompositionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogicalCompositionAccess().getColonKeyword_2_2());
                    			
                    // InternalUddl.g:6493:4: ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )
                    // InternalUddl.g:6494:5: ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) )
                    {
                    // InternalUddl.g:6494:5: ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) )
                    // InternalUddl.g:6495:6: (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT )
                    {
                    // InternalUddl.g:6495:6: (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT )
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==RULE_INT) ) {
                        alt142=1;
                    }
                    else if ( (LA142_0==RULE_SIGNED_INT) ) {
                        alt142=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 142, 0, input);

                        throw nvae;
                    }
                    switch (alt142) {
                        case 1 :
                            // InternalUddl.g:6496:7: lv_upperBound_5_1= RULE_INT
                            {
                            lv_upperBound_5_1=(Token)match(input,RULE_INT,FOLLOW_27); 

                            							newLeafNode(lv_upperBound_5_1, grammarAccess.getLogicalCompositionAccess().getUpperBoundINTTerminalRuleCall_2_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLogicalCompositionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"upperBound",
                            								lv_upperBound_5_1,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }
                            break;
                        case 2 :
                            // InternalUddl.g:6511:7: lv_upperBound_5_2= RULE_SIGNED_INT
                            {
                            lv_upperBound_5_2=(Token)match(input,RULE_SIGNED_INT,FOLLOW_27); 

                            							newLeafNode(lv_upperBound_5_2, grammarAccess.getLogicalCompositionAccess().getUpperBoundSIGNED_INTTerminalRuleCall_2_3_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLogicalCompositionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"upperBound",
                            								lv_upperBound_5_2,
                            								"com.epistimis.uddl.Uddl.SIGNED_INT");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_95); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalCompositionAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalUddl.g:6533:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==RULE_STRING) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalUddl.g:6534:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:6534:4: (lv_description_7_0= RULE_STRING )
                    // InternalUddl.g:6535:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_96); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getLogicalCompositionAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalCompositionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:6551:3: (otherlv_8= ':' ( ( ruleQN ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==32) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalUddl.g:6552:4: otherlv_8= ':' ( ( ruleQN ) )
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalCompositionAccess().getColonKeyword_4_0());
                    			
                    // InternalUddl.g:6556:4: ( ( ruleQN ) )
                    // InternalUddl.g:6557:5: ( ruleQN )
                    {
                    // InternalUddl.g:6557:5: ( ruleQN )
                    // InternalUddl.g:6558:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalCompositionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalCompositionAccess().getSpecializesLogicalCharacteristicCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_88);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalCompositionAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalUddl.g:6577:3: ( ( ruleQN ) )
            // InternalUddl.g:6578:4: ( ruleQN )
            {
            // InternalUddl.g:6578:4: ( ruleQN )
            // InternalUddl.g:6579:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalCompositionAccess().getRealizesConceptualCompositionCrossReference_6_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLogicalCompositionAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleLogicalComposition"


    // $ANTLR start "entryRuleLogicalAssociation"
    // InternalUddl.g:6601:1: entryRuleLogicalAssociation returns [EObject current=null] : iv_ruleLogicalAssociation= ruleLogicalAssociation EOF ;
    public final EObject entryRuleLogicalAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAssociation = null;


        try {
            // InternalUddl.g:6601:59: (iv_ruleLogicalAssociation= ruleLogicalAssociation EOF )
            // InternalUddl.g:6602:2: iv_ruleLogicalAssociation= ruleLogicalAssociation EOF
            {
             newCompositeNode(grammarAccess.getLogicalAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAssociation=ruleLogicalAssociation();

            state._fsp--;

             current =iv_ruleLogicalAssociation; 
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
    // $ANTLR end "entryRuleLogicalAssociation"


    // $ANTLR start "ruleLogicalAssociation"
    // InternalUddl.g:6608:1: ruleLogicalAssociation returns [EObject current=null] : (otherlv_0= 'lassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= ruleLogicalParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' ) ;
    public final EObject ruleLogicalAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_composition_8_0 = null;

        EObject lv_participant_11_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:6614:2: ( (otherlv_0= 'lassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= ruleLogicalParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' ) )
            // InternalUddl.g:6615:2: (otherlv_0= 'lassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= ruleLogicalParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' )
            {
            // InternalUddl.g:6615:2: (otherlv_0= 'lassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= ruleLogicalParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' )
            // InternalUddl.g:6616:3: otherlv_0= 'lassoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= ruleLogicalComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= ruleLogicalParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalAssociationAccess().getLassocKeyword_0());
            		
            // InternalUddl.g:6620:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:6621:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:6621:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:6622:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_95); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalAssociationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalAssociationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:6638:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==RULE_STRING) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalUddl.g:6639:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:6639:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:6640:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_96); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalAssociationAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalAssociationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:6656:3: (otherlv_3= ':' ( ( ruleQN ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==32) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalUddl.g:6657:4: otherlv_3= ':' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalAssociationAccess().getColonKeyword_3_0());
                    			
                    // InternalUddl.g:6661:4: ( ( ruleQN ) )
                    // InternalUddl.g:6662:5: ( ruleQN )
                    {
                    // InternalUddl.g:6662:5: ( ruleQN )
                    // InternalUddl.g:6663:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalAssociationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalAssociationAccess().getSpecializesLogicalEntityCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_88);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalAssociationAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalUddl.g:6682:3: ( ( ruleQN ) )
            // InternalUddl.g:6683:4: ( ruleQN )
            {
            // InternalUddl.g:6683:4: ( ruleQN )
            // InternalUddl.g:6684:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalAssociationAccess().getRealizesConceptualEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_6);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_98); 

            			newLeafNode(otherlv_7, grammarAccess.getLogicalAssociationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalUddl.g:6702:3: ( (lv_composition_8_0= ruleLogicalComposition ) )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==RULE_ID) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // InternalUddl.g:6703:4: (lv_composition_8_0= ruleLogicalComposition )
            	    {
            	    // InternalUddl.g:6703:4: (lv_composition_8_0= ruleLogicalComposition )
            	    // InternalUddl.g:6704:5: lv_composition_8_0= ruleLogicalComposition
            	    {

            	    					newCompositeNode(grammarAccess.getLogicalAssociationAccess().getCompositionLogicalCompositionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_98);
            	    lv_composition_8_0=ruleLogicalComposition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLogicalAssociationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"composition",
            	    						lv_composition_8_0,
            	    						"com.epistimis.uddl.Uddl.LogicalComposition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop148;
                }
            } while (true);

            // InternalUddl.g:6721:3: (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= ruleLogicalParticipant ) )+ otherlv_12= ']' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==36) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalUddl.g:6722:4: otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= ruleLogicalParticipant ) )+ otherlv_12= ']'
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getLogicalAssociationAccess().getParticipantsKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getLogicalAssociationAccess().getLeftSquareBracketKeyword_8_1());
                    			
                    // InternalUddl.g:6730:4: ( (lv_participant_11_0= ruleLogicalParticipant ) )+
                    int cnt149=0;
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==RULE_ID) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // InternalUddl.g:6731:5: (lv_participant_11_0= ruleLogicalParticipant )
                    	    {
                    	    // InternalUddl.g:6731:5: (lv_participant_11_0= ruleLogicalParticipant )
                    	    // InternalUddl.g:6732:6: lv_participant_11_0= ruleLogicalParticipant
                    	    {

                    	    						newCompositeNode(grammarAccess.getLogicalAssociationAccess().getParticipantLogicalParticipantParserRuleCall_8_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_participant_11_0=ruleLogicalParticipant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLogicalAssociationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"participant",
                    	    							lv_participant_11_0,
                    	    							"com.epistimis.uddl.Uddl.LogicalParticipant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt149 >= 1 ) break loop149;
                                EarlyExitException eee =
                                    new EarlyExitException(149, input);
                                throw eee;
                        }
                        cnt149++;
                    } while (true);

                    otherlv_12=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getLogicalAssociationAccess().getRightSquareBracketKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalAssociationAccess().getRightCurlyBracketSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleLogicalAssociation"


    // $ANTLR start "entryRuleLogicalParticipant"
    // InternalUddl.g:6762:1: entryRuleLogicalParticipant returns [EObject current=null] : iv_ruleLogicalParticipant= ruleLogicalParticipant EOF ;
    public final EObject entryRuleLogicalParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalParticipant = null;


        try {
            // InternalUddl.g:6762:59: (iv_ruleLogicalParticipant= ruleLogicalParticipant EOF )
            // InternalUddl.g:6763:2: iv_ruleLogicalParticipant= ruleLogicalParticipant EOF
            {
             newCompositeNode(grammarAccess.getLogicalParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalParticipant=ruleLogicalParticipant();

            state._fsp--;

             current =iv_ruleLogicalParticipant; 
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
    // $ANTLR end "entryRuleLogicalParticipant"


    // $ANTLR start "ruleLogicalParticipant"
    // InternalUddl.g:6769:1: ruleLogicalParticipant returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= ruleLogicalPathNode ) ) )? otherlv_21= '};' ) ;
    public final EObject ruleLogicalParticipant() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_1=null;
        Token lv_upperBound_5_2=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_sourceLowerBound_15_0=null;
        Token otherlv_16=null;
        Token lv_sourceUpperBound_17_1=null;
        Token lv_sourceUpperBound_17_2=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_path_20_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:6775:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= ruleLogicalPathNode ) ) )? otherlv_21= '};' ) )
            // InternalUddl.g:6776:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= ruleLogicalPathNode ) ) )? otherlv_21= '};' )
            {
            // InternalUddl.g:6776:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= ruleLogicalPathNode ) ) )? otherlv_21= '};' )
            // InternalUddl.g:6777:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= ruleLogicalPathNode ) ) )? otherlv_21= '};'
            {
            // InternalUddl.g:6777:3: ( ( ruleQN ) )
            // InternalUddl.g:6778:4: ( ruleQN )
            {
            // InternalUddl.g:6778:4: ( ruleQN )
            // InternalUddl.g:6779:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalParticipantAccess().getTypeLogicalEntityCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:6793:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:6794:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:6794:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:6795:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_97); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getLogicalParticipantAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:6811:3: (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==28) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalUddl.g:6812:4: otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getLogicalParticipantAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalUddl.g:6816:4: ( (lv_lowerBound_3_0= RULE_INT ) )
                    // InternalUddl.g:6817:5: (lv_lowerBound_3_0= RULE_INT )
                    {
                    // InternalUddl.g:6817:5: (lv_lowerBound_3_0= RULE_INT )
                    // InternalUddl.g:6818:6: lv_lowerBound_3_0= RULE_INT
                    {
                    lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_lowerBound_3_0, grammarAccess.getLogicalParticipantAccess().getLowerBoundINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalParticipantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogicalParticipantAccess().getColonKeyword_2_2());
                    			
                    // InternalUddl.g:6838:4: ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )
                    // InternalUddl.g:6839:5: ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) )
                    {
                    // InternalUddl.g:6839:5: ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) )
                    // InternalUddl.g:6840:6: (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT )
                    {
                    // InternalUddl.g:6840:6: (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT )
                    int alt151=2;
                    int LA151_0 = input.LA(1);

                    if ( (LA151_0==RULE_INT) ) {
                        alt151=1;
                    }
                    else if ( (LA151_0==RULE_SIGNED_INT) ) {
                        alt151=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 151, 0, input);

                        throw nvae;
                    }
                    switch (alt151) {
                        case 1 :
                            // InternalUddl.g:6841:7: lv_upperBound_5_1= RULE_INT
                            {
                            lv_upperBound_5_1=(Token)match(input,RULE_INT,FOLLOW_27); 

                            							newLeafNode(lv_upperBound_5_1, grammarAccess.getLogicalParticipantAccess().getUpperBoundINTTerminalRuleCall_2_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLogicalParticipantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"upperBound",
                            								lv_upperBound_5_1,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }
                            break;
                        case 2 :
                            // InternalUddl.g:6856:7: lv_upperBound_5_2= RULE_SIGNED_INT
                            {
                            lv_upperBound_5_2=(Token)match(input,RULE_SIGNED_INT,FOLLOW_27); 

                            							newLeafNode(lv_upperBound_5_2, grammarAccess.getLogicalParticipantAccess().getUpperBoundSIGNED_INTTerminalRuleCall_2_3_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLogicalParticipantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"upperBound",
                            								lv_upperBound_5_2,
                            								"com.epistimis.uddl.Uddl.SIGNED_INT");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_95); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogicalParticipantAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalUddl.g:6878:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==RULE_STRING) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalUddl.g:6879:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:6879:4: (lv_description_7_0= RULE_STRING )
                    // InternalUddl.g:6880:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_96); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getLogicalParticipantAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalParticipantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:6896:3: (otherlv_8= ':' ( ( ruleQN ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==32) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalUddl.g:6897:4: otherlv_8= ':' ( ( ruleQN ) )
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogicalParticipantAccess().getColonKeyword_4_0());
                    			
                    // InternalUddl.g:6901:4: ( ( ruleQN ) )
                    // InternalUddl.g:6902:5: ( ruleQN )
                    {
                    // InternalUddl.g:6902:5: ( ruleQN )
                    // InternalUddl.g:6903:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalParticipantRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalParticipantAccess().getSpecializesLogicalCharacteristicCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_88);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getLogicalParticipantAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalUddl.g:6922:3: ( ( ruleQN ) )
            // InternalUddl.g:6923:4: ( ruleQN )
            {
            // InternalUddl.g:6923:4: ( ruleQN )
            // InternalUddl.g:6924:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalParticipantAccess().getRealizesConceptualParticipantCrossReference_6_0());
            				
            pushFollow(FOLLOW_6);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_99); 

            			newLeafNode(otherlv_12, grammarAccess.getLogicalParticipantAccess().getLeftCurlyBracketKeyword_7());
            		
            otherlv_13=(Token)match(input,101,FOLLOW_21); 

            			newLeafNode(otherlv_13, grammarAccess.getLogicalParticipantAccess().getSourceKeyword_8());
            		
            otherlv_14=(Token)match(input,28,FOLLOW_34); 

            			newLeafNode(otherlv_14, grammarAccess.getLogicalParticipantAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalUddl.g:6950:3: ( (lv_sourceLowerBound_15_0= RULE_INT ) )
            // InternalUddl.g:6951:4: (lv_sourceLowerBound_15_0= RULE_INT )
            {
            // InternalUddl.g:6951:4: (lv_sourceLowerBound_15_0= RULE_INT )
            // InternalUddl.g:6952:5: lv_sourceLowerBound_15_0= RULE_INT
            {
            lv_sourceLowerBound_15_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_sourceLowerBound_15_0, grammarAccess.getLogicalParticipantAccess().getSourceLowerBoundINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceLowerBound",
            						lv_sourceLowerBound_15_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_16=(Token)match(input,32,FOLLOW_35); 

            			newLeafNode(otherlv_16, grammarAccess.getLogicalParticipantAccess().getColonKeyword_11());
            		
            // InternalUddl.g:6972:3: ( ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) ) )
            // InternalUddl.g:6973:4: ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) )
            {
            // InternalUddl.g:6973:4: ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) )
            // InternalUddl.g:6974:5: (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT )
            {
            // InternalUddl.g:6974:5: (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==RULE_INT) ) {
                alt155=1;
            }
            else if ( (LA155_0==RULE_SIGNED_INT) ) {
                alt155=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // InternalUddl.g:6975:6: lv_sourceUpperBound_17_1= RULE_INT
                    {
                    lv_sourceUpperBound_17_1=(Token)match(input,RULE_INT,FOLLOW_27); 

                    						newLeafNode(lv_sourceUpperBound_17_1, grammarAccess.getLogicalParticipantAccess().getSourceUpperBoundINTTerminalRuleCall_12_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalParticipantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sourceUpperBound",
                    							lv_sourceUpperBound_17_1,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }
                    break;
                case 2 :
                    // InternalUddl.g:6990:6: lv_sourceUpperBound_17_2= RULE_SIGNED_INT
                    {
                    lv_sourceUpperBound_17_2=(Token)match(input,RULE_SIGNED_INT,FOLLOW_27); 

                    						newLeafNode(lv_sourceUpperBound_17_2, grammarAccess.getLogicalParticipantAccess().getSourceUpperBoundSIGNED_INTTerminalRuleCall_12_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalParticipantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sourceUpperBound",
                    							lv_sourceUpperBound_17_2,
                    							"com.epistimis.uddl.Uddl.SIGNED_INT");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_18=(Token)match(input,29,FOLLOW_100); 

            			newLeafNode(otherlv_18, grammarAccess.getLogicalParticipantAccess().getRightSquareBracketKeyword_13());
            		
            // InternalUddl.g:7011:3: (otherlv_19= 'path:' ( (lv_path_20_0= ruleLogicalPathNode ) ) )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==38) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // InternalUddl.g:7012:4: otherlv_19= 'path:' ( (lv_path_20_0= ruleLogicalPathNode ) )
                    {
                    otherlv_19=(Token)match(input,38,FOLLOW_37); 

                    				newLeafNode(otherlv_19, grammarAccess.getLogicalParticipantAccess().getPathKeyword_14_0());
                    			
                    // InternalUddl.g:7016:4: ( (lv_path_20_0= ruleLogicalPathNode ) )
                    // InternalUddl.g:7017:5: (lv_path_20_0= ruleLogicalPathNode )
                    {
                    // InternalUddl.g:7017:5: (lv_path_20_0= ruleLogicalPathNode )
                    // InternalUddl.g:7018:6: lv_path_20_0= ruleLogicalPathNode
                    {

                    						newCompositeNode(grammarAccess.getLogicalParticipantAccess().getPathLogicalPathNodeParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_path_20_0=ruleLogicalPathNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogicalParticipantRule());
                    						}
                    						set(
                    							current,
                    							"path",
                    							lv_path_20_0,
                    							"com.epistimis.uddl.Uddl.LogicalPathNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getLogicalParticipantAccess().getRightCurlyBracketSemicolonKeyword_15());
            		

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
    // $ANTLR end "ruleLogicalParticipant"


    // $ANTLR start "entryRuleLogicalPathNode"
    // InternalUddl.g:7044:1: entryRuleLogicalPathNode returns [EObject current=null] : iv_ruleLogicalPathNode= ruleLogicalPathNode EOF ;
    public final EObject entryRuleLogicalPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalPathNode = null;


        try {
            // InternalUddl.g:7044:56: (iv_ruleLogicalPathNode= ruleLogicalPathNode EOF )
            // InternalUddl.g:7045:2: iv_ruleLogicalPathNode= ruleLogicalPathNode EOF
            {
             newCompositeNode(grammarAccess.getLogicalPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalPathNode=ruleLogicalPathNode();

            state._fsp--;

             current =iv_ruleLogicalPathNode; 
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
    // $ANTLR end "entryRuleLogicalPathNode"


    // $ANTLR start "ruleLogicalPathNode"
    // InternalUddl.g:7051:1: ruleLogicalPathNode returns [EObject current=null] : (this_LogicalParticipantPathNode_0= ruleLogicalParticipantPathNode | this_LogicalCharacteristicPathNode_1= ruleLogicalCharacteristicPathNode ) ;
    public final EObject ruleLogicalPathNode() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalParticipantPathNode_0 = null;

        EObject this_LogicalCharacteristicPathNode_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:7057:2: ( (this_LogicalParticipantPathNode_0= ruleLogicalParticipantPathNode | this_LogicalCharacteristicPathNode_1= ruleLogicalCharacteristicPathNode ) )
            // InternalUddl.g:7058:2: (this_LogicalParticipantPathNode_0= ruleLogicalParticipantPathNode | this_LogicalCharacteristicPathNode_1= ruleLogicalCharacteristicPathNode )
            {
            // InternalUddl.g:7058:2: (this_LogicalParticipantPathNode_0= ruleLogicalParticipantPathNode | this_LogicalCharacteristicPathNode_1= ruleLogicalCharacteristicPathNode )
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==39) ) {
                alt157=1;
            }
            else if ( (LA157_0==40) ) {
                alt157=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;
            }
            switch (alt157) {
                case 1 :
                    // InternalUddl.g:7059:3: this_LogicalParticipantPathNode_0= ruleLogicalParticipantPathNode
                    {

                    			newCompositeNode(grammarAccess.getLogicalPathNodeAccess().getLogicalParticipantPathNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalParticipantPathNode_0=ruleLogicalParticipantPathNode();

                    state._fsp--;


                    			current = this_LogicalParticipantPathNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:7068:3: this_LogicalCharacteristicPathNode_1= ruleLogicalCharacteristicPathNode
                    {

                    			newCompositeNode(grammarAccess.getLogicalPathNodeAccess().getLogicalCharacteristicPathNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalCharacteristicPathNode_1=ruleLogicalCharacteristicPathNode();

                    state._fsp--;


                    			current = this_LogicalCharacteristicPathNode_1;
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
    // $ANTLR end "ruleLogicalPathNode"


    // $ANTLR start "entryRuleLogicalParticipantPathNode"
    // InternalUddl.g:7080:1: entryRuleLogicalParticipantPathNode returns [EObject current=null] : iv_ruleLogicalParticipantPathNode= ruleLogicalParticipantPathNode EOF ;
    public final EObject entryRuleLogicalParticipantPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalParticipantPathNode = null;


        try {
            // InternalUddl.g:7080:67: (iv_ruleLogicalParticipantPathNode= ruleLogicalParticipantPathNode EOF )
            // InternalUddl.g:7081:2: iv_ruleLogicalParticipantPathNode= ruleLogicalParticipantPathNode EOF
            {
             newCompositeNode(grammarAccess.getLogicalParticipantPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalParticipantPathNode=ruleLogicalParticipantPathNode();

            state._fsp--;

             current =iv_ruleLogicalParticipantPathNode; 
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
    // $ANTLR end "entryRuleLogicalParticipantPathNode"


    // $ANTLR start "ruleLogicalParticipantPathNode"
    // InternalUddl.g:7087:1: ruleLogicalParticipantPathNode returns [EObject current=null] : (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) ) ;
    public final EObject ruleLogicalParticipantPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:7093:2: ( (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) ) )
            // InternalUddl.g:7094:2: (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) )
            {
            // InternalUddl.g:7094:2: (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) )
            // InternalUddl.g:7095:3: otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalParticipantPathNodeAccess().getSolidusKeyword_0());
            		
            // InternalUddl.g:7099:3: ( ( ruleQN ) )
            // InternalUddl.g:7100:4: ( ruleQN )
            {
            // InternalUddl.g:7100:4: ( ruleQN )
            // InternalUddl.g:7101:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalParticipantPathNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalParticipantPathNodeAccess().getProjectedParticipantLogicalParticipantCrossReference_1_0());
            				
            pushFollow(FOLLOW_37);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:7115:3: ( (lv_node_2_0= ruleLogicalPathNode ) )
            // InternalUddl.g:7116:4: (lv_node_2_0= ruleLogicalPathNode )
            {
            // InternalUddl.g:7116:4: (lv_node_2_0= ruleLogicalPathNode )
            // InternalUddl.g:7117:5: lv_node_2_0= ruleLogicalPathNode
            {

            					newCompositeNode(grammarAccess.getLogicalParticipantPathNodeAccess().getNodeLogicalPathNodeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_node_2_0=ruleLogicalPathNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalParticipantPathNodeRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_2_0,
            						"com.epistimis.uddl.Uddl.LogicalPathNode");
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
    // $ANTLR end "ruleLogicalParticipantPathNode"


    // $ANTLR start "entryRuleLogicalCharacteristicPathNode"
    // InternalUddl.g:7138:1: entryRuleLogicalCharacteristicPathNode returns [EObject current=null] : iv_ruleLogicalCharacteristicPathNode= ruleLogicalCharacteristicPathNode EOF ;
    public final EObject entryRuleLogicalCharacteristicPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalCharacteristicPathNode = null;


        try {
            // InternalUddl.g:7138:70: (iv_ruleLogicalCharacteristicPathNode= ruleLogicalCharacteristicPathNode EOF )
            // InternalUddl.g:7139:2: iv_ruleLogicalCharacteristicPathNode= ruleLogicalCharacteristicPathNode EOF
            {
             newCompositeNode(grammarAccess.getLogicalCharacteristicPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalCharacteristicPathNode=ruleLogicalCharacteristicPathNode();

            state._fsp--;

             current =iv_ruleLogicalCharacteristicPathNode; 
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
    // $ANTLR end "entryRuleLogicalCharacteristicPathNode"


    // $ANTLR start "ruleLogicalCharacteristicPathNode"
    // InternalUddl.g:7145:1: ruleLogicalCharacteristicPathNode returns [EObject current=null] : (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) ) ;
    public final EObject ruleLogicalCharacteristicPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:7151:2: ( (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) ) )
            // InternalUddl.g:7152:2: (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) )
            {
            // InternalUddl.g:7152:2: (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) ) )
            // InternalUddl.g:7153:3: otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= ruleLogicalPathNode ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalCharacteristicPathNodeAccess().getNumberSignKeyword_0());
            		
            // InternalUddl.g:7157:3: ( ( ruleQN ) )
            // InternalUddl.g:7158:4: ( ruleQN )
            {
            // InternalUddl.g:7158:4: ( ruleQN )
            // InternalUddl.g:7159:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCharacteristicPathNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalCharacteristicPathNodeAccess().getProjectedCharacteristicLogicalCharacteristicCrossReference_1_0());
            				
            pushFollow(FOLLOW_37);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:7173:3: ( (lv_node_2_0= ruleLogicalPathNode ) )
            // InternalUddl.g:7174:4: (lv_node_2_0= ruleLogicalPathNode )
            {
            // InternalUddl.g:7174:4: (lv_node_2_0= ruleLogicalPathNode )
            // InternalUddl.g:7175:5: lv_node_2_0= ruleLogicalPathNode
            {

            					newCompositeNode(grammarAccess.getLogicalCharacteristicPathNodeAccess().getNodeLogicalPathNodeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_node_2_0=ruleLogicalPathNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalCharacteristicPathNodeRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_2_0,
            						"com.epistimis.uddl.Uddl.LogicalPathNode");
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
    // $ANTLR end "ruleLogicalCharacteristicPathNode"


    // $ANTLR start "entryRuleLogicalView"
    // InternalUddl.g:7196:1: entryRuleLogicalView returns [EObject current=null] : iv_ruleLogicalView= ruleLogicalView EOF ;
    public final EObject entryRuleLogicalView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalView = null;


        try {
            // InternalUddl.g:7196:52: (iv_ruleLogicalView= ruleLogicalView EOF )
            // InternalUddl.g:7197:2: iv_ruleLogicalView= ruleLogicalView EOF
            {
             newCompositeNode(grammarAccess.getLogicalViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalView=ruleLogicalView();

            state._fsp--;

             current =iv_ruleLogicalView; 
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
    // $ANTLR end "entryRuleLogicalView"


    // $ANTLR start "ruleLogicalView"
    // InternalUddl.g:7203:1: ruleLogicalView returns [EObject current=null] : (this_LogicalQuery_0= ruleLogicalQuery | this_LogicalCompositeQuery_1= ruleLogicalCompositeQuery ) ;
    public final EObject ruleLogicalView() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalQuery_0 = null;

        EObject this_LogicalCompositeQuery_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:7209:2: ( (this_LogicalQuery_0= ruleLogicalQuery | this_LogicalCompositeQuery_1= ruleLogicalCompositeQuery ) )
            // InternalUddl.g:7210:2: (this_LogicalQuery_0= ruleLogicalQuery | this_LogicalCompositeQuery_1= ruleLogicalCompositeQuery )
            {
            // InternalUddl.g:7210:2: (this_LogicalQuery_0= ruleLogicalQuery | this_LogicalCompositeQuery_1= ruleLogicalCompositeQuery )
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==102) ) {
                alt158=1;
            }
            else if ( (LA158_0==103) ) {
                alt158=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }
            switch (alt158) {
                case 1 :
                    // InternalUddl.g:7211:3: this_LogicalQuery_0= ruleLogicalQuery
                    {

                    			newCompositeNode(grammarAccess.getLogicalViewAccess().getLogicalQueryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalQuery_0=ruleLogicalQuery();

                    state._fsp--;


                    			current = this_LogicalQuery_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:7220:3: this_LogicalCompositeQuery_1= ruleLogicalCompositeQuery
                    {

                    			newCompositeNode(grammarAccess.getLogicalViewAccess().getLogicalCompositeQueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalCompositeQuery_1=ruleLogicalCompositeQuery();

                    state._fsp--;


                    			current = this_LogicalCompositeQuery_1;
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
    // $ANTLR end "ruleLogicalView"


    // $ANTLR start "entryRuleLogicalQuery"
    // InternalUddl.g:7232:1: entryRuleLogicalQuery returns [EObject current=null] : iv_ruleLogicalQuery= ruleLogicalQuery EOF ;
    public final EObject entryRuleLogicalQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalQuery = null;


        try {
            // InternalUddl.g:7232:53: (iv_ruleLogicalQuery= ruleLogicalQuery EOF )
            // InternalUddl.g:7233:2: iv_ruleLogicalQuery= ruleLogicalQuery EOF
            {
             newCompositeNode(grammarAccess.getLogicalQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalQuery=ruleLogicalQuery();

            state._fsp--;

             current =iv_ruleLogicalQuery; 
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
    // $ANTLR end "entryRuleLogicalQuery"


    // $ANTLR start "ruleLogicalQuery"
    // InternalUddl.g:7239:1: ruleLogicalQuery returns [EObject current=null] : (otherlv_0= 'lquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' ) ;
    public final EObject ruleLogicalQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_specification_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalUddl.g:7245:2: ( (otherlv_0= 'lquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' ) )
            // InternalUddl.g:7246:2: (otherlv_0= 'lquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' )
            {
            // InternalUddl.g:7246:2: (otherlv_0= 'lquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' )
            // InternalUddl.g:7247:3: otherlv_0= 'lquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,102,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalQueryAccess().getLqueryKeyword_0());
            		
            // InternalUddl.g:7251:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:7252:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:7252:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:7253:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_91); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:7269:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==RULE_STRING) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalUddl.g:7270:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:7270:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:7271:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalQueryAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalQueryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:7287:3: (otherlv_3= '->' ( ( ruleQN ) ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==94) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalUddl.g:7288:4: otherlv_3= '->' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,94,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalQueryAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalUddl.g:7292:4: ( ( ruleQN ) )
                    // InternalUddl.g:7293:5: ( ruleQN )
                    {
                    // InternalUddl.g:7293:5: ( ruleQN )
                    // InternalUddl.g:7294:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalQueryRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalQueryAccess().getRealizesConceptualQueryCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalQueryAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,42,FOLLOW_41); 

            			newLeafNode(otherlv_6, grammarAccess.getLogicalQueryAccess().getSpecKeyword_5());
            		
            // InternalUddl.g:7317:3: ( (lv_specification_7_0= RULE_STRING ) )
            // InternalUddl.g:7318:4: (lv_specification_7_0= RULE_STRING )
            {
            // InternalUddl.g:7318:4: (lv_specification_7_0= RULE_STRING )
            // InternalUddl.g:7319:5: lv_specification_7_0= RULE_STRING
            {
            lv_specification_7_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_specification_7_0, grammarAccess.getLogicalQueryAccess().getSpecificationSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"specification",
            						lv_specification_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLogicalQueryAccess().getRightCurlyBracketSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleLogicalQuery"


    // $ANTLR start "entryRuleLogicalCompositeQuery"
    // InternalUddl.g:7343:1: entryRuleLogicalCompositeQuery returns [EObject current=null] : iv_ruleLogicalCompositeQuery= ruleLogicalCompositeQuery EOF ;
    public final EObject entryRuleLogicalCompositeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalCompositeQuery = null;


        try {
            // InternalUddl.g:7343:62: (iv_ruleLogicalCompositeQuery= ruleLogicalCompositeQuery EOF )
            // InternalUddl.g:7344:2: iv_ruleLogicalCompositeQuery= ruleLogicalCompositeQuery EOF
            {
             newCompositeNode(grammarAccess.getLogicalCompositeQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalCompositeQuery=ruleLogicalCompositeQuery();

            state._fsp--;

             current =iv_ruleLogicalCompositeQuery; 
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
    // $ANTLR end "entryRuleLogicalCompositeQuery"


    // $ANTLR start "ruleLogicalCompositeQuery"
    // InternalUddl.g:7350:1: ruleLogicalCompositeQuery returns [EObject current=null] : (otherlv_0= 'lcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= ruleLogicalQueryComposition ) ) otherlv_8= '};' ) ;
    public final EObject ruleLogicalCompositeQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_isUnion_6_0=null;
        Token otherlv_8=null;
        EObject lv_composition_7_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:7356:2: ( (otherlv_0= 'lcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= ruleLogicalQueryComposition ) ) otherlv_8= '};' ) )
            // InternalUddl.g:7357:2: (otherlv_0= 'lcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= ruleLogicalQueryComposition ) ) otherlv_8= '};' )
            {
            // InternalUddl.g:7357:2: (otherlv_0= 'lcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= ruleLogicalQueryComposition ) ) otherlv_8= '};' )
            // InternalUddl.g:7358:3: otherlv_0= 'lcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= ruleLogicalQueryComposition ) ) otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,103,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicalCompositeQueryAccess().getLcqueryKeyword_0());
            		
            // InternalUddl.g:7362:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:7363:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:7363:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:7364:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_91); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicalCompositeQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCompositeQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:7380:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==RULE_STRING) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalUddl.g:7381:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:7381:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:7382:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLogicalCompositeQueryAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalCompositeQueryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:7398:3: (otherlv_3= '->' ( ( ruleQN ) ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==94) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalUddl.g:7399:4: otherlv_3= '->' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,94,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicalCompositeQueryAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalUddl.g:7403:4: ( ( ruleQN ) )
                    // InternalUddl.g:7404:5: ( ruleQN )
                    {
                    // InternalUddl.g:7404:5: ( ruleQN )
                    // InternalUddl.g:7405:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalCompositeQueryRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalCompositeQueryAccess().getRealizesConceptualCompositeQueryCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_42); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalCompositeQueryAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUddl.g:7424:3: ( (lv_isUnion_6_0= 'isUnion' ) )
            // InternalUddl.g:7425:4: (lv_isUnion_6_0= 'isUnion' )
            {
            // InternalUddl.g:7425:4: (lv_isUnion_6_0= 'isUnion' )
            // InternalUddl.g:7426:5: lv_isUnion_6_0= 'isUnion'
            {
            lv_isUnion_6_0=(Token)match(input,44,FOLLOW_4); 

            					newLeafNode(lv_isUnion_6_0, grammarAccess.getLogicalCompositeQueryAccess().getIsUnionIsUnionKeyword_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalCompositeQueryRule());
            					}
            					setWithLastConsumed(current, "isUnion", lv_isUnion_6_0 != null, "isUnion");
            				

            }


            }

            // InternalUddl.g:7438:3: ( (lv_composition_7_0= ruleLogicalQueryComposition ) )
            // InternalUddl.g:7439:4: (lv_composition_7_0= ruleLogicalQueryComposition )
            {
            // InternalUddl.g:7439:4: (lv_composition_7_0= ruleLogicalQueryComposition )
            // InternalUddl.g:7440:5: lv_composition_7_0= ruleLogicalQueryComposition
            {

            					newCompositeNode(grammarAccess.getLogicalCompositeQueryAccess().getCompositionLogicalQueryCompositionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_22);
            lv_composition_7_0=ruleLogicalQueryComposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalCompositeQueryRule());
            					}
            					add(
            						current,
            						"composition",
            						lv_composition_7_0,
            						"com.epistimis.uddl.Uddl.LogicalQueryComposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLogicalCompositeQueryAccess().getRightCurlyBracketSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleLogicalCompositeQuery"


    // $ANTLR start "entryRuleLogicalQueryComposition"
    // InternalUddl.g:7465:1: entryRuleLogicalQueryComposition returns [EObject current=null] : iv_ruleLogicalQueryComposition= ruleLogicalQueryComposition EOF ;
    public final EObject entryRuleLogicalQueryComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalQueryComposition = null;


        try {
            // InternalUddl.g:7465:64: (iv_ruleLogicalQueryComposition= ruleLogicalQueryComposition EOF )
            // InternalUddl.g:7466:2: iv_ruleLogicalQueryComposition= ruleLogicalQueryComposition EOF
            {
             newCompositeNode(grammarAccess.getLogicalQueryCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalQueryComposition=ruleLogicalQueryComposition();

            state._fsp--;

             current =iv_ruleLogicalQueryComposition; 
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
    // $ANTLR end "entryRuleLogicalQueryComposition"


    // $ANTLR start "ruleLogicalQueryComposition"
    // InternalUddl.g:7472:1: ruleLogicalQueryComposition returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleLogicalQueryComposition() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUddl.g:7478:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? otherlv_4= ';' ) )
            // InternalUddl.g:7479:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? otherlv_4= ';' )
            {
            // InternalUddl.g:7479:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? otherlv_4= ';' )
            // InternalUddl.g:7480:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? otherlv_4= ';'
            {
            // InternalUddl.g:7480:3: ( ( ruleQN ) )
            // InternalUddl.g:7481:4: ( ruleQN )
            {
            // InternalUddl.g:7481:4: ( ruleQN )
            // InternalUddl.g:7482:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalQueryCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogicalQueryCompositionAccess().getTypeLogicalViewCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:7496:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:7497:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:7497:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:7498:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_101); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getLogicalQueryCompositionAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicalQueryCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:7514:3: (otherlv_2= '->' ( ( ruleQN ) ) )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==94) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // InternalUddl.g:7515:4: otherlv_2= '->' ( ( ruleQN ) )
                    {
                    otherlv_2=(Token)match(input,94,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getLogicalQueryCompositionAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                    			
                    // InternalUddl.g:7519:4: ( ( ruleQN ) )
                    // InternalUddl.g:7520:5: ( ruleQN )
                    {
                    // InternalUddl.g:7520:5: ( ruleQN )
                    // InternalUddl.g:7521:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicalQueryCompositionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLogicalQueryCompositionAccess().getRealizesConceptualQueryCompositionCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLogicalQueryCompositionAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleLogicalQueryComposition"


    // $ANTLR start "entryRulePlatformElement"
    // InternalUddl.g:7544:1: entryRulePlatformElement returns [EObject current=null] : iv_rulePlatformElement= rulePlatformElement EOF ;
    public final EObject entryRulePlatformElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformElement = null;


        try {
            // InternalUddl.g:7544:56: (iv_rulePlatformElement= rulePlatformElement EOF )
            // InternalUddl.g:7545:2: iv_rulePlatformElement= rulePlatformElement EOF
            {
             newCompositeNode(grammarAccess.getPlatformElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformElement=rulePlatformElement();

            state._fsp--;

             current =iv_rulePlatformElement; 
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
    // $ANTLR end "entryRulePlatformElement"


    // $ANTLR start "rulePlatformElement"
    // InternalUddl.g:7551:1: rulePlatformElement returns [EObject current=null] : (this_PlatformComposableElement_0= rulePlatformComposableElement | this_PlatformView_1= rulePlatformView ) ;
    public final EObject rulePlatformElement() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformComposableElement_0 = null;

        EObject this_PlatformView_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:7557:2: ( (this_PlatformComposableElement_0= rulePlatformComposableElement | this_PlatformView_1= rulePlatformView ) )
            // InternalUddl.g:7558:2: (this_PlatformComposableElement_0= rulePlatformComposableElement | this_PlatformView_1= rulePlatformView )
            {
            // InternalUddl.g:7558:2: (this_PlatformComposableElement_0= rulePlatformComposableElement | this_PlatformView_1= rulePlatformView )
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==55||LA164_0==60||(LA164_0>=104 && LA164_0<=122)||LA164_0==124) ) {
                alt164=1;
            }
            else if ( ((LA164_0>=125 && LA164_0<=126)) ) {
                alt164=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;
            }
            switch (alt164) {
                case 1 :
                    // InternalUddl.g:7559:3: this_PlatformComposableElement_0= rulePlatformComposableElement
                    {

                    			newCompositeNode(grammarAccess.getPlatformElementAccess().getPlatformComposableElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformComposableElement_0=rulePlatformComposableElement();

                    state._fsp--;


                    			current = this_PlatformComposableElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:7568:3: this_PlatformView_1= rulePlatformView
                    {

                    			newCompositeNode(grammarAccess.getPlatformElementAccess().getPlatformViewParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformView_1=rulePlatformView();

                    state._fsp--;


                    			current = this_PlatformView_1;
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
    // $ANTLR end "rulePlatformElement"


    // $ANTLR start "entryRulePlatformComposableElement"
    // InternalUddl.g:7580:1: entryRulePlatformComposableElement returns [EObject current=null] : iv_rulePlatformComposableElement= rulePlatformComposableElement EOF ;
    public final EObject entryRulePlatformComposableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformComposableElement = null;


        try {
            // InternalUddl.g:7580:66: (iv_rulePlatformComposableElement= rulePlatformComposableElement EOF )
            // InternalUddl.g:7581:2: iv_rulePlatformComposableElement= rulePlatformComposableElement EOF
            {
             newCompositeNode(grammarAccess.getPlatformComposableElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformComposableElement=rulePlatformComposableElement();

            state._fsp--;

             current =iv_rulePlatformComposableElement; 
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
    // $ANTLR end "entryRulePlatformComposableElement"


    // $ANTLR start "rulePlatformComposableElement"
    // InternalUddl.g:7587:1: rulePlatformComposableElement returns [EObject current=null] : (this_PlatformEntity_0= rulePlatformEntity | this_PlatformDataType_1= rulePlatformDataType ) ;
    public final EObject rulePlatformComposableElement() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformEntity_0 = null;

        EObject this_PlatformDataType_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:7593:2: ( (this_PlatformEntity_0= rulePlatformEntity | this_PlatformDataType_1= rulePlatformDataType ) )
            // InternalUddl.g:7594:2: (this_PlatformEntity_0= rulePlatformEntity | this_PlatformDataType_1= rulePlatformDataType )
            {
            // InternalUddl.g:7594:2: (this_PlatformEntity_0= rulePlatformEntity | this_PlatformDataType_1= rulePlatformDataType )
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==122||LA165_0==124) ) {
                alt165=1;
            }
            else if ( (LA165_0==55||LA165_0==60||(LA165_0>=104 && LA165_0<=121)) ) {
                alt165=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 165, 0, input);

                throw nvae;
            }
            switch (alt165) {
                case 1 :
                    // InternalUddl.g:7595:3: this_PlatformEntity_0= rulePlatformEntity
                    {

                    			newCompositeNode(grammarAccess.getPlatformComposableElementAccess().getPlatformEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformEntity_0=rulePlatformEntity();

                    state._fsp--;


                    			current = this_PlatformEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:7604:3: this_PlatformDataType_1= rulePlatformDataType
                    {

                    			newCompositeNode(grammarAccess.getPlatformComposableElementAccess().getPlatformDataTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformDataType_1=rulePlatformDataType();

                    state._fsp--;


                    			current = this_PlatformDataType_1;
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
    // $ANTLR end "rulePlatformComposableElement"


    // $ANTLR start "entryRulePlatformDataType"
    // InternalUddl.g:7616:1: entryRulePlatformDataType returns [EObject current=null] : iv_rulePlatformDataType= rulePlatformDataType EOF ;
    public final EObject entryRulePlatformDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformDataType = null;


        try {
            // InternalUddl.g:7616:57: (iv_rulePlatformDataType= rulePlatformDataType EOF )
            // InternalUddl.g:7617:2: iv_rulePlatformDataType= rulePlatformDataType EOF
            {
             newCompositeNode(grammarAccess.getPlatformDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformDataType=rulePlatformDataType();

            state._fsp--;

             current =iv_rulePlatformDataType; 
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
    // $ANTLR end "entryRulePlatformDataType"


    // $ANTLR start "rulePlatformDataType"
    // InternalUddl.g:7623:1: rulePlatformDataType returns [EObject current=null] : (this_PlatformPrimitive_0= rulePlatformPrimitive | this_PlatformStruct_1= rulePlatformStruct ) ;
    public final EObject rulePlatformDataType() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformPrimitive_0 = null;

        EObject this_PlatformStruct_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:7629:2: ( (this_PlatformPrimitive_0= rulePlatformPrimitive | this_PlatformStruct_1= rulePlatformStruct ) )
            // InternalUddl.g:7630:2: (this_PlatformPrimitive_0= rulePlatformPrimitive | this_PlatformStruct_1= rulePlatformStruct )
            {
            // InternalUddl.g:7630:2: (this_PlatformPrimitive_0= rulePlatformPrimitive | this_PlatformStruct_1= rulePlatformStruct )
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==55||LA166_0==60||(LA166_0>=104 && LA166_0<=120)) ) {
                alt166=1;
            }
            else if ( (LA166_0==121) ) {
                alt166=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }
            switch (alt166) {
                case 1 :
                    // InternalUddl.g:7631:3: this_PlatformPrimitive_0= rulePlatformPrimitive
                    {

                    			newCompositeNode(grammarAccess.getPlatformDataTypeAccess().getPlatformPrimitiveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformPrimitive_0=rulePlatformPrimitive();

                    state._fsp--;


                    			current = this_PlatformPrimitive_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:7640:3: this_PlatformStruct_1= rulePlatformStruct
                    {

                    			newCompositeNode(grammarAccess.getPlatformDataTypeAccess().getPlatformStructParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformStruct_1=rulePlatformStruct();

                    state._fsp--;


                    			current = this_PlatformStruct_1;
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
    // $ANTLR end "rulePlatformDataType"


    // $ANTLR start "entryRulePlatformPrimitive"
    // InternalUddl.g:7652:1: entryRulePlatformPrimitive returns [EObject current=null] : iv_rulePlatformPrimitive= rulePlatformPrimitive EOF ;
    public final EObject entryRulePlatformPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformPrimitive = null;


        try {
            // InternalUddl.g:7652:58: (iv_rulePlatformPrimitive= rulePlatformPrimitive EOF )
            // InternalUddl.g:7653:2: iv_rulePlatformPrimitive= rulePlatformPrimitive EOF
            {
             newCompositeNode(grammarAccess.getPlatformPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformPrimitive=rulePlatformPrimitive();

            state._fsp--;

             current =iv_rulePlatformPrimitive; 
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
    // $ANTLR end "entryRulePlatformPrimitive"


    // $ANTLR start "rulePlatformPrimitive"
    // InternalUddl.g:7659:1: rulePlatformPrimitive returns [EObject current=null] : (this_PlatformSequence_0= rulePlatformSequence | this_PlatformBoolean_1= rulePlatformBoolean | this_PlatformChar_2= rulePlatformChar | this_PlatformNumber_3= rulePlatformNumber | this_PlatformOctet_4= rulePlatformOctet | this_PlatformEnumeration_5= rulePlatformEnumeration | this_PlatformStringType_6= rulePlatformStringType | this_PlatformArray_7= rulePlatformArray ) ;
    public final EObject rulePlatformPrimitive() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformSequence_0 = null;

        EObject this_PlatformBoolean_1 = null;

        EObject this_PlatformChar_2 = null;

        EObject this_PlatformNumber_3 = null;

        EObject this_PlatformOctet_4 = null;

        EObject this_PlatformEnumeration_5 = null;

        EObject this_PlatformStringType_6 = null;

        EObject this_PlatformArray_7 = null;



        	enterRule();

        try {
            // InternalUddl.g:7665:2: ( (this_PlatformSequence_0= rulePlatformSequence | this_PlatformBoolean_1= rulePlatformBoolean | this_PlatformChar_2= rulePlatformChar | this_PlatformNumber_3= rulePlatformNumber | this_PlatformOctet_4= rulePlatformOctet | this_PlatformEnumeration_5= rulePlatformEnumeration | this_PlatformStringType_6= rulePlatformStringType | this_PlatformArray_7= rulePlatformArray ) )
            // InternalUddl.g:7666:2: (this_PlatformSequence_0= rulePlatformSequence | this_PlatformBoolean_1= rulePlatformBoolean | this_PlatformChar_2= rulePlatformChar | this_PlatformNumber_3= rulePlatformNumber | this_PlatformOctet_4= rulePlatformOctet | this_PlatformEnumeration_5= rulePlatformEnumeration | this_PlatformStringType_6= rulePlatformStringType | this_PlatformArray_7= rulePlatformArray )
            {
            // InternalUddl.g:7666:2: (this_PlatformSequence_0= rulePlatformSequence | this_PlatformBoolean_1= rulePlatformBoolean | this_PlatformChar_2= rulePlatformChar | this_PlatformNumber_3= rulePlatformNumber | this_PlatformOctet_4= rulePlatformOctet | this_PlatformEnumeration_5= rulePlatformEnumeration | this_PlatformStringType_6= rulePlatformStringType | this_PlatformArray_7= rulePlatformArray )
            int alt167=8;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt167=1;
                }
                break;
            case 55:
                {
                alt167=2;
                }
                break;
            case 105:
                {
                alt167=3;
                }
                break;
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
                {
                alt167=4;
                }
                break;
            case 104:
                {
                alt167=5;
                }
                break;
            case 60:
                {
                alt167=6;
                }
                break;
            case 106:
            case 107:
            case 108:
                {
                alt167=7;
                }
                break;
            case 120:
                {
                alt167=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 167, 0, input);

                throw nvae;
            }

            switch (alt167) {
                case 1 :
                    // InternalUddl.g:7667:3: this_PlatformSequence_0= rulePlatformSequence
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformSequenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformSequence_0=rulePlatformSequence();

                    state._fsp--;


                    			current = this_PlatformSequence_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:7676:3: this_PlatformBoolean_1= rulePlatformBoolean
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformBooleanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformBoolean_1=rulePlatformBoolean();

                    state._fsp--;


                    			current = this_PlatformBoolean_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:7685:3: this_PlatformChar_2= rulePlatformChar
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformCharParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformChar_2=rulePlatformChar();

                    state._fsp--;


                    			current = this_PlatformChar_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:7694:3: this_PlatformNumber_3= rulePlatformNumber
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformNumberParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformNumber_3=rulePlatformNumber();

                    state._fsp--;


                    			current = this_PlatformNumber_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUddl.g:7703:3: this_PlatformOctet_4= rulePlatformOctet
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformOctetParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformOctet_4=rulePlatformOctet();

                    state._fsp--;


                    			current = this_PlatformOctet_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalUddl.g:7712:3: this_PlatformEnumeration_5= rulePlatformEnumeration
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformEnumerationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformEnumeration_5=rulePlatformEnumeration();

                    state._fsp--;


                    			current = this_PlatformEnumeration_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalUddl.g:7721:3: this_PlatformStringType_6= rulePlatformStringType
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformStringTypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformStringType_6=rulePlatformStringType();

                    state._fsp--;


                    			current = this_PlatformStringType_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalUddl.g:7730:3: this_PlatformArray_7= rulePlatformArray
                    {

                    			newCompositeNode(grammarAccess.getPlatformPrimitiveAccess().getPlatformArrayParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformArray_7=rulePlatformArray();

                    state._fsp--;


                    			current = this_PlatformArray_7;
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
    // $ANTLR end "rulePlatformPrimitive"


    // $ANTLR start "entryRulePlatformBoolean"
    // InternalUddl.g:7742:1: entryRulePlatformBoolean returns [EObject current=null] : iv_rulePlatformBoolean= rulePlatformBoolean EOF ;
    public final EObject entryRulePlatformBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformBoolean = null;


        try {
            // InternalUddl.g:7742:56: (iv_rulePlatformBoolean= rulePlatformBoolean EOF )
            // InternalUddl.g:7743:2: iv_rulePlatformBoolean= rulePlatformBoolean EOF
            {
             newCompositeNode(grammarAccess.getPlatformBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformBoolean=rulePlatformBoolean();

            state._fsp--;

             current =iv_rulePlatformBoolean; 
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
    // $ANTLR end "entryRulePlatformBoolean"


    // $ANTLR start "rulePlatformBoolean"
    // InternalUddl.g:7749:1: rulePlatformBoolean returns [EObject current=null] : (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:7755:2: ( (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:7756:2: (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:7756:2: (otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:7757:3: otherlv_0= 'bool' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformBooleanAccess().getBoolKeyword_0());
            		
            // InternalUddl.g:7761:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:7762:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:7762:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:7763:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformBooleanAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformBooleanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:7779:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==RULE_STRING) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // InternalUddl.g:7780:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:7780:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:7781:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformBooleanAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformBooleanRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformBooleanAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:7801:3: ( ( ruleQN ) )
            // InternalUddl.g:7802:4: ( ruleQN )
            {
            // InternalUddl.g:7802:4: ( ruleQN )
            // InternalUddl.g:7803:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformBooleanRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformBooleanAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformBooleanAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformBoolean"


    // $ANTLR start "entryRulePlatformOctet"
    // InternalUddl.g:7825:1: entryRulePlatformOctet returns [EObject current=null] : iv_rulePlatformOctet= rulePlatformOctet EOF ;
    public final EObject entryRulePlatformOctet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformOctet = null;


        try {
            // InternalUddl.g:7825:54: (iv_rulePlatformOctet= rulePlatformOctet EOF )
            // InternalUddl.g:7826:2: iv_rulePlatformOctet= rulePlatformOctet EOF
            {
             newCompositeNode(grammarAccess.getPlatformOctetRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformOctet=rulePlatformOctet();

            state._fsp--;

             current =iv_rulePlatformOctet; 
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
    // $ANTLR end "entryRulePlatformOctet"


    // $ANTLR start "rulePlatformOctet"
    // InternalUddl.g:7832:1: rulePlatformOctet returns [EObject current=null] : (otherlv_0= 'octet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformOctet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:7838:2: ( (otherlv_0= 'octet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:7839:2: (otherlv_0= 'octet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:7839:2: (otherlv_0= 'octet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:7840:3: otherlv_0= 'octet' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,104,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformOctetAccess().getOctetKeyword_0());
            		
            // InternalUddl.g:7844:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:7845:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:7845:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:7846:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformOctetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformOctetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:7862:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==RULE_STRING) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // InternalUddl.g:7863:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:7863:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:7864:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformOctetAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformOctetRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformOctetAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:7884:3: ( ( ruleQN ) )
            // InternalUddl.g:7885:4: ( ruleQN )
            {
            // InternalUddl.g:7885:4: ( ruleQN )
            // InternalUddl.g:7886:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformOctetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformOctetAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformOctetAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformOctet"


    // $ANTLR start "entryRulePlatformChar"
    // InternalUddl.g:7908:1: entryRulePlatformChar returns [EObject current=null] : iv_rulePlatformChar= rulePlatformChar EOF ;
    public final EObject entryRulePlatformChar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformChar = null;


        try {
            // InternalUddl.g:7908:53: (iv_rulePlatformChar= rulePlatformChar EOF )
            // InternalUddl.g:7909:2: iv_rulePlatformChar= rulePlatformChar EOF
            {
             newCompositeNode(grammarAccess.getPlatformCharRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformChar=rulePlatformChar();

            state._fsp--;

             current =iv_rulePlatformChar; 
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
    // $ANTLR end "entryRulePlatformChar"


    // $ANTLR start "rulePlatformChar"
    // InternalUddl.g:7915:1: rulePlatformChar returns [EObject current=null] : (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformChar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:7921:2: ( (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:7922:2: (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:7922:2: (otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:7923:3: otherlv_0= 'char' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformCharAccess().getCharKeyword_0());
            		
            // InternalUddl.g:7927:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:7928:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:7928:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:7929:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformCharAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCharRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:7945:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==RULE_STRING) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // InternalUddl.g:7946:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:7946:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:7947:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformCharAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformCharRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformCharAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:7967:3: ( ( ruleQN ) )
            // InternalUddl.g:7968:4: ( ruleQN )
            {
            // InternalUddl.g:7968:4: ( ruleQN )
            // InternalUddl.g:7969:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCharRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformCharAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformCharAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformChar"


    // $ANTLR start "entryRulePlatformStringType"
    // InternalUddl.g:7991:1: entryRulePlatformStringType returns [EObject current=null] : iv_rulePlatformStringType= rulePlatformStringType EOF ;
    public final EObject entryRulePlatformStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformStringType = null;


        try {
            // InternalUddl.g:7991:59: (iv_rulePlatformStringType= rulePlatformStringType EOF )
            // InternalUddl.g:7992:2: iv_rulePlatformStringType= rulePlatformStringType EOF
            {
             newCompositeNode(grammarAccess.getPlatformStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformStringType=rulePlatformStringType();

            state._fsp--;

             current =iv_rulePlatformStringType; 
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
    // $ANTLR end "entryRulePlatformStringType"


    // $ANTLR start "rulePlatformStringType"
    // InternalUddl.g:7998:1: rulePlatformStringType returns [EObject current=null] : (this_PlatformString_0= rulePlatformString | this_PlatformBoundedString_1= rulePlatformBoundedString | this_PlatformCharArray_2= rulePlatformCharArray ) ;
    public final EObject rulePlatformStringType() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformString_0 = null;

        EObject this_PlatformBoundedString_1 = null;

        EObject this_PlatformCharArray_2 = null;



        	enterRule();

        try {
            // InternalUddl.g:8004:2: ( (this_PlatformString_0= rulePlatformString | this_PlatformBoundedString_1= rulePlatformBoundedString | this_PlatformCharArray_2= rulePlatformCharArray ) )
            // InternalUddl.g:8005:2: (this_PlatformString_0= rulePlatformString | this_PlatformBoundedString_1= rulePlatformBoundedString | this_PlatformCharArray_2= rulePlatformCharArray )
            {
            // InternalUddl.g:8005:2: (this_PlatformString_0= rulePlatformString | this_PlatformBoundedString_1= rulePlatformBoundedString | this_PlatformCharArray_2= rulePlatformCharArray )
            int alt171=3;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt171=1;
                }
                break;
            case 107:
                {
                alt171=2;
                }
                break;
            case 108:
                {
                alt171=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 171, 0, input);

                throw nvae;
            }

            switch (alt171) {
                case 1 :
                    // InternalUddl.g:8006:3: this_PlatformString_0= rulePlatformString
                    {

                    			newCompositeNode(grammarAccess.getPlatformStringTypeAccess().getPlatformStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformString_0=rulePlatformString();

                    state._fsp--;


                    			current = this_PlatformString_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:8015:3: this_PlatformBoundedString_1= rulePlatformBoundedString
                    {

                    			newCompositeNode(grammarAccess.getPlatformStringTypeAccess().getPlatformBoundedStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformBoundedString_1=rulePlatformBoundedString();

                    state._fsp--;


                    			current = this_PlatformBoundedString_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:8024:3: this_PlatformCharArray_2= rulePlatformCharArray
                    {

                    			newCompositeNode(grammarAccess.getPlatformStringTypeAccess().getPlatformCharArrayParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformCharArray_2=rulePlatformCharArray();

                    state._fsp--;


                    			current = this_PlatformCharArray_2;
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
    // $ANTLR end "rulePlatformStringType"


    // $ANTLR start "entryRulePlatformString"
    // InternalUddl.g:8036:1: entryRulePlatformString returns [EObject current=null] : iv_rulePlatformString= rulePlatformString EOF ;
    public final EObject entryRulePlatformString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformString = null;


        try {
            // InternalUddl.g:8036:55: (iv_rulePlatformString= rulePlatformString EOF )
            // InternalUddl.g:8037:2: iv_rulePlatformString= rulePlatformString EOF
            {
             newCompositeNode(grammarAccess.getPlatformStringRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformString=rulePlatformString();

            state._fsp--;

             current =iv_rulePlatformString; 
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
    // $ANTLR end "entryRulePlatformString"


    // $ANTLR start "rulePlatformString"
    // InternalUddl.g:8043:1: rulePlatformString returns [EObject current=null] : (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8049:2: ( (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8050:2: (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8050:2: (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8051:3: otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,106,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformStringAccess().getStringKeyword_0());
            		
            // InternalUddl.g:8055:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8056:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8056:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8057:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformStringAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8073:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==RULE_STRING) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // InternalUddl.g:8074:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8074:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8075:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformStringAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformStringAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:8095:3: ( ( ruleQN ) )
            // InternalUddl.g:8096:4: ( ruleQN )
            {
            // InternalUddl.g:8096:4: ( ruleQN )
            // InternalUddl.g:8097:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformStringRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformStringAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformStringAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformString"


    // $ANTLR start "entryRulePlatformBoundedString"
    // InternalUddl.g:8119:1: entryRulePlatformBoundedString returns [EObject current=null] : iv_rulePlatformBoundedString= rulePlatformBoundedString EOF ;
    public final EObject entryRulePlatformBoundedString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformBoundedString = null;


        try {
            // InternalUddl.g:8119:62: (iv_rulePlatformBoundedString= rulePlatformBoundedString EOF )
            // InternalUddl.g:8120:2: iv_rulePlatformBoundedString= rulePlatformBoundedString EOF
            {
             newCompositeNode(grammarAccess.getPlatformBoundedStringRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformBoundedString=rulePlatformBoundedString();

            state._fsp--;

             current =iv_rulePlatformBoundedString; 
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
    // $ANTLR end "entryRulePlatformBoundedString"


    // $ANTLR start "rulePlatformBoundedString"
    // InternalUddl.g:8126:1: rulePlatformBoundedString returns [EObject current=null] : (otherlv_0= 'string[' ( (lv_maxLength_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' ) ;
    public final EObject rulePlatformBoundedString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_maxLength_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalUddl.g:8132:2: ( (otherlv_0= 'string[' ( (lv_maxLength_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' ) )
            // InternalUddl.g:8133:2: (otherlv_0= 'string[' ( (lv_maxLength_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' )
            {
            // InternalUddl.g:8133:2: (otherlv_0= 'string[' ( (lv_maxLength_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' )
            // InternalUddl.g:8134:3: otherlv_0= 'string[' ( (lv_maxLength_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,107,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformBoundedStringAccess().getStringKeyword_0());
            		
            // InternalUddl.g:8138:3: ( (lv_maxLength_1_0= RULE_INT ) )
            // InternalUddl.g:8139:4: (lv_maxLength_1_0= RULE_INT )
            {
            // InternalUddl.g:8139:4: (lv_maxLength_1_0= RULE_INT )
            // InternalUddl.g:8140:5: lv_maxLength_1_0= RULE_INT
            {
            lv_maxLength_1_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_maxLength_1_0, grammarAccess.getPlatformBoundedStringAccess().getMaxLengthINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformBoundedStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxLength",
            						lv_maxLength_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPlatformBoundedStringAccess().getRightSquareBracketKeyword_2());
            		
            // InternalUddl.g:8160:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalUddl.g:8161:4: (lv_name_3_0= RULE_ID )
            {
            // InternalUddl.g:8161:4: (lv_name_3_0= RULE_ID )
            // InternalUddl.g:8162:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPlatformBoundedStringAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformBoundedStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8178:3: ( (lv_description_4_0= RULE_STRING ) )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==RULE_STRING) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // InternalUddl.g:8179:4: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalUddl.g:8179:4: (lv_description_4_0= RULE_STRING )
                    // InternalUddl.g:8180:5: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_4_0, grammarAccess.getPlatformBoundedStringAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformBoundedStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformBoundedStringAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalUddl.g:8200:3: ( ( ruleQN ) )
            // InternalUddl.g:8201:4: ( ruleQN )
            {
            // InternalUddl.g:8201:4: ( ruleQN )
            // InternalUddl.g:8202:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformBoundedStringRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformBoundedStringAccess().getRealizesLogicalElementCrossReference_6_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPlatformBoundedStringAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "rulePlatformBoundedString"


    // $ANTLR start "entryRulePlatformCharArray"
    // InternalUddl.g:8224:1: entryRulePlatformCharArray returns [EObject current=null] : iv_rulePlatformCharArray= rulePlatformCharArray EOF ;
    public final EObject entryRulePlatformCharArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformCharArray = null;


        try {
            // InternalUddl.g:8224:58: (iv_rulePlatformCharArray= rulePlatformCharArray EOF )
            // InternalUddl.g:8225:2: iv_rulePlatformCharArray= rulePlatformCharArray EOF
            {
             newCompositeNode(grammarAccess.getPlatformCharArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformCharArray=rulePlatformCharArray();

            state._fsp--;

             current =iv_rulePlatformCharArray; 
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
    // $ANTLR end "entryRulePlatformCharArray"


    // $ANTLR start "rulePlatformCharArray"
    // InternalUddl.g:8231:1: rulePlatformCharArray returns [EObject current=null] : (otherlv_0= 'char[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' ) ;
    public final EObject rulePlatformCharArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_length_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalUddl.g:8237:2: ( (otherlv_0= 'char[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' ) )
            // InternalUddl.g:8238:2: (otherlv_0= 'char[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' )
            {
            // InternalUddl.g:8238:2: (otherlv_0= 'char[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';' )
            // InternalUddl.g:8239:3: otherlv_0= 'char[' ( (lv_length_1_0= RULE_INT ) ) otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) ( (lv_description_4_0= RULE_STRING ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,108,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformCharArrayAccess().getCharKeyword_0());
            		
            // InternalUddl.g:8243:3: ( (lv_length_1_0= RULE_INT ) )
            // InternalUddl.g:8244:4: (lv_length_1_0= RULE_INT )
            {
            // InternalUddl.g:8244:4: (lv_length_1_0= RULE_INT )
            // InternalUddl.g:8245:5: lv_length_1_0= RULE_INT
            {
            lv_length_1_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_length_1_0, grammarAccess.getPlatformCharArrayAccess().getLengthINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCharArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"length",
            						lv_length_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPlatformCharArrayAccess().getRightSquareBracketKeyword_2());
            		
            // InternalUddl.g:8265:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalUddl.g:8266:4: (lv_name_3_0= RULE_ID )
            {
            // InternalUddl.g:8266:4: (lv_name_3_0= RULE_ID )
            // InternalUddl.g:8267:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPlatformCharArrayAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCharArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8283:3: ( (lv_description_4_0= RULE_STRING ) )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==RULE_STRING) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // InternalUddl.g:8284:4: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalUddl.g:8284:4: (lv_description_4_0= RULE_STRING )
                    // InternalUddl.g:8285:5: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_4_0, grammarAccess.getPlatformCharArrayAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformCharArrayRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformCharArrayAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalUddl.g:8305:3: ( ( ruleQN ) )
            // InternalUddl.g:8306:4: ( ruleQN )
            {
            // InternalUddl.g:8306:4: ( ruleQN )
            // InternalUddl.g:8307:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCharArrayRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformCharArrayAccess().getRealizesLogicalElementCrossReference_6_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPlatformCharArrayAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "rulePlatformCharArray"


    // $ANTLR start "entryRulePlatformEnumeration"
    // InternalUddl.g:8329:1: entryRulePlatformEnumeration returns [EObject current=null] : iv_rulePlatformEnumeration= rulePlatformEnumeration EOF ;
    public final EObject entryRulePlatformEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformEnumeration = null;


        try {
            // InternalUddl.g:8329:60: (iv_rulePlatformEnumeration= rulePlatformEnumeration EOF )
            // InternalUddl.g:8330:2: iv_rulePlatformEnumeration= rulePlatformEnumeration EOF
            {
             newCompositeNode(grammarAccess.getPlatformEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformEnumeration=rulePlatformEnumeration();

            state._fsp--;

             current =iv_rulePlatformEnumeration; 
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
    // $ANTLR end "entryRulePlatformEnumeration"


    // $ANTLR start "rulePlatformEnumeration"
    // InternalUddl.g:8336:1: rulePlatformEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8342:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8343:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8343:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8344:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformEnumerationAccess().getEnumKeyword_0());
            		
            // InternalUddl.g:8348:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8349:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8349:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8350:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformEnumerationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8366:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==RULE_STRING) ) {
                alt175=1;
            }
            switch (alt175) {
                case 1 :
                    // InternalUddl.g:8367:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8367:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8368:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformEnumerationAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformEnumerationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformEnumerationAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:8388:3: ( ( ruleQN ) )
            // InternalUddl.g:8389:4: ( ruleQN )
            {
            // InternalUddl.g:8389:4: ( ruleQN )
            // InternalUddl.g:8390:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformEnumerationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformEnumerationAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformEnumerationAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformEnumeration"


    // $ANTLR start "entryRulePlatformNumber"
    // InternalUddl.g:8412:1: entryRulePlatformNumber returns [EObject current=null] : iv_rulePlatformNumber= rulePlatformNumber EOF ;
    public final EObject entryRulePlatformNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformNumber = null;


        try {
            // InternalUddl.g:8412:55: (iv_rulePlatformNumber= rulePlatformNumber EOF )
            // InternalUddl.g:8413:2: iv_rulePlatformNumber= rulePlatformNumber EOF
            {
             newCompositeNode(grammarAccess.getPlatformNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformNumber=rulePlatformNumber();

            state._fsp--;

             current =iv_rulePlatformNumber; 
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
    // $ANTLR end "entryRulePlatformNumber"


    // $ANTLR start "rulePlatformNumber"
    // InternalUddl.g:8419:1: rulePlatformNumber returns [EObject current=null] : (this_PlatformReal_0= rulePlatformReal | this_PlatformInteger_1= rulePlatformInteger ) ;
    public final EObject rulePlatformNumber() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformReal_0 = null;

        EObject this_PlatformInteger_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:8425:2: ( (this_PlatformReal_0= rulePlatformReal | this_PlatformInteger_1= rulePlatformInteger ) )
            // InternalUddl.g:8426:2: (this_PlatformReal_0= rulePlatformReal | this_PlatformInteger_1= rulePlatformInteger )
            {
            // InternalUddl.g:8426:2: (this_PlatformReal_0= rulePlatformReal | this_PlatformInteger_1= rulePlatformInteger )
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( ((LA176_0>=112 && LA176_0<=115)) ) {
                alt176=1;
            }
            else if ( ((LA176_0>=109 && LA176_0<=111)||(LA176_0>=116 && LA176_0<=118)) ) {
                alt176=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 176, 0, input);

                throw nvae;
            }
            switch (alt176) {
                case 1 :
                    // InternalUddl.g:8427:3: this_PlatformReal_0= rulePlatformReal
                    {

                    			newCompositeNode(grammarAccess.getPlatformNumberAccess().getPlatformRealParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformReal_0=rulePlatformReal();

                    state._fsp--;


                    			current = this_PlatformReal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:8436:3: this_PlatformInteger_1= rulePlatformInteger
                    {

                    			newCompositeNode(grammarAccess.getPlatformNumberAccess().getPlatformIntegerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformInteger_1=rulePlatformInteger();

                    state._fsp--;


                    			current = this_PlatformInteger_1;
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
    // $ANTLR end "rulePlatformNumber"


    // $ANTLR start "entryRulePlatformInteger"
    // InternalUddl.g:8448:1: entryRulePlatformInteger returns [EObject current=null] : iv_rulePlatformInteger= rulePlatformInteger EOF ;
    public final EObject entryRulePlatformInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformInteger = null;


        try {
            // InternalUddl.g:8448:56: (iv_rulePlatformInteger= rulePlatformInteger EOF )
            // InternalUddl.g:8449:2: iv_rulePlatformInteger= rulePlatformInteger EOF
            {
             newCompositeNode(grammarAccess.getPlatformIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformInteger=rulePlatformInteger();

            state._fsp--;

             current =iv_rulePlatformInteger; 
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
    // $ANTLR end "entryRulePlatformInteger"


    // $ANTLR start "rulePlatformInteger"
    // InternalUddl.g:8455:1: rulePlatformInteger returns [EObject current=null] : (this_PlatformLong_0= rulePlatformLong | this_PlatformShort_1= rulePlatformShort | this_PlatformUnsignedInteger_2= rulePlatformUnsignedInteger | this_PlatformLongLong_3= rulePlatformLongLong ) ;
    public final EObject rulePlatformInteger() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformLong_0 = null;

        EObject this_PlatformShort_1 = null;

        EObject this_PlatformUnsignedInteger_2 = null;

        EObject this_PlatformLongLong_3 = null;



        	enterRule();

        try {
            // InternalUddl.g:8461:2: ( (this_PlatformLong_0= rulePlatformLong | this_PlatformShort_1= rulePlatformShort | this_PlatformUnsignedInteger_2= rulePlatformUnsignedInteger | this_PlatformLongLong_3= rulePlatformLongLong ) )
            // InternalUddl.g:8462:2: (this_PlatformLong_0= rulePlatformLong | this_PlatformShort_1= rulePlatformShort | this_PlatformUnsignedInteger_2= rulePlatformUnsignedInteger | this_PlatformLongLong_3= rulePlatformLongLong )
            {
            // InternalUddl.g:8462:2: (this_PlatformLong_0= rulePlatformLong | this_PlatformShort_1= rulePlatformShort | this_PlatformUnsignedInteger_2= rulePlatformUnsignedInteger | this_PlatformLongLong_3= rulePlatformLongLong )
            int alt177=4;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt177=1;
                }
                break;
            case 109:
                {
                alt177=2;
                }
                break;
            case 116:
            case 117:
            case 118:
                {
                alt177=3;
                }
                break;
            case 111:
                {
                alt177=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 177, 0, input);

                throw nvae;
            }

            switch (alt177) {
                case 1 :
                    // InternalUddl.g:8463:3: this_PlatformLong_0= rulePlatformLong
                    {

                    			newCompositeNode(grammarAccess.getPlatformIntegerAccess().getPlatformLongParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformLong_0=rulePlatformLong();

                    state._fsp--;


                    			current = this_PlatformLong_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:8472:3: this_PlatformShort_1= rulePlatformShort
                    {

                    			newCompositeNode(grammarAccess.getPlatformIntegerAccess().getPlatformShortParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformShort_1=rulePlatformShort();

                    state._fsp--;


                    			current = this_PlatformShort_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:8481:3: this_PlatformUnsignedInteger_2= rulePlatformUnsignedInteger
                    {

                    			newCompositeNode(grammarAccess.getPlatformIntegerAccess().getPlatformUnsignedIntegerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformUnsignedInteger_2=rulePlatformUnsignedInteger();

                    state._fsp--;


                    			current = this_PlatformUnsignedInteger_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:8490:3: this_PlatformLongLong_3= rulePlatformLongLong
                    {

                    			newCompositeNode(grammarAccess.getPlatformIntegerAccess().getPlatformLongLongParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformLongLong_3=rulePlatformLongLong();

                    state._fsp--;


                    			current = this_PlatformLongLong_3;
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
    // $ANTLR end "rulePlatformInteger"


    // $ANTLR start "entryRulePlatformShort"
    // InternalUddl.g:8502:1: entryRulePlatformShort returns [EObject current=null] : iv_rulePlatformShort= rulePlatformShort EOF ;
    public final EObject entryRulePlatformShort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformShort = null;


        try {
            // InternalUddl.g:8502:54: (iv_rulePlatformShort= rulePlatformShort EOF )
            // InternalUddl.g:8503:2: iv_rulePlatformShort= rulePlatformShort EOF
            {
             newCompositeNode(grammarAccess.getPlatformShortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformShort=rulePlatformShort();

            state._fsp--;

             current =iv_rulePlatformShort; 
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
    // $ANTLR end "entryRulePlatformShort"


    // $ANTLR start "rulePlatformShort"
    // InternalUddl.g:8509:1: rulePlatformShort returns [EObject current=null] : (otherlv_0= 'short' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformShort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8515:2: ( (otherlv_0= 'short' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8516:2: (otherlv_0= 'short' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8516:2: (otherlv_0= 'short' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8517:3: otherlv_0= 'short' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,109,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformShortAccess().getShortKeyword_0());
            		
            // InternalUddl.g:8521:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8522:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8522:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8523:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformShortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformShortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8539:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==RULE_STRING) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // InternalUddl.g:8540:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8540:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8541:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformShortAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformShortRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformShortAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:8561:3: ( ( ruleQN ) )
            // InternalUddl.g:8562:4: ( ruleQN )
            {
            // InternalUddl.g:8562:4: ( ruleQN )
            // InternalUddl.g:8563:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformShortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformShortAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformShortAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformShort"


    // $ANTLR start "entryRulePlatformLong"
    // InternalUddl.g:8585:1: entryRulePlatformLong returns [EObject current=null] : iv_rulePlatformLong= rulePlatformLong EOF ;
    public final EObject entryRulePlatformLong() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformLong = null;


        try {
            // InternalUddl.g:8585:53: (iv_rulePlatformLong= rulePlatformLong EOF )
            // InternalUddl.g:8586:2: iv_rulePlatformLong= rulePlatformLong EOF
            {
             newCompositeNode(grammarAccess.getPlatformLongRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformLong=rulePlatformLong();

            state._fsp--;

             current =iv_rulePlatformLong; 
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
    // $ANTLR end "entryRulePlatformLong"


    // $ANTLR start "rulePlatformLong"
    // InternalUddl.g:8592:1: rulePlatformLong returns [EObject current=null] : (otherlv_0= 'long' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformLong() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8598:2: ( (otherlv_0= 'long' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8599:2: (otherlv_0= 'long' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8599:2: (otherlv_0= 'long' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8600:3: otherlv_0= 'long' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,110,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformLongAccess().getLongKeyword_0());
            		
            // InternalUddl.g:8604:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8605:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8605:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8606:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformLongAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformLongRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8622:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==RULE_STRING) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // InternalUddl.g:8623:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8623:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8624:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformLongAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformLongRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformLongAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:8644:3: ( ( ruleQN ) )
            // InternalUddl.g:8645:4: ( ruleQN )
            {
            // InternalUddl.g:8645:4: ( ruleQN )
            // InternalUddl.g:8646:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformLongRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformLongAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformLongAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformLong"


    // $ANTLR start "entryRulePlatformLongLong"
    // InternalUddl.g:8668:1: entryRulePlatformLongLong returns [EObject current=null] : iv_rulePlatformLongLong= rulePlatformLongLong EOF ;
    public final EObject entryRulePlatformLongLong() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformLongLong = null;


        try {
            // InternalUddl.g:8668:57: (iv_rulePlatformLongLong= rulePlatformLongLong EOF )
            // InternalUddl.g:8669:2: iv_rulePlatformLongLong= rulePlatformLongLong EOF
            {
             newCompositeNode(grammarAccess.getPlatformLongLongRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformLongLong=rulePlatformLongLong();

            state._fsp--;

             current =iv_rulePlatformLongLong; 
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
    // $ANTLR end "entryRulePlatformLongLong"


    // $ANTLR start "rulePlatformLongLong"
    // InternalUddl.g:8675:1: rulePlatformLongLong returns [EObject current=null] : (otherlv_0= 'llong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformLongLong() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8681:2: ( (otherlv_0= 'llong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8682:2: (otherlv_0= 'llong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8682:2: (otherlv_0= 'llong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8683:3: otherlv_0= 'llong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,111,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformLongLongAccess().getLlongKeyword_0());
            		
            // InternalUddl.g:8687:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8688:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8688:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8689:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformLongLongAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformLongLongRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8705:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==RULE_STRING) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // InternalUddl.g:8706:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8706:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8707:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformLongLongAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformLongLongRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformLongLongAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:8727:3: ( ( ruleQN ) )
            // InternalUddl.g:8728:4: ( ruleQN )
            {
            // InternalUddl.g:8728:4: ( ruleQN )
            // InternalUddl.g:8729:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformLongLongRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformLongLongAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformLongLongAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformLongLong"


    // $ANTLR start "entryRulePlatformReal"
    // InternalUddl.g:8751:1: entryRulePlatformReal returns [EObject current=null] : iv_rulePlatformReal= rulePlatformReal EOF ;
    public final EObject entryRulePlatformReal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformReal = null;


        try {
            // InternalUddl.g:8751:53: (iv_rulePlatformReal= rulePlatformReal EOF )
            // InternalUddl.g:8752:2: iv_rulePlatformReal= rulePlatformReal EOF
            {
             newCompositeNode(grammarAccess.getPlatformRealRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformReal=rulePlatformReal();

            state._fsp--;

             current =iv_rulePlatformReal; 
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
    // $ANTLR end "entryRulePlatformReal"


    // $ANTLR start "rulePlatformReal"
    // InternalUddl.g:8758:1: rulePlatformReal returns [EObject current=null] : (this_PlatformFixed_0= rulePlatformFixed | this_PlatformFloat_1= rulePlatformFloat | this_PlatformDouble_2= rulePlatformDouble | this_PlatformLongDouble_3= rulePlatformLongDouble ) ;
    public final EObject rulePlatformReal() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformFixed_0 = null;

        EObject this_PlatformFloat_1 = null;

        EObject this_PlatformDouble_2 = null;

        EObject this_PlatformLongDouble_3 = null;



        	enterRule();

        try {
            // InternalUddl.g:8764:2: ( (this_PlatformFixed_0= rulePlatformFixed | this_PlatformFloat_1= rulePlatformFloat | this_PlatformDouble_2= rulePlatformDouble | this_PlatformLongDouble_3= rulePlatformLongDouble ) )
            // InternalUddl.g:8765:2: (this_PlatformFixed_0= rulePlatformFixed | this_PlatformFloat_1= rulePlatformFloat | this_PlatformDouble_2= rulePlatformDouble | this_PlatformLongDouble_3= rulePlatformLongDouble )
            {
            // InternalUddl.g:8765:2: (this_PlatformFixed_0= rulePlatformFixed | this_PlatformFloat_1= rulePlatformFloat | this_PlatformDouble_2= rulePlatformDouble | this_PlatformLongDouble_3= rulePlatformLongDouble )
            int alt181=4;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt181=1;
                }
                break;
            case 114:
                {
                alt181=2;
                }
                break;
            case 112:
                {
                alt181=3;
                }
                break;
            case 113:
                {
                alt181=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 181, 0, input);

                throw nvae;
            }

            switch (alt181) {
                case 1 :
                    // InternalUddl.g:8766:3: this_PlatformFixed_0= rulePlatformFixed
                    {

                    			newCompositeNode(grammarAccess.getPlatformRealAccess().getPlatformFixedParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformFixed_0=rulePlatformFixed();

                    state._fsp--;


                    			current = this_PlatformFixed_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:8775:3: this_PlatformFloat_1= rulePlatformFloat
                    {

                    			newCompositeNode(grammarAccess.getPlatformRealAccess().getPlatformFloatParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformFloat_1=rulePlatformFloat();

                    state._fsp--;


                    			current = this_PlatformFloat_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:8784:3: this_PlatformDouble_2= rulePlatformDouble
                    {

                    			newCompositeNode(grammarAccess.getPlatformRealAccess().getPlatformDoubleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformDouble_2=rulePlatformDouble();

                    state._fsp--;


                    			current = this_PlatformDouble_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUddl.g:8793:3: this_PlatformLongDouble_3= rulePlatformLongDouble
                    {

                    			newCompositeNode(grammarAccess.getPlatformRealAccess().getPlatformLongDoubleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformLongDouble_3=rulePlatformLongDouble();

                    state._fsp--;


                    			current = this_PlatformLongDouble_3;
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
    // $ANTLR end "rulePlatformReal"


    // $ANTLR start "entryRulePlatformDouble"
    // InternalUddl.g:8805:1: entryRulePlatformDouble returns [EObject current=null] : iv_rulePlatformDouble= rulePlatformDouble EOF ;
    public final EObject entryRulePlatformDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformDouble = null;


        try {
            // InternalUddl.g:8805:55: (iv_rulePlatformDouble= rulePlatformDouble EOF )
            // InternalUddl.g:8806:2: iv_rulePlatformDouble= rulePlatformDouble EOF
            {
             newCompositeNode(grammarAccess.getPlatformDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformDouble=rulePlatformDouble();

            state._fsp--;

             current =iv_rulePlatformDouble; 
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
    // $ANTLR end "entryRulePlatformDouble"


    // $ANTLR start "rulePlatformDouble"
    // InternalUddl.g:8812:1: rulePlatformDouble returns [EObject current=null] : (otherlv_0= 'double' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8818:2: ( (otherlv_0= 'double' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8819:2: (otherlv_0= 'double' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8819:2: (otherlv_0= 'double' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8820:3: otherlv_0= 'double' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,112,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformDoubleAccess().getDoubleKeyword_0());
            		
            // InternalUddl.g:8824:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8825:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8825:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8826:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformDoubleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformDoubleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8842:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==RULE_STRING) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // InternalUddl.g:8843:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8843:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8844:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformDoubleAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformDoubleRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformDoubleAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:8864:3: ( ( ruleQN ) )
            // InternalUddl.g:8865:4: ( ruleQN )
            {
            // InternalUddl.g:8865:4: ( ruleQN )
            // InternalUddl.g:8866:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformDoubleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformDoubleAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformDoubleAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformDouble"


    // $ANTLR start "entryRulePlatformLongDouble"
    // InternalUddl.g:8888:1: entryRulePlatformLongDouble returns [EObject current=null] : iv_rulePlatformLongDouble= rulePlatformLongDouble EOF ;
    public final EObject entryRulePlatformLongDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformLongDouble = null;


        try {
            // InternalUddl.g:8888:59: (iv_rulePlatformLongDouble= rulePlatformLongDouble EOF )
            // InternalUddl.g:8889:2: iv_rulePlatformLongDouble= rulePlatformLongDouble EOF
            {
             newCompositeNode(grammarAccess.getPlatformLongDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformLongDouble=rulePlatformLongDouble();

            state._fsp--;

             current =iv_rulePlatformLongDouble; 
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
    // $ANTLR end "entryRulePlatformLongDouble"


    // $ANTLR start "rulePlatformLongDouble"
    // InternalUddl.g:8895:1: rulePlatformLongDouble returns [EObject current=null] : (otherlv_0= 'ldouble' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformLongDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8901:2: ( (otherlv_0= 'ldouble' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8902:2: (otherlv_0= 'ldouble' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8902:2: (otherlv_0= 'ldouble' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8903:3: otherlv_0= 'ldouble' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,113,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformLongDoubleAccess().getLdoubleKeyword_0());
            		
            // InternalUddl.g:8907:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8908:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8908:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8909:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformLongDoubleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformLongDoubleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:8925:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==RULE_STRING) ) {
                alt183=1;
            }
            switch (alt183) {
                case 1 :
                    // InternalUddl.g:8926:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:8926:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:8927:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformLongDoubleAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformLongDoubleRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformLongDoubleAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:8947:3: ( ( ruleQN ) )
            // InternalUddl.g:8948:4: ( ruleQN )
            {
            // InternalUddl.g:8948:4: ( ruleQN )
            // InternalUddl.g:8949:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformLongDoubleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformLongDoubleAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformLongDoubleAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformLongDouble"


    // $ANTLR start "entryRulePlatformFloat"
    // InternalUddl.g:8971:1: entryRulePlatformFloat returns [EObject current=null] : iv_rulePlatformFloat= rulePlatformFloat EOF ;
    public final EObject entryRulePlatformFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformFloat = null;


        try {
            // InternalUddl.g:8971:54: (iv_rulePlatformFloat= rulePlatformFloat EOF )
            // InternalUddl.g:8972:2: iv_rulePlatformFloat= rulePlatformFloat EOF
            {
             newCompositeNode(grammarAccess.getPlatformFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformFloat=rulePlatformFloat();

            state._fsp--;

             current =iv_rulePlatformFloat; 
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
    // $ANTLR end "entryRulePlatformFloat"


    // $ANTLR start "rulePlatformFloat"
    // InternalUddl.g:8978:1: rulePlatformFloat returns [EObject current=null] : (otherlv_0= 'float' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:8984:2: ( (otherlv_0= 'float' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:8985:2: (otherlv_0= 'float' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:8985:2: (otherlv_0= 'float' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:8986:3: otherlv_0= 'float' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,114,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformFloatAccess().getFloatKeyword_0());
            		
            // InternalUddl.g:8990:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:8991:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:8991:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:8992:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformFloatAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformFloatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:9008:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==RULE_STRING) ) {
                alt184=1;
            }
            switch (alt184) {
                case 1 :
                    // InternalUddl.g:9009:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:9009:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:9010:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformFloatAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformFloatRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformFloatAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:9030:3: ( ( ruleQN ) )
            // InternalUddl.g:9031:4: ( ruleQN )
            {
            // InternalUddl.g:9031:4: ( ruleQN )
            // InternalUddl.g:9032:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformFloatRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformFloatAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformFloatAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformFloat"


    // $ANTLR start "entryRulePlatformFixed"
    // InternalUddl.g:9054:1: entryRulePlatformFixed returns [EObject current=null] : iv_rulePlatformFixed= rulePlatformFixed EOF ;
    public final EObject entryRulePlatformFixed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformFixed = null;


        try {
            // InternalUddl.g:9054:54: (iv_rulePlatformFixed= rulePlatformFixed EOF )
            // InternalUddl.g:9055:2: iv_rulePlatformFixed= rulePlatformFixed EOF
            {
             newCompositeNode(grammarAccess.getPlatformFixedRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformFixed=rulePlatformFixed();

            state._fsp--;

             current =iv_rulePlatformFixed; 
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
    // $ANTLR end "entryRulePlatformFixed"


    // $ANTLR start "rulePlatformFixed"
    // InternalUddl.g:9061:1: rulePlatformFixed returns [EObject current=null] : (otherlv_0= 'fixed[' ( (lv_digits_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_scale_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_name_5_0= RULE_ID ) ) ( (lv_description_6_0= RULE_STRING ) )? otherlv_7= '->' ( ( ruleQN ) ) otherlv_9= ';' ) ;
    public final EObject rulePlatformFixed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_digits_1_0=null;
        Token otherlv_2=null;
        Token lv_scale_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalUddl.g:9067:2: ( (otherlv_0= 'fixed[' ( (lv_digits_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_scale_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_name_5_0= RULE_ID ) ) ( (lv_description_6_0= RULE_STRING ) )? otherlv_7= '->' ( ( ruleQN ) ) otherlv_9= ';' ) )
            // InternalUddl.g:9068:2: (otherlv_0= 'fixed[' ( (lv_digits_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_scale_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_name_5_0= RULE_ID ) ) ( (lv_description_6_0= RULE_STRING ) )? otherlv_7= '->' ( ( ruleQN ) ) otherlv_9= ';' )
            {
            // InternalUddl.g:9068:2: (otherlv_0= 'fixed[' ( (lv_digits_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_scale_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_name_5_0= RULE_ID ) ) ( (lv_description_6_0= RULE_STRING ) )? otherlv_7= '->' ( ( ruleQN ) ) otherlv_9= ';' )
            // InternalUddl.g:9069:3: otherlv_0= 'fixed[' ( (lv_digits_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_scale_3_0= RULE_INT ) ) otherlv_4= ']' ( (lv_name_5_0= RULE_ID ) ) ( (lv_description_6_0= RULE_STRING ) )? otherlv_7= '->' ( ( ruleQN ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,115,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformFixedAccess().getFixedKeyword_0());
            		
            // InternalUddl.g:9073:3: ( (lv_digits_1_0= RULE_INT ) )
            // InternalUddl.g:9074:4: (lv_digits_1_0= RULE_INT )
            {
            // InternalUddl.g:9074:4: (lv_digits_1_0= RULE_INT )
            // InternalUddl.g:9075:5: lv_digits_1_0= RULE_INT
            {
            lv_digits_1_0=(Token)match(input,RULE_INT,FOLLOW_102); 

            					newLeafNode(lv_digits_1_0, grammarAccess.getPlatformFixedAccess().getDigitsINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformFixedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"digits",
            						lv_digits_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getPlatformFixedAccess().getFullStopKeyword_2());
            		
            // InternalUddl.g:9095:3: ( (lv_scale_3_0= RULE_INT ) )
            // InternalUddl.g:9096:4: (lv_scale_3_0= RULE_INT )
            {
            // InternalUddl.g:9096:4: (lv_scale_3_0= RULE_INT )
            // InternalUddl.g:9097:5: lv_scale_3_0= RULE_INT
            {
            lv_scale_3_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_scale_3_0, grammarAccess.getPlatformFixedAccess().getScaleINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformFixedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scale",
            						lv_scale_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getPlatformFixedAccess().getRightSquareBracketKeyword_4());
            		
            // InternalUddl.g:9117:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalUddl.g:9118:4: (lv_name_5_0= RULE_ID )
            {
            // InternalUddl.g:9118:4: (lv_name_5_0= RULE_ID )
            // InternalUddl.g:9119:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_5_0, grammarAccess.getPlatformFixedAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformFixedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:9135:3: ( (lv_description_6_0= RULE_STRING ) )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==RULE_STRING) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // InternalUddl.g:9136:4: (lv_description_6_0= RULE_STRING )
                    {
                    // InternalUddl.g:9136:4: (lv_description_6_0= RULE_STRING )
                    // InternalUddl.g:9137:5: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_6_0, grammarAccess.getPlatformFixedAccess().getDescriptionSTRINGTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformFixedRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_6_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getPlatformFixedAccess().getHyphenMinusGreaterThanSignKeyword_7());
            		
            // InternalUddl.g:9157:3: ( ( ruleQN ) )
            // InternalUddl.g:9158:4: ( ruleQN )
            {
            // InternalUddl.g:9158:4: ( ruleQN )
            // InternalUddl.g:9159:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformFixedRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformFixedAccess().getRealizesLogicalElementCrossReference_8_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPlatformFixedAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "rulePlatformFixed"


    // $ANTLR start "entryRulePlatformUnsignedInteger"
    // InternalUddl.g:9181:1: entryRulePlatformUnsignedInteger returns [EObject current=null] : iv_rulePlatformUnsignedInteger= rulePlatformUnsignedInteger EOF ;
    public final EObject entryRulePlatformUnsignedInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformUnsignedInteger = null;


        try {
            // InternalUddl.g:9181:64: (iv_rulePlatformUnsignedInteger= rulePlatformUnsignedInteger EOF )
            // InternalUddl.g:9182:2: iv_rulePlatformUnsignedInteger= rulePlatformUnsignedInteger EOF
            {
             newCompositeNode(grammarAccess.getPlatformUnsignedIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformUnsignedInteger=rulePlatformUnsignedInteger();

            state._fsp--;

             current =iv_rulePlatformUnsignedInteger; 
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
    // $ANTLR end "entryRulePlatformUnsignedInteger"


    // $ANTLR start "rulePlatformUnsignedInteger"
    // InternalUddl.g:9188:1: rulePlatformUnsignedInteger returns [EObject current=null] : (this_PlatformUShort_0= rulePlatformUShort | this_PlatformULong_1= rulePlatformULong | this_PlatformULongLong_2= rulePlatformULongLong ) ;
    public final EObject rulePlatformUnsignedInteger() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformUShort_0 = null;

        EObject this_PlatformULong_1 = null;

        EObject this_PlatformULongLong_2 = null;



        	enterRule();

        try {
            // InternalUddl.g:9194:2: ( (this_PlatformUShort_0= rulePlatformUShort | this_PlatformULong_1= rulePlatformULong | this_PlatformULongLong_2= rulePlatformULongLong ) )
            // InternalUddl.g:9195:2: (this_PlatformUShort_0= rulePlatformUShort | this_PlatformULong_1= rulePlatformULong | this_PlatformULongLong_2= rulePlatformULongLong )
            {
            // InternalUddl.g:9195:2: (this_PlatformUShort_0= rulePlatformUShort | this_PlatformULong_1= rulePlatformULong | this_PlatformULongLong_2= rulePlatformULongLong )
            int alt186=3;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt186=1;
                }
                break;
            case 117:
                {
                alt186=2;
                }
                break;
            case 118:
                {
                alt186=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 186, 0, input);

                throw nvae;
            }

            switch (alt186) {
                case 1 :
                    // InternalUddl.g:9196:3: this_PlatformUShort_0= rulePlatformUShort
                    {

                    			newCompositeNode(grammarAccess.getPlatformUnsignedIntegerAccess().getPlatformUShortParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformUShort_0=rulePlatformUShort();

                    state._fsp--;


                    			current = this_PlatformUShort_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:9205:3: this_PlatformULong_1= rulePlatformULong
                    {

                    			newCompositeNode(grammarAccess.getPlatformUnsignedIntegerAccess().getPlatformULongParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformULong_1=rulePlatformULong();

                    state._fsp--;


                    			current = this_PlatformULong_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUddl.g:9214:3: this_PlatformULongLong_2= rulePlatformULongLong
                    {

                    			newCompositeNode(grammarAccess.getPlatformUnsignedIntegerAccess().getPlatformULongLongParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformULongLong_2=rulePlatformULongLong();

                    state._fsp--;


                    			current = this_PlatformULongLong_2;
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
    // $ANTLR end "rulePlatformUnsignedInteger"


    // $ANTLR start "entryRulePlatformUShort"
    // InternalUddl.g:9226:1: entryRulePlatformUShort returns [EObject current=null] : iv_rulePlatformUShort= rulePlatformUShort EOF ;
    public final EObject entryRulePlatformUShort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformUShort = null;


        try {
            // InternalUddl.g:9226:55: (iv_rulePlatformUShort= rulePlatformUShort EOF )
            // InternalUddl.g:9227:2: iv_rulePlatformUShort= rulePlatformUShort EOF
            {
             newCompositeNode(grammarAccess.getPlatformUShortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformUShort=rulePlatformUShort();

            state._fsp--;

             current =iv_rulePlatformUShort; 
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
    // $ANTLR end "entryRulePlatformUShort"


    // $ANTLR start "rulePlatformUShort"
    // InternalUddl.g:9233:1: rulePlatformUShort returns [EObject current=null] : (otherlv_0= 'ushort' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformUShort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:9239:2: ( (otherlv_0= 'ushort' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:9240:2: (otherlv_0= 'ushort' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:9240:2: (otherlv_0= 'ushort' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:9241:3: otherlv_0= 'ushort' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,116,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformUShortAccess().getUshortKeyword_0());
            		
            // InternalUddl.g:9245:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:9246:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:9246:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:9247:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformUShortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformUShortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:9263:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( (LA187_0==RULE_STRING) ) {
                alt187=1;
            }
            switch (alt187) {
                case 1 :
                    // InternalUddl.g:9264:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:9264:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:9265:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformUShortAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformUShortRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformUShortAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:9285:3: ( ( ruleQN ) )
            // InternalUddl.g:9286:4: ( ruleQN )
            {
            // InternalUddl.g:9286:4: ( ruleQN )
            // InternalUddl.g:9287:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformUShortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformUShortAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformUShortAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformUShort"


    // $ANTLR start "entryRulePlatformULong"
    // InternalUddl.g:9309:1: entryRulePlatformULong returns [EObject current=null] : iv_rulePlatformULong= rulePlatformULong EOF ;
    public final EObject entryRulePlatformULong() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformULong = null;


        try {
            // InternalUddl.g:9309:54: (iv_rulePlatformULong= rulePlatformULong EOF )
            // InternalUddl.g:9310:2: iv_rulePlatformULong= rulePlatformULong EOF
            {
             newCompositeNode(grammarAccess.getPlatformULongRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformULong=rulePlatformULong();

            state._fsp--;

             current =iv_rulePlatformULong; 
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
    // $ANTLR end "entryRulePlatformULong"


    // $ANTLR start "rulePlatformULong"
    // InternalUddl.g:9316:1: rulePlatformULong returns [EObject current=null] : (otherlv_0= 'ulong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformULong() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:9322:2: ( (otherlv_0= 'ulong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:9323:2: (otherlv_0= 'ulong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:9323:2: (otherlv_0= 'ulong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:9324:3: otherlv_0= 'ulong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,117,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformULongAccess().getUlongKeyword_0());
            		
            // InternalUddl.g:9328:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:9329:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:9329:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:9330:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformULongAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformULongRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:9346:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( (LA188_0==RULE_STRING) ) {
                alt188=1;
            }
            switch (alt188) {
                case 1 :
                    // InternalUddl.g:9347:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:9347:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:9348:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformULongAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformULongRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformULongAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:9368:3: ( ( ruleQN ) )
            // InternalUddl.g:9369:4: ( ruleQN )
            {
            // InternalUddl.g:9369:4: ( ruleQN )
            // InternalUddl.g:9370:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformULongRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformULongAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformULongAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformULong"


    // $ANTLR start "entryRulePlatformULongLong"
    // InternalUddl.g:9392:1: entryRulePlatformULongLong returns [EObject current=null] : iv_rulePlatformULongLong= rulePlatformULongLong EOF ;
    public final EObject entryRulePlatformULongLong() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformULongLong = null;


        try {
            // InternalUddl.g:9392:58: (iv_rulePlatformULongLong= rulePlatformULongLong EOF )
            // InternalUddl.g:9393:2: iv_rulePlatformULongLong= rulePlatformULongLong EOF
            {
             newCompositeNode(grammarAccess.getPlatformULongLongRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformULongLong=rulePlatformULongLong();

            state._fsp--;

             current =iv_rulePlatformULongLong; 
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
    // $ANTLR end "entryRulePlatformULongLong"


    // $ANTLR start "rulePlatformULongLong"
    // InternalUddl.g:9399:1: rulePlatformULongLong returns [EObject current=null] : (otherlv_0= 'ullong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject rulePlatformULongLong() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUddl.g:9405:2: ( (otherlv_0= 'ullong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalUddl.g:9406:2: (otherlv_0= 'ullong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalUddl.g:9406:2: (otherlv_0= 'ullong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalUddl.g:9407:3: otherlv_0= 'ullong' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,118,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformULongLongAccess().getUllongKeyword_0());
            		
            // InternalUddl.g:9411:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:9412:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:9412:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:9413:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformULongLongAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformULongLongRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:9429:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==RULE_STRING) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // InternalUddl.g:9430:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:9430:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:9431:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformULongLongAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformULongLongRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformULongLongAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:9451:3: ( ( ruleQN ) )
            // InternalUddl.g:9452:4: ( ruleQN )
            {
            // InternalUddl.g:9452:4: ( ruleQN )
            // InternalUddl.g:9453:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformULongLongRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformULongLongAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformULongLongAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePlatformULongLong"


    // $ANTLR start "entryRulePlatformSequence"
    // InternalUddl.g:9475:1: entryRulePlatformSequence returns [EObject current=null] : iv_rulePlatformSequence= rulePlatformSequence EOF ;
    public final EObject entryRulePlatformSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformSequence = null;


        try {
            // InternalUddl.g:9475:57: (iv_rulePlatformSequence= rulePlatformSequence EOF )
            // InternalUddl.g:9476:2: iv_rulePlatformSequence= rulePlatformSequence EOF
            {
             newCompositeNode(grammarAccess.getPlatformSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformSequence=rulePlatformSequence();

            state._fsp--;

             current =iv_rulePlatformSequence; 
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
    // $ANTLR end "entryRulePlatformSequence"


    // $ANTLR start "rulePlatformSequence"
    // InternalUddl.g:9482:1: rulePlatformSequence returns [EObject current=null] : (otherlv_0= 'seq' (otherlv_1= '[' ( (lv_maxSize_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' ) ;
    public final EObject rulePlatformSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_maxSize_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalUddl.g:9488:2: ( (otherlv_0= 'seq' (otherlv_1= '[' ( (lv_maxSize_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' ) )
            // InternalUddl.g:9489:2: (otherlv_0= 'seq' (otherlv_1= '[' ( (lv_maxSize_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' )
            {
            // InternalUddl.g:9489:2: (otherlv_0= 'seq' (otherlv_1= '[' ( (lv_maxSize_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' )
            // InternalUddl.g:9490:3: otherlv_0= 'seq' (otherlv_1= '[' ( (lv_maxSize_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,119,FOLLOW_103); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformSequenceAccess().getSeqKeyword_0());
            		
            // InternalUddl.g:9494:3: (otherlv_1= '[' ( (lv_maxSize_2_0= RULE_INT ) ) otherlv_3= ']' )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( (LA190_0==28) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // InternalUddl.g:9495:4: otherlv_1= '[' ( (lv_maxSize_2_0= RULE_INT ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_34); 

                    				newLeafNode(otherlv_1, grammarAccess.getPlatformSequenceAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalUddl.g:9499:4: ( (lv_maxSize_2_0= RULE_INT ) )
                    // InternalUddl.g:9500:5: (lv_maxSize_2_0= RULE_INT )
                    {
                    // InternalUddl.g:9500:5: (lv_maxSize_2_0= RULE_INT )
                    // InternalUddl.g:9501:6: lv_maxSize_2_0= RULE_INT
                    {
                    lv_maxSize_2_0=(Token)match(input,RULE_INT,FOLLOW_27); 

                    						newLeafNode(lv_maxSize_2_0, grammarAccess.getPlatformSequenceAccess().getMaxSizeINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformSequenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxSize",
                    							lv_maxSize_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlatformSequenceAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalUddl.g:9522:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalUddl.g:9523:4: (lv_name_4_0= RULE_ID )
            {
            // InternalUddl.g:9523:4: (lv_name_4_0= RULE_ID )
            // InternalUddl.g:9524:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_4_0, grammarAccess.getPlatformSequenceAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformSequenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:9540:3: ( (lv_description_5_0= RULE_STRING ) )?
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( (LA191_0==RULE_STRING) ) {
                alt191=1;
            }
            switch (alt191) {
                case 1 :
                    // InternalUddl.g:9541:4: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalUddl.g:9541:4: (lv_description_5_0= RULE_STRING )
                    // InternalUddl.g:9542:5: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_5_0, grammarAccess.getPlatformSequenceAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformSequenceRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getPlatformSequenceAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalUddl.g:9562:3: ( ( ruleQN ) )
            // InternalUddl.g:9563:4: ( ruleQN )
            {
            // InternalUddl.g:9563:4: ( ruleQN )
            // InternalUddl.g:9564:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformSequenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformSequenceAccess().getRealizesLogicalElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPlatformSequenceAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "rulePlatformSequence"


    // $ANTLR start "entryRulePlatformArray"
    // InternalUddl.g:9586:1: entryRulePlatformArray returns [EObject current=null] : iv_rulePlatformArray= rulePlatformArray EOF ;
    public final EObject entryRulePlatformArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformArray = null;


        try {
            // InternalUddl.g:9586:54: (iv_rulePlatformArray= rulePlatformArray EOF )
            // InternalUddl.g:9587:2: iv_rulePlatformArray= rulePlatformArray EOF
            {
             newCompositeNode(grammarAccess.getPlatformArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformArray=rulePlatformArray();

            state._fsp--;

             current =iv_rulePlatformArray; 
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
    // $ANTLR end "entryRulePlatformArray"


    // $ANTLR start "rulePlatformArray"
    // InternalUddl.g:9593:1: rulePlatformArray returns [EObject current=null] : (otherlv_0= 'arr' (otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' ) ;
    public final EObject rulePlatformArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalUddl.g:9599:2: ( (otherlv_0= 'arr' (otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' ) )
            // InternalUddl.g:9600:2: (otherlv_0= 'arr' (otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' )
            {
            // InternalUddl.g:9600:2: (otherlv_0= 'arr' (otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';' )
            // InternalUddl.g:9601:3: otherlv_0= 'arr' (otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_description_5_0= RULE_STRING ) )? otherlv_6= '->' ( ( ruleQN ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,120,FOLLOW_103); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformArrayAccess().getArrKeyword_0());
            		
            // InternalUddl.g:9605:3: (otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']' )?
            int alt192=2;
            int LA192_0 = input.LA(1);

            if ( (LA192_0==28) ) {
                alt192=1;
            }
            switch (alt192) {
                case 1 :
                    // InternalUddl.g:9606:4: otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_34); 

                    				newLeafNode(otherlv_1, grammarAccess.getPlatformArrayAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalUddl.g:9610:4: ( (lv_size_2_0= RULE_INT ) )
                    // InternalUddl.g:9611:5: (lv_size_2_0= RULE_INT )
                    {
                    // InternalUddl.g:9611:5: (lv_size_2_0= RULE_INT )
                    // InternalUddl.g:9612:6: lv_size_2_0= RULE_INT
                    {
                    lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_27); 

                    						newLeafNode(lv_size_2_0, grammarAccess.getPlatformArrayAccess().getSizeINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformArrayRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlatformArrayAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalUddl.g:9633:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalUddl.g:9634:4: (lv_name_4_0= RULE_ID )
            {
            // InternalUddl.g:9634:4: (lv_name_4_0= RULE_ID )
            // InternalUddl.g:9635:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_4_0, grammarAccess.getPlatformArrayAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:9651:3: ( (lv_description_5_0= RULE_STRING ) )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( (LA193_0==RULE_STRING) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // InternalUddl.g:9652:4: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalUddl.g:9652:4: (lv_description_5_0= RULE_STRING )
                    // InternalUddl.g:9653:5: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_5_0, grammarAccess.getPlatformArrayAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformArrayRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getPlatformArrayAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalUddl.g:9673:3: ( ( ruleQN ) )
            // InternalUddl.g:9674:4: ( ruleQN )
            {
            // InternalUddl.g:9674:4: ( ruleQN )
            // InternalUddl.g:9675:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformArrayRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformArrayAccess().getRealizesLogicalElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPlatformArrayAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "rulePlatformArray"


    // $ANTLR start "entryRulePlatformStruct"
    // InternalUddl.g:9697:1: entryRulePlatformStruct returns [EObject current=null] : iv_rulePlatformStruct= rulePlatformStruct EOF ;
    public final EObject entryRulePlatformStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformStruct = null;


        try {
            // InternalUddl.g:9697:55: (iv_rulePlatformStruct= rulePlatformStruct EOF )
            // InternalUddl.g:9698:2: iv_rulePlatformStruct= rulePlatformStruct EOF
            {
             newCompositeNode(grammarAccess.getPlatformStructRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformStruct=rulePlatformStruct();

            state._fsp--;

             current =iv_rulePlatformStruct; 
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
    // $ANTLR end "entryRulePlatformStruct"


    // $ANTLR start "rulePlatformStruct"
    // InternalUddl.g:9704:1: rulePlatformStruct returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_member_6_0= rulePlatformStructMember ) ) ( (lv_member_7_0= rulePlatformStructMember ) ) ( (lv_member_8_0= rulePlatformStructMember ) )? otherlv_9= '};' ) ;
    public final EObject rulePlatformStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_member_6_0 = null;

        EObject lv_member_7_0 = null;

        EObject lv_member_8_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:9710:2: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_member_6_0= rulePlatformStructMember ) ) ( (lv_member_7_0= rulePlatformStructMember ) ) ( (lv_member_8_0= rulePlatformStructMember ) )? otherlv_9= '};' ) )
            // InternalUddl.g:9711:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_member_6_0= rulePlatformStructMember ) ) ( (lv_member_7_0= rulePlatformStructMember ) ) ( (lv_member_8_0= rulePlatformStructMember ) )? otherlv_9= '};' )
            {
            // InternalUddl.g:9711:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_member_6_0= rulePlatformStructMember ) ) ( (lv_member_7_0= rulePlatformStructMember ) ) ( (lv_member_8_0= rulePlatformStructMember ) )? otherlv_9= '};' )
            // InternalUddl.g:9712:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '->' ( ( ruleQN ) ) otherlv_5= '{' ( (lv_member_6_0= rulePlatformStructMember ) ) ( (lv_member_7_0= rulePlatformStructMember ) ) ( (lv_member_8_0= rulePlatformStructMember ) )? otherlv_9= '};'
            {
            otherlv_0=(Token)match(input,121,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformStructAccess().getStructKeyword_0());
            		
            // InternalUddl.g:9716:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:9717:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:9717:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:9718:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_87); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformStructAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformStructRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:9734:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt194=2;
            int LA194_0 = input.LA(1);

            if ( (LA194_0==RULE_STRING) ) {
                alt194=1;
            }
            switch (alt194) {
                case 1 :
                    // InternalUddl.g:9735:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:9735:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:9736:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformStructAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformStructRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformStructAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalUddl.g:9756:3: ( ( ruleQN ) )
            // InternalUddl.g:9757:4: ( ruleQN )
            {
            // InternalUddl.g:9757:4: ( ruleQN )
            // InternalUddl.g:9758:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformStructRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformStructAccess().getRealizesLogicalElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_6);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformStructAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalUddl.g:9776:3: ( (lv_member_6_0= rulePlatformStructMember ) )
            // InternalUddl.g:9777:4: (lv_member_6_0= rulePlatformStructMember )
            {
            // InternalUddl.g:9777:4: (lv_member_6_0= rulePlatformStructMember )
            // InternalUddl.g:9778:5: lv_member_6_0= rulePlatformStructMember
            {

            					newCompositeNode(grammarAccess.getPlatformStructAccess().getMemberPlatformStructMemberParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_4);
            lv_member_6_0=rulePlatformStructMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformStructRule());
            					}
            					add(
            						current,
            						"member",
            						lv_member_6_0,
            						"com.epistimis.uddl.Uddl.PlatformStructMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:9795:3: ( (lv_member_7_0= rulePlatformStructMember ) )
            // InternalUddl.g:9796:4: (lv_member_7_0= rulePlatformStructMember )
            {
            // InternalUddl.g:9796:4: (lv_member_7_0= rulePlatformStructMember )
            // InternalUddl.g:9797:5: lv_member_7_0= rulePlatformStructMember
            {

            					newCompositeNode(grammarAccess.getPlatformStructAccess().getMemberPlatformStructMemberParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_43);
            lv_member_7_0=rulePlatformStructMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformStructRule());
            					}
            					add(
            						current,
            						"member",
            						lv_member_7_0,
            						"com.epistimis.uddl.Uddl.PlatformStructMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:9814:3: ( (lv_member_8_0= rulePlatformStructMember ) )?
            int alt195=2;
            int LA195_0 = input.LA(1);

            if ( (LA195_0==RULE_ID) ) {
                alt195=1;
            }
            switch (alt195) {
                case 1 :
                    // InternalUddl.g:9815:4: (lv_member_8_0= rulePlatformStructMember )
                    {
                    // InternalUddl.g:9815:4: (lv_member_8_0= rulePlatformStructMember )
                    // InternalUddl.g:9816:5: lv_member_8_0= rulePlatformStructMember
                    {

                    					newCompositeNode(grammarAccess.getPlatformStructAccess().getMemberPlatformStructMemberParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_member_8_0=rulePlatformStructMember();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPlatformStructRule());
                    					}
                    					add(
                    						current,
                    						"member",
                    						lv_member_8_0,
                    						"com.epistimis.uddl.Uddl.PlatformStructMember");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPlatformStructAccess().getRightCurlyBracketSemicolonKeyword_9());
            		

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
    // $ANTLR end "rulePlatformStruct"


    // $ANTLR start "entryRulePlatformStructMember"
    // InternalUddl.g:9841:1: entryRulePlatformStructMember returns [EObject current=null] : iv_rulePlatformStructMember= rulePlatformStructMember EOF ;
    public final EObject entryRulePlatformStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformStructMember = null;


        try {
            // InternalUddl.g:9841:61: (iv_rulePlatformStructMember= rulePlatformStructMember EOF )
            // InternalUddl.g:9842:2: iv_rulePlatformStructMember= rulePlatformStructMember EOF
            {
             newCompositeNode(grammarAccess.getPlatformStructMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformStructMember=rulePlatformStructMember();

            state._fsp--;

             current =iv_rulePlatformStructMember; 
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
    // $ANTLR end "entryRulePlatformStructMember"


    // $ANTLR start "rulePlatformStructMember"
    // InternalUddl.g:9848:1: rulePlatformStructMember returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_precision_3_0= RULE_FLOAT ) ) otherlv_4= ')' (otherlv_5= '->' ( ( ruleQN ) ) )? otherlv_7= ';' ) ;
    public final EObject rulePlatformStructMember() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token lv_precision_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalUddl.g:9854:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_precision_3_0= RULE_FLOAT ) ) otherlv_4= ')' (otherlv_5= '->' ( ( ruleQN ) ) )? otherlv_7= ';' ) )
            // InternalUddl.g:9855:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_precision_3_0= RULE_FLOAT ) ) otherlv_4= ')' (otherlv_5= '->' ( ( ruleQN ) ) )? otherlv_7= ';' )
            {
            // InternalUddl.g:9855:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_precision_3_0= RULE_FLOAT ) ) otherlv_4= ')' (otherlv_5= '->' ( ( ruleQN ) ) )? otherlv_7= ';' )
            // InternalUddl.g:9856:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_precision_3_0= RULE_FLOAT ) ) otherlv_4= ')' (otherlv_5= '->' ( ( ruleQN ) ) )? otherlv_7= ';'
            {
            // InternalUddl.g:9856:3: ( ( ruleQN ) )
            // InternalUddl.g:9857:4: ( ruleQN )
            {
            // InternalUddl.g:9857:4: ( ruleQN )
            // InternalUddl.g:9858:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformStructMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformStructMemberAccess().getTypePlatformDataTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:9872:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:9873:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:9873:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:9874:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_66); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getPlatformStructMemberAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformStructMemberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,63,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getPlatformStructMemberAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUddl.g:9894:3: ( (lv_precision_3_0= RULE_FLOAT ) )
            // InternalUddl.g:9895:4: (lv_precision_3_0= RULE_FLOAT )
            {
            // InternalUddl.g:9895:4: (lv_precision_3_0= RULE_FLOAT )
            // InternalUddl.g:9896:5: lv_precision_3_0= RULE_FLOAT
            {
            lv_precision_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_56); 

            					newLeafNode(lv_precision_3_0, grammarAccess.getPlatformStructMemberAccess().getPrecisionFLOATTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformStructMemberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"precision",
            						lv_precision_3_0,
            						"com.epistimis.uddl.Uddl.FLOAT");
            				

            }


            }

            otherlv_4=(Token)match(input,64,FOLLOW_101); 

            			newLeafNode(otherlv_4, grammarAccess.getPlatformStructMemberAccess().getRightParenthesisKeyword_4());
            		
            // InternalUddl.g:9916:3: (otherlv_5= '->' ( ( ruleQN ) ) )?
            int alt196=2;
            int LA196_0 = input.LA(1);

            if ( (LA196_0==94) ) {
                alt196=1;
            }
            switch (alt196) {
                case 1 :
                    // InternalUddl.g:9917:4: otherlv_5= '->' ( ( ruleQN ) )
                    {
                    otherlv_5=(Token)match(input,94,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getPlatformStructMemberAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                    			
                    // InternalUddl.g:9921:4: ( ( ruleQN ) )
                    // InternalUddl.g:9922:5: ( ruleQN )
                    {
                    // InternalUddl.g:9922:5: ( ruleQN )
                    // InternalUddl.g:9923:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformStructMemberRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformStructMemberAccess().getRealizesLogicalMeasurementAttributeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPlatformStructMemberAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "rulePlatformStructMember"


    // $ANTLR start "entryRulePlatformEntity"
    // InternalUddl.g:9946:1: entryRulePlatformEntity returns [EObject current=null] : iv_rulePlatformEntity= rulePlatformEntity EOF ;
    public final EObject entryRulePlatformEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformEntity = null;


        try {
            // InternalUddl.g:9946:55: (iv_rulePlatformEntity= rulePlatformEntity EOF )
            // InternalUddl.g:9947:2: iv_rulePlatformEntity= rulePlatformEntity EOF
            {
             newCompositeNode(grammarAccess.getPlatformEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformEntity=rulePlatformEntity();

            state._fsp--;

             current =iv_rulePlatformEntity; 
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
    // $ANTLR end "entryRulePlatformEntity"


    // $ANTLR start "rulePlatformEntity"
    // InternalUddl.g:9953:1: rulePlatformEntity returns [EObject current=null] : ( (otherlv_0= 'pentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* otherlv_9= '};' ) | this_PlatformAssociation_10= rulePlatformAssociation ) ;
    public final EObject rulePlatformEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_composition_8_0 = null;

        EObject this_PlatformAssociation_10 = null;



        	enterRule();

        try {
            // InternalUddl.g:9959:2: ( ( (otherlv_0= 'pentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* otherlv_9= '};' ) | this_PlatformAssociation_10= rulePlatformAssociation ) )
            // InternalUddl.g:9960:2: ( (otherlv_0= 'pentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* otherlv_9= '};' ) | this_PlatformAssociation_10= rulePlatformAssociation )
            {
            // InternalUddl.g:9960:2: ( (otherlv_0= 'pentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* otherlv_9= '};' ) | this_PlatformAssociation_10= rulePlatformAssociation )
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( (LA200_0==122) ) {
                alt200=1;
            }
            else if ( (LA200_0==124) ) {
                alt200=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 200, 0, input);

                throw nvae;
            }
            switch (alt200) {
                case 1 :
                    // InternalUddl.g:9961:3: (otherlv_0= 'pentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* otherlv_9= '};' )
                    {
                    // InternalUddl.g:9961:3: (otherlv_0= 'pentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* otherlv_9= '};' )
                    // InternalUddl.g:9962:4: otherlv_0= 'pentity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* otherlv_9= '};'
                    {
                    otherlv_0=(Token)match(input,122,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getPlatformEntityAccess().getPentityKeyword_0_0());
                    			
                    // InternalUddl.g:9966:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalUddl.g:9967:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUddl.g:9967:5: (lv_name_1_0= RULE_ID )
                    // InternalUddl.g:9968:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_95); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getPlatformEntityAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalUddl.g:9984:4: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt197=2;
                    int LA197_0 = input.LA(1);

                    if ( (LA197_0==RULE_STRING) ) {
                        alt197=1;
                    }
                    switch (alt197) {
                        case 1 :
                            // InternalUddl.g:9985:5: (lv_description_2_0= RULE_STRING )
                            {
                            // InternalUddl.g:9985:5: (lv_description_2_0= RULE_STRING )
                            // InternalUddl.g:9986:6: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_96); 

                            						newLeafNode(lv_description_2_0, grammarAccess.getPlatformEntityAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPlatformEntityRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"description",
                            							lv_description_2_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }

                    // InternalUddl.g:10002:4: (otherlv_3= ':' ( ( ruleQN ) ) )?
                    int alt198=2;
                    int LA198_0 = input.LA(1);

                    if ( (LA198_0==32) ) {
                        alt198=1;
                    }
                    switch (alt198) {
                        case 1 :
                            // InternalUddl.g:10003:5: otherlv_3= ':' ( ( ruleQN ) )
                            {
                            otherlv_3=(Token)match(input,32,FOLLOW_4); 

                            					newLeafNode(otherlv_3, grammarAccess.getPlatformEntityAccess().getColonKeyword_0_3_0());
                            				
                            // InternalUddl.g:10007:5: ( ( ruleQN ) )
                            // InternalUddl.g:10008:6: ( ruleQN )
                            {
                            // InternalUddl.g:10008:6: ( ruleQN )
                            // InternalUddl.g:10009:7: ruleQN
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPlatformEntityRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getPlatformEntityAccess().getSpecializesPlatformEntityCrossReference_0_3_1_0());
                            						
                            pushFollow(FOLLOW_88);
                            ruleQN();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,94,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getPlatformEntityAccess().getHyphenMinusGreaterThanSignKeyword_0_4());
                    			
                    // InternalUddl.g:10028:4: ( ( ruleQN ) )
                    // InternalUddl.g:10029:5: ( ruleQN )
                    {
                    // InternalUddl.g:10029:5: ( ruleQN )
                    // InternalUddl.g:10030:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformEntityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformEntityAccess().getRealizesLogicalEntityCrossReference_0_5_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_43); 

                    				newLeafNode(otherlv_7, grammarAccess.getPlatformEntityAccess().getLeftCurlyBracketKeyword_0_6());
                    			
                    // InternalUddl.g:10048:4: ( (lv_composition_8_0= rulePlatformComposition ) )*
                    loop199:
                    do {
                        int alt199=2;
                        int LA199_0 = input.LA(1);

                        if ( (LA199_0==RULE_ID) ) {
                            alt199=1;
                        }


                        switch (alt199) {
                    	case 1 :
                    	    // InternalUddl.g:10049:5: (lv_composition_8_0= rulePlatformComposition )
                    	    {
                    	    // InternalUddl.g:10049:5: (lv_composition_8_0= rulePlatformComposition )
                    	    // InternalUddl.g:10050:6: lv_composition_8_0= rulePlatformComposition
                    	    {

                    	    						newCompositeNode(grammarAccess.getPlatformEntityAccess().getCompositionPlatformCompositionParserRuleCall_0_7_0());
                    	    					
                    	    pushFollow(FOLLOW_43);
                    	    lv_composition_8_0=rulePlatformComposition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPlatformEntityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"composition",
                    	    							lv_composition_8_0,
                    	    							"com.epistimis.uddl.Uddl.PlatformComposition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop199;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getPlatformEntityAccess().getRightCurlyBracketSemicolonKeyword_0_8());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUddl.g:10073:3: this_PlatformAssociation_10= rulePlatformAssociation
                    {

                    			newCompositeNode(grammarAccess.getPlatformEntityAccess().getPlatformAssociationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformAssociation_10=rulePlatformAssociation();

                    state._fsp--;


                    			current = this_PlatformAssociation_10;
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
    // $ANTLR end "rulePlatformEntity"


    // $ANTLR start "entryRulePlatformComposition"
    // InternalUddl.g:10085:1: entryRulePlatformComposition returns [EObject current=null] : iv_rulePlatformComposition= rulePlatformComposition EOF ;
    public final EObject entryRulePlatformComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformComposition = null;


        try {
            // InternalUddl.g:10085:60: (iv_rulePlatformComposition= rulePlatformComposition EOF )
            // InternalUddl.g:10086:2: iv_rulePlatformComposition= rulePlatformComposition EOF
            {
             newCompositeNode(grammarAccess.getPlatformCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformComposition=rulePlatformComposition();

            state._fsp--;

             current =iv_rulePlatformComposition; 
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
    // $ANTLR end "entryRulePlatformComposition"


    // $ANTLR start "rulePlatformComposition"
    // InternalUddl.g:10092:1: rulePlatformComposition returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) (otherlv_12= '{' otherlv_13= 'prec:' ( (lv_precision_14_0= RULE_FLOAT ) ) otherlv_15= '}' )? otherlv_16= ';' ) ;
    public final EObject rulePlatformComposition() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_1=null;
        Token lv_upperBound_5_2=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_precision_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalUddl.g:10098:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) (otherlv_12= '{' otherlv_13= 'prec:' ( (lv_precision_14_0= RULE_FLOAT ) ) otherlv_15= '}' )? otherlv_16= ';' ) )
            // InternalUddl.g:10099:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) (otherlv_12= '{' otherlv_13= 'prec:' ( (lv_precision_14_0= RULE_FLOAT ) ) otherlv_15= '}' )? otherlv_16= ';' )
            {
            // InternalUddl.g:10099:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) (otherlv_12= '{' otherlv_13= 'prec:' ( (lv_precision_14_0= RULE_FLOAT ) ) otherlv_15= '}' )? otherlv_16= ';' )
            // InternalUddl.g:10100:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) (otherlv_12= '{' otherlv_13= 'prec:' ( (lv_precision_14_0= RULE_FLOAT ) ) otherlv_15= '}' )? otherlv_16= ';'
            {
            // InternalUddl.g:10100:3: ( ( ruleQN ) )
            // InternalUddl.g:10101:4: ( ruleQN )
            {
            // InternalUddl.g:10101:4: ( ruleQN )
            // InternalUddl.g:10102:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformCompositionAccess().getTypePlatformComposableElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:10116:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:10117:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:10117:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:10118:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_97); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getPlatformCompositionAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:10134:3: (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )?
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( (LA202_0==28) ) {
                alt202=1;
            }
            switch (alt202) {
                case 1 :
                    // InternalUddl.g:10135:4: otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getPlatformCompositionAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalUddl.g:10139:4: ( (lv_lowerBound_3_0= RULE_INT ) )
                    // InternalUddl.g:10140:5: (lv_lowerBound_3_0= RULE_INT )
                    {
                    // InternalUddl.g:10140:5: (lv_lowerBound_3_0= RULE_INT )
                    // InternalUddl.g:10141:6: lv_lowerBound_3_0= RULE_INT
                    {
                    lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_lowerBound_3_0, grammarAccess.getPlatformCompositionAccess().getLowerBoundINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformCompositionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getPlatformCompositionAccess().getColonKeyword_2_2());
                    			
                    // InternalUddl.g:10161:4: ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )
                    // InternalUddl.g:10162:5: ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) )
                    {
                    // InternalUddl.g:10162:5: ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) )
                    // InternalUddl.g:10163:6: (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT )
                    {
                    // InternalUddl.g:10163:6: (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT )
                    int alt201=2;
                    int LA201_0 = input.LA(1);

                    if ( (LA201_0==RULE_INT) ) {
                        alt201=1;
                    }
                    else if ( (LA201_0==RULE_SIGNED_INT) ) {
                        alt201=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 201, 0, input);

                        throw nvae;
                    }
                    switch (alt201) {
                        case 1 :
                            // InternalUddl.g:10164:7: lv_upperBound_5_1= RULE_INT
                            {
                            lv_upperBound_5_1=(Token)match(input,RULE_INT,FOLLOW_27); 

                            							newLeafNode(lv_upperBound_5_1, grammarAccess.getPlatformCompositionAccess().getUpperBoundINTTerminalRuleCall_2_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPlatformCompositionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"upperBound",
                            								lv_upperBound_5_1,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }
                            break;
                        case 2 :
                            // InternalUddl.g:10179:7: lv_upperBound_5_2= RULE_SIGNED_INT
                            {
                            lv_upperBound_5_2=(Token)match(input,RULE_SIGNED_INT,FOLLOW_27); 

                            							newLeafNode(lv_upperBound_5_2, grammarAccess.getPlatformCompositionAccess().getUpperBoundSIGNED_INTTerminalRuleCall_2_3_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPlatformCompositionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"upperBound",
                            								lv_upperBound_5_2,
                            								"com.epistimis.uddl.Uddl.SIGNED_INT");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_95); 

                    				newLeafNode(otherlv_6, grammarAccess.getPlatformCompositionAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalUddl.g:10201:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt203=2;
            int LA203_0 = input.LA(1);

            if ( (LA203_0==RULE_STRING) ) {
                alt203=1;
            }
            switch (alt203) {
                case 1 :
                    // InternalUddl.g:10202:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:10202:4: (lv_description_7_0= RULE_STRING )
                    // InternalUddl.g:10203:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_96); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getPlatformCompositionAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformCompositionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:10219:3: (otherlv_8= ':' ( ( ruleQN ) ) )?
            int alt204=2;
            int LA204_0 = input.LA(1);

            if ( (LA204_0==32) ) {
                alt204=1;
            }
            switch (alt204) {
                case 1 :
                    // InternalUddl.g:10220:4: otherlv_8= ':' ( ( ruleQN ) )
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getPlatformCompositionAccess().getColonKeyword_4_0());
                    			
                    // InternalUddl.g:10224:4: ( ( ruleQN ) )
                    // InternalUddl.g:10225:5: ( ruleQN )
                    {
                    // InternalUddl.g:10225:5: ( ruleQN )
                    // InternalUddl.g:10226:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformCompositionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformCompositionAccess().getSpecializesPlatformCharacteristicCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_88);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getPlatformCompositionAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalUddl.g:10245:3: ( ( ruleQN ) )
            // InternalUddl.g:10246:4: ( ruleQN )
            {
            // InternalUddl.g:10246:4: ( ruleQN )
            // InternalUddl.g:10247:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformCompositionAccess().getRealizesLogicalCompositionCrossReference_6_0());
            				
            pushFollow(FOLLOW_77);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:10261:3: (otherlv_12= '{' otherlv_13= 'prec:' ( (lv_precision_14_0= RULE_FLOAT ) ) otherlv_15= '}' )?
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( (LA205_0==17) ) {
                alt205=1;
            }
            switch (alt205) {
                case 1 :
                    // InternalUddl.g:10262:4: otherlv_12= '{' otherlv_13= 'prec:' ( (lv_precision_14_0= RULE_FLOAT ) ) otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_104); 

                    				newLeafNode(otherlv_12, grammarAccess.getPlatformCompositionAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,123,FOLLOW_47); 

                    				newLeafNode(otherlv_13, grammarAccess.getPlatformCompositionAccess().getPrecKeyword_7_1());
                    			
                    // InternalUddl.g:10270:4: ( (lv_precision_14_0= RULE_FLOAT ) )
                    // InternalUddl.g:10271:5: (lv_precision_14_0= RULE_FLOAT )
                    {
                    // InternalUddl.g:10271:5: (lv_precision_14_0= RULE_FLOAT )
                    // InternalUddl.g:10272:6: lv_precision_14_0= RULE_FLOAT
                    {
                    lv_precision_14_0=(Token)match(input,RULE_FLOAT,FOLLOW_38); 

                    						newLeafNode(lv_precision_14_0, grammarAccess.getPlatformCompositionAccess().getPrecisionFLOATTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformCompositionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"precision",
                    							lv_precision_14_0,
                    							"com.epistimis.uddl.Uddl.FLOAT");
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getPlatformCompositionAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getPlatformCompositionAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "rulePlatformComposition"


    // $ANTLR start "entryRulePlatformAssociation"
    // InternalUddl.g:10301:1: entryRulePlatformAssociation returns [EObject current=null] : iv_rulePlatformAssociation= rulePlatformAssociation EOF ;
    public final EObject entryRulePlatformAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformAssociation = null;


        try {
            // InternalUddl.g:10301:60: (iv_rulePlatformAssociation= rulePlatformAssociation EOF )
            // InternalUddl.g:10302:2: iv_rulePlatformAssociation= rulePlatformAssociation EOF
            {
             newCompositeNode(grammarAccess.getPlatformAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformAssociation=rulePlatformAssociation();

            state._fsp--;

             current =iv_rulePlatformAssociation; 
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
    // $ANTLR end "entryRulePlatformAssociation"


    // $ANTLR start "rulePlatformAssociation"
    // InternalUddl.g:10308:1: rulePlatformAssociation returns [EObject current=null] : (otherlv_0= 'passoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= rulePlatformParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' ) ;
    public final EObject rulePlatformAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_composition_8_0 = null;

        EObject lv_participant_11_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:10314:2: ( (otherlv_0= 'passoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= rulePlatformParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' ) )
            // InternalUddl.g:10315:2: (otherlv_0= 'passoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= rulePlatformParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' )
            {
            // InternalUddl.g:10315:2: (otherlv_0= 'passoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= rulePlatformParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};' )
            // InternalUddl.g:10316:3: otherlv_0= 'passoc' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= ':' ( ( ruleQN ) ) )? otherlv_5= '->' ( ( ruleQN ) ) otherlv_7= '{' ( (lv_composition_8_0= rulePlatformComposition ) )* (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= rulePlatformParticipant ) )+ otherlv_12= ']' )? otherlv_13= '};'
            {
            otherlv_0=(Token)match(input,124,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformAssociationAccess().getPassocKeyword_0());
            		
            // InternalUddl.g:10320:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:10321:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:10321:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:10322:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_95); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformAssociationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformAssociationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:10338:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt206=2;
            int LA206_0 = input.LA(1);

            if ( (LA206_0==RULE_STRING) ) {
                alt206=1;
            }
            switch (alt206) {
                case 1 :
                    // InternalUddl.g:10339:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:10339:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:10340:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_96); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformAssociationAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformAssociationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:10356:3: (otherlv_3= ':' ( ( ruleQN ) ) )?
            int alt207=2;
            int LA207_0 = input.LA(1);

            if ( (LA207_0==32) ) {
                alt207=1;
            }
            switch (alt207) {
                case 1 :
                    // InternalUddl.g:10357:4: otherlv_3= ':' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlatformAssociationAccess().getColonKeyword_3_0());
                    			
                    // InternalUddl.g:10361:4: ( ( ruleQN ) )
                    // InternalUddl.g:10362:5: ( ruleQN )
                    {
                    // InternalUddl.g:10362:5: ( ruleQN )
                    // InternalUddl.g:10363:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformAssociationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformAssociationAccess().getSpecializesPlatformEntityCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_88);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformAssociationAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalUddl.g:10382:3: ( ( ruleQN ) )
            // InternalUddl.g:10383:4: ( ruleQN )
            {
            // InternalUddl.g:10383:4: ( ruleQN )
            // InternalUddl.g:10384:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformAssociationAccess().getRealizesLogicalEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_6);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_98); 

            			newLeafNode(otherlv_7, grammarAccess.getPlatformAssociationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalUddl.g:10402:3: ( (lv_composition_8_0= rulePlatformComposition ) )*
            loop208:
            do {
                int alt208=2;
                int LA208_0 = input.LA(1);

                if ( (LA208_0==RULE_ID) ) {
                    alt208=1;
                }


                switch (alt208) {
            	case 1 :
            	    // InternalUddl.g:10403:4: (lv_composition_8_0= rulePlatformComposition )
            	    {
            	    // InternalUddl.g:10403:4: (lv_composition_8_0= rulePlatformComposition )
            	    // InternalUddl.g:10404:5: lv_composition_8_0= rulePlatformComposition
            	    {

            	    					newCompositeNode(grammarAccess.getPlatformAssociationAccess().getCompositionPlatformCompositionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_98);
            	    lv_composition_8_0=rulePlatformComposition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPlatformAssociationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"composition",
            	    						lv_composition_8_0,
            	    						"com.epistimis.uddl.Uddl.PlatformComposition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop208;
                }
            } while (true);

            // InternalUddl.g:10421:3: (otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= rulePlatformParticipant ) )+ otherlv_12= ']' )?
            int alt210=2;
            int LA210_0 = input.LA(1);

            if ( (LA210_0==36) ) {
                alt210=1;
            }
            switch (alt210) {
                case 1 :
                    // InternalUddl.g:10422:4: otherlv_9= 'participants:' otherlv_10= '[' ( (lv_participant_11_0= rulePlatformParticipant ) )+ otherlv_12= ']'
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getPlatformAssociationAccess().getParticipantsKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getPlatformAssociationAccess().getLeftSquareBracketKeyword_8_1());
                    			
                    // InternalUddl.g:10430:4: ( (lv_participant_11_0= rulePlatformParticipant ) )+
                    int cnt209=0;
                    loop209:
                    do {
                        int alt209=2;
                        int LA209_0 = input.LA(1);

                        if ( (LA209_0==RULE_ID) ) {
                            alt209=1;
                        }


                        switch (alt209) {
                    	case 1 :
                    	    // InternalUddl.g:10431:5: (lv_participant_11_0= rulePlatformParticipant )
                    	    {
                    	    // InternalUddl.g:10431:5: (lv_participant_11_0= rulePlatformParticipant )
                    	    // InternalUddl.g:10432:6: lv_participant_11_0= rulePlatformParticipant
                    	    {

                    	    						newCompositeNode(grammarAccess.getPlatformAssociationAccess().getParticipantPlatformParticipantParserRuleCall_8_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_participant_11_0=rulePlatformParticipant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPlatformAssociationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"participant",
                    	    							lv_participant_11_0,
                    	    							"com.epistimis.uddl.Uddl.PlatformParticipant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt209 >= 1 ) break loop209;
                                EarlyExitException eee =
                                    new EarlyExitException(209, input);
                                throw eee;
                        }
                        cnt209++;
                    } while (true);

                    otherlv_12=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getPlatformAssociationAccess().getRightSquareBracketKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPlatformAssociationAccess().getRightCurlyBracketSemicolonKeyword_9());
            		

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
    // $ANTLR end "rulePlatformAssociation"


    // $ANTLR start "entryRulePlatformParticipant"
    // InternalUddl.g:10462:1: entryRulePlatformParticipant returns [EObject current=null] : iv_rulePlatformParticipant= rulePlatformParticipant EOF ;
    public final EObject entryRulePlatformParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformParticipant = null;


        try {
            // InternalUddl.g:10462:60: (iv_rulePlatformParticipant= rulePlatformParticipant EOF )
            // InternalUddl.g:10463:2: iv_rulePlatformParticipant= rulePlatformParticipant EOF
            {
             newCompositeNode(grammarAccess.getPlatformParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformParticipant=rulePlatformParticipant();

            state._fsp--;

             current =iv_rulePlatformParticipant; 
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
    // $ANTLR end "entryRulePlatformParticipant"


    // $ANTLR start "rulePlatformParticipant"
    // InternalUddl.g:10469:1: rulePlatformParticipant returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= rulePlatformPathNode ) ) )? otherlv_21= '};' ) ;
    public final EObject rulePlatformParticipant() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_1=null;
        Token lv_upperBound_5_2=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_sourceLowerBound_15_0=null;
        Token otherlv_16=null;
        Token lv_sourceUpperBound_17_1=null;
        Token lv_sourceUpperBound_17_2=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_path_20_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:10475:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= rulePlatformPathNode ) ) )? otherlv_21= '};' ) )
            // InternalUddl.g:10476:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= rulePlatformPathNode ) ) )? otherlv_21= '};' )
            {
            // InternalUddl.g:10476:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= rulePlatformPathNode ) ) )? otherlv_21= '};' )
            // InternalUddl.g:10477:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? (otherlv_8= ':' ( ( ruleQN ) ) )? otherlv_10= '->' ( ( ruleQN ) ) otherlv_12= '{' otherlv_13= 'source:' otherlv_14= '[' ( (lv_sourceLowerBound_15_0= RULE_INT ) ) otherlv_16= ':' ( ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) ) ) otherlv_18= ']' (otherlv_19= 'path:' ( (lv_path_20_0= rulePlatformPathNode ) ) )? otherlv_21= '};'
            {
            // InternalUddl.g:10477:3: ( ( ruleQN ) )
            // InternalUddl.g:10478:4: ( ruleQN )
            {
            // InternalUddl.g:10478:4: ( ruleQN )
            // InternalUddl.g:10479:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformParticipantAccess().getTypePlatformEntityCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:10493:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:10494:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:10494:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:10495:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_97); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getPlatformParticipantAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:10511:3: (otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']' )?
            int alt212=2;
            int LA212_0 = input.LA(1);

            if ( (LA212_0==28) ) {
                alt212=1;
            }
            switch (alt212) {
                case 1 :
                    // InternalUddl.g:10512:4: otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ':' ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getPlatformParticipantAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalUddl.g:10516:4: ( (lv_lowerBound_3_0= RULE_INT ) )
                    // InternalUddl.g:10517:5: (lv_lowerBound_3_0= RULE_INT )
                    {
                    // InternalUddl.g:10517:5: (lv_lowerBound_3_0= RULE_INT )
                    // InternalUddl.g:10518:6: lv_lowerBound_3_0= RULE_INT
                    {
                    lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_lowerBound_3_0, grammarAccess.getPlatformParticipantAccess().getLowerBoundINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformParticipantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getPlatformParticipantAccess().getColonKeyword_2_2());
                    			
                    // InternalUddl.g:10538:4: ( ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) ) )
                    // InternalUddl.g:10539:5: ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) )
                    {
                    // InternalUddl.g:10539:5: ( (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT ) )
                    // InternalUddl.g:10540:6: (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT )
                    {
                    // InternalUddl.g:10540:6: (lv_upperBound_5_1= RULE_INT | lv_upperBound_5_2= RULE_SIGNED_INT )
                    int alt211=2;
                    int LA211_0 = input.LA(1);

                    if ( (LA211_0==RULE_INT) ) {
                        alt211=1;
                    }
                    else if ( (LA211_0==RULE_SIGNED_INT) ) {
                        alt211=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 211, 0, input);

                        throw nvae;
                    }
                    switch (alt211) {
                        case 1 :
                            // InternalUddl.g:10541:7: lv_upperBound_5_1= RULE_INT
                            {
                            lv_upperBound_5_1=(Token)match(input,RULE_INT,FOLLOW_27); 

                            							newLeafNode(lv_upperBound_5_1, grammarAccess.getPlatformParticipantAccess().getUpperBoundINTTerminalRuleCall_2_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPlatformParticipantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"upperBound",
                            								lv_upperBound_5_1,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }
                            break;
                        case 2 :
                            // InternalUddl.g:10556:7: lv_upperBound_5_2= RULE_SIGNED_INT
                            {
                            lv_upperBound_5_2=(Token)match(input,RULE_SIGNED_INT,FOLLOW_27); 

                            							newLeafNode(lv_upperBound_5_2, grammarAccess.getPlatformParticipantAccess().getUpperBoundSIGNED_INTTerminalRuleCall_2_3_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPlatformParticipantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"upperBound",
                            								lv_upperBound_5_2,
                            								"com.epistimis.uddl.Uddl.SIGNED_INT");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_95); 

                    				newLeafNode(otherlv_6, grammarAccess.getPlatformParticipantAccess().getRightSquareBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalUddl.g:10578:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt213=2;
            int LA213_0 = input.LA(1);

            if ( (LA213_0==RULE_STRING) ) {
                alt213=1;
            }
            switch (alt213) {
                case 1 :
                    // InternalUddl.g:10579:4: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalUddl.g:10579:4: (lv_description_7_0= RULE_STRING )
                    // InternalUddl.g:10580:5: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_96); 

                    					newLeafNode(lv_description_7_0, grammarAccess.getPlatformParticipantAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformParticipantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:10596:3: (otherlv_8= ':' ( ( ruleQN ) ) )?
            int alt214=2;
            int LA214_0 = input.LA(1);

            if ( (LA214_0==32) ) {
                alt214=1;
            }
            switch (alt214) {
                case 1 :
                    // InternalUddl.g:10597:4: otherlv_8= ':' ( ( ruleQN ) )
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getPlatformParticipantAccess().getColonKeyword_4_0());
                    			
                    // InternalUddl.g:10601:4: ( ( ruleQN ) )
                    // InternalUddl.g:10602:5: ( ruleQN )
                    {
                    // InternalUddl.g:10602:5: ( ruleQN )
                    // InternalUddl.g:10603:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformParticipantRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformParticipantAccess().getSpecializesPlatformCharacteristicCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_88);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getPlatformParticipantAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalUddl.g:10622:3: ( ( ruleQN ) )
            // InternalUddl.g:10623:4: ( ruleQN )
            {
            // InternalUddl.g:10623:4: ( ruleQN )
            // InternalUddl.g:10624:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformParticipantRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformParticipantAccess().getRealizesLogicalParticipantCrossReference_6_0());
            				
            pushFollow(FOLLOW_6);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_99); 

            			newLeafNode(otherlv_12, grammarAccess.getPlatformParticipantAccess().getLeftCurlyBracketKeyword_7());
            		
            otherlv_13=(Token)match(input,101,FOLLOW_21); 

            			newLeafNode(otherlv_13, grammarAccess.getPlatformParticipantAccess().getSourceKeyword_8());
            		
            otherlv_14=(Token)match(input,28,FOLLOW_34); 

            			newLeafNode(otherlv_14, grammarAccess.getPlatformParticipantAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalUddl.g:10650:3: ( (lv_sourceLowerBound_15_0= RULE_INT ) )
            // InternalUddl.g:10651:4: (lv_sourceLowerBound_15_0= RULE_INT )
            {
            // InternalUddl.g:10651:4: (lv_sourceLowerBound_15_0= RULE_INT )
            // InternalUddl.g:10652:5: lv_sourceLowerBound_15_0= RULE_INT
            {
            lv_sourceLowerBound_15_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_sourceLowerBound_15_0, grammarAccess.getPlatformParticipantAccess().getSourceLowerBoundINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformParticipantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceLowerBound",
            						lv_sourceLowerBound_15_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_16=(Token)match(input,32,FOLLOW_35); 

            			newLeafNode(otherlv_16, grammarAccess.getPlatformParticipantAccess().getColonKeyword_11());
            		
            // InternalUddl.g:10672:3: ( ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) ) )
            // InternalUddl.g:10673:4: ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) )
            {
            // InternalUddl.g:10673:4: ( (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT ) )
            // InternalUddl.g:10674:5: (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT )
            {
            // InternalUddl.g:10674:5: (lv_sourceUpperBound_17_1= RULE_INT | lv_sourceUpperBound_17_2= RULE_SIGNED_INT )
            int alt215=2;
            int LA215_0 = input.LA(1);

            if ( (LA215_0==RULE_INT) ) {
                alt215=1;
            }
            else if ( (LA215_0==RULE_SIGNED_INT) ) {
                alt215=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 215, 0, input);

                throw nvae;
            }
            switch (alt215) {
                case 1 :
                    // InternalUddl.g:10675:6: lv_sourceUpperBound_17_1= RULE_INT
                    {
                    lv_sourceUpperBound_17_1=(Token)match(input,RULE_INT,FOLLOW_27); 

                    						newLeafNode(lv_sourceUpperBound_17_1, grammarAccess.getPlatformParticipantAccess().getSourceUpperBoundINTTerminalRuleCall_12_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformParticipantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sourceUpperBound",
                    							lv_sourceUpperBound_17_1,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }
                    break;
                case 2 :
                    // InternalUddl.g:10690:6: lv_sourceUpperBound_17_2= RULE_SIGNED_INT
                    {
                    lv_sourceUpperBound_17_2=(Token)match(input,RULE_SIGNED_INT,FOLLOW_27); 

                    						newLeafNode(lv_sourceUpperBound_17_2, grammarAccess.getPlatformParticipantAccess().getSourceUpperBoundSIGNED_INTTerminalRuleCall_12_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformParticipantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sourceUpperBound",
                    							lv_sourceUpperBound_17_2,
                    							"com.epistimis.uddl.Uddl.SIGNED_INT");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_18=(Token)match(input,29,FOLLOW_100); 

            			newLeafNode(otherlv_18, grammarAccess.getPlatformParticipantAccess().getRightSquareBracketKeyword_13());
            		
            // InternalUddl.g:10711:3: (otherlv_19= 'path:' ( (lv_path_20_0= rulePlatformPathNode ) ) )?
            int alt216=2;
            int LA216_0 = input.LA(1);

            if ( (LA216_0==38) ) {
                alt216=1;
            }
            switch (alt216) {
                case 1 :
                    // InternalUddl.g:10712:4: otherlv_19= 'path:' ( (lv_path_20_0= rulePlatformPathNode ) )
                    {
                    otherlv_19=(Token)match(input,38,FOLLOW_37); 

                    				newLeafNode(otherlv_19, grammarAccess.getPlatformParticipantAccess().getPathKeyword_14_0());
                    			
                    // InternalUddl.g:10716:4: ( (lv_path_20_0= rulePlatformPathNode ) )
                    // InternalUddl.g:10717:5: (lv_path_20_0= rulePlatformPathNode )
                    {
                    // InternalUddl.g:10717:5: (lv_path_20_0= rulePlatformPathNode )
                    // InternalUddl.g:10718:6: lv_path_20_0= rulePlatformPathNode
                    {

                    						newCompositeNode(grammarAccess.getPlatformParticipantAccess().getPathPlatformPathNodeParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_path_20_0=rulePlatformPathNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlatformParticipantRule());
                    						}
                    						set(
                    							current,
                    							"path",
                    							lv_path_20_0,
                    							"com.epistimis.uddl.Uddl.PlatformPathNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getPlatformParticipantAccess().getRightCurlyBracketSemicolonKeyword_15());
            		

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
    // $ANTLR end "rulePlatformParticipant"


    // $ANTLR start "entryRulePlatformPathNode"
    // InternalUddl.g:10744:1: entryRulePlatformPathNode returns [EObject current=null] : iv_rulePlatformPathNode= rulePlatformPathNode EOF ;
    public final EObject entryRulePlatformPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformPathNode = null;


        try {
            // InternalUddl.g:10744:57: (iv_rulePlatformPathNode= rulePlatformPathNode EOF )
            // InternalUddl.g:10745:2: iv_rulePlatformPathNode= rulePlatformPathNode EOF
            {
             newCompositeNode(grammarAccess.getPlatformPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformPathNode=rulePlatformPathNode();

            state._fsp--;

             current =iv_rulePlatformPathNode; 
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
    // $ANTLR end "entryRulePlatformPathNode"


    // $ANTLR start "rulePlatformPathNode"
    // InternalUddl.g:10751:1: rulePlatformPathNode returns [EObject current=null] : (this_PlatformParticipantPathNode_0= rulePlatformParticipantPathNode | this_PlatformCharacteristicPathNode_1= rulePlatformCharacteristicPathNode ) ;
    public final EObject rulePlatformPathNode() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformParticipantPathNode_0 = null;

        EObject this_PlatformCharacteristicPathNode_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:10757:2: ( (this_PlatformParticipantPathNode_0= rulePlatformParticipantPathNode | this_PlatformCharacteristicPathNode_1= rulePlatformCharacteristicPathNode ) )
            // InternalUddl.g:10758:2: (this_PlatformParticipantPathNode_0= rulePlatformParticipantPathNode | this_PlatformCharacteristicPathNode_1= rulePlatformCharacteristicPathNode )
            {
            // InternalUddl.g:10758:2: (this_PlatformParticipantPathNode_0= rulePlatformParticipantPathNode | this_PlatformCharacteristicPathNode_1= rulePlatformCharacteristicPathNode )
            int alt217=2;
            int LA217_0 = input.LA(1);

            if ( (LA217_0==39) ) {
                alt217=1;
            }
            else if ( (LA217_0==40) ) {
                alt217=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 217, 0, input);

                throw nvae;
            }
            switch (alt217) {
                case 1 :
                    // InternalUddl.g:10759:3: this_PlatformParticipantPathNode_0= rulePlatformParticipantPathNode
                    {

                    			newCompositeNode(grammarAccess.getPlatformPathNodeAccess().getPlatformParticipantPathNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformParticipantPathNode_0=rulePlatformParticipantPathNode();

                    state._fsp--;


                    			current = this_PlatformParticipantPathNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:10768:3: this_PlatformCharacteristicPathNode_1= rulePlatformCharacteristicPathNode
                    {

                    			newCompositeNode(grammarAccess.getPlatformPathNodeAccess().getPlatformCharacteristicPathNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformCharacteristicPathNode_1=rulePlatformCharacteristicPathNode();

                    state._fsp--;


                    			current = this_PlatformCharacteristicPathNode_1;
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
    // $ANTLR end "rulePlatformPathNode"


    // $ANTLR start "entryRulePlatformParticipantPathNode"
    // InternalUddl.g:10780:1: entryRulePlatformParticipantPathNode returns [EObject current=null] : iv_rulePlatformParticipantPathNode= rulePlatformParticipantPathNode EOF ;
    public final EObject entryRulePlatformParticipantPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformParticipantPathNode = null;


        try {
            // InternalUddl.g:10780:68: (iv_rulePlatformParticipantPathNode= rulePlatformParticipantPathNode EOF )
            // InternalUddl.g:10781:2: iv_rulePlatformParticipantPathNode= rulePlatformParticipantPathNode EOF
            {
             newCompositeNode(grammarAccess.getPlatformParticipantPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformParticipantPathNode=rulePlatformParticipantPathNode();

            state._fsp--;

             current =iv_rulePlatformParticipantPathNode; 
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
    // $ANTLR end "entryRulePlatformParticipantPathNode"


    // $ANTLR start "rulePlatformParticipantPathNode"
    // InternalUddl.g:10787:1: rulePlatformParticipantPathNode returns [EObject current=null] : (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) ) ;
    public final EObject rulePlatformParticipantPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:10793:2: ( (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) ) )
            // InternalUddl.g:10794:2: (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) )
            {
            // InternalUddl.g:10794:2: (otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) )
            // InternalUddl.g:10795:3: otherlv_0= '/' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformParticipantPathNodeAccess().getSolidusKeyword_0());
            		
            // InternalUddl.g:10799:3: ( ( ruleQN ) )
            // InternalUddl.g:10800:4: ( ruleQN )
            {
            // InternalUddl.g:10800:4: ( ruleQN )
            // InternalUddl.g:10801:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformParticipantPathNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformParticipantPathNodeAccess().getProjectedParticipantPlatformParticipantCrossReference_1_0());
            				
            pushFollow(FOLLOW_37);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:10815:3: ( (lv_node_2_0= rulePlatformPathNode ) )
            // InternalUddl.g:10816:4: (lv_node_2_0= rulePlatformPathNode )
            {
            // InternalUddl.g:10816:4: (lv_node_2_0= rulePlatformPathNode )
            // InternalUddl.g:10817:5: lv_node_2_0= rulePlatformPathNode
            {

            					newCompositeNode(grammarAccess.getPlatformParticipantPathNodeAccess().getNodePlatformPathNodeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_node_2_0=rulePlatformPathNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformParticipantPathNodeRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_2_0,
            						"com.epistimis.uddl.Uddl.PlatformPathNode");
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
    // $ANTLR end "rulePlatformParticipantPathNode"


    // $ANTLR start "entryRulePlatformCharacteristicPathNode"
    // InternalUddl.g:10838:1: entryRulePlatformCharacteristicPathNode returns [EObject current=null] : iv_rulePlatformCharacteristicPathNode= rulePlatformCharacteristicPathNode EOF ;
    public final EObject entryRulePlatformCharacteristicPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformCharacteristicPathNode = null;


        try {
            // InternalUddl.g:10838:71: (iv_rulePlatformCharacteristicPathNode= rulePlatformCharacteristicPathNode EOF )
            // InternalUddl.g:10839:2: iv_rulePlatformCharacteristicPathNode= rulePlatformCharacteristicPathNode EOF
            {
             newCompositeNode(grammarAccess.getPlatformCharacteristicPathNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformCharacteristicPathNode=rulePlatformCharacteristicPathNode();

            state._fsp--;

             current =iv_rulePlatformCharacteristicPathNode; 
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
    // $ANTLR end "entryRulePlatformCharacteristicPathNode"


    // $ANTLR start "rulePlatformCharacteristicPathNode"
    // InternalUddl.g:10845:1: rulePlatformCharacteristicPathNode returns [EObject current=null] : (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) ) ;
    public final EObject rulePlatformCharacteristicPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:10851:2: ( (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) ) )
            // InternalUddl.g:10852:2: (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) )
            {
            // InternalUddl.g:10852:2: (otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) ) )
            // InternalUddl.g:10853:3: otherlv_0= '#' ( ( ruleQN ) ) ( (lv_node_2_0= rulePlatformPathNode ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformCharacteristicPathNodeAccess().getNumberSignKeyword_0());
            		
            // InternalUddl.g:10857:3: ( ( ruleQN ) )
            // InternalUddl.g:10858:4: ( ruleQN )
            {
            // InternalUddl.g:10858:4: ( ruleQN )
            // InternalUddl.g:10859:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCharacteristicPathNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformCharacteristicPathNodeAccess().getProjectedCharacteristicPlatformCharacteristicCrossReference_1_0());
            				
            pushFollow(FOLLOW_37);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:10873:3: ( (lv_node_2_0= rulePlatformPathNode ) )
            // InternalUddl.g:10874:4: (lv_node_2_0= rulePlatformPathNode )
            {
            // InternalUddl.g:10874:4: (lv_node_2_0= rulePlatformPathNode )
            // InternalUddl.g:10875:5: lv_node_2_0= rulePlatformPathNode
            {

            					newCompositeNode(grammarAccess.getPlatformCharacteristicPathNodeAccess().getNodePlatformPathNodeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_node_2_0=rulePlatformPathNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformCharacteristicPathNodeRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_2_0,
            						"com.epistimis.uddl.Uddl.PlatformPathNode");
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
    // $ANTLR end "rulePlatformCharacteristicPathNode"


    // $ANTLR start "entryRulePlatformView"
    // InternalUddl.g:10896:1: entryRulePlatformView returns [EObject current=null] : iv_rulePlatformView= rulePlatformView EOF ;
    public final EObject entryRulePlatformView() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformView = null;


        try {
            // InternalUddl.g:10896:53: (iv_rulePlatformView= rulePlatformView EOF )
            // InternalUddl.g:10897:2: iv_rulePlatformView= rulePlatformView EOF
            {
             newCompositeNode(grammarAccess.getPlatformViewRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformView=rulePlatformView();

            state._fsp--;

             current =iv_rulePlatformView; 
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
    // $ANTLR end "entryRulePlatformView"


    // $ANTLR start "rulePlatformView"
    // InternalUddl.g:10903:1: rulePlatformView returns [EObject current=null] : (this_PlatformQuery_0= rulePlatformQuery | this_PlatformCompositeQuery_1= rulePlatformCompositeQuery ) ;
    public final EObject rulePlatformView() throws RecognitionException {
        EObject current = null;

        EObject this_PlatformQuery_0 = null;

        EObject this_PlatformCompositeQuery_1 = null;



        	enterRule();

        try {
            // InternalUddl.g:10909:2: ( (this_PlatformQuery_0= rulePlatformQuery | this_PlatformCompositeQuery_1= rulePlatformCompositeQuery ) )
            // InternalUddl.g:10910:2: (this_PlatformQuery_0= rulePlatformQuery | this_PlatformCompositeQuery_1= rulePlatformCompositeQuery )
            {
            // InternalUddl.g:10910:2: (this_PlatformQuery_0= rulePlatformQuery | this_PlatformCompositeQuery_1= rulePlatformCompositeQuery )
            int alt218=2;
            int LA218_0 = input.LA(1);

            if ( (LA218_0==125) ) {
                alt218=1;
            }
            else if ( (LA218_0==126) ) {
                alt218=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 218, 0, input);

                throw nvae;
            }
            switch (alt218) {
                case 1 :
                    // InternalUddl.g:10911:3: this_PlatformQuery_0= rulePlatformQuery
                    {

                    			newCompositeNode(grammarAccess.getPlatformViewAccess().getPlatformQueryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformQuery_0=rulePlatformQuery();

                    state._fsp--;


                    			current = this_PlatformQuery_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUddl.g:10920:3: this_PlatformCompositeQuery_1= rulePlatformCompositeQuery
                    {

                    			newCompositeNode(grammarAccess.getPlatformViewAccess().getPlatformCompositeQueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlatformCompositeQuery_1=rulePlatformCompositeQuery();

                    state._fsp--;


                    			current = this_PlatformCompositeQuery_1;
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
    // $ANTLR end "rulePlatformView"


    // $ANTLR start "entryRulePlatformQuery"
    // InternalUddl.g:10932:1: entryRulePlatformQuery returns [EObject current=null] : iv_rulePlatformQuery= rulePlatformQuery EOF ;
    public final EObject entryRulePlatformQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformQuery = null;


        try {
            // InternalUddl.g:10932:54: (iv_rulePlatformQuery= rulePlatformQuery EOF )
            // InternalUddl.g:10933:2: iv_rulePlatformQuery= rulePlatformQuery EOF
            {
             newCompositeNode(grammarAccess.getPlatformQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformQuery=rulePlatformQuery();

            state._fsp--;

             current =iv_rulePlatformQuery; 
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
    // $ANTLR end "entryRulePlatformQuery"


    // $ANTLR start "rulePlatformQuery"
    // InternalUddl.g:10939:1: rulePlatformQuery returns [EObject current=null] : (otherlv_0= 'pquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' ) ;
    public final EObject rulePlatformQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_specification_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalUddl.g:10945:2: ( (otherlv_0= 'pquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' ) )
            // InternalUddl.g:10946:2: (otherlv_0= 'pquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' )
            {
            // InternalUddl.g:10946:2: (otherlv_0= 'pquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};' )
            // InternalUddl.g:10947:3: otherlv_0= 'pquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' otherlv_6= 'spec:' ( (lv_specification_7_0= RULE_STRING ) ) otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,125,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformQueryAccess().getPqueryKeyword_0());
            		
            // InternalUddl.g:10951:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:10952:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:10952:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:10953:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_91); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:10969:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt219=2;
            int LA219_0 = input.LA(1);

            if ( (LA219_0==RULE_STRING) ) {
                alt219=1;
            }
            switch (alt219) {
                case 1 :
                    // InternalUddl.g:10970:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:10970:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:10971:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformQueryAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformQueryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:10987:3: (otherlv_3= '->' ( ( ruleQN ) ) )?
            int alt220=2;
            int LA220_0 = input.LA(1);

            if ( (LA220_0==94) ) {
                alt220=1;
            }
            switch (alt220) {
                case 1 :
                    // InternalUddl.g:10988:4: otherlv_3= '->' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,94,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlatformQueryAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalUddl.g:10992:4: ( ( ruleQN ) )
                    // InternalUddl.g:10993:5: ( ruleQN )
                    {
                    // InternalUddl.g:10993:5: ( ruleQN )
                    // InternalUddl.g:10994:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformQueryRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformQueryAccess().getRealizesLogicalQueryCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformQueryAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,42,FOLLOW_41); 

            			newLeafNode(otherlv_6, grammarAccess.getPlatformQueryAccess().getSpecKeyword_5());
            		
            // InternalUddl.g:11017:3: ( (lv_specification_7_0= RULE_STRING ) )
            // InternalUddl.g:11018:4: (lv_specification_7_0= RULE_STRING )
            {
            // InternalUddl.g:11018:4: (lv_specification_7_0= RULE_STRING )
            // InternalUddl.g:11019:5: lv_specification_7_0= RULE_STRING
            {
            lv_specification_7_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_specification_7_0, grammarAccess.getPlatformQueryAccess().getSpecificationSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"specification",
            						lv_specification_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPlatformQueryAccess().getRightCurlyBracketSemicolonKeyword_7());
            		

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
    // $ANTLR end "rulePlatformQuery"


    // $ANTLR start "entryRulePlatformCompositeQuery"
    // InternalUddl.g:11043:1: entryRulePlatformCompositeQuery returns [EObject current=null] : iv_rulePlatformCompositeQuery= rulePlatformCompositeQuery EOF ;
    public final EObject entryRulePlatformCompositeQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformCompositeQuery = null;


        try {
            // InternalUddl.g:11043:63: (iv_rulePlatformCompositeQuery= rulePlatformCompositeQuery EOF )
            // InternalUddl.g:11044:2: iv_rulePlatformCompositeQuery= rulePlatformCompositeQuery EOF
            {
             newCompositeNode(grammarAccess.getPlatformCompositeQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformCompositeQuery=rulePlatformCompositeQuery();

            state._fsp--;

             current =iv_rulePlatformCompositeQuery; 
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
    // $ANTLR end "entryRulePlatformCompositeQuery"


    // $ANTLR start "rulePlatformCompositeQuery"
    // InternalUddl.g:11050:1: rulePlatformCompositeQuery returns [EObject current=null] : (otherlv_0= 'pcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= rulePlatformQueryComposition ) ) otherlv_8= '};' ) ;
    public final EObject rulePlatformCompositeQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_isUnion_6_0=null;
        Token otherlv_8=null;
        EObject lv_composition_7_0 = null;



        	enterRule();

        try {
            // InternalUddl.g:11056:2: ( (otherlv_0= 'pcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= rulePlatformQueryComposition ) ) otherlv_8= '};' ) )
            // InternalUddl.g:11057:2: (otherlv_0= 'pcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= rulePlatformQueryComposition ) ) otherlv_8= '};' )
            {
            // InternalUddl.g:11057:2: (otherlv_0= 'pcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= rulePlatformQueryComposition ) ) otherlv_8= '};' )
            // InternalUddl.g:11058:3: otherlv_0= 'pcquery' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= '->' ( ( ruleQN ) ) )? otherlv_5= '{' ( (lv_isUnion_6_0= 'isUnion' ) ) ( (lv_composition_7_0= rulePlatformQueryComposition ) ) otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,126,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformCompositeQueryAccess().getPcqueryKeyword_0());
            		
            // InternalUddl.g:11062:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUddl.g:11063:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUddl.g:11063:4: (lv_name_1_0= RULE_ID )
            // InternalUddl.g:11064:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_91); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlatformCompositeQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCompositeQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:11080:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt221=2;
            int LA221_0 = input.LA(1);

            if ( (LA221_0==RULE_STRING) ) {
                alt221=1;
            }
            switch (alt221) {
                case 1 :
                    // InternalUddl.g:11081:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUddl.g:11081:4: (lv_description_2_0= RULE_STRING )
                    // InternalUddl.g:11082:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_92); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getPlatformCompositeQueryAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlatformCompositeQueryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUddl.g:11098:3: (otherlv_3= '->' ( ( ruleQN ) ) )?
            int alt222=2;
            int LA222_0 = input.LA(1);

            if ( (LA222_0==94) ) {
                alt222=1;
            }
            switch (alt222) {
                case 1 :
                    // InternalUddl.g:11099:4: otherlv_3= '->' ( ( ruleQN ) )
                    {
                    otherlv_3=(Token)match(input,94,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlatformCompositeQueryAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalUddl.g:11103:4: ( ( ruleQN ) )
                    // InternalUddl.g:11104:5: ( ruleQN )
                    {
                    // InternalUddl.g:11104:5: ( ruleQN )
                    // InternalUddl.g:11105:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformCompositeQueryRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformCompositeQueryAccess().getRealizesLogicalCompositeQueryCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_42); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformCompositeQueryAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUddl.g:11124:3: ( (lv_isUnion_6_0= 'isUnion' ) )
            // InternalUddl.g:11125:4: (lv_isUnion_6_0= 'isUnion' )
            {
            // InternalUddl.g:11125:4: (lv_isUnion_6_0= 'isUnion' )
            // InternalUddl.g:11126:5: lv_isUnion_6_0= 'isUnion'
            {
            lv_isUnion_6_0=(Token)match(input,44,FOLLOW_4); 

            					newLeafNode(lv_isUnion_6_0, grammarAccess.getPlatformCompositeQueryAccess().getIsUnionIsUnionKeyword_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformCompositeQueryRule());
            					}
            					setWithLastConsumed(current, "isUnion", lv_isUnion_6_0 != null, "isUnion");
            				

            }


            }

            // InternalUddl.g:11138:3: ( (lv_composition_7_0= rulePlatformQueryComposition ) )
            // InternalUddl.g:11139:4: (lv_composition_7_0= rulePlatformQueryComposition )
            {
            // InternalUddl.g:11139:4: (lv_composition_7_0= rulePlatformQueryComposition )
            // InternalUddl.g:11140:5: lv_composition_7_0= rulePlatformQueryComposition
            {

            					newCompositeNode(grammarAccess.getPlatformCompositeQueryAccess().getCompositionPlatformQueryCompositionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_22);
            lv_composition_7_0=rulePlatformQueryComposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformCompositeQueryRule());
            					}
            					add(
            						current,
            						"composition",
            						lv_composition_7_0,
            						"com.epistimis.uddl.Uddl.PlatformQueryComposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPlatformCompositeQueryAccess().getRightCurlyBracketSemicolonKeyword_7());
            		

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
    // $ANTLR end "rulePlatformCompositeQuery"


    // $ANTLR start "entryRulePlatformQueryComposition"
    // InternalUddl.g:11165:1: entryRulePlatformQueryComposition returns [EObject current=null] : iv_rulePlatformQueryComposition= rulePlatformQueryComposition EOF ;
    public final EObject entryRulePlatformQueryComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformQueryComposition = null;


        try {
            // InternalUddl.g:11165:65: (iv_rulePlatformQueryComposition= rulePlatformQueryComposition EOF )
            // InternalUddl.g:11166:2: iv_rulePlatformQueryComposition= rulePlatformQueryComposition EOF
            {
             newCompositeNode(grammarAccess.getPlatformQueryCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformQueryComposition=rulePlatformQueryComposition();

            state._fsp--;

             current =iv_rulePlatformQueryComposition; 
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
    // $ANTLR end "entryRulePlatformQueryComposition"


    // $ANTLR start "rulePlatformQueryComposition"
    // InternalUddl.g:11172:1: rulePlatformQueryComposition returns [EObject current=null] : ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? otherlv_4= ';' ) ;
    public final EObject rulePlatformQueryComposition() throws RecognitionException {
        EObject current = null;

        Token lv_rolename_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUddl.g:11178:2: ( ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? otherlv_4= ';' ) )
            // InternalUddl.g:11179:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? otherlv_4= ';' )
            {
            // InternalUddl.g:11179:2: ( ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? otherlv_4= ';' )
            // InternalUddl.g:11180:3: ( ( ruleQN ) ) ( (lv_rolename_1_0= RULE_ID ) ) (otherlv_2= '->' ( ( ruleQN ) ) )? otherlv_4= ';'
            {
            // InternalUddl.g:11180:3: ( ( ruleQN ) )
            // InternalUddl.g:11181:4: ( ruleQN )
            {
            // InternalUddl.g:11181:4: ( ruleQN )
            // InternalUddl.g:11182:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformQueryCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlatformQueryCompositionAccess().getTypePlatformViewCrossReference_0_0());
            				
            pushFollow(FOLLOW_4);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUddl.g:11196:3: ( (lv_rolename_1_0= RULE_ID ) )
            // InternalUddl.g:11197:4: (lv_rolename_1_0= RULE_ID )
            {
            // InternalUddl.g:11197:4: (lv_rolename_1_0= RULE_ID )
            // InternalUddl.g:11198:5: lv_rolename_1_0= RULE_ID
            {
            lv_rolename_1_0=(Token)match(input,RULE_ID,FOLLOW_101); 

            					newLeafNode(lv_rolename_1_0, grammarAccess.getPlatformQueryCompositionAccess().getRolenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformQueryCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rolename",
            						lv_rolename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUddl.g:11214:3: (otherlv_2= '->' ( ( ruleQN ) ) )?
            int alt223=2;
            int LA223_0 = input.LA(1);

            if ( (LA223_0==94) ) {
                alt223=1;
            }
            switch (alt223) {
                case 1 :
                    // InternalUddl.g:11215:4: otherlv_2= '->' ( ( ruleQN ) )
                    {
                    otherlv_2=(Token)match(input,94,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getPlatformQueryCompositionAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                    			
                    // InternalUddl.g:11219:4: ( ( ruleQN ) )
                    // InternalUddl.g:11220:5: ( ruleQN )
                    {
                    // InternalUddl.g:11220:5: ( ruleQN )
                    // InternalUddl.g:11221:6: ruleQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlatformQueryCompositionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPlatformQueryCompositionAccess().getRealizesLogicalQueryCompositionCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPlatformQueryCompositionAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "rulePlatformQueryComposition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003840000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000A08CC840000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x9FE1600001040010L,0x000000DD24090362L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x1080000003840000L,0x77FFFF0000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010200020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100020020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000600000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000110200020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000200000C0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100200020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001600000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000110020020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x2000000010000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x2000000010000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xC000000020000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000000020000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000010000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000400000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000400000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000400000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x8000000020000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000400000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000020L,0x0000000000040000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000220020L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x8000000010000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x4000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000020L,0x0000000040000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000010L,0x0000000080000004L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000020020L,0x0000000040000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000020000L,0x0000000040000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000400000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000100000020L,0x0000000040000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000100000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000110000020L,0x0000000040000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000001400000010L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000200000L,0x0000000040000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});

}
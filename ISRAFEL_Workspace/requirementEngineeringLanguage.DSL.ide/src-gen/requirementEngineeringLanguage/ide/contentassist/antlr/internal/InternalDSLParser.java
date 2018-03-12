package requirementEngineeringLanguage.ide.contentassist.antlr.internal;

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
import requirementEngineeringLanguage.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Temperature'", "'Luminosity'", "'Humidity'", "'Cardiac_frequency'", "'Occupancy'", "'Pressure'", "'Building'", "'Floor'", "'Corridor'", "'Room'", "'Furniture'", "'Wall'", "'Window'", "'All'", "'Some'", "'One'", "'Over'", "'Current'", "'Expected'", "'next'", "'previous'", "'range'", "'element'", "'Synchronize'", "'GoTo'", "'Enable'", "'Disable'", "'Proportion'", "'Location'", "'Comparison'", "'Part_to_a_whole'", "'Relationship'", "'Over_time'", "'Distribution'", "'Hierarchy'", "'Reference_tool'", "'Range'", "'Pattern'", "'Project:'", "'Background:'", "'Given dashboard'", "'with views'", "'to'", "'Feature:'", "'in order to'", "'Scenario:'", "'When'", "'Then'", "'Given'", "'And'", "' with available data'", "','", "'type'", "'located in'", "'is'", "'selected in'", "'it is possible to see '", "'on'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDSL.g"; }


    	private DSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProject"
    // InternalDSL.g:53:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalDSL.g:54:1: ( ruleProject EOF )
            // InternalDSL.g:55:1: ruleProject EOF
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
    // InternalDSL.g:62:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalDSL.g:67:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalDSL.g:67:2: ( ( rule__Project__Group__0 ) )
            // InternalDSL.g:68:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalDSL.g:69:3: ( rule__Project__Group__0 )
            // InternalDSL.g:69:4: rule__Project__Group__0
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


    // $ANTLR start "entryRuleBackground"
    // InternalDSL.g:78:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // InternalDSL.g:79:1: ( ruleBackground EOF )
            // InternalDSL.g:80:1: ruleBackground EOF
            {
             before(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_1);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getBackgroundRule()); 
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
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // InternalDSL.g:87:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ( rule__Background__Group__0 ) ) )
            // InternalDSL.g:92:2: ( ( rule__Background__Group__0 ) )
            {
            // InternalDSL.g:92:2: ( ( rule__Background__Group__0 ) )
            // InternalDSL.g:93:3: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // InternalDSL.g:94:3: ( rule__Background__Group__0 )
            // InternalDSL.g:94:4: rule__Background__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getGroup()); 

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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleView"
    // InternalDSL.g:103:1: entryRuleView : ruleView EOF ;
    public final void entryRuleView() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleView EOF )
            // InternalDSL.g:105:1: ruleView EOF
            {
             before(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_1);
            ruleView();

            state._fsp--;

             after(grammarAccess.getViewRule()); 
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
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // InternalDSL.g:112:1: ruleView : ( ( rule__View__Group__0 ) ) ;
    public final void ruleView() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__View__Group__0 ) ) )
            // InternalDSL.g:117:2: ( ( rule__View__Group__0 ) )
            {
            // InternalDSL.g:117:2: ( ( rule__View__Group__0 ) )
            // InternalDSL.g:118:3: ( rule__View__Group__0 )
            {
             before(grammarAccess.getViewAccess().getGroup()); 
            // InternalDSL.g:119:3: ( rule__View__Group__0 )
            // InternalDSL.g:119:4: rule__View__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__View__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getGroup()); 

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
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleFeature"
    // InternalDSL.g:128:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleFeature EOF )
            // InternalDSL.g:130:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalDSL.g:137:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__Feature__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__Feature__Group__0 )
            // InternalDSL.g:144:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleScenario"
    // InternalDSL.g:153:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleScenario EOF )
            // InternalDSL.g:155:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalDSL.g:162:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalDSL.g:167:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalDSL.g:167:2: ( ( rule__Scenario__Group__0 ) )
            // InternalDSL.g:168:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalDSL.g:169:3: ( rule__Scenario__Group__0 )
            // InternalDSL.g:169:4: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleGiven"
    // InternalDSL.g:178:1: entryRuleGiven : ruleGiven EOF ;
    public final void entryRuleGiven() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleGiven EOF )
            // InternalDSL.g:180:1: ruleGiven EOF
            {
             before(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            ruleGiven();

            state._fsp--;

             after(grammarAccess.getGivenRule()); 
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
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalDSL.g:187:1: ruleGiven : ( ( rule__Given__Group__0 ) ) ;
    public final void ruleGiven() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__Given__Group__0 ) ) )
            // InternalDSL.g:192:2: ( ( rule__Given__Group__0 ) )
            {
            // InternalDSL.g:192:2: ( ( rule__Given__Group__0 ) )
            // InternalDSL.g:193:3: ( rule__Given__Group__0 )
            {
             before(grammarAccess.getGivenAccess().getGroup()); 
            // InternalDSL.g:194:3: ( rule__Given__Group__0 )
            // InternalDSL.g:194:4: rule__Given__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getGroup()); 

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
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleData"
    // InternalDSL.g:203:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleData EOF )
            // InternalDSL.g:205:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalDSL.g:212:1: ruleData : ( ( rule__Data__Group__0 ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__Data__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__Data__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__Data__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__Data__Group__0 )
            {
             before(grammarAccess.getDataAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__Data__Group__0 )
            // InternalDSL.g:219:4: rule__Data__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getGroup()); 

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleWhen"
    // InternalDSL.g:228:1: entryRuleWhen : ruleWhen EOF ;
    public final void entryRuleWhen() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleWhen EOF )
            // InternalDSL.g:230:1: ruleWhen EOF
            {
             before(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            ruleWhen();

            state._fsp--;

             after(grammarAccess.getWhenRule()); 
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
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalDSL.g:237:1: ruleWhen : ( ( rule__When__Alternatives ) ) ;
    public final void ruleWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__When__Alternatives ) ) )
            // InternalDSL.g:242:2: ( ( rule__When__Alternatives ) )
            {
            // InternalDSL.g:242:2: ( ( rule__When__Alternatives ) )
            // InternalDSL.g:243:3: ( rule__When__Alternatives )
            {
             before(grammarAccess.getWhenAccess().getAlternatives()); 
            // InternalDSL.g:244:3: ( rule__When__Alternatives )
            // InternalDSL.g:244:4: rule__When__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__When__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleLoading"
    // InternalDSL.g:253:1: entryRuleLoading : ruleLoading EOF ;
    public final void entryRuleLoading() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleLoading EOF )
            // InternalDSL.g:255:1: ruleLoading EOF
            {
             before(grammarAccess.getLoadingRule()); 
            pushFollow(FOLLOW_1);
            ruleLoading();

            state._fsp--;

             after(grammarAccess.getLoadingRule()); 
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
    // $ANTLR end "entryRuleLoading"


    // $ANTLR start "ruleLoading"
    // InternalDSL.g:262:1: ruleLoading : ( ( rule__Loading__Group__0 ) ) ;
    public final void ruleLoading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__Loading__Group__0 ) ) )
            // InternalDSL.g:267:2: ( ( rule__Loading__Group__0 ) )
            {
            // InternalDSL.g:267:2: ( ( rule__Loading__Group__0 ) )
            // InternalDSL.g:268:3: ( rule__Loading__Group__0 )
            {
             before(grammarAccess.getLoadingAccess().getGroup()); 
            // InternalDSL.g:269:3: ( rule__Loading__Group__0 )
            // InternalDSL.g:269:4: rule__Loading__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loading__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoadingAccess().getGroup()); 

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
    // $ANTLR end "ruleLoading"


    // $ANTLR start "entryRuleInteraction"
    // InternalDSL.g:278:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleInteraction EOF )
            // InternalDSL.g:280:1: ruleInteraction EOF
            {
             before(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getInteractionRule()); 
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
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalDSL.g:287:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // InternalDSL.g:292:2: ( ( rule__Interaction__Group__0 ) )
            {
            // InternalDSL.g:292:2: ( ( rule__Interaction__Group__0 ) )
            // InternalDSL.g:293:3: ( rule__Interaction__Group__0 )
            {
             before(grammarAccess.getInteractionAccess().getGroup()); 
            // InternalDSL.g:294:3: ( rule__Interaction__Group__0 )
            // InternalDSL.g:294:4: rule__Interaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getGroup()); 

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
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleThen"
    // InternalDSL.g:303:1: entryRuleThen : ruleThen EOF ;
    public final void entryRuleThen() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleThen EOF )
            // InternalDSL.g:305:1: ruleThen EOF
            {
             before(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            ruleThen();

            state._fsp--;

             after(grammarAccess.getThenRule()); 
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
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalDSL.g:312:1: ruleThen : ( ( rule__Then__Alternatives ) ) ;
    public final void ruleThen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__Then__Alternatives ) ) )
            // InternalDSL.g:317:2: ( ( rule__Then__Alternatives ) )
            {
            // InternalDSL.g:317:2: ( ( rule__Then__Alternatives ) )
            // InternalDSL.g:318:3: ( rule__Then__Alternatives )
            {
             before(grammarAccess.getThenAccess().getAlternatives()); 
            // InternalDSL.g:319:3: ( rule__Then__Alternatives )
            // InternalDSL.g:319:4: rule__Then__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Then__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getAlternatives()); 

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
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRuleUpdate"
    // InternalDSL.g:328:1: entryRuleUpdate : ruleUpdate EOF ;
    public final void entryRuleUpdate() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( ruleUpdate EOF )
            // InternalDSL.g:330:1: ruleUpdate EOF
            {
             before(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdate();

            state._fsp--;

             after(grammarAccess.getUpdateRule()); 
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
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // InternalDSL.g:337:1: ruleUpdate : ( ( rule__Update__Group__0 ) ) ;
    public final void ruleUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__Update__Group__0 ) ) )
            // InternalDSL.g:342:2: ( ( rule__Update__Group__0 ) )
            {
            // InternalDSL.g:342:2: ( ( rule__Update__Group__0 ) )
            // InternalDSL.g:343:3: ( rule__Update__Group__0 )
            {
             before(grammarAccess.getUpdateAccess().getGroup()); 
            // InternalDSL.g:344:3: ( rule__Update__Group__0 )
            // InternalDSL.g:344:4: rule__Update__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getGroup()); 

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
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleGoal"
    // InternalDSL.g:353:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // InternalDSL.g:354:1: ( ruleGoal EOF )
            // InternalDSL.g:355:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_1);
            ruleGoal();

            state._fsp--;

             after(grammarAccess.getGoalRule()); 
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
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // InternalDSL.g:362:1: ruleGoal : ( ( rule__Goal__Group__0 ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:366:2: ( ( ( rule__Goal__Group__0 ) ) )
            // InternalDSL.g:367:2: ( ( rule__Goal__Group__0 ) )
            {
            // InternalDSL.g:367:2: ( ( rule__Goal__Group__0 ) )
            // InternalDSL.g:368:3: ( rule__Goal__Group__0 )
            {
             before(grammarAccess.getGoalAccess().getGroup()); 
            // InternalDSL.g:369:3: ( rule__Goal__Group__0 )
            // InternalDSL.g:369:4: rule__Goal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Goal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getGroup()); 

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
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleEString"
    // InternalDSL.g:378:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDSL.g:379:1: ( ruleEString EOF )
            // InternalDSL.g:380:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDSL.g:387:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:391:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDSL.g:392:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDSL.g:392:2: ( ( rule__EString__Alternatives ) )
            // InternalDSL.g:393:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDSL.g:394:3: ( rule__EString__Alternatives )
            // InternalDSL.g:394:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleDataType"
    // InternalDSL.g:403:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:407:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalDSL.g:408:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalDSL.g:408:2: ( ( rule__DataType__Alternatives ) )
            // InternalDSL.g:409:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalDSL.g:410:3: ( rule__DataType__Alternatives )
            // InternalDSL.g:410:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleContainerType"
    // InternalDSL.g:419:1: ruleContainerType : ( ( rule__ContainerType__Alternatives ) ) ;
    public final void ruleContainerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:423:1: ( ( ( rule__ContainerType__Alternatives ) ) )
            // InternalDSL.g:424:2: ( ( rule__ContainerType__Alternatives ) )
            {
            // InternalDSL.g:424:2: ( ( rule__ContainerType__Alternatives ) )
            // InternalDSL.g:425:3: ( rule__ContainerType__Alternatives )
            {
             before(grammarAccess.getContainerTypeAccess().getAlternatives()); 
            // InternalDSL.g:426:3: ( rule__ContainerType__Alternatives )
            // InternalDSL.g:426:4: rule__ContainerType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ContainerType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContainerTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleContainerType"


    // $ANTLR start "ruleQuantifier"
    // InternalDSL.g:435:1: ruleQuantifier : ( ( rule__Quantifier__Alternatives ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:439:1: ( ( ( rule__Quantifier__Alternatives ) ) )
            // InternalDSL.g:440:2: ( ( rule__Quantifier__Alternatives ) )
            {
            // InternalDSL.g:440:2: ( ( rule__Quantifier__Alternatives ) )
            // InternalDSL.g:441:3: ( rule__Quantifier__Alternatives )
            {
             before(grammarAccess.getQuantifierAccess().getAlternatives()); 
            // InternalDSL.g:442:3: ( rule__Quantifier__Alternatives )
            // InternalDSL.g:442:4: rule__Quantifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Quantifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "ruleState"
    // InternalDSL.g:451:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:455:1: ( ( ( rule__State__Alternatives ) ) )
            // InternalDSL.g:456:2: ( ( rule__State__Alternatives ) )
            {
            // InternalDSL.g:456:2: ( ( rule__State__Alternatives ) )
            // InternalDSL.g:457:3: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // InternalDSL.g:458:3: ( rule__State__Alternatives )
            // InternalDSL.g:458:4: rule__State__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives()); 

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
    // $ANTLR end "ruleState"


    // $ANTLR start "ruleAction"
    // InternalDSL.g:467:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:471:1: ( ( ( rule__Action__Alternatives ) ) )
            // InternalDSL.g:472:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalDSL.g:472:2: ( ( rule__Action__Alternatives ) )
            // InternalDSL.g:473:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalDSL.g:474:3: ( rule__Action__Alternatives )
            // InternalDSL.g:474:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "ruleReaction"
    // InternalDSL.g:483:1: ruleReaction : ( ( rule__Reaction__Alternatives ) ) ;
    public final void ruleReaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:487:1: ( ( ( rule__Reaction__Alternatives ) ) )
            // InternalDSL.g:488:2: ( ( rule__Reaction__Alternatives ) )
            {
            // InternalDSL.g:488:2: ( ( rule__Reaction__Alternatives ) )
            // InternalDSL.g:489:3: ( rule__Reaction__Alternatives )
            {
             before(grammarAccess.getReactionAccess().getAlternatives()); 
            // InternalDSL.g:490:3: ( rule__Reaction__Alternatives )
            // InternalDSL.g:490:4: rule__Reaction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Reaction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReactionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleReaction"


    // $ANTLR start "ruleTaxonomy"
    // InternalDSL.g:499:1: ruleTaxonomy : ( ( rule__Taxonomy__Alternatives ) ) ;
    public final void ruleTaxonomy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:503:1: ( ( ( rule__Taxonomy__Alternatives ) ) )
            // InternalDSL.g:504:2: ( ( rule__Taxonomy__Alternatives ) )
            {
            // InternalDSL.g:504:2: ( ( rule__Taxonomy__Alternatives ) )
            // InternalDSL.g:505:3: ( rule__Taxonomy__Alternatives )
            {
             before(grammarAccess.getTaxonomyAccess().getAlternatives()); 
            // InternalDSL.g:506:3: ( rule__Taxonomy__Alternatives )
            // InternalDSL.g:506:4: rule__Taxonomy__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Taxonomy__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTaxonomyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTaxonomy"


    // $ANTLR start "rule__When__Alternatives"
    // InternalDSL.g:514:1: rule__When__Alternatives : ( ( ruleLoading ) | ( ruleInteraction ) );
    public final void rule__When__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:518:1: ( ( ruleLoading ) | ( ruleInteraction ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=30 && LA1_0<=33)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDSL.g:519:2: ( ruleLoading )
                    {
                    // InternalDSL.g:519:2: ( ruleLoading )
                    // InternalDSL.g:520:3: ruleLoading
                    {
                     before(grammarAccess.getWhenAccess().getLoadingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLoading();

                    state._fsp--;

                     after(grammarAccess.getWhenAccess().getLoadingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:525:2: ( ruleInteraction )
                    {
                    // InternalDSL.g:525:2: ( ruleInteraction )
                    // InternalDSL.g:526:3: ruleInteraction
                    {
                     before(grammarAccess.getWhenAccess().getInteractionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInteraction();

                    state._fsp--;

                     after(grammarAccess.getWhenAccess().getInteractionParserRuleCall_1()); 

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
    // $ANTLR end "rule__When__Alternatives"


    // $ANTLR start "rule__Then__Alternatives"
    // InternalDSL.g:535:1: rule__Then__Alternatives : ( ( ruleUpdate ) | ( ruleGoal ) );
    public final void rule__Then__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:539:1: ( ( ruleUpdate ) | ( ruleGoal ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            else if ( (LA2_0==67) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:540:2: ( ruleUpdate )
                    {
                    // InternalDSL.g:540:2: ( ruleUpdate )
                    // InternalDSL.g:541:3: ruleUpdate
                    {
                     before(grammarAccess.getThenAccess().getUpdateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUpdate();

                    state._fsp--;

                     after(grammarAccess.getThenAccess().getUpdateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:546:2: ( ruleGoal )
                    {
                    // InternalDSL.g:546:2: ( ruleGoal )
                    // InternalDSL.g:547:3: ruleGoal
                    {
                     before(grammarAccess.getThenAccess().getGoalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGoal();

                    state._fsp--;

                     after(grammarAccess.getThenAccess().getGoalParserRuleCall_1()); 

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
    // $ANTLR end "rule__Then__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDSL.g:556:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:560:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:561:2: ( RULE_STRING )
                    {
                    // InternalDSL.g:561:2: ( RULE_STRING )
                    // InternalDSL.g:562:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:567:2: ( RULE_ID )
                    {
                    // InternalDSL.g:567:2: ( RULE_ID )
                    // InternalDSL.g:568:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalDSL.g:577:1: rule__DataType__Alternatives : ( ( ( 'Temperature' ) ) | ( ( 'Luminosity' ) ) | ( ( 'Humidity' ) ) | ( ( 'Cardiac_frequency' ) ) | ( ( 'Occupancy' ) ) | ( ( 'Pressure' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:581:1: ( ( ( 'Temperature' ) ) | ( ( 'Luminosity' ) ) | ( ( 'Humidity' ) ) | ( ( 'Cardiac_frequency' ) ) | ( ( 'Occupancy' ) ) | ( ( 'Pressure' ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDSL.g:582:2: ( ( 'Temperature' ) )
                    {
                    // InternalDSL.g:582:2: ( ( 'Temperature' ) )
                    // InternalDSL.g:583:3: ( 'Temperature' )
                    {
                     before(grammarAccess.getDataTypeAccess().getTemperatureEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:584:3: ( 'Temperature' )
                    // InternalDSL.g:584:4: 'Temperature'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getTemperatureEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:588:2: ( ( 'Luminosity' ) )
                    {
                    // InternalDSL.g:588:2: ( ( 'Luminosity' ) )
                    // InternalDSL.g:589:3: ( 'Luminosity' )
                    {
                     before(grammarAccess.getDataTypeAccess().getLuminosityEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:590:3: ( 'Luminosity' )
                    // InternalDSL.g:590:4: 'Luminosity'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getLuminosityEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:594:2: ( ( 'Humidity' ) )
                    {
                    // InternalDSL.g:594:2: ( ( 'Humidity' ) )
                    // InternalDSL.g:595:3: ( 'Humidity' )
                    {
                     before(grammarAccess.getDataTypeAccess().getHumidityEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:596:3: ( 'Humidity' )
                    // InternalDSL.g:596:4: 'Humidity'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getHumidityEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:600:2: ( ( 'Cardiac_frequency' ) )
                    {
                    // InternalDSL.g:600:2: ( ( 'Cardiac_frequency' ) )
                    // InternalDSL.g:601:3: ( 'Cardiac_frequency' )
                    {
                     before(grammarAccess.getDataTypeAccess().getCardiac_frequencyEnumLiteralDeclaration_3()); 
                    // InternalDSL.g:602:3: ( 'Cardiac_frequency' )
                    // InternalDSL.g:602:4: 'Cardiac_frequency'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getCardiac_frequencyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:606:2: ( ( 'Occupancy' ) )
                    {
                    // InternalDSL.g:606:2: ( ( 'Occupancy' ) )
                    // InternalDSL.g:607:3: ( 'Occupancy' )
                    {
                     before(grammarAccess.getDataTypeAccess().getOccupancyEnumLiteralDeclaration_4()); 
                    // InternalDSL.g:608:3: ( 'Occupancy' )
                    // InternalDSL.g:608:4: 'Occupancy'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getOccupancyEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:612:2: ( ( 'Pressure' ) )
                    {
                    // InternalDSL.g:612:2: ( ( 'Pressure' ) )
                    // InternalDSL.g:613:3: ( 'Pressure' )
                    {
                     before(grammarAccess.getDataTypeAccess().getPressureEnumLiteralDeclaration_5()); 
                    // InternalDSL.g:614:3: ( 'Pressure' )
                    // InternalDSL.g:614:4: 'Pressure'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getPressureEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__ContainerType__Alternatives"
    // InternalDSL.g:622:1: rule__ContainerType__Alternatives : ( ( ( 'Building' ) ) | ( ( 'Floor' ) ) | ( ( 'Corridor' ) ) | ( ( 'Room' ) ) | ( ( 'Furniture' ) ) | ( ( 'Wall' ) ) | ( ( 'Window' ) ) );
    public final void rule__ContainerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:626:1: ( ( ( 'Building' ) ) | ( ( 'Floor' ) ) | ( ( 'Corridor' ) ) | ( ( 'Room' ) ) | ( ( 'Furniture' ) ) | ( ( 'Wall' ) ) | ( ( 'Window' ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            case 22:
                {
                alt5=6;
                }
                break;
            case 23:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDSL.g:627:2: ( ( 'Building' ) )
                    {
                    // InternalDSL.g:627:2: ( ( 'Building' ) )
                    // InternalDSL.g:628:3: ( 'Building' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getBuildingEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:629:3: ( 'Building' )
                    // InternalDSL.g:629:4: 'Building'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getBuildingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:633:2: ( ( 'Floor' ) )
                    {
                    // InternalDSL.g:633:2: ( ( 'Floor' ) )
                    // InternalDSL.g:634:3: ( 'Floor' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getFloorEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:635:3: ( 'Floor' )
                    // InternalDSL.g:635:4: 'Floor'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getFloorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:639:2: ( ( 'Corridor' ) )
                    {
                    // InternalDSL.g:639:2: ( ( 'Corridor' ) )
                    // InternalDSL.g:640:3: ( 'Corridor' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getCorridorEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:641:3: ( 'Corridor' )
                    // InternalDSL.g:641:4: 'Corridor'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getCorridorEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:645:2: ( ( 'Room' ) )
                    {
                    // InternalDSL.g:645:2: ( ( 'Room' ) )
                    // InternalDSL.g:646:3: ( 'Room' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getRoomEnumLiteralDeclaration_3()); 
                    // InternalDSL.g:647:3: ( 'Room' )
                    // InternalDSL.g:647:4: 'Room'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getRoomEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:651:2: ( ( 'Furniture' ) )
                    {
                    // InternalDSL.g:651:2: ( ( 'Furniture' ) )
                    // InternalDSL.g:652:3: ( 'Furniture' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getFurnitureEnumLiteralDeclaration_4()); 
                    // InternalDSL.g:653:3: ( 'Furniture' )
                    // InternalDSL.g:653:4: 'Furniture'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getFurnitureEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:657:2: ( ( 'Wall' ) )
                    {
                    // InternalDSL.g:657:2: ( ( 'Wall' ) )
                    // InternalDSL.g:658:3: ( 'Wall' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getWallEnumLiteralDeclaration_5()); 
                    // InternalDSL.g:659:3: ( 'Wall' )
                    // InternalDSL.g:659:4: 'Wall'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getWallEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:663:2: ( ( 'Window' ) )
                    {
                    // InternalDSL.g:663:2: ( ( 'Window' ) )
                    // InternalDSL.g:664:3: ( 'Window' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getWindowEnumLiteralDeclaration_6()); 
                    // InternalDSL.g:665:3: ( 'Window' )
                    // InternalDSL.g:665:4: 'Window'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getWindowEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__ContainerType__Alternatives"


    // $ANTLR start "rule__Quantifier__Alternatives"
    // InternalDSL.g:673:1: rule__Quantifier__Alternatives : ( ( ( 'All' ) ) | ( ( 'Some' ) ) | ( ( 'One' ) ) );
    public final void rule__Quantifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:677:1: ( ( ( 'All' ) ) | ( ( 'Some' ) ) | ( ( 'One' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDSL.g:678:2: ( ( 'All' ) )
                    {
                    // InternalDSL.g:678:2: ( ( 'All' ) )
                    // InternalDSL.g:679:3: ( 'All' )
                    {
                     before(grammarAccess.getQuantifierAccess().getAllEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:680:3: ( 'All' )
                    // InternalDSL.g:680:4: 'All'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantifierAccess().getAllEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:684:2: ( ( 'Some' ) )
                    {
                    // InternalDSL.g:684:2: ( ( 'Some' ) )
                    // InternalDSL.g:685:3: ( 'Some' )
                    {
                     before(grammarAccess.getQuantifierAccess().getSomeEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:686:3: ( 'Some' )
                    // InternalDSL.g:686:4: 'Some'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantifierAccess().getSomeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:690:2: ( ( 'One' ) )
                    {
                    // InternalDSL.g:690:2: ( ( 'One' ) )
                    // InternalDSL.g:691:3: ( 'One' )
                    {
                     before(grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:692:3: ( 'One' )
                    // InternalDSL.g:692:4: 'One'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Quantifier__Alternatives"


    // $ANTLR start "rule__State__Alternatives"
    // InternalDSL.g:700:1: rule__State__Alternatives : ( ( ( 'Over' ) ) | ( ( 'Current' ) ) | ( ( 'Expected' ) ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:704:1: ( ( ( 'Over' ) ) | ( ( 'Current' ) ) | ( ( 'Expected' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDSL.g:705:2: ( ( 'Over' ) )
                    {
                    // InternalDSL.g:705:2: ( ( 'Over' ) )
                    // InternalDSL.g:706:3: ( 'Over' )
                    {
                     before(grammarAccess.getStateAccess().getOverEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:707:3: ( 'Over' )
                    // InternalDSL.g:707:4: 'Over'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateAccess().getOverEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:711:2: ( ( 'Current' ) )
                    {
                    // InternalDSL.g:711:2: ( ( 'Current' ) )
                    // InternalDSL.g:712:3: ( 'Current' )
                    {
                     before(grammarAccess.getStateAccess().getCurrentEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:713:3: ( 'Current' )
                    // InternalDSL.g:713:4: 'Current'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateAccess().getCurrentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:717:2: ( ( 'Expected' ) )
                    {
                    // InternalDSL.g:717:2: ( ( 'Expected' ) )
                    // InternalDSL.g:718:3: ( 'Expected' )
                    {
                     before(grammarAccess.getStateAccess().getExpectedEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:719:3: ( 'Expected' )
                    // InternalDSL.g:719:4: 'Expected'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateAccess().getExpectedEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__State__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalDSL.g:727:1: rule__Action__Alternatives : ( ( ( 'next' ) ) | ( ( 'previous' ) ) | ( ( 'range' ) ) | ( ( 'element' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:731:1: ( ( ( 'next' ) ) | ( ( 'previous' ) ) | ( ( 'range' ) ) | ( ( 'element' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 31:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            case 33:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDSL.g:732:2: ( ( 'next' ) )
                    {
                    // InternalDSL.g:732:2: ( ( 'next' ) )
                    // InternalDSL.g:733:3: ( 'next' )
                    {
                     before(grammarAccess.getActionAccess().getNextEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:734:3: ( 'next' )
                    // InternalDSL.g:734:4: 'next'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getNextEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:738:2: ( ( 'previous' ) )
                    {
                    // InternalDSL.g:738:2: ( ( 'previous' ) )
                    // InternalDSL.g:739:3: ( 'previous' )
                    {
                     before(grammarAccess.getActionAccess().getPreviousEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:740:3: ( 'previous' )
                    // InternalDSL.g:740:4: 'previous'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getPreviousEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:744:2: ( ( 'range' ) )
                    {
                    // InternalDSL.g:744:2: ( ( 'range' ) )
                    // InternalDSL.g:745:3: ( 'range' )
                    {
                     before(grammarAccess.getActionAccess().getRangeEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:746:3: ( 'range' )
                    // InternalDSL.g:746:4: 'range'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getRangeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:750:2: ( ( 'element' ) )
                    {
                    // InternalDSL.g:750:2: ( ( 'element' ) )
                    // InternalDSL.g:751:3: ( 'element' )
                    {
                     before(grammarAccess.getActionAccess().getElementEnumLiteralDeclaration_3()); 
                    // InternalDSL.g:752:3: ( 'element' )
                    // InternalDSL.g:752:4: 'element'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getElementEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Reaction__Alternatives"
    // InternalDSL.g:760:1: rule__Reaction__Alternatives : ( ( ( 'Synchronize' ) ) | ( ( 'GoTo' ) ) | ( ( 'Enable' ) ) | ( ( 'Disable' ) ) );
    public final void rule__Reaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:764:1: ( ( ( 'Synchronize' ) ) | ( ( 'GoTo' ) ) | ( ( 'Enable' ) ) | ( ( 'Disable' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt9=1;
                }
                break;
            case 35:
                {
                alt9=2;
                }
                break;
            case 36:
                {
                alt9=3;
                }
                break;
            case 37:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDSL.g:765:2: ( ( 'Synchronize' ) )
                    {
                    // InternalDSL.g:765:2: ( ( 'Synchronize' ) )
                    // InternalDSL.g:766:3: ( 'Synchronize' )
                    {
                     before(grammarAccess.getReactionAccess().getSynchronizeEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:767:3: ( 'Synchronize' )
                    // InternalDSL.g:767:4: 'Synchronize'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getReactionAccess().getSynchronizeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:771:2: ( ( 'GoTo' ) )
                    {
                    // InternalDSL.g:771:2: ( ( 'GoTo' ) )
                    // InternalDSL.g:772:3: ( 'GoTo' )
                    {
                     before(grammarAccess.getReactionAccess().getGoToEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:773:3: ( 'GoTo' )
                    // InternalDSL.g:773:4: 'GoTo'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getReactionAccess().getGoToEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:777:2: ( ( 'Enable' ) )
                    {
                    // InternalDSL.g:777:2: ( ( 'Enable' ) )
                    // InternalDSL.g:778:3: ( 'Enable' )
                    {
                     before(grammarAccess.getReactionAccess().getEnableEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:779:3: ( 'Enable' )
                    // InternalDSL.g:779:4: 'Enable'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getReactionAccess().getEnableEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:783:2: ( ( 'Disable' ) )
                    {
                    // InternalDSL.g:783:2: ( ( 'Disable' ) )
                    // InternalDSL.g:784:3: ( 'Disable' )
                    {
                     before(grammarAccess.getReactionAccess().getDisableEnumLiteralDeclaration_3()); 
                    // InternalDSL.g:785:3: ( 'Disable' )
                    // InternalDSL.g:785:4: 'Disable'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getReactionAccess().getDisableEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Reaction__Alternatives"


    // $ANTLR start "rule__Taxonomy__Alternatives"
    // InternalDSL.g:793:1: rule__Taxonomy__Alternatives : ( ( ( 'Proportion' ) ) | ( ( 'Location' ) ) | ( ( 'Comparison' ) ) | ( ( 'Part_to_a_whole' ) ) | ( ( 'Relationship' ) ) | ( ( 'Over_time' ) ) | ( ( 'Distribution' ) ) | ( ( 'Hierarchy' ) ) | ( ( 'Reference_tool' ) ) | ( ( 'Range' ) ) | ( ( 'Pattern' ) ) );
    public final void rule__Taxonomy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:797:1: ( ( ( 'Proportion' ) ) | ( ( 'Location' ) ) | ( ( 'Comparison' ) ) | ( ( 'Part_to_a_whole' ) ) | ( ( 'Relationship' ) ) | ( ( 'Over_time' ) ) | ( ( 'Distribution' ) ) | ( ( 'Hierarchy' ) ) | ( ( 'Reference_tool' ) ) | ( ( 'Range' ) ) | ( ( 'Pattern' ) ) )
            int alt10=11;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt10=1;
                }
                break;
            case 39:
                {
                alt10=2;
                }
                break;
            case 40:
                {
                alt10=3;
                }
                break;
            case 41:
                {
                alt10=4;
                }
                break;
            case 42:
                {
                alt10=5;
                }
                break;
            case 43:
                {
                alt10=6;
                }
                break;
            case 44:
                {
                alt10=7;
                }
                break;
            case 45:
                {
                alt10=8;
                }
                break;
            case 46:
                {
                alt10=9;
                }
                break;
            case 47:
                {
                alt10=10;
                }
                break;
            case 48:
                {
                alt10=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDSL.g:798:2: ( ( 'Proportion' ) )
                    {
                    // InternalDSL.g:798:2: ( ( 'Proportion' ) )
                    // InternalDSL.g:799:3: ( 'Proportion' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getProportionEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:800:3: ( 'Proportion' )
                    // InternalDSL.g:800:4: 'Proportion'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getProportionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:804:2: ( ( 'Location' ) )
                    {
                    // InternalDSL.g:804:2: ( ( 'Location' ) )
                    // InternalDSL.g:805:3: ( 'Location' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getLocationEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:806:3: ( 'Location' )
                    // InternalDSL.g:806:4: 'Location'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getLocationEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:810:2: ( ( 'Comparison' ) )
                    {
                    // InternalDSL.g:810:2: ( ( 'Comparison' ) )
                    // InternalDSL.g:811:3: ( 'Comparison' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getComparisonEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:812:3: ( 'Comparison' )
                    // InternalDSL.g:812:4: 'Comparison'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getComparisonEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:816:2: ( ( 'Part_to_a_whole' ) )
                    {
                    // InternalDSL.g:816:2: ( ( 'Part_to_a_whole' ) )
                    // InternalDSL.g:817:3: ( 'Part_to_a_whole' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getPart_to_a_wholeEnumLiteralDeclaration_3()); 
                    // InternalDSL.g:818:3: ( 'Part_to_a_whole' )
                    // InternalDSL.g:818:4: 'Part_to_a_whole'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getPart_to_a_wholeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:822:2: ( ( 'Relationship' ) )
                    {
                    // InternalDSL.g:822:2: ( ( 'Relationship' ) )
                    // InternalDSL.g:823:3: ( 'Relationship' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getRelationshipEnumLiteralDeclaration_4()); 
                    // InternalDSL.g:824:3: ( 'Relationship' )
                    // InternalDSL.g:824:4: 'Relationship'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getRelationshipEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:828:2: ( ( 'Over_time' ) )
                    {
                    // InternalDSL.g:828:2: ( ( 'Over_time' ) )
                    // InternalDSL.g:829:3: ( 'Over_time' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getOver_timeEnumLiteralDeclaration_5()); 
                    // InternalDSL.g:830:3: ( 'Over_time' )
                    // InternalDSL.g:830:4: 'Over_time'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getOver_timeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:834:2: ( ( 'Distribution' ) )
                    {
                    // InternalDSL.g:834:2: ( ( 'Distribution' ) )
                    // InternalDSL.g:835:3: ( 'Distribution' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getDistributionEnumLiteralDeclaration_6()); 
                    // InternalDSL.g:836:3: ( 'Distribution' )
                    // InternalDSL.g:836:4: 'Distribution'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getDistributionEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDSL.g:840:2: ( ( 'Hierarchy' ) )
                    {
                    // InternalDSL.g:840:2: ( ( 'Hierarchy' ) )
                    // InternalDSL.g:841:3: ( 'Hierarchy' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getHierarchyEnumLiteralDeclaration_7()); 
                    // InternalDSL.g:842:3: ( 'Hierarchy' )
                    // InternalDSL.g:842:4: 'Hierarchy'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getHierarchyEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDSL.g:846:2: ( ( 'Reference_tool' ) )
                    {
                    // InternalDSL.g:846:2: ( ( 'Reference_tool' ) )
                    // InternalDSL.g:847:3: ( 'Reference_tool' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getReference_toolEnumLiteralDeclaration_8()); 
                    // InternalDSL.g:848:3: ( 'Reference_tool' )
                    // InternalDSL.g:848:4: 'Reference_tool'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getReference_toolEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDSL.g:852:2: ( ( 'Range' ) )
                    {
                    // InternalDSL.g:852:2: ( ( 'Range' ) )
                    // InternalDSL.g:853:3: ( 'Range' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getRangeEnumLiteralDeclaration_9()); 
                    // InternalDSL.g:854:3: ( 'Range' )
                    // InternalDSL.g:854:4: 'Range'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getRangeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDSL.g:858:2: ( ( 'Pattern' ) )
                    {
                    // InternalDSL.g:858:2: ( ( 'Pattern' ) )
                    // InternalDSL.g:859:3: ( 'Pattern' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getPatternEnumLiteralDeclaration_10()); 
                    // InternalDSL.g:860:3: ( 'Pattern' )
                    // InternalDSL.g:860:4: 'Pattern'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getPatternEnumLiteralDeclaration_10()); 

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
    // $ANTLR end "rule__Taxonomy__Alternatives"


    // $ANTLR start "rule__Project__Group__0"
    // InternalDSL.g:868:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:872:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalDSL.g:873:2: rule__Project__Group__0__Impl rule__Project__Group__1
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
    // InternalDSL.g:880:1: rule__Project__Group__0__Impl : ( 'Project:' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:884:1: ( ( 'Project:' ) )
            // InternalDSL.g:885:1: ( 'Project:' )
            {
            // InternalDSL.g:885:1: ( 'Project:' )
            // InternalDSL.g:886:2: 'Project:'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalDSL.g:895:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:899:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalDSL.g:900:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDSL.g:907:1: rule__Project__Group__1__Impl : ( ( rule__Project__NameAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:911:1: ( ( ( rule__Project__NameAssignment_1 ) ) )
            // InternalDSL.g:912:1: ( ( rule__Project__NameAssignment_1 ) )
            {
            // InternalDSL.g:912:1: ( ( rule__Project__NameAssignment_1 ) )
            // InternalDSL.g:913:2: ( rule__Project__NameAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_1()); 
            // InternalDSL.g:914:2: ( rule__Project__NameAssignment_1 )
            // InternalDSL.g:914:3: rule__Project__NameAssignment_1
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
    // InternalDSL.g:922:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:926:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalDSL.g:927:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalDSL.g:934:1: rule__Project__Group__2__Impl : ( 'Background:' ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:938:1: ( ( 'Background:' ) )
            // InternalDSL.g:939:1: ( 'Background:' )
            {
            // InternalDSL.g:939:1: ( 'Background:' )
            // InternalDSL.g:940:2: 'Background:'
            {
             before(grammarAccess.getProjectAccess().getBackgroundKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getBackgroundKeyword_2()); 

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
    // InternalDSL.g:949:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:953:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalDSL.g:954:2: rule__Project__Group__3__Impl rule__Project__Group__4
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
    // InternalDSL.g:961:1: rule__Project__Group__3__Impl : ( ( rule__Project__BackgroundAssignment_3 ) ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:965:1: ( ( ( rule__Project__BackgroundAssignment_3 ) ) )
            // InternalDSL.g:966:1: ( ( rule__Project__BackgroundAssignment_3 ) )
            {
            // InternalDSL.g:966:1: ( ( rule__Project__BackgroundAssignment_3 ) )
            // InternalDSL.g:967:2: ( rule__Project__BackgroundAssignment_3 )
            {
             before(grammarAccess.getProjectAccess().getBackgroundAssignment_3()); 
            // InternalDSL.g:968:2: ( rule__Project__BackgroundAssignment_3 )
            // InternalDSL.g:968:3: rule__Project__BackgroundAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Project__BackgroundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getBackgroundAssignment_3()); 

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
    // InternalDSL.g:976:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:980:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalDSL.g:981:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:988:1: rule__Project__Group__4__Impl : ( ( rule__Project__BackgroundAssignment_4 )* ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:992:1: ( ( ( rule__Project__BackgroundAssignment_4 )* ) )
            // InternalDSL.g:993:1: ( ( rule__Project__BackgroundAssignment_4 )* )
            {
            // InternalDSL.g:993:1: ( ( rule__Project__BackgroundAssignment_4 )* )
            // InternalDSL.g:994:2: ( rule__Project__BackgroundAssignment_4 )*
            {
             before(grammarAccess.getProjectAccess().getBackgroundAssignment_4()); 
            // InternalDSL.g:995:2: ( rule__Project__BackgroundAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==51) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDSL.g:995:3: rule__Project__BackgroundAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Project__BackgroundAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getBackgroundAssignment_4()); 

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
    // InternalDSL.g:1003:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1007:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // InternalDSL.g:1008:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalDSL.g:1015:1: rule__Project__Group__5__Impl : ( ( rule__Project__ConsistOfAssignment_5 ) ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1019:1: ( ( ( rule__Project__ConsistOfAssignment_5 ) ) )
            // InternalDSL.g:1020:1: ( ( rule__Project__ConsistOfAssignment_5 ) )
            {
            // InternalDSL.g:1020:1: ( ( rule__Project__ConsistOfAssignment_5 ) )
            // InternalDSL.g:1021:2: ( rule__Project__ConsistOfAssignment_5 )
            {
             before(grammarAccess.getProjectAccess().getConsistOfAssignment_5()); 
            // InternalDSL.g:1022:2: ( rule__Project__ConsistOfAssignment_5 )
            // InternalDSL.g:1022:3: rule__Project__ConsistOfAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Project__ConsistOfAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getConsistOfAssignment_5()); 

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
    // InternalDSL.g:1030:1: rule__Project__Group__6 : rule__Project__Group__6__Impl ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1034:1: ( rule__Project__Group__6__Impl )
            // InternalDSL.g:1035:2: rule__Project__Group__6__Impl
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
    // InternalDSL.g:1041:1: rule__Project__Group__6__Impl : ( ( rule__Project__ConsistOfAssignment_6 )* ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1045:1: ( ( ( rule__Project__ConsistOfAssignment_6 )* ) )
            // InternalDSL.g:1046:1: ( ( rule__Project__ConsistOfAssignment_6 )* )
            {
            // InternalDSL.g:1046:1: ( ( rule__Project__ConsistOfAssignment_6 )* )
            // InternalDSL.g:1047:2: ( rule__Project__ConsistOfAssignment_6 )*
            {
             before(grammarAccess.getProjectAccess().getConsistOfAssignment_6()); 
            // InternalDSL.g:1048:2: ( rule__Project__ConsistOfAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==54) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDSL.g:1048:3: rule__Project__ConsistOfAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Project__ConsistOfAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getConsistOfAssignment_6()); 

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


    // $ANTLR start "rule__Background__Group__0"
    // InternalDSL.g:1057:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1061:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalDSL.g:1062:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Background__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__1();

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
    // $ANTLR end "rule__Background__Group__0"


    // $ANTLR start "rule__Background__Group__0__Impl"
    // InternalDSL.g:1069:1: rule__Background__Group__0__Impl : ( 'Given dashboard' ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1073:1: ( ( 'Given dashboard' ) )
            // InternalDSL.g:1074:1: ( 'Given dashboard' )
            {
            // InternalDSL.g:1074:1: ( 'Given dashboard' )
            // InternalDSL.g:1075:2: 'Given dashboard'
            {
             before(grammarAccess.getBackgroundAccess().getGivenDashboardKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getGivenDashboardKeyword_0()); 

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
    // $ANTLR end "rule__Background__Group__0__Impl"


    // $ANTLR start "rule__Background__Group__1"
    // InternalDSL.g:1084:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1088:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalDSL.g:1089:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Background__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__2();

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
    // $ANTLR end "rule__Background__Group__1"


    // $ANTLR start "rule__Background__Group__1__Impl"
    // InternalDSL.g:1096:1: rule__Background__Group__1__Impl : ( ( rule__Background__DashboardAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1100:1: ( ( ( rule__Background__DashboardAssignment_1 ) ) )
            // InternalDSL.g:1101:1: ( ( rule__Background__DashboardAssignment_1 ) )
            {
            // InternalDSL.g:1101:1: ( ( rule__Background__DashboardAssignment_1 ) )
            // InternalDSL.g:1102:2: ( rule__Background__DashboardAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getDashboardAssignment_1()); 
            // InternalDSL.g:1103:2: ( rule__Background__DashboardAssignment_1 )
            // InternalDSL.g:1103:3: rule__Background__DashboardAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Background__DashboardAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getDashboardAssignment_1()); 

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
    // $ANTLR end "rule__Background__Group__1__Impl"


    // $ANTLR start "rule__Background__Group__2"
    // InternalDSL.g:1111:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1115:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalDSL.g:1116:2: rule__Background__Group__2__Impl rule__Background__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Background__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__3();

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
    // $ANTLR end "rule__Background__Group__2"


    // $ANTLR start "rule__Background__Group__2__Impl"
    // InternalDSL.g:1123:1: rule__Background__Group__2__Impl : ( 'with views' ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1127:1: ( ( 'with views' ) )
            // InternalDSL.g:1128:1: ( 'with views' )
            {
            // InternalDSL.g:1128:1: ( 'with views' )
            // InternalDSL.g:1129:2: 'with views'
            {
             before(grammarAccess.getBackgroundAccess().getWithViewsKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getWithViewsKeyword_2()); 

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
    // $ANTLR end "rule__Background__Group__2__Impl"


    // $ANTLR start "rule__Background__Group__3"
    // InternalDSL.g:1138:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1142:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalDSL.g:1143:2: rule__Background__Group__3__Impl rule__Background__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Background__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__4();

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
    // $ANTLR end "rule__Background__Group__3"


    // $ANTLR start "rule__Background__Group__3__Impl"
    // InternalDSL.g:1150:1: rule__Background__Group__3__Impl : ( ( rule__Background__ViewAssignment_3 ) ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1154:1: ( ( ( rule__Background__ViewAssignment_3 ) ) )
            // InternalDSL.g:1155:1: ( ( rule__Background__ViewAssignment_3 ) )
            {
            // InternalDSL.g:1155:1: ( ( rule__Background__ViewAssignment_3 ) )
            // InternalDSL.g:1156:2: ( rule__Background__ViewAssignment_3 )
            {
             before(grammarAccess.getBackgroundAccess().getViewAssignment_3()); 
            // InternalDSL.g:1157:2: ( rule__Background__ViewAssignment_3 )
            // InternalDSL.g:1157:3: rule__Background__ViewAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Background__ViewAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getViewAssignment_3()); 

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
    // $ANTLR end "rule__Background__Group__3__Impl"


    // $ANTLR start "rule__Background__Group__4"
    // InternalDSL.g:1165:1: rule__Background__Group__4 : rule__Background__Group__4__Impl ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1169:1: ( rule__Background__Group__4__Impl )
            // InternalDSL.g:1170:2: rule__Background__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__4__Impl();

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
    // $ANTLR end "rule__Background__Group__4"


    // $ANTLR start "rule__Background__Group__4__Impl"
    // InternalDSL.g:1176:1: rule__Background__Group__4__Impl : ( ( rule__Background__ViewAssignment_4 )* ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1180:1: ( ( ( rule__Background__ViewAssignment_4 )* ) )
            // InternalDSL.g:1181:1: ( ( rule__Background__ViewAssignment_4 )* )
            {
            // InternalDSL.g:1181:1: ( ( rule__Background__ViewAssignment_4 )* )
            // InternalDSL.g:1182:2: ( rule__Background__ViewAssignment_4 )*
            {
             before(grammarAccess.getBackgroundAccess().getViewAssignment_4()); 
            // InternalDSL.g:1183:2: ( rule__Background__ViewAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:1183:3: rule__Background__ViewAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Background__ViewAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getViewAssignment_4()); 

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
    // $ANTLR end "rule__Background__Group__4__Impl"


    // $ANTLR start "rule__View__Group__0"
    // InternalDSL.g:1192:1: rule__View__Group__0 : rule__View__Group__0__Impl rule__View__Group__1 ;
    public final void rule__View__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1196:1: ( rule__View__Group__0__Impl rule__View__Group__1 )
            // InternalDSL.g:1197:2: rule__View__Group__0__Impl rule__View__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__View__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__1();

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
    // $ANTLR end "rule__View__Group__0"


    // $ANTLR start "rule__View__Group__0__Impl"
    // InternalDSL.g:1204:1: rule__View__Group__0__Impl : ( () ) ;
    public final void rule__View__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1208:1: ( ( () ) )
            // InternalDSL.g:1209:1: ( () )
            {
            // InternalDSL.g:1209:1: ( () )
            // InternalDSL.g:1210:2: ()
            {
             before(grammarAccess.getViewAccess().getViewAction_0()); 
            // InternalDSL.g:1211:2: ()
            // InternalDSL.g:1211:3: 
            {
            }

             after(grammarAccess.getViewAccess().getViewAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__0__Impl"


    // $ANTLR start "rule__View__Group__1"
    // InternalDSL.g:1219:1: rule__View__Group__1 : rule__View__Group__1__Impl rule__View__Group__2 ;
    public final void rule__View__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1223:1: ( rule__View__Group__1__Impl rule__View__Group__2 )
            // InternalDSL.g:1224:2: rule__View__Group__1__Impl rule__View__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__View__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__2();

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
    // $ANTLR end "rule__View__Group__1"


    // $ANTLR start "rule__View__Group__1__Impl"
    // InternalDSL.g:1231:1: rule__View__Group__1__Impl : ( ( rule__View__NameAssignment_1 ) ) ;
    public final void rule__View__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1235:1: ( ( ( rule__View__NameAssignment_1 ) ) )
            // InternalDSL.g:1236:1: ( ( rule__View__NameAssignment_1 ) )
            {
            // InternalDSL.g:1236:1: ( ( rule__View__NameAssignment_1 ) )
            // InternalDSL.g:1237:2: ( rule__View__NameAssignment_1 )
            {
             before(grammarAccess.getViewAccess().getNameAssignment_1()); 
            // InternalDSL.g:1238:2: ( rule__View__NameAssignment_1 )
            // InternalDSL.g:1238:3: rule__View__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__View__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__View__Group__1__Impl"


    // $ANTLR start "rule__View__Group__2"
    // InternalDSL.g:1246:1: rule__View__Group__2 : rule__View__Group__2__Impl ;
    public final void rule__View__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1250:1: ( rule__View__Group__2__Impl )
            // InternalDSL.g:1251:2: rule__View__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group__2__Impl();

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
    // $ANTLR end "rule__View__Group__2"


    // $ANTLR start "rule__View__Group__2__Impl"
    // InternalDSL.g:1257:1: rule__View__Group__2__Impl : ( ( rule__View__Group_2__0 )? ) ;
    public final void rule__View__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1261:1: ( ( ( rule__View__Group_2__0 )? ) )
            // InternalDSL.g:1262:1: ( ( rule__View__Group_2__0 )? )
            {
            // InternalDSL.g:1262:1: ( ( rule__View__Group_2__0 )? )
            // InternalDSL.g:1263:2: ( rule__View__Group_2__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_2()); 
            // InternalDSL.g:1264:2: ( rule__View__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==53) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDSL.g:1264:3: rule__View__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__View__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_2()); 

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
    // $ANTLR end "rule__View__Group__2__Impl"


    // $ANTLR start "rule__View__Group_2__0"
    // InternalDSL.g:1273:1: rule__View__Group_2__0 : rule__View__Group_2__0__Impl rule__View__Group_2__1 ;
    public final void rule__View__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1277:1: ( rule__View__Group_2__0__Impl rule__View__Group_2__1 )
            // InternalDSL.g:1278:2: rule__View__Group_2__0__Impl rule__View__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__View__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_2__1();

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
    // $ANTLR end "rule__View__Group_2__0"


    // $ANTLR start "rule__View__Group_2__0__Impl"
    // InternalDSL.g:1285:1: rule__View__Group_2__0__Impl : ( 'to' ) ;
    public final void rule__View__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1289:1: ( ( 'to' ) )
            // InternalDSL.g:1290:1: ( 'to' )
            {
            // InternalDSL.g:1290:1: ( 'to' )
            // InternalDSL.g:1291:2: 'to'
            {
             before(grammarAccess.getViewAccess().getToKeyword_2_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getToKeyword_2_0()); 

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
    // $ANTLR end "rule__View__Group_2__0__Impl"


    // $ANTLR start "rule__View__Group_2__1"
    // InternalDSL.g:1300:1: rule__View__Group_2__1 : rule__View__Group_2__1__Impl ;
    public final void rule__View__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1304:1: ( rule__View__Group_2__1__Impl )
            // InternalDSL.g:1305:2: rule__View__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group_2__1__Impl();

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
    // $ANTLR end "rule__View__Group_2__1"


    // $ANTLR start "rule__View__Group_2__1__Impl"
    // InternalDSL.g:1311:1: rule__View__Group_2__1__Impl : ( ( rule__View__DescAssignment_2_1 ) ) ;
    public final void rule__View__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1315:1: ( ( ( rule__View__DescAssignment_2_1 ) ) )
            // InternalDSL.g:1316:1: ( ( rule__View__DescAssignment_2_1 ) )
            {
            // InternalDSL.g:1316:1: ( ( rule__View__DescAssignment_2_1 ) )
            // InternalDSL.g:1317:2: ( rule__View__DescAssignment_2_1 )
            {
             before(grammarAccess.getViewAccess().getDescAssignment_2_1()); 
            // InternalDSL.g:1318:2: ( rule__View__DescAssignment_2_1 )
            // InternalDSL.g:1318:3: rule__View__DescAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__View__DescAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getDescAssignment_2_1()); 

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
    // $ANTLR end "rule__View__Group_2__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalDSL.g:1327:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1331:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalDSL.g:1332:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

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
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalDSL.g:1339:1: rule__Feature__Group__0__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1343:1: ( ( 'Feature:' ) )
            // InternalDSL.g:1344:1: ( 'Feature:' )
            {
            // InternalDSL.g:1344:1: ( 'Feature:' )
            // InternalDSL.g:1345:2: 'Feature:'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 

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
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalDSL.g:1354:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1358:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalDSL.g:1359:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

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
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalDSL.g:1366:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1370:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalDSL.g:1371:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalDSL.g:1371:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalDSL.g:1372:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalDSL.g:1373:2: ( rule__Feature__NameAssignment_1 )
            // InternalDSL.g:1373:3: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalDSL.g:1381:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1385:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalDSL.g:1386:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

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
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalDSL.g:1393:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__Group_2__0 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1397:1: ( ( ( rule__Feature__Group_2__0 )? ) )
            // InternalDSL.g:1398:1: ( ( rule__Feature__Group_2__0 )? )
            {
            // InternalDSL.g:1398:1: ( ( rule__Feature__Group_2__0 )? )
            // InternalDSL.g:1399:2: ( rule__Feature__Group_2__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_2()); 
            // InternalDSL.g:1400:2: ( rule__Feature__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==55) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:1400:3: rule__Feature__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalDSL.g:1408:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1412:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalDSL.g:1413:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

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
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalDSL.g:1420:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__SpecifiedByAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1424:1: ( ( ( rule__Feature__SpecifiedByAssignment_3 ) ) )
            // InternalDSL.g:1425:1: ( ( rule__Feature__SpecifiedByAssignment_3 ) )
            {
            // InternalDSL.g:1425:1: ( ( rule__Feature__SpecifiedByAssignment_3 ) )
            // InternalDSL.g:1426:2: ( rule__Feature__SpecifiedByAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getSpecifiedByAssignment_3()); 
            // InternalDSL.g:1427:2: ( rule__Feature__SpecifiedByAssignment_3 )
            // InternalDSL.g:1427:3: rule__Feature__SpecifiedByAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__SpecifiedByAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getSpecifiedByAssignment_3()); 

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
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // InternalDSL.g:1435:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1439:1: ( rule__Feature__Group__4__Impl )
            // InternalDSL.g:1440:2: rule__Feature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__4__Impl();

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
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // InternalDSL.g:1446:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__SpecifiedByAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1450:1: ( ( ( rule__Feature__SpecifiedByAssignment_4 )* ) )
            // InternalDSL.g:1451:1: ( ( rule__Feature__SpecifiedByAssignment_4 )* )
            {
            // InternalDSL.g:1451:1: ( ( rule__Feature__SpecifiedByAssignment_4 )* )
            // InternalDSL.g:1452:2: ( rule__Feature__SpecifiedByAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getSpecifiedByAssignment_4()); 
            // InternalDSL.g:1453:2: ( rule__Feature__SpecifiedByAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==56) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:1453:3: rule__Feature__SpecifiedByAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Feature__SpecifiedByAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getSpecifiedByAssignment_4()); 

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
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group_2__0"
    // InternalDSL.g:1462:1: rule__Feature__Group_2__0 : rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 ;
    public final void rule__Feature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1466:1: ( rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 )
            // InternalDSL.g:1467:2: rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Feature__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__1();

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
    // $ANTLR end "rule__Feature__Group_2__0"


    // $ANTLR start "rule__Feature__Group_2__0__Impl"
    // InternalDSL.g:1474:1: rule__Feature__Group_2__0__Impl : ( 'in order to' ) ;
    public final void rule__Feature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1478:1: ( ( 'in order to' ) )
            // InternalDSL.g:1479:1: ( 'in order to' )
            {
            // InternalDSL.g:1479:1: ( 'in order to' )
            // InternalDSL.g:1480:2: 'in order to'
            {
             before(grammarAccess.getFeatureAccess().getInOrderToKeyword_2_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getInOrderToKeyword_2_0()); 

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
    // $ANTLR end "rule__Feature__Group_2__0__Impl"


    // $ANTLR start "rule__Feature__Group_2__1"
    // InternalDSL.g:1489:1: rule__Feature__Group_2__1 : rule__Feature__Group_2__1__Impl ;
    public final void rule__Feature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1493:1: ( rule__Feature__Group_2__1__Impl )
            // InternalDSL.g:1494:2: rule__Feature__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__1__Impl();

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
    // $ANTLR end "rule__Feature__Group_2__1"


    // $ANTLR start "rule__Feature__Group_2__1__Impl"
    // InternalDSL.g:1500:1: rule__Feature__Group_2__1__Impl : ( ( rule__Feature__DescAssignment_2_1 ) ) ;
    public final void rule__Feature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1504:1: ( ( ( rule__Feature__DescAssignment_2_1 ) ) )
            // InternalDSL.g:1505:1: ( ( rule__Feature__DescAssignment_2_1 ) )
            {
            // InternalDSL.g:1505:1: ( ( rule__Feature__DescAssignment_2_1 ) )
            // InternalDSL.g:1506:2: ( rule__Feature__DescAssignment_2_1 )
            {
             before(grammarAccess.getFeatureAccess().getDescAssignment_2_1()); 
            // InternalDSL.g:1507:2: ( rule__Feature__DescAssignment_2_1 )
            // InternalDSL.g:1507:3: rule__Feature__DescAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__DescAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getDescAssignment_2_1()); 

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
    // $ANTLR end "rule__Feature__Group_2__1__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalDSL.g:1516:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1520:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalDSL.g:1521:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__1();

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
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // InternalDSL.g:1528:1: rule__Scenario__Group__0__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1532:1: ( ( 'Scenario:' ) )
            // InternalDSL.g:1533:1: ( 'Scenario:' )
            {
            // InternalDSL.g:1533:1: ( 'Scenario:' )
            // InternalDSL.g:1534:2: 'Scenario:'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); 

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
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // InternalDSL.g:1543:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1547:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalDSL.g:1548:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__2();

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
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // InternalDSL.g:1555:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__NameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1559:1: ( ( ( rule__Scenario__NameAssignment_1 ) ) )
            // InternalDSL.g:1560:1: ( ( rule__Scenario__NameAssignment_1 ) )
            {
            // InternalDSL.g:1560:1: ( ( rule__Scenario__NameAssignment_1 ) )
            // InternalDSL.g:1561:2: ( rule__Scenario__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1()); 
            // InternalDSL.g:1562:2: ( rule__Scenario__NameAssignment_1 )
            // InternalDSL.g:1562:3: rule__Scenario__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // InternalDSL.g:1570:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1574:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalDSL.g:1575:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__3();

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
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // InternalDSL.g:1582:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__Group_2__0 )? ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1586:1: ( ( ( rule__Scenario__Group_2__0 )? ) )
            // InternalDSL.g:1587:1: ( ( rule__Scenario__Group_2__0 )? )
            {
            // InternalDSL.g:1587:1: ( ( rule__Scenario__Group_2__0 )? )
            // InternalDSL.g:1588:2: ( rule__Scenario__Group_2__0 )?
            {
             before(grammarAccess.getScenarioAccess().getGroup_2()); 
            // InternalDSL.g:1589:2: ( rule__Scenario__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==59) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDSL.g:1589:3: rule__Scenario__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scenario__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScenarioAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // InternalDSL.g:1597:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1601:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalDSL.g:1602:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Scenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__4();

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
    // $ANTLR end "rule__Scenario__Group__3"


    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // InternalDSL.g:1609:1: rule__Scenario__Group__3__Impl : ( 'When' ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1613:1: ( ( 'When' ) )
            // InternalDSL.g:1614:1: ( 'When' )
            {
            // InternalDSL.g:1614:1: ( 'When' )
            // InternalDSL.g:1615:2: 'When'
            {
             before(grammarAccess.getScenarioAccess().getWhenKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getWhenKeyword_3()); 

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
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__4"
    // InternalDSL.g:1624:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1628:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalDSL.g:1629:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Scenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__5();

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
    // $ANTLR end "rule__Scenario__Group__4"


    // $ANTLR start "rule__Scenario__Group__4__Impl"
    // InternalDSL.g:1636:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__TriggerAssignment_4 ) ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1640:1: ( ( ( rule__Scenario__TriggerAssignment_4 ) ) )
            // InternalDSL.g:1641:1: ( ( rule__Scenario__TriggerAssignment_4 ) )
            {
            // InternalDSL.g:1641:1: ( ( rule__Scenario__TriggerAssignment_4 ) )
            // InternalDSL.g:1642:2: ( rule__Scenario__TriggerAssignment_4 )
            {
             before(grammarAccess.getScenarioAccess().getTriggerAssignment_4()); 
            // InternalDSL.g:1643:2: ( rule__Scenario__TriggerAssignment_4 )
            // InternalDSL.g:1643:3: rule__Scenario__TriggerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__TriggerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTriggerAssignment_4()); 

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
    // $ANTLR end "rule__Scenario__Group__4__Impl"


    // $ANTLR start "rule__Scenario__Group__5"
    // InternalDSL.g:1651:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl rule__Scenario__Group__6 ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1655:1: ( rule__Scenario__Group__5__Impl rule__Scenario__Group__6 )
            // InternalDSL.g:1656:2: rule__Scenario__Group__5__Impl rule__Scenario__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Scenario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__6();

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
    // $ANTLR end "rule__Scenario__Group__5"


    // $ANTLR start "rule__Scenario__Group__5__Impl"
    // InternalDSL.g:1663:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__Group_5__0 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1667:1: ( ( ( rule__Scenario__Group_5__0 )* ) )
            // InternalDSL.g:1668:1: ( ( rule__Scenario__Group_5__0 )* )
            {
            // InternalDSL.g:1668:1: ( ( rule__Scenario__Group_5__0 )* )
            // InternalDSL.g:1669:2: ( rule__Scenario__Group_5__0 )*
            {
             before(grammarAccess.getScenarioAccess().getGroup_5()); 
            // InternalDSL.g:1670:2: ( rule__Scenario__Group_5__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==60) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDSL.g:1670:3: rule__Scenario__Group_5__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Scenario__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Scenario__Group__5__Impl"


    // $ANTLR start "rule__Scenario__Group__6"
    // InternalDSL.g:1678:1: rule__Scenario__Group__6 : rule__Scenario__Group__6__Impl rule__Scenario__Group__7 ;
    public final void rule__Scenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1682:1: ( rule__Scenario__Group__6__Impl rule__Scenario__Group__7 )
            // InternalDSL.g:1683:2: rule__Scenario__Group__6__Impl rule__Scenario__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Scenario__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__7();

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
    // $ANTLR end "rule__Scenario__Group__6"


    // $ANTLR start "rule__Scenario__Group__6__Impl"
    // InternalDSL.g:1690:1: rule__Scenario__Group__6__Impl : ( 'Then' ) ;
    public final void rule__Scenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1694:1: ( ( 'Then' ) )
            // InternalDSL.g:1695:1: ( 'Then' )
            {
            // InternalDSL.g:1695:1: ( 'Then' )
            // InternalDSL.g:1696:2: 'Then'
            {
             before(grammarAccess.getScenarioAccess().getThenKeyword_6()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getThenKeyword_6()); 

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
    // $ANTLR end "rule__Scenario__Group__6__Impl"


    // $ANTLR start "rule__Scenario__Group__7"
    // InternalDSL.g:1705:1: rule__Scenario__Group__7 : rule__Scenario__Group__7__Impl rule__Scenario__Group__8 ;
    public final void rule__Scenario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1709:1: ( rule__Scenario__Group__7__Impl rule__Scenario__Group__8 )
            // InternalDSL.g:1710:2: rule__Scenario__Group__7__Impl rule__Scenario__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Scenario__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__8();

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
    // $ANTLR end "rule__Scenario__Group__7"


    // $ANTLR start "rule__Scenario__Group__7__Impl"
    // InternalDSL.g:1717:1: rule__Scenario__Group__7__Impl : ( ( rule__Scenario__OutcomeAssignment_7 ) ) ;
    public final void rule__Scenario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1721:1: ( ( ( rule__Scenario__OutcomeAssignment_7 ) ) )
            // InternalDSL.g:1722:1: ( ( rule__Scenario__OutcomeAssignment_7 ) )
            {
            // InternalDSL.g:1722:1: ( ( rule__Scenario__OutcomeAssignment_7 ) )
            // InternalDSL.g:1723:2: ( rule__Scenario__OutcomeAssignment_7 )
            {
             before(grammarAccess.getScenarioAccess().getOutcomeAssignment_7()); 
            // InternalDSL.g:1724:2: ( rule__Scenario__OutcomeAssignment_7 )
            // InternalDSL.g:1724:3: rule__Scenario__OutcomeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__OutcomeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getOutcomeAssignment_7()); 

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
    // $ANTLR end "rule__Scenario__Group__7__Impl"


    // $ANTLR start "rule__Scenario__Group__8"
    // InternalDSL.g:1732:1: rule__Scenario__Group__8 : rule__Scenario__Group__8__Impl ;
    public final void rule__Scenario__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1736:1: ( rule__Scenario__Group__8__Impl )
            // InternalDSL.g:1737:2: rule__Scenario__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__8__Impl();

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
    // $ANTLR end "rule__Scenario__Group__8"


    // $ANTLR start "rule__Scenario__Group__8__Impl"
    // InternalDSL.g:1743:1: rule__Scenario__Group__8__Impl : ( ( rule__Scenario__Group_8__0 )* ) ;
    public final void rule__Scenario__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1747:1: ( ( ( rule__Scenario__Group_8__0 )* ) )
            // InternalDSL.g:1748:1: ( ( rule__Scenario__Group_8__0 )* )
            {
            // InternalDSL.g:1748:1: ( ( rule__Scenario__Group_8__0 )* )
            // InternalDSL.g:1749:2: ( rule__Scenario__Group_8__0 )*
            {
             before(grammarAccess.getScenarioAccess().getGroup_8()); 
            // InternalDSL.g:1750:2: ( rule__Scenario__Group_8__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==60) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDSL.g:1750:3: rule__Scenario__Group_8__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Scenario__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Scenario__Group__8__Impl"


    // $ANTLR start "rule__Scenario__Group_2__0"
    // InternalDSL.g:1759:1: rule__Scenario__Group_2__0 : rule__Scenario__Group_2__0__Impl rule__Scenario__Group_2__1 ;
    public final void rule__Scenario__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1763:1: ( rule__Scenario__Group_2__0__Impl rule__Scenario__Group_2__1 )
            // InternalDSL.g:1764:2: rule__Scenario__Group_2__0__Impl rule__Scenario__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Scenario__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group_2__1();

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
    // $ANTLR end "rule__Scenario__Group_2__0"


    // $ANTLR start "rule__Scenario__Group_2__0__Impl"
    // InternalDSL.g:1771:1: rule__Scenario__Group_2__0__Impl : ( 'Given' ) ;
    public final void rule__Scenario__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1775:1: ( ( 'Given' ) )
            // InternalDSL.g:1776:1: ( 'Given' )
            {
            // InternalDSL.g:1776:1: ( 'Given' )
            // InternalDSL.g:1777:2: 'Given'
            {
             before(grammarAccess.getScenarioAccess().getGivenKeyword_2_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getGivenKeyword_2_0()); 

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
    // $ANTLR end "rule__Scenario__Group_2__0__Impl"


    // $ANTLR start "rule__Scenario__Group_2__1"
    // InternalDSL.g:1786:1: rule__Scenario__Group_2__1 : rule__Scenario__Group_2__1__Impl ;
    public final void rule__Scenario__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1790:1: ( rule__Scenario__Group_2__1__Impl )
            // InternalDSL.g:1791:2: rule__Scenario__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group_2__1__Impl();

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
    // $ANTLR end "rule__Scenario__Group_2__1"


    // $ANTLR start "rule__Scenario__Group_2__1__Impl"
    // InternalDSL.g:1797:1: rule__Scenario__Group_2__1__Impl : ( ( rule__Scenario__SystemAssignment_2_1 ) ) ;
    public final void rule__Scenario__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1801:1: ( ( ( rule__Scenario__SystemAssignment_2_1 ) ) )
            // InternalDSL.g:1802:1: ( ( rule__Scenario__SystemAssignment_2_1 ) )
            {
            // InternalDSL.g:1802:1: ( ( rule__Scenario__SystemAssignment_2_1 ) )
            // InternalDSL.g:1803:2: ( rule__Scenario__SystemAssignment_2_1 )
            {
             before(grammarAccess.getScenarioAccess().getSystemAssignment_2_1()); 
            // InternalDSL.g:1804:2: ( rule__Scenario__SystemAssignment_2_1 )
            // InternalDSL.g:1804:3: rule__Scenario__SystemAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__SystemAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getSystemAssignment_2_1()); 

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
    // $ANTLR end "rule__Scenario__Group_2__1__Impl"


    // $ANTLR start "rule__Scenario__Group_5__0"
    // InternalDSL.g:1813:1: rule__Scenario__Group_5__0 : rule__Scenario__Group_5__0__Impl rule__Scenario__Group_5__1 ;
    public final void rule__Scenario__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1817:1: ( rule__Scenario__Group_5__0__Impl rule__Scenario__Group_5__1 )
            // InternalDSL.g:1818:2: rule__Scenario__Group_5__0__Impl rule__Scenario__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Scenario__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group_5__1();

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
    // $ANTLR end "rule__Scenario__Group_5__0"


    // $ANTLR start "rule__Scenario__Group_5__0__Impl"
    // InternalDSL.g:1825:1: rule__Scenario__Group_5__0__Impl : ( 'And' ) ;
    public final void rule__Scenario__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1829:1: ( ( 'And' ) )
            // InternalDSL.g:1830:1: ( 'And' )
            {
            // InternalDSL.g:1830:1: ( 'And' )
            // InternalDSL.g:1831:2: 'And'
            {
             before(grammarAccess.getScenarioAccess().getAndKeyword_5_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getAndKeyword_5_0()); 

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
    // $ANTLR end "rule__Scenario__Group_5__0__Impl"


    // $ANTLR start "rule__Scenario__Group_5__1"
    // InternalDSL.g:1840:1: rule__Scenario__Group_5__1 : rule__Scenario__Group_5__1__Impl ;
    public final void rule__Scenario__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1844:1: ( rule__Scenario__Group_5__1__Impl )
            // InternalDSL.g:1845:2: rule__Scenario__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group_5__1__Impl();

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
    // $ANTLR end "rule__Scenario__Group_5__1"


    // $ANTLR start "rule__Scenario__Group_5__1__Impl"
    // InternalDSL.g:1851:1: rule__Scenario__Group_5__1__Impl : ( ( rule__Scenario__TriggerAssignment_5_1 ) ) ;
    public final void rule__Scenario__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1855:1: ( ( ( rule__Scenario__TriggerAssignment_5_1 ) ) )
            // InternalDSL.g:1856:1: ( ( rule__Scenario__TriggerAssignment_5_1 ) )
            {
            // InternalDSL.g:1856:1: ( ( rule__Scenario__TriggerAssignment_5_1 ) )
            // InternalDSL.g:1857:2: ( rule__Scenario__TriggerAssignment_5_1 )
            {
             before(grammarAccess.getScenarioAccess().getTriggerAssignment_5_1()); 
            // InternalDSL.g:1858:2: ( rule__Scenario__TriggerAssignment_5_1 )
            // InternalDSL.g:1858:3: rule__Scenario__TriggerAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__TriggerAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTriggerAssignment_5_1()); 

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
    // $ANTLR end "rule__Scenario__Group_5__1__Impl"


    // $ANTLR start "rule__Scenario__Group_8__0"
    // InternalDSL.g:1867:1: rule__Scenario__Group_8__0 : rule__Scenario__Group_8__0__Impl rule__Scenario__Group_8__1 ;
    public final void rule__Scenario__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1871:1: ( rule__Scenario__Group_8__0__Impl rule__Scenario__Group_8__1 )
            // InternalDSL.g:1872:2: rule__Scenario__Group_8__0__Impl rule__Scenario__Group_8__1
            {
            pushFollow(FOLLOW_18);
            rule__Scenario__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group_8__1();

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
    // $ANTLR end "rule__Scenario__Group_8__0"


    // $ANTLR start "rule__Scenario__Group_8__0__Impl"
    // InternalDSL.g:1879:1: rule__Scenario__Group_8__0__Impl : ( 'And' ) ;
    public final void rule__Scenario__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1883:1: ( ( 'And' ) )
            // InternalDSL.g:1884:1: ( 'And' )
            {
            // InternalDSL.g:1884:1: ( 'And' )
            // InternalDSL.g:1885:2: 'And'
            {
             before(grammarAccess.getScenarioAccess().getAndKeyword_8_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getAndKeyword_8_0()); 

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
    // $ANTLR end "rule__Scenario__Group_8__0__Impl"


    // $ANTLR start "rule__Scenario__Group_8__1"
    // InternalDSL.g:1894:1: rule__Scenario__Group_8__1 : rule__Scenario__Group_8__1__Impl ;
    public final void rule__Scenario__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1898:1: ( rule__Scenario__Group_8__1__Impl )
            // InternalDSL.g:1899:2: rule__Scenario__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group_8__1__Impl();

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
    // $ANTLR end "rule__Scenario__Group_8__1"


    // $ANTLR start "rule__Scenario__Group_8__1__Impl"
    // InternalDSL.g:1905:1: rule__Scenario__Group_8__1__Impl : ( ( rule__Scenario__OutcomeAssignment_8_1 ) ) ;
    public final void rule__Scenario__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1909:1: ( ( ( rule__Scenario__OutcomeAssignment_8_1 ) ) )
            // InternalDSL.g:1910:1: ( ( rule__Scenario__OutcomeAssignment_8_1 ) )
            {
            // InternalDSL.g:1910:1: ( ( rule__Scenario__OutcomeAssignment_8_1 ) )
            // InternalDSL.g:1911:2: ( rule__Scenario__OutcomeAssignment_8_1 )
            {
             before(grammarAccess.getScenarioAccess().getOutcomeAssignment_8_1()); 
            // InternalDSL.g:1912:2: ( rule__Scenario__OutcomeAssignment_8_1 )
            // InternalDSL.g:1912:3: rule__Scenario__OutcomeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__OutcomeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getOutcomeAssignment_8_1()); 

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
    // $ANTLR end "rule__Scenario__Group_8__1__Impl"


    // $ANTLR start "rule__Given__Group__0"
    // InternalDSL.g:1921:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1925:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalDSL.g:1926:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Given__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__1();

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
    // $ANTLR end "rule__Given__Group__0"


    // $ANTLR start "rule__Given__Group__0__Impl"
    // InternalDSL.g:1933:1: rule__Given__Group__0__Impl : ( 'Given' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1937:1: ( ( 'Given' ) )
            // InternalDSL.g:1938:1: ( 'Given' )
            {
            // InternalDSL.g:1938:1: ( 'Given' )
            // InternalDSL.g:1939:2: 'Given'
            {
             before(grammarAccess.getGivenAccess().getGivenKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getGivenKeyword_0()); 

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
    // $ANTLR end "rule__Given__Group__0__Impl"


    // $ANTLR start "rule__Given__Group__1"
    // InternalDSL.g:1948:1: rule__Given__Group__1 : rule__Given__Group__1__Impl rule__Given__Group__2 ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1952:1: ( rule__Given__Group__1__Impl rule__Given__Group__2 )
            // InternalDSL.g:1953:2: rule__Given__Group__1__Impl rule__Given__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Given__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__2();

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
    // $ANTLR end "rule__Given__Group__1"


    // $ANTLR start "rule__Given__Group__1__Impl"
    // InternalDSL.g:1960:1: rule__Given__Group__1__Impl : ( ( rule__Given__DashboardAssignment_1 ) ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1964:1: ( ( ( rule__Given__DashboardAssignment_1 ) ) )
            // InternalDSL.g:1965:1: ( ( rule__Given__DashboardAssignment_1 ) )
            {
            // InternalDSL.g:1965:1: ( ( rule__Given__DashboardAssignment_1 ) )
            // InternalDSL.g:1966:2: ( rule__Given__DashboardAssignment_1 )
            {
             before(grammarAccess.getGivenAccess().getDashboardAssignment_1()); 
            // InternalDSL.g:1967:2: ( rule__Given__DashboardAssignment_1 )
            // InternalDSL.g:1967:3: rule__Given__DashboardAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Given__DashboardAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getDashboardAssignment_1()); 

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
    // $ANTLR end "rule__Given__Group__1__Impl"


    // $ANTLR start "rule__Given__Group__2"
    // InternalDSL.g:1975:1: rule__Given__Group__2 : rule__Given__Group__2__Impl ;
    public final void rule__Given__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1979:1: ( rule__Given__Group__2__Impl )
            // InternalDSL.g:1980:2: rule__Given__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__2__Impl();

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
    // $ANTLR end "rule__Given__Group__2"


    // $ANTLR start "rule__Given__Group__2__Impl"
    // InternalDSL.g:1986:1: rule__Given__Group__2__Impl : ( ( rule__Given__Group_2__0 )? ) ;
    public final void rule__Given__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1990:1: ( ( ( rule__Given__Group_2__0 )? ) )
            // InternalDSL.g:1991:1: ( ( rule__Given__Group_2__0 )? )
            {
            // InternalDSL.g:1991:1: ( ( rule__Given__Group_2__0 )? )
            // InternalDSL.g:1992:2: ( rule__Given__Group_2__0 )?
            {
             before(grammarAccess.getGivenAccess().getGroup_2()); 
            // InternalDSL.g:1993:2: ( rule__Given__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==61) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDSL.g:1993:3: rule__Given__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Given__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGivenAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Given__Group__2__Impl"


    // $ANTLR start "rule__Given__Group_2__0"
    // InternalDSL.g:2002:1: rule__Given__Group_2__0 : rule__Given__Group_2__0__Impl rule__Given__Group_2__1 ;
    public final void rule__Given__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2006:1: ( rule__Given__Group_2__0__Impl rule__Given__Group_2__1 )
            // InternalDSL.g:2007:2: rule__Given__Group_2__0__Impl rule__Given__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Given__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group_2__1();

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
    // $ANTLR end "rule__Given__Group_2__0"


    // $ANTLR start "rule__Given__Group_2__0__Impl"
    // InternalDSL.g:2014:1: rule__Given__Group_2__0__Impl : ( ' with available data' ) ;
    public final void rule__Given__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2018:1: ( ( ' with available data' ) )
            // InternalDSL.g:2019:1: ( ' with available data' )
            {
            // InternalDSL.g:2019:1: ( ' with available data' )
            // InternalDSL.g:2020:2: ' with available data'
            {
             before(grammarAccess.getGivenAccess().getWithAvailableDataKeyword_2_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getWithAvailableDataKeyword_2_0()); 

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
    // $ANTLR end "rule__Given__Group_2__0__Impl"


    // $ANTLR start "rule__Given__Group_2__1"
    // InternalDSL.g:2029:1: rule__Given__Group_2__1 : rule__Given__Group_2__1__Impl rule__Given__Group_2__2 ;
    public final void rule__Given__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2033:1: ( rule__Given__Group_2__1__Impl rule__Given__Group_2__2 )
            // InternalDSL.g:2034:2: rule__Given__Group_2__1__Impl rule__Given__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__Given__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group_2__2();

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
    // $ANTLR end "rule__Given__Group_2__1"


    // $ANTLR start "rule__Given__Group_2__1__Impl"
    // InternalDSL.g:2041:1: rule__Given__Group_2__1__Impl : ( ( rule__Given__DataAssignment_2_1 ) ) ;
    public final void rule__Given__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2045:1: ( ( ( rule__Given__DataAssignment_2_1 ) ) )
            // InternalDSL.g:2046:1: ( ( rule__Given__DataAssignment_2_1 ) )
            {
            // InternalDSL.g:2046:1: ( ( rule__Given__DataAssignment_2_1 ) )
            // InternalDSL.g:2047:2: ( rule__Given__DataAssignment_2_1 )
            {
             before(grammarAccess.getGivenAccess().getDataAssignment_2_1()); 
            // InternalDSL.g:2048:2: ( rule__Given__DataAssignment_2_1 )
            // InternalDSL.g:2048:3: rule__Given__DataAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Given__DataAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getDataAssignment_2_1()); 

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
    // $ANTLR end "rule__Given__Group_2__1__Impl"


    // $ANTLR start "rule__Given__Group_2__2"
    // InternalDSL.g:2056:1: rule__Given__Group_2__2 : rule__Given__Group_2__2__Impl ;
    public final void rule__Given__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2060:1: ( rule__Given__Group_2__2__Impl )
            // InternalDSL.g:2061:2: rule__Given__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group_2__2__Impl();

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
    // $ANTLR end "rule__Given__Group_2__2"


    // $ANTLR start "rule__Given__Group_2__2__Impl"
    // InternalDSL.g:2067:1: rule__Given__Group_2__2__Impl : ( ( rule__Given__Group_2_2__0 )* ) ;
    public final void rule__Given__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2071:1: ( ( ( rule__Given__Group_2_2__0 )* ) )
            // InternalDSL.g:2072:1: ( ( rule__Given__Group_2_2__0 )* )
            {
            // InternalDSL.g:2072:1: ( ( rule__Given__Group_2_2__0 )* )
            // InternalDSL.g:2073:2: ( rule__Given__Group_2_2__0 )*
            {
             before(grammarAccess.getGivenAccess().getGroup_2_2()); 
            // InternalDSL.g:2074:2: ( rule__Given__Group_2_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==62) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDSL.g:2074:3: rule__Given__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Given__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getGivenAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__Given__Group_2__2__Impl"


    // $ANTLR start "rule__Given__Group_2_2__0"
    // InternalDSL.g:2083:1: rule__Given__Group_2_2__0 : rule__Given__Group_2_2__0__Impl rule__Given__Group_2_2__1 ;
    public final void rule__Given__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2087:1: ( rule__Given__Group_2_2__0__Impl rule__Given__Group_2_2__1 )
            // InternalDSL.g:2088:2: rule__Given__Group_2_2__0__Impl rule__Given__Group_2_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Given__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group_2_2__1();

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
    // $ANTLR end "rule__Given__Group_2_2__0"


    // $ANTLR start "rule__Given__Group_2_2__0__Impl"
    // InternalDSL.g:2095:1: rule__Given__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Given__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2099:1: ( ( ',' ) )
            // InternalDSL.g:2100:1: ( ',' )
            {
            // InternalDSL.g:2100:1: ( ',' )
            // InternalDSL.g:2101:2: ','
            {
             before(grammarAccess.getGivenAccess().getCommaKeyword_2_2_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Given__Group_2_2__0__Impl"


    // $ANTLR start "rule__Given__Group_2_2__1"
    // InternalDSL.g:2110:1: rule__Given__Group_2_2__1 : rule__Given__Group_2_2__1__Impl ;
    public final void rule__Given__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2114:1: ( rule__Given__Group_2_2__1__Impl )
            // InternalDSL.g:2115:2: rule__Given__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Given__Group_2_2__1"


    // $ANTLR start "rule__Given__Group_2_2__1__Impl"
    // InternalDSL.g:2121:1: rule__Given__Group_2_2__1__Impl : ( ( rule__Given__DataAssignment_2_2_1 ) ) ;
    public final void rule__Given__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2125:1: ( ( ( rule__Given__DataAssignment_2_2_1 ) ) )
            // InternalDSL.g:2126:1: ( ( rule__Given__DataAssignment_2_2_1 ) )
            {
            // InternalDSL.g:2126:1: ( ( rule__Given__DataAssignment_2_2_1 ) )
            // InternalDSL.g:2127:2: ( rule__Given__DataAssignment_2_2_1 )
            {
             before(grammarAccess.getGivenAccess().getDataAssignment_2_2_1()); 
            // InternalDSL.g:2128:2: ( rule__Given__DataAssignment_2_2_1 )
            // InternalDSL.g:2128:3: rule__Given__DataAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Given__DataAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getDataAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Given__Group_2_2__1__Impl"


    // $ANTLR start "rule__Data__Group__0"
    // InternalDSL.g:2137:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2141:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalDSL.g:2142:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__1();

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
    // $ANTLR end "rule__Data__Group__0"


    // $ANTLR start "rule__Data__Group__0__Impl"
    // InternalDSL.g:2149:1: rule__Data__Group__0__Impl : ( () ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2153:1: ( ( () ) )
            // InternalDSL.g:2154:1: ( () )
            {
            // InternalDSL.g:2154:1: ( () )
            // InternalDSL.g:2155:2: ()
            {
             before(grammarAccess.getDataAccess().getDataAction_0()); 
            // InternalDSL.g:2156:2: ()
            // InternalDSL.g:2156:3: 
            {
            }

             after(grammarAccess.getDataAccess().getDataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__0__Impl"


    // $ANTLR start "rule__Data__Group__1"
    // InternalDSL.g:2164:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2168:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalDSL.g:2169:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Data__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__2();

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
    // $ANTLR end "rule__Data__Group__1"


    // $ANTLR start "rule__Data__Group__1__Impl"
    // InternalDSL.g:2176:1: rule__Data__Group__1__Impl : ( ( rule__Data__QuantifierAssignment_1 )? ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2180:1: ( ( ( rule__Data__QuantifierAssignment_1 )? ) )
            // InternalDSL.g:2181:1: ( ( rule__Data__QuantifierAssignment_1 )? )
            {
            // InternalDSL.g:2181:1: ( ( rule__Data__QuantifierAssignment_1 )? )
            // InternalDSL.g:2182:2: ( rule__Data__QuantifierAssignment_1 )?
            {
             before(grammarAccess.getDataAccess().getQuantifierAssignment_1()); 
            // InternalDSL.g:2183:2: ( rule__Data__QuantifierAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=24 && LA22_0<=26)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDSL.g:2183:3: rule__Data__QuantifierAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__QuantifierAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getQuantifierAssignment_1()); 

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
    // $ANTLR end "rule__Data__Group__1__Impl"


    // $ANTLR start "rule__Data__Group__2"
    // InternalDSL.g:2191:1: rule__Data__Group__2 : rule__Data__Group__2__Impl rule__Data__Group__3 ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2195:1: ( rule__Data__Group__2__Impl rule__Data__Group__3 )
            // InternalDSL.g:2196:2: rule__Data__Group__2__Impl rule__Data__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Data__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__3();

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
    // $ANTLR end "rule__Data__Group__2"


    // $ANTLR start "rule__Data__Group__2__Impl"
    // InternalDSL.g:2203:1: rule__Data__Group__2__Impl : ( ( rule__Data__Group_2__0 )? ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2207:1: ( ( ( rule__Data__Group_2__0 )? ) )
            // InternalDSL.g:2208:1: ( ( rule__Data__Group_2__0 )? )
            {
            // InternalDSL.g:2208:1: ( ( rule__Data__Group_2__0 )? )
            // InternalDSL.g:2209:2: ( rule__Data__Group_2__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_2()); 
            // InternalDSL.g:2210:2: ( rule__Data__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==63) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDSL.g:2210:3: rule__Data__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Data__Group__2__Impl"


    // $ANTLR start "rule__Data__Group__3"
    // InternalDSL.g:2218:1: rule__Data__Group__3 : rule__Data__Group__3__Impl ;
    public final void rule__Data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2222:1: ( rule__Data__Group__3__Impl )
            // InternalDSL.g:2223:2: rule__Data__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__3__Impl();

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
    // $ANTLR end "rule__Data__Group__3"


    // $ANTLR start "rule__Data__Group__3__Impl"
    // InternalDSL.g:2229:1: rule__Data__Group__3__Impl : ( ( rule__Data__Group_3__0 )? ) ;
    public final void rule__Data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2233:1: ( ( ( rule__Data__Group_3__0 )? ) )
            // InternalDSL.g:2234:1: ( ( rule__Data__Group_3__0 )? )
            {
            // InternalDSL.g:2234:1: ( ( rule__Data__Group_3__0 )? )
            // InternalDSL.g:2235:2: ( rule__Data__Group_3__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_3()); 
            // InternalDSL.g:2236:2: ( rule__Data__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==64) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDSL.g:2236:3: rule__Data__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Data__Group__3__Impl"


    // $ANTLR start "rule__Data__Group_2__0"
    // InternalDSL.g:2245:1: rule__Data__Group_2__0 : rule__Data__Group_2__0__Impl rule__Data__Group_2__1 ;
    public final void rule__Data__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2249:1: ( rule__Data__Group_2__0__Impl rule__Data__Group_2__1 )
            // InternalDSL.g:2250:2: rule__Data__Group_2__0__Impl rule__Data__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__Data__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_2__1();

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
    // $ANTLR end "rule__Data__Group_2__0"


    // $ANTLR start "rule__Data__Group_2__0__Impl"
    // InternalDSL.g:2257:1: rule__Data__Group_2__0__Impl : ( 'type' ) ;
    public final void rule__Data__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2261:1: ( ( 'type' ) )
            // InternalDSL.g:2262:1: ( 'type' )
            {
            // InternalDSL.g:2262:1: ( 'type' )
            // InternalDSL.g:2263:2: 'type'
            {
             before(grammarAccess.getDataAccess().getTypeKeyword_2_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getTypeKeyword_2_0()); 

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
    // $ANTLR end "rule__Data__Group_2__0__Impl"


    // $ANTLR start "rule__Data__Group_2__1"
    // InternalDSL.g:2272:1: rule__Data__Group_2__1 : rule__Data__Group_2__1__Impl ;
    public final void rule__Data__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2276:1: ( rule__Data__Group_2__1__Impl )
            // InternalDSL.g:2277:2: rule__Data__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_2__1__Impl();

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
    // $ANTLR end "rule__Data__Group_2__1"


    // $ANTLR start "rule__Data__Group_2__1__Impl"
    // InternalDSL.g:2283:1: rule__Data__Group_2__1__Impl : ( ( rule__Data__TypeAssignment_2_1 ) ) ;
    public final void rule__Data__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2287:1: ( ( ( rule__Data__TypeAssignment_2_1 ) ) )
            // InternalDSL.g:2288:1: ( ( rule__Data__TypeAssignment_2_1 ) )
            {
            // InternalDSL.g:2288:1: ( ( rule__Data__TypeAssignment_2_1 ) )
            // InternalDSL.g:2289:2: ( rule__Data__TypeAssignment_2_1 )
            {
             before(grammarAccess.getDataAccess().getTypeAssignment_2_1()); 
            // InternalDSL.g:2290:2: ( rule__Data__TypeAssignment_2_1 )
            // InternalDSL.g:2290:3: rule__Data__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__Data__Group_2__1__Impl"


    // $ANTLR start "rule__Data__Group_3__0"
    // InternalDSL.g:2299:1: rule__Data__Group_3__0 : rule__Data__Group_3__0__Impl rule__Data__Group_3__1 ;
    public final void rule__Data__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2303:1: ( rule__Data__Group_3__0__Impl rule__Data__Group_3__1 )
            // InternalDSL.g:2304:2: rule__Data__Group_3__0__Impl rule__Data__Group_3__1
            {
            pushFollow(FOLLOW_26);
            rule__Data__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_3__1();

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
    // $ANTLR end "rule__Data__Group_3__0"


    // $ANTLR start "rule__Data__Group_3__0__Impl"
    // InternalDSL.g:2311:1: rule__Data__Group_3__0__Impl : ( 'located in' ) ;
    public final void rule__Data__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2315:1: ( ( 'located in' ) )
            // InternalDSL.g:2316:1: ( 'located in' )
            {
            // InternalDSL.g:2316:1: ( 'located in' )
            // InternalDSL.g:2317:2: 'located in'
            {
             before(grammarAccess.getDataAccess().getLocatedInKeyword_3_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getLocatedInKeyword_3_0()); 

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
    // $ANTLR end "rule__Data__Group_3__0__Impl"


    // $ANTLR start "rule__Data__Group_3__1"
    // InternalDSL.g:2326:1: rule__Data__Group_3__1 : rule__Data__Group_3__1__Impl rule__Data__Group_3__2 ;
    public final void rule__Data__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2330:1: ( rule__Data__Group_3__1__Impl rule__Data__Group_3__2 )
            // InternalDSL.g:2331:2: rule__Data__Group_3__1__Impl rule__Data__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__Data__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_3__2();

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
    // $ANTLR end "rule__Data__Group_3__1"


    // $ANTLR start "rule__Data__Group_3__1__Impl"
    // InternalDSL.g:2338:1: rule__Data__Group_3__1__Impl : ( ( rule__Data__LocationTypeAssignment_3_1 ) ) ;
    public final void rule__Data__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2342:1: ( ( ( rule__Data__LocationTypeAssignment_3_1 ) ) )
            // InternalDSL.g:2343:1: ( ( rule__Data__LocationTypeAssignment_3_1 ) )
            {
            // InternalDSL.g:2343:1: ( ( rule__Data__LocationTypeAssignment_3_1 ) )
            // InternalDSL.g:2344:2: ( rule__Data__LocationTypeAssignment_3_1 )
            {
             before(grammarAccess.getDataAccess().getLocationTypeAssignment_3_1()); 
            // InternalDSL.g:2345:2: ( rule__Data__LocationTypeAssignment_3_1 )
            // InternalDSL.g:2345:3: rule__Data__LocationTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__LocationTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getLocationTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Data__Group_3__1__Impl"


    // $ANTLR start "rule__Data__Group_3__2"
    // InternalDSL.g:2353:1: rule__Data__Group_3__2 : rule__Data__Group_3__2__Impl ;
    public final void rule__Data__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2357:1: ( rule__Data__Group_3__2__Impl )
            // InternalDSL.g:2358:2: rule__Data__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_3__2__Impl();

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
    // $ANTLR end "rule__Data__Group_3__2"


    // $ANTLR start "rule__Data__Group_3__2__Impl"
    // InternalDSL.g:2364:1: rule__Data__Group_3__2__Impl : ( ( rule__Data__LocationAssignment_3_2 ) ) ;
    public final void rule__Data__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2368:1: ( ( ( rule__Data__LocationAssignment_3_2 ) ) )
            // InternalDSL.g:2369:1: ( ( rule__Data__LocationAssignment_3_2 ) )
            {
            // InternalDSL.g:2369:1: ( ( rule__Data__LocationAssignment_3_2 ) )
            // InternalDSL.g:2370:2: ( rule__Data__LocationAssignment_3_2 )
            {
             before(grammarAccess.getDataAccess().getLocationAssignment_3_2()); 
            // InternalDSL.g:2371:2: ( rule__Data__LocationAssignment_3_2 )
            // InternalDSL.g:2371:3: rule__Data__LocationAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Data__LocationAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getLocationAssignment_3_2()); 

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
    // $ANTLR end "rule__Data__Group_3__2__Impl"


    // $ANTLR start "rule__Loading__Group__0"
    // InternalDSL.g:2380:1: rule__Loading__Group__0 : rule__Loading__Group__0__Impl rule__Loading__Group__1 ;
    public final void rule__Loading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2384:1: ( rule__Loading__Group__0__Impl rule__Loading__Group__1 )
            // InternalDSL.g:2385:2: rule__Loading__Group__0__Impl rule__Loading__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Loading__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loading__Group__1();

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
    // $ANTLR end "rule__Loading__Group__0"


    // $ANTLR start "rule__Loading__Group__0__Impl"
    // InternalDSL.g:2392:1: rule__Loading__Group__0__Impl : ( ( rule__Loading__ContextAssignment_0 ) ) ;
    public final void rule__Loading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2396:1: ( ( ( rule__Loading__ContextAssignment_0 ) ) )
            // InternalDSL.g:2397:1: ( ( rule__Loading__ContextAssignment_0 ) )
            {
            // InternalDSL.g:2397:1: ( ( rule__Loading__ContextAssignment_0 ) )
            // InternalDSL.g:2398:2: ( rule__Loading__ContextAssignment_0 )
            {
             before(grammarAccess.getLoadingAccess().getContextAssignment_0()); 
            // InternalDSL.g:2399:2: ( rule__Loading__ContextAssignment_0 )
            // InternalDSL.g:2399:3: rule__Loading__ContextAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Loading__ContextAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLoadingAccess().getContextAssignment_0()); 

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
    // $ANTLR end "rule__Loading__Group__0__Impl"


    // $ANTLR start "rule__Loading__Group__1"
    // InternalDSL.g:2407:1: rule__Loading__Group__1 : rule__Loading__Group__1__Impl rule__Loading__Group__2 ;
    public final void rule__Loading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2411:1: ( rule__Loading__Group__1__Impl rule__Loading__Group__2 )
            // InternalDSL.g:2412:2: rule__Loading__Group__1__Impl rule__Loading__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Loading__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loading__Group__2();

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
    // $ANTLR end "rule__Loading__Group__1"


    // $ANTLR start "rule__Loading__Group__1__Impl"
    // InternalDSL.g:2419:1: rule__Loading__Group__1__Impl : ( 'is' ) ;
    public final void rule__Loading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2423:1: ( ( 'is' ) )
            // InternalDSL.g:2424:1: ( 'is' )
            {
            // InternalDSL.g:2424:1: ( 'is' )
            // InternalDSL.g:2425:2: 'is'
            {
             before(grammarAccess.getLoadingAccess().getIsKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getLoadingAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__Loading__Group__1__Impl"


    // $ANTLR start "rule__Loading__Group__2"
    // InternalDSL.g:2434:1: rule__Loading__Group__2 : rule__Loading__Group__2__Impl ;
    public final void rule__Loading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2438:1: ( rule__Loading__Group__2__Impl )
            // InternalDSL.g:2439:2: rule__Loading__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loading__Group__2__Impl();

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
    // $ANTLR end "rule__Loading__Group__2"


    // $ANTLR start "rule__Loading__Group__2__Impl"
    // InternalDSL.g:2445:1: rule__Loading__Group__2__Impl : ( ( rule__Loading__NewAssignment_2 ) ) ;
    public final void rule__Loading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2449:1: ( ( ( rule__Loading__NewAssignment_2 ) ) )
            // InternalDSL.g:2450:1: ( ( rule__Loading__NewAssignment_2 ) )
            {
            // InternalDSL.g:2450:1: ( ( rule__Loading__NewAssignment_2 ) )
            // InternalDSL.g:2451:2: ( rule__Loading__NewAssignment_2 )
            {
             before(grammarAccess.getLoadingAccess().getNewAssignment_2()); 
            // InternalDSL.g:2452:2: ( rule__Loading__NewAssignment_2 )
            // InternalDSL.g:2452:3: rule__Loading__NewAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Loading__NewAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLoadingAccess().getNewAssignment_2()); 

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
    // $ANTLR end "rule__Loading__Group__2__Impl"


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalDSL.g:2461:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2465:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalDSL.g:2466:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Interaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__1();

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
    // $ANTLR end "rule__Interaction__Group__0"


    // $ANTLR start "rule__Interaction__Group__0__Impl"
    // InternalDSL.g:2473:1: rule__Interaction__Group__0__Impl : ( ( rule__Interaction__ActionAssignment_0 ) ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2477:1: ( ( ( rule__Interaction__ActionAssignment_0 ) ) )
            // InternalDSL.g:2478:1: ( ( rule__Interaction__ActionAssignment_0 ) )
            {
            // InternalDSL.g:2478:1: ( ( rule__Interaction__ActionAssignment_0 ) )
            // InternalDSL.g:2479:2: ( rule__Interaction__ActionAssignment_0 )
            {
             before(grammarAccess.getInteractionAccess().getActionAssignment_0()); 
            // InternalDSL.g:2480:2: ( rule__Interaction__ActionAssignment_0 )
            // InternalDSL.g:2480:3: rule__Interaction__ActionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__ActionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getActionAssignment_0()); 

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
    // $ANTLR end "rule__Interaction__Group__0__Impl"


    // $ANTLR start "rule__Interaction__Group__1"
    // InternalDSL.g:2488:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2492:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalDSL.g:2493:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Interaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__2();

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
    // $ANTLR end "rule__Interaction__Group__1"


    // $ANTLR start "rule__Interaction__Group__1__Impl"
    // InternalDSL.g:2500:1: rule__Interaction__Group__1__Impl : ( ( rule__Interaction__TargetAssignment_1 )? ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2504:1: ( ( ( rule__Interaction__TargetAssignment_1 )? ) )
            // InternalDSL.g:2505:1: ( ( rule__Interaction__TargetAssignment_1 )? )
            {
            // InternalDSL.g:2505:1: ( ( rule__Interaction__TargetAssignment_1 )? )
            // InternalDSL.g:2506:2: ( rule__Interaction__TargetAssignment_1 )?
            {
             before(grammarAccess.getInteractionAccess().getTargetAssignment_1()); 
            // InternalDSL.g:2507:2: ( rule__Interaction__TargetAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDSL.g:2507:3: rule__Interaction__TargetAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interaction__TargetAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInteractionAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__Interaction__Group__1__Impl"


    // $ANTLR start "rule__Interaction__Group__2"
    // InternalDSL.g:2515:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2519:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalDSL.g:2520:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Interaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__3();

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
    // $ANTLR end "rule__Interaction__Group__2"


    // $ANTLR start "rule__Interaction__Group__2__Impl"
    // InternalDSL.g:2527:1: rule__Interaction__Group__2__Impl : ( 'selected in' ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2531:1: ( ( 'selected in' ) )
            // InternalDSL.g:2532:1: ( 'selected in' )
            {
            // InternalDSL.g:2532:1: ( 'selected in' )
            // InternalDSL.g:2533:2: 'selected in'
            {
             before(grammarAccess.getInteractionAccess().getSelectedInKeyword_2()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getSelectedInKeyword_2()); 

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
    // $ANTLR end "rule__Interaction__Group__2__Impl"


    // $ANTLR start "rule__Interaction__Group__3"
    // InternalDSL.g:2542:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2546:1: ( rule__Interaction__Group__3__Impl )
            // InternalDSL.g:2547:2: rule__Interaction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__3__Impl();

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
    // $ANTLR end "rule__Interaction__Group__3"


    // $ANTLR start "rule__Interaction__Group__3__Impl"
    // InternalDSL.g:2553:1: rule__Interaction__Group__3__Impl : ( ( rule__Interaction__ContextAssignment_3 ) ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2557:1: ( ( ( rule__Interaction__ContextAssignment_3 ) ) )
            // InternalDSL.g:2558:1: ( ( rule__Interaction__ContextAssignment_3 ) )
            {
            // InternalDSL.g:2558:1: ( ( rule__Interaction__ContextAssignment_3 ) )
            // InternalDSL.g:2559:2: ( rule__Interaction__ContextAssignment_3 )
            {
             before(grammarAccess.getInteractionAccess().getContextAssignment_3()); 
            // InternalDSL.g:2560:2: ( rule__Interaction__ContextAssignment_3 )
            // InternalDSL.g:2560:3: rule__Interaction__ContextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__ContextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getContextAssignment_3()); 

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
    // $ANTLR end "rule__Interaction__Group__3__Impl"


    // $ANTLR start "rule__Update__Group__0"
    // InternalDSL.g:2569:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2573:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // InternalDSL.g:2574:2: rule__Update__Group__0__Impl rule__Update__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Update__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__1();

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
    // $ANTLR end "rule__Update__Group__0"


    // $ANTLR start "rule__Update__Group__0__Impl"
    // InternalDSL.g:2581:1: rule__Update__Group__0__Impl : ( ( rule__Update__TargetAssignment_0 ) ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2585:1: ( ( ( rule__Update__TargetAssignment_0 ) ) )
            // InternalDSL.g:2586:1: ( ( rule__Update__TargetAssignment_0 ) )
            {
            // InternalDSL.g:2586:1: ( ( rule__Update__TargetAssignment_0 ) )
            // InternalDSL.g:2587:2: ( rule__Update__TargetAssignment_0 )
            {
             before(grammarAccess.getUpdateAccess().getTargetAssignment_0()); 
            // InternalDSL.g:2588:2: ( rule__Update__TargetAssignment_0 )
            // InternalDSL.g:2588:3: rule__Update__TargetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Update__TargetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getTargetAssignment_0()); 

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
    // $ANTLR end "rule__Update__Group__0__Impl"


    // $ANTLR start "rule__Update__Group__1"
    // InternalDSL.g:2596:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2600:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // InternalDSL.g:2601:2: rule__Update__Group__1__Impl rule__Update__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Update__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__2();

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
    // $ANTLR end "rule__Update__Group__1"


    // $ANTLR start "rule__Update__Group__1__Impl"
    // InternalDSL.g:2608:1: rule__Update__Group__1__Impl : ( 'is' ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2612:1: ( ( 'is' ) )
            // InternalDSL.g:2613:1: ( 'is' )
            {
            // InternalDSL.g:2613:1: ( 'is' )
            // InternalDSL.g:2614:2: 'is'
            {
             before(grammarAccess.getUpdateAccess().getIsKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__Update__Group__1__Impl"


    // $ANTLR start "rule__Update__Group__2"
    // InternalDSL.g:2623:1: rule__Update__Group__2 : rule__Update__Group__2__Impl ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2627:1: ( rule__Update__Group__2__Impl )
            // InternalDSL.g:2628:2: rule__Update__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group__2__Impl();

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
    // $ANTLR end "rule__Update__Group__2"


    // $ANTLR start "rule__Update__Group__2__Impl"
    // InternalDSL.g:2634:1: rule__Update__Group__2__Impl : ( ( rule__Update__DoAssignment_2 ) ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2638:1: ( ( ( rule__Update__DoAssignment_2 ) ) )
            // InternalDSL.g:2639:1: ( ( rule__Update__DoAssignment_2 ) )
            {
            // InternalDSL.g:2639:1: ( ( rule__Update__DoAssignment_2 ) )
            // InternalDSL.g:2640:2: ( rule__Update__DoAssignment_2 )
            {
             before(grammarAccess.getUpdateAccess().getDoAssignment_2()); 
            // InternalDSL.g:2641:2: ( rule__Update__DoAssignment_2 )
            // InternalDSL.g:2641:3: rule__Update__DoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Update__DoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getDoAssignment_2()); 

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
    // $ANTLR end "rule__Update__Group__2__Impl"


    // $ANTLR start "rule__Goal__Group__0"
    // InternalDSL.g:2650:1: rule__Goal__Group__0 : rule__Goal__Group__0__Impl rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2654:1: ( rule__Goal__Group__0__Impl rule__Goal__Group__1 )
            // InternalDSL.g:2655:2: rule__Goal__Group__0__Impl rule__Goal__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Goal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group__1();

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
    // $ANTLR end "rule__Goal__Group__0"


    // $ANTLR start "rule__Goal__Group__0__Impl"
    // InternalDSL.g:2662:1: rule__Goal__Group__0__Impl : ( 'it is possible to see ' ) ;
    public final void rule__Goal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2666:1: ( ( 'it is possible to see ' ) )
            // InternalDSL.g:2667:1: ( 'it is possible to see ' )
            {
            // InternalDSL.g:2667:1: ( 'it is possible to see ' )
            // InternalDSL.g:2668:2: 'it is possible to see '
            {
             before(grammarAccess.getGoalAccess().getItIsPossibleToSeeKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getItIsPossibleToSeeKeyword_0()); 

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
    // $ANTLR end "rule__Goal__Group__0__Impl"


    // $ANTLR start "rule__Goal__Group__1"
    // InternalDSL.g:2677:1: rule__Goal__Group__1 : rule__Goal__Group__1__Impl rule__Goal__Group__2 ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2681:1: ( rule__Goal__Group__1__Impl rule__Goal__Group__2 )
            // InternalDSL.g:2682:2: rule__Goal__Group__1__Impl rule__Goal__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Goal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group__2();

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
    // $ANTLR end "rule__Goal__Group__1"


    // $ANTLR start "rule__Goal__Group__1__Impl"
    // InternalDSL.g:2689:1: rule__Goal__Group__1__Impl : ( ( rule__Goal__FunctionAssignment_1 ) ) ;
    public final void rule__Goal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2693:1: ( ( ( rule__Goal__FunctionAssignment_1 ) ) )
            // InternalDSL.g:2694:1: ( ( rule__Goal__FunctionAssignment_1 ) )
            {
            // InternalDSL.g:2694:1: ( ( rule__Goal__FunctionAssignment_1 ) )
            // InternalDSL.g:2695:2: ( rule__Goal__FunctionAssignment_1 )
            {
             before(grammarAccess.getGoalAccess().getFunctionAssignment_1()); 
            // InternalDSL.g:2696:2: ( rule__Goal__FunctionAssignment_1 )
            // InternalDSL.g:2696:3: rule__Goal__FunctionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Goal__FunctionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getFunctionAssignment_1()); 

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
    // $ANTLR end "rule__Goal__Group__1__Impl"


    // $ANTLR start "rule__Goal__Group__2"
    // InternalDSL.g:2704:1: rule__Goal__Group__2 : rule__Goal__Group__2__Impl ;
    public final void rule__Goal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2708:1: ( rule__Goal__Group__2__Impl )
            // InternalDSL.g:2709:2: rule__Goal__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goal__Group__2__Impl();

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
    // $ANTLR end "rule__Goal__Group__2"


    // $ANTLR start "rule__Goal__Group__2__Impl"
    // InternalDSL.g:2715:1: rule__Goal__Group__2__Impl : ( ( rule__Goal__Group_2__0 )? ) ;
    public final void rule__Goal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2719:1: ( ( ( rule__Goal__Group_2__0 )? ) )
            // InternalDSL.g:2720:1: ( ( rule__Goal__Group_2__0 )? )
            {
            // InternalDSL.g:2720:1: ( ( rule__Goal__Group_2__0 )? )
            // InternalDSL.g:2721:2: ( rule__Goal__Group_2__0 )?
            {
             before(grammarAccess.getGoalAccess().getGroup_2()); 
            // InternalDSL.g:2722:2: ( rule__Goal__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==68) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDSL.g:2722:3: rule__Goal__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Goal__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoalAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Goal__Group__2__Impl"


    // $ANTLR start "rule__Goal__Group_2__0"
    // InternalDSL.g:2731:1: rule__Goal__Group_2__0 : rule__Goal__Group_2__0__Impl rule__Goal__Group_2__1 ;
    public final void rule__Goal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2735:1: ( rule__Goal__Group_2__0__Impl rule__Goal__Group_2__1 )
            // InternalDSL.g:2736:2: rule__Goal__Group_2__0__Impl rule__Goal__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Goal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group_2__1();

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
    // $ANTLR end "rule__Goal__Group_2__0"


    // $ANTLR start "rule__Goal__Group_2__0__Impl"
    // InternalDSL.g:2743:1: rule__Goal__Group_2__0__Impl : ( 'on' ) ;
    public final void rule__Goal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2747:1: ( ( 'on' ) )
            // InternalDSL.g:2748:1: ( 'on' )
            {
            // InternalDSL.g:2748:1: ( 'on' )
            // InternalDSL.g:2749:2: 'on'
            {
             before(grammarAccess.getGoalAccess().getOnKeyword_2_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getOnKeyword_2_0()); 

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
    // $ANTLR end "rule__Goal__Group_2__0__Impl"


    // $ANTLR start "rule__Goal__Group_2__1"
    // InternalDSL.g:2758:1: rule__Goal__Group_2__1 : rule__Goal__Group_2__1__Impl rule__Goal__Group_2__2 ;
    public final void rule__Goal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2762:1: ( rule__Goal__Group_2__1__Impl rule__Goal__Group_2__2 )
            // InternalDSL.g:2763:2: rule__Goal__Group_2__1__Impl rule__Goal__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__Goal__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group_2__2();

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
    // $ANTLR end "rule__Goal__Group_2__1"


    // $ANTLR start "rule__Goal__Group_2__1__Impl"
    // InternalDSL.g:2770:1: rule__Goal__Group_2__1__Impl : ( ( rule__Goal__DataAssignment_2_1 ) ) ;
    public final void rule__Goal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2774:1: ( ( ( rule__Goal__DataAssignment_2_1 ) ) )
            // InternalDSL.g:2775:1: ( ( rule__Goal__DataAssignment_2_1 ) )
            {
            // InternalDSL.g:2775:1: ( ( rule__Goal__DataAssignment_2_1 ) )
            // InternalDSL.g:2776:2: ( rule__Goal__DataAssignment_2_1 )
            {
             before(grammarAccess.getGoalAccess().getDataAssignment_2_1()); 
            // InternalDSL.g:2777:2: ( rule__Goal__DataAssignment_2_1 )
            // InternalDSL.g:2777:3: rule__Goal__DataAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Goal__DataAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getDataAssignment_2_1()); 

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
    // $ANTLR end "rule__Goal__Group_2__1__Impl"


    // $ANTLR start "rule__Goal__Group_2__2"
    // InternalDSL.g:2785:1: rule__Goal__Group_2__2 : rule__Goal__Group_2__2__Impl ;
    public final void rule__Goal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2789:1: ( rule__Goal__Group_2__2__Impl )
            // InternalDSL.g:2790:2: rule__Goal__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goal__Group_2__2__Impl();

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
    // $ANTLR end "rule__Goal__Group_2__2"


    // $ANTLR start "rule__Goal__Group_2__2__Impl"
    // InternalDSL.g:2796:1: rule__Goal__Group_2__2__Impl : ( ( rule__Goal__Group_2_2__0 )* ) ;
    public final void rule__Goal__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2800:1: ( ( ( rule__Goal__Group_2_2__0 )* ) )
            // InternalDSL.g:2801:1: ( ( rule__Goal__Group_2_2__0 )* )
            {
            // InternalDSL.g:2801:1: ( ( rule__Goal__Group_2_2__0 )* )
            // InternalDSL.g:2802:2: ( rule__Goal__Group_2_2__0 )*
            {
             before(grammarAccess.getGoalAccess().getGroup_2_2()); 
            // InternalDSL.g:2803:2: ( rule__Goal__Group_2_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==62) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDSL.g:2803:3: rule__Goal__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Goal__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getGoalAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__Goal__Group_2__2__Impl"


    // $ANTLR start "rule__Goal__Group_2_2__0"
    // InternalDSL.g:2812:1: rule__Goal__Group_2_2__0 : rule__Goal__Group_2_2__0__Impl rule__Goal__Group_2_2__1 ;
    public final void rule__Goal__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2816:1: ( rule__Goal__Group_2_2__0__Impl rule__Goal__Group_2_2__1 )
            // InternalDSL.g:2817:2: rule__Goal__Group_2_2__0__Impl rule__Goal__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Goal__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group_2_2__1();

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
    // $ANTLR end "rule__Goal__Group_2_2__0"


    // $ANTLR start "rule__Goal__Group_2_2__0__Impl"
    // InternalDSL.g:2824:1: rule__Goal__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Goal__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2828:1: ( ( ',' ) )
            // InternalDSL.g:2829:1: ( ',' )
            {
            // InternalDSL.g:2829:1: ( ',' )
            // InternalDSL.g:2830:2: ','
            {
             before(grammarAccess.getGoalAccess().getCommaKeyword_2_2_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Goal__Group_2_2__0__Impl"


    // $ANTLR start "rule__Goal__Group_2_2__1"
    // InternalDSL.g:2839:1: rule__Goal__Group_2_2__1 : rule__Goal__Group_2_2__1__Impl ;
    public final void rule__Goal__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2843:1: ( rule__Goal__Group_2_2__1__Impl )
            // InternalDSL.g:2844:2: rule__Goal__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goal__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Goal__Group_2_2__1"


    // $ANTLR start "rule__Goal__Group_2_2__1__Impl"
    // InternalDSL.g:2850:1: rule__Goal__Group_2_2__1__Impl : ( ( rule__Goal__DataAssignment_2_2_1 ) ) ;
    public final void rule__Goal__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2854:1: ( ( ( rule__Goal__DataAssignment_2_2_1 ) ) )
            // InternalDSL.g:2855:1: ( ( rule__Goal__DataAssignment_2_2_1 ) )
            {
            // InternalDSL.g:2855:1: ( ( rule__Goal__DataAssignment_2_2_1 ) )
            // InternalDSL.g:2856:2: ( rule__Goal__DataAssignment_2_2_1 )
            {
             before(grammarAccess.getGoalAccess().getDataAssignment_2_2_1()); 
            // InternalDSL.g:2857:2: ( rule__Goal__DataAssignment_2_2_1 )
            // InternalDSL.g:2857:3: rule__Goal__DataAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Goal__DataAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getDataAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Goal__Group_2_2__1__Impl"


    // $ANTLR start "rule__Project__NameAssignment_1"
    // InternalDSL.g:2866:1: rule__Project__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Project__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2870:1: ( ( ruleEString ) )
            // InternalDSL.g:2871:2: ( ruleEString )
            {
            // InternalDSL.g:2871:2: ( ruleEString )
            // InternalDSL.g:2872:3: ruleEString
            {
             before(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__Project__BackgroundAssignment_3"
    // InternalDSL.g:2881:1: rule__Project__BackgroundAssignment_3 : ( ruleBackground ) ;
    public final void rule__Project__BackgroundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2885:1: ( ( ruleBackground ) )
            // InternalDSL.g:2886:2: ( ruleBackground )
            {
            // InternalDSL.g:2886:2: ( ruleBackground )
            // InternalDSL.g:2887:3: ruleBackground
            {
             before(grammarAccess.getProjectAccess().getBackgroundBackgroundParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getBackgroundBackgroundParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Project__BackgroundAssignment_3"


    // $ANTLR start "rule__Project__BackgroundAssignment_4"
    // InternalDSL.g:2896:1: rule__Project__BackgroundAssignment_4 : ( ruleBackground ) ;
    public final void rule__Project__BackgroundAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2900:1: ( ( ruleBackground ) )
            // InternalDSL.g:2901:2: ( ruleBackground )
            {
            // InternalDSL.g:2901:2: ( ruleBackground )
            // InternalDSL.g:2902:3: ruleBackground
            {
             before(grammarAccess.getProjectAccess().getBackgroundBackgroundParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getBackgroundBackgroundParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Project__BackgroundAssignment_4"


    // $ANTLR start "rule__Project__ConsistOfAssignment_5"
    // InternalDSL.g:2911:1: rule__Project__ConsistOfAssignment_5 : ( ruleFeature ) ;
    public final void rule__Project__ConsistOfAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2915:1: ( ( ruleFeature ) )
            // InternalDSL.g:2916:2: ( ruleFeature )
            {
            // InternalDSL.g:2916:2: ( ruleFeature )
            // InternalDSL.g:2917:3: ruleFeature
            {
             before(grammarAccess.getProjectAccess().getConsistOfFeatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getConsistOfFeatureParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Project__ConsistOfAssignment_5"


    // $ANTLR start "rule__Project__ConsistOfAssignment_6"
    // InternalDSL.g:2926:1: rule__Project__ConsistOfAssignment_6 : ( ruleFeature ) ;
    public final void rule__Project__ConsistOfAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2930:1: ( ( ruleFeature ) )
            // InternalDSL.g:2931:2: ( ruleFeature )
            {
            // InternalDSL.g:2931:2: ( ruleFeature )
            // InternalDSL.g:2932:3: ruleFeature
            {
             before(grammarAccess.getProjectAccess().getConsistOfFeatureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getConsistOfFeatureParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Project__ConsistOfAssignment_6"


    // $ANTLR start "rule__Background__DashboardAssignment_1"
    // InternalDSL.g:2941:1: rule__Background__DashboardAssignment_1 : ( ruleEString ) ;
    public final void rule__Background__DashboardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2945:1: ( ( ruleEString ) )
            // InternalDSL.g:2946:2: ( ruleEString )
            {
            // InternalDSL.g:2946:2: ( ruleEString )
            // InternalDSL.g:2947:3: ruleEString
            {
             before(grammarAccess.getBackgroundAccess().getDashboardEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getDashboardEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Background__DashboardAssignment_1"


    // $ANTLR start "rule__Background__ViewAssignment_3"
    // InternalDSL.g:2956:1: rule__Background__ViewAssignment_3 : ( ruleView ) ;
    public final void rule__Background__ViewAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2960:1: ( ( ruleView ) )
            // InternalDSL.g:2961:2: ( ruleView )
            {
            // InternalDSL.g:2961:2: ( ruleView )
            // InternalDSL.g:2962:3: ruleView
            {
             before(grammarAccess.getBackgroundAccess().getViewViewParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleView();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getViewViewParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Background__ViewAssignment_3"


    // $ANTLR start "rule__Background__ViewAssignment_4"
    // InternalDSL.g:2971:1: rule__Background__ViewAssignment_4 : ( ruleView ) ;
    public final void rule__Background__ViewAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2975:1: ( ( ruleView ) )
            // InternalDSL.g:2976:2: ( ruleView )
            {
            // InternalDSL.g:2976:2: ( ruleView )
            // InternalDSL.g:2977:3: ruleView
            {
             before(grammarAccess.getBackgroundAccess().getViewViewParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleView();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getViewViewParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Background__ViewAssignment_4"


    // $ANTLR start "rule__View__NameAssignment_1"
    // InternalDSL.g:2986:1: rule__View__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__View__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2990:1: ( ( ruleEString ) )
            // InternalDSL.g:2991:2: ( ruleEString )
            {
            // InternalDSL.g:2991:2: ( ruleEString )
            // InternalDSL.g:2992:3: ruleEString
            {
             before(grammarAccess.getViewAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getViewAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__View__NameAssignment_1"


    // $ANTLR start "rule__View__DescAssignment_2_1"
    // InternalDSL.g:3001:1: rule__View__DescAssignment_2_1 : ( ruleEString ) ;
    public final void rule__View__DescAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3005:1: ( ( ruleEString ) )
            // InternalDSL.g:3006:2: ( ruleEString )
            {
            // InternalDSL.g:3006:2: ( ruleEString )
            // InternalDSL.g:3007:3: ruleEString
            {
             before(grammarAccess.getViewAccess().getDescEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getViewAccess().getDescEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__View__DescAssignment_2_1"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalDSL.g:3016:1: rule__Feature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3020:1: ( ( ruleEString ) )
            // InternalDSL.g:3021:2: ( ruleEString )
            {
            // InternalDSL.g:3021:2: ( ruleEString )
            // InternalDSL.g:3022:3: ruleEString
            {
             before(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__DescAssignment_2_1"
    // InternalDSL.g:3031:1: rule__Feature__DescAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Feature__DescAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3035:1: ( ( ruleEString ) )
            // InternalDSL.g:3036:2: ( ruleEString )
            {
            // InternalDSL.g:3036:2: ( ruleEString )
            // InternalDSL.g:3037:3: ruleEString
            {
             before(grammarAccess.getFeatureAccess().getDescEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDescEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Feature__DescAssignment_2_1"


    // $ANTLR start "rule__Feature__SpecifiedByAssignment_3"
    // InternalDSL.g:3046:1: rule__Feature__SpecifiedByAssignment_3 : ( ruleScenario ) ;
    public final void rule__Feature__SpecifiedByAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3050:1: ( ( ruleScenario ) )
            // InternalDSL.g:3051:2: ( ruleScenario )
            {
            // InternalDSL.g:3051:2: ( ruleScenario )
            // InternalDSL.g:3052:3: ruleScenario
            {
             before(grammarAccess.getFeatureAccess().getSpecifiedByScenarioParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getSpecifiedByScenarioParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Feature__SpecifiedByAssignment_3"


    // $ANTLR start "rule__Feature__SpecifiedByAssignment_4"
    // InternalDSL.g:3061:1: rule__Feature__SpecifiedByAssignment_4 : ( ruleScenario ) ;
    public final void rule__Feature__SpecifiedByAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3065:1: ( ( ruleScenario ) )
            // InternalDSL.g:3066:2: ( ruleScenario )
            {
            // InternalDSL.g:3066:2: ( ruleScenario )
            // InternalDSL.g:3067:3: ruleScenario
            {
             before(grammarAccess.getFeatureAccess().getSpecifiedByScenarioParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getSpecifiedByScenarioParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Feature__SpecifiedByAssignment_4"


    // $ANTLR start "rule__Scenario__NameAssignment_1"
    // InternalDSL.g:3076:1: rule__Scenario__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Scenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3080:1: ( ( ruleEString ) )
            // InternalDSL.g:3081:2: ( ruleEString )
            {
            // InternalDSL.g:3081:2: ( ruleEString )
            // InternalDSL.g:3082:3: ruleEString
            {
             before(grammarAccess.getScenarioAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Scenario__NameAssignment_1"


    // $ANTLR start "rule__Scenario__SystemAssignment_2_1"
    // InternalDSL.g:3091:1: rule__Scenario__SystemAssignment_2_1 : ( ruleGiven ) ;
    public final void rule__Scenario__SystemAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3095:1: ( ( ruleGiven ) )
            // InternalDSL.g:3096:2: ( ruleGiven )
            {
            // InternalDSL.g:3096:2: ( ruleGiven )
            // InternalDSL.g:3097:3: ruleGiven
            {
             before(grammarAccess.getScenarioAccess().getSystemGivenParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGiven();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getSystemGivenParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Scenario__SystemAssignment_2_1"


    // $ANTLR start "rule__Scenario__TriggerAssignment_4"
    // InternalDSL.g:3106:1: rule__Scenario__TriggerAssignment_4 : ( ruleWhen ) ;
    public final void rule__Scenario__TriggerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3110:1: ( ( ruleWhen ) )
            // InternalDSL.g:3111:2: ( ruleWhen )
            {
            // InternalDSL.g:3111:2: ( ruleWhen )
            // InternalDSL.g:3112:3: ruleWhen
            {
             before(grammarAccess.getScenarioAccess().getTriggerWhenParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleWhen();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTriggerWhenParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Scenario__TriggerAssignment_4"


    // $ANTLR start "rule__Scenario__TriggerAssignment_5_1"
    // InternalDSL.g:3121:1: rule__Scenario__TriggerAssignment_5_1 : ( ruleWhen ) ;
    public final void rule__Scenario__TriggerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3125:1: ( ( ruleWhen ) )
            // InternalDSL.g:3126:2: ( ruleWhen )
            {
            // InternalDSL.g:3126:2: ( ruleWhen )
            // InternalDSL.g:3127:3: ruleWhen
            {
             before(grammarAccess.getScenarioAccess().getTriggerWhenParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhen();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTriggerWhenParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Scenario__TriggerAssignment_5_1"


    // $ANTLR start "rule__Scenario__OutcomeAssignment_7"
    // InternalDSL.g:3136:1: rule__Scenario__OutcomeAssignment_7 : ( ruleThen ) ;
    public final void rule__Scenario__OutcomeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3140:1: ( ( ruleThen ) )
            // InternalDSL.g:3141:2: ( ruleThen )
            {
            // InternalDSL.g:3141:2: ( ruleThen )
            // InternalDSL.g:3142:3: ruleThen
            {
             before(grammarAccess.getScenarioAccess().getOutcomeThenParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleThen();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getOutcomeThenParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Scenario__OutcomeAssignment_7"


    // $ANTLR start "rule__Scenario__OutcomeAssignment_8_1"
    // InternalDSL.g:3151:1: rule__Scenario__OutcomeAssignment_8_1 : ( ruleThen ) ;
    public final void rule__Scenario__OutcomeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3155:1: ( ( ruleThen ) )
            // InternalDSL.g:3156:2: ( ruleThen )
            {
            // InternalDSL.g:3156:2: ( ruleThen )
            // InternalDSL.g:3157:3: ruleThen
            {
             before(grammarAccess.getScenarioAccess().getOutcomeThenParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleThen();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getOutcomeThenParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Scenario__OutcomeAssignment_8_1"


    // $ANTLR start "rule__Given__DashboardAssignment_1"
    // InternalDSL.g:3166:1: rule__Given__DashboardAssignment_1 : ( ruleEString ) ;
    public final void rule__Given__DashboardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3170:1: ( ( ruleEString ) )
            // InternalDSL.g:3171:2: ( ruleEString )
            {
            // InternalDSL.g:3171:2: ( ruleEString )
            // InternalDSL.g:3172:3: ruleEString
            {
             before(grammarAccess.getGivenAccess().getDashboardEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getDashboardEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Given__DashboardAssignment_1"


    // $ANTLR start "rule__Given__DataAssignment_2_1"
    // InternalDSL.g:3181:1: rule__Given__DataAssignment_2_1 : ( ruleData ) ;
    public final void rule__Given__DataAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3185:1: ( ( ruleData ) )
            // InternalDSL.g:3186:2: ( ruleData )
            {
            // InternalDSL.g:3186:2: ( ruleData )
            // InternalDSL.g:3187:3: ruleData
            {
             before(grammarAccess.getGivenAccess().getDataDataParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getDataDataParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Given__DataAssignment_2_1"


    // $ANTLR start "rule__Given__DataAssignment_2_2_1"
    // InternalDSL.g:3196:1: rule__Given__DataAssignment_2_2_1 : ( ruleData ) ;
    public final void rule__Given__DataAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3200:1: ( ( ruleData ) )
            // InternalDSL.g:3201:2: ( ruleData )
            {
            // InternalDSL.g:3201:2: ( ruleData )
            // InternalDSL.g:3202:3: ruleData
            {
             before(grammarAccess.getGivenAccess().getDataDataParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getDataDataParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__Given__DataAssignment_2_2_1"


    // $ANTLR start "rule__Data__QuantifierAssignment_1"
    // InternalDSL.g:3211:1: rule__Data__QuantifierAssignment_1 : ( ruleQuantifier ) ;
    public final void rule__Data__QuantifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3215:1: ( ( ruleQuantifier ) )
            // InternalDSL.g:3216:2: ( ruleQuantifier )
            {
            // InternalDSL.g:3216:2: ( ruleQuantifier )
            // InternalDSL.g:3217:3: ruleQuantifier
            {
             before(grammarAccess.getDataAccess().getQuantifierQuantifierEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantifier();

            state._fsp--;

             after(grammarAccess.getDataAccess().getQuantifierQuantifierEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Data__QuantifierAssignment_1"


    // $ANTLR start "rule__Data__TypeAssignment_2_1"
    // InternalDSL.g:3226:1: rule__Data__TypeAssignment_2_1 : ( ruleDataType ) ;
    public final void rule__Data__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3230:1: ( ( ruleDataType ) )
            // InternalDSL.g:3231:2: ( ruleDataType )
            {
            // InternalDSL.g:3231:2: ( ruleDataType )
            // InternalDSL.g:3232:3: ruleDataType
            {
             before(grammarAccess.getDataAccess().getTypeDataTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataAccess().getTypeDataTypeEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Data__TypeAssignment_2_1"


    // $ANTLR start "rule__Data__LocationTypeAssignment_3_1"
    // InternalDSL.g:3241:1: rule__Data__LocationTypeAssignment_3_1 : ( ruleContainerType ) ;
    public final void rule__Data__LocationTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3245:1: ( ( ruleContainerType ) )
            // InternalDSL.g:3246:2: ( ruleContainerType )
            {
            // InternalDSL.g:3246:2: ( ruleContainerType )
            // InternalDSL.g:3247:3: ruleContainerType
            {
             before(grammarAccess.getDataAccess().getLocationTypeContainerTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContainerType();

            state._fsp--;

             after(grammarAccess.getDataAccess().getLocationTypeContainerTypeEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Data__LocationTypeAssignment_3_1"


    // $ANTLR start "rule__Data__LocationAssignment_3_2"
    // InternalDSL.g:3256:1: rule__Data__LocationAssignment_3_2 : ( ruleEString ) ;
    public final void rule__Data__LocationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3260:1: ( ( ruleEString ) )
            // InternalDSL.g:3261:2: ( ruleEString )
            {
            // InternalDSL.g:3261:2: ( ruleEString )
            // InternalDSL.g:3262:3: ruleEString
            {
             before(grammarAccess.getDataAccess().getLocationEStringParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataAccess().getLocationEStringParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Data__LocationAssignment_3_2"


    // $ANTLR start "rule__Loading__ContextAssignment_0"
    // InternalDSL.g:3271:1: rule__Loading__ContextAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Loading__ContextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3275:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3276:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3276:2: ( ( ruleEString ) )
            // InternalDSL.g:3277:3: ( ruleEString )
            {
             before(grammarAccess.getLoadingAccess().getContextViewCrossReference_0_0()); 
            // InternalDSL.g:3278:3: ( ruleEString )
            // InternalDSL.g:3279:4: ruleEString
            {
             before(grammarAccess.getLoadingAccess().getContextViewEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoadingAccess().getContextViewEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLoadingAccess().getContextViewCrossReference_0_0()); 

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
    // $ANTLR end "rule__Loading__ContextAssignment_0"


    // $ANTLR start "rule__Loading__NewAssignment_2"
    // InternalDSL.g:3290:1: rule__Loading__NewAssignment_2 : ( ruleState ) ;
    public final void rule__Loading__NewAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3294:1: ( ( ruleState ) )
            // InternalDSL.g:3295:2: ( ruleState )
            {
            // InternalDSL.g:3295:2: ( ruleState )
            // InternalDSL.g:3296:3: ruleState
            {
             before(grammarAccess.getLoadingAccess().getNewStateEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getLoadingAccess().getNewStateEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Loading__NewAssignment_2"


    // $ANTLR start "rule__Interaction__ActionAssignment_0"
    // InternalDSL.g:3305:1: rule__Interaction__ActionAssignment_0 : ( ruleAction ) ;
    public final void rule__Interaction__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3309:1: ( ( ruleAction ) )
            // InternalDSL.g:3310:2: ( ruleAction )
            {
            // InternalDSL.g:3310:2: ( ruleAction )
            // InternalDSL.g:3311:3: ruleAction
            {
             before(grammarAccess.getInteractionAccess().getActionActionEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getActionActionEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Interaction__ActionAssignment_0"


    // $ANTLR start "rule__Interaction__TargetAssignment_1"
    // InternalDSL.g:3320:1: rule__Interaction__TargetAssignment_1 : ( ruleEString ) ;
    public final void rule__Interaction__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3324:1: ( ( ruleEString ) )
            // InternalDSL.g:3325:2: ( ruleEString )
            {
            // InternalDSL.g:3325:2: ( ruleEString )
            // InternalDSL.g:3326:3: ruleEString
            {
             before(grammarAccess.getInteractionAccess().getTargetEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getTargetEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Interaction__TargetAssignment_1"


    // $ANTLR start "rule__Interaction__ContextAssignment_3"
    // InternalDSL.g:3335:1: rule__Interaction__ContextAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Interaction__ContextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3339:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3340:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3340:2: ( ( ruleEString ) )
            // InternalDSL.g:3341:3: ( ruleEString )
            {
             before(grammarAccess.getInteractionAccess().getContextViewCrossReference_3_0()); 
            // InternalDSL.g:3342:3: ( ruleEString )
            // InternalDSL.g:3343:4: ruleEString
            {
             before(grammarAccess.getInteractionAccess().getContextViewEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getContextViewEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInteractionAccess().getContextViewCrossReference_3_0()); 

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
    // $ANTLR end "rule__Interaction__ContextAssignment_3"


    // $ANTLR start "rule__Update__TargetAssignment_0"
    // InternalDSL.g:3354:1: rule__Update__TargetAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Update__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3358:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3359:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3359:2: ( ( ruleEString ) )
            // InternalDSL.g:3360:3: ( ruleEString )
            {
             before(grammarAccess.getUpdateAccess().getTargetViewCrossReference_0_0()); 
            // InternalDSL.g:3361:3: ( ruleEString )
            // InternalDSL.g:3362:4: ruleEString
            {
             before(grammarAccess.getUpdateAccess().getTargetViewEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getTargetViewEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getUpdateAccess().getTargetViewCrossReference_0_0()); 

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
    // $ANTLR end "rule__Update__TargetAssignment_0"


    // $ANTLR start "rule__Update__DoAssignment_2"
    // InternalDSL.g:3373:1: rule__Update__DoAssignment_2 : ( ruleReaction ) ;
    public final void rule__Update__DoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3377:1: ( ( ruleReaction ) )
            // InternalDSL.g:3378:2: ( ruleReaction )
            {
            // InternalDSL.g:3378:2: ( ruleReaction )
            // InternalDSL.g:3379:3: ruleReaction
            {
             before(grammarAccess.getUpdateAccess().getDoReactionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getDoReactionEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Update__DoAssignment_2"


    // $ANTLR start "rule__Goal__FunctionAssignment_1"
    // InternalDSL.g:3388:1: rule__Goal__FunctionAssignment_1 : ( ruleTaxonomy ) ;
    public final void rule__Goal__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3392:1: ( ( ruleTaxonomy ) )
            // InternalDSL.g:3393:2: ( ruleTaxonomy )
            {
            // InternalDSL.g:3393:2: ( ruleTaxonomy )
            // InternalDSL.g:3394:3: ruleTaxonomy
            {
             before(grammarAccess.getGoalAccess().getFunctionTaxonomyEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaxonomy();

            state._fsp--;

             after(grammarAccess.getGoalAccess().getFunctionTaxonomyEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Goal__FunctionAssignment_1"


    // $ANTLR start "rule__Goal__DataAssignment_2_1"
    // InternalDSL.g:3403:1: rule__Goal__DataAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Goal__DataAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3407:1: ( ( ruleEString ) )
            // InternalDSL.g:3408:2: ( ruleEString )
            {
            // InternalDSL.g:3408:2: ( ruleEString )
            // InternalDSL.g:3409:3: ruleEString
            {
             before(grammarAccess.getGoalAccess().getDataEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGoalAccess().getDataEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Goal__DataAssignment_2_1"


    // $ANTLR start "rule__Goal__DataAssignment_2_2_1"
    // InternalDSL.g:3418:1: rule__Goal__DataAssignment_2_2_1 : ( ruleEString ) ;
    public final void rule__Goal__DataAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3422:1: ( ( ruleEString ) )
            // InternalDSL.g:3423:2: ( ruleEString )
            {
            // InternalDSL.g:3423:2: ( ruleEString )
            // InternalDSL.g:3424:3: ruleEString
            {
             before(grammarAccess.getGoalAccess().getDataEStringParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGoalAccess().getDataEStringParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__Goal__DataAssignment_2_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0048000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000003C0000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x1400000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000008L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x8000000007000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000FE0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000004L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001FFC000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});

}
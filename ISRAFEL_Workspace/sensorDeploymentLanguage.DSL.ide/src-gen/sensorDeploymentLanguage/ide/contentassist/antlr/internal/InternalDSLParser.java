package sensorDeploymentLanguage.ide.contentassist.antlr.internal;

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
import sensorDeploymentLanguage.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'inf'", "'E'", "'e'", "'Building'", "'Floor'", "'Corridor'", "'Room'", "'Furniture'", "'Wall'", "'Window'", "'Catalog'", "'Infrastructure :'", "'Observation patterns :'", "'\\u25A1'", "'\\u231E'", "'Periodic sensor'", "'observes'", "'every'", "'seconds'", "'is calculated from'", "'Event Based sensor'", "'when'", "'with'", "'in range'", "'calculated from function'", "'on'", "','", "'['", "'...'", "']'", "';'", "'-'", "'.'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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



    // $ANTLR start "entryRuleCatalog"
    // InternalDSL.g:53:1: entryRuleCatalog : ruleCatalog EOF ;
    public final void entryRuleCatalog() throws RecognitionException {
        try {
            // InternalDSL.g:54:1: ( ruleCatalog EOF )
            // InternalDSL.g:55:1: ruleCatalog EOF
            {
             before(grammarAccess.getCatalogRule()); 
            pushFollow(FOLLOW_1);
            ruleCatalog();

            state._fsp--;

             after(grammarAccess.getCatalogRule()); 
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
    // $ANTLR end "entryRuleCatalog"


    // $ANTLR start "ruleCatalog"
    // InternalDSL.g:62:1: ruleCatalog : ( ( rule__Catalog__Group__0 ) ) ;
    public final void ruleCatalog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( rule__Catalog__Group__0 ) ) )
            // InternalDSL.g:67:2: ( ( rule__Catalog__Group__0 ) )
            {
            // InternalDSL.g:67:2: ( ( rule__Catalog__Group__0 ) )
            // InternalDSL.g:68:3: ( rule__Catalog__Group__0 )
            {
             before(grammarAccess.getCatalogAccess().getGroup()); 
            // InternalDSL.g:69:3: ( rule__Catalog__Group__0 )
            // InternalDSL.g:69:4: rule__Catalog__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Catalog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCatalogAccess().getGroup()); 

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
    // $ANTLR end "ruleCatalog"


    // $ANTLR start "entryRuleContainer"
    // InternalDSL.g:78:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalDSL.g:79:1: ( ruleContainer EOF )
            // InternalDSL.g:80:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalDSL.g:87:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalDSL.g:92:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalDSL.g:92:2: ( ( rule__Container__Group__0 ) )
            // InternalDSL.g:93:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalDSL.g:94:3: ( rule__Container__Group__0 )
            // InternalDSL.g:94:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleContainable"
    // InternalDSL.g:103:1: entryRuleContainable : ruleContainable EOF ;
    public final void entryRuleContainable() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleContainable EOF )
            // InternalDSL.g:105:1: ruleContainable EOF
            {
             before(grammarAccess.getContainableRule()); 
            pushFollow(FOLLOW_1);
            ruleContainable();

            state._fsp--;

             after(grammarAccess.getContainableRule()); 
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
    // $ANTLR end "entryRuleContainable"


    // $ANTLR start "ruleContainable"
    // InternalDSL.g:112:1: ruleContainable : ( ( rule__Containable__Alternatives ) ) ;
    public final void ruleContainable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__Containable__Alternatives ) ) )
            // InternalDSL.g:117:2: ( ( rule__Containable__Alternatives ) )
            {
            // InternalDSL.g:117:2: ( ( rule__Containable__Alternatives ) )
            // InternalDSL.g:118:3: ( rule__Containable__Alternatives )
            {
             before(grammarAccess.getContainableAccess().getAlternatives()); 
            // InternalDSL.g:119:3: ( rule__Containable__Alternatives )
            // InternalDSL.g:119:4: rule__Containable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Containable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContainableAccess().getAlternatives()); 

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
    // $ANTLR end "ruleContainable"


    // $ANTLR start "entryRulePeriodic"
    // InternalDSL.g:128:1: entryRulePeriodic : rulePeriodic EOF ;
    public final void entryRulePeriodic() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( rulePeriodic EOF )
            // InternalDSL.g:130:1: rulePeriodic EOF
            {
             before(grammarAccess.getPeriodicRule()); 
            pushFollow(FOLLOW_1);
            rulePeriodic();

            state._fsp--;

             after(grammarAccess.getPeriodicRule()); 
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
    // $ANTLR end "entryRulePeriodic"


    // $ANTLR start "rulePeriodic"
    // InternalDSL.g:137:1: rulePeriodic : ( ( rule__Periodic__Group__0 ) ) ;
    public final void rulePeriodic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__Periodic__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__Periodic__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__Periodic__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__Periodic__Group__0 )
            {
             before(grammarAccess.getPeriodicAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__Periodic__Group__0 )
            // InternalDSL.g:144:4: rule__Periodic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Periodic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicAccess().getGroup()); 

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
    // $ANTLR end "rulePeriodic"


    // $ANTLR start "entryRuleEvent_Based"
    // InternalDSL.g:153:1: entryRuleEvent_Based : ruleEvent_Based EOF ;
    public final void entryRuleEvent_Based() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleEvent_Based EOF )
            // InternalDSL.g:155:1: ruleEvent_Based EOF
            {
             before(grammarAccess.getEvent_BasedRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent_Based();

            state._fsp--;

             after(grammarAccess.getEvent_BasedRule()); 
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
    // $ANTLR end "entryRuleEvent_Based"


    // $ANTLR start "ruleEvent_Based"
    // InternalDSL.g:162:1: ruleEvent_Based : ( ( rule__Event_Based__Group__0 ) ) ;
    public final void ruleEvent_Based() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__Event_Based__Group__0 ) ) )
            // InternalDSL.g:167:2: ( ( rule__Event_Based__Group__0 ) )
            {
            // InternalDSL.g:167:2: ( ( rule__Event_Based__Group__0 ) )
            // InternalDSL.g:168:3: ( rule__Event_Based__Group__0 )
            {
             before(grammarAccess.getEvent_BasedAccess().getGroup()); 
            // InternalDSL.g:169:3: ( rule__Event_Based__Group__0 )
            // InternalDSL.g:169:4: rule__Event_Based__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event_Based__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvent_BasedAccess().getGroup()); 

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
    // $ANTLR end "ruleEvent_Based"


    // $ANTLR start "entryRuleDataType"
    // InternalDSL.g:178:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleDataType EOF )
            // InternalDSL.g:180:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDSL.g:187:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalDSL.g:192:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalDSL.g:192:2: ( ( rule__DataType__Alternatives ) )
            // InternalDSL.g:193:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalDSL.g:194:3: ( rule__DataType__Alternatives )
            // InternalDSL.g:194:4: rule__DataType__Alternatives
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


    // $ANTLR start "entryRuleEString"
    // InternalDSL.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleEString EOF )
            // InternalDSL.g:205:1: ruleEString EOF
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
    // InternalDSL.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDSL.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDSL.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalDSL.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDSL.g:219:3: ( rule__EString__Alternatives )
            // InternalDSL.g:219:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleObservation"
    // InternalDSL.g:228:1: entryRuleObservation : ruleObservation EOF ;
    public final void entryRuleObservation() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleObservation EOF )
            // InternalDSL.g:230:1: ruleObservation EOF
            {
             before(grammarAccess.getObservationRule()); 
            pushFollow(FOLLOW_1);
            ruleObservation();

            state._fsp--;

             after(grammarAccess.getObservationRule()); 
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
    // $ANTLR end "entryRuleObservation"


    // $ANTLR start "ruleObservation"
    // InternalDSL.g:237:1: ruleObservation : ( ( rule__Observation__Group__0 ) ) ;
    public final void ruleObservation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__Observation__Group__0 ) ) )
            // InternalDSL.g:242:2: ( ( rule__Observation__Group__0 ) )
            {
            // InternalDSL.g:242:2: ( ( rule__Observation__Group__0 ) )
            // InternalDSL.g:243:3: ( rule__Observation__Group__0 )
            {
             before(grammarAccess.getObservationAccess().getGroup()); 
            // InternalDSL.g:244:3: ( rule__Observation__Group__0 )
            // InternalDSL.g:244:4: rule__Observation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Observation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObservationAccess().getGroup()); 

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
    // $ANTLR end "ruleObservation"


    // $ANTLR start "entryRuleField"
    // InternalDSL.g:253:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleField EOF )
            // InternalDSL.g:255:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalDSL.g:262:1: ruleField : ( ( rule__Field__Alternatives ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__Field__Alternatives ) ) )
            // InternalDSL.g:267:2: ( ( rule__Field__Alternatives ) )
            {
            // InternalDSL.g:267:2: ( ( rule__Field__Alternatives ) )
            // InternalDSL.g:268:3: ( rule__Field__Alternatives )
            {
             before(grammarAccess.getFieldAccess().getAlternatives()); 
            // InternalDSL.g:269:3: ( rule__Field__Alternatives )
            // InternalDSL.g:269:4: rule__Field__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Field__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleAtomic"
    // InternalDSL.g:278:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleAtomic EOF )
            // InternalDSL.g:280:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalDSL.g:287:1: ruleAtomic : ( ( rule__Atomic__Group__0 ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__Atomic__Group__0 ) ) )
            // InternalDSL.g:292:2: ( ( rule__Atomic__Group__0 ) )
            {
            // InternalDSL.g:292:2: ( ( rule__Atomic__Group__0 ) )
            // InternalDSL.g:293:3: ( rule__Atomic__Group__0 )
            {
             before(grammarAccess.getAtomicAccess().getGroup()); 
            // InternalDSL.g:294:3: ( rule__Atomic__Group__0 )
            // InternalDSL.g:294:4: rule__Atomic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getGroup()); 

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleCalculated"
    // InternalDSL.g:303:1: entryRuleCalculated : ruleCalculated EOF ;
    public final void entryRuleCalculated() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleCalculated EOF )
            // InternalDSL.g:305:1: ruleCalculated EOF
            {
             before(grammarAccess.getCalculatedRule()); 
            pushFollow(FOLLOW_1);
            ruleCalculated();

            state._fsp--;

             after(grammarAccess.getCalculatedRule()); 
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
    // $ANTLR end "entryRuleCalculated"


    // $ANTLR start "ruleCalculated"
    // InternalDSL.g:312:1: ruleCalculated : ( ( rule__Calculated__Group__0 ) ) ;
    public final void ruleCalculated() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__Calculated__Group__0 ) ) )
            // InternalDSL.g:317:2: ( ( rule__Calculated__Group__0 ) )
            {
            // InternalDSL.g:317:2: ( ( rule__Calculated__Group__0 ) )
            // InternalDSL.g:318:3: ( rule__Calculated__Group__0 )
            {
             before(grammarAccess.getCalculatedAccess().getGroup()); 
            // InternalDSL.g:319:3: ( rule__Calculated__Group__0 )
            // InternalDSL.g:319:4: rule__Calculated__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Calculated__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getGroup()); 

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
    // $ANTLR end "ruleCalculated"


    // $ANTLR start "entryRuleRange"
    // InternalDSL.g:328:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( ruleRange EOF )
            // InternalDSL.g:330:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalDSL.g:337:1: ruleRange : ( ( rule__Range__Alternatives ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__Range__Alternatives ) ) )
            // InternalDSL.g:342:2: ( ( rule__Range__Alternatives ) )
            {
            // InternalDSL.g:342:2: ( ( rule__Range__Alternatives ) )
            // InternalDSL.g:343:3: ( rule__Range__Alternatives )
            {
             before(grammarAccess.getRangeAccess().getAlternatives()); 
            // InternalDSL.g:344:3: ( rule__Range__Alternatives )
            // InternalDSL.g:344:4: rule__Range__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Range__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleContinuous"
    // InternalDSL.g:353:1: entryRuleContinuous : ruleContinuous EOF ;
    public final void entryRuleContinuous() throws RecognitionException {
        try {
            // InternalDSL.g:354:1: ( ruleContinuous EOF )
            // InternalDSL.g:355:1: ruleContinuous EOF
            {
             before(grammarAccess.getContinuousRule()); 
            pushFollow(FOLLOW_1);
            ruleContinuous();

            state._fsp--;

             after(grammarAccess.getContinuousRule()); 
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
    // $ANTLR end "entryRuleContinuous"


    // $ANTLR start "ruleContinuous"
    // InternalDSL.g:362:1: ruleContinuous : ( ( rule__Continuous__Group__0 ) ) ;
    public final void ruleContinuous() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:366:2: ( ( ( rule__Continuous__Group__0 ) ) )
            // InternalDSL.g:367:2: ( ( rule__Continuous__Group__0 ) )
            {
            // InternalDSL.g:367:2: ( ( rule__Continuous__Group__0 ) )
            // InternalDSL.g:368:3: ( rule__Continuous__Group__0 )
            {
             before(grammarAccess.getContinuousAccess().getGroup()); 
            // InternalDSL.g:369:3: ( rule__Continuous__Group__0 )
            // InternalDSL.g:369:4: rule__Continuous__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Continuous__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContinuousAccess().getGroup()); 

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
    // $ANTLR end "ruleContinuous"


    // $ANTLR start "entryRuleDiscrete"
    // InternalDSL.g:378:1: entryRuleDiscrete : ruleDiscrete EOF ;
    public final void entryRuleDiscrete() throws RecognitionException {
        try {
            // InternalDSL.g:379:1: ( ruleDiscrete EOF )
            // InternalDSL.g:380:1: ruleDiscrete EOF
            {
             before(grammarAccess.getDiscreteRule()); 
            pushFollow(FOLLOW_1);
            ruleDiscrete();

            state._fsp--;

             after(grammarAccess.getDiscreteRule()); 
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
    // $ANTLR end "entryRuleDiscrete"


    // $ANTLR start "ruleDiscrete"
    // InternalDSL.g:387:1: ruleDiscrete : ( ( rule__Discrete__Group__0 ) ) ;
    public final void ruleDiscrete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:391:2: ( ( ( rule__Discrete__Group__0 ) ) )
            // InternalDSL.g:392:2: ( ( rule__Discrete__Group__0 ) )
            {
            // InternalDSL.g:392:2: ( ( rule__Discrete__Group__0 ) )
            // InternalDSL.g:393:3: ( rule__Discrete__Group__0 )
            {
             before(grammarAccess.getDiscreteAccess().getGroup()); 
            // InternalDSL.g:394:3: ( rule__Discrete__Group__0 )
            // InternalDSL.g:394:4: rule__Discrete__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Discrete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiscreteAccess().getGroup()); 

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
    // $ANTLR end "ruleDiscrete"


    // $ANTLR start "entryRuleInteger"
    // InternalDSL.g:403:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalDSL.g:404:1: ( ruleInteger EOF )
            // InternalDSL.g:405:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalDSL.g:412:1: ruleInteger : ( ( rule__Integer__Alternatives ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:416:2: ( ( ( rule__Integer__Alternatives ) ) )
            // InternalDSL.g:417:2: ( ( rule__Integer__Alternatives ) )
            {
            // InternalDSL.g:417:2: ( ( rule__Integer__Alternatives ) )
            // InternalDSL.g:418:3: ( rule__Integer__Alternatives )
            {
             before(grammarAccess.getIntegerAccess().getAlternatives()); 
            // InternalDSL.g:419:3: ( rule__Integer__Alternatives )
            // InternalDSL.g:419:4: rule__Integer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloat"
    // InternalDSL.g:428:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalDSL.g:429:1: ( ruleFloat EOF )
            // InternalDSL.g:430:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalDSL.g:437:1: ruleFloat : ( ( rule__Float__Alternatives ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:441:2: ( ( ( rule__Float__Alternatives ) ) )
            // InternalDSL.g:442:2: ( ( rule__Float__Alternatives ) )
            {
            // InternalDSL.g:442:2: ( ( rule__Float__Alternatives ) )
            // InternalDSL.g:443:3: ( rule__Float__Alternatives )
            {
             before(grammarAccess.getFloatAccess().getAlternatives()); 
            // InternalDSL.g:444:3: ( rule__Float__Alternatives )
            // InternalDSL.g:444:4: rule__Float__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Float__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleString0"
    // InternalDSL.g:453:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalDSL.g:454:1: ( ruleString0 EOF )
            // InternalDSL.g:455:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalDSL.g:462:1: ruleString0 : ( ( rule__String0__Group__0 ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:466:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalDSL.g:467:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalDSL.g:467:2: ( ( rule__String0__Group__0 ) )
            // InternalDSL.g:468:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup()); 
            // InternalDSL.g:469:3: ( rule__String0__Group__0 )
            // InternalDSL.g:469:4: rule__String0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getGroup()); 

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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleEInt"
    // InternalDSL.g:478:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDSL.g:479:1: ( ruleEInt EOF )
            // InternalDSL.g:480:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDSL.g:487:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:491:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDSL.g:492:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDSL.g:492:2: ( ( rule__EInt__Group__0 ) )
            // InternalDSL.g:493:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDSL.g:494:3: ( rule__EInt__Group__0 )
            // InternalDSL.g:494:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // InternalDSL.g:503:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalDSL.g:504:1: ( ruleEFloat EOF )
            // InternalDSL.g:505:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalDSL.g:512:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:516:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalDSL.g:517:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalDSL.g:517:2: ( ( rule__EFloat__Group__0 ) )
            // InternalDSL.g:518:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalDSL.g:519:3: ( rule__EFloat__Group__0 )
            // InternalDSL.g:519:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "ruleContainerType"
    // InternalDSL.g:528:1: ruleContainerType : ( ( rule__ContainerType__Alternatives ) ) ;
    public final void ruleContainerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:532:1: ( ( ( rule__ContainerType__Alternatives ) ) )
            // InternalDSL.g:533:2: ( ( rule__ContainerType__Alternatives ) )
            {
            // InternalDSL.g:533:2: ( ( rule__ContainerType__Alternatives ) )
            // InternalDSL.g:534:3: ( rule__ContainerType__Alternatives )
            {
             before(grammarAccess.getContainerTypeAccess().getAlternatives()); 
            // InternalDSL.g:535:3: ( rule__ContainerType__Alternatives )
            // InternalDSL.g:535:4: rule__ContainerType__Alternatives
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


    // $ANTLR start "rule__Containable__Alternatives"
    // InternalDSL.g:543:1: rule__Containable__Alternatives : ( ( ruleContainer ) | ( rulePeriodic ) | ( ruleEvent_Based ) );
    public final void rule__Containable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:547:1: ( ( ruleContainer ) | ( rulePeriodic ) | ( ruleEvent_Based ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 31:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDSL.g:548:2: ( ruleContainer )
                    {
                    // InternalDSL.g:548:2: ( ruleContainer )
                    // InternalDSL.g:549:3: ruleContainer
                    {
                     before(grammarAccess.getContainableAccess().getContainerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleContainer();

                    state._fsp--;

                     after(grammarAccess.getContainableAccess().getContainerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:554:2: ( rulePeriodic )
                    {
                    // InternalDSL.g:554:2: ( rulePeriodic )
                    // InternalDSL.g:555:3: rulePeriodic
                    {
                     before(grammarAccess.getContainableAccess().getPeriodicParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePeriodic();

                    state._fsp--;

                     after(grammarAccess.getContainableAccess().getPeriodicParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:560:2: ( ruleEvent_Based )
                    {
                    // InternalDSL.g:560:2: ( ruleEvent_Based )
                    // InternalDSL.g:561:3: ruleEvent_Based
                    {
                     before(grammarAccess.getContainableAccess().getEvent_BasedParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEvent_Based();

                    state._fsp--;

                     after(grammarAccess.getContainableAccess().getEvent_BasedParserRuleCall_2()); 

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
    // $ANTLR end "rule__Containable__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalDSL.g:570:1: rule__DataType__Alternatives : ( ( ruleInteger ) | ( ruleFloat ) | ( ruleString0 ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:574:1: ( ( ruleInteger ) | ( ruleFloat ) | ( ruleString0 ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_INT) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==43) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==EOF||(LA2_2>=39 && LA2_2<=41)) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_1==43) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==43) ) {
                    alt2=2;
                }
                else if ( (LA2_2==EOF||(LA2_2>=39 && LA2_2<=41)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 11:
                {
                alt2=1;
                }
                break;
            case 43:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDSL.g:575:2: ( ruleInteger )
                    {
                    // InternalDSL.g:575:2: ( ruleInteger )
                    // InternalDSL.g:576:3: ruleInteger
                    {
                     before(grammarAccess.getDataTypeAccess().getIntegerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getIntegerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:581:2: ( ruleFloat )
                    {
                    // InternalDSL.g:581:2: ( ruleFloat )
                    // InternalDSL.g:582:3: ruleFloat
                    {
                     before(grammarAccess.getDataTypeAccess().getFloatParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFloat();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getFloatParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:587:2: ( ruleString0 )
                    {
                    // InternalDSL.g:587:2: ( ruleString0 )
                    // InternalDSL.g:588:3: ruleString0
                    {
                     before(grammarAccess.getDataTypeAccess().getString0ParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleString0();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getString0ParserRuleCall_2()); 

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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDSL.g:597:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:601:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalDSL.g:602:2: ( RULE_STRING )
                    {
                    // InternalDSL.g:602:2: ( RULE_STRING )
                    // InternalDSL.g:603:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:608:2: ( RULE_ID )
                    {
                    // InternalDSL.g:608:2: ( RULE_ID )
                    // InternalDSL.g:609:3: RULE_ID
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


    // $ANTLR start "rule__Field__Alternatives"
    // InternalDSL.g:618:1: rule__Field__Alternatives : ( ( ruleAtomic ) | ( ruleCalculated ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:622:1: ( ( ruleAtomic ) | ( ruleCalculated ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:623:2: ( ruleAtomic )
                    {
                    // InternalDSL.g:623:2: ( ruleAtomic )
                    // InternalDSL.g:624:3: ruleAtomic
                    {
                     before(grammarAccess.getFieldAccess().getAtomicParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getAtomicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:629:2: ( ruleCalculated )
                    {
                    // InternalDSL.g:629:2: ( ruleCalculated )
                    // InternalDSL.g:630:3: ruleCalculated
                    {
                     before(grammarAccess.getFieldAccess().getCalculatedParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCalculated();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getCalculatedParserRuleCall_1()); 

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
    // $ANTLR end "rule__Field__Alternatives"


    // $ANTLR start "rule__Range__Alternatives"
    // InternalDSL.g:639:1: rule__Range__Alternatives : ( ( ruleContinuous ) | ( ruleDiscrete ) );
    public final void rule__Range__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:643:1: ( ( ruleContinuous ) | ( ruleDiscrete ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalDSL.g:644:2: ( ruleContinuous )
                    {
                    // InternalDSL.g:644:2: ( ruleContinuous )
                    // InternalDSL.g:645:3: ruleContinuous
                    {
                     before(grammarAccess.getRangeAccess().getContinuousParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleContinuous();

                    state._fsp--;

                     after(grammarAccess.getRangeAccess().getContinuousParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:650:2: ( ruleDiscrete )
                    {
                    // InternalDSL.g:650:2: ( ruleDiscrete )
                    // InternalDSL.g:651:3: ruleDiscrete
                    {
                     before(grammarAccess.getRangeAccess().getDiscreteParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDiscrete();

                    state._fsp--;

                     after(grammarAccess.getRangeAccess().getDiscreteParserRuleCall_1()); 

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
    // $ANTLR end "rule__Range__Alternatives"


    // $ANTLR start "rule__Integer__Alternatives"
    // InternalDSL.g:660:1: rule__Integer__Alternatives : ( ( ( rule__Integer__Group_0__0 ) ) | ( 'inf' ) );
    public final void rule__Integer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:664:1: ( ( ( rule__Integer__Group_0__0 ) ) | ( 'inf' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||LA6_0==42) ) {
                alt6=1;
            }
            else if ( (LA6_0==11) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:665:2: ( ( rule__Integer__Group_0__0 ) )
                    {
                    // InternalDSL.g:665:2: ( ( rule__Integer__Group_0__0 ) )
                    // InternalDSL.g:666:3: ( rule__Integer__Group_0__0 )
                    {
                     before(grammarAccess.getIntegerAccess().getGroup_0()); 
                    // InternalDSL.g:667:3: ( rule__Integer__Group_0__0 )
                    // InternalDSL.g:667:4: rule__Integer__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Integer__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntegerAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:671:2: ( 'inf' )
                    {
                    // InternalDSL.g:671:2: ( 'inf' )
                    // InternalDSL.g:672:3: 'inf'
                    {
                     before(grammarAccess.getIntegerAccess().getInfKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getIntegerAccess().getInfKeyword_1()); 

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
    // $ANTLR end "rule__Integer__Alternatives"


    // $ANTLR start "rule__Float__Alternatives"
    // InternalDSL.g:681:1: rule__Float__Alternatives : ( ( ( rule__Float__Group_0__0 ) ) | ( 'inf' ) );
    public final void rule__Float__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:685:1: ( ( ( rule__Float__Group_0__0 ) ) | ( 'inf' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||(LA7_0>=42 && LA7_0<=43)) ) {
                alt7=1;
            }
            else if ( (LA7_0==11) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:686:2: ( ( rule__Float__Group_0__0 ) )
                    {
                    // InternalDSL.g:686:2: ( ( rule__Float__Group_0__0 ) )
                    // InternalDSL.g:687:3: ( rule__Float__Group_0__0 )
                    {
                     before(grammarAccess.getFloatAccess().getGroup_0()); 
                    // InternalDSL.g:688:3: ( rule__Float__Group_0__0 )
                    // InternalDSL.g:688:4: rule__Float__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Float__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:692:2: ( 'inf' )
                    {
                    // InternalDSL.g:692:2: ( 'inf' )
                    // InternalDSL.g:693:3: 'inf'
                    {
                     before(grammarAccess.getFloatAccess().getInfKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getFloatAccess().getInfKeyword_1()); 

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
    // $ANTLR end "rule__Float__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalDSL.g:702:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:706:1: ( ( 'E' ) | ( 'e' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            else if ( (LA8_0==13) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDSL.g:707:2: ( 'E' )
                    {
                    // InternalDSL.g:707:2: ( 'E' )
                    // InternalDSL.g:708:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:713:2: ( 'e' )
                    {
                    // InternalDSL.g:713:2: ( 'e' )
                    // InternalDSL.g:714:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__ContainerType__Alternatives"
    // InternalDSL.g:723:1: rule__ContainerType__Alternatives : ( ( ( 'Building' ) ) | ( ( 'Floor' ) ) | ( ( 'Corridor' ) ) | ( ( 'Room' ) ) | ( ( 'Furniture' ) ) | ( ( 'Wall' ) ) | ( ( 'Window' ) ) );
    public final void rule__ContainerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:727:1: ( ( ( 'Building' ) ) | ( ( 'Floor' ) ) | ( ( 'Corridor' ) ) | ( ( 'Room' ) ) | ( ( 'Furniture' ) ) | ( ( 'Wall' ) ) | ( ( 'Window' ) ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 16:
                {
                alt9=3;
                }
                break;
            case 17:
                {
                alt9=4;
                }
                break;
            case 18:
                {
                alt9=5;
                }
                break;
            case 19:
                {
                alt9=6;
                }
                break;
            case 20:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDSL.g:728:2: ( ( 'Building' ) )
                    {
                    // InternalDSL.g:728:2: ( ( 'Building' ) )
                    // InternalDSL.g:729:3: ( 'Building' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getBuildingEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:730:3: ( 'Building' )
                    // InternalDSL.g:730:4: 'Building'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getBuildingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:734:2: ( ( 'Floor' ) )
                    {
                    // InternalDSL.g:734:2: ( ( 'Floor' ) )
                    // InternalDSL.g:735:3: ( 'Floor' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getFloorEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:736:3: ( 'Floor' )
                    // InternalDSL.g:736:4: 'Floor'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getFloorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:740:2: ( ( 'Corridor' ) )
                    {
                    // InternalDSL.g:740:2: ( ( 'Corridor' ) )
                    // InternalDSL.g:741:3: ( 'Corridor' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getCorridorEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:742:3: ( 'Corridor' )
                    // InternalDSL.g:742:4: 'Corridor'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getCorridorEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:746:2: ( ( 'Room' ) )
                    {
                    // InternalDSL.g:746:2: ( ( 'Room' ) )
                    // InternalDSL.g:747:3: ( 'Room' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getRoomEnumLiteralDeclaration_3()); 
                    // InternalDSL.g:748:3: ( 'Room' )
                    // InternalDSL.g:748:4: 'Room'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getRoomEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:752:2: ( ( 'Furniture' ) )
                    {
                    // InternalDSL.g:752:2: ( ( 'Furniture' ) )
                    // InternalDSL.g:753:3: ( 'Furniture' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getFurnitureEnumLiteralDeclaration_4()); 
                    // InternalDSL.g:754:3: ( 'Furniture' )
                    // InternalDSL.g:754:4: 'Furniture'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getFurnitureEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:758:2: ( ( 'Wall' ) )
                    {
                    // InternalDSL.g:758:2: ( ( 'Wall' ) )
                    // InternalDSL.g:759:3: ( 'Wall' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getWallEnumLiteralDeclaration_5()); 
                    // InternalDSL.g:760:3: ( 'Wall' )
                    // InternalDSL.g:760:4: 'Wall'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getContainerTypeAccess().getWallEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:764:2: ( ( 'Window' ) )
                    {
                    // InternalDSL.g:764:2: ( ( 'Window' ) )
                    // InternalDSL.g:765:3: ( 'Window' )
                    {
                     before(grammarAccess.getContainerTypeAccess().getWindowEnumLiteralDeclaration_6()); 
                    // InternalDSL.g:766:3: ( 'Window' )
                    // InternalDSL.g:766:4: 'Window'
                    {
                    match(input,20,FOLLOW_2); 

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


    // $ANTLR start "rule__Catalog__Group__0"
    // InternalDSL.g:774:1: rule__Catalog__Group__0 : rule__Catalog__Group__0__Impl rule__Catalog__Group__1 ;
    public final void rule__Catalog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:778:1: ( rule__Catalog__Group__0__Impl rule__Catalog__Group__1 )
            // InternalDSL.g:779:2: rule__Catalog__Group__0__Impl rule__Catalog__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Catalog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalog__Group__1();

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
    // $ANTLR end "rule__Catalog__Group__0"


    // $ANTLR start "rule__Catalog__Group__0__Impl"
    // InternalDSL.g:786:1: rule__Catalog__Group__0__Impl : ( 'Catalog' ) ;
    public final void rule__Catalog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:790:1: ( ( 'Catalog' ) )
            // InternalDSL.g:791:1: ( 'Catalog' )
            {
            // InternalDSL.g:791:1: ( 'Catalog' )
            // InternalDSL.g:792:2: 'Catalog'
            {
             before(grammarAccess.getCatalogAccess().getCatalogKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCatalogAccess().getCatalogKeyword_0()); 

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
    // $ANTLR end "rule__Catalog__Group__0__Impl"


    // $ANTLR start "rule__Catalog__Group__1"
    // InternalDSL.g:801:1: rule__Catalog__Group__1 : rule__Catalog__Group__1__Impl rule__Catalog__Group__2 ;
    public final void rule__Catalog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:805:1: ( rule__Catalog__Group__1__Impl rule__Catalog__Group__2 )
            // InternalDSL.g:806:2: rule__Catalog__Group__1__Impl rule__Catalog__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Catalog__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalog__Group__2();

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
    // $ANTLR end "rule__Catalog__Group__1"


    // $ANTLR start "rule__Catalog__Group__1__Impl"
    // InternalDSL.g:813:1: rule__Catalog__Group__1__Impl : ( ( rule__Catalog__NameAssignment_1 ) ) ;
    public final void rule__Catalog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:817:1: ( ( ( rule__Catalog__NameAssignment_1 ) ) )
            // InternalDSL.g:818:1: ( ( rule__Catalog__NameAssignment_1 ) )
            {
            // InternalDSL.g:818:1: ( ( rule__Catalog__NameAssignment_1 ) )
            // InternalDSL.g:819:2: ( rule__Catalog__NameAssignment_1 )
            {
             before(grammarAccess.getCatalogAccess().getNameAssignment_1()); 
            // InternalDSL.g:820:2: ( rule__Catalog__NameAssignment_1 )
            // InternalDSL.g:820:3: rule__Catalog__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Catalog__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCatalogAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Catalog__Group__1__Impl"


    // $ANTLR start "rule__Catalog__Group__2"
    // InternalDSL.g:828:1: rule__Catalog__Group__2 : rule__Catalog__Group__2__Impl rule__Catalog__Group__3 ;
    public final void rule__Catalog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:832:1: ( rule__Catalog__Group__2__Impl rule__Catalog__Group__3 )
            // InternalDSL.g:833:2: rule__Catalog__Group__2__Impl rule__Catalog__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Catalog__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalog__Group__3();

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
    // $ANTLR end "rule__Catalog__Group__2"


    // $ANTLR start "rule__Catalog__Group__2__Impl"
    // InternalDSL.g:840:1: rule__Catalog__Group__2__Impl : ( 'Infrastructure :' ) ;
    public final void rule__Catalog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:844:1: ( ( 'Infrastructure :' ) )
            // InternalDSL.g:845:1: ( 'Infrastructure :' )
            {
            // InternalDSL.g:845:1: ( 'Infrastructure :' )
            // InternalDSL.g:846:2: 'Infrastructure :'
            {
             before(grammarAccess.getCatalogAccess().getInfrastructureKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCatalogAccess().getInfrastructureKeyword_2()); 

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
    // $ANTLR end "rule__Catalog__Group__2__Impl"


    // $ANTLR start "rule__Catalog__Group__3"
    // InternalDSL.g:855:1: rule__Catalog__Group__3 : rule__Catalog__Group__3__Impl rule__Catalog__Group__4 ;
    public final void rule__Catalog__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:859:1: ( rule__Catalog__Group__3__Impl rule__Catalog__Group__4 )
            // InternalDSL.g:860:2: rule__Catalog__Group__3__Impl rule__Catalog__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Catalog__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalog__Group__4();

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
    // $ANTLR end "rule__Catalog__Group__3"


    // $ANTLR start "rule__Catalog__Group__3__Impl"
    // InternalDSL.g:867:1: rule__Catalog__Group__3__Impl : ( ( rule__Catalog__RecordsAssignment_3 ) ) ;
    public final void rule__Catalog__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:871:1: ( ( ( rule__Catalog__RecordsAssignment_3 ) ) )
            // InternalDSL.g:872:1: ( ( rule__Catalog__RecordsAssignment_3 ) )
            {
            // InternalDSL.g:872:1: ( ( rule__Catalog__RecordsAssignment_3 ) )
            // InternalDSL.g:873:2: ( rule__Catalog__RecordsAssignment_3 )
            {
             before(grammarAccess.getCatalogAccess().getRecordsAssignment_3()); 
            // InternalDSL.g:874:2: ( rule__Catalog__RecordsAssignment_3 )
            // InternalDSL.g:874:3: rule__Catalog__RecordsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Catalog__RecordsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCatalogAccess().getRecordsAssignment_3()); 

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
    // $ANTLR end "rule__Catalog__Group__3__Impl"


    // $ANTLR start "rule__Catalog__Group__4"
    // InternalDSL.g:882:1: rule__Catalog__Group__4 : rule__Catalog__Group__4__Impl rule__Catalog__Group__5 ;
    public final void rule__Catalog__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:886:1: ( rule__Catalog__Group__4__Impl rule__Catalog__Group__5 )
            // InternalDSL.g:887:2: rule__Catalog__Group__4__Impl rule__Catalog__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Catalog__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalog__Group__5();

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
    // $ANTLR end "rule__Catalog__Group__4"


    // $ANTLR start "rule__Catalog__Group__4__Impl"
    // InternalDSL.g:894:1: rule__Catalog__Group__4__Impl : ( ( rule__Catalog__RecordsAssignment_4 )* ) ;
    public final void rule__Catalog__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:898:1: ( ( ( rule__Catalog__RecordsAssignment_4 )* ) )
            // InternalDSL.g:899:1: ( ( rule__Catalog__RecordsAssignment_4 )* )
            {
            // InternalDSL.g:899:1: ( ( rule__Catalog__RecordsAssignment_4 )* )
            // InternalDSL.g:900:2: ( rule__Catalog__RecordsAssignment_4 )*
            {
             before(grammarAccess.getCatalogAccess().getRecordsAssignment_4()); 
            // InternalDSL.g:901:2: ( rule__Catalog__RecordsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=14 && LA10_0<=20)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDSL.g:901:3: rule__Catalog__RecordsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Catalog__RecordsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCatalogAccess().getRecordsAssignment_4()); 

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
    // $ANTLR end "rule__Catalog__Group__4__Impl"


    // $ANTLR start "rule__Catalog__Group__5"
    // InternalDSL.g:909:1: rule__Catalog__Group__5 : rule__Catalog__Group__5__Impl rule__Catalog__Group__6 ;
    public final void rule__Catalog__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:913:1: ( rule__Catalog__Group__5__Impl rule__Catalog__Group__6 )
            // InternalDSL.g:914:2: rule__Catalog__Group__5__Impl rule__Catalog__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Catalog__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalog__Group__6();

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
    // $ANTLR end "rule__Catalog__Group__5"


    // $ANTLR start "rule__Catalog__Group__5__Impl"
    // InternalDSL.g:921:1: rule__Catalog__Group__5__Impl : ( 'Observation patterns :' ) ;
    public final void rule__Catalog__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:925:1: ( ( 'Observation patterns :' ) )
            // InternalDSL.g:926:1: ( 'Observation patterns :' )
            {
            // InternalDSL.g:926:1: ( 'Observation patterns :' )
            // InternalDSL.g:927:2: 'Observation patterns :'
            {
             before(grammarAccess.getCatalogAccess().getObservationPatternsKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCatalogAccess().getObservationPatternsKeyword_5()); 

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
    // $ANTLR end "rule__Catalog__Group__5__Impl"


    // $ANTLR start "rule__Catalog__Group__6"
    // InternalDSL.g:936:1: rule__Catalog__Group__6 : rule__Catalog__Group__6__Impl rule__Catalog__Group__7 ;
    public final void rule__Catalog__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:940:1: ( rule__Catalog__Group__6__Impl rule__Catalog__Group__7 )
            // InternalDSL.g:941:2: rule__Catalog__Group__6__Impl rule__Catalog__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Catalog__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalog__Group__7();

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
    // $ANTLR end "rule__Catalog__Group__6"


    // $ANTLR start "rule__Catalog__Group__6__Impl"
    // InternalDSL.g:948:1: rule__Catalog__Group__6__Impl : ( ( rule__Catalog__PatternsAssignment_6 ) ) ;
    public final void rule__Catalog__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:952:1: ( ( ( rule__Catalog__PatternsAssignment_6 ) ) )
            // InternalDSL.g:953:1: ( ( rule__Catalog__PatternsAssignment_6 ) )
            {
            // InternalDSL.g:953:1: ( ( rule__Catalog__PatternsAssignment_6 ) )
            // InternalDSL.g:954:2: ( rule__Catalog__PatternsAssignment_6 )
            {
             before(grammarAccess.getCatalogAccess().getPatternsAssignment_6()); 
            // InternalDSL.g:955:2: ( rule__Catalog__PatternsAssignment_6 )
            // InternalDSL.g:955:3: rule__Catalog__PatternsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Catalog__PatternsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCatalogAccess().getPatternsAssignment_6()); 

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
    // $ANTLR end "rule__Catalog__Group__6__Impl"


    // $ANTLR start "rule__Catalog__Group__7"
    // InternalDSL.g:963:1: rule__Catalog__Group__7 : rule__Catalog__Group__7__Impl ;
    public final void rule__Catalog__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:967:1: ( rule__Catalog__Group__7__Impl )
            // InternalDSL.g:968:2: rule__Catalog__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Catalog__Group__7__Impl();

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
    // $ANTLR end "rule__Catalog__Group__7"


    // $ANTLR start "rule__Catalog__Group__7__Impl"
    // InternalDSL.g:974:1: rule__Catalog__Group__7__Impl : ( ( rule__Catalog__PatternsAssignment_7 )* ) ;
    public final void rule__Catalog__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:978:1: ( ( ( rule__Catalog__PatternsAssignment_7 )* ) )
            // InternalDSL.g:979:1: ( ( rule__Catalog__PatternsAssignment_7 )* )
            {
            // InternalDSL.g:979:1: ( ( rule__Catalog__PatternsAssignment_7 )* )
            // InternalDSL.g:980:2: ( rule__Catalog__PatternsAssignment_7 )*
            {
             before(grammarAccess.getCatalogAccess().getPatternsAssignment_7()); 
            // InternalDSL.g:981:2: ( rule__Catalog__PatternsAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDSL.g:981:3: rule__Catalog__PatternsAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Catalog__PatternsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCatalogAccess().getPatternsAssignment_7()); 

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
    // $ANTLR end "rule__Catalog__Group__7__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalDSL.g:990:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:994:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalDSL.g:995:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

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
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalDSL.g:1002:1: rule__Container__Group__0__Impl : ( ( rule__Container__TypeAssignment_0 ) ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1006:1: ( ( ( rule__Container__TypeAssignment_0 ) ) )
            // InternalDSL.g:1007:1: ( ( rule__Container__TypeAssignment_0 ) )
            {
            // InternalDSL.g:1007:1: ( ( rule__Container__TypeAssignment_0 ) )
            // InternalDSL.g:1008:2: ( rule__Container__TypeAssignment_0 )
            {
             before(grammarAccess.getContainerAccess().getTypeAssignment_0()); 
            // InternalDSL.g:1009:2: ( rule__Container__TypeAssignment_0 )
            // InternalDSL.g:1009:3: rule__Container__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Container__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalDSL.g:1017:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1021:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalDSL.g:1022:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

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
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalDSL.g:1029:1: rule__Container__Group__1__Impl : ( ( rule__Container__NameAssignment_1 ) ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1033:1: ( ( ( rule__Container__NameAssignment_1 ) ) )
            // InternalDSL.g:1034:1: ( ( rule__Container__NameAssignment_1 ) )
            {
            // InternalDSL.g:1034:1: ( ( rule__Container__NameAssignment_1 ) )
            // InternalDSL.g:1035:2: ( rule__Container__NameAssignment_1 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_1()); 
            // InternalDSL.g:1036:2: ( rule__Container__NameAssignment_1 )
            // InternalDSL.g:1036:3: rule__Container__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalDSL.g:1044:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1048:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalDSL.g:1049:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__3();

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
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalDSL.g:1056:1: rule__Container__Group__2__Impl : ( ( rule__Container__Group_2__0 )* ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1060:1: ( ( ( rule__Container__Group_2__0 )* ) )
            // InternalDSL.g:1061:1: ( ( rule__Container__Group_2__0 )* )
            {
            // InternalDSL.g:1061:1: ( ( rule__Container__Group_2__0 )* )
            // InternalDSL.g:1062:2: ( rule__Container__Group_2__0 )*
            {
             before(grammarAccess.getContainerAccess().getGroup_2()); 
            // InternalDSL.g:1063:2: ( rule__Container__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDSL.g:1063:3: rule__Container__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Container__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // InternalDSL.g:1071:1: rule__Container__Group__3 : rule__Container__Group__3__Impl ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1075:1: ( rule__Container__Group__3__Impl )
            // InternalDSL.g:1076:2: rule__Container__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__3__Impl();

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
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // InternalDSL.g:1082:1: rule__Container__Group__3__Impl : ( '\\u25A1' ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1086:1: ( ( '\\u25A1' ) )
            // InternalDSL.g:1087:1: ( '\\u25A1' )
            {
            // InternalDSL.g:1087:1: ( '\\u25A1' )
            // InternalDSL.g:1088:2: '\\u25A1'
            {
             before(grammarAccess.getContainerAccess().getWhiteSquareKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getWhiteSquareKeyword_3()); 

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
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Container__Group_2__0"
    // InternalDSL.g:1098:1: rule__Container__Group_2__0 : rule__Container__Group_2__0__Impl rule__Container__Group_2__1 ;
    public final void rule__Container__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1102:1: ( rule__Container__Group_2__0__Impl rule__Container__Group_2__1 )
            // InternalDSL.g:1103:2: rule__Container__Group_2__0__Impl rule__Container__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Container__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_2__1();

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
    // $ANTLR end "rule__Container__Group_2__0"


    // $ANTLR start "rule__Container__Group_2__0__Impl"
    // InternalDSL.g:1110:1: rule__Container__Group_2__0__Impl : ( '\\u231E' ) ;
    public final void rule__Container__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1114:1: ( ( '\\u231E' ) )
            // InternalDSL.g:1115:1: ( '\\u231E' )
            {
            // InternalDSL.g:1115:1: ( '\\u231E' )
            // InternalDSL.g:1116:2: '\\u231E'
            {
             before(grammarAccess.getContainerAccess().getBottomLeftCornerKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getBottomLeftCornerKeyword_2_0()); 

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
    // $ANTLR end "rule__Container__Group_2__0__Impl"


    // $ANTLR start "rule__Container__Group_2__1"
    // InternalDSL.g:1125:1: rule__Container__Group_2__1 : rule__Container__Group_2__1__Impl ;
    public final void rule__Container__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1129:1: ( rule__Container__Group_2__1__Impl )
            // InternalDSL.g:1130:2: rule__Container__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_2__1__Impl();

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
    // $ANTLR end "rule__Container__Group_2__1"


    // $ANTLR start "rule__Container__Group_2__1__Impl"
    // InternalDSL.g:1136:1: rule__Container__Group_2__1__Impl : ( ( rule__Container__ContainsAssignment_2_1 ) ) ;
    public final void rule__Container__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1140:1: ( ( ( rule__Container__ContainsAssignment_2_1 ) ) )
            // InternalDSL.g:1141:1: ( ( rule__Container__ContainsAssignment_2_1 ) )
            {
            // InternalDSL.g:1141:1: ( ( rule__Container__ContainsAssignment_2_1 ) )
            // InternalDSL.g:1142:2: ( rule__Container__ContainsAssignment_2_1 )
            {
             before(grammarAccess.getContainerAccess().getContainsAssignment_2_1()); 
            // InternalDSL.g:1143:2: ( rule__Container__ContainsAssignment_2_1 )
            // InternalDSL.g:1143:3: rule__Container__ContainsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__ContainsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getContainsAssignment_2_1()); 

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
    // $ANTLR end "rule__Container__Group_2__1__Impl"


    // $ANTLR start "rule__Periodic__Group__0"
    // InternalDSL.g:1152:1: rule__Periodic__Group__0 : rule__Periodic__Group__0__Impl rule__Periodic__Group__1 ;
    public final void rule__Periodic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1156:1: ( rule__Periodic__Group__0__Impl rule__Periodic__Group__1 )
            // InternalDSL.g:1157:2: rule__Periodic__Group__0__Impl rule__Periodic__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Periodic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Periodic__Group__1();

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
    // $ANTLR end "rule__Periodic__Group__0"


    // $ANTLR start "rule__Periodic__Group__0__Impl"
    // InternalDSL.g:1164:1: rule__Periodic__Group__0__Impl : ( 'Periodic sensor' ) ;
    public final void rule__Periodic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1168:1: ( ( 'Periodic sensor' ) )
            // InternalDSL.g:1169:1: ( 'Periodic sensor' )
            {
            // InternalDSL.g:1169:1: ( 'Periodic sensor' )
            // InternalDSL.g:1170:2: 'Periodic sensor'
            {
             before(grammarAccess.getPeriodicAccess().getPeriodicSensorKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPeriodicAccess().getPeriodicSensorKeyword_0()); 

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
    // $ANTLR end "rule__Periodic__Group__0__Impl"


    // $ANTLR start "rule__Periodic__Group__1"
    // InternalDSL.g:1179:1: rule__Periodic__Group__1 : rule__Periodic__Group__1__Impl rule__Periodic__Group__2 ;
    public final void rule__Periodic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1183:1: ( rule__Periodic__Group__1__Impl rule__Periodic__Group__2 )
            // InternalDSL.g:1184:2: rule__Periodic__Group__1__Impl rule__Periodic__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Periodic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Periodic__Group__2();

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
    // $ANTLR end "rule__Periodic__Group__1"


    // $ANTLR start "rule__Periodic__Group__1__Impl"
    // InternalDSL.g:1191:1: rule__Periodic__Group__1__Impl : ( ( rule__Periodic__NameAssignment_1 ) ) ;
    public final void rule__Periodic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1195:1: ( ( ( rule__Periodic__NameAssignment_1 ) ) )
            // InternalDSL.g:1196:1: ( ( rule__Periodic__NameAssignment_1 ) )
            {
            // InternalDSL.g:1196:1: ( ( rule__Periodic__NameAssignment_1 ) )
            // InternalDSL.g:1197:2: ( rule__Periodic__NameAssignment_1 )
            {
             before(grammarAccess.getPeriodicAccess().getNameAssignment_1()); 
            // InternalDSL.g:1198:2: ( rule__Periodic__NameAssignment_1 )
            // InternalDSL.g:1198:3: rule__Periodic__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Periodic__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Periodic__Group__1__Impl"


    // $ANTLR start "rule__Periodic__Group__2"
    // InternalDSL.g:1206:1: rule__Periodic__Group__2 : rule__Periodic__Group__2__Impl rule__Periodic__Group__3 ;
    public final void rule__Periodic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1210:1: ( rule__Periodic__Group__2__Impl rule__Periodic__Group__3 )
            // InternalDSL.g:1211:2: rule__Periodic__Group__2__Impl rule__Periodic__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Periodic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Periodic__Group__3();

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
    // $ANTLR end "rule__Periodic__Group__2"


    // $ANTLR start "rule__Periodic__Group__2__Impl"
    // InternalDSL.g:1218:1: rule__Periodic__Group__2__Impl : ( 'observes' ) ;
    public final void rule__Periodic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1222:1: ( ( 'observes' ) )
            // InternalDSL.g:1223:1: ( 'observes' )
            {
            // InternalDSL.g:1223:1: ( 'observes' )
            // InternalDSL.g:1224:2: 'observes'
            {
             before(grammarAccess.getPeriodicAccess().getObservesKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPeriodicAccess().getObservesKeyword_2()); 

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
    // $ANTLR end "rule__Periodic__Group__2__Impl"


    // $ANTLR start "rule__Periodic__Group__3"
    // InternalDSL.g:1233:1: rule__Periodic__Group__3 : rule__Periodic__Group__3__Impl rule__Periodic__Group__4 ;
    public final void rule__Periodic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1237:1: ( rule__Periodic__Group__3__Impl rule__Periodic__Group__4 )
            // InternalDSL.g:1238:2: rule__Periodic__Group__3__Impl rule__Periodic__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Periodic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Periodic__Group__4();

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
    // $ANTLR end "rule__Periodic__Group__3"


    // $ANTLR start "rule__Periodic__Group__3__Impl"
    // InternalDSL.g:1245:1: rule__Periodic__Group__3__Impl : ( ( rule__Periodic__ObservesAssignment_3 ) ) ;
    public final void rule__Periodic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1249:1: ( ( ( rule__Periodic__ObservesAssignment_3 ) ) )
            // InternalDSL.g:1250:1: ( ( rule__Periodic__ObservesAssignment_3 ) )
            {
            // InternalDSL.g:1250:1: ( ( rule__Periodic__ObservesAssignment_3 ) )
            // InternalDSL.g:1251:2: ( rule__Periodic__ObservesAssignment_3 )
            {
             before(grammarAccess.getPeriodicAccess().getObservesAssignment_3()); 
            // InternalDSL.g:1252:2: ( rule__Periodic__ObservesAssignment_3 )
            // InternalDSL.g:1252:3: rule__Periodic__ObservesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Periodic__ObservesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicAccess().getObservesAssignment_3()); 

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
    // $ANTLR end "rule__Periodic__Group__3__Impl"


    // $ANTLR start "rule__Periodic__Group__4"
    // InternalDSL.g:1260:1: rule__Periodic__Group__4 : rule__Periodic__Group__4__Impl rule__Periodic__Group__5 ;
    public final void rule__Periodic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1264:1: ( rule__Periodic__Group__4__Impl rule__Periodic__Group__5 )
            // InternalDSL.g:1265:2: rule__Periodic__Group__4__Impl rule__Periodic__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Periodic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Periodic__Group__5();

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
    // $ANTLR end "rule__Periodic__Group__4"


    // $ANTLR start "rule__Periodic__Group__4__Impl"
    // InternalDSL.g:1272:1: rule__Periodic__Group__4__Impl : ( 'every' ) ;
    public final void rule__Periodic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1276:1: ( ( 'every' ) )
            // InternalDSL.g:1277:1: ( 'every' )
            {
            // InternalDSL.g:1277:1: ( 'every' )
            // InternalDSL.g:1278:2: 'every'
            {
             before(grammarAccess.getPeriodicAccess().getEveryKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPeriodicAccess().getEveryKeyword_4()); 

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
    // $ANTLR end "rule__Periodic__Group__4__Impl"


    // $ANTLR start "rule__Periodic__Group__5"
    // InternalDSL.g:1287:1: rule__Periodic__Group__5 : rule__Periodic__Group__5__Impl rule__Periodic__Group__6 ;
    public final void rule__Periodic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1291:1: ( rule__Periodic__Group__5__Impl rule__Periodic__Group__6 )
            // InternalDSL.g:1292:2: rule__Periodic__Group__5__Impl rule__Periodic__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Periodic__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Periodic__Group__6();

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
    // $ANTLR end "rule__Periodic__Group__5"


    // $ANTLR start "rule__Periodic__Group__5__Impl"
    // InternalDSL.g:1299:1: rule__Periodic__Group__5__Impl : ( ( rule__Periodic__PeriodAssignment_5 ) ) ;
    public final void rule__Periodic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1303:1: ( ( ( rule__Periodic__PeriodAssignment_5 ) ) )
            // InternalDSL.g:1304:1: ( ( rule__Periodic__PeriodAssignment_5 ) )
            {
            // InternalDSL.g:1304:1: ( ( rule__Periodic__PeriodAssignment_5 ) )
            // InternalDSL.g:1305:2: ( rule__Periodic__PeriodAssignment_5 )
            {
             before(grammarAccess.getPeriodicAccess().getPeriodAssignment_5()); 
            // InternalDSL.g:1306:2: ( rule__Periodic__PeriodAssignment_5 )
            // InternalDSL.g:1306:3: rule__Periodic__PeriodAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Periodic__PeriodAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicAccess().getPeriodAssignment_5()); 

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
    // $ANTLR end "rule__Periodic__Group__5__Impl"


    // $ANTLR start "rule__Periodic__Group__6"
    // InternalDSL.g:1314:1: rule__Periodic__Group__6 : rule__Periodic__Group__6__Impl rule__Periodic__Group__7 ;
    public final void rule__Periodic__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1318:1: ( rule__Periodic__Group__6__Impl rule__Periodic__Group__7 )
            // InternalDSL.g:1319:2: rule__Periodic__Group__6__Impl rule__Periodic__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Periodic__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Periodic__Group__7();

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
    // $ANTLR end "rule__Periodic__Group__6"


    // $ANTLR start "rule__Periodic__Group__6__Impl"
    // InternalDSL.g:1326:1: rule__Periodic__Group__6__Impl : ( 'seconds' ) ;
    public final void rule__Periodic__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1330:1: ( ( 'seconds' ) )
            // InternalDSL.g:1331:1: ( 'seconds' )
            {
            // InternalDSL.g:1331:1: ( 'seconds' )
            // InternalDSL.g:1332:2: 'seconds'
            {
             before(grammarAccess.getPeriodicAccess().getSecondsKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPeriodicAccess().getSecondsKeyword_6()); 

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
    // $ANTLR end "rule__Periodic__Group__6__Impl"


    // $ANTLR start "rule__Periodic__Group__7"
    // InternalDSL.g:1341:1: rule__Periodic__Group__7 : rule__Periodic__Group__7__Impl ;
    public final void rule__Periodic__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1345:1: ( rule__Periodic__Group__7__Impl )
            // InternalDSL.g:1346:2: rule__Periodic__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Periodic__Group__7__Impl();

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
    // $ANTLR end "rule__Periodic__Group__7"


    // $ANTLR start "rule__Periodic__Group__7__Impl"
    // InternalDSL.g:1352:1: rule__Periodic__Group__7__Impl : ( ( rule__Periodic__Group_7__0 )? ) ;
    public final void rule__Periodic__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1356:1: ( ( ( rule__Periodic__Group_7__0 )? ) )
            // InternalDSL.g:1357:1: ( ( rule__Periodic__Group_7__0 )? )
            {
            // InternalDSL.g:1357:1: ( ( rule__Periodic__Group_7__0 )? )
            // InternalDSL.g:1358:2: ( rule__Periodic__Group_7__0 )?
            {
             before(grammarAccess.getPeriodicAccess().getGroup_7()); 
            // InternalDSL.g:1359:2: ( rule__Periodic__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDSL.g:1359:3: rule__Periodic__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Periodic__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPeriodicAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Periodic__Group__7__Impl"


    // $ANTLR start "rule__Periodic__Group_7__0"
    // InternalDSL.g:1368:1: rule__Periodic__Group_7__0 : rule__Periodic__Group_7__0__Impl rule__Periodic__Group_7__1 ;
    public final void rule__Periodic__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1372:1: ( rule__Periodic__Group_7__0__Impl rule__Periodic__Group_7__1 )
            // InternalDSL.g:1373:2: rule__Periodic__Group_7__0__Impl rule__Periodic__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Periodic__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Periodic__Group_7__1();

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
    // $ANTLR end "rule__Periodic__Group_7__0"


    // $ANTLR start "rule__Periodic__Group_7__0__Impl"
    // InternalDSL.g:1380:1: rule__Periodic__Group_7__0__Impl : ( 'is calculated from' ) ;
    public final void rule__Periodic__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1384:1: ( ( 'is calculated from' ) )
            // InternalDSL.g:1385:1: ( 'is calculated from' )
            {
            // InternalDSL.g:1385:1: ( 'is calculated from' )
            // InternalDSL.g:1386:2: 'is calculated from'
            {
             before(grammarAccess.getPeriodicAccess().getIsCalculatedFromKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPeriodicAccess().getIsCalculatedFromKeyword_7_0()); 

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
    // $ANTLR end "rule__Periodic__Group_7__0__Impl"


    // $ANTLR start "rule__Periodic__Group_7__1"
    // InternalDSL.g:1395:1: rule__Periodic__Group_7__1 : rule__Periodic__Group_7__1__Impl ;
    public final void rule__Periodic__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1399:1: ( rule__Periodic__Group_7__1__Impl )
            // InternalDSL.g:1400:2: rule__Periodic__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Periodic__Group_7__1__Impl();

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
    // $ANTLR end "rule__Periodic__Group_7__1"


    // $ANTLR start "rule__Periodic__Group_7__1__Impl"
    // InternalDSL.g:1406:1: rule__Periodic__Group_7__1__Impl : ( ( rule__Periodic__CalculatedFromAssignment_7_1 ) ) ;
    public final void rule__Periodic__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1410:1: ( ( ( rule__Periodic__CalculatedFromAssignment_7_1 ) ) )
            // InternalDSL.g:1411:1: ( ( rule__Periodic__CalculatedFromAssignment_7_1 ) )
            {
            // InternalDSL.g:1411:1: ( ( rule__Periodic__CalculatedFromAssignment_7_1 ) )
            // InternalDSL.g:1412:2: ( rule__Periodic__CalculatedFromAssignment_7_1 )
            {
             before(grammarAccess.getPeriodicAccess().getCalculatedFromAssignment_7_1()); 
            // InternalDSL.g:1413:2: ( rule__Periodic__CalculatedFromAssignment_7_1 )
            // InternalDSL.g:1413:3: rule__Periodic__CalculatedFromAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Periodic__CalculatedFromAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicAccess().getCalculatedFromAssignment_7_1()); 

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
    // $ANTLR end "rule__Periodic__Group_7__1__Impl"


    // $ANTLR start "rule__Event_Based__Group__0"
    // InternalDSL.g:1422:1: rule__Event_Based__Group__0 : rule__Event_Based__Group__0__Impl rule__Event_Based__Group__1 ;
    public final void rule__Event_Based__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1426:1: ( rule__Event_Based__Group__0__Impl rule__Event_Based__Group__1 )
            // InternalDSL.g:1427:2: rule__Event_Based__Group__0__Impl rule__Event_Based__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Event_Based__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event_Based__Group__1();

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
    // $ANTLR end "rule__Event_Based__Group__0"


    // $ANTLR start "rule__Event_Based__Group__0__Impl"
    // InternalDSL.g:1434:1: rule__Event_Based__Group__0__Impl : ( 'Event Based sensor' ) ;
    public final void rule__Event_Based__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1438:1: ( ( 'Event Based sensor' ) )
            // InternalDSL.g:1439:1: ( 'Event Based sensor' )
            {
            // InternalDSL.g:1439:1: ( 'Event Based sensor' )
            // InternalDSL.g:1440:2: 'Event Based sensor'
            {
             before(grammarAccess.getEvent_BasedAccess().getEventBasedSensorKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEvent_BasedAccess().getEventBasedSensorKeyword_0()); 

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
    // $ANTLR end "rule__Event_Based__Group__0__Impl"


    // $ANTLR start "rule__Event_Based__Group__1"
    // InternalDSL.g:1449:1: rule__Event_Based__Group__1 : rule__Event_Based__Group__1__Impl rule__Event_Based__Group__2 ;
    public final void rule__Event_Based__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1453:1: ( rule__Event_Based__Group__1__Impl rule__Event_Based__Group__2 )
            // InternalDSL.g:1454:2: rule__Event_Based__Group__1__Impl rule__Event_Based__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Event_Based__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event_Based__Group__2();

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
    // $ANTLR end "rule__Event_Based__Group__1"


    // $ANTLR start "rule__Event_Based__Group__1__Impl"
    // InternalDSL.g:1461:1: rule__Event_Based__Group__1__Impl : ( ( rule__Event_Based__NameAssignment_1 ) ) ;
    public final void rule__Event_Based__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1465:1: ( ( ( rule__Event_Based__NameAssignment_1 ) ) )
            // InternalDSL.g:1466:1: ( ( rule__Event_Based__NameAssignment_1 ) )
            {
            // InternalDSL.g:1466:1: ( ( rule__Event_Based__NameAssignment_1 ) )
            // InternalDSL.g:1467:2: ( rule__Event_Based__NameAssignment_1 )
            {
             before(grammarAccess.getEvent_BasedAccess().getNameAssignment_1()); 
            // InternalDSL.g:1468:2: ( rule__Event_Based__NameAssignment_1 )
            // InternalDSL.g:1468:3: rule__Event_Based__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Event_Based__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvent_BasedAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Event_Based__Group__1__Impl"


    // $ANTLR start "rule__Event_Based__Group__2"
    // InternalDSL.g:1476:1: rule__Event_Based__Group__2 : rule__Event_Based__Group__2__Impl rule__Event_Based__Group__3 ;
    public final void rule__Event_Based__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1480:1: ( rule__Event_Based__Group__2__Impl rule__Event_Based__Group__3 )
            // InternalDSL.g:1481:2: rule__Event_Based__Group__2__Impl rule__Event_Based__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Event_Based__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event_Based__Group__3();

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
    // $ANTLR end "rule__Event_Based__Group__2"


    // $ANTLR start "rule__Event_Based__Group__2__Impl"
    // InternalDSL.g:1488:1: rule__Event_Based__Group__2__Impl : ( 'observes' ) ;
    public final void rule__Event_Based__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1492:1: ( ( 'observes' ) )
            // InternalDSL.g:1493:1: ( 'observes' )
            {
            // InternalDSL.g:1493:1: ( 'observes' )
            // InternalDSL.g:1494:2: 'observes'
            {
             before(grammarAccess.getEvent_BasedAccess().getObservesKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEvent_BasedAccess().getObservesKeyword_2()); 

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
    // $ANTLR end "rule__Event_Based__Group__2__Impl"


    // $ANTLR start "rule__Event_Based__Group__3"
    // InternalDSL.g:1503:1: rule__Event_Based__Group__3 : rule__Event_Based__Group__3__Impl rule__Event_Based__Group__4 ;
    public final void rule__Event_Based__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1507:1: ( rule__Event_Based__Group__3__Impl rule__Event_Based__Group__4 )
            // InternalDSL.g:1508:2: rule__Event_Based__Group__3__Impl rule__Event_Based__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Event_Based__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event_Based__Group__4();

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
    // $ANTLR end "rule__Event_Based__Group__3"


    // $ANTLR start "rule__Event_Based__Group__3__Impl"
    // InternalDSL.g:1515:1: rule__Event_Based__Group__3__Impl : ( ( rule__Event_Based__ObservesAssignment_3 ) ) ;
    public final void rule__Event_Based__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1519:1: ( ( ( rule__Event_Based__ObservesAssignment_3 ) ) )
            // InternalDSL.g:1520:1: ( ( rule__Event_Based__ObservesAssignment_3 ) )
            {
            // InternalDSL.g:1520:1: ( ( rule__Event_Based__ObservesAssignment_3 ) )
            // InternalDSL.g:1521:2: ( rule__Event_Based__ObservesAssignment_3 )
            {
             before(grammarAccess.getEvent_BasedAccess().getObservesAssignment_3()); 
            // InternalDSL.g:1522:2: ( rule__Event_Based__ObservesAssignment_3 )
            // InternalDSL.g:1522:3: rule__Event_Based__ObservesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Event_Based__ObservesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEvent_BasedAccess().getObservesAssignment_3()); 

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
    // $ANTLR end "rule__Event_Based__Group__3__Impl"


    // $ANTLR start "rule__Event_Based__Group__4"
    // InternalDSL.g:1530:1: rule__Event_Based__Group__4 : rule__Event_Based__Group__4__Impl rule__Event_Based__Group__5 ;
    public final void rule__Event_Based__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1534:1: ( rule__Event_Based__Group__4__Impl rule__Event_Based__Group__5 )
            // InternalDSL.g:1535:2: rule__Event_Based__Group__4__Impl rule__Event_Based__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Event_Based__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event_Based__Group__5();

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
    // $ANTLR end "rule__Event_Based__Group__4"


    // $ANTLR start "rule__Event_Based__Group__4__Impl"
    // InternalDSL.g:1542:1: rule__Event_Based__Group__4__Impl : ( 'when' ) ;
    public final void rule__Event_Based__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1546:1: ( ( 'when' ) )
            // InternalDSL.g:1547:1: ( 'when' )
            {
            // InternalDSL.g:1547:1: ( 'when' )
            // InternalDSL.g:1548:2: 'when'
            {
             before(grammarAccess.getEvent_BasedAccess().getWhenKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEvent_BasedAccess().getWhenKeyword_4()); 

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
    // $ANTLR end "rule__Event_Based__Group__4__Impl"


    // $ANTLR start "rule__Event_Based__Group__5"
    // InternalDSL.g:1557:1: rule__Event_Based__Group__5 : rule__Event_Based__Group__5__Impl rule__Event_Based__Group__6 ;
    public final void rule__Event_Based__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1561:1: ( rule__Event_Based__Group__5__Impl rule__Event_Based__Group__6 )
            // InternalDSL.g:1562:2: rule__Event_Based__Group__5__Impl rule__Event_Based__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Event_Based__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event_Based__Group__6();

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
    // $ANTLR end "rule__Event_Based__Group__5"


    // $ANTLR start "rule__Event_Based__Group__5__Impl"
    // InternalDSL.g:1569:1: rule__Event_Based__Group__5__Impl : ( ( rule__Event_Based__TriggerAssignment_5 ) ) ;
    public final void rule__Event_Based__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1573:1: ( ( ( rule__Event_Based__TriggerAssignment_5 ) ) )
            // InternalDSL.g:1574:1: ( ( rule__Event_Based__TriggerAssignment_5 ) )
            {
            // InternalDSL.g:1574:1: ( ( rule__Event_Based__TriggerAssignment_5 ) )
            // InternalDSL.g:1575:2: ( rule__Event_Based__TriggerAssignment_5 )
            {
             before(grammarAccess.getEvent_BasedAccess().getTriggerAssignment_5()); 
            // InternalDSL.g:1576:2: ( rule__Event_Based__TriggerAssignment_5 )
            // InternalDSL.g:1576:3: rule__Event_Based__TriggerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Event_Based__TriggerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEvent_BasedAccess().getTriggerAssignment_5()); 

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
    // $ANTLR end "rule__Event_Based__Group__5__Impl"


    // $ANTLR start "rule__Event_Based__Group__6"
    // InternalDSL.g:1584:1: rule__Event_Based__Group__6 : rule__Event_Based__Group__6__Impl ;
    public final void rule__Event_Based__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1588:1: ( rule__Event_Based__Group__6__Impl )
            // InternalDSL.g:1589:2: rule__Event_Based__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event_Based__Group__6__Impl();

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
    // $ANTLR end "rule__Event_Based__Group__6"


    // $ANTLR start "rule__Event_Based__Group__6__Impl"
    // InternalDSL.g:1595:1: rule__Event_Based__Group__6__Impl : ( ( rule__Event_Based__Group_6__0 )? ) ;
    public final void rule__Event_Based__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1599:1: ( ( ( rule__Event_Based__Group_6__0 )? ) )
            // InternalDSL.g:1600:1: ( ( rule__Event_Based__Group_6__0 )? )
            {
            // InternalDSL.g:1600:1: ( ( rule__Event_Based__Group_6__0 )? )
            // InternalDSL.g:1601:2: ( rule__Event_Based__Group_6__0 )?
            {
             before(grammarAccess.getEvent_BasedAccess().getGroup_6()); 
            // InternalDSL.g:1602:2: ( rule__Event_Based__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDSL.g:1602:3: rule__Event_Based__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event_Based__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvent_BasedAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Event_Based__Group__6__Impl"


    // $ANTLR start "rule__Event_Based__Group_6__0"
    // InternalDSL.g:1611:1: rule__Event_Based__Group_6__0 : rule__Event_Based__Group_6__0__Impl rule__Event_Based__Group_6__1 ;
    public final void rule__Event_Based__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1615:1: ( rule__Event_Based__Group_6__0__Impl rule__Event_Based__Group_6__1 )
            // InternalDSL.g:1616:2: rule__Event_Based__Group_6__0__Impl rule__Event_Based__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Event_Based__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event_Based__Group_6__1();

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
    // $ANTLR end "rule__Event_Based__Group_6__0"


    // $ANTLR start "rule__Event_Based__Group_6__0__Impl"
    // InternalDSL.g:1623:1: rule__Event_Based__Group_6__0__Impl : ( 'is calculated from' ) ;
    public final void rule__Event_Based__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1627:1: ( ( 'is calculated from' ) )
            // InternalDSL.g:1628:1: ( 'is calculated from' )
            {
            // InternalDSL.g:1628:1: ( 'is calculated from' )
            // InternalDSL.g:1629:2: 'is calculated from'
            {
             before(grammarAccess.getEvent_BasedAccess().getIsCalculatedFromKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEvent_BasedAccess().getIsCalculatedFromKeyword_6_0()); 

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
    // $ANTLR end "rule__Event_Based__Group_6__0__Impl"


    // $ANTLR start "rule__Event_Based__Group_6__1"
    // InternalDSL.g:1638:1: rule__Event_Based__Group_6__1 : rule__Event_Based__Group_6__1__Impl ;
    public final void rule__Event_Based__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1642:1: ( rule__Event_Based__Group_6__1__Impl )
            // InternalDSL.g:1643:2: rule__Event_Based__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event_Based__Group_6__1__Impl();

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
    // $ANTLR end "rule__Event_Based__Group_6__1"


    // $ANTLR start "rule__Event_Based__Group_6__1__Impl"
    // InternalDSL.g:1649:1: rule__Event_Based__Group_6__1__Impl : ( ( rule__Event_Based__CalculatedFromAssignment_6_1 ) ) ;
    public final void rule__Event_Based__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1653:1: ( ( ( rule__Event_Based__CalculatedFromAssignment_6_1 ) ) )
            // InternalDSL.g:1654:1: ( ( rule__Event_Based__CalculatedFromAssignment_6_1 ) )
            {
            // InternalDSL.g:1654:1: ( ( rule__Event_Based__CalculatedFromAssignment_6_1 ) )
            // InternalDSL.g:1655:2: ( rule__Event_Based__CalculatedFromAssignment_6_1 )
            {
             before(grammarAccess.getEvent_BasedAccess().getCalculatedFromAssignment_6_1()); 
            // InternalDSL.g:1656:2: ( rule__Event_Based__CalculatedFromAssignment_6_1 )
            // InternalDSL.g:1656:3: rule__Event_Based__CalculatedFromAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Event_Based__CalculatedFromAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEvent_BasedAccess().getCalculatedFromAssignment_6_1()); 

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
    // $ANTLR end "rule__Event_Based__Group_6__1__Impl"


    // $ANTLR start "rule__Observation__Group__0"
    // InternalDSL.g:1665:1: rule__Observation__Group__0 : rule__Observation__Group__0__Impl rule__Observation__Group__1 ;
    public final void rule__Observation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1669:1: ( rule__Observation__Group__0__Impl rule__Observation__Group__1 )
            // InternalDSL.g:1670:2: rule__Observation__Group__0__Impl rule__Observation__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Observation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observation__Group__1();

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
    // $ANTLR end "rule__Observation__Group__0"


    // $ANTLR start "rule__Observation__Group__0__Impl"
    // InternalDSL.g:1677:1: rule__Observation__Group__0__Impl : ( ( rule__Observation__NameAssignment_0 ) ) ;
    public final void rule__Observation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1681:1: ( ( ( rule__Observation__NameAssignment_0 ) ) )
            // InternalDSL.g:1682:1: ( ( rule__Observation__NameAssignment_0 ) )
            {
            // InternalDSL.g:1682:1: ( ( rule__Observation__NameAssignment_0 ) )
            // InternalDSL.g:1683:2: ( rule__Observation__NameAssignment_0 )
            {
             before(grammarAccess.getObservationAccess().getNameAssignment_0()); 
            // InternalDSL.g:1684:2: ( rule__Observation__NameAssignment_0 )
            // InternalDSL.g:1684:3: rule__Observation__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Observation__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObservationAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Observation__Group__0__Impl"


    // $ANTLR start "rule__Observation__Group__1"
    // InternalDSL.g:1692:1: rule__Observation__Group__1 : rule__Observation__Group__1__Impl rule__Observation__Group__2 ;
    public final void rule__Observation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1696:1: ( rule__Observation__Group__1__Impl rule__Observation__Group__2 )
            // InternalDSL.g:1697:2: rule__Observation__Group__1__Impl rule__Observation__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Observation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observation__Group__2();

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
    // $ANTLR end "rule__Observation__Group__1"


    // $ANTLR start "rule__Observation__Group__1__Impl"
    // InternalDSL.g:1704:1: rule__Observation__Group__1__Impl : ( 'with' ) ;
    public final void rule__Observation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1708:1: ( ( 'with' ) )
            // InternalDSL.g:1709:1: ( 'with' )
            {
            // InternalDSL.g:1709:1: ( 'with' )
            // InternalDSL.g:1710:2: 'with'
            {
             before(grammarAccess.getObservationAccess().getWithKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getObservationAccess().getWithKeyword_1()); 

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
    // $ANTLR end "rule__Observation__Group__1__Impl"


    // $ANTLR start "rule__Observation__Group__2"
    // InternalDSL.g:1719:1: rule__Observation__Group__2 : rule__Observation__Group__2__Impl rule__Observation__Group__3 ;
    public final void rule__Observation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1723:1: ( rule__Observation__Group__2__Impl rule__Observation__Group__3 )
            // InternalDSL.g:1724:2: rule__Observation__Group__2__Impl rule__Observation__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Observation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observation__Group__3();

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
    // $ANTLR end "rule__Observation__Group__2"


    // $ANTLR start "rule__Observation__Group__2__Impl"
    // InternalDSL.g:1731:1: rule__Observation__Group__2__Impl : ( ( rule__Observation__TimeAssignment_2 ) ) ;
    public final void rule__Observation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1735:1: ( ( ( rule__Observation__TimeAssignment_2 ) ) )
            // InternalDSL.g:1736:1: ( ( rule__Observation__TimeAssignment_2 ) )
            {
            // InternalDSL.g:1736:1: ( ( rule__Observation__TimeAssignment_2 ) )
            // InternalDSL.g:1737:2: ( rule__Observation__TimeAssignment_2 )
            {
             before(grammarAccess.getObservationAccess().getTimeAssignment_2()); 
            // InternalDSL.g:1738:2: ( rule__Observation__TimeAssignment_2 )
            // InternalDSL.g:1738:3: rule__Observation__TimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Observation__TimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObservationAccess().getTimeAssignment_2()); 

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
    // $ANTLR end "rule__Observation__Group__2__Impl"


    // $ANTLR start "rule__Observation__Group__3"
    // InternalDSL.g:1746:1: rule__Observation__Group__3 : rule__Observation__Group__3__Impl rule__Observation__Group__4 ;
    public final void rule__Observation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1750:1: ( rule__Observation__Group__3__Impl rule__Observation__Group__4 )
            // InternalDSL.g:1751:2: rule__Observation__Group__3__Impl rule__Observation__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Observation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observation__Group__4();

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
    // $ANTLR end "rule__Observation__Group__3"


    // $ANTLR start "rule__Observation__Group__3__Impl"
    // InternalDSL.g:1758:1: rule__Observation__Group__3__Impl : ( ( rule__Observation__ValuesAssignment_3 ) ) ;
    public final void rule__Observation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1762:1: ( ( ( rule__Observation__ValuesAssignment_3 ) ) )
            // InternalDSL.g:1763:1: ( ( rule__Observation__ValuesAssignment_3 ) )
            {
            // InternalDSL.g:1763:1: ( ( rule__Observation__ValuesAssignment_3 ) )
            // InternalDSL.g:1764:2: ( rule__Observation__ValuesAssignment_3 )
            {
             before(grammarAccess.getObservationAccess().getValuesAssignment_3()); 
            // InternalDSL.g:1765:2: ( rule__Observation__ValuesAssignment_3 )
            // InternalDSL.g:1765:3: rule__Observation__ValuesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Observation__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObservationAccess().getValuesAssignment_3()); 

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
    // $ANTLR end "rule__Observation__Group__3__Impl"


    // $ANTLR start "rule__Observation__Group__4"
    // InternalDSL.g:1773:1: rule__Observation__Group__4 : rule__Observation__Group__4__Impl ;
    public final void rule__Observation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1777:1: ( rule__Observation__Group__4__Impl )
            // InternalDSL.g:1778:2: rule__Observation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Observation__Group__4__Impl();

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
    // $ANTLR end "rule__Observation__Group__4"


    // $ANTLR start "rule__Observation__Group__4__Impl"
    // InternalDSL.g:1784:1: rule__Observation__Group__4__Impl : ( ( rule__Observation__ValuesAssignment_4 )* ) ;
    public final void rule__Observation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1788:1: ( ( ( rule__Observation__ValuesAssignment_4 )* ) )
            // InternalDSL.g:1789:1: ( ( rule__Observation__ValuesAssignment_4 )* )
            {
            // InternalDSL.g:1789:1: ( ( rule__Observation__ValuesAssignment_4 )* )
            // InternalDSL.g:1790:2: ( rule__Observation__ValuesAssignment_4 )*
            {
             before(grammarAccess.getObservationAccess().getValuesAssignment_4()); 
            // InternalDSL.g:1791:2: ( rule__Observation__ValuesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==34) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==RULE_ID) ) {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3==34) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalDSL.g:1791:3: rule__Observation__ValuesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Observation__ValuesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getObservationAccess().getValuesAssignment_4()); 

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
    // $ANTLR end "rule__Observation__Group__4__Impl"


    // $ANTLR start "rule__Atomic__Group__0"
    // InternalDSL.g:1800:1: rule__Atomic__Group__0 : rule__Atomic__Group__0__Impl rule__Atomic__Group__1 ;
    public final void rule__Atomic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1804:1: ( rule__Atomic__Group__0__Impl rule__Atomic__Group__1 )
            // InternalDSL.g:1805:2: rule__Atomic__Group__0__Impl rule__Atomic__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Atomic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group__1();

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
    // $ANTLR end "rule__Atomic__Group__0"


    // $ANTLR start "rule__Atomic__Group__0__Impl"
    // InternalDSL.g:1812:1: rule__Atomic__Group__0__Impl : ( ( rule__Atomic__NameAssignment_0 ) ) ;
    public final void rule__Atomic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1816:1: ( ( ( rule__Atomic__NameAssignment_0 ) ) )
            // InternalDSL.g:1817:1: ( ( rule__Atomic__NameAssignment_0 ) )
            {
            // InternalDSL.g:1817:1: ( ( rule__Atomic__NameAssignment_0 ) )
            // InternalDSL.g:1818:2: ( rule__Atomic__NameAssignment_0 )
            {
             before(grammarAccess.getAtomicAccess().getNameAssignment_0()); 
            // InternalDSL.g:1819:2: ( rule__Atomic__NameAssignment_0 )
            // InternalDSL.g:1819:3: rule__Atomic__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Atomic__Group__0__Impl"


    // $ANTLR start "rule__Atomic__Group__1"
    // InternalDSL.g:1827:1: rule__Atomic__Group__1 : rule__Atomic__Group__1__Impl rule__Atomic__Group__2 ;
    public final void rule__Atomic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1831:1: ( rule__Atomic__Group__1__Impl rule__Atomic__Group__2 )
            // InternalDSL.g:1832:2: rule__Atomic__Group__1__Impl rule__Atomic__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Atomic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group__2();

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
    // $ANTLR end "rule__Atomic__Group__1"


    // $ANTLR start "rule__Atomic__Group__1__Impl"
    // InternalDSL.g:1839:1: rule__Atomic__Group__1__Impl : ( 'in range' ) ;
    public final void rule__Atomic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1843:1: ( ( 'in range' ) )
            // InternalDSL.g:1844:1: ( 'in range' )
            {
            // InternalDSL.g:1844:1: ( 'in range' )
            // InternalDSL.g:1845:2: 'in range'
            {
             before(grammarAccess.getAtomicAccess().getInRangeKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getInRangeKeyword_1()); 

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
    // $ANTLR end "rule__Atomic__Group__1__Impl"


    // $ANTLR start "rule__Atomic__Group__2"
    // InternalDSL.g:1854:1: rule__Atomic__Group__2 : rule__Atomic__Group__2__Impl ;
    public final void rule__Atomic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1858:1: ( rule__Atomic__Group__2__Impl )
            // InternalDSL.g:1859:2: rule__Atomic__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group__2__Impl();

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
    // $ANTLR end "rule__Atomic__Group__2"


    // $ANTLR start "rule__Atomic__Group__2__Impl"
    // InternalDSL.g:1865:1: rule__Atomic__Group__2__Impl : ( ( rule__Atomic__RangeAssignment_2 ) ) ;
    public final void rule__Atomic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1869:1: ( ( ( rule__Atomic__RangeAssignment_2 ) ) )
            // InternalDSL.g:1870:1: ( ( rule__Atomic__RangeAssignment_2 ) )
            {
            // InternalDSL.g:1870:1: ( ( rule__Atomic__RangeAssignment_2 ) )
            // InternalDSL.g:1871:2: ( rule__Atomic__RangeAssignment_2 )
            {
             before(grammarAccess.getAtomicAccess().getRangeAssignment_2()); 
            // InternalDSL.g:1872:2: ( rule__Atomic__RangeAssignment_2 )
            // InternalDSL.g:1872:3: rule__Atomic__RangeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__RangeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getRangeAssignment_2()); 

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
    // $ANTLR end "rule__Atomic__Group__2__Impl"


    // $ANTLR start "rule__Calculated__Group__0"
    // InternalDSL.g:1881:1: rule__Calculated__Group__0 : rule__Calculated__Group__0__Impl rule__Calculated__Group__1 ;
    public final void rule__Calculated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1885:1: ( rule__Calculated__Group__0__Impl rule__Calculated__Group__1 )
            // InternalDSL.g:1886:2: rule__Calculated__Group__0__Impl rule__Calculated__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Calculated__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calculated__Group__1();

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
    // $ANTLR end "rule__Calculated__Group__0"


    // $ANTLR start "rule__Calculated__Group__0__Impl"
    // InternalDSL.g:1893:1: rule__Calculated__Group__0__Impl : ( ( rule__Calculated__NameAssignment_0 ) ) ;
    public final void rule__Calculated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1897:1: ( ( ( rule__Calculated__NameAssignment_0 ) ) )
            // InternalDSL.g:1898:1: ( ( rule__Calculated__NameAssignment_0 ) )
            {
            // InternalDSL.g:1898:1: ( ( rule__Calculated__NameAssignment_0 ) )
            // InternalDSL.g:1899:2: ( rule__Calculated__NameAssignment_0 )
            {
             before(grammarAccess.getCalculatedAccess().getNameAssignment_0()); 
            // InternalDSL.g:1900:2: ( rule__Calculated__NameAssignment_0 )
            // InternalDSL.g:1900:3: rule__Calculated__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Calculated__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Calculated__Group__0__Impl"


    // $ANTLR start "rule__Calculated__Group__1"
    // InternalDSL.g:1908:1: rule__Calculated__Group__1 : rule__Calculated__Group__1__Impl rule__Calculated__Group__2 ;
    public final void rule__Calculated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1912:1: ( rule__Calculated__Group__1__Impl rule__Calculated__Group__2 )
            // InternalDSL.g:1913:2: rule__Calculated__Group__1__Impl rule__Calculated__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Calculated__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calculated__Group__2();

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
    // $ANTLR end "rule__Calculated__Group__1"


    // $ANTLR start "rule__Calculated__Group__1__Impl"
    // InternalDSL.g:1920:1: rule__Calculated__Group__1__Impl : ( 'in range' ) ;
    public final void rule__Calculated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1924:1: ( ( 'in range' ) )
            // InternalDSL.g:1925:1: ( 'in range' )
            {
            // InternalDSL.g:1925:1: ( 'in range' )
            // InternalDSL.g:1926:2: 'in range'
            {
             before(grammarAccess.getCalculatedAccess().getInRangeKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCalculatedAccess().getInRangeKeyword_1()); 

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
    // $ANTLR end "rule__Calculated__Group__1__Impl"


    // $ANTLR start "rule__Calculated__Group__2"
    // InternalDSL.g:1935:1: rule__Calculated__Group__2 : rule__Calculated__Group__2__Impl rule__Calculated__Group__3 ;
    public final void rule__Calculated__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1939:1: ( rule__Calculated__Group__2__Impl rule__Calculated__Group__3 )
            // InternalDSL.g:1940:2: rule__Calculated__Group__2__Impl rule__Calculated__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Calculated__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calculated__Group__3();

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
    // $ANTLR end "rule__Calculated__Group__2"


    // $ANTLR start "rule__Calculated__Group__2__Impl"
    // InternalDSL.g:1947:1: rule__Calculated__Group__2__Impl : ( ( rule__Calculated__RangeAssignment_2 ) ) ;
    public final void rule__Calculated__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1951:1: ( ( ( rule__Calculated__RangeAssignment_2 ) ) )
            // InternalDSL.g:1952:1: ( ( rule__Calculated__RangeAssignment_2 ) )
            {
            // InternalDSL.g:1952:1: ( ( rule__Calculated__RangeAssignment_2 ) )
            // InternalDSL.g:1953:2: ( rule__Calculated__RangeAssignment_2 )
            {
             before(grammarAccess.getCalculatedAccess().getRangeAssignment_2()); 
            // InternalDSL.g:1954:2: ( rule__Calculated__RangeAssignment_2 )
            // InternalDSL.g:1954:3: rule__Calculated__RangeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Calculated__RangeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getRangeAssignment_2()); 

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
    // $ANTLR end "rule__Calculated__Group__2__Impl"


    // $ANTLR start "rule__Calculated__Group__3"
    // InternalDSL.g:1962:1: rule__Calculated__Group__3 : rule__Calculated__Group__3__Impl rule__Calculated__Group__4 ;
    public final void rule__Calculated__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1966:1: ( rule__Calculated__Group__3__Impl rule__Calculated__Group__4 )
            // InternalDSL.g:1967:2: rule__Calculated__Group__3__Impl rule__Calculated__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Calculated__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calculated__Group__4();

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
    // $ANTLR end "rule__Calculated__Group__3"


    // $ANTLR start "rule__Calculated__Group__3__Impl"
    // InternalDSL.g:1974:1: rule__Calculated__Group__3__Impl : ( 'calculated from function' ) ;
    public final void rule__Calculated__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1978:1: ( ( 'calculated from function' ) )
            // InternalDSL.g:1979:1: ( 'calculated from function' )
            {
            // InternalDSL.g:1979:1: ( 'calculated from function' )
            // InternalDSL.g:1980:2: 'calculated from function'
            {
             before(grammarAccess.getCalculatedAccess().getCalculatedFromFunctionKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCalculatedAccess().getCalculatedFromFunctionKeyword_3()); 

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
    // $ANTLR end "rule__Calculated__Group__3__Impl"


    // $ANTLR start "rule__Calculated__Group__4"
    // InternalDSL.g:1989:1: rule__Calculated__Group__4 : rule__Calculated__Group__4__Impl rule__Calculated__Group__5 ;
    public final void rule__Calculated__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1993:1: ( rule__Calculated__Group__4__Impl rule__Calculated__Group__5 )
            // InternalDSL.g:1994:2: rule__Calculated__Group__4__Impl rule__Calculated__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Calculated__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calculated__Group__5();

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
    // $ANTLR end "rule__Calculated__Group__4"


    // $ANTLR start "rule__Calculated__Group__4__Impl"
    // InternalDSL.g:2001:1: rule__Calculated__Group__4__Impl : ( ( rule__Calculated__FunctionAssignment_4 ) ) ;
    public final void rule__Calculated__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2005:1: ( ( ( rule__Calculated__FunctionAssignment_4 ) ) )
            // InternalDSL.g:2006:1: ( ( rule__Calculated__FunctionAssignment_4 ) )
            {
            // InternalDSL.g:2006:1: ( ( rule__Calculated__FunctionAssignment_4 ) )
            // InternalDSL.g:2007:2: ( rule__Calculated__FunctionAssignment_4 )
            {
             before(grammarAccess.getCalculatedAccess().getFunctionAssignment_4()); 
            // InternalDSL.g:2008:2: ( rule__Calculated__FunctionAssignment_4 )
            // InternalDSL.g:2008:3: rule__Calculated__FunctionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Calculated__FunctionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getFunctionAssignment_4()); 

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
    // $ANTLR end "rule__Calculated__Group__4__Impl"


    // $ANTLR start "rule__Calculated__Group__5"
    // InternalDSL.g:2016:1: rule__Calculated__Group__5 : rule__Calculated__Group__5__Impl rule__Calculated__Group__6 ;
    public final void rule__Calculated__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2020:1: ( rule__Calculated__Group__5__Impl rule__Calculated__Group__6 )
            // InternalDSL.g:2021:2: rule__Calculated__Group__5__Impl rule__Calculated__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Calculated__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calculated__Group__6();

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
    // $ANTLR end "rule__Calculated__Group__5"


    // $ANTLR start "rule__Calculated__Group__5__Impl"
    // InternalDSL.g:2028:1: rule__Calculated__Group__5__Impl : ( 'on' ) ;
    public final void rule__Calculated__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2032:1: ( ( 'on' ) )
            // InternalDSL.g:2033:1: ( 'on' )
            {
            // InternalDSL.g:2033:1: ( 'on' )
            // InternalDSL.g:2034:2: 'on'
            {
             before(grammarAccess.getCalculatedAccess().getOnKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCalculatedAccess().getOnKeyword_5()); 

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
    // $ANTLR end "rule__Calculated__Group__5__Impl"


    // $ANTLR start "rule__Calculated__Group__6"
    // InternalDSL.g:2043:1: rule__Calculated__Group__6 : rule__Calculated__Group__6__Impl rule__Calculated__Group__7 ;
    public final void rule__Calculated__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2047:1: ( rule__Calculated__Group__6__Impl rule__Calculated__Group__7 )
            // InternalDSL.g:2048:2: rule__Calculated__Group__6__Impl rule__Calculated__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Calculated__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calculated__Group__7();

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
    // $ANTLR end "rule__Calculated__Group__6"


    // $ANTLR start "rule__Calculated__Group__6__Impl"
    // InternalDSL.g:2055:1: rule__Calculated__Group__6__Impl : ( ( rule__Calculated__OperandsAssignment_6 ) ) ;
    public final void rule__Calculated__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2059:1: ( ( ( rule__Calculated__OperandsAssignment_6 ) ) )
            // InternalDSL.g:2060:1: ( ( rule__Calculated__OperandsAssignment_6 ) )
            {
            // InternalDSL.g:2060:1: ( ( rule__Calculated__OperandsAssignment_6 ) )
            // InternalDSL.g:2061:2: ( rule__Calculated__OperandsAssignment_6 )
            {
             before(grammarAccess.getCalculatedAccess().getOperandsAssignment_6()); 
            // InternalDSL.g:2062:2: ( rule__Calculated__OperandsAssignment_6 )
            // InternalDSL.g:2062:3: rule__Calculated__OperandsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Calculated__OperandsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getOperandsAssignment_6()); 

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
    // $ANTLR end "rule__Calculated__Group__6__Impl"


    // $ANTLR start "rule__Calculated__Group__7"
    // InternalDSL.g:2070:1: rule__Calculated__Group__7 : rule__Calculated__Group__7__Impl ;
    public final void rule__Calculated__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2074:1: ( rule__Calculated__Group__7__Impl )
            // InternalDSL.g:2075:2: rule__Calculated__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calculated__Group__7__Impl();

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
    // $ANTLR end "rule__Calculated__Group__7"


    // $ANTLR start "rule__Calculated__Group__7__Impl"
    // InternalDSL.g:2081:1: rule__Calculated__Group__7__Impl : ( ( rule__Calculated__Group_7__0 )* ) ;
    public final void rule__Calculated__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2085:1: ( ( ( rule__Calculated__Group_7__0 )* ) )
            // InternalDSL.g:2086:1: ( ( rule__Calculated__Group_7__0 )* )
            {
            // InternalDSL.g:2086:1: ( ( rule__Calculated__Group_7__0 )* )
            // InternalDSL.g:2087:2: ( rule__Calculated__Group_7__0 )*
            {
             before(grammarAccess.getCalculatedAccess().getGroup_7()); 
            // InternalDSL.g:2088:2: ( rule__Calculated__Group_7__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:2088:3: rule__Calculated__Group_7__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Calculated__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCalculatedAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Calculated__Group__7__Impl"


    // $ANTLR start "rule__Calculated__Group_7__0"
    // InternalDSL.g:2097:1: rule__Calculated__Group_7__0 : rule__Calculated__Group_7__0__Impl rule__Calculated__Group_7__1 ;
    public final void rule__Calculated__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2101:1: ( rule__Calculated__Group_7__0__Impl rule__Calculated__Group_7__1 )
            // InternalDSL.g:2102:2: rule__Calculated__Group_7__0__Impl rule__Calculated__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Calculated__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calculated__Group_7__1();

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
    // $ANTLR end "rule__Calculated__Group_7__0"


    // $ANTLR start "rule__Calculated__Group_7__0__Impl"
    // InternalDSL.g:2109:1: rule__Calculated__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Calculated__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2113:1: ( ( ',' ) )
            // InternalDSL.g:2114:1: ( ',' )
            {
            // InternalDSL.g:2114:1: ( ',' )
            // InternalDSL.g:2115:2: ','
            {
             before(grammarAccess.getCalculatedAccess().getCommaKeyword_7_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCalculatedAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__Calculated__Group_7__0__Impl"


    // $ANTLR start "rule__Calculated__Group_7__1"
    // InternalDSL.g:2124:1: rule__Calculated__Group_7__1 : rule__Calculated__Group_7__1__Impl ;
    public final void rule__Calculated__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2128:1: ( rule__Calculated__Group_7__1__Impl )
            // InternalDSL.g:2129:2: rule__Calculated__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calculated__Group_7__1__Impl();

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
    // $ANTLR end "rule__Calculated__Group_7__1"


    // $ANTLR start "rule__Calculated__Group_7__1__Impl"
    // InternalDSL.g:2135:1: rule__Calculated__Group_7__1__Impl : ( ( rule__Calculated__OperandsAssignment_7_1 ) ) ;
    public final void rule__Calculated__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2139:1: ( ( ( rule__Calculated__OperandsAssignment_7_1 ) ) )
            // InternalDSL.g:2140:1: ( ( rule__Calculated__OperandsAssignment_7_1 ) )
            {
            // InternalDSL.g:2140:1: ( ( rule__Calculated__OperandsAssignment_7_1 ) )
            // InternalDSL.g:2141:2: ( rule__Calculated__OperandsAssignment_7_1 )
            {
             before(grammarAccess.getCalculatedAccess().getOperandsAssignment_7_1()); 
            // InternalDSL.g:2142:2: ( rule__Calculated__OperandsAssignment_7_1 )
            // InternalDSL.g:2142:3: rule__Calculated__OperandsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Calculated__OperandsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCalculatedAccess().getOperandsAssignment_7_1()); 

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
    // $ANTLR end "rule__Calculated__Group_7__1__Impl"


    // $ANTLR start "rule__Continuous__Group__0"
    // InternalDSL.g:2151:1: rule__Continuous__Group__0 : rule__Continuous__Group__0__Impl rule__Continuous__Group__1 ;
    public final void rule__Continuous__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2155:1: ( rule__Continuous__Group__0__Impl rule__Continuous__Group__1 )
            // InternalDSL.g:2156:2: rule__Continuous__Group__0__Impl rule__Continuous__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Continuous__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continuous__Group__1();

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
    // $ANTLR end "rule__Continuous__Group__0"


    // $ANTLR start "rule__Continuous__Group__0__Impl"
    // InternalDSL.g:2163:1: rule__Continuous__Group__0__Impl : ( () ) ;
    public final void rule__Continuous__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2167:1: ( ( () ) )
            // InternalDSL.g:2168:1: ( () )
            {
            // InternalDSL.g:2168:1: ( () )
            // InternalDSL.g:2169:2: ()
            {
             before(grammarAccess.getContinuousAccess().getContinuousAction_0()); 
            // InternalDSL.g:2170:2: ()
            // InternalDSL.g:2170:3: 
            {
            }

             after(grammarAccess.getContinuousAccess().getContinuousAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continuous__Group__0__Impl"


    // $ANTLR start "rule__Continuous__Group__1"
    // InternalDSL.g:2178:1: rule__Continuous__Group__1 : rule__Continuous__Group__1__Impl rule__Continuous__Group__2 ;
    public final void rule__Continuous__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2182:1: ( rule__Continuous__Group__1__Impl rule__Continuous__Group__2 )
            // InternalDSL.g:2183:2: rule__Continuous__Group__1__Impl rule__Continuous__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Continuous__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continuous__Group__2();

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
    // $ANTLR end "rule__Continuous__Group__1"


    // $ANTLR start "rule__Continuous__Group__1__Impl"
    // InternalDSL.g:2190:1: rule__Continuous__Group__1__Impl : ( '[' ) ;
    public final void rule__Continuous__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2194:1: ( ( '[' ) )
            // InternalDSL.g:2195:1: ( '[' )
            {
            // InternalDSL.g:2195:1: ( '[' )
            // InternalDSL.g:2196:2: '['
            {
             before(grammarAccess.getContinuousAccess().getLeftSquareBracketKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getContinuousAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__Continuous__Group__1__Impl"


    // $ANTLR start "rule__Continuous__Group__2"
    // InternalDSL.g:2205:1: rule__Continuous__Group__2 : rule__Continuous__Group__2__Impl rule__Continuous__Group__3 ;
    public final void rule__Continuous__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2209:1: ( rule__Continuous__Group__2__Impl rule__Continuous__Group__3 )
            // InternalDSL.g:2210:2: rule__Continuous__Group__2__Impl rule__Continuous__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Continuous__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continuous__Group__3();

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
    // $ANTLR end "rule__Continuous__Group__2"


    // $ANTLR start "rule__Continuous__Group__2__Impl"
    // InternalDSL.g:2217:1: rule__Continuous__Group__2__Impl : ( ( rule__Continuous__MinAssignment_2 )? ) ;
    public final void rule__Continuous__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2221:1: ( ( ( rule__Continuous__MinAssignment_2 )? ) )
            // InternalDSL.g:2222:1: ( ( rule__Continuous__MinAssignment_2 )? )
            {
            // InternalDSL.g:2222:1: ( ( rule__Continuous__MinAssignment_2 )? )
            // InternalDSL.g:2223:2: ( rule__Continuous__MinAssignment_2 )?
            {
             before(grammarAccess.getContinuousAccess().getMinAssignment_2()); 
            // InternalDSL.g:2224:2: ( rule__Continuous__MinAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_INT)||LA17_0==11||(LA17_0>=42 && LA17_0<=43)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDSL.g:2224:3: rule__Continuous__MinAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Continuous__MinAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContinuousAccess().getMinAssignment_2()); 

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
    // $ANTLR end "rule__Continuous__Group__2__Impl"


    // $ANTLR start "rule__Continuous__Group__3"
    // InternalDSL.g:2232:1: rule__Continuous__Group__3 : rule__Continuous__Group__3__Impl rule__Continuous__Group__4 ;
    public final void rule__Continuous__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2236:1: ( rule__Continuous__Group__3__Impl rule__Continuous__Group__4 )
            // InternalDSL.g:2237:2: rule__Continuous__Group__3__Impl rule__Continuous__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Continuous__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continuous__Group__4();

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
    // $ANTLR end "rule__Continuous__Group__3"


    // $ANTLR start "rule__Continuous__Group__3__Impl"
    // InternalDSL.g:2244:1: rule__Continuous__Group__3__Impl : ( '...' ) ;
    public final void rule__Continuous__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2248:1: ( ( '...' ) )
            // InternalDSL.g:2249:1: ( '...' )
            {
            // InternalDSL.g:2249:1: ( '...' )
            // InternalDSL.g:2250:2: '...'
            {
             before(grammarAccess.getContinuousAccess().getFullStopFullStopFullStopKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getContinuousAccess().getFullStopFullStopFullStopKeyword_3()); 

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
    // $ANTLR end "rule__Continuous__Group__3__Impl"


    // $ANTLR start "rule__Continuous__Group__4"
    // InternalDSL.g:2259:1: rule__Continuous__Group__4 : rule__Continuous__Group__4__Impl rule__Continuous__Group__5 ;
    public final void rule__Continuous__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2263:1: ( rule__Continuous__Group__4__Impl rule__Continuous__Group__5 )
            // InternalDSL.g:2264:2: rule__Continuous__Group__4__Impl rule__Continuous__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Continuous__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Continuous__Group__5();

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
    // $ANTLR end "rule__Continuous__Group__4"


    // $ANTLR start "rule__Continuous__Group__4__Impl"
    // InternalDSL.g:2271:1: rule__Continuous__Group__4__Impl : ( ( rule__Continuous__MaxAssignment_4 )? ) ;
    public final void rule__Continuous__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2275:1: ( ( ( rule__Continuous__MaxAssignment_4 )? ) )
            // InternalDSL.g:2276:1: ( ( rule__Continuous__MaxAssignment_4 )? )
            {
            // InternalDSL.g:2276:1: ( ( rule__Continuous__MaxAssignment_4 )? )
            // InternalDSL.g:2277:2: ( rule__Continuous__MaxAssignment_4 )?
            {
             before(grammarAccess.getContinuousAccess().getMaxAssignment_4()); 
            // InternalDSL.g:2278:2: ( rule__Continuous__MaxAssignment_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_INT)||LA18_0==11||(LA18_0>=42 && LA18_0<=43)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDSL.g:2278:3: rule__Continuous__MaxAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Continuous__MaxAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContinuousAccess().getMaxAssignment_4()); 

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
    // $ANTLR end "rule__Continuous__Group__4__Impl"


    // $ANTLR start "rule__Continuous__Group__5"
    // InternalDSL.g:2286:1: rule__Continuous__Group__5 : rule__Continuous__Group__5__Impl ;
    public final void rule__Continuous__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2290:1: ( rule__Continuous__Group__5__Impl )
            // InternalDSL.g:2291:2: rule__Continuous__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Continuous__Group__5__Impl();

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
    // $ANTLR end "rule__Continuous__Group__5"


    // $ANTLR start "rule__Continuous__Group__5__Impl"
    // InternalDSL.g:2297:1: rule__Continuous__Group__5__Impl : ( ']' ) ;
    public final void rule__Continuous__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2301:1: ( ( ']' ) )
            // InternalDSL.g:2302:1: ( ']' )
            {
            // InternalDSL.g:2302:1: ( ']' )
            // InternalDSL.g:2303:2: ']'
            {
             before(grammarAccess.getContinuousAccess().getRightSquareBracketKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getContinuousAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Continuous__Group__5__Impl"


    // $ANTLR start "rule__Discrete__Group__0"
    // InternalDSL.g:2313:1: rule__Discrete__Group__0 : rule__Discrete__Group__0__Impl rule__Discrete__Group__1 ;
    public final void rule__Discrete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2317:1: ( rule__Discrete__Group__0__Impl rule__Discrete__Group__1 )
            // InternalDSL.g:2318:2: rule__Discrete__Group__0__Impl rule__Discrete__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Discrete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discrete__Group__1();

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
    // $ANTLR end "rule__Discrete__Group__0"


    // $ANTLR start "rule__Discrete__Group__0__Impl"
    // InternalDSL.g:2325:1: rule__Discrete__Group__0__Impl : ( '[' ) ;
    public final void rule__Discrete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2329:1: ( ( '[' ) )
            // InternalDSL.g:2330:1: ( '[' )
            {
            // InternalDSL.g:2330:1: ( '[' )
            // InternalDSL.g:2331:2: '['
            {
             before(grammarAccess.getDiscreteAccess().getLeftSquareBracketKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDiscreteAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Discrete__Group__0__Impl"


    // $ANTLR start "rule__Discrete__Group__1"
    // InternalDSL.g:2340:1: rule__Discrete__Group__1 : rule__Discrete__Group__1__Impl rule__Discrete__Group__2 ;
    public final void rule__Discrete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2344:1: ( rule__Discrete__Group__1__Impl rule__Discrete__Group__2 )
            // InternalDSL.g:2345:2: rule__Discrete__Group__1__Impl rule__Discrete__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Discrete__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discrete__Group__2();

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
    // $ANTLR end "rule__Discrete__Group__1"


    // $ANTLR start "rule__Discrete__Group__1__Impl"
    // InternalDSL.g:2352:1: rule__Discrete__Group__1__Impl : ( ( rule__Discrete__ValuesAssignment_1 ) ) ;
    public final void rule__Discrete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2356:1: ( ( ( rule__Discrete__ValuesAssignment_1 ) ) )
            // InternalDSL.g:2357:1: ( ( rule__Discrete__ValuesAssignment_1 ) )
            {
            // InternalDSL.g:2357:1: ( ( rule__Discrete__ValuesAssignment_1 ) )
            // InternalDSL.g:2358:2: ( rule__Discrete__ValuesAssignment_1 )
            {
             before(grammarAccess.getDiscreteAccess().getValuesAssignment_1()); 
            // InternalDSL.g:2359:2: ( rule__Discrete__ValuesAssignment_1 )
            // InternalDSL.g:2359:3: rule__Discrete__ValuesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Discrete__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiscreteAccess().getValuesAssignment_1()); 

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
    // $ANTLR end "rule__Discrete__Group__1__Impl"


    // $ANTLR start "rule__Discrete__Group__2"
    // InternalDSL.g:2367:1: rule__Discrete__Group__2 : rule__Discrete__Group__2__Impl rule__Discrete__Group__3 ;
    public final void rule__Discrete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2371:1: ( rule__Discrete__Group__2__Impl rule__Discrete__Group__3 )
            // InternalDSL.g:2372:2: rule__Discrete__Group__2__Impl rule__Discrete__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Discrete__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discrete__Group__3();

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
    // $ANTLR end "rule__Discrete__Group__2"


    // $ANTLR start "rule__Discrete__Group__2__Impl"
    // InternalDSL.g:2379:1: rule__Discrete__Group__2__Impl : ( ( rule__Discrete__Group_2__0 )* ) ;
    public final void rule__Discrete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2383:1: ( ( ( rule__Discrete__Group_2__0 )* ) )
            // InternalDSL.g:2384:1: ( ( rule__Discrete__Group_2__0 )* )
            {
            // InternalDSL.g:2384:1: ( ( rule__Discrete__Group_2__0 )* )
            // InternalDSL.g:2385:2: ( rule__Discrete__Group_2__0 )*
            {
             before(grammarAccess.getDiscreteAccess().getGroup_2()); 
            // InternalDSL.g:2386:2: ( rule__Discrete__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==41) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDSL.g:2386:3: rule__Discrete__Group_2__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Discrete__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDiscreteAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Discrete__Group__2__Impl"


    // $ANTLR start "rule__Discrete__Group__3"
    // InternalDSL.g:2394:1: rule__Discrete__Group__3 : rule__Discrete__Group__3__Impl ;
    public final void rule__Discrete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2398:1: ( rule__Discrete__Group__3__Impl )
            // InternalDSL.g:2399:2: rule__Discrete__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Discrete__Group__3__Impl();

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
    // $ANTLR end "rule__Discrete__Group__3"


    // $ANTLR start "rule__Discrete__Group__3__Impl"
    // InternalDSL.g:2405:1: rule__Discrete__Group__3__Impl : ( ']' ) ;
    public final void rule__Discrete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2409:1: ( ( ']' ) )
            // InternalDSL.g:2410:1: ( ']' )
            {
            // InternalDSL.g:2410:1: ( ']' )
            // InternalDSL.g:2411:2: ']'
            {
             before(grammarAccess.getDiscreteAccess().getRightSquareBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDiscreteAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Discrete__Group__3__Impl"


    // $ANTLR start "rule__Discrete__Group_2__0"
    // InternalDSL.g:2421:1: rule__Discrete__Group_2__0 : rule__Discrete__Group_2__0__Impl rule__Discrete__Group_2__1 ;
    public final void rule__Discrete__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2425:1: ( rule__Discrete__Group_2__0__Impl rule__Discrete__Group_2__1 )
            // InternalDSL.g:2426:2: rule__Discrete__Group_2__0__Impl rule__Discrete__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Discrete__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discrete__Group_2__1();

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
    // $ANTLR end "rule__Discrete__Group_2__0"


    // $ANTLR start "rule__Discrete__Group_2__0__Impl"
    // InternalDSL.g:2433:1: rule__Discrete__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Discrete__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2437:1: ( ( ';' ) )
            // InternalDSL.g:2438:1: ( ';' )
            {
            // InternalDSL.g:2438:1: ( ';' )
            // InternalDSL.g:2439:2: ';'
            {
             before(grammarAccess.getDiscreteAccess().getSemicolonKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDiscreteAccess().getSemicolonKeyword_2_0()); 

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
    // $ANTLR end "rule__Discrete__Group_2__0__Impl"


    // $ANTLR start "rule__Discrete__Group_2__1"
    // InternalDSL.g:2448:1: rule__Discrete__Group_2__1 : rule__Discrete__Group_2__1__Impl ;
    public final void rule__Discrete__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2452:1: ( rule__Discrete__Group_2__1__Impl )
            // InternalDSL.g:2453:2: rule__Discrete__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Discrete__Group_2__1__Impl();

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
    // $ANTLR end "rule__Discrete__Group_2__1"


    // $ANTLR start "rule__Discrete__Group_2__1__Impl"
    // InternalDSL.g:2459:1: rule__Discrete__Group_2__1__Impl : ( ( rule__Discrete__ValuesAssignment_2_1 ) ) ;
    public final void rule__Discrete__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2463:1: ( ( ( rule__Discrete__ValuesAssignment_2_1 ) ) )
            // InternalDSL.g:2464:1: ( ( rule__Discrete__ValuesAssignment_2_1 ) )
            {
            // InternalDSL.g:2464:1: ( ( rule__Discrete__ValuesAssignment_2_1 ) )
            // InternalDSL.g:2465:2: ( rule__Discrete__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getDiscreteAccess().getValuesAssignment_2_1()); 
            // InternalDSL.g:2466:2: ( rule__Discrete__ValuesAssignment_2_1 )
            // InternalDSL.g:2466:3: rule__Discrete__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Discrete__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDiscreteAccess().getValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__Discrete__Group_2__1__Impl"


    // $ANTLR start "rule__Integer__Group_0__0"
    // InternalDSL.g:2475:1: rule__Integer__Group_0__0 : rule__Integer__Group_0__0__Impl rule__Integer__Group_0__1 ;
    public final void rule__Integer__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2479:1: ( rule__Integer__Group_0__0__Impl rule__Integer__Group_0__1 )
            // InternalDSL.g:2480:2: rule__Integer__Group_0__0__Impl rule__Integer__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Integer__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Integer__Group_0__1();

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
    // $ANTLR end "rule__Integer__Group_0__0"


    // $ANTLR start "rule__Integer__Group_0__0__Impl"
    // InternalDSL.g:2487:1: rule__Integer__Group_0__0__Impl : ( () ) ;
    public final void rule__Integer__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2491:1: ( ( () ) )
            // InternalDSL.g:2492:1: ( () )
            {
            // InternalDSL.g:2492:1: ( () )
            // InternalDSL.g:2493:2: ()
            {
             before(grammarAccess.getIntegerAccess().getIntegerAction_0_0()); 
            // InternalDSL.g:2494:2: ()
            // InternalDSL.g:2494:3: 
            {
            }

             after(grammarAccess.getIntegerAccess().getIntegerAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group_0__0__Impl"


    // $ANTLR start "rule__Integer__Group_0__1"
    // InternalDSL.g:2502:1: rule__Integer__Group_0__1 : rule__Integer__Group_0__1__Impl ;
    public final void rule__Integer__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2506:1: ( rule__Integer__Group_0__1__Impl )
            // InternalDSL.g:2507:2: rule__Integer__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group_0__1__Impl();

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
    // $ANTLR end "rule__Integer__Group_0__1"


    // $ANTLR start "rule__Integer__Group_0__1__Impl"
    // InternalDSL.g:2513:1: rule__Integer__Group_0__1__Impl : ( ( rule__Integer__ValueAssignment_0_1 ) ) ;
    public final void rule__Integer__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2517:1: ( ( ( rule__Integer__ValueAssignment_0_1 ) ) )
            // InternalDSL.g:2518:1: ( ( rule__Integer__ValueAssignment_0_1 ) )
            {
            // InternalDSL.g:2518:1: ( ( rule__Integer__ValueAssignment_0_1 ) )
            // InternalDSL.g:2519:2: ( rule__Integer__ValueAssignment_0_1 )
            {
             before(grammarAccess.getIntegerAccess().getValueAssignment_0_1()); 
            // InternalDSL.g:2520:2: ( rule__Integer__ValueAssignment_0_1 )
            // InternalDSL.g:2520:3: rule__Integer__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Integer__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Integer__Group_0__1__Impl"


    // $ANTLR start "rule__Float__Group_0__0"
    // InternalDSL.g:2529:1: rule__Float__Group_0__0 : rule__Float__Group_0__0__Impl rule__Float__Group_0__1 ;
    public final void rule__Float__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2533:1: ( rule__Float__Group_0__0__Impl rule__Float__Group_0__1 )
            // InternalDSL.g:2534:2: rule__Float__Group_0__0__Impl rule__Float__Group_0__1
            {
            pushFollow(FOLLOW_30);
            rule__Float__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group_0__1();

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
    // $ANTLR end "rule__Float__Group_0__0"


    // $ANTLR start "rule__Float__Group_0__0__Impl"
    // InternalDSL.g:2541:1: rule__Float__Group_0__0__Impl : ( () ) ;
    public final void rule__Float__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2545:1: ( ( () ) )
            // InternalDSL.g:2546:1: ( () )
            {
            // InternalDSL.g:2546:1: ( () )
            // InternalDSL.g:2547:2: ()
            {
             before(grammarAccess.getFloatAccess().getFloatAction_0_0()); 
            // InternalDSL.g:2548:2: ()
            // InternalDSL.g:2548:3: 
            {
            }

             after(grammarAccess.getFloatAccess().getFloatAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group_0__0__Impl"


    // $ANTLR start "rule__Float__Group_0__1"
    // InternalDSL.g:2556:1: rule__Float__Group_0__1 : rule__Float__Group_0__1__Impl ;
    public final void rule__Float__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2560:1: ( rule__Float__Group_0__1__Impl )
            // InternalDSL.g:2561:2: rule__Float__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group_0__1__Impl();

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
    // $ANTLR end "rule__Float__Group_0__1"


    // $ANTLR start "rule__Float__Group_0__1__Impl"
    // InternalDSL.g:2567:1: rule__Float__Group_0__1__Impl : ( ( rule__Float__ValueAssignment_0_1 ) ) ;
    public final void rule__Float__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2571:1: ( ( ( rule__Float__ValueAssignment_0_1 ) ) )
            // InternalDSL.g:2572:1: ( ( rule__Float__ValueAssignment_0_1 ) )
            {
            // InternalDSL.g:2572:1: ( ( rule__Float__ValueAssignment_0_1 ) )
            // InternalDSL.g:2573:2: ( rule__Float__ValueAssignment_0_1 )
            {
             before(grammarAccess.getFloatAccess().getValueAssignment_0_1()); 
            // InternalDSL.g:2574:2: ( rule__Float__ValueAssignment_0_1 )
            // InternalDSL.g:2574:3: rule__Float__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Float__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Float__Group_0__1__Impl"


    // $ANTLR start "rule__String0__Group__0"
    // InternalDSL.g:2583:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2587:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalDSL.g:2588:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__String0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__1();

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
    // $ANTLR end "rule__String0__Group__0"


    // $ANTLR start "rule__String0__Group__0__Impl"
    // InternalDSL.g:2595:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2599:1: ( ( () ) )
            // InternalDSL.g:2600:1: ( () )
            {
            // InternalDSL.g:2600:1: ( () )
            // InternalDSL.g:2601:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0()); 
            // InternalDSL.g:2602:2: ()
            // InternalDSL.g:2602:3: 
            {
            }

             after(grammarAccess.getString0Access().getStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0__Impl"


    // $ANTLR start "rule__String0__Group__1"
    // InternalDSL.g:2610:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2614:1: ( rule__String0__Group__1__Impl )
            // InternalDSL.g:2615:2: rule__String0__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__1__Impl();

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
    // $ANTLR end "rule__String0__Group__1"


    // $ANTLR start "rule__String0__Group__1__Impl"
    // InternalDSL.g:2621:1: rule__String0__Group__1__Impl : ( ( rule__String0__ValueAssignment_1 ) ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2625:1: ( ( ( rule__String0__ValueAssignment_1 ) ) )
            // InternalDSL.g:2626:1: ( ( rule__String0__ValueAssignment_1 ) )
            {
            // InternalDSL.g:2626:1: ( ( rule__String0__ValueAssignment_1 ) )
            // InternalDSL.g:2627:2: ( rule__String0__ValueAssignment_1 )
            {
             before(grammarAccess.getString0Access().getValueAssignment_1()); 
            // InternalDSL.g:2628:2: ( rule__String0__ValueAssignment_1 )
            // InternalDSL.g:2628:3: rule__String0__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__String0__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getValueAssignment_1()); 

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
    // $ANTLR end "rule__String0__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalDSL.g:2637:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2641:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDSL.g:2642:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalDSL.g:2649:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2653:1: ( ( ( '-' )? ) )
            // InternalDSL.g:2654:1: ( ( '-' )? )
            {
            // InternalDSL.g:2654:1: ( ( '-' )? )
            // InternalDSL.g:2655:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDSL.g:2656:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDSL.g:2656:3: '-'
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalDSL.g:2664:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2668:1: ( rule__EInt__Group__1__Impl )
            // InternalDSL.g:2669:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalDSL.g:2675:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2679:1: ( ( RULE_INT ) )
            // InternalDSL.g:2680:1: ( RULE_INT )
            {
            // InternalDSL.g:2680:1: ( RULE_INT )
            // InternalDSL.g:2681:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalDSL.g:2691:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2695:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalDSL.g:2696:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

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
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalDSL.g:2703:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2707:1: ( ( ( '-' )? ) )
            // InternalDSL.g:2708:1: ( ( '-' )? )
            {
            // InternalDSL.g:2708:1: ( ( '-' )? )
            // InternalDSL.g:2709:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalDSL.g:2710:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDSL.g:2710:3: '-'
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalDSL.g:2718:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2722:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalDSL.g:2723:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

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
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalDSL.g:2730:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2734:1: ( ( ( RULE_INT )? ) )
            // InternalDSL.g:2735:1: ( ( RULE_INT )? )
            {
            // InternalDSL.g:2735:1: ( ( RULE_INT )? )
            // InternalDSL.g:2736:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalDSL.g:2737:2: ( RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDSL.g:2737:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalDSL.g:2745:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2749:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalDSL.g:2750:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

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
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalDSL.g:2757:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2761:1: ( ( '.' ) )
            // InternalDSL.g:2762:1: ( '.' )
            {
            // InternalDSL.g:2762:1: ( '.' )
            // InternalDSL.g:2763:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalDSL.g:2772:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2776:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalDSL.g:2777:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

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
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalDSL.g:2784:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2788:1: ( ( RULE_INT ) )
            // InternalDSL.g:2789:1: ( RULE_INT )
            {
            // InternalDSL.g:2789:1: ( RULE_INT )
            // InternalDSL.g:2790:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalDSL.g:2799:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2803:1: ( rule__EFloat__Group__4__Impl )
            // InternalDSL.g:2804:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

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
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalDSL.g:2810:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2814:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalDSL.g:2815:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalDSL.g:2815:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalDSL.g:2816:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalDSL.g:2817:2: ( rule__EFloat__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=12 && LA23_0<=13)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDSL.g:2817:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalDSL.g:2826:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2830:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalDSL.g:2831:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

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
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalDSL.g:2838:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2842:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalDSL.g:2843:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalDSL.g:2843:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalDSL.g:2844:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalDSL.g:2845:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalDSL.g:2845:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalDSL.g:2853:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2857:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalDSL.g:2858:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

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
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalDSL.g:2865:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2869:1: ( ( ( '-' )? ) )
            // InternalDSL.g:2870:1: ( ( '-' )? )
            {
            // InternalDSL.g:2870:1: ( ( '-' )? )
            // InternalDSL.g:2871:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalDSL.g:2872:2: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDSL.g:2872:3: '-'
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalDSL.g:2880:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2884:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalDSL.g:2885:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

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
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalDSL.g:2891:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2895:1: ( ( RULE_INT ) )
            // InternalDSL.g:2896:1: ( RULE_INT )
            {
            // InternalDSL.g:2896:1: ( RULE_INT )
            // InternalDSL.g:2897:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__Catalog__NameAssignment_1"
    // InternalDSL.g:2907:1: rule__Catalog__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Catalog__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2911:1: ( ( ruleEString ) )
            // InternalDSL.g:2912:2: ( ruleEString )
            {
            // InternalDSL.g:2912:2: ( ruleEString )
            // InternalDSL.g:2913:3: ruleEString
            {
             before(grammarAccess.getCatalogAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCatalogAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Catalog__NameAssignment_1"


    // $ANTLR start "rule__Catalog__RecordsAssignment_3"
    // InternalDSL.g:2922:1: rule__Catalog__RecordsAssignment_3 : ( ruleContainer ) ;
    public final void rule__Catalog__RecordsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2926:1: ( ( ruleContainer ) )
            // InternalDSL.g:2927:2: ( ruleContainer )
            {
            // InternalDSL.g:2927:2: ( ruleContainer )
            // InternalDSL.g:2928:3: ruleContainer
            {
             before(grammarAccess.getCatalogAccess().getRecordsContainerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getCatalogAccess().getRecordsContainerParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Catalog__RecordsAssignment_3"


    // $ANTLR start "rule__Catalog__RecordsAssignment_4"
    // InternalDSL.g:2937:1: rule__Catalog__RecordsAssignment_4 : ( ruleContainer ) ;
    public final void rule__Catalog__RecordsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2941:1: ( ( ruleContainer ) )
            // InternalDSL.g:2942:2: ( ruleContainer )
            {
            // InternalDSL.g:2942:2: ( ruleContainer )
            // InternalDSL.g:2943:3: ruleContainer
            {
             before(grammarAccess.getCatalogAccess().getRecordsContainerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getCatalogAccess().getRecordsContainerParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Catalog__RecordsAssignment_4"


    // $ANTLR start "rule__Catalog__PatternsAssignment_6"
    // InternalDSL.g:2952:1: rule__Catalog__PatternsAssignment_6 : ( ruleObservation ) ;
    public final void rule__Catalog__PatternsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2956:1: ( ( ruleObservation ) )
            // InternalDSL.g:2957:2: ( ruleObservation )
            {
            // InternalDSL.g:2957:2: ( ruleObservation )
            // InternalDSL.g:2958:3: ruleObservation
            {
             before(grammarAccess.getCatalogAccess().getPatternsObservationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleObservation();

            state._fsp--;

             after(grammarAccess.getCatalogAccess().getPatternsObservationParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Catalog__PatternsAssignment_6"


    // $ANTLR start "rule__Catalog__PatternsAssignment_7"
    // InternalDSL.g:2967:1: rule__Catalog__PatternsAssignment_7 : ( ruleObservation ) ;
    public final void rule__Catalog__PatternsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2971:1: ( ( ruleObservation ) )
            // InternalDSL.g:2972:2: ( ruleObservation )
            {
            // InternalDSL.g:2972:2: ( ruleObservation )
            // InternalDSL.g:2973:3: ruleObservation
            {
             before(grammarAccess.getCatalogAccess().getPatternsObservationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleObservation();

            state._fsp--;

             after(grammarAccess.getCatalogAccess().getPatternsObservationParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Catalog__PatternsAssignment_7"


    // $ANTLR start "rule__Container__TypeAssignment_0"
    // InternalDSL.g:2982:1: rule__Container__TypeAssignment_0 : ( ruleContainerType ) ;
    public final void rule__Container__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2986:1: ( ( ruleContainerType ) )
            // InternalDSL.g:2987:2: ( ruleContainerType )
            {
            // InternalDSL.g:2987:2: ( ruleContainerType )
            // InternalDSL.g:2988:3: ruleContainerType
            {
             before(grammarAccess.getContainerAccess().getTypeContainerTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleContainerType();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getTypeContainerTypeEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Container__TypeAssignment_0"


    // $ANTLR start "rule__Container__NameAssignment_1"
    // InternalDSL.g:2997:1: rule__Container__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Container__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3001:1: ( ( ruleEString ) )
            // InternalDSL.g:3002:2: ( ruleEString )
            {
            // InternalDSL.g:3002:2: ( ruleEString )
            // InternalDSL.g:3003:3: ruleEString
            {
             before(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Container__NameAssignment_1"


    // $ANTLR start "rule__Container__ContainsAssignment_2_1"
    // InternalDSL.g:3012:1: rule__Container__ContainsAssignment_2_1 : ( ruleContainable ) ;
    public final void rule__Container__ContainsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3016:1: ( ( ruleContainable ) )
            // InternalDSL.g:3017:2: ( ruleContainable )
            {
            // InternalDSL.g:3017:2: ( ruleContainable )
            // InternalDSL.g:3018:3: ruleContainable
            {
             before(grammarAccess.getContainerAccess().getContainsContainableParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContainable();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getContainsContainableParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Container__ContainsAssignment_2_1"


    // $ANTLR start "rule__Periodic__NameAssignment_1"
    // InternalDSL.g:3027:1: rule__Periodic__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Periodic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3031:1: ( ( ruleEString ) )
            // InternalDSL.g:3032:2: ( ruleEString )
            {
            // InternalDSL.g:3032:2: ( ruleEString )
            // InternalDSL.g:3033:3: ruleEString
            {
             before(grammarAccess.getPeriodicAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPeriodicAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Periodic__NameAssignment_1"


    // $ANTLR start "rule__Periodic__ObservesAssignment_3"
    // InternalDSL.g:3042:1: rule__Periodic__ObservesAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Periodic__ObservesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3046:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3047:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3047:2: ( ( ruleEString ) )
            // InternalDSL.g:3048:3: ( ruleEString )
            {
             before(grammarAccess.getPeriodicAccess().getObservesObservationCrossReference_3_0()); 
            // InternalDSL.g:3049:3: ( ruleEString )
            // InternalDSL.g:3050:4: ruleEString
            {
             before(grammarAccess.getPeriodicAccess().getObservesObservationEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPeriodicAccess().getObservesObservationEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPeriodicAccess().getObservesObservationCrossReference_3_0()); 

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
    // $ANTLR end "rule__Periodic__ObservesAssignment_3"


    // $ANTLR start "rule__Periodic__PeriodAssignment_5"
    // InternalDSL.g:3061:1: rule__Periodic__PeriodAssignment_5 : ( ruleEInt ) ;
    public final void rule__Periodic__PeriodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3065:1: ( ( ruleEInt ) )
            // InternalDSL.g:3066:2: ( ruleEInt )
            {
            // InternalDSL.g:3066:2: ( ruleEInt )
            // InternalDSL.g:3067:3: ruleEInt
            {
             before(grammarAccess.getPeriodicAccess().getPeriodEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPeriodicAccess().getPeriodEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Periodic__PeriodAssignment_5"


    // $ANTLR start "rule__Periodic__CalculatedFromAssignment_7_1"
    // InternalDSL.g:3076:1: rule__Periodic__CalculatedFromAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Periodic__CalculatedFromAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3080:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3081:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3081:2: ( ( ruleEString ) )
            // InternalDSL.g:3082:3: ( ruleEString )
            {
             before(grammarAccess.getPeriodicAccess().getCalculatedFromSensorCrossReference_7_1_0()); 
            // InternalDSL.g:3083:3: ( ruleEString )
            // InternalDSL.g:3084:4: ruleEString
            {
             before(grammarAccess.getPeriodicAccess().getCalculatedFromSensorEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPeriodicAccess().getCalculatedFromSensorEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getPeriodicAccess().getCalculatedFromSensorCrossReference_7_1_0()); 

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
    // $ANTLR end "rule__Periodic__CalculatedFromAssignment_7_1"


    // $ANTLR start "rule__Event_Based__NameAssignment_1"
    // InternalDSL.g:3095:1: rule__Event_Based__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Event_Based__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3099:1: ( ( ruleEString ) )
            // InternalDSL.g:3100:2: ( ruleEString )
            {
            // InternalDSL.g:3100:2: ( ruleEString )
            // InternalDSL.g:3101:3: ruleEString
            {
             before(grammarAccess.getEvent_BasedAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEvent_BasedAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Event_Based__NameAssignment_1"


    // $ANTLR start "rule__Event_Based__ObservesAssignment_3"
    // InternalDSL.g:3110:1: rule__Event_Based__ObservesAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Event_Based__ObservesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3114:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3115:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3115:2: ( ( ruleEString ) )
            // InternalDSL.g:3116:3: ( ruleEString )
            {
             before(grammarAccess.getEvent_BasedAccess().getObservesObservationCrossReference_3_0()); 
            // InternalDSL.g:3117:3: ( ruleEString )
            // InternalDSL.g:3118:4: ruleEString
            {
             before(grammarAccess.getEvent_BasedAccess().getObservesObservationEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEvent_BasedAccess().getObservesObservationEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getEvent_BasedAccess().getObservesObservationCrossReference_3_0()); 

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
    // $ANTLR end "rule__Event_Based__ObservesAssignment_3"


    // $ANTLR start "rule__Event_Based__TriggerAssignment_5"
    // InternalDSL.g:3129:1: rule__Event_Based__TriggerAssignment_5 : ( ruleEString ) ;
    public final void rule__Event_Based__TriggerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3133:1: ( ( ruleEString ) )
            // InternalDSL.g:3134:2: ( ruleEString )
            {
            // InternalDSL.g:3134:2: ( ruleEString )
            // InternalDSL.g:3135:3: ruleEString
            {
             before(grammarAccess.getEvent_BasedAccess().getTriggerEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEvent_BasedAccess().getTriggerEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Event_Based__TriggerAssignment_5"


    // $ANTLR start "rule__Event_Based__CalculatedFromAssignment_6_1"
    // InternalDSL.g:3144:1: rule__Event_Based__CalculatedFromAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Event_Based__CalculatedFromAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3148:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3149:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3149:2: ( ( ruleEString ) )
            // InternalDSL.g:3150:3: ( ruleEString )
            {
             before(grammarAccess.getEvent_BasedAccess().getCalculatedFromSensorCrossReference_6_1_0()); 
            // InternalDSL.g:3151:3: ( ruleEString )
            // InternalDSL.g:3152:4: ruleEString
            {
             before(grammarAccess.getEvent_BasedAccess().getCalculatedFromSensorEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEvent_BasedAccess().getCalculatedFromSensorEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getEvent_BasedAccess().getCalculatedFromSensorCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Event_Based__CalculatedFromAssignment_6_1"


    // $ANTLR start "rule__Observation__NameAssignment_0"
    // InternalDSL.g:3163:1: rule__Observation__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Observation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3167:1: ( ( ruleEString ) )
            // InternalDSL.g:3168:2: ( ruleEString )
            {
            // InternalDSL.g:3168:2: ( ruleEString )
            // InternalDSL.g:3169:3: ruleEString
            {
             before(grammarAccess.getObservationAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getObservationAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Observation__NameAssignment_0"


    // $ANTLR start "rule__Observation__TimeAssignment_2"
    // InternalDSL.g:3178:1: rule__Observation__TimeAssignment_2 : ( ruleField ) ;
    public final void rule__Observation__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3182:1: ( ( ruleField ) )
            // InternalDSL.g:3183:2: ( ruleField )
            {
            // InternalDSL.g:3183:2: ( ruleField )
            // InternalDSL.g:3184:3: ruleField
            {
             before(grammarAccess.getObservationAccess().getTimeFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getObservationAccess().getTimeFieldParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Observation__TimeAssignment_2"


    // $ANTLR start "rule__Observation__ValuesAssignment_3"
    // InternalDSL.g:3193:1: rule__Observation__ValuesAssignment_3 : ( ruleField ) ;
    public final void rule__Observation__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3197:1: ( ( ruleField ) )
            // InternalDSL.g:3198:2: ( ruleField )
            {
            // InternalDSL.g:3198:2: ( ruleField )
            // InternalDSL.g:3199:3: ruleField
            {
             before(grammarAccess.getObservationAccess().getValuesFieldParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getObservationAccess().getValuesFieldParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Observation__ValuesAssignment_3"


    // $ANTLR start "rule__Observation__ValuesAssignment_4"
    // InternalDSL.g:3208:1: rule__Observation__ValuesAssignment_4 : ( ruleField ) ;
    public final void rule__Observation__ValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3212:1: ( ( ruleField ) )
            // InternalDSL.g:3213:2: ( ruleField )
            {
            // InternalDSL.g:3213:2: ( ruleField )
            // InternalDSL.g:3214:3: ruleField
            {
             before(grammarAccess.getObservationAccess().getValuesFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getObservationAccess().getValuesFieldParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Observation__ValuesAssignment_4"


    // $ANTLR start "rule__Atomic__NameAssignment_0"
    // InternalDSL.g:3223:1: rule__Atomic__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Atomic__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3227:1: ( ( ruleEString ) )
            // InternalDSL.g:3228:2: ( ruleEString )
            {
            // InternalDSL.g:3228:2: ( ruleEString )
            // InternalDSL.g:3229:3: ruleEString
            {
             before(grammarAccess.getAtomicAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Atomic__NameAssignment_0"


    // $ANTLR start "rule__Atomic__RangeAssignment_2"
    // InternalDSL.g:3238:1: rule__Atomic__RangeAssignment_2 : ( ruleRange ) ;
    public final void rule__Atomic__RangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3242:1: ( ( ruleRange ) )
            // InternalDSL.g:3243:2: ( ruleRange )
            {
            // InternalDSL.g:3243:2: ( ruleRange )
            // InternalDSL.g:3244:3: ruleRange
            {
             before(grammarAccess.getAtomicAccess().getRangeRangeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getRangeRangeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Atomic__RangeAssignment_2"


    // $ANTLR start "rule__Calculated__NameAssignment_0"
    // InternalDSL.g:3253:1: rule__Calculated__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Calculated__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3257:1: ( ( ruleEString ) )
            // InternalDSL.g:3258:2: ( ruleEString )
            {
            // InternalDSL.g:3258:2: ( ruleEString )
            // InternalDSL.g:3259:3: ruleEString
            {
             before(grammarAccess.getCalculatedAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCalculatedAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Calculated__NameAssignment_0"


    // $ANTLR start "rule__Calculated__RangeAssignment_2"
    // InternalDSL.g:3268:1: rule__Calculated__RangeAssignment_2 : ( ruleRange ) ;
    public final void rule__Calculated__RangeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3272:1: ( ( ruleRange ) )
            // InternalDSL.g:3273:2: ( ruleRange )
            {
            // InternalDSL.g:3273:2: ( ruleRange )
            // InternalDSL.g:3274:3: ruleRange
            {
             before(grammarAccess.getCalculatedAccess().getRangeRangeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getCalculatedAccess().getRangeRangeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Calculated__RangeAssignment_2"


    // $ANTLR start "rule__Calculated__FunctionAssignment_4"
    // InternalDSL.g:3283:1: rule__Calculated__FunctionAssignment_4 : ( ruleEString ) ;
    public final void rule__Calculated__FunctionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3287:1: ( ( ruleEString ) )
            // InternalDSL.g:3288:2: ( ruleEString )
            {
            // InternalDSL.g:3288:2: ( ruleEString )
            // InternalDSL.g:3289:3: ruleEString
            {
             before(grammarAccess.getCalculatedAccess().getFunctionEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCalculatedAccess().getFunctionEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Calculated__FunctionAssignment_4"


    // $ANTLR start "rule__Calculated__OperandsAssignment_6"
    // InternalDSL.g:3298:1: rule__Calculated__OperandsAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Calculated__OperandsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3302:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3303:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3303:2: ( ( ruleEString ) )
            // InternalDSL.g:3304:3: ( ruleEString )
            {
             before(grammarAccess.getCalculatedAccess().getOperandsFieldCrossReference_6_0()); 
            // InternalDSL.g:3305:3: ( ruleEString )
            // InternalDSL.g:3306:4: ruleEString
            {
             before(grammarAccess.getCalculatedAccess().getOperandsFieldEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCalculatedAccess().getOperandsFieldEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCalculatedAccess().getOperandsFieldCrossReference_6_0()); 

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
    // $ANTLR end "rule__Calculated__OperandsAssignment_6"


    // $ANTLR start "rule__Calculated__OperandsAssignment_7_1"
    // InternalDSL.g:3317:1: rule__Calculated__OperandsAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Calculated__OperandsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3321:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3322:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3322:2: ( ( ruleEString ) )
            // InternalDSL.g:3323:3: ( ruleEString )
            {
             before(grammarAccess.getCalculatedAccess().getOperandsFieldCrossReference_7_1_0()); 
            // InternalDSL.g:3324:3: ( ruleEString )
            // InternalDSL.g:3325:4: ruleEString
            {
             before(grammarAccess.getCalculatedAccess().getOperandsFieldEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCalculatedAccess().getOperandsFieldEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getCalculatedAccess().getOperandsFieldCrossReference_7_1_0()); 

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
    // $ANTLR end "rule__Calculated__OperandsAssignment_7_1"


    // $ANTLR start "rule__Continuous__MinAssignment_2"
    // InternalDSL.g:3336:1: rule__Continuous__MinAssignment_2 : ( ruleDataType ) ;
    public final void rule__Continuous__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3340:1: ( ( ruleDataType ) )
            // InternalDSL.g:3341:2: ( ruleDataType )
            {
            // InternalDSL.g:3341:2: ( ruleDataType )
            // InternalDSL.g:3342:3: ruleDataType
            {
             before(grammarAccess.getContinuousAccess().getMinDataTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getContinuousAccess().getMinDataTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Continuous__MinAssignment_2"


    // $ANTLR start "rule__Continuous__MaxAssignment_4"
    // InternalDSL.g:3351:1: rule__Continuous__MaxAssignment_4 : ( ruleDataType ) ;
    public final void rule__Continuous__MaxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3355:1: ( ( ruleDataType ) )
            // InternalDSL.g:3356:2: ( ruleDataType )
            {
            // InternalDSL.g:3356:2: ( ruleDataType )
            // InternalDSL.g:3357:3: ruleDataType
            {
             before(grammarAccess.getContinuousAccess().getMaxDataTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getContinuousAccess().getMaxDataTypeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Continuous__MaxAssignment_4"


    // $ANTLR start "rule__Discrete__ValuesAssignment_1"
    // InternalDSL.g:3366:1: rule__Discrete__ValuesAssignment_1 : ( ruleDataType ) ;
    public final void rule__Discrete__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3370:1: ( ( ruleDataType ) )
            // InternalDSL.g:3371:2: ( ruleDataType )
            {
            // InternalDSL.g:3371:2: ( ruleDataType )
            // InternalDSL.g:3372:3: ruleDataType
            {
             before(grammarAccess.getDiscreteAccess().getValuesDataTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDiscreteAccess().getValuesDataTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Discrete__ValuesAssignment_1"


    // $ANTLR start "rule__Discrete__ValuesAssignment_2_1"
    // InternalDSL.g:3381:1: rule__Discrete__ValuesAssignment_2_1 : ( ruleDataType ) ;
    public final void rule__Discrete__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3385:1: ( ( ruleDataType ) )
            // InternalDSL.g:3386:2: ( ruleDataType )
            {
            // InternalDSL.g:3386:2: ( ruleDataType )
            // InternalDSL.g:3387:3: ruleDataType
            {
             before(grammarAccess.getDiscreteAccess().getValuesDataTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDiscreteAccess().getValuesDataTypeParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Discrete__ValuesAssignment_2_1"


    // $ANTLR start "rule__Integer__ValueAssignment_0_1"
    // InternalDSL.g:3396:1: rule__Integer__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__Integer__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3400:1: ( ( ruleEInt ) )
            // InternalDSL.g:3401:2: ( ruleEInt )
            {
            // InternalDSL.g:3401:2: ( ruleEInt )
            // InternalDSL.g:3402:3: ruleEInt
            {
             before(grammarAccess.getIntegerAccess().getValueEIntParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerAccess().getValueEIntParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Integer__ValueAssignment_0_1"


    // $ANTLR start "rule__Float__ValueAssignment_0_1"
    // InternalDSL.g:3411:1: rule__Float__ValueAssignment_0_1 : ( ruleEFloat ) ;
    public final void rule__Float__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3415:1: ( ( ruleEFloat ) )
            // InternalDSL.g:3416:2: ( ruleEFloat )
            {
            // InternalDSL.g:3416:2: ( ruleEFloat )
            // InternalDSL.g:3417:3: ruleEFloat
            {
             before(grammarAccess.getFloatAccess().getValueEFloatParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getFloatAccess().getValueEFloatParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Float__ValueAssignment_0_1"


    // $ANTLR start "rule__String0__ValueAssignment_1"
    // InternalDSL.g:3426:1: rule__String0__ValueAssignment_1 : ( ruleEString ) ;
    public final void rule__String0__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3430:1: ( ( ruleEString ) )
            // InternalDSL.g:3431:2: ( ruleEString )
            {
            // InternalDSL.g:3431:2: ( ruleEString )
            // InternalDSL.g:3432:3: ruleEString
            {
             before(grammarAccess.getString0Access().getValueEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getString0Access().getValueEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__String0__ValueAssignment_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\54\uffff";
    static final String dfa_2s = "\15\uffff\1\34\7\uffff\1\34\26\uffff";
    static final String dfa_3s = "\1\4\2\42\1\46\1\4\1\6\2\47\1\6\2\47\3\4\1\14\1\6\2\50\1\6\2\50\1\4\1\6\2\50\1\6\2\50\2\uffff\2\6\2\14\1\6\1\47\5\6\1\50\1\6\1\50";
    static final String dfa_4s = "\1\5\2\42\1\46\3\53\1\51\1\6\2\51\2\53\1\43\1\51\2\53\1\50\1\6\2\50\1\43\2\53\1\51\1\6\2\51\2\uffff\2\52\1\50\1\51\1\6\1\51\4\52\1\6\1\50\1\6\1\51";
    static final String dfa_5s = "\34\uffff\1\1\1\2\16\uffff";
    static final String dfa_6s = "\54\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2",
            "\1\3",
            "\1\3",
            "\1\4",
            "\1\11\1\12\1\6\4\uffff\1\7\33\uffff\1\13\2\uffff\1\5\1\10",
            "\1\6\44\uffff\1\10",
            "\1\13\1\15\1\14\1\uffff\1\10",
            "\1\13\1\15\1\14",
            "\1\16",
            "\1\13\1\15\1\14",
            "\1\13\1\15\1\14",
            "\1\23\1\24\1\20\4\uffff\1\21\34\uffff\1\25\1\uffff\1\17\1\22",
            "\1\32\1\33\1\27\4\uffff\1\30\36\uffff\1\26\1\31",
            "\2\34\35\uffff\1\35",
            "\1\36\1\37\31\uffff\1\13\1\15\1\14",
            "\1\20\44\uffff\1\22",
            "\1\25\2\uffff\1\22",
            "\1\25",
            "\1\40",
            "\1\25",
            "\1\25",
            "\2\34\35\uffff\1\35",
            "\1\27\44\uffff\1\31",
            "\1\15\1\14\1\uffff\1\31",
            "\1\15\1\14",
            "\1\41",
            "\1\15\1\14",
            "\1\15\1\14",
            "",
            "",
            "\1\43\43\uffff\1\42",
            "\1\43\43\uffff\1\42",
            "\1\44\1\45\32\uffff\1\25",
            "\1\46\1\47\32\uffff\1\15\1\14",
            "\1\43",
            "\1\13\1\15\1\14",
            "\1\51\43\uffff\1\50",
            "\1\51\43\uffff\1\50",
            "\1\53\43\uffff\1\52",
            "\1\53\43\uffff\1\52",
            "\1\51",
            "\1\25",
            "\1\53",
            "\1\15\1\14"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "618:1: rule__Field__Alternatives : ( ( ruleAtomic ) | ( ruleCalculated ) );";
        }
    }
    static final String dfa_8s = "\17\uffff";
    static final String dfa_9s = "\1\46\1\4\1\6\2\47\1\6\2\47\2\uffff\1\14\3\6\1\47";
    static final String dfa_10s = "\1\46\3\53\1\51\1\6\2\51\2\uffff\1\51\2\52\1\6\1\51";
    static final String dfa_11s = "\10\uffff\1\1\1\2\5\uffff";
    static final String dfa_12s = "\17\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\6\1\7\1\3\4\uffff\1\4\33\uffff\1\10\2\uffff\1\2\1\5",
            "\1\3\44\uffff\1\5",
            "\1\10\2\11\1\uffff\1\5",
            "\1\10\2\11",
            "\1\12",
            "\1\10\2\11",
            "\1\10\2\11",
            "",
            "",
            "\1\13\1\14\31\uffff\1\10\2\11",
            "\1\16\43\uffff\1\15",
            "\1\16\43\uffff\1\15",
            "\1\16",
            "\1\10\2\11"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "639:1: rule__Range__Alternatives : ( ( ruleContinuous ) | ( ruleDiscrete ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000009FC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001FC002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000841FC000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000C8000000870L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000D0000000870L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000C0000000870L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000C0000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000003000L});

}
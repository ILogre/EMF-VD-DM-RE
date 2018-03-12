package visualizationDesignLanguage.ide.contentassist.antlr.internal;

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
import visualizationDesignLanguage.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Continuous'", "'Discrete'", "'Scalar'", "'Structural'", "'Proportion'", "'Location'", "'Comparison'", "'Part_to_a_whole'", "'Relationship'", "'Over_time'", "'Distribution'", "'Hierarchy'", "'Reference_tool'", "'Range'", "'Pattern'", "'Dashboard'", "':'", "'Visualizations :'", "'Positioning :'", "'of'", "';'", "'shows'", "','", "'displayed as'", "'of type'", "'locate at'", "'view'", "'   |   '", "': ['", "']'", "'Column'", "'Line'", "'sized'", "'Icon'", "'Color'", "'Threshold ('", "')'", "'min'", "'max'", "'-'"
    };
    public static final int T__50=50;
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



    // $ANTLR start "entryRuleDashboard"
    // InternalDSL.g:53:1: entryRuleDashboard : ruleDashboard EOF ;
    public final void entryRuleDashboard() throws RecognitionException {
        try {
            // InternalDSL.g:54:1: ( ruleDashboard EOF )
            // InternalDSL.g:55:1: ruleDashboard EOF
            {
             before(grammarAccess.getDashboardRule()); 
            pushFollow(FOLLOW_1);
            ruleDashboard();

            state._fsp--;

             after(grammarAccess.getDashboardRule()); 
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
    // $ANTLR end "entryRuleDashboard"


    // $ANTLR start "ruleDashboard"
    // InternalDSL.g:62:1: ruleDashboard : ( ( rule__Dashboard__Group__0 ) ) ;
    public final void ruleDashboard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( rule__Dashboard__Group__0 ) ) )
            // InternalDSL.g:67:2: ( ( rule__Dashboard__Group__0 ) )
            {
            // InternalDSL.g:67:2: ( ( rule__Dashboard__Group__0 ) )
            // InternalDSL.g:68:3: ( rule__Dashboard__Group__0 )
            {
             before(grammarAccess.getDashboardAccess().getGroup()); 
            // InternalDSL.g:69:3: ( rule__Dashboard__Group__0 )
            // InternalDSL.g:69:4: rule__Dashboard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDashboardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDashboard"


    // $ANTLR start "entryRuleVisualization"
    // InternalDSL.g:78:1: entryRuleVisualization : ruleVisualization EOF ;
    public final void entryRuleVisualization() throws RecognitionException {
        try {
            // InternalDSL.g:79:1: ( ruleVisualization EOF )
            // InternalDSL.g:80:1: ruleVisualization EOF
            {
             before(grammarAccess.getVisualizationRule()); 
            pushFollow(FOLLOW_1);
            ruleVisualization();

            state._fsp--;

             after(grammarAccess.getVisualizationRule()); 
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
    // $ANTLR end "entryRuleVisualization"


    // $ANTLR start "ruleVisualization"
    // InternalDSL.g:87:1: ruleVisualization : ( ( rule__Visualization__Group__0 ) ) ;
    public final void ruleVisualization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ( rule__Visualization__Group__0 ) ) )
            // InternalDSL.g:92:2: ( ( rule__Visualization__Group__0 ) )
            {
            // InternalDSL.g:92:2: ( ( rule__Visualization__Group__0 ) )
            // InternalDSL.g:93:3: ( rule__Visualization__Group__0 )
            {
             before(grammarAccess.getVisualizationAccess().getGroup()); 
            // InternalDSL.g:94:3: ( rule__Visualization__Group__0 )
            // InternalDSL.g:94:4: rule__Visualization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Visualization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVisualizationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisualization"


    // $ANTLR start "entryRuleWhatQualifier"
    // InternalDSL.g:103:1: entryRuleWhatQualifier : ruleWhatQualifier EOF ;
    public final void entryRuleWhatQualifier() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleWhatQualifier EOF )
            // InternalDSL.g:105:1: ruleWhatQualifier EOF
            {
             before(grammarAccess.getWhatQualifierRule()); 
            pushFollow(FOLLOW_1);
            ruleWhatQualifier();

            state._fsp--;

             after(grammarAccess.getWhatQualifierRule()); 
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
    // $ANTLR end "entryRuleWhatQualifier"


    // $ANTLR start "ruleWhatQualifier"
    // InternalDSL.g:112:1: ruleWhatQualifier : ( ( rule__WhatQualifier__ConcernAssignment ) ) ;
    public final void ruleWhatQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__WhatQualifier__ConcernAssignment ) ) )
            // InternalDSL.g:117:2: ( ( rule__WhatQualifier__ConcernAssignment ) )
            {
            // InternalDSL.g:117:2: ( ( rule__WhatQualifier__ConcernAssignment ) )
            // InternalDSL.g:118:3: ( rule__WhatQualifier__ConcernAssignment )
            {
             before(grammarAccess.getWhatQualifierAccess().getConcernAssignment()); 
            // InternalDSL.g:119:3: ( rule__WhatQualifier__ConcernAssignment )
            // InternalDSL.g:119:4: rule__WhatQualifier__ConcernAssignment
            {
            pushFollow(FOLLOW_2);
            rule__WhatQualifier__ConcernAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWhatQualifierAccess().getConcernAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhatQualifier"


    // $ANTLR start "entryRuleSource"
    // InternalDSL.g:128:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleSource EOF )
            // InternalDSL.g:130:1: ruleSource EOF
            {
             before(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getSourceRule()); 
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
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalDSL.g:137:1: ruleSource : ( ( rule__Source__Group__0 ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__Source__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__Source__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__Source__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__Source__Group__0 )
            {
             before(grammarAccess.getSourceAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__Source__Group__0 )
            // InternalDSL.g:144:4: rule__Source__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleHowQualifier"
    // InternalDSL.g:153:1: entryRuleHowQualifier : ruleHowQualifier EOF ;
    public final void entryRuleHowQualifier() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleHowQualifier EOF )
            // InternalDSL.g:155:1: ruleHowQualifier EOF
            {
             before(grammarAccess.getHowQualifierRule()); 
            pushFollow(FOLLOW_1);
            ruleHowQualifier();

            state._fsp--;

             after(grammarAccess.getHowQualifierRule()); 
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
    // $ANTLR end "entryRuleHowQualifier"


    // $ANTLR start "ruleHowQualifier"
    // InternalDSL.g:162:1: ruleHowQualifier : ( ( rule__HowQualifier__Alternatives ) ) ;
    public final void ruleHowQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__HowQualifier__Alternatives ) ) )
            // InternalDSL.g:167:2: ( ( rule__HowQualifier__Alternatives ) )
            {
            // InternalDSL.g:167:2: ( ( rule__HowQualifier__Alternatives ) )
            // InternalDSL.g:168:3: ( rule__HowQualifier__Alternatives )
            {
             before(grammarAccess.getHowQualifierAccess().getAlternatives()); 
            // InternalDSL.g:169:3: ( rule__HowQualifier__Alternatives )
            // InternalDSL.g:169:4: rule__HowQualifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HowQualifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHowQualifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHowQualifier"


    // $ANTLR start "entryRuleWindow"
    // InternalDSL.g:178:1: entryRuleWindow : ruleWindow EOF ;
    public final void entryRuleWindow() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleWindow EOF )
            // InternalDSL.g:180:1: ruleWindow EOF
            {
             before(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_1);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getWindowRule()); 
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
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // InternalDSL.g:187:1: ruleWindow : ( ( rule__Window__Group__0 ) ) ;
    public final void ruleWindow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__Window__Group__0 ) ) )
            // InternalDSL.g:192:2: ( ( rule__Window__Group__0 ) )
            {
            // InternalDSL.g:192:2: ( ( rule__Window__Group__0 ) )
            // InternalDSL.g:193:3: ( rule__Window__Group__0 )
            {
             before(grammarAccess.getWindowAccess().getGroup()); 
            // InternalDSL.g:194:3: ( rule__Window__Group__0 )
            // InternalDSL.g:194:4: rule__Window__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWindow"


    // $ANTLR start "entryRuleContainer"
    // InternalDSL.g:203:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleContainer EOF )
            // InternalDSL.g:205:1: ruleContainer EOF
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
    // InternalDSL.g:212:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__Container__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__Container__Group__0 )
            // InternalDSL.g:219:4: rule__Container__Group__0
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


    // $ANTLR start "entryRuleCell"
    // InternalDSL.g:228:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleCell EOF )
            // InternalDSL.g:230:1: ruleCell EOF
            {
             before(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getCellRule()); 
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
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalDSL.g:237:1: ruleCell : ( ( rule__Cell__WrapsAssignment ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__Cell__WrapsAssignment ) ) )
            // InternalDSL.g:242:2: ( ( rule__Cell__WrapsAssignment ) )
            {
            // InternalDSL.g:242:2: ( ( rule__Cell__WrapsAssignment ) )
            // InternalDSL.g:243:3: ( rule__Cell__WrapsAssignment )
            {
             before(grammarAccess.getCellAccess().getWrapsAssignment()); 
            // InternalDSL.g:244:3: ( rule__Cell__WrapsAssignment )
            // InternalDSL.g:244:4: rule__Cell__WrapsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Cell__WrapsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getWrapsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleIcon"
    // InternalDSL.g:253:1: entryRuleIcon : ruleIcon EOF ;
    public final void entryRuleIcon() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleIcon EOF )
            // InternalDSL.g:255:1: ruleIcon EOF
            {
             before(grammarAccess.getIconRule()); 
            pushFollow(FOLLOW_1);
            ruleIcon();

            state._fsp--;

             after(grammarAccess.getIconRule()); 
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
    // $ANTLR end "entryRuleIcon"


    // $ANTLR start "ruleIcon"
    // InternalDSL.g:262:1: ruleIcon : ( ( rule__Icon__Group__0 ) ) ;
    public final void ruleIcon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__Icon__Group__0 ) ) )
            // InternalDSL.g:267:2: ( ( rule__Icon__Group__0 ) )
            {
            // InternalDSL.g:267:2: ( ( rule__Icon__Group__0 ) )
            // InternalDSL.g:268:3: ( rule__Icon__Group__0 )
            {
             before(grammarAccess.getIconAccess().getGroup()); 
            // InternalDSL.g:269:3: ( rule__Icon__Group__0 )
            // InternalDSL.g:269:4: rule__Icon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Icon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIconAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIcon"


    // $ANTLR start "entryRuleColorization"
    // InternalDSL.g:278:1: entryRuleColorization : ruleColorization EOF ;
    public final void entryRuleColorization() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleColorization EOF )
            // InternalDSL.g:280:1: ruleColorization EOF
            {
             before(grammarAccess.getColorizationRule()); 
            pushFollow(FOLLOW_1);
            ruleColorization();

            state._fsp--;

             after(grammarAccess.getColorizationRule()); 
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
    // $ANTLR end "entryRuleColorization"


    // $ANTLR start "ruleColorization"
    // InternalDSL.g:287:1: ruleColorization : ( ( rule__Colorization__Group__0 ) ) ;
    public final void ruleColorization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__Colorization__Group__0 ) ) )
            // InternalDSL.g:292:2: ( ( rule__Colorization__Group__0 ) )
            {
            // InternalDSL.g:292:2: ( ( rule__Colorization__Group__0 ) )
            // InternalDSL.g:293:3: ( rule__Colorization__Group__0 )
            {
             before(grammarAccess.getColorizationAccess().getGroup()); 
            // InternalDSL.g:294:3: ( rule__Colorization__Group__0 )
            // InternalDSL.g:294:4: rule__Colorization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Colorization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorizationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColorization"


    // $ANTLR start "entryRuleProperty"
    // InternalDSL.g:303:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleProperty EOF )
            // InternalDSL.g:305:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalDSL.g:312:1: ruleProperty : ( ( rule__Property__ValueAssignment ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__Property__ValueAssignment ) ) )
            // InternalDSL.g:317:2: ( ( rule__Property__ValueAssignment ) )
            {
            // InternalDSL.g:317:2: ( ( rule__Property__ValueAssignment ) )
            // InternalDSL.g:318:3: ( rule__Property__ValueAssignment )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment()); 
            // InternalDSL.g:319:3: ( rule__Property__ValueAssignment )
            // InternalDSL.g:319:4: rule__Property__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Property__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleThreshold"
    // InternalDSL.g:328:1: entryRuleThreshold : ruleThreshold EOF ;
    public final void entryRuleThreshold() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( ruleThreshold EOF )
            // InternalDSL.g:330:1: ruleThreshold EOF
            {
             before(grammarAccess.getThresholdRule()); 
            pushFollow(FOLLOW_1);
            ruleThreshold();

            state._fsp--;

             after(grammarAccess.getThresholdRule()); 
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
    // $ANTLR end "entryRuleThreshold"


    // $ANTLR start "ruleThreshold"
    // InternalDSL.g:337:1: ruleThreshold : ( ( rule__Threshold__Group__0 ) ) ;
    public final void ruleThreshold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__Threshold__Group__0 ) ) )
            // InternalDSL.g:342:2: ( ( rule__Threshold__Group__0 ) )
            {
            // InternalDSL.g:342:2: ( ( rule__Threshold__Group__0 ) )
            // InternalDSL.g:343:3: ( rule__Threshold__Group__0 )
            {
             before(grammarAccess.getThresholdAccess().getGroup()); 
            // InternalDSL.g:344:3: ( rule__Threshold__Group__0 )
            // InternalDSL.g:344:4: rule__Threshold__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Threshold__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThresholdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThreshold"


    // $ANTLR start "entryRuleEString"
    // InternalDSL.g:353:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDSL.g:354:1: ( ruleEString EOF )
            // InternalDSL.g:355:1: ruleEString EOF
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
    // InternalDSL.g:362:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:366:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDSL.g:367:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDSL.g:367:2: ( ( rule__EString__Alternatives ) )
            // InternalDSL.g:368:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDSL.g:369:3: ( rule__EString__Alternatives )
            // InternalDSL.g:369:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleEInt"
    // InternalDSL.g:378:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDSL.g:379:1: ( ruleEInt EOF )
            // InternalDSL.g:380:1: ruleEInt EOF
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
    // InternalDSL.g:387:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:391:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDSL.g:392:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDSL.g:392:2: ( ( rule__EInt__Group__0 ) )
            // InternalDSL.g:393:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDSL.g:394:3: ( rule__EInt__Group__0 )
            // InternalDSL.g:394:4: rule__EInt__Group__0
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


    // $ANTLR start "ruleDataProperty"
    // InternalDSL.g:403:1: ruleDataProperty : ( ( rule__DataProperty__Alternatives ) ) ;
    public final void ruleDataProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:407:1: ( ( ( rule__DataProperty__Alternatives ) ) )
            // InternalDSL.g:408:2: ( ( rule__DataProperty__Alternatives ) )
            {
            // InternalDSL.g:408:2: ( ( rule__DataProperty__Alternatives ) )
            // InternalDSL.g:409:3: ( rule__DataProperty__Alternatives )
            {
             before(grammarAccess.getDataPropertyAccess().getAlternatives()); 
            // InternalDSL.g:410:3: ( rule__DataProperty__Alternatives )
            // InternalDSL.g:410:4: rule__DataProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataProperty"


    // $ANTLR start "ruleTaxonomy"
    // InternalDSL.g:419:1: ruleTaxonomy : ( ( rule__Taxonomy__Alternatives ) ) ;
    public final void ruleTaxonomy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:423:1: ( ( ( rule__Taxonomy__Alternatives ) ) )
            // InternalDSL.g:424:2: ( ( rule__Taxonomy__Alternatives ) )
            {
            // InternalDSL.g:424:2: ( ( rule__Taxonomy__Alternatives ) )
            // InternalDSL.g:425:3: ( rule__Taxonomy__Alternatives )
            {
             before(grammarAccess.getTaxonomyAccess().getAlternatives()); 
            // InternalDSL.g:426:3: ( rule__Taxonomy__Alternatives )
            // InternalDSL.g:426:4: rule__Taxonomy__Alternatives
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


    // $ANTLR start "rule__HowQualifier__Alternatives"
    // InternalDSL.g:434:1: rule__HowQualifier__Alternatives : ( ( ruleIcon ) | ( ruleColorization ) | ( ruleProperty ) | ( ruleThreshold ) );
    public final void rule__HowQualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:438:1: ( ( ruleIcon ) | ( ruleColorization ) | ( ruleProperty ) | ( ruleThreshold ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt1=1;
                }
                break;
            case 45:
                {
                alt1=2;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
                {
                alt1=3;
                }
                break;
            case 46:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDSL.g:439:2: ( ruleIcon )
                    {
                    // InternalDSL.g:439:2: ( ruleIcon )
                    // InternalDSL.g:440:3: ruleIcon
                    {
                     before(grammarAccess.getHowQualifierAccess().getIconParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIcon();

                    state._fsp--;

                     after(grammarAccess.getHowQualifierAccess().getIconParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:445:2: ( ruleColorization )
                    {
                    // InternalDSL.g:445:2: ( ruleColorization )
                    // InternalDSL.g:446:3: ruleColorization
                    {
                     before(grammarAccess.getHowQualifierAccess().getColorizationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColorization();

                    state._fsp--;

                     after(grammarAccess.getHowQualifierAccess().getColorizationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:451:2: ( ruleProperty )
                    {
                    // InternalDSL.g:451:2: ( ruleProperty )
                    // InternalDSL.g:452:3: ruleProperty
                    {
                     before(grammarAccess.getHowQualifierAccess().getPropertyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleProperty();

                    state._fsp--;

                     after(grammarAccess.getHowQualifierAccess().getPropertyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:457:2: ( ruleThreshold )
                    {
                    // InternalDSL.g:457:2: ( ruleThreshold )
                    // InternalDSL.g:458:3: ruleThreshold
                    {
                     before(grammarAccess.getHowQualifierAccess().getThresholdParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleThreshold();

                    state._fsp--;

                     after(grammarAccess.getHowQualifierAccess().getThresholdParserRuleCall_3()); 

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
    // $ANTLR end "rule__HowQualifier__Alternatives"


    // $ANTLR start "rule__Container__Alternatives_0"
    // InternalDSL.g:467:1: rule__Container__Alternatives_0 : ( ( ( rule__Container__Group_0_0__0 ) ) | ( ( rule__Container__Group_0_1__0 ) ) );
    public final void rule__Container__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:471:1: ( ( ( rule__Container__Group_0_0__0 ) ) | ( ( rule__Container__Group_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==41) ) {
                alt2=1;
            }
            else if ( (LA2_0==42) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:472:2: ( ( rule__Container__Group_0_0__0 ) )
                    {
                    // InternalDSL.g:472:2: ( ( rule__Container__Group_0_0__0 ) )
                    // InternalDSL.g:473:3: ( rule__Container__Group_0_0__0 )
                    {
                     before(grammarAccess.getContainerAccess().getGroup_0_0()); 
                    // InternalDSL.g:474:3: ( rule__Container__Group_0_0__0 )
                    // InternalDSL.g:474:4: rule__Container__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getContainerAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:478:2: ( ( rule__Container__Group_0_1__0 ) )
                    {
                    // InternalDSL.g:478:2: ( ( rule__Container__Group_0_1__0 ) )
                    // InternalDSL.g:479:3: ( rule__Container__Group_0_1__0 )
                    {
                     before(grammarAccess.getContainerAccess().getGroup_0_1()); 
                    // InternalDSL.g:480:3: ( rule__Container__Group_0_1__0 )
                    // InternalDSL.g:480:4: rule__Container__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getContainerAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__Container__Alternatives_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDSL.g:488:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:492:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalDSL.g:493:2: ( RULE_STRING )
                    {
                    // InternalDSL.g:493:2: ( RULE_STRING )
                    // InternalDSL.g:494:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:499:2: ( RULE_ID )
                    {
                    // InternalDSL.g:499:2: ( RULE_ID )
                    // InternalDSL.g:500:3: RULE_ID
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


    // $ANTLR start "rule__DataProperty__Alternatives"
    // InternalDSL.g:509:1: rule__DataProperty__Alternatives : ( ( ( 'Continuous' ) ) | ( ( 'Discrete' ) ) | ( ( 'Scalar' ) ) | ( ( 'Structural' ) ) );
    public final void rule__DataProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:513:1: ( ( ( 'Continuous' ) ) | ( ( 'Discrete' ) ) | ( ( 'Scalar' ) ) | ( ( 'Structural' ) ) )
            int alt4=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDSL.g:514:2: ( ( 'Continuous' ) )
                    {
                    // InternalDSL.g:514:2: ( ( 'Continuous' ) )
                    // InternalDSL.g:515:3: ( 'Continuous' )
                    {
                     before(grammarAccess.getDataPropertyAccess().getContinuousEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:516:3: ( 'Continuous' )
                    // InternalDSL.g:516:4: 'Continuous'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataPropertyAccess().getContinuousEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:520:2: ( ( 'Discrete' ) )
                    {
                    // InternalDSL.g:520:2: ( ( 'Discrete' ) )
                    // InternalDSL.g:521:3: ( 'Discrete' )
                    {
                     before(grammarAccess.getDataPropertyAccess().getDiscreteEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:522:3: ( 'Discrete' )
                    // InternalDSL.g:522:4: 'Discrete'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataPropertyAccess().getDiscreteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:526:2: ( ( 'Scalar' ) )
                    {
                    // InternalDSL.g:526:2: ( ( 'Scalar' ) )
                    // InternalDSL.g:527:3: ( 'Scalar' )
                    {
                     before(grammarAccess.getDataPropertyAccess().getScalarEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:528:3: ( 'Scalar' )
                    // InternalDSL.g:528:4: 'Scalar'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataPropertyAccess().getScalarEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:532:2: ( ( 'Structural' ) )
                    {
                    // InternalDSL.g:532:2: ( ( 'Structural' ) )
                    // InternalDSL.g:533:3: ( 'Structural' )
                    {
                     before(grammarAccess.getDataPropertyAccess().getStructuralEnumLiteralDeclaration_3()); 
                    // InternalDSL.g:534:3: ( 'Structural' )
                    // InternalDSL.g:534:4: 'Structural'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataPropertyAccess().getStructuralEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__DataProperty__Alternatives"


    // $ANTLR start "rule__Taxonomy__Alternatives"
    // InternalDSL.g:542:1: rule__Taxonomy__Alternatives : ( ( ( 'Proportion' ) ) | ( ( 'Location' ) ) | ( ( 'Comparison' ) ) | ( ( 'Part_to_a_whole' ) ) | ( ( 'Relationship' ) ) | ( ( 'Over_time' ) ) | ( ( 'Distribution' ) ) | ( ( 'Hierarchy' ) ) | ( ( 'Reference_tool' ) ) | ( ( 'Range' ) ) | ( ( 'Pattern' ) ) );
    public final void rule__Taxonomy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:546:1: ( ( ( 'Proportion' ) ) | ( ( 'Location' ) ) | ( ( 'Comparison' ) ) | ( ( 'Part_to_a_whole' ) ) | ( ( 'Relationship' ) ) | ( ( 'Over_time' ) ) | ( ( 'Distribution' ) ) | ( ( 'Hierarchy' ) ) | ( ( 'Reference_tool' ) ) | ( ( 'Range' ) ) | ( ( 'Pattern' ) ) )
            int alt5=11;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            case 21:
                {
                alt5=7;
                }
                break;
            case 22:
                {
                alt5=8;
                }
                break;
            case 23:
                {
                alt5=9;
                }
                break;
            case 24:
                {
                alt5=10;
                }
                break;
            case 25:
                {
                alt5=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDSL.g:547:2: ( ( 'Proportion' ) )
                    {
                    // InternalDSL.g:547:2: ( ( 'Proportion' ) )
                    // InternalDSL.g:548:3: ( 'Proportion' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getProportionEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:549:3: ( 'Proportion' )
                    // InternalDSL.g:549:4: 'Proportion'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getProportionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:553:2: ( ( 'Location' ) )
                    {
                    // InternalDSL.g:553:2: ( ( 'Location' ) )
                    // InternalDSL.g:554:3: ( 'Location' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getLocationEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:555:3: ( 'Location' )
                    // InternalDSL.g:555:4: 'Location'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getLocationEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:559:2: ( ( 'Comparison' ) )
                    {
                    // InternalDSL.g:559:2: ( ( 'Comparison' ) )
                    // InternalDSL.g:560:3: ( 'Comparison' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getComparisonEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:561:3: ( 'Comparison' )
                    // InternalDSL.g:561:4: 'Comparison'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getComparisonEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:565:2: ( ( 'Part_to_a_whole' ) )
                    {
                    // InternalDSL.g:565:2: ( ( 'Part_to_a_whole' ) )
                    // InternalDSL.g:566:3: ( 'Part_to_a_whole' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getPart_to_a_wholeEnumLiteralDeclaration_3()); 
                    // InternalDSL.g:567:3: ( 'Part_to_a_whole' )
                    // InternalDSL.g:567:4: 'Part_to_a_whole'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getPart_to_a_wholeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:571:2: ( ( 'Relationship' ) )
                    {
                    // InternalDSL.g:571:2: ( ( 'Relationship' ) )
                    // InternalDSL.g:572:3: ( 'Relationship' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getRelationshipEnumLiteralDeclaration_4()); 
                    // InternalDSL.g:573:3: ( 'Relationship' )
                    // InternalDSL.g:573:4: 'Relationship'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getRelationshipEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:577:2: ( ( 'Over_time' ) )
                    {
                    // InternalDSL.g:577:2: ( ( 'Over_time' ) )
                    // InternalDSL.g:578:3: ( 'Over_time' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getOver_timeEnumLiteralDeclaration_5()); 
                    // InternalDSL.g:579:3: ( 'Over_time' )
                    // InternalDSL.g:579:4: 'Over_time'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getOver_timeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:583:2: ( ( 'Distribution' ) )
                    {
                    // InternalDSL.g:583:2: ( ( 'Distribution' ) )
                    // InternalDSL.g:584:3: ( 'Distribution' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getDistributionEnumLiteralDeclaration_6()); 
                    // InternalDSL.g:585:3: ( 'Distribution' )
                    // InternalDSL.g:585:4: 'Distribution'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getDistributionEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDSL.g:589:2: ( ( 'Hierarchy' ) )
                    {
                    // InternalDSL.g:589:2: ( ( 'Hierarchy' ) )
                    // InternalDSL.g:590:3: ( 'Hierarchy' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getHierarchyEnumLiteralDeclaration_7()); 
                    // InternalDSL.g:591:3: ( 'Hierarchy' )
                    // InternalDSL.g:591:4: 'Hierarchy'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getHierarchyEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDSL.g:595:2: ( ( 'Reference_tool' ) )
                    {
                    // InternalDSL.g:595:2: ( ( 'Reference_tool' ) )
                    // InternalDSL.g:596:3: ( 'Reference_tool' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getReference_toolEnumLiteralDeclaration_8()); 
                    // InternalDSL.g:597:3: ( 'Reference_tool' )
                    // InternalDSL.g:597:4: 'Reference_tool'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getReference_toolEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDSL.g:601:2: ( ( 'Range' ) )
                    {
                    // InternalDSL.g:601:2: ( ( 'Range' ) )
                    // InternalDSL.g:602:3: ( 'Range' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getRangeEnumLiteralDeclaration_9()); 
                    // InternalDSL.g:603:3: ( 'Range' )
                    // InternalDSL.g:603:4: 'Range'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxonomyAccess().getRangeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDSL.g:607:2: ( ( 'Pattern' ) )
                    {
                    // InternalDSL.g:607:2: ( ( 'Pattern' ) )
                    // InternalDSL.g:608:3: ( 'Pattern' )
                    {
                     before(grammarAccess.getTaxonomyAccess().getPatternEnumLiteralDeclaration_10()); 
                    // InternalDSL.g:609:3: ( 'Pattern' )
                    // InternalDSL.g:609:4: 'Pattern'
                    {
                    match(input,25,FOLLOW_2); 

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


    // $ANTLR start "rule__Dashboard__Group__0"
    // InternalDSL.g:617:1: rule__Dashboard__Group__0 : rule__Dashboard__Group__0__Impl rule__Dashboard__Group__1 ;
    public final void rule__Dashboard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:621:1: ( rule__Dashboard__Group__0__Impl rule__Dashboard__Group__1 )
            // InternalDSL.g:622:2: rule__Dashboard__Group__0__Impl rule__Dashboard__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Dashboard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__1();

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
    // $ANTLR end "rule__Dashboard__Group__0"


    // $ANTLR start "rule__Dashboard__Group__0__Impl"
    // InternalDSL.g:629:1: rule__Dashboard__Group__0__Impl : ( 'Dashboard' ) ;
    public final void rule__Dashboard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:633:1: ( ( 'Dashboard' ) )
            // InternalDSL.g:634:1: ( 'Dashboard' )
            {
            // InternalDSL.g:634:1: ( 'Dashboard' )
            // InternalDSL.g:635:2: 'Dashboard'
            {
             before(grammarAccess.getDashboardAccess().getDashboardKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDashboardAccess().getDashboardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__0__Impl"


    // $ANTLR start "rule__Dashboard__Group__1"
    // InternalDSL.g:644:1: rule__Dashboard__Group__1 : rule__Dashboard__Group__1__Impl rule__Dashboard__Group__2 ;
    public final void rule__Dashboard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:648:1: ( rule__Dashboard__Group__1__Impl rule__Dashboard__Group__2 )
            // InternalDSL.g:649:2: rule__Dashboard__Group__1__Impl rule__Dashboard__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Dashboard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__2();

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
    // $ANTLR end "rule__Dashboard__Group__1"


    // $ANTLR start "rule__Dashboard__Group__1__Impl"
    // InternalDSL.g:656:1: rule__Dashboard__Group__1__Impl : ( ( rule__Dashboard__NameAssignment_1 ) ) ;
    public final void rule__Dashboard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:660:1: ( ( ( rule__Dashboard__NameAssignment_1 ) ) )
            // InternalDSL.g:661:1: ( ( rule__Dashboard__NameAssignment_1 ) )
            {
            // InternalDSL.g:661:1: ( ( rule__Dashboard__NameAssignment_1 ) )
            // InternalDSL.g:662:2: ( rule__Dashboard__NameAssignment_1 )
            {
             before(grammarAccess.getDashboardAccess().getNameAssignment_1()); 
            // InternalDSL.g:663:2: ( rule__Dashboard__NameAssignment_1 )
            // InternalDSL.g:663:3: rule__Dashboard__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dashboard__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDashboardAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__1__Impl"


    // $ANTLR start "rule__Dashboard__Group__2"
    // InternalDSL.g:671:1: rule__Dashboard__Group__2 : rule__Dashboard__Group__2__Impl rule__Dashboard__Group__3 ;
    public final void rule__Dashboard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:675:1: ( rule__Dashboard__Group__2__Impl rule__Dashboard__Group__3 )
            // InternalDSL.g:676:2: rule__Dashboard__Group__2__Impl rule__Dashboard__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Dashboard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__3();

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
    // $ANTLR end "rule__Dashboard__Group__2"


    // $ANTLR start "rule__Dashboard__Group__2__Impl"
    // InternalDSL.g:683:1: rule__Dashboard__Group__2__Impl : ( ':' ) ;
    public final void rule__Dashboard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:687:1: ( ( ':' ) )
            // InternalDSL.g:688:1: ( ':' )
            {
            // InternalDSL.g:688:1: ( ':' )
            // InternalDSL.g:689:2: ':'
            {
             before(grammarAccess.getDashboardAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDashboardAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__2__Impl"


    // $ANTLR start "rule__Dashboard__Group__3"
    // InternalDSL.g:698:1: rule__Dashboard__Group__3 : rule__Dashboard__Group__3__Impl rule__Dashboard__Group__4 ;
    public final void rule__Dashboard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:702:1: ( rule__Dashboard__Group__3__Impl rule__Dashboard__Group__4 )
            // InternalDSL.g:703:2: rule__Dashboard__Group__3__Impl rule__Dashboard__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Dashboard__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__4();

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
    // $ANTLR end "rule__Dashboard__Group__3"


    // $ANTLR start "rule__Dashboard__Group__3__Impl"
    // InternalDSL.g:710:1: rule__Dashboard__Group__3__Impl : ( 'Visualizations :' ) ;
    public final void rule__Dashboard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:714:1: ( ( 'Visualizations :' ) )
            // InternalDSL.g:715:1: ( 'Visualizations :' )
            {
            // InternalDSL.g:715:1: ( 'Visualizations :' )
            // InternalDSL.g:716:2: 'Visualizations :'
            {
             before(grammarAccess.getDashboardAccess().getVisualizationsKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDashboardAccess().getVisualizationsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__3__Impl"


    // $ANTLR start "rule__Dashboard__Group__4"
    // InternalDSL.g:725:1: rule__Dashboard__Group__4 : rule__Dashboard__Group__4__Impl rule__Dashboard__Group__5 ;
    public final void rule__Dashboard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:729:1: ( rule__Dashboard__Group__4__Impl rule__Dashboard__Group__5 )
            // InternalDSL.g:730:2: rule__Dashboard__Group__4__Impl rule__Dashboard__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Dashboard__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__5();

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
    // $ANTLR end "rule__Dashboard__Group__4"


    // $ANTLR start "rule__Dashboard__Group__4__Impl"
    // InternalDSL.g:737:1: rule__Dashboard__Group__4__Impl : ( ( rule__Dashboard__VisualizationsAssignment_4 ) ) ;
    public final void rule__Dashboard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:741:1: ( ( ( rule__Dashboard__VisualizationsAssignment_4 ) ) )
            // InternalDSL.g:742:1: ( ( rule__Dashboard__VisualizationsAssignment_4 ) )
            {
            // InternalDSL.g:742:1: ( ( rule__Dashboard__VisualizationsAssignment_4 ) )
            // InternalDSL.g:743:2: ( rule__Dashboard__VisualizationsAssignment_4 )
            {
             before(grammarAccess.getDashboardAccess().getVisualizationsAssignment_4()); 
            // InternalDSL.g:744:2: ( rule__Dashboard__VisualizationsAssignment_4 )
            // InternalDSL.g:744:3: rule__Dashboard__VisualizationsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Dashboard__VisualizationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDashboardAccess().getVisualizationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__4__Impl"


    // $ANTLR start "rule__Dashboard__Group__5"
    // InternalDSL.g:752:1: rule__Dashboard__Group__5 : rule__Dashboard__Group__5__Impl rule__Dashboard__Group__6 ;
    public final void rule__Dashboard__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:756:1: ( rule__Dashboard__Group__5__Impl rule__Dashboard__Group__6 )
            // InternalDSL.g:757:2: rule__Dashboard__Group__5__Impl rule__Dashboard__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Dashboard__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__6();

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
    // $ANTLR end "rule__Dashboard__Group__5"


    // $ANTLR start "rule__Dashboard__Group__5__Impl"
    // InternalDSL.g:764:1: rule__Dashboard__Group__5__Impl : ( ( rule__Dashboard__VisualizationsAssignment_5 )* ) ;
    public final void rule__Dashboard__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:768:1: ( ( ( rule__Dashboard__VisualizationsAssignment_5 )* ) )
            // InternalDSL.g:769:1: ( ( rule__Dashboard__VisualizationsAssignment_5 )* )
            {
            // InternalDSL.g:769:1: ( ( rule__Dashboard__VisualizationsAssignment_5 )* )
            // InternalDSL.g:770:2: ( rule__Dashboard__VisualizationsAssignment_5 )*
            {
             before(grammarAccess.getDashboardAccess().getVisualizationsAssignment_5()); 
            // InternalDSL.g:771:2: ( rule__Dashboard__VisualizationsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSL.g:771:3: rule__Dashboard__VisualizationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Dashboard__VisualizationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDashboardAccess().getVisualizationsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__5__Impl"


    // $ANTLR start "rule__Dashboard__Group__6"
    // InternalDSL.g:779:1: rule__Dashboard__Group__6 : rule__Dashboard__Group__6__Impl rule__Dashboard__Group__7 ;
    public final void rule__Dashboard__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:783:1: ( rule__Dashboard__Group__6__Impl rule__Dashboard__Group__7 )
            // InternalDSL.g:784:2: rule__Dashboard__Group__6__Impl rule__Dashboard__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Dashboard__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__7();

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
    // $ANTLR end "rule__Dashboard__Group__6"


    // $ANTLR start "rule__Dashboard__Group__6__Impl"
    // InternalDSL.g:791:1: rule__Dashboard__Group__6__Impl : ( 'Positioning :' ) ;
    public final void rule__Dashboard__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:795:1: ( ( 'Positioning :' ) )
            // InternalDSL.g:796:1: ( 'Positioning :' )
            {
            // InternalDSL.g:796:1: ( 'Positioning :' )
            // InternalDSL.g:797:2: 'Positioning :'
            {
             before(grammarAccess.getDashboardAccess().getPositioningKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDashboardAccess().getPositioningKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__6__Impl"


    // $ANTLR start "rule__Dashboard__Group__7"
    // InternalDSL.g:806:1: rule__Dashboard__Group__7 : rule__Dashboard__Group__7__Impl rule__Dashboard__Group__8 ;
    public final void rule__Dashboard__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:810:1: ( rule__Dashboard__Group__7__Impl rule__Dashboard__Group__8 )
            // InternalDSL.g:811:2: rule__Dashboard__Group__7__Impl rule__Dashboard__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Dashboard__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__8();

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
    // $ANTLR end "rule__Dashboard__Group__7"


    // $ANTLR start "rule__Dashboard__Group__7__Impl"
    // InternalDSL.g:818:1: rule__Dashboard__Group__7__Impl : ( ( rule__Dashboard__WindowsAssignment_7 ) ) ;
    public final void rule__Dashboard__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:822:1: ( ( ( rule__Dashboard__WindowsAssignment_7 ) ) )
            // InternalDSL.g:823:1: ( ( rule__Dashboard__WindowsAssignment_7 ) )
            {
            // InternalDSL.g:823:1: ( ( rule__Dashboard__WindowsAssignment_7 ) )
            // InternalDSL.g:824:2: ( rule__Dashboard__WindowsAssignment_7 )
            {
             before(grammarAccess.getDashboardAccess().getWindowsAssignment_7()); 
            // InternalDSL.g:825:2: ( rule__Dashboard__WindowsAssignment_7 )
            // InternalDSL.g:825:3: rule__Dashboard__WindowsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Dashboard__WindowsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDashboardAccess().getWindowsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__7__Impl"


    // $ANTLR start "rule__Dashboard__Group__8"
    // InternalDSL.g:833:1: rule__Dashboard__Group__8 : rule__Dashboard__Group__8__Impl ;
    public final void rule__Dashboard__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:837:1: ( rule__Dashboard__Group__8__Impl )
            // InternalDSL.g:838:2: rule__Dashboard__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__8__Impl();

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
    // $ANTLR end "rule__Dashboard__Group__8"


    // $ANTLR start "rule__Dashboard__Group__8__Impl"
    // InternalDSL.g:844:1: rule__Dashboard__Group__8__Impl : ( ( rule__Dashboard__WindowsAssignment_8 )* ) ;
    public final void rule__Dashboard__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:848:1: ( ( ( rule__Dashboard__WindowsAssignment_8 )* ) )
            // InternalDSL.g:849:1: ( ( rule__Dashboard__WindowsAssignment_8 )* )
            {
            // InternalDSL.g:849:1: ( ( rule__Dashboard__WindowsAssignment_8 )* )
            // InternalDSL.g:850:2: ( rule__Dashboard__WindowsAssignment_8 )*
            {
             before(grammarAccess.getDashboardAccess().getWindowsAssignment_8()); 
            // InternalDSL.g:851:2: ( rule__Dashboard__WindowsAssignment_8 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==37) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDSL.g:851:3: rule__Dashboard__WindowsAssignment_8
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Dashboard__WindowsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDashboardAccess().getWindowsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__8__Impl"


    // $ANTLR start "rule__Visualization__Group__0"
    // InternalDSL.g:860:1: rule__Visualization__Group__0 : rule__Visualization__Group__0__Impl rule__Visualization__Group__1 ;
    public final void rule__Visualization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:864:1: ( rule__Visualization__Group__0__Impl rule__Visualization__Group__1 )
            // InternalDSL.g:865:2: rule__Visualization__Group__0__Impl rule__Visualization__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Visualization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualization__Group__1();

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
    // $ANTLR end "rule__Visualization__Group__0"


    // $ANTLR start "rule__Visualization__Group__0__Impl"
    // InternalDSL.g:872:1: rule__Visualization__Group__0__Impl : ( ( rule__Visualization__NameAssignment_0 ) ) ;
    public final void rule__Visualization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:876:1: ( ( ( rule__Visualization__NameAssignment_0 ) ) )
            // InternalDSL.g:877:1: ( ( rule__Visualization__NameAssignment_0 ) )
            {
            // InternalDSL.g:877:1: ( ( rule__Visualization__NameAssignment_0 ) )
            // InternalDSL.g:878:2: ( rule__Visualization__NameAssignment_0 )
            {
             before(grammarAccess.getVisualizationAccess().getNameAssignment_0()); 
            // InternalDSL.g:879:2: ( rule__Visualization__NameAssignment_0 )
            // InternalDSL.g:879:3: rule__Visualization__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Visualization__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVisualizationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group__0__Impl"


    // $ANTLR start "rule__Visualization__Group__1"
    // InternalDSL.g:887:1: rule__Visualization__Group__1 : rule__Visualization__Group__1__Impl rule__Visualization__Group__2 ;
    public final void rule__Visualization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:891:1: ( rule__Visualization__Group__1__Impl rule__Visualization__Group__2 )
            // InternalDSL.g:892:2: rule__Visualization__Group__1__Impl rule__Visualization__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Visualization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualization__Group__2();

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
    // $ANTLR end "rule__Visualization__Group__1"


    // $ANTLR start "rule__Visualization__Group__1__Impl"
    // InternalDSL.g:899:1: rule__Visualization__Group__1__Impl : ( ( rule__Visualization__Group_1__0 )? ) ;
    public final void rule__Visualization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:903:1: ( ( ( rule__Visualization__Group_1__0 )? ) )
            // InternalDSL.g:904:1: ( ( rule__Visualization__Group_1__0 )? )
            {
            // InternalDSL.g:904:1: ( ( rule__Visualization__Group_1__0 )? )
            // InternalDSL.g:905:2: ( rule__Visualization__Group_1__0 )?
            {
             before(grammarAccess.getVisualizationAccess().getGroup_1()); 
            // InternalDSL.g:906:2: ( rule__Visualization__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDSL.g:906:3: rule__Visualization__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visualization__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualizationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group__1__Impl"


    // $ANTLR start "rule__Visualization__Group__2"
    // InternalDSL.g:914:1: rule__Visualization__Group__2 : rule__Visualization__Group__2__Impl rule__Visualization__Group__3 ;
    public final void rule__Visualization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:918:1: ( rule__Visualization__Group__2__Impl rule__Visualization__Group__3 )
            // InternalDSL.g:919:2: rule__Visualization__Group__2__Impl rule__Visualization__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Visualization__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualization__Group__3();

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
    // $ANTLR end "rule__Visualization__Group__2"


    // $ANTLR start "rule__Visualization__Group__2__Impl"
    // InternalDSL.g:926:1: rule__Visualization__Group__2__Impl : ( 'of' ) ;
    public final void rule__Visualization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:930:1: ( ( 'of' ) )
            // InternalDSL.g:931:1: ( 'of' )
            {
            // InternalDSL.g:931:1: ( 'of' )
            // InternalDSL.g:932:2: 'of'
            {
             before(grammarAccess.getVisualizationAccess().getOfKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVisualizationAccess().getOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group__2__Impl"


    // $ANTLR start "rule__Visualization__Group__3"
    // InternalDSL.g:941:1: rule__Visualization__Group__3 : rule__Visualization__Group__3__Impl rule__Visualization__Group__4 ;
    public final void rule__Visualization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:945:1: ( rule__Visualization__Group__3__Impl rule__Visualization__Group__4 )
            // InternalDSL.g:946:2: rule__Visualization__Group__3__Impl rule__Visualization__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Visualization__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualization__Group__4();

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
    // $ANTLR end "rule__Visualization__Group__3"


    // $ANTLR start "rule__Visualization__Group__3__Impl"
    // InternalDSL.g:953:1: rule__Visualization__Group__3__Impl : ( ( rule__Visualization__DisplaysAssignment_3 ) ) ;
    public final void rule__Visualization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:957:1: ( ( ( rule__Visualization__DisplaysAssignment_3 ) ) )
            // InternalDSL.g:958:1: ( ( rule__Visualization__DisplaysAssignment_3 ) )
            {
            // InternalDSL.g:958:1: ( ( rule__Visualization__DisplaysAssignment_3 ) )
            // InternalDSL.g:959:2: ( rule__Visualization__DisplaysAssignment_3 )
            {
             before(grammarAccess.getVisualizationAccess().getDisplaysAssignment_3()); 
            // InternalDSL.g:960:2: ( rule__Visualization__DisplaysAssignment_3 )
            // InternalDSL.g:960:3: rule__Visualization__DisplaysAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Visualization__DisplaysAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVisualizationAccess().getDisplaysAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group__3__Impl"


    // $ANTLR start "rule__Visualization__Group__4"
    // InternalDSL.g:968:1: rule__Visualization__Group__4 : rule__Visualization__Group__4__Impl rule__Visualization__Group__5 ;
    public final void rule__Visualization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:972:1: ( rule__Visualization__Group__4__Impl rule__Visualization__Group__5 )
            // InternalDSL.g:973:2: rule__Visualization__Group__4__Impl rule__Visualization__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Visualization__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualization__Group__5();

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
    // $ANTLR end "rule__Visualization__Group__4"


    // $ANTLR start "rule__Visualization__Group__4__Impl"
    // InternalDSL.g:980:1: rule__Visualization__Group__4__Impl : ( ( rule__Visualization__Group_4__0 )* ) ;
    public final void rule__Visualization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:984:1: ( ( ( rule__Visualization__Group_4__0 )* ) )
            // InternalDSL.g:985:1: ( ( rule__Visualization__Group_4__0 )* )
            {
            // InternalDSL.g:985:1: ( ( rule__Visualization__Group_4__0 )* )
            // InternalDSL.g:986:2: ( rule__Visualization__Group_4__0 )*
            {
             before(grammarAccess.getVisualizationAccess().getGroup_4()); 
            // InternalDSL.g:987:2: ( rule__Visualization__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==RULE_STRING) ) {
                        int LA9_3 = input.LA(3);

                        if ( ((LA9_3>=34 && LA9_3<=36)) ) {
                            alt9=1;
                        }


                    }
                    else if ( (LA9_1==RULE_ID) ) {
                        int LA9_4 = input.LA(3);

                        if ( ((LA9_4>=34 && LA9_4<=36)) ) {
                            alt9=1;
                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSL.g:987:3: rule__Visualization__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Visualization__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getVisualizationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group__4__Impl"


    // $ANTLR start "rule__Visualization__Group__5"
    // InternalDSL.g:995:1: rule__Visualization__Group__5 : rule__Visualization__Group__5__Impl ;
    public final void rule__Visualization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:999:1: ( rule__Visualization__Group__5__Impl )
            // InternalDSL.g:1000:2: rule__Visualization__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visualization__Group__5__Impl();

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
    // $ANTLR end "rule__Visualization__Group__5"


    // $ANTLR start "rule__Visualization__Group__5__Impl"
    // InternalDSL.g:1006:1: rule__Visualization__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__Visualization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1010:1: ( ( ( ';' )? ) )
            // InternalDSL.g:1011:1: ( ( ';' )? )
            {
            // InternalDSL.g:1011:1: ( ( ';' )? )
            // InternalDSL.g:1012:2: ( ';' )?
            {
             before(grammarAccess.getVisualizationAccess().getSemicolonKeyword_5()); 
            // InternalDSL.g:1013:2: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:1013:3: ';'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getVisualizationAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group__5__Impl"


    // $ANTLR start "rule__Visualization__Group_1__0"
    // InternalDSL.g:1022:1: rule__Visualization__Group_1__0 : rule__Visualization__Group_1__0__Impl rule__Visualization__Group_1__1 ;
    public final void rule__Visualization__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1026:1: ( rule__Visualization__Group_1__0__Impl rule__Visualization__Group_1__1 )
            // InternalDSL.g:1027:2: rule__Visualization__Group_1__0__Impl rule__Visualization__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Visualization__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualization__Group_1__1();

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
    // $ANTLR end "rule__Visualization__Group_1__0"


    // $ANTLR start "rule__Visualization__Group_1__0__Impl"
    // InternalDSL.g:1034:1: rule__Visualization__Group_1__0__Impl : ( 'shows' ) ;
    public final void rule__Visualization__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1038:1: ( ( 'shows' ) )
            // InternalDSL.g:1039:1: ( 'shows' )
            {
            // InternalDSL.g:1039:1: ( 'shows' )
            // InternalDSL.g:1040:2: 'shows'
            {
             before(grammarAccess.getVisualizationAccess().getShowsKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVisualizationAccess().getShowsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group_1__0__Impl"


    // $ANTLR start "rule__Visualization__Group_1__1"
    // InternalDSL.g:1049:1: rule__Visualization__Group_1__1 : rule__Visualization__Group_1__1__Impl rule__Visualization__Group_1__2 ;
    public final void rule__Visualization__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1053:1: ( rule__Visualization__Group_1__1__Impl rule__Visualization__Group_1__2 )
            // InternalDSL.g:1054:2: rule__Visualization__Group_1__1__Impl rule__Visualization__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Visualization__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualization__Group_1__2();

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
    // $ANTLR end "rule__Visualization__Group_1__1"


    // $ANTLR start "rule__Visualization__Group_1__1__Impl"
    // InternalDSL.g:1061:1: rule__Visualization__Group_1__1__Impl : ( ( rule__Visualization__ConcernsAssignment_1_1 ) ) ;
    public final void rule__Visualization__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1065:1: ( ( ( rule__Visualization__ConcernsAssignment_1_1 ) ) )
            // InternalDSL.g:1066:1: ( ( rule__Visualization__ConcernsAssignment_1_1 ) )
            {
            // InternalDSL.g:1066:1: ( ( rule__Visualization__ConcernsAssignment_1_1 ) )
            // InternalDSL.g:1067:2: ( rule__Visualization__ConcernsAssignment_1_1 )
            {
             before(grammarAccess.getVisualizationAccess().getConcernsAssignment_1_1()); 
            // InternalDSL.g:1068:2: ( rule__Visualization__ConcernsAssignment_1_1 )
            // InternalDSL.g:1068:3: rule__Visualization__ConcernsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Visualization__ConcernsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualizationAccess().getConcernsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group_1__1__Impl"


    // $ANTLR start "rule__Visualization__Group_1__2"
    // InternalDSL.g:1076:1: rule__Visualization__Group_1__2 : rule__Visualization__Group_1__2__Impl ;
    public final void rule__Visualization__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1080:1: ( rule__Visualization__Group_1__2__Impl )
            // InternalDSL.g:1081:2: rule__Visualization__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visualization__Group_1__2__Impl();

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
    // $ANTLR end "rule__Visualization__Group_1__2"


    // $ANTLR start "rule__Visualization__Group_1__2__Impl"
    // InternalDSL.g:1087:1: rule__Visualization__Group_1__2__Impl : ( ( rule__Visualization__Group_1_2__0 )* ) ;
    public final void rule__Visualization__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1091:1: ( ( ( rule__Visualization__Group_1_2__0 )* ) )
            // InternalDSL.g:1092:1: ( ( rule__Visualization__Group_1_2__0 )* )
            {
            // InternalDSL.g:1092:1: ( ( rule__Visualization__Group_1_2__0 )* )
            // InternalDSL.g:1093:2: ( rule__Visualization__Group_1_2__0 )*
            {
             before(grammarAccess.getVisualizationAccess().getGroup_1_2()); 
            // InternalDSL.g:1094:2: ( rule__Visualization__Group_1_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDSL.g:1094:3: rule__Visualization__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Visualization__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getVisualizationAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group_1__2__Impl"


    // $ANTLR start "rule__Visualization__Group_1_2__0"
    // InternalDSL.g:1103:1: rule__Visualization__Group_1_2__0 : rule__Visualization__Group_1_2__0__Impl rule__Visualization__Group_1_2__1 ;
    public final void rule__Visualization__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1107:1: ( rule__Visualization__Group_1_2__0__Impl rule__Visualization__Group_1_2__1 )
            // InternalDSL.g:1108:2: rule__Visualization__Group_1_2__0__Impl rule__Visualization__Group_1_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Visualization__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualization__Group_1_2__1();

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
    // $ANTLR end "rule__Visualization__Group_1_2__0"


    // $ANTLR start "rule__Visualization__Group_1_2__0__Impl"
    // InternalDSL.g:1115:1: rule__Visualization__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Visualization__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1119:1: ( ( ',' ) )
            // InternalDSL.g:1120:1: ( ',' )
            {
            // InternalDSL.g:1120:1: ( ',' )
            // InternalDSL.g:1121:2: ','
            {
             before(grammarAccess.getVisualizationAccess().getCommaKeyword_1_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVisualizationAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group_1_2__0__Impl"


    // $ANTLR start "rule__Visualization__Group_1_2__1"
    // InternalDSL.g:1130:1: rule__Visualization__Group_1_2__1 : rule__Visualization__Group_1_2__1__Impl ;
    public final void rule__Visualization__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1134:1: ( rule__Visualization__Group_1_2__1__Impl )
            // InternalDSL.g:1135:2: rule__Visualization__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visualization__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Visualization__Group_1_2__1"


    // $ANTLR start "rule__Visualization__Group_1_2__1__Impl"
    // InternalDSL.g:1141:1: rule__Visualization__Group_1_2__1__Impl : ( ( rule__Visualization__ConcernsAssignment_1_2_1 ) ) ;
    public final void rule__Visualization__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1145:1: ( ( ( rule__Visualization__ConcernsAssignment_1_2_1 ) ) )
            // InternalDSL.g:1146:1: ( ( rule__Visualization__ConcernsAssignment_1_2_1 ) )
            {
            // InternalDSL.g:1146:1: ( ( rule__Visualization__ConcernsAssignment_1_2_1 ) )
            // InternalDSL.g:1147:2: ( rule__Visualization__ConcernsAssignment_1_2_1 )
            {
             before(grammarAccess.getVisualizationAccess().getConcernsAssignment_1_2_1()); 
            // InternalDSL.g:1148:2: ( rule__Visualization__ConcernsAssignment_1_2_1 )
            // InternalDSL.g:1148:3: rule__Visualization__ConcernsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Visualization__ConcernsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualizationAccess().getConcernsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group_1_2__1__Impl"


    // $ANTLR start "rule__Visualization__Group_4__0"
    // InternalDSL.g:1157:1: rule__Visualization__Group_4__0 : rule__Visualization__Group_4__0__Impl rule__Visualization__Group_4__1 ;
    public final void rule__Visualization__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1161:1: ( rule__Visualization__Group_4__0__Impl rule__Visualization__Group_4__1 )
            // InternalDSL.g:1162:2: rule__Visualization__Group_4__0__Impl rule__Visualization__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Visualization__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visualization__Group_4__1();

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
    // $ANTLR end "rule__Visualization__Group_4__0"


    // $ANTLR start "rule__Visualization__Group_4__0__Impl"
    // InternalDSL.g:1169:1: rule__Visualization__Group_4__0__Impl : ( ';' ) ;
    public final void rule__Visualization__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1173:1: ( ( ';' ) )
            // InternalDSL.g:1174:1: ( ';' )
            {
            // InternalDSL.g:1174:1: ( ';' )
            // InternalDSL.g:1175:2: ';'
            {
             before(grammarAccess.getVisualizationAccess().getSemicolonKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVisualizationAccess().getSemicolonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group_4__0__Impl"


    // $ANTLR start "rule__Visualization__Group_4__1"
    // InternalDSL.g:1184:1: rule__Visualization__Group_4__1 : rule__Visualization__Group_4__1__Impl ;
    public final void rule__Visualization__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1188:1: ( rule__Visualization__Group_4__1__Impl )
            // InternalDSL.g:1189:2: rule__Visualization__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visualization__Group_4__1__Impl();

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
    // $ANTLR end "rule__Visualization__Group_4__1"


    // $ANTLR start "rule__Visualization__Group_4__1__Impl"
    // InternalDSL.g:1195:1: rule__Visualization__Group_4__1__Impl : ( ( rule__Visualization__DisplaysAssignment_4_1 ) ) ;
    public final void rule__Visualization__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1199:1: ( ( ( rule__Visualization__DisplaysAssignment_4_1 ) ) )
            // InternalDSL.g:1200:1: ( ( rule__Visualization__DisplaysAssignment_4_1 ) )
            {
            // InternalDSL.g:1200:1: ( ( rule__Visualization__DisplaysAssignment_4_1 ) )
            // InternalDSL.g:1201:2: ( rule__Visualization__DisplaysAssignment_4_1 )
            {
             before(grammarAccess.getVisualizationAccess().getDisplaysAssignment_4_1()); 
            // InternalDSL.g:1202:2: ( rule__Visualization__DisplaysAssignment_4_1 )
            // InternalDSL.g:1202:3: rule__Visualization__DisplaysAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Visualization__DisplaysAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualizationAccess().getDisplaysAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group_4__1__Impl"


    // $ANTLR start "rule__Source__Group__0"
    // InternalDSL.g:1211:1: rule__Source__Group__0 : rule__Source__Group__0__Impl rule__Source__Group__1 ;
    public final void rule__Source__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1215:1: ( rule__Source__Group__0__Impl rule__Source__Group__1 )
            // InternalDSL.g:1216:2: rule__Source__Group__0__Impl rule__Source__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Source__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__1();

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
    // $ANTLR end "rule__Source__Group__0"


    // $ANTLR start "rule__Source__Group__0__Impl"
    // InternalDSL.g:1223:1: rule__Source__Group__0__Impl : ( ( rule__Source__NameAssignment_0 ) ) ;
    public final void rule__Source__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1227:1: ( ( ( rule__Source__NameAssignment_0 ) ) )
            // InternalDSL.g:1228:1: ( ( rule__Source__NameAssignment_0 ) )
            {
            // InternalDSL.g:1228:1: ( ( rule__Source__NameAssignment_0 ) )
            // InternalDSL.g:1229:2: ( rule__Source__NameAssignment_0 )
            {
             before(grammarAccess.getSourceAccess().getNameAssignment_0()); 
            // InternalDSL.g:1230:2: ( rule__Source__NameAssignment_0 )
            // InternalDSL.g:1230:3: rule__Source__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Source__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0__Impl"


    // $ANTLR start "rule__Source__Group__1"
    // InternalDSL.g:1238:1: rule__Source__Group__1 : rule__Source__Group__1__Impl rule__Source__Group__2 ;
    public final void rule__Source__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1242:1: ( rule__Source__Group__1__Impl rule__Source__Group__2 )
            // InternalDSL.g:1243:2: rule__Source__Group__1__Impl rule__Source__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Source__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__2();

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
    // $ANTLR end "rule__Source__Group__1"


    // $ANTLR start "rule__Source__Group__1__Impl"
    // InternalDSL.g:1250:1: rule__Source__Group__1__Impl : ( ( rule__Source__Group_1__0 )? ) ;
    public final void rule__Source__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1254:1: ( ( ( rule__Source__Group_1__0 )? ) )
            // InternalDSL.g:1255:1: ( ( rule__Source__Group_1__0 )? )
            {
            // InternalDSL.g:1255:1: ( ( rule__Source__Group_1__0 )? )
            // InternalDSL.g:1256:2: ( rule__Source__Group_1__0 )?
            {
             before(grammarAccess.getSourceAccess().getGroup_1()); 
            // InternalDSL.g:1257:2: ( rule__Source__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:1257:3: rule__Source__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1__Impl"


    // $ANTLR start "rule__Source__Group__2"
    // InternalDSL.g:1265:1: rule__Source__Group__2 : rule__Source__Group__2__Impl rule__Source__Group__3 ;
    public final void rule__Source__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1269:1: ( rule__Source__Group__2__Impl rule__Source__Group__3 )
            // InternalDSL.g:1270:2: rule__Source__Group__2__Impl rule__Source__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Source__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__3();

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
    // $ANTLR end "rule__Source__Group__2"


    // $ANTLR start "rule__Source__Group__2__Impl"
    // InternalDSL.g:1277:1: rule__Source__Group__2__Impl : ( ( rule__Source__Group_2__0 )? ) ;
    public final void rule__Source__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1281:1: ( ( ( rule__Source__Group_2__0 )? ) )
            // InternalDSL.g:1282:1: ( ( rule__Source__Group_2__0 )? )
            {
            // InternalDSL.g:1282:1: ( ( rule__Source__Group_2__0 )? )
            // InternalDSL.g:1283:2: ( rule__Source__Group_2__0 )?
            {
             before(grammarAccess.getSourceAccess().getGroup_2()); 
            // InternalDSL.g:1284:2: ( rule__Source__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDSL.g:1284:3: rule__Source__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__2__Impl"


    // $ANTLR start "rule__Source__Group__3"
    // InternalDSL.g:1292:1: rule__Source__Group__3 : rule__Source__Group__3__Impl rule__Source__Group__4 ;
    public final void rule__Source__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1296:1: ( rule__Source__Group__3__Impl rule__Source__Group__4 )
            // InternalDSL.g:1297:2: rule__Source__Group__3__Impl rule__Source__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Source__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__4();

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
    // $ANTLR end "rule__Source__Group__3"


    // $ANTLR start "rule__Source__Group__3__Impl"
    // InternalDSL.g:1304:1: rule__Source__Group__3__Impl : ( 'displayed as' ) ;
    public final void rule__Source__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1308:1: ( ( 'displayed as' ) )
            // InternalDSL.g:1309:1: ( 'displayed as' )
            {
            // InternalDSL.g:1309:1: ( 'displayed as' )
            // InternalDSL.g:1310:2: 'displayed as'
            {
             before(grammarAccess.getSourceAccess().getDisplayedAsKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getDisplayedAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__3__Impl"


    // $ANTLR start "rule__Source__Group__4"
    // InternalDSL.g:1319:1: rule__Source__Group__4 : rule__Source__Group__4__Impl ;
    public final void rule__Source__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1323:1: ( rule__Source__Group__4__Impl )
            // InternalDSL.g:1324:2: rule__Source__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__4__Impl();

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
    // $ANTLR end "rule__Source__Group__4"


    // $ANTLR start "rule__Source__Group__4__Impl"
    // InternalDSL.g:1330:1: rule__Source__Group__4__Impl : ( ( rule__Source__Group_4__0 )? ) ;
    public final void rule__Source__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1334:1: ( ( ( rule__Source__Group_4__0 )? ) )
            // InternalDSL.g:1335:1: ( ( rule__Source__Group_4__0 )? )
            {
            // InternalDSL.g:1335:1: ( ( rule__Source__Group_4__0 )? )
            // InternalDSL.g:1336:2: ( rule__Source__Group_4__0 )?
            {
             before(grammarAccess.getSourceAccess().getGroup_4()); 
            // InternalDSL.g:1337:2: ( rule__Source__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=14)||(LA14_0>=44 && LA14_0<=46)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDSL.g:1337:3: rule__Source__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__4__Impl"


    // $ANTLR start "rule__Source__Group_1__0"
    // InternalDSL.g:1346:1: rule__Source__Group_1__0 : rule__Source__Group_1__0__Impl rule__Source__Group_1__1 ;
    public final void rule__Source__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1350:1: ( rule__Source__Group_1__0__Impl rule__Source__Group_1__1 )
            // InternalDSL.g:1351:2: rule__Source__Group_1__0__Impl rule__Source__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Source__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_1__1();

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
    // $ANTLR end "rule__Source__Group_1__0"


    // $ANTLR start "rule__Source__Group_1__0__Impl"
    // InternalDSL.g:1358:1: rule__Source__Group_1__0__Impl : ( 'of type' ) ;
    public final void rule__Source__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1362:1: ( ( 'of type' ) )
            // InternalDSL.g:1363:1: ( 'of type' )
            {
            // InternalDSL.g:1363:1: ( 'of type' )
            // InternalDSL.g:1364:2: 'of type'
            {
             before(grammarAccess.getSourceAccess().getOfTypeKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getOfTypeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_1__0__Impl"


    // $ANTLR start "rule__Source__Group_1__1"
    // InternalDSL.g:1373:1: rule__Source__Group_1__1 : rule__Source__Group_1__1__Impl ;
    public final void rule__Source__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1377:1: ( rule__Source__Group_1__1__Impl )
            // InternalDSL.g:1378:2: rule__Source__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_1__1__Impl();

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
    // $ANTLR end "rule__Source__Group_1__1"


    // $ANTLR start "rule__Source__Group_1__1__Impl"
    // InternalDSL.g:1384:1: rule__Source__Group_1__1__Impl : ( ( rule__Source__TypeAssignment_1_1 ) ) ;
    public final void rule__Source__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1388:1: ( ( ( rule__Source__TypeAssignment_1_1 ) ) )
            // InternalDSL.g:1389:1: ( ( rule__Source__TypeAssignment_1_1 ) )
            {
            // InternalDSL.g:1389:1: ( ( rule__Source__TypeAssignment_1_1 ) )
            // InternalDSL.g:1390:2: ( rule__Source__TypeAssignment_1_1 )
            {
             before(grammarAccess.getSourceAccess().getTypeAssignment_1_1()); 
            // InternalDSL.g:1391:2: ( rule__Source__TypeAssignment_1_1 )
            // InternalDSL.g:1391:3: rule__Source__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_1__1__Impl"


    // $ANTLR start "rule__Source__Group_2__0"
    // InternalDSL.g:1400:1: rule__Source__Group_2__0 : rule__Source__Group_2__0__Impl rule__Source__Group_2__1 ;
    public final void rule__Source__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1404:1: ( rule__Source__Group_2__0__Impl rule__Source__Group_2__1 )
            // InternalDSL.g:1405:2: rule__Source__Group_2__0__Impl rule__Source__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Source__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_2__1();

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
    // $ANTLR end "rule__Source__Group_2__0"


    // $ANTLR start "rule__Source__Group_2__0__Impl"
    // InternalDSL.g:1412:1: rule__Source__Group_2__0__Impl : ( 'locate at' ) ;
    public final void rule__Source__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1416:1: ( ( 'locate at' ) )
            // InternalDSL.g:1417:1: ( 'locate at' )
            {
            // InternalDSL.g:1417:1: ( 'locate at' )
            // InternalDSL.g:1418:2: 'locate at'
            {
             before(grammarAccess.getSourceAccess().getLocateAtKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getLocateAtKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_2__0__Impl"


    // $ANTLR start "rule__Source__Group_2__1"
    // InternalDSL.g:1427:1: rule__Source__Group_2__1 : rule__Source__Group_2__1__Impl ;
    public final void rule__Source__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1431:1: ( rule__Source__Group_2__1__Impl )
            // InternalDSL.g:1432:2: rule__Source__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_2__1__Impl();

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
    // $ANTLR end "rule__Source__Group_2__1"


    // $ANTLR start "rule__Source__Group_2__1__Impl"
    // InternalDSL.g:1438:1: rule__Source__Group_2__1__Impl : ( ( rule__Source__LocationAssignment_2_1 ) ) ;
    public final void rule__Source__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1442:1: ( ( ( rule__Source__LocationAssignment_2_1 ) ) )
            // InternalDSL.g:1443:1: ( ( rule__Source__LocationAssignment_2_1 ) )
            {
            // InternalDSL.g:1443:1: ( ( rule__Source__LocationAssignment_2_1 ) )
            // InternalDSL.g:1444:2: ( rule__Source__LocationAssignment_2_1 )
            {
             before(grammarAccess.getSourceAccess().getLocationAssignment_2_1()); 
            // InternalDSL.g:1445:2: ( rule__Source__LocationAssignment_2_1 )
            // InternalDSL.g:1445:3: rule__Source__LocationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__LocationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getLocationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_2__1__Impl"


    // $ANTLR start "rule__Source__Group_4__0"
    // InternalDSL.g:1454:1: rule__Source__Group_4__0 : rule__Source__Group_4__0__Impl rule__Source__Group_4__1 ;
    public final void rule__Source__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1458:1: ( rule__Source__Group_4__0__Impl rule__Source__Group_4__1 )
            // InternalDSL.g:1459:2: rule__Source__Group_4__0__Impl rule__Source__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Source__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_4__1();

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
    // $ANTLR end "rule__Source__Group_4__0"


    // $ANTLR start "rule__Source__Group_4__0__Impl"
    // InternalDSL.g:1466:1: rule__Source__Group_4__0__Impl : ( ( rule__Source__ConcernsAssignment_4_0 ) ) ;
    public final void rule__Source__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1470:1: ( ( ( rule__Source__ConcernsAssignment_4_0 ) ) )
            // InternalDSL.g:1471:1: ( ( rule__Source__ConcernsAssignment_4_0 ) )
            {
            // InternalDSL.g:1471:1: ( ( rule__Source__ConcernsAssignment_4_0 ) )
            // InternalDSL.g:1472:2: ( rule__Source__ConcernsAssignment_4_0 )
            {
             before(grammarAccess.getSourceAccess().getConcernsAssignment_4_0()); 
            // InternalDSL.g:1473:2: ( rule__Source__ConcernsAssignment_4_0 )
            // InternalDSL.g:1473:3: rule__Source__ConcernsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Source__ConcernsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getConcernsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_4__0__Impl"


    // $ANTLR start "rule__Source__Group_4__1"
    // InternalDSL.g:1481:1: rule__Source__Group_4__1 : rule__Source__Group_4__1__Impl ;
    public final void rule__Source__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1485:1: ( rule__Source__Group_4__1__Impl )
            // InternalDSL.g:1486:2: rule__Source__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_4__1__Impl();

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
    // $ANTLR end "rule__Source__Group_4__1"


    // $ANTLR start "rule__Source__Group_4__1__Impl"
    // InternalDSL.g:1492:1: rule__Source__Group_4__1__Impl : ( ( rule__Source__Group_4_1__0 )* ) ;
    public final void rule__Source__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1496:1: ( ( ( rule__Source__Group_4_1__0 )* ) )
            // InternalDSL.g:1497:1: ( ( rule__Source__Group_4_1__0 )* )
            {
            // InternalDSL.g:1497:1: ( ( rule__Source__Group_4_1__0 )* )
            // InternalDSL.g:1498:2: ( rule__Source__Group_4_1__0 )*
            {
             before(grammarAccess.getSourceAccess().getGroup_4_1()); 
            // InternalDSL.g:1499:2: ( rule__Source__Group_4_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDSL.g:1499:3: rule__Source__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Source__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSourceAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_4__1__Impl"


    // $ANTLR start "rule__Source__Group_4_1__0"
    // InternalDSL.g:1508:1: rule__Source__Group_4_1__0 : rule__Source__Group_4_1__0__Impl rule__Source__Group_4_1__1 ;
    public final void rule__Source__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1512:1: ( rule__Source__Group_4_1__0__Impl rule__Source__Group_4_1__1 )
            // InternalDSL.g:1513:2: rule__Source__Group_4_1__0__Impl rule__Source__Group_4_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Source__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_4_1__1();

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
    // $ANTLR end "rule__Source__Group_4_1__0"


    // $ANTLR start "rule__Source__Group_4_1__0__Impl"
    // InternalDSL.g:1520:1: rule__Source__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Source__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1524:1: ( ( ',' ) )
            // InternalDSL.g:1525:1: ( ',' )
            {
            // InternalDSL.g:1525:1: ( ',' )
            // InternalDSL.g:1526:2: ','
            {
             before(grammarAccess.getSourceAccess().getCommaKeyword_4_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_4_1__0__Impl"


    // $ANTLR start "rule__Source__Group_4_1__1"
    // InternalDSL.g:1535:1: rule__Source__Group_4_1__1 : rule__Source__Group_4_1__1__Impl ;
    public final void rule__Source__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1539:1: ( rule__Source__Group_4_1__1__Impl )
            // InternalDSL.g:1540:2: rule__Source__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Source__Group_4_1__1"


    // $ANTLR start "rule__Source__Group_4_1__1__Impl"
    // InternalDSL.g:1546:1: rule__Source__Group_4_1__1__Impl : ( ( rule__Source__ConcernsAssignment_4_1_1 ) ) ;
    public final void rule__Source__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1550:1: ( ( ( rule__Source__ConcernsAssignment_4_1_1 ) ) )
            // InternalDSL.g:1551:1: ( ( rule__Source__ConcernsAssignment_4_1_1 ) )
            {
            // InternalDSL.g:1551:1: ( ( rule__Source__ConcernsAssignment_4_1_1 ) )
            // InternalDSL.g:1552:2: ( rule__Source__ConcernsAssignment_4_1_1 )
            {
             before(grammarAccess.getSourceAccess().getConcernsAssignment_4_1_1()); 
            // InternalDSL.g:1553:2: ( rule__Source__ConcernsAssignment_4_1_1 )
            // InternalDSL.g:1553:3: rule__Source__ConcernsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__ConcernsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getConcernsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_4_1__1__Impl"


    // $ANTLR start "rule__Window__Group__0"
    // InternalDSL.g:1562:1: rule__Window__Group__0 : rule__Window__Group__0__Impl rule__Window__Group__1 ;
    public final void rule__Window__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1566:1: ( rule__Window__Group__0__Impl rule__Window__Group__1 )
            // InternalDSL.g:1567:2: rule__Window__Group__0__Impl rule__Window__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Window__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__1();

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
    // $ANTLR end "rule__Window__Group__0"


    // $ANTLR start "rule__Window__Group__0__Impl"
    // InternalDSL.g:1574:1: rule__Window__Group__0__Impl : ( 'view' ) ;
    public final void rule__Window__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1578:1: ( ( 'view' ) )
            // InternalDSL.g:1579:1: ( 'view' )
            {
            // InternalDSL.g:1579:1: ( 'view' )
            // InternalDSL.g:1580:2: 'view'
            {
             before(grammarAccess.getWindowAccess().getViewKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getViewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__0__Impl"


    // $ANTLR start "rule__Window__Group__1"
    // InternalDSL.g:1589:1: rule__Window__Group__1 : rule__Window__Group__1__Impl rule__Window__Group__2 ;
    public final void rule__Window__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1593:1: ( rule__Window__Group__1__Impl rule__Window__Group__2 )
            // InternalDSL.g:1594:2: rule__Window__Group__1__Impl rule__Window__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Window__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__2();

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
    // $ANTLR end "rule__Window__Group__1"


    // $ANTLR start "rule__Window__Group__1__Impl"
    // InternalDSL.g:1601:1: rule__Window__Group__1__Impl : ( ( rule__Window__NameAssignment_1 ) ) ;
    public final void rule__Window__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1605:1: ( ( ( rule__Window__NameAssignment_1 ) ) )
            // InternalDSL.g:1606:1: ( ( rule__Window__NameAssignment_1 ) )
            {
            // InternalDSL.g:1606:1: ( ( rule__Window__NameAssignment_1 ) )
            // InternalDSL.g:1607:2: ( rule__Window__NameAssignment_1 )
            {
             before(grammarAccess.getWindowAccess().getNameAssignment_1()); 
            // InternalDSL.g:1608:2: ( rule__Window__NameAssignment_1 )
            // InternalDSL.g:1608:3: rule__Window__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Window__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__1__Impl"


    // $ANTLR start "rule__Window__Group__2"
    // InternalDSL.g:1616:1: rule__Window__Group__2 : rule__Window__Group__2__Impl rule__Window__Group__3 ;
    public final void rule__Window__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1620:1: ( rule__Window__Group__2__Impl rule__Window__Group__3 )
            // InternalDSL.g:1621:2: rule__Window__Group__2__Impl rule__Window__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Window__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__3();

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
    // $ANTLR end "rule__Window__Group__2"


    // $ANTLR start "rule__Window__Group__2__Impl"
    // InternalDSL.g:1628:1: rule__Window__Group__2__Impl : ( ':' ) ;
    public final void rule__Window__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1632:1: ( ( ':' ) )
            // InternalDSL.g:1633:1: ( ':' )
            {
            // InternalDSL.g:1633:1: ( ':' )
            // InternalDSL.g:1634:2: ':'
            {
             before(grammarAccess.getWindowAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__2__Impl"


    // $ANTLR start "rule__Window__Group__3"
    // InternalDSL.g:1643:1: rule__Window__Group__3 : rule__Window__Group__3__Impl rule__Window__Group__4 ;
    public final void rule__Window__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1647:1: ( rule__Window__Group__3__Impl rule__Window__Group__4 )
            // InternalDSL.g:1648:2: rule__Window__Group__3__Impl rule__Window__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Window__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__4();

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
    // $ANTLR end "rule__Window__Group__3"


    // $ANTLR start "rule__Window__Group__3__Impl"
    // InternalDSL.g:1655:1: rule__Window__Group__3__Impl : ( ( rule__Window__OrganizesAssignment_3 ) ) ;
    public final void rule__Window__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1659:1: ( ( ( rule__Window__OrganizesAssignment_3 ) ) )
            // InternalDSL.g:1660:1: ( ( rule__Window__OrganizesAssignment_3 ) )
            {
            // InternalDSL.g:1660:1: ( ( rule__Window__OrganizesAssignment_3 ) )
            // InternalDSL.g:1661:2: ( rule__Window__OrganizesAssignment_3 )
            {
             before(grammarAccess.getWindowAccess().getOrganizesAssignment_3()); 
            // InternalDSL.g:1662:2: ( rule__Window__OrganizesAssignment_3 )
            // InternalDSL.g:1662:3: rule__Window__OrganizesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Window__OrganizesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getOrganizesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__3__Impl"


    // $ANTLR start "rule__Window__Group__4"
    // InternalDSL.g:1670:1: rule__Window__Group__4 : rule__Window__Group__4__Impl ;
    public final void rule__Window__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1674:1: ( rule__Window__Group__4__Impl )
            // InternalDSL.g:1675:2: rule__Window__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group__4__Impl();

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
    // $ANTLR end "rule__Window__Group__4"


    // $ANTLR start "rule__Window__Group__4__Impl"
    // InternalDSL.g:1681:1: rule__Window__Group__4__Impl : ( ( rule__Window__Group_4__0 )* ) ;
    public final void rule__Window__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1685:1: ( ( ( rule__Window__Group_4__0 )* ) )
            // InternalDSL.g:1686:1: ( ( rule__Window__Group_4__0 )* )
            {
            // InternalDSL.g:1686:1: ( ( rule__Window__Group_4__0 )* )
            // InternalDSL.g:1687:2: ( rule__Window__Group_4__0 )*
            {
             before(grammarAccess.getWindowAccess().getGroup_4()); 
            // InternalDSL.g:1688:2: ( rule__Window__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==38) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:1688:3: rule__Window__Group_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Window__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getWindowAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__4__Impl"


    // $ANTLR start "rule__Window__Group_4__0"
    // InternalDSL.g:1697:1: rule__Window__Group_4__0 : rule__Window__Group_4__0__Impl rule__Window__Group_4__1 ;
    public final void rule__Window__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1701:1: ( rule__Window__Group_4__0__Impl rule__Window__Group_4__1 )
            // InternalDSL.g:1702:2: rule__Window__Group_4__0__Impl rule__Window__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Window__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_4__1();

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
    // $ANTLR end "rule__Window__Group_4__0"


    // $ANTLR start "rule__Window__Group_4__0__Impl"
    // InternalDSL.g:1709:1: rule__Window__Group_4__0__Impl : ( ' | ' ) ;
    public final void rule__Window__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1713:1: ( ( ' | ' ) )
            // InternalDSL.g:1714:1: ( ' | ' )
            {
            // InternalDSL.g:1714:1: ( ' | ' )
            // InternalDSL.g:1715:2: ' | '
            {
             before(grammarAccess.getWindowAccess().getSpaceSpaceSpaceVerticalLineSpaceSpaceSpaceKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getSpaceSpaceSpaceVerticalLineSpaceSpaceSpaceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_4__0__Impl"


    // $ANTLR start "rule__Window__Group_4__1"
    // InternalDSL.g:1724:1: rule__Window__Group_4__1 : rule__Window__Group_4__1__Impl ;
    public final void rule__Window__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1728:1: ( rule__Window__Group_4__1__Impl )
            // InternalDSL.g:1729:2: rule__Window__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group_4__1__Impl();

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
    // $ANTLR end "rule__Window__Group_4__1"


    // $ANTLR start "rule__Window__Group_4__1__Impl"
    // InternalDSL.g:1735:1: rule__Window__Group_4__1__Impl : ( ( rule__Window__OrganizesAssignment_4_1 ) ) ;
    public final void rule__Window__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1739:1: ( ( ( rule__Window__OrganizesAssignment_4_1 ) ) )
            // InternalDSL.g:1740:1: ( ( rule__Window__OrganizesAssignment_4_1 ) )
            {
            // InternalDSL.g:1740:1: ( ( rule__Window__OrganizesAssignment_4_1 ) )
            // InternalDSL.g:1741:2: ( rule__Window__OrganizesAssignment_4_1 )
            {
             before(grammarAccess.getWindowAccess().getOrganizesAssignment_4_1()); 
            // InternalDSL.g:1742:2: ( rule__Window__OrganizesAssignment_4_1 )
            // InternalDSL.g:1742:3: rule__Window__OrganizesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Window__OrganizesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getOrganizesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_4__1__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalDSL.g:1751:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1755:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalDSL.g:1756:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalDSL.g:1763:1: rule__Container__Group__0__Impl : ( ( rule__Container__Alternatives_0 ) ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1767:1: ( ( ( rule__Container__Alternatives_0 ) ) )
            // InternalDSL.g:1768:1: ( ( rule__Container__Alternatives_0 ) )
            {
            // InternalDSL.g:1768:1: ( ( rule__Container__Alternatives_0 ) )
            // InternalDSL.g:1769:2: ( rule__Container__Alternatives_0 )
            {
             before(grammarAccess.getContainerAccess().getAlternatives_0()); 
            // InternalDSL.g:1770:2: ( rule__Container__Alternatives_0 )
            // InternalDSL.g:1770:3: rule__Container__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalDSL.g:1778:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1782:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalDSL.g:1783:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalDSL.g:1790:1: rule__Container__Group__1__Impl : ( ( rule__Container__Group_1__0 )? ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1794:1: ( ( ( rule__Container__Group_1__0 )? ) )
            // InternalDSL.g:1795:1: ( ( rule__Container__Group_1__0 )? )
            {
            // InternalDSL.g:1795:1: ( ( rule__Container__Group_1__0 )? )
            // InternalDSL.g:1796:2: ( rule__Container__Group_1__0 )?
            {
             before(grammarAccess.getContainerAccess().getGroup_1()); 
            // InternalDSL.g:1797:2: ( rule__Container__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDSL.g:1797:3: rule__Container__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalDSL.g:1805:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1809:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalDSL.g:1810:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalDSL.g:1817:1: rule__Container__Group__2__Impl : ( ': [' ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1821:1: ( ( ': [' ) )
            // InternalDSL.g:1822:1: ( ': [' )
            {
            // InternalDSL.g:1822:1: ( ': [' )
            // InternalDSL.g:1823:2: ': ['
            {
             before(grammarAccess.getContainerAccess().getColonSpaceLeftSquareBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getColonSpaceLeftSquareBracketKeyword_2()); 

            }


            }

        }
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
    // InternalDSL.g:1832:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1836:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // InternalDSL.g:1837:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__4();

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
    // InternalDSL.g:1844:1: rule__Container__Group__3__Impl : ( ( rule__Container__ContainsAssignment_3 ) ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1848:1: ( ( ( rule__Container__ContainsAssignment_3 ) ) )
            // InternalDSL.g:1849:1: ( ( rule__Container__ContainsAssignment_3 ) )
            {
            // InternalDSL.g:1849:1: ( ( rule__Container__ContainsAssignment_3 ) )
            // InternalDSL.g:1850:2: ( rule__Container__ContainsAssignment_3 )
            {
             before(grammarAccess.getContainerAccess().getContainsAssignment_3()); 
            // InternalDSL.g:1851:2: ( rule__Container__ContainsAssignment_3 )
            // InternalDSL.g:1851:3: rule__Container__ContainsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Container__ContainsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getContainsAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Container__Group__4"
    // InternalDSL.g:1859:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1863:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // InternalDSL.g:1864:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__5();

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
    // $ANTLR end "rule__Container__Group__4"


    // $ANTLR start "rule__Container__Group__4__Impl"
    // InternalDSL.g:1871:1: rule__Container__Group__4__Impl : ( ( rule__Container__Group_4__0 )* ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1875:1: ( ( ( rule__Container__Group_4__0 )* ) )
            // InternalDSL.g:1876:1: ( ( rule__Container__Group_4__0 )* )
            {
            // InternalDSL.g:1876:1: ( ( rule__Container__Group_4__0 )* )
            // InternalDSL.g:1877:2: ( rule__Container__Group_4__0 )*
            {
             before(grammarAccess.getContainerAccess().getGroup_4()); 
            // InternalDSL.g:1878:2: ( rule__Container__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDSL.g:1878:3: rule__Container__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Container__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__4__Impl"


    // $ANTLR start "rule__Container__Group__5"
    // InternalDSL.g:1886:1: rule__Container__Group__5 : rule__Container__Group__5__Impl ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1890:1: ( rule__Container__Group__5__Impl )
            // InternalDSL.g:1891:2: rule__Container__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__5__Impl();

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
    // $ANTLR end "rule__Container__Group__5"


    // $ANTLR start "rule__Container__Group__5__Impl"
    // InternalDSL.g:1897:1: rule__Container__Group__5__Impl : ( ']' ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1901:1: ( ( ']' ) )
            // InternalDSL.g:1902:1: ( ']' )
            {
            // InternalDSL.g:1902:1: ( ']' )
            // InternalDSL.g:1903:2: ']'
            {
             before(grammarAccess.getContainerAccess().getRightSquareBracketKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__5__Impl"


    // $ANTLR start "rule__Container__Group_0_0__0"
    // InternalDSL.g:1913:1: rule__Container__Group_0_0__0 : rule__Container__Group_0_0__0__Impl rule__Container__Group_0_0__1 ;
    public final void rule__Container__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1917:1: ( rule__Container__Group_0_0__0__Impl rule__Container__Group_0_0__1 )
            // InternalDSL.g:1918:2: rule__Container__Group_0_0__0__Impl rule__Container__Group_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Container__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_0_0__1();

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
    // $ANTLR end "rule__Container__Group_0_0__0"


    // $ANTLR start "rule__Container__Group_0_0__0__Impl"
    // InternalDSL.g:1925:1: rule__Container__Group_0_0__0__Impl : ( 'Column' ) ;
    public final void rule__Container__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1929:1: ( ( 'Column' ) )
            // InternalDSL.g:1930:1: ( 'Column' )
            {
            // InternalDSL.g:1930:1: ( 'Column' )
            // InternalDSL.g:1931:2: 'Column'
            {
             before(grammarAccess.getContainerAccess().getColumnKeyword_0_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getColumnKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_0_0__0__Impl"


    // $ANTLR start "rule__Container__Group_0_0__1"
    // InternalDSL.g:1940:1: rule__Container__Group_0_0__1 : rule__Container__Group_0_0__1__Impl ;
    public final void rule__Container__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1944:1: ( rule__Container__Group_0_0__1__Impl )
            // InternalDSL.g:1945:2: rule__Container__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_0_0__1__Impl();

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
    // $ANTLR end "rule__Container__Group_0_0__1"


    // $ANTLR start "rule__Container__Group_0_0__1__Impl"
    // InternalDSL.g:1951:1: rule__Container__Group_0_0__1__Impl : ( () ) ;
    public final void rule__Container__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1955:1: ( ( () ) )
            // InternalDSL.g:1956:1: ( () )
            {
            // InternalDSL.g:1956:1: ( () )
            // InternalDSL.g:1957:2: ()
            {
             before(grammarAccess.getContainerAccess().getColumnAction_0_0_1()); 
            // InternalDSL.g:1958:2: ()
            // InternalDSL.g:1958:3: 
            {
            }

             after(grammarAccess.getContainerAccess().getColumnAction_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_0_0__1__Impl"


    // $ANTLR start "rule__Container__Group_0_1__0"
    // InternalDSL.g:1967:1: rule__Container__Group_0_1__0 : rule__Container__Group_0_1__0__Impl rule__Container__Group_0_1__1 ;
    public final void rule__Container__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1971:1: ( rule__Container__Group_0_1__0__Impl rule__Container__Group_0_1__1 )
            // InternalDSL.g:1972:2: rule__Container__Group_0_1__0__Impl rule__Container__Group_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Container__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_0_1__1();

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
    // $ANTLR end "rule__Container__Group_0_1__0"


    // $ANTLR start "rule__Container__Group_0_1__0__Impl"
    // InternalDSL.g:1979:1: rule__Container__Group_0_1__0__Impl : ( 'Line' ) ;
    public final void rule__Container__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1983:1: ( ( 'Line' ) )
            // InternalDSL.g:1984:1: ( 'Line' )
            {
            // InternalDSL.g:1984:1: ( 'Line' )
            // InternalDSL.g:1985:2: 'Line'
            {
             before(grammarAccess.getContainerAccess().getLineKeyword_0_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLineKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_0_1__0__Impl"


    // $ANTLR start "rule__Container__Group_0_1__1"
    // InternalDSL.g:1994:1: rule__Container__Group_0_1__1 : rule__Container__Group_0_1__1__Impl ;
    public final void rule__Container__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1998:1: ( rule__Container__Group_0_1__1__Impl )
            // InternalDSL.g:1999:2: rule__Container__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__Container__Group_0_1__1"


    // $ANTLR start "rule__Container__Group_0_1__1__Impl"
    // InternalDSL.g:2005:1: rule__Container__Group_0_1__1__Impl : ( () ) ;
    public final void rule__Container__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2009:1: ( ( () ) )
            // InternalDSL.g:2010:1: ( () )
            {
            // InternalDSL.g:2010:1: ( () )
            // InternalDSL.g:2011:2: ()
            {
             before(grammarAccess.getContainerAccess().getLineAction_0_1_1()); 
            // InternalDSL.g:2012:2: ()
            // InternalDSL.g:2012:3: 
            {
            }

             after(grammarAccess.getContainerAccess().getLineAction_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_0_1__1__Impl"


    // $ANTLR start "rule__Container__Group_1__0"
    // InternalDSL.g:2021:1: rule__Container__Group_1__0 : rule__Container__Group_1__0__Impl rule__Container__Group_1__1 ;
    public final void rule__Container__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2025:1: ( rule__Container__Group_1__0__Impl rule__Container__Group_1__1 )
            // InternalDSL.g:2026:2: rule__Container__Group_1__0__Impl rule__Container__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Container__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_1__1();

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
    // $ANTLR end "rule__Container__Group_1__0"


    // $ANTLR start "rule__Container__Group_1__0__Impl"
    // InternalDSL.g:2033:1: rule__Container__Group_1__0__Impl : ( 'sized' ) ;
    public final void rule__Container__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2037:1: ( ( 'sized' ) )
            // InternalDSL.g:2038:1: ( 'sized' )
            {
            // InternalDSL.g:2038:1: ( 'sized' )
            // InternalDSL.g:2039:2: 'sized'
            {
             before(grammarAccess.getContainerAccess().getSizedKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getSizedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_1__0__Impl"


    // $ANTLR start "rule__Container__Group_1__1"
    // InternalDSL.g:2048:1: rule__Container__Group_1__1 : rule__Container__Group_1__1__Impl ;
    public final void rule__Container__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2052:1: ( rule__Container__Group_1__1__Impl )
            // InternalDSL.g:2053:2: rule__Container__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_1__1__Impl();

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
    // $ANTLR end "rule__Container__Group_1__1"


    // $ANTLR start "rule__Container__Group_1__1__Impl"
    // InternalDSL.g:2059:1: rule__Container__Group_1__1__Impl : ( ( rule__Container__PonderationAssignment_1_1 ) ) ;
    public final void rule__Container__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2063:1: ( ( ( rule__Container__PonderationAssignment_1_1 ) ) )
            // InternalDSL.g:2064:1: ( ( rule__Container__PonderationAssignment_1_1 ) )
            {
            // InternalDSL.g:2064:1: ( ( rule__Container__PonderationAssignment_1_1 ) )
            // InternalDSL.g:2065:2: ( rule__Container__PonderationAssignment_1_1 )
            {
             before(grammarAccess.getContainerAccess().getPonderationAssignment_1_1()); 
            // InternalDSL.g:2066:2: ( rule__Container__PonderationAssignment_1_1 )
            // InternalDSL.g:2066:3: rule__Container__PonderationAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__PonderationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getPonderationAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_1__1__Impl"


    // $ANTLR start "rule__Container__Group_4__0"
    // InternalDSL.g:2075:1: rule__Container__Group_4__0 : rule__Container__Group_4__0__Impl rule__Container__Group_4__1 ;
    public final void rule__Container__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2079:1: ( rule__Container__Group_4__0__Impl rule__Container__Group_4__1 )
            // InternalDSL.g:2080:2: rule__Container__Group_4__0__Impl rule__Container__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__Container__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_4__1();

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
    // $ANTLR end "rule__Container__Group_4__0"


    // $ANTLR start "rule__Container__Group_4__0__Impl"
    // InternalDSL.g:2087:1: rule__Container__Group_4__0__Impl : ( ';' ) ;
    public final void rule__Container__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2091:1: ( ( ';' ) )
            // InternalDSL.g:2092:1: ( ';' )
            {
            // InternalDSL.g:2092:1: ( ';' )
            // InternalDSL.g:2093:2: ';'
            {
             before(grammarAccess.getContainerAccess().getSemicolonKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getSemicolonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4__0__Impl"


    // $ANTLR start "rule__Container__Group_4__1"
    // InternalDSL.g:2102:1: rule__Container__Group_4__1 : rule__Container__Group_4__1__Impl ;
    public final void rule__Container__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2106:1: ( rule__Container__Group_4__1__Impl )
            // InternalDSL.g:2107:2: rule__Container__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_4__1__Impl();

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
    // $ANTLR end "rule__Container__Group_4__1"


    // $ANTLR start "rule__Container__Group_4__1__Impl"
    // InternalDSL.g:2113:1: rule__Container__Group_4__1__Impl : ( ( rule__Container__ContainsAssignment_4_1 ) ) ;
    public final void rule__Container__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2117:1: ( ( ( rule__Container__ContainsAssignment_4_1 ) ) )
            // InternalDSL.g:2118:1: ( ( rule__Container__ContainsAssignment_4_1 ) )
            {
            // InternalDSL.g:2118:1: ( ( rule__Container__ContainsAssignment_4_1 ) )
            // InternalDSL.g:2119:2: ( rule__Container__ContainsAssignment_4_1 )
            {
             before(grammarAccess.getContainerAccess().getContainsAssignment_4_1()); 
            // InternalDSL.g:2120:2: ( rule__Container__ContainsAssignment_4_1 )
            // InternalDSL.g:2120:3: rule__Container__ContainsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__ContainsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getContainsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4__1__Impl"


    // $ANTLR start "rule__Icon__Group__0"
    // InternalDSL.g:2129:1: rule__Icon__Group__0 : rule__Icon__Group__0__Impl rule__Icon__Group__1 ;
    public final void rule__Icon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2133:1: ( rule__Icon__Group__0__Impl rule__Icon__Group__1 )
            // InternalDSL.g:2134:2: rule__Icon__Group__0__Impl rule__Icon__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Icon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Icon__Group__1();

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
    // $ANTLR end "rule__Icon__Group__0"


    // $ANTLR start "rule__Icon__Group__0__Impl"
    // InternalDSL.g:2141:1: rule__Icon__Group__0__Impl : ( () ) ;
    public final void rule__Icon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2145:1: ( ( () ) )
            // InternalDSL.g:2146:1: ( () )
            {
            // InternalDSL.g:2146:1: ( () )
            // InternalDSL.g:2147:2: ()
            {
             before(grammarAccess.getIconAccess().getIconAction_0()); 
            // InternalDSL.g:2148:2: ()
            // InternalDSL.g:2148:3: 
            {
            }

             after(grammarAccess.getIconAccess().getIconAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group__0__Impl"


    // $ANTLR start "rule__Icon__Group__1"
    // InternalDSL.g:2156:1: rule__Icon__Group__1 : rule__Icon__Group__1__Impl ;
    public final void rule__Icon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2160:1: ( rule__Icon__Group__1__Impl )
            // InternalDSL.g:2161:2: rule__Icon__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Icon__Group__1__Impl();

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
    // $ANTLR end "rule__Icon__Group__1"


    // $ANTLR start "rule__Icon__Group__1__Impl"
    // InternalDSL.g:2167:1: rule__Icon__Group__1__Impl : ( 'Icon' ) ;
    public final void rule__Icon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2171:1: ( ( 'Icon' ) )
            // InternalDSL.g:2172:1: ( 'Icon' )
            {
            // InternalDSL.g:2172:1: ( 'Icon' )
            // InternalDSL.g:2173:2: 'Icon'
            {
             before(grammarAccess.getIconAccess().getIconKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getIconAccess().getIconKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Icon__Group__1__Impl"


    // $ANTLR start "rule__Colorization__Group__0"
    // InternalDSL.g:2183:1: rule__Colorization__Group__0 : rule__Colorization__Group__0__Impl rule__Colorization__Group__1 ;
    public final void rule__Colorization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2187:1: ( rule__Colorization__Group__0__Impl rule__Colorization__Group__1 )
            // InternalDSL.g:2188:2: rule__Colorization__Group__0__Impl rule__Colorization__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Colorization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colorization__Group__1();

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
    // $ANTLR end "rule__Colorization__Group__0"


    // $ANTLR start "rule__Colorization__Group__0__Impl"
    // InternalDSL.g:2195:1: rule__Colorization__Group__0__Impl : ( () ) ;
    public final void rule__Colorization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2199:1: ( ( () ) )
            // InternalDSL.g:2200:1: ( () )
            {
            // InternalDSL.g:2200:1: ( () )
            // InternalDSL.g:2201:2: ()
            {
             before(grammarAccess.getColorizationAccess().getColorizationAction_0()); 
            // InternalDSL.g:2202:2: ()
            // InternalDSL.g:2202:3: 
            {
            }

             after(grammarAccess.getColorizationAccess().getColorizationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colorization__Group__0__Impl"


    // $ANTLR start "rule__Colorization__Group__1"
    // InternalDSL.g:2210:1: rule__Colorization__Group__1 : rule__Colorization__Group__1__Impl rule__Colorization__Group__2 ;
    public final void rule__Colorization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2214:1: ( rule__Colorization__Group__1__Impl rule__Colorization__Group__2 )
            // InternalDSL.g:2215:2: rule__Colorization__Group__1__Impl rule__Colorization__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Colorization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colorization__Group__2();

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
    // $ANTLR end "rule__Colorization__Group__1"


    // $ANTLR start "rule__Colorization__Group__1__Impl"
    // InternalDSL.g:2222:1: rule__Colorization__Group__1__Impl : ( 'Color' ) ;
    public final void rule__Colorization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2226:1: ( ( 'Color' ) )
            // InternalDSL.g:2227:1: ( 'Color' )
            {
            // InternalDSL.g:2227:1: ( 'Color' )
            // InternalDSL.g:2228:2: 'Color'
            {
             before(grammarAccess.getColorizationAccess().getColorKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getColorizationAccess().getColorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colorization__Group__1__Impl"


    // $ANTLR start "rule__Colorization__Group__2"
    // InternalDSL.g:2237:1: rule__Colorization__Group__2 : rule__Colorization__Group__2__Impl ;
    public final void rule__Colorization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2241:1: ( rule__Colorization__Group__2__Impl )
            // InternalDSL.g:2242:2: rule__Colorization__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Colorization__Group__2__Impl();

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
    // $ANTLR end "rule__Colorization__Group__2"


    // $ANTLR start "rule__Colorization__Group__2__Impl"
    // InternalDSL.g:2248:1: rule__Colorization__Group__2__Impl : ( ( rule__Colorization__ColorAssignment_2 ) ) ;
    public final void rule__Colorization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2252:1: ( ( ( rule__Colorization__ColorAssignment_2 ) ) )
            // InternalDSL.g:2253:1: ( ( rule__Colorization__ColorAssignment_2 ) )
            {
            // InternalDSL.g:2253:1: ( ( rule__Colorization__ColorAssignment_2 ) )
            // InternalDSL.g:2254:2: ( rule__Colorization__ColorAssignment_2 )
            {
             before(grammarAccess.getColorizationAccess().getColorAssignment_2()); 
            // InternalDSL.g:2255:2: ( rule__Colorization__ColorAssignment_2 )
            // InternalDSL.g:2255:3: rule__Colorization__ColorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Colorization__ColorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColorizationAccess().getColorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colorization__Group__2__Impl"


    // $ANTLR start "rule__Threshold__Group__0"
    // InternalDSL.g:2264:1: rule__Threshold__Group__0 : rule__Threshold__Group__0__Impl rule__Threshold__Group__1 ;
    public final void rule__Threshold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2268:1: ( rule__Threshold__Group__0__Impl rule__Threshold__Group__1 )
            // InternalDSL.g:2269:2: rule__Threshold__Group__0__Impl rule__Threshold__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Threshold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Threshold__Group__1();

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
    // $ANTLR end "rule__Threshold__Group__0"


    // $ANTLR start "rule__Threshold__Group__0__Impl"
    // InternalDSL.g:2276:1: rule__Threshold__Group__0__Impl : ( () ) ;
    public final void rule__Threshold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2280:1: ( ( () ) )
            // InternalDSL.g:2281:1: ( () )
            {
            // InternalDSL.g:2281:1: ( () )
            // InternalDSL.g:2282:2: ()
            {
             before(grammarAccess.getThresholdAccess().getThresholdAction_0()); 
            // InternalDSL.g:2283:2: ()
            // InternalDSL.g:2283:3: 
            {
            }

             after(grammarAccess.getThresholdAccess().getThresholdAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threshold__Group__0__Impl"


    // $ANTLR start "rule__Threshold__Group__1"
    // InternalDSL.g:2291:1: rule__Threshold__Group__1 : rule__Threshold__Group__1__Impl rule__Threshold__Group__2 ;
    public final void rule__Threshold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2295:1: ( rule__Threshold__Group__1__Impl rule__Threshold__Group__2 )
            // InternalDSL.g:2296:2: rule__Threshold__Group__1__Impl rule__Threshold__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Threshold__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Threshold__Group__2();

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
    // $ANTLR end "rule__Threshold__Group__1"


    // $ANTLR start "rule__Threshold__Group__1__Impl"
    // InternalDSL.g:2303:1: rule__Threshold__Group__1__Impl : ( 'Threshold (' ) ;
    public final void rule__Threshold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2307:1: ( ( 'Threshold (' ) )
            // InternalDSL.g:2308:1: ( 'Threshold (' )
            {
            // InternalDSL.g:2308:1: ( 'Threshold (' )
            // InternalDSL.g:2309:2: 'Threshold ('
            {
             before(grammarAccess.getThresholdAccess().getThresholdKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getThresholdAccess().getThresholdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threshold__Group__1__Impl"


    // $ANTLR start "rule__Threshold__Group__2"
    // InternalDSL.g:2318:1: rule__Threshold__Group__2 : rule__Threshold__Group__2__Impl rule__Threshold__Group__3 ;
    public final void rule__Threshold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2322:1: ( rule__Threshold__Group__2__Impl rule__Threshold__Group__3 )
            // InternalDSL.g:2323:2: rule__Threshold__Group__2__Impl rule__Threshold__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Threshold__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Threshold__Group__3();

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
    // $ANTLR end "rule__Threshold__Group__2"


    // $ANTLR start "rule__Threshold__Group__2__Impl"
    // InternalDSL.g:2330:1: rule__Threshold__Group__2__Impl : ( ( rule__Threshold__Group_2__0 )? ) ;
    public final void rule__Threshold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2334:1: ( ( ( rule__Threshold__Group_2__0 )? ) )
            // InternalDSL.g:2335:1: ( ( rule__Threshold__Group_2__0 )? )
            {
            // InternalDSL.g:2335:1: ( ( rule__Threshold__Group_2__0 )? )
            // InternalDSL.g:2336:2: ( rule__Threshold__Group_2__0 )?
            {
             before(grammarAccess.getThresholdAccess().getGroup_2()); 
            // InternalDSL.g:2337:2: ( rule__Threshold__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==48) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDSL.g:2337:3: rule__Threshold__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Threshold__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThresholdAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threshold__Group__2__Impl"


    // $ANTLR start "rule__Threshold__Group__3"
    // InternalDSL.g:2345:1: rule__Threshold__Group__3 : rule__Threshold__Group__3__Impl rule__Threshold__Group__4 ;
    public final void rule__Threshold__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2349:1: ( rule__Threshold__Group__3__Impl rule__Threshold__Group__4 )
            // InternalDSL.g:2350:2: rule__Threshold__Group__3__Impl rule__Threshold__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Threshold__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Threshold__Group__4();

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
    // $ANTLR end "rule__Threshold__Group__3"


    // $ANTLR start "rule__Threshold__Group__3__Impl"
    // InternalDSL.g:2357:1: rule__Threshold__Group__3__Impl : ( ( rule__Threshold__Group_3__0 )? ) ;
    public final void rule__Threshold__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2361:1: ( ( ( rule__Threshold__Group_3__0 )? ) )
            // InternalDSL.g:2362:1: ( ( rule__Threshold__Group_3__0 )? )
            {
            // InternalDSL.g:2362:1: ( ( rule__Threshold__Group_3__0 )? )
            // InternalDSL.g:2363:2: ( rule__Threshold__Group_3__0 )?
            {
             before(grammarAccess.getThresholdAccess().getGroup_3()); 
            // InternalDSL.g:2364:2: ( rule__Threshold__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==49) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDSL.g:2364:3: rule__Threshold__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Threshold__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThresholdAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threshold__Group__3__Impl"


    // $ANTLR start "rule__Threshold__Group__4"
    // InternalDSL.g:2372:1: rule__Threshold__Group__4 : rule__Threshold__Group__4__Impl ;
    public final void rule__Threshold__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2376:1: ( rule__Threshold__Group__4__Impl )
            // InternalDSL.g:2377:2: rule__Threshold__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Threshold__Group__4__Impl();

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
    // $ANTLR end "rule__Threshold__Group__4"


    // $ANTLR start "rule__Threshold__Group__4__Impl"
    // InternalDSL.g:2383:1: rule__Threshold__Group__4__Impl : ( ')' ) ;
    public final void rule__Threshold__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2387:1: ( ( ')' ) )
            // InternalDSL.g:2388:1: ( ')' )
            {
            // InternalDSL.g:2388:1: ( ')' )
            // InternalDSL.g:2389:2: ')'
            {
             before(grammarAccess.getThresholdAccess().getRightParenthesisKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getThresholdAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threshold__Group__4__Impl"


    // $ANTLR start "rule__Threshold__Group_2__0"
    // InternalDSL.g:2399:1: rule__Threshold__Group_2__0 : rule__Threshold__Group_2__0__Impl rule__Threshold__Group_2__1 ;
    public final void rule__Threshold__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2403:1: ( rule__Threshold__Group_2__0__Impl rule__Threshold__Group_2__1 )
            // InternalDSL.g:2404:2: rule__Threshold__Group_2__0__Impl rule__Threshold__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__Threshold__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Threshold__Group_2__1();

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
    // $ANTLR end "rule__Threshold__Group_2__0"


    // $ANTLR start "rule__Threshold__Group_2__0__Impl"
    // InternalDSL.g:2411:1: rule__Threshold__Group_2__0__Impl : ( 'min' ) ;
    public final void rule__Threshold__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2415:1: ( ( 'min' ) )
            // InternalDSL.g:2416:1: ( 'min' )
            {
            // InternalDSL.g:2416:1: ( 'min' )
            // InternalDSL.g:2417:2: 'min'
            {
             before(grammarAccess.getThresholdAccess().getMinKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getThresholdAccess().getMinKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threshold__Group_2__0__Impl"


    // $ANTLR start "rule__Threshold__Group_2__1"
    // InternalDSL.g:2426:1: rule__Threshold__Group_2__1 : rule__Threshold__Group_2__1__Impl ;
    public final void rule__Threshold__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2430:1: ( rule__Threshold__Group_2__1__Impl )
            // InternalDSL.g:2431:2: rule__Threshold__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Threshold__Group_2__1__Impl();

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
    // $ANTLR end "rule__Threshold__Group_2__1"


    // $ANTLR start "rule__Threshold__Group_2__1__Impl"
    // InternalDSL.g:2437:1: rule__Threshold__Group_2__1__Impl : ( ( rule__Threshold__MinAssignment_2_1 ) ) ;
    public final void rule__Threshold__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2441:1: ( ( ( rule__Threshold__MinAssignment_2_1 ) ) )
            // InternalDSL.g:2442:1: ( ( rule__Threshold__MinAssignment_2_1 ) )
            {
            // InternalDSL.g:2442:1: ( ( rule__Threshold__MinAssignment_2_1 ) )
            // InternalDSL.g:2443:2: ( rule__Threshold__MinAssignment_2_1 )
            {
             before(grammarAccess.getThresholdAccess().getMinAssignment_2_1()); 
            // InternalDSL.g:2444:2: ( rule__Threshold__MinAssignment_2_1 )
            // InternalDSL.g:2444:3: rule__Threshold__MinAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Threshold__MinAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getThresholdAccess().getMinAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threshold__Group_2__1__Impl"


    // $ANTLR start "rule__Threshold__Group_3__0"
    // InternalDSL.g:2453:1: rule__Threshold__Group_3__0 : rule__Threshold__Group_3__0__Impl rule__Threshold__Group_3__1 ;
    public final void rule__Threshold__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2457:1: ( rule__Threshold__Group_3__0__Impl rule__Threshold__Group_3__1 )
            // InternalDSL.g:2458:2: rule__Threshold__Group_3__0__Impl rule__Threshold__Group_3__1
            {
            pushFollow(FOLLOW_24);
            rule__Threshold__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Threshold__Group_3__1();

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
    // $ANTLR end "rule__Threshold__Group_3__0"


    // $ANTLR start "rule__Threshold__Group_3__0__Impl"
    // InternalDSL.g:2465:1: rule__Threshold__Group_3__0__Impl : ( 'max' ) ;
    public final void rule__Threshold__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2469:1: ( ( 'max' ) )
            // InternalDSL.g:2470:1: ( 'max' )
            {
            // InternalDSL.g:2470:1: ( 'max' )
            // InternalDSL.g:2471:2: 'max'
            {
             before(grammarAccess.getThresholdAccess().getMaxKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getThresholdAccess().getMaxKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threshold__Group_3__0__Impl"


    // $ANTLR start "rule__Threshold__Group_3__1"
    // InternalDSL.g:2480:1: rule__Threshold__Group_3__1 : rule__Threshold__Group_3__1__Impl ;
    public final void rule__Threshold__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2484:1: ( rule__Threshold__Group_3__1__Impl )
            // InternalDSL.g:2485:2: rule__Threshold__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Threshold__Group_3__1__Impl();

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
    // $ANTLR end "rule__Threshold__Group_3__1"


    // $ANTLR start "rule__Threshold__Group_3__1__Impl"
    // InternalDSL.g:2491:1: rule__Threshold__Group_3__1__Impl : ( ( rule__Threshold__MaxAssignment_3_1 ) ) ;
    public final void rule__Threshold__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2495:1: ( ( ( rule__Threshold__MaxAssignment_3_1 ) ) )
            // InternalDSL.g:2496:1: ( ( rule__Threshold__MaxAssignment_3_1 ) )
            {
            // InternalDSL.g:2496:1: ( ( rule__Threshold__MaxAssignment_3_1 ) )
            // InternalDSL.g:2497:2: ( rule__Threshold__MaxAssignment_3_1 )
            {
             before(grammarAccess.getThresholdAccess().getMaxAssignment_3_1()); 
            // InternalDSL.g:2498:2: ( rule__Threshold__MaxAssignment_3_1 )
            // InternalDSL.g:2498:3: rule__Threshold__MaxAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Threshold__MaxAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getThresholdAccess().getMaxAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threshold__Group_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalDSL.g:2507:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2511:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDSL.g:2512:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDSL.g:2519:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2523:1: ( ( ( '-' )? ) )
            // InternalDSL.g:2524:1: ( ( '-' )? )
            {
            // InternalDSL.g:2524:1: ( ( '-' )? )
            // InternalDSL.g:2525:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDSL.g:2526:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==50) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDSL.g:2526:3: '-'
                    {
                    match(input,50,FOLLOW_2); 

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
    // InternalDSL.g:2534:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2538:1: ( rule__EInt__Group__1__Impl )
            // InternalDSL.g:2539:2: rule__EInt__Group__1__Impl
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
    // InternalDSL.g:2545:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2549:1: ( ( RULE_INT ) )
            // InternalDSL.g:2550:1: ( RULE_INT )
            {
            // InternalDSL.g:2550:1: ( RULE_INT )
            // InternalDSL.g:2551:2: RULE_INT
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


    // $ANTLR start "rule__Dashboard__NameAssignment_1"
    // InternalDSL.g:2561:1: rule__Dashboard__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Dashboard__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2565:1: ( ( ruleEString ) )
            // InternalDSL.g:2566:2: ( ruleEString )
            {
            // InternalDSL.g:2566:2: ( ruleEString )
            // InternalDSL.g:2567:3: ruleEString
            {
             before(grammarAccess.getDashboardAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDashboardAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__NameAssignment_1"


    // $ANTLR start "rule__Dashboard__VisualizationsAssignment_4"
    // InternalDSL.g:2576:1: rule__Dashboard__VisualizationsAssignment_4 : ( ruleVisualization ) ;
    public final void rule__Dashboard__VisualizationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2580:1: ( ( ruleVisualization ) )
            // InternalDSL.g:2581:2: ( ruleVisualization )
            {
            // InternalDSL.g:2581:2: ( ruleVisualization )
            // InternalDSL.g:2582:3: ruleVisualization
            {
             before(grammarAccess.getDashboardAccess().getVisualizationsVisualizationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVisualization();

            state._fsp--;

             after(grammarAccess.getDashboardAccess().getVisualizationsVisualizationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__VisualizationsAssignment_4"


    // $ANTLR start "rule__Dashboard__VisualizationsAssignment_5"
    // InternalDSL.g:2591:1: rule__Dashboard__VisualizationsAssignment_5 : ( ruleVisualization ) ;
    public final void rule__Dashboard__VisualizationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2595:1: ( ( ruleVisualization ) )
            // InternalDSL.g:2596:2: ( ruleVisualization )
            {
            // InternalDSL.g:2596:2: ( ruleVisualization )
            // InternalDSL.g:2597:3: ruleVisualization
            {
             before(grammarAccess.getDashboardAccess().getVisualizationsVisualizationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleVisualization();

            state._fsp--;

             after(grammarAccess.getDashboardAccess().getVisualizationsVisualizationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__VisualizationsAssignment_5"


    // $ANTLR start "rule__Dashboard__WindowsAssignment_7"
    // InternalDSL.g:2606:1: rule__Dashboard__WindowsAssignment_7 : ( ruleWindow ) ;
    public final void rule__Dashboard__WindowsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2610:1: ( ( ruleWindow ) )
            // InternalDSL.g:2611:2: ( ruleWindow )
            {
            // InternalDSL.g:2611:2: ( ruleWindow )
            // InternalDSL.g:2612:3: ruleWindow
            {
             before(grammarAccess.getDashboardAccess().getWindowsWindowParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getDashboardAccess().getWindowsWindowParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__WindowsAssignment_7"


    // $ANTLR start "rule__Dashboard__WindowsAssignment_8"
    // InternalDSL.g:2621:1: rule__Dashboard__WindowsAssignment_8 : ( ruleWindow ) ;
    public final void rule__Dashboard__WindowsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2625:1: ( ( ruleWindow ) )
            // InternalDSL.g:2626:2: ( ruleWindow )
            {
            // InternalDSL.g:2626:2: ( ruleWindow )
            // InternalDSL.g:2627:3: ruleWindow
            {
             before(grammarAccess.getDashboardAccess().getWindowsWindowParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getDashboardAccess().getWindowsWindowParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__WindowsAssignment_8"


    // $ANTLR start "rule__Visualization__NameAssignment_0"
    // InternalDSL.g:2636:1: rule__Visualization__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Visualization__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2640:1: ( ( ruleEString ) )
            // InternalDSL.g:2641:2: ( ruleEString )
            {
            // InternalDSL.g:2641:2: ( ruleEString )
            // InternalDSL.g:2642:3: ruleEString
            {
             before(grammarAccess.getVisualizationAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVisualizationAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__NameAssignment_0"


    // $ANTLR start "rule__Visualization__ConcernsAssignment_1_1"
    // InternalDSL.g:2651:1: rule__Visualization__ConcernsAssignment_1_1 : ( ruleWhatQualifier ) ;
    public final void rule__Visualization__ConcernsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2655:1: ( ( ruleWhatQualifier ) )
            // InternalDSL.g:2656:2: ( ruleWhatQualifier )
            {
            // InternalDSL.g:2656:2: ( ruleWhatQualifier )
            // InternalDSL.g:2657:3: ruleWhatQualifier
            {
             before(grammarAccess.getVisualizationAccess().getConcernsWhatQualifierParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhatQualifier();

            state._fsp--;

             after(grammarAccess.getVisualizationAccess().getConcernsWhatQualifierParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__ConcernsAssignment_1_1"


    // $ANTLR start "rule__Visualization__ConcernsAssignment_1_2_1"
    // InternalDSL.g:2666:1: rule__Visualization__ConcernsAssignment_1_2_1 : ( ruleWhatQualifier ) ;
    public final void rule__Visualization__ConcernsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2670:1: ( ( ruleWhatQualifier ) )
            // InternalDSL.g:2671:2: ( ruleWhatQualifier )
            {
            // InternalDSL.g:2671:2: ( ruleWhatQualifier )
            // InternalDSL.g:2672:3: ruleWhatQualifier
            {
             before(grammarAccess.getVisualizationAccess().getConcernsWhatQualifierParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhatQualifier();

            state._fsp--;

             after(grammarAccess.getVisualizationAccess().getConcernsWhatQualifierParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__ConcernsAssignment_1_2_1"


    // $ANTLR start "rule__Visualization__DisplaysAssignment_3"
    // InternalDSL.g:2681:1: rule__Visualization__DisplaysAssignment_3 : ( ruleSource ) ;
    public final void rule__Visualization__DisplaysAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2685:1: ( ( ruleSource ) )
            // InternalDSL.g:2686:2: ( ruleSource )
            {
            // InternalDSL.g:2686:2: ( ruleSource )
            // InternalDSL.g:2687:3: ruleSource
            {
             before(grammarAccess.getVisualizationAccess().getDisplaysSourceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getVisualizationAccess().getDisplaysSourceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__DisplaysAssignment_3"


    // $ANTLR start "rule__Visualization__DisplaysAssignment_4_1"
    // InternalDSL.g:2696:1: rule__Visualization__DisplaysAssignment_4_1 : ( ruleSource ) ;
    public final void rule__Visualization__DisplaysAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2700:1: ( ( ruleSource ) )
            // InternalDSL.g:2701:2: ( ruleSource )
            {
            // InternalDSL.g:2701:2: ( ruleSource )
            // InternalDSL.g:2702:3: ruleSource
            {
             before(grammarAccess.getVisualizationAccess().getDisplaysSourceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getVisualizationAccess().getDisplaysSourceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__DisplaysAssignment_4_1"


    // $ANTLR start "rule__WhatQualifier__ConcernAssignment"
    // InternalDSL.g:2711:1: rule__WhatQualifier__ConcernAssignment : ( ruleTaxonomy ) ;
    public final void rule__WhatQualifier__ConcernAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2715:1: ( ( ruleTaxonomy ) )
            // InternalDSL.g:2716:2: ( ruleTaxonomy )
            {
            // InternalDSL.g:2716:2: ( ruleTaxonomy )
            // InternalDSL.g:2717:3: ruleTaxonomy
            {
             before(grammarAccess.getWhatQualifierAccess().getConcernTaxonomyEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTaxonomy();

            state._fsp--;

             after(grammarAccess.getWhatQualifierAccess().getConcernTaxonomyEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatQualifier__ConcernAssignment"


    // $ANTLR start "rule__Source__NameAssignment_0"
    // InternalDSL.g:2726:1: rule__Source__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Source__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2730:1: ( ( ruleEString ) )
            // InternalDSL.g:2731:2: ( ruleEString )
            {
            // InternalDSL.g:2731:2: ( ruleEString )
            // InternalDSL.g:2732:3: ruleEString
            {
             before(grammarAccess.getSourceAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__NameAssignment_0"


    // $ANTLR start "rule__Source__TypeAssignment_1_1"
    // InternalDSL.g:2741:1: rule__Source__TypeAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Source__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2745:1: ( ( ruleEString ) )
            // InternalDSL.g:2746:2: ( ruleEString )
            {
            // InternalDSL.g:2746:2: ( ruleEString )
            // InternalDSL.g:2747:3: ruleEString
            {
             before(grammarAccess.getSourceAccess().getTypeEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getTypeEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__TypeAssignment_1_1"


    // $ANTLR start "rule__Source__LocationAssignment_2_1"
    // InternalDSL.g:2756:1: rule__Source__LocationAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Source__LocationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2760:1: ( ( ruleEString ) )
            // InternalDSL.g:2761:2: ( ruleEString )
            {
            // InternalDSL.g:2761:2: ( ruleEString )
            // InternalDSL.g:2762:3: ruleEString
            {
             before(grammarAccess.getSourceAccess().getLocationEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getLocationEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__LocationAssignment_2_1"


    // $ANTLR start "rule__Source__ConcernsAssignment_4_0"
    // InternalDSL.g:2771:1: rule__Source__ConcernsAssignment_4_0 : ( ruleHowQualifier ) ;
    public final void rule__Source__ConcernsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2775:1: ( ( ruleHowQualifier ) )
            // InternalDSL.g:2776:2: ( ruleHowQualifier )
            {
            // InternalDSL.g:2776:2: ( ruleHowQualifier )
            // InternalDSL.g:2777:3: ruleHowQualifier
            {
             before(grammarAccess.getSourceAccess().getConcernsHowQualifierParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHowQualifier();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getConcernsHowQualifierParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__ConcernsAssignment_4_0"


    // $ANTLR start "rule__Source__ConcernsAssignment_4_1_1"
    // InternalDSL.g:2786:1: rule__Source__ConcernsAssignment_4_1_1 : ( ruleHowQualifier ) ;
    public final void rule__Source__ConcernsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2790:1: ( ( ruleHowQualifier ) )
            // InternalDSL.g:2791:2: ( ruleHowQualifier )
            {
            // InternalDSL.g:2791:2: ( ruleHowQualifier )
            // InternalDSL.g:2792:3: ruleHowQualifier
            {
             before(grammarAccess.getSourceAccess().getConcernsHowQualifierParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHowQualifier();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getConcernsHowQualifierParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__ConcernsAssignment_4_1_1"


    // $ANTLR start "rule__Window__NameAssignment_1"
    // InternalDSL.g:2801:1: rule__Window__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Window__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2805:1: ( ( ruleEString ) )
            // InternalDSL.g:2806:2: ( ruleEString )
            {
            // InternalDSL.g:2806:2: ( ruleEString )
            // InternalDSL.g:2807:3: ruleEString
            {
             before(grammarAccess.getWindowAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__NameAssignment_1"


    // $ANTLR start "rule__Window__OrganizesAssignment_3"
    // InternalDSL.g:2816:1: rule__Window__OrganizesAssignment_3 : ( ruleContainer ) ;
    public final void rule__Window__OrganizesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2820:1: ( ( ruleContainer ) )
            // InternalDSL.g:2821:2: ( ruleContainer )
            {
            // InternalDSL.g:2821:2: ( ruleContainer )
            // InternalDSL.g:2822:3: ruleContainer
            {
             before(grammarAccess.getWindowAccess().getOrganizesContainerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getOrganizesContainerParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__OrganizesAssignment_3"


    // $ANTLR start "rule__Window__OrganizesAssignment_4_1"
    // InternalDSL.g:2831:1: rule__Window__OrganizesAssignment_4_1 : ( ruleContainer ) ;
    public final void rule__Window__OrganizesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2835:1: ( ( ruleContainer ) )
            // InternalDSL.g:2836:2: ( ruleContainer )
            {
            // InternalDSL.g:2836:2: ( ruleContainer )
            // InternalDSL.g:2837:3: ruleContainer
            {
             before(grammarAccess.getWindowAccess().getOrganizesContainerParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getOrganizesContainerParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__OrganizesAssignment_4_1"


    // $ANTLR start "rule__Container__PonderationAssignment_1_1"
    // InternalDSL.g:2846:1: rule__Container__PonderationAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__Container__PonderationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2850:1: ( ( ruleEInt ) )
            // InternalDSL.g:2851:2: ( ruleEInt )
            {
            // InternalDSL.g:2851:2: ( ruleEInt )
            // InternalDSL.g:2852:3: ruleEInt
            {
             before(grammarAccess.getContainerAccess().getPonderationEIntParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getPonderationEIntParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__PonderationAssignment_1_1"


    // $ANTLR start "rule__Container__ContainsAssignment_3"
    // InternalDSL.g:2861:1: rule__Container__ContainsAssignment_3 : ( ruleCell ) ;
    public final void rule__Container__ContainsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2865:1: ( ( ruleCell ) )
            // InternalDSL.g:2866:2: ( ruleCell )
            {
            // InternalDSL.g:2866:2: ( ruleCell )
            // InternalDSL.g:2867:3: ruleCell
            {
             before(grammarAccess.getContainerAccess().getContainsCellParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getContainsCellParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__ContainsAssignment_3"


    // $ANTLR start "rule__Container__ContainsAssignment_4_1"
    // InternalDSL.g:2876:1: rule__Container__ContainsAssignment_4_1 : ( ruleCell ) ;
    public final void rule__Container__ContainsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2880:1: ( ( ruleCell ) )
            // InternalDSL.g:2881:2: ( ruleCell )
            {
            // InternalDSL.g:2881:2: ( ruleCell )
            // InternalDSL.g:2882:3: ruleCell
            {
             before(grammarAccess.getContainerAccess().getContainsCellParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getContainsCellParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__ContainsAssignment_4_1"


    // $ANTLR start "rule__Cell__WrapsAssignment"
    // InternalDSL.g:2891:1: rule__Cell__WrapsAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Cell__WrapsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2895:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:2896:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:2896:2: ( ( RULE_ID ) )
            // InternalDSL.g:2897:3: ( RULE_ID )
            {
             before(grammarAccess.getCellAccess().getWrapsVisualizationCrossReference_0()); 
            // InternalDSL.g:2898:3: ( RULE_ID )
            // InternalDSL.g:2899:4: RULE_ID
            {
             before(grammarAccess.getCellAccess().getWrapsVisualizationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getWrapsVisualizationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getCellAccess().getWrapsVisualizationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__WrapsAssignment"


    // $ANTLR start "rule__Colorization__ColorAssignment_2"
    // InternalDSL.g:2910:1: rule__Colorization__ColorAssignment_2 : ( ruleEString ) ;
    public final void rule__Colorization__ColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2914:1: ( ( ruleEString ) )
            // InternalDSL.g:2915:2: ( ruleEString )
            {
            // InternalDSL.g:2915:2: ( ruleEString )
            // InternalDSL.g:2916:3: ruleEString
            {
             before(grammarAccess.getColorizationAccess().getColorEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColorizationAccess().getColorEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colorization__ColorAssignment_2"


    // $ANTLR start "rule__Property__ValueAssignment"
    // InternalDSL.g:2925:1: rule__Property__ValueAssignment : ( ruleDataProperty ) ;
    public final void rule__Property__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2929:1: ( ( ruleDataProperty ) )
            // InternalDSL.g:2930:2: ( ruleDataProperty )
            {
            // InternalDSL.g:2930:2: ( ruleDataProperty )
            // InternalDSL.g:2931:3: ruleDataProperty
            {
             before(grammarAccess.getPropertyAccess().getValueDataPropertyEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDataProperty();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getValueDataPropertyEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment"


    // $ANTLR start "rule__Threshold__MinAssignment_2_1"
    // InternalDSL.g:2940:1: rule__Threshold__MinAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__Threshold__MinAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2944:1: ( ( ruleEInt ) )
            // InternalDSL.g:2945:2: ( ruleEInt )
            {
            // InternalDSL.g:2945:2: ( ruleEInt )
            // InternalDSL.g:2946:3: ruleEInt
            {
             before(grammarAccess.getThresholdAccess().getMinEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getThresholdAccess().getMinEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threshold__MinAssignment_2_1"


    // $ANTLR start "rule__Threshold__MaxAssignment_3_1"
    // InternalDSL.g:2955:1: rule__Threshold__MaxAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Threshold__MaxAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2959:1: ( ( ruleEInt ) )
            // InternalDSL.g:2960:2: ( ruleEInt )
            {
            // InternalDSL.g:2960:2: ( ruleEInt )
            // InternalDSL.g:2961:3: ruleEInt
            {
             before(grammarAccess.getThresholdAccess().getMaxEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getThresholdAccess().getMaxEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Threshold__MaxAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003FF8000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000700000007800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0003800000000000L});

}
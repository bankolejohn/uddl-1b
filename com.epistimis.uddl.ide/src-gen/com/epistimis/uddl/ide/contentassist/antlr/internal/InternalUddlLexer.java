package com.epistimis.uddl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUddlLexer extends Lexer {
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
    public static final int RULE_ID=6;
    public static final int RULE_DEC=10;
    public static final int RULE_INT=4;
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
    public static final int RULE_SIGNED_INT=5;
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
    public static final int RULE_STRING=7;
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

    public InternalUddlLexer() {;} 
    public InternalUddlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalUddlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalUddl.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:11:7: ( '(' )
            // InternalUddl.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:12:7: ( ')' )
            // InternalUddl.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:13:7: ( 'dm' )
            // InternalUddl.g:13:9: 'dm'
            {
            match("dm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:14:7: ( '{' )
            // InternalUddl.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:15:7: ( '}' )
            // InternalUddl.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:16:7: ( '.' )
            // InternalUddl.g:16:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:17:7: ( 'import' )
            // InternalUddl.g:17:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:18:7: ( ';' )
            // InternalUddl.g:18:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:19:7: ( '.*' )
            // InternalUddl.g:19:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:20:7: ( 'cdm' )
            // InternalUddl.g:20:9: 'cdm'
            {
            match("cdm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:21:7: ( 'ldm' )
            // InternalUddl.g:21:9: 'ldm'
            {
            match("ldm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:22:7: ( 'pdm' )
            // InternalUddl.g:22:9: 'pdm'
            {
            match("pdm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:23:7: ( 'basis' )
            // InternalUddl.g:23:9: 'basis'
            {
            match("basis"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:24:7: ( 'domain' )
            // InternalUddl.g:24:9: 'domain'
            {
            match("domain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:25:7: ( '[' )
            // InternalUddl.g:25:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:26:7: ( ']' )
            // InternalUddl.g:26:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:27:7: ( 'observable' )
            // InternalUddl.g:27:9: 'observable'
            {
            match("observable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:28:7: ( 'centity' )
            // InternalUddl.g:28:9: 'centity'
            {
            match("centity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:29:7: ( '};' )
            // InternalUddl.g:29:9: '};'
            {
            match("};"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:30:7: ( ':' )
            // InternalUddl.g:30:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:31:7: ( 'basis:' )
            // InternalUddl.g:31:9: 'basis:'
            {
            match("basis:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:32:7: ( 'cassoc' )
            // InternalUddl.g:32:9: 'cassoc'
            {
            match("cassoc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:33:7: ( 'participants:' )
            // InternalUddl.g:33:9: 'participants:'
            {
            match("participants:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:34:7: ( 'src:' )
            // InternalUddl.g:34:9: 'src:'
            {
            match("src:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:35:7: ( 'path:' )
            // InternalUddl.g:35:9: 'path:'
            {
            match("path:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:36:7: ( '/' )
            // InternalUddl.g:36:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:37:7: ( '#' )
            // InternalUddl.g:37:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:38:7: ( 'cquery' )
            // InternalUddl.g:38:9: 'cquery'
            {
            match("cquery"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:39:7: ( 'spec:' )
            // InternalUddl.g:39:9: 'spec:'
            {
            match("spec:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:40:7: ( 'ccquery' )
            // InternalUddl.g:40:9: 'ccquery'
            {
            match("ccquery"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:41:7: ( 'lunit' )
            // InternalUddl.g:41:9: 'lunit'
            {
            match("lunit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:42:7: ( 'conv' )
            // InternalUddl.g:42:9: 'conv'
            {
            match("conv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:43:7: ( '-()>' )
            // InternalUddl.g:43:9: '-()>'
            {
            match("-()>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:44:7: ( 'aconv' )
            // InternalUddl.g:44:9: 'aconv'
            {
            match("aconv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:45:7: ( '-(' )
            // InternalUddl.g:45:9: '-('
            {
            match("-("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:46:7: ( 'm:' )
            // InternalUddl.g:46:9: 'm:'
            {
            match("m:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:47:7: ( 'b:' )
            // InternalUddl.g:47:9: 'b:'
            {
            match("b:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:48:7: ( ')->' )
            // InternalUddl.g:48:9: ')->'
            {
            match(")->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:49:7: ( 'str' )
            // InternalUddl.g:49:9: 'str'
            {
            match("str"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:50:7: ( 'ch' )
            // InternalUddl.g:50:9: 'ch'
            {
            match("ch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:51:7: ( 'bool' )
            // InternalUddl.g:51:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:52:7: ( 'int' )
            // InternalUddl.g:52:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:53:7: ( 'nat' )
            // InternalUddl.g:53:9: 'nat'
            {
            match("nat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:54:7: ( 'real' )
            // InternalUddl.g:54:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:55:7: ( 'real+' )
            // InternalUddl.g:55:9: 'real+'
            {
            match("real+"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:56:7: ( 'enum' )
            // InternalUddl.g:56:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:57:7: ( ',' )
            // InternalUddl.g:57:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:58:7: ( 'stdRef:' )
            // InternalUddl.g:58:9: 'stdRef:'
            {
            match("stdRef:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:59:7: ( 'coord' )
            // InternalUddl.g:59:9: 'coord'
            {
            match("coord"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:60:7: ( 'axis:' )
            // InternalUddl.g:60:9: 'axis:'
            {
            match("axis:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:61:7: ( 'angleEq:' )
            // InternalUddl.g:61:9: 'angleEq:'
            {
            match("angleEq:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:62:7: ( 'distanceEq:' )
            // InternalUddl.g:62:9: 'distanceEq:'
            {
            match("distanceEq:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:63:7: ( 'csa' )
            // InternalUddl.g:63:9: 'csa'
            {
            match("csa"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:64:7: ( 'smsys' )
            // InternalUddl.g:64:9: 'smsys'
            {
            match("smsys"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:65:7: ( 'refStd:' )
            // InternalUddl.g:65:9: 'refStd:'
            {
            match("refStd:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:66:7: ( 'landmark' )
            // InternalUddl.g:66:9: 'landmark'
            {
            match("landmark"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:67:7: ( 'msys' )
            // InternalUddl.g:67:9: 'msys'
            {
            match("msys"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:68:7: ( 'msa:' )
            // InternalUddl.g:68:9: 'msa:'
            {
            match("msa:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:69:7: ( 'coord:' )
            // InternalUddl.g:69:9: 'coord:'
            {
            match("coord:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:70:7: ( 'extRefStd:' )
            // InternalUddl.g:70:9: 'extRefStd:'
            {
            match("extRefStd:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:71:7: ( 'orient:' )
            // InternalUddl.g:71:9: 'orient:'
            {
            match("orient:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:72:7: ( 'refPt:' )
            // InternalUddl.g:72:9: 'refPt:'
            {
            match("refPt:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:73:7: ( '![' )
            // InternalUddl.g:73:9: '!['
            {
            match("!["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:74:7: ( 'msa' )
            // InternalUddl.g:74:9: 'msa'
            {
            match("msa"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:75:7: ( 'vtu:' )
            // InternalUddl.g:75:9: 'vtu:'
            {
            match("vtu:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:76:7: ( 'landmark:' )
            // InternalUddl.g:76:9: 'landmark:'
            {
            match("landmark:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:77:7: ( 'vtu' )
            // InternalUddl.g:77:9: 'vtu'
            {
            match("vtu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:78:7: ( '!' )
            // InternalUddl.g:78:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:79:7: ( 'irc' )
            // InternalUddl.g:79:9: 'irc'
            {
            match("irc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:80:7: ( 'rrc' )
            // InternalUddl.g:80:9: 'rrc'
            {
            match("rrc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:81:7: ( 'rec' )
            // InternalUddl.g:81:9: 'rec'
            {
            match("rec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:82:7: ( 'flsc' )
            // InternalUddl.g:82:9: 'flsc'
            {
            match("flsc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:83:7: ( 'ec' )
            // InternalUddl.g:83:9: 'ec'
            {
            match("ec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:84:7: ( 'msc' )
            // InternalUddl.g:84:9: 'msc'
            {
            match("msc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:85:7: ( ')>' )
            // InternalUddl.g:85:9: ')>'
            {
            match(")>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:86:7: ( 'loss:' )
            // InternalUddl.g:86:9: 'loss:'
            {
            match("loss:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:87:7: ( 'meas' )
            // InternalUddl.g:87:9: 'meas'
            {
            match("meas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:88:7: ( '->' )
            // InternalUddl.g:88:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:89:7: ( 'sys:' )
            // InternalUddl.g:89:9: 'sys:'
            {
            match("sys:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:90:7: ( 'maxis' )
            // InternalUddl.g:90:9: 'maxis'
            {
            match("maxis"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:91:7: ( 'msaxis:' )
            // InternalUddl.g:91:9: 'msaxis:'
            {
            match("msaxis:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:92:7: ( 'mc' )
            // InternalUddl.g:92:9: 'mc'
            {
            match("mc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:93:7: ( 'lentity' )
            // InternalUddl.g:93:9: 'lentity'
            {
            match("lentity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:94:7: ( 'lassoc' )
            // InternalUddl.g:94:9: 'lassoc'
            {
            match("lassoc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:95:8: ( 'source:' )
            // InternalUddl.g:95:10: 'source:'
            {
            match("source:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:96:8: ( 'lquery' )
            // InternalUddl.g:96:10: 'lquery'
            {
            match("lquery"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:97:8: ( 'lcquery' )
            // InternalUddl.g:97:10: 'lcquery'
            {
            match("lcquery"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:98:8: ( 'octet' )
            // InternalUddl.g:98:10: 'octet'
            {
            match("octet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:99:8: ( 'char' )
            // InternalUddl.g:99:10: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:100:8: ( 'string' )
            // InternalUddl.g:100:10: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:101:8: ( 'string[' )
            // InternalUddl.g:101:10: 'string['
            {
            match("string["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:102:8: ( 'char[' )
            // InternalUddl.g:102:10: 'char['
            {
            match("char["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:103:8: ( 'short' )
            // InternalUddl.g:103:10: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:104:8: ( 'long' )
            // InternalUddl.g:104:10: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:105:8: ( 'llong' )
            // InternalUddl.g:105:10: 'llong'
            {
            match("llong"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:106:8: ( 'double' )
            // InternalUddl.g:106:10: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:107:8: ( 'ldouble' )
            // InternalUddl.g:107:10: 'ldouble'
            {
            match("ldouble"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:108:8: ( 'float' )
            // InternalUddl.g:108:10: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:109:8: ( 'fixed[' )
            // InternalUddl.g:109:10: 'fixed['
            {
            match("fixed["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:110:8: ( 'ushort' )
            // InternalUddl.g:110:10: 'ushort'
            {
            match("ushort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:111:8: ( 'ulong' )
            // InternalUddl.g:111:10: 'ulong'
            {
            match("ulong"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:112:8: ( 'ullong' )
            // InternalUddl.g:112:10: 'ullong'
            {
            match("ullong"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:113:8: ( 'seq' )
            // InternalUddl.g:113:10: 'seq'
            {
            match("seq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:114:8: ( 'arr' )
            // InternalUddl.g:114:10: 'arr'
            {
            match("arr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:115:8: ( 'struct' )
            // InternalUddl.g:115:10: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:116:8: ( 'pentity' )
            // InternalUddl.g:116:10: 'pentity'
            {
            match("pentity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:117:8: ( 'prec:' )
            // InternalUddl.g:117:10: 'prec:'
            {
            match("prec:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:118:8: ( 'passoc' )
            // InternalUddl.g:118:10: 'passoc'
            {
            match("passoc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:119:8: ( 'pquery' )
            // InternalUddl.g:119:10: 'pquery'
            {
            match("pquery"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:120:8: ( 'pcquery' )
            // InternalUddl.g:120:10: 'pcquery'
            {
            match("pcquery"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:121:8: ( 'isUnion' )
            // InternalUddl.g:121:10: 'isUnion'
            {
            match("isUnion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "RULE_SIGNED_INT"
    public final void mRULE_SIGNED_INT() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:31361:17: ( ( '+' | '-' ) RULE_INT )
            // InternalUddl.g:31361:19: ( '+' | '-' ) RULE_INT
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_INT"

    // $ANTLR start "RULE_LONG"
    public final void mRULE_LONG() throws RecognitionException {
        try {
            int _type = RULE_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:31363:11: ( RULE_SIGNED_INT ( 'L' | 'l' ) )
            // InternalUddl.g:31363:13: RULE_SIGNED_INT ( 'L' | 'l' )
            {
            mRULE_SIGNED_INT(); 
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:31365:12: ( ( '+' | '-' )? RULE_DEC '.' RULE_DEC ( ( 'E' | 'e' ) RULE_DEC )? )
            // InternalUddl.g:31365:14: ( '+' | '-' )? RULE_DEC '.' RULE_DEC ( ( 'E' | 'e' ) RULE_DEC )?
            {
            // InternalUddl.g:31365:14: ( '+' | '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalUddl.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_DEC(); 
            match('.'); 
            mRULE_DEC(); 
            // InternalUddl.g:31365:47: ( ( 'E' | 'e' ) RULE_DEC )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='E'||LA2_0=='e') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalUddl.g:31365:48: ( 'E' | 'e' ) RULE_DEC
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    mRULE_DEC(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:31367:14: ( ( 'true' | 'false' | 'TRUE' | 'FALSE' ) )
            // InternalUddl.g:31367:16: ( 'true' | 'false' | 'TRUE' | 'FALSE' )
            {
            // InternalUddl.g:31367:16: ( 'true' | 'false' | 'TRUE' | 'FALSE' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt3=1;
                }
                break;
            case 'f':
                {
                alt3=2;
                }
                break;
            case 'T':
                {
                alt3=3;
                }
                break;
            case 'F':
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUddl.g:31367:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalUddl.g:31367:24: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // InternalUddl.g:31367:32: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 4 :
                    // InternalUddl.g:31367:39: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_DEC"
    public final void mRULE_DEC() throws RecognitionException {
        try {
            // InternalUddl.g:31369:19: ( ( '0' .. '9' )+ )
            // InternalUddl.g:31369:21: ( '0' .. '9' )+
            {
            // InternalUddl.g:31369:21: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUddl.g:31369:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:31371:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalUddl.g:31371:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalUddl.g:31371:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUddl.g:31371:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalUddl.g:31371:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUddl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:31373:10: ( ( '0' .. '9' )+ )
            // InternalUddl.g:31373:12: ( '0' .. '9' )+
            {
            // InternalUddl.g:31373:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUddl.g:31373:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:31375:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalUddl.g:31375:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalUddl.g:31375:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUddl.g:31375:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalUddl.g:31375:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalUddl.g:31375:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUddl.g:31375:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalUddl.g:31375:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalUddl.g:31375:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalUddl.g:31375:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUddl.g:31375:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:31377:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalUddl.g:31377:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalUddl.g:31377:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUddl.g:31377:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:31379:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalUddl.g:31379:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalUddl.g:31379:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUddl.g:31379:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalUddl.g:31379:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUddl.g:31379:41: ( '\\r' )? '\\n'
                    {
                    // InternalUddl.g:31379:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalUddl.g:31379:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:31381:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalUddl.g:31381:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalUddl.g:31381:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUddl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUddl.g:31383:16: ( . )
            // InternalUddl.g:31383:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalUddl.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | RULE_SIGNED_INT | RULE_LONG | RULE_FLOAT | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=122;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalUddl.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalUddl.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalUddl.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalUddl.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalUddl.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalUddl.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalUddl.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalUddl.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalUddl.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalUddl.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalUddl.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalUddl.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalUddl.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalUddl.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalUddl.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalUddl.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalUddl.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalUddl.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalUddl.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalUddl.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalUddl.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalUddl.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalUddl.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalUddl.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalUddl.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalUddl.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalUddl.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalUddl.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalUddl.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalUddl.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalUddl.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalUddl.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // InternalUddl.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // InternalUddl.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // InternalUddl.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // InternalUddl.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // InternalUddl.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // InternalUddl.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // InternalUddl.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // InternalUddl.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // InternalUddl.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // InternalUddl.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // InternalUddl.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // InternalUddl.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // InternalUddl.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // InternalUddl.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // InternalUddl.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // InternalUddl.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // InternalUddl.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // InternalUddl.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // InternalUddl.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // InternalUddl.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // InternalUddl.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // InternalUddl.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // InternalUddl.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // InternalUddl.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // InternalUddl.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // InternalUddl.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // InternalUddl.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // InternalUddl.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // InternalUddl.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // InternalUddl.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // InternalUddl.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // InternalUddl.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // InternalUddl.g:1:394: T__80
                {
                mT__80(); 

                }
                break;
            case 66 :
                // InternalUddl.g:1:400: T__81
                {
                mT__81(); 

                }
                break;
            case 67 :
                // InternalUddl.g:1:406: T__82
                {
                mT__82(); 

                }
                break;
            case 68 :
                // InternalUddl.g:1:412: T__83
                {
                mT__83(); 

                }
                break;
            case 69 :
                // InternalUddl.g:1:418: T__84
                {
                mT__84(); 

                }
                break;
            case 70 :
                // InternalUddl.g:1:424: T__85
                {
                mT__85(); 

                }
                break;
            case 71 :
                // InternalUddl.g:1:430: T__86
                {
                mT__86(); 

                }
                break;
            case 72 :
                // InternalUddl.g:1:436: T__87
                {
                mT__87(); 

                }
                break;
            case 73 :
                // InternalUddl.g:1:442: T__88
                {
                mT__88(); 

                }
                break;
            case 74 :
                // InternalUddl.g:1:448: T__89
                {
                mT__89(); 

                }
                break;
            case 75 :
                // InternalUddl.g:1:454: T__90
                {
                mT__90(); 

                }
                break;
            case 76 :
                // InternalUddl.g:1:460: T__91
                {
                mT__91(); 

                }
                break;
            case 77 :
                // InternalUddl.g:1:466: T__92
                {
                mT__92(); 

                }
                break;
            case 78 :
                // InternalUddl.g:1:472: T__93
                {
                mT__93(); 

                }
                break;
            case 79 :
                // InternalUddl.g:1:478: T__94
                {
                mT__94(); 

                }
                break;
            case 80 :
                // InternalUddl.g:1:484: T__95
                {
                mT__95(); 

                }
                break;
            case 81 :
                // InternalUddl.g:1:490: T__96
                {
                mT__96(); 

                }
                break;
            case 82 :
                // InternalUddl.g:1:496: T__97
                {
                mT__97(); 

                }
                break;
            case 83 :
                // InternalUddl.g:1:502: T__98
                {
                mT__98(); 

                }
                break;
            case 84 :
                // InternalUddl.g:1:508: T__99
                {
                mT__99(); 

                }
                break;
            case 85 :
                // InternalUddl.g:1:514: T__100
                {
                mT__100(); 

                }
                break;
            case 86 :
                // InternalUddl.g:1:521: T__101
                {
                mT__101(); 

                }
                break;
            case 87 :
                // InternalUddl.g:1:528: T__102
                {
                mT__102(); 

                }
                break;
            case 88 :
                // InternalUddl.g:1:535: T__103
                {
                mT__103(); 

                }
                break;
            case 89 :
                // InternalUddl.g:1:542: T__104
                {
                mT__104(); 

                }
                break;
            case 90 :
                // InternalUddl.g:1:549: T__105
                {
                mT__105(); 

                }
                break;
            case 91 :
                // InternalUddl.g:1:556: T__106
                {
                mT__106(); 

                }
                break;
            case 92 :
                // InternalUddl.g:1:563: T__107
                {
                mT__107(); 

                }
                break;
            case 93 :
                // InternalUddl.g:1:570: T__108
                {
                mT__108(); 

                }
                break;
            case 94 :
                // InternalUddl.g:1:577: T__109
                {
                mT__109(); 

                }
                break;
            case 95 :
                // InternalUddl.g:1:584: T__110
                {
                mT__110(); 

                }
                break;
            case 96 :
                // InternalUddl.g:1:591: T__111
                {
                mT__111(); 

                }
                break;
            case 97 :
                // InternalUddl.g:1:598: T__112
                {
                mT__112(); 

                }
                break;
            case 98 :
                // InternalUddl.g:1:605: T__113
                {
                mT__113(); 

                }
                break;
            case 99 :
                // InternalUddl.g:1:612: T__114
                {
                mT__114(); 

                }
                break;
            case 100 :
                // InternalUddl.g:1:619: T__115
                {
                mT__115(); 

                }
                break;
            case 101 :
                // InternalUddl.g:1:626: T__116
                {
                mT__116(); 

                }
                break;
            case 102 :
                // InternalUddl.g:1:633: T__117
                {
                mT__117(); 

                }
                break;
            case 103 :
                // InternalUddl.g:1:640: T__118
                {
                mT__118(); 

                }
                break;
            case 104 :
                // InternalUddl.g:1:647: T__119
                {
                mT__119(); 

                }
                break;
            case 105 :
                // InternalUddl.g:1:654: T__120
                {
                mT__120(); 

                }
                break;
            case 106 :
                // InternalUddl.g:1:661: T__121
                {
                mT__121(); 

                }
                break;
            case 107 :
                // InternalUddl.g:1:668: T__122
                {
                mT__122(); 

                }
                break;
            case 108 :
                // InternalUddl.g:1:675: T__123
                {
                mT__123(); 

                }
                break;
            case 109 :
                // InternalUddl.g:1:682: T__124
                {
                mT__124(); 

                }
                break;
            case 110 :
                // InternalUddl.g:1:689: T__125
                {
                mT__125(); 

                }
                break;
            case 111 :
                // InternalUddl.g:1:696: T__126
                {
                mT__126(); 

                }
                break;
            case 112 :
                // InternalUddl.g:1:703: RULE_SIGNED_INT
                {
                mRULE_SIGNED_INT(); 

                }
                break;
            case 113 :
                // InternalUddl.g:1:719: RULE_LONG
                {
                mRULE_LONG(); 

                }
                break;
            case 114 :
                // InternalUddl.g:1:729: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 115 :
                // InternalUddl.g:1:740: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 116 :
                // InternalUddl.g:1:753: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 117 :
                // InternalUddl.g:1:761: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 118 :
                // InternalUddl.g:1:770: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 119 :
                // InternalUddl.g:1:782: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 120 :
                // InternalUddl.g:1:798: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 121 :
                // InternalUddl.g:1:814: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 122 :
                // InternalUddl.g:1:822: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\2\uffff\1\55\1\61\1\uffff\1\64\1\66\1\61\1\uffff\4\61\2\uffff\1\61\1\uffff\1\61\1\145\1\uffff\1\51\5\61\1\uffff\1\173\3\61\1\51\1\u0082\3\61\1\51\1\uffff\2\51\6\uffff\1\u008a\2\61\6\uffff\4\61\1\uffff\6\61\1\u009a\20\61\1\uffff\1\61\2\uffff\3\61\1\uffff\10\61\4\uffff\1\u00be\1\uffff\1\u00bf\4\61\1\uffff\3\61\1\u00ca\5\61\1\u00d2\3\uffff\6\61\2\uffff\1\u0082\3\61\3\uffff\4\61\1\u00e2\1\u00e3\1\61\1\u00e5\7\61\1\uffff\1\u00ed\1\u00ee\12\61\1\u00f9\16\61\1\u010a\5\61\1\u0110\4\uffff\3\61\1\u0114\1\61\1\u0118\1\u0119\2\61\1\uffff\1\u011c\2\61\1\u0120\1\u0121\2\61\1\uffff\1\u0125\16\61\2\uffff\1\61\1\uffff\4\61\1\u0139\1\61\1\u013c\2\uffff\5\61\1\u0142\4\61\1\uffff\10\61\1\u014f\3\61\1\uffff\3\61\1\uffff\2\61\1\uffff\2\61\1\uffff\3\61\1\uffff\1\u015d\1\uffff\1\61\2\uffff\1\u015f\1\61\1\uffff\1\u0162\2\61\2\uffff\1\u0165\1\61\2\uffff\1\u0167\6\61\2\u016e\12\61\1\uffff\1\u017a\2\uffff\1\61\1\u017c\2\61\2\uffff\3\61\1\u0182\1\61\1\uffff\2\61\1\uffff\2\61\1\u0189\1\uffff\2\61\1\u018c\1\uffff\3\61\1\u0190\1\61\1\u0192\1\u0193\1\uffff\1\61\1\uffff\1\61\1\uffff\1\u0196\2\uffff\2\61\1\uffff\1\61\1\uffff\1\u019a\1\61\1\u016e\1\61\1\u019d\1\61\1\uffff\1\u016e\1\u019f\1\u01a0\1\61\1\u01a2\2\61\1\u01a5\1\u01a6\1\61\2\uffff\1\61\1\uffff\1\61\1\u01aa\1\61\1\u01ac\1\61\1\uffff\1\61\1\u01af\1\61\1\u01b1\1\61\2\uffff\2\61\1\uffff\1\u01b6\1\u01b7\1\61\1\uffff\1\61\2\uffff\2\61\1\uffff\1\61\1\uffff\1\61\2\uffff\1\u01be\1\uffff\1\u01bf\2\uffff\1\61\1\uffff\1\u01c1\1\u01c2\2\uffff\1\u01c3\1\u01c4\1\61\1\uffff\1\u01c6\1\uffff\1\u01c7\1\61\1\uffff\1\u01c9\1\uffff\1\u01ca\1\61\6\uffff\1\61\2\uffff\1\61\2\uffff\1\61\4\uffff\1\u01d0\2\uffff\1\61\2\uffff\1\61\1\uffff\2\61\2\uffff\5\61\1\u01da\2\uffff\1\61\1\uffff\1\61\1\uffff";
    static final String DFA16_eofS =
        "\u01dd\uffff";
    static final String DFA16_minS =
        "\1\0\1\uffff\1\55\1\151\1\uffff\1\73\1\52\1\155\1\uffff\3\141\1\72\2\uffff\1\142\1\uffff\1\145\1\52\1\uffff\1\50\1\143\1\72\1\141\1\145\1\143\1\uffff\1\133\1\164\1\141\1\154\1\60\1\56\1\162\1\122\2\101\1\uffff\2\0\6\uffff\1\60\1\155\1\163\6\uffff\1\160\1\164\1\143\1\125\1\uffff\1\155\1\156\1\163\1\165\1\161\1\156\1\60\1\141\1\155\4\156\1\165\1\161\1\157\1\155\1\162\1\156\1\145\1\165\1\161\1\163\1\uffff\1\157\2\uffff\1\163\1\151\1\164\1\uffff\1\143\1\145\1\144\2\163\1\165\1\157\1\161\4\uffff\1\51\1\uffff\1\56\1\157\1\151\1\147\1\162\1\uffff\2\141\1\170\1\60\1\164\1\141\1\143\1\165\1\164\1\60\3\uffff\1\165\1\157\1\170\1\154\1\150\1\154\2\uffff\1\56\1\165\1\125\1\114\3\uffff\1\141\1\142\1\164\1\157\2\60\1\156\1\60\1\164\1\163\1\145\1\165\1\166\2\162\1\uffff\2\60\1\165\1\151\1\144\2\163\1\147\1\164\1\145\1\165\1\156\1\60\1\164\1\150\1\163\1\164\1\143\1\145\1\165\1\151\1\154\3\145\1\72\1\143\1\60\1\122\1\171\1\72\2\162\1\60\4\uffff\1\156\1\163\1\154\1\60\1\163\2\60\1\163\1\151\1\uffff\1\60\1\154\1\120\2\60\1\155\1\122\1\uffff\1\60\1\143\1\141\1\145\1\163\1\157\1\156\1\157\1\145\1\105\1\123\1\151\1\154\1\141\1\162\2\uffff\1\151\1\uffff\1\151\1\157\1\162\1\145\1\60\1\144\1\60\2\uffff\1\142\1\164\1\155\1\157\1\72\1\60\1\151\1\162\1\145\1\147\1\uffff\1\151\1\72\1\157\1\151\1\72\1\162\1\145\1\163\1\60\1\162\1\156\1\164\1\uffff\1\72\1\156\1\143\1\uffff\1\145\1\163\1\uffff\1\143\1\164\1\uffff\1\166\1\72\1\145\1\uffff\1\60\1\uffff\1\151\2\uffff\1\60\1\163\1\uffff\1\53\2\164\2\uffff\1\60\1\145\2\uffff\1\60\1\164\1\144\1\145\1\162\1\147\1\156\2\60\1\105\1\156\1\145\1\156\1\164\1\157\1\164\1\143\1\171\1\162\1\uffff\1\60\2\uffff\1\154\1\60\1\141\1\143\2\uffff\1\164\1\171\1\162\1\60\1\143\1\uffff\1\143\1\164\1\uffff\1\171\1\162\1\60\1\uffff\1\166\1\164\1\60\1\uffff\1\147\1\164\1\146\1\60\1\145\2\60\1\uffff\1\105\1\uffff\1\163\1\uffff\1\60\2\uffff\1\144\1\72\1\uffff\1\146\1\uffff\1\60\1\133\1\60\1\164\1\60\1\147\1\uffff\3\60\1\143\1\60\1\156\1\171\2\60\1\171\2\uffff\1\145\1\uffff\1\162\1\60\1\171\1\60\1\171\1\uffff\1\151\1\60\1\171\1\60\1\171\2\uffff\1\141\1\72\1\uffff\2\60\1\72\1\uffff\1\72\2\uffff\1\161\1\72\1\uffff\1\72\1\uffff\1\123\2\uffff\1\60\1\uffff\1\60\2\uffff\1\145\1\uffff\2\60\2\uffff\2\60\1\153\1\uffff\1\60\1\uffff\1\60\1\160\1\uffff\1\60\1\uffff\1\60\1\142\6\uffff\1\72\2\uffff\1\164\2\uffff\1\105\4\uffff\1\60\2\uffff\1\141\2\uffff\1\154\1\uffff\1\144\1\161\2\uffff\1\156\1\145\2\72\1\164\1\60\2\uffff\1\163\1\uffff\1\72\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\uffff\1\76\1\157\1\uffff\1\73\1\52\1\163\1\uffff\1\163\1\165\1\162\1\157\2\uffff\1\162\1\uffff\1\171\1\57\1\uffff\1\76\1\170\1\163\1\141\1\162\1\170\1\uffff\1\133\1\164\1\154\1\163\2\71\1\162\1\122\1\101\1\172\1\uffff\2\uffff\6\uffff\1\172\1\165\1\163\6\uffff\1\160\1\164\1\143\1\125\1\uffff\1\155\1\156\1\163\1\165\1\161\1\157\1\172\1\141\1\157\1\156\2\163\1\156\1\165\1\161\1\157\1\155\1\164\1\156\1\145\1\165\1\161\1\163\1\uffff\1\157\2\uffff\1\163\1\151\1\164\1\uffff\1\143\1\145\1\162\2\163\1\165\1\157\1\161\4\uffff\1\51\1\uffff\1\154\1\157\1\151\1\147\1\162\1\uffff\1\171\1\141\1\170\1\172\1\164\1\146\1\143\1\165\1\164\1\172\3\uffff\1\165\1\163\1\170\1\154\1\150\1\157\2\uffff\1\71\1\165\1\125\1\114\3\uffff\1\141\1\142\1\164\1\157\2\172\1\156\1\172\1\164\1\163\1\145\1\165\1\166\2\162\1\uffff\2\172\1\165\1\151\1\144\2\163\1\147\1\164\1\145\1\165\1\156\1\172\1\164\1\150\1\163\1\164\1\143\1\145\1\165\1\151\1\154\3\145\1\72\1\143\1\172\1\122\1\171\1\72\2\162\1\172\4\uffff\1\156\1\163\1\154\1\172\1\163\2\172\1\163\1\151\1\uffff\1\172\1\154\1\123\2\172\1\155\1\122\1\uffff\1\172\1\143\1\141\1\145\1\163\1\157\1\156\1\157\1\145\1\105\1\123\1\151\1\154\1\141\1\162\2\uffff\1\151\1\uffff\1\151\1\157\1\162\1\145\1\172\1\144\1\172\2\uffff\1\142\1\164\1\155\1\157\1\72\1\172\1\151\1\162\1\145\1\147\1\uffff\1\151\1\72\1\157\1\151\1\72\1\162\1\145\1\163\1\172\1\162\1\156\1\164\1\uffff\1\72\1\156\1\143\1\uffff\1\145\1\163\1\uffff\1\143\1\164\1\uffff\1\166\1\72\1\145\1\uffff\1\172\1\uffff\1\151\2\uffff\1\172\1\163\1\uffff\1\172\2\164\2\uffff\1\172\1\145\2\uffff\1\172\1\164\1\144\1\145\1\162\1\147\1\156\2\172\1\105\1\156\1\145\1\156\1\164\1\157\1\164\1\143\1\171\1\162\1\uffff\1\172\2\uffff\1\154\1\172\1\141\1\143\2\uffff\1\164\1\171\1\162\1\172\1\143\1\uffff\1\143\1\164\1\uffff\1\171\1\162\1\172\1\uffff\1\166\1\164\1\172\1\uffff\1\147\1\164\1\146\1\172\1\145\2\172\1\uffff\1\105\1\uffff\1\163\1\uffff\1\172\2\uffff\1\144\1\72\1\uffff\1\146\1\uffff\1\172\1\133\1\172\1\164\1\172\1\147\1\uffff\3\172\1\143\1\172\1\156\1\171\2\172\1\171\2\uffff\1\145\1\uffff\1\162\1\172\1\171\1\172\1\171\1\uffff\1\151\1\172\1\171\1\172\1\171\2\uffff\1\141\1\72\1\uffff\2\172\1\72\1\uffff\1\72\2\uffff\1\161\1\72\1\uffff\1\72\1\uffff\1\123\2\uffff\1\172\1\uffff\1\172\2\uffff\1\145\1\uffff\2\172\2\uffff\2\172\1\153\1\uffff\1\172\1\uffff\1\172\1\160\1\uffff\1\172\1\uffff\1\172\1\142\6\uffff\1\72\2\uffff\1\164\2\uffff\1\105\4\uffff\1\172\2\uffff\1\141\2\uffff\1\154\1\uffff\1\144\1\161\2\uffff\1\156\1\145\2\72\1\164\1\172\2\uffff\1\163\1\uffff\1\72\1\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\3\uffff\1\10\4\uffff\1\17\1\20\1\uffff\1\24\2\uffff\1\33\6\uffff\1\57\12\uffff\1\164\2\uffff\1\171\1\172\1\1\1\46\1\113\1\2\3\uffff\1\164\1\4\1\23\1\5\1\11\1\6\4\uffff\1\10\27\uffff\1\45\1\uffff\1\17\1\20\3\uffff\1\24\10\uffff\1\167\1\170\1\32\1\33\1\uffff\1\116\5\uffff\1\44\12\uffff\1\57\1\77\1\104\6\uffff\1\165\1\162\4\uffff\1\166\1\171\1\3\17\uffff\1\50\42\uffff\1\41\1\43\1\160\1\161\11\uffff\1\122\7\uffff\1\111\17\uffff\1\52\1\105\1\uffff\1\12\7\uffff\1\65\1\13\12\uffff\1\14\14\uffff\1\30\3\uffff\1\47\2\uffff\1\117\2\uffff\1\147\3\uffff\1\150\1\uffff\1\72\1\uffff\1\100\1\112\2\uffff\1\53\3\uffff\1\107\1\106\2\uffff\1\101\1\103\23\uffff\1\40\1\uffff\1\134\1\131\4\uffff\1\114\1\136\5\uffff\1\31\2\uffff\1\153\3\uffff\1\51\3\uffff\1\35\7\uffff\1\62\1\uffff\1\71\1\uffff\1\115\1\uffff\1\55\1\54\2\uffff\1\56\1\uffff\1\110\6\uffff\1\163\12\uffff\1\73\1\61\1\uffff\1\37\5\uffff\1\137\5\uffff\1\25\1\15\2\uffff\1\130\3\uffff\1\66\1\uffff\1\135\1\42\2\uffff\1\120\1\uffff\1\76\1\uffff\1\142\1\143\1\uffff\1\145\1\uffff\1\16\1\140\1\uffff\1\7\2\uffff\1\26\1\34\3\uffff\1\124\1\uffff\1\126\2\uffff\1\154\1\uffff\1\155\2\uffff\1\75\1\133\1\132\1\151\1\60\1\125\1\uffff\1\121\1\67\1\uffff\1\144\1\146\1\uffff\1\157\1\22\1\36\1\141\1\uffff\1\123\1\127\1\uffff\1\152\1\156\1\uffff\1\63\2\uffff\1\102\1\70\6\uffff\1\74\1\64\1\uffff\1\21\1\uffff\1\27";
    static final String DFA16_specialS =
        "\1\2\45\uffff\1\0\1\1\u01b5\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\33\1\46\1\23\3\51\1\47\1\1\1\2\1\51\1\37\1\32\1\24\1\6\1\22\12\40\1\20\1\10\5\51\5\45\1\43\15\45\1\42\6\45\1\15\1\51\1\16\1\44\1\45\1\51\1\25\1\14\1\11\1\3\1\31\1\35\2\45\1\7\2\45\1\12\1\26\1\27\1\17\1\13\1\45\1\30\1\21\1\41\1\36\1\34\4\45\1\4\1\51\1\5\uff82\51",
            "",
            "\1\53\20\uffff\1\54",
            "\1\60\3\uffff\1\56\1\uffff\1\57",
            "",
            "\1\63",
            "\1\65",
            "\1\67\1\70\3\uffff\1\71\1\72",
            "",
            "\1\76\1\uffff\1\100\1\74\1\75\2\uffff\1\102\6\uffff\1\101\1\uffff\1\77\1\uffff\1\103",
            "\1\106\1\uffff\1\112\1\104\1\110\6\uffff\1\113\2\uffff\1\107\1\uffff\1\111\3\uffff\1\105",
            "\1\115\1\uffff\1\121\1\114\1\116\13\uffff\1\120\1\117",
            "\1\123\46\uffff\1\122\15\uffff\1\124",
            "",
            "",
            "\1\127\1\131\16\uffff\1\130",
            "",
            "\1\142\2\uffff\1\141\4\uffff\1\136\1\uffff\1\140\1\134\1\uffff\1\133\1\uffff\1\135\4\uffff\1\137",
            "\1\143\4\uffff\1\144",
            "",
            "\1\147\7\uffff\12\151\4\uffff\1\150",
            "\1\152\12\uffff\1\154\3\uffff\1\155\5\uffff\1\153",
            "\1\156\46\uffff\1\161\1\uffff\1\162\1\uffff\1\160\15\uffff\1\157",
            "\1\163",
            "\1\164\14\uffff\1\165",
            "\1\170\12\uffff\1\166\11\uffff\1\167",
            "",
            "\1\172",
            "\1\174",
            "\1\177\7\uffff\1\176\2\uffff\1\175",
            "\1\u0081\6\uffff\1\u0080",
            "\12\151",
            "\1\u0083\1\uffff\12\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\0\u0088",
            "\0\u0088",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u008b\7\uffff\1\u008c",
            "\1\u008d",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097\1\u0098",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0099\31\61",
            "\1\u009b",
            "\1\u009c\1\uffff\1\u009d",
            "\1\u009e",
            "\1\u009f\4\uffff\1\u00a0",
            "\1\u00a2\4\uffff\1\u00a1",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8\1\u00aa\1\u00a9",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\1\u00b0",
            "",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b7\15\uffff\1\u00b6",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "",
            "",
            "",
            "\1\u00bd",
            "",
            "\1\u0083\1\uffff\12\151\22\uffff\1\u00c0\37\uffff\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c6\1\uffff\1\u00c7\25\uffff\1\u00c5",
            "\1\u00c8",
            "\1\u00c9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00cb",
            "\1\u00cc\1\uffff\1\u00ce\2\uffff\1\u00cd",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "\1\u00d3",
            "\1\u00d5\3\uffff\1\u00d4",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00da\2\uffff\1\u00d9",
            "",
            "",
            "\1\u0083\1\uffff\12\u0084",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00e4",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u0108\13\61\1\u0109\5\61",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0115",
            "\12\61\1\u0116\6\uffff\32\61\4\uffff\1\61\1\uffff\27\61\1\u0117\2\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u011a",
            "\1\u011b",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u011d",
            "\1\u011f\2\uffff\1\u011e",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0122",
            "\1\u0123",
            "",
            "\12\61\1\u0124\6\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "",
            "",
            "\1\u0134",
            "",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u013a",
            "\12\61\7\uffff\32\61\1\u013b\3\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "",
            "\1\u0156",
            "\1\u0157",
            "",
            "\1\u0158",
            "\1\u0159",
            "",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u015e",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0160",
            "",
            "\1\u0161\4\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0163",
            "\1\u0164",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0166",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "",
            "\12\61\1\u0179\6\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u017b",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u017d",
            "\1\u017e",
            "",
            "",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0183",
            "",
            "\1\u0184",
            "\1\u0185",
            "",
            "\1\u0186",
            "\1\u0187",
            "\12\61\1\u0188\6\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u018a",
            "\1\u018b",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0191",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0194",
            "",
            "\1\u0195",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u0197",
            "\1\u0198",
            "",
            "\1\u0199",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u019b",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u019c",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u019e",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01a1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01a3",
            "\1\u01a4",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01a7",
            "",
            "",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01ab",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01b0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01b2",
            "",
            "",
            "\1\u01b3",
            "\1\u01b4",
            "",
            "\12\61\7\uffff\32\61\1\u01b5\3\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01b8",
            "",
            "\1\u01b9",
            "",
            "",
            "\1\u01ba",
            "\1\u01bb",
            "",
            "\1\u01bc",
            "",
            "\1\u01bd",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u01c0",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01c5",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01c8",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01cb",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01cc",
            "",
            "",
            "\1\u01cd",
            "",
            "",
            "\1\u01ce",
            "",
            "",
            "",
            "",
            "\12\61\1\u01cf\6\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u01d1",
            "",
            "",
            "\1\u01d2",
            "",
            "\1\u01d3",
            "\1\u01d4",
            "",
            "",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u01db",
            "",
            "\1\u01dc",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | RULE_SIGNED_INT | RULE_LONG | RULE_FLOAT | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_38 = input.LA(1);

                        s = -1;
                        if ( ((LA16_38>='\u0000' && LA16_38<='\uFFFF')) ) {s = 136;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_39 = input.LA(1);

                        s = -1;
                        if ( ((LA16_39>='\u0000' && LA16_39<='\uFFFF')) ) {s = 136;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='(') ) {s = 1;}

                        else if ( (LA16_0==')') ) {s = 2;}

                        else if ( (LA16_0=='d') ) {s = 3;}

                        else if ( (LA16_0=='{') ) {s = 4;}

                        else if ( (LA16_0=='}') ) {s = 5;}

                        else if ( (LA16_0=='.') ) {s = 6;}

                        else if ( (LA16_0=='i') ) {s = 7;}

                        else if ( (LA16_0==';') ) {s = 8;}

                        else if ( (LA16_0=='c') ) {s = 9;}

                        else if ( (LA16_0=='l') ) {s = 10;}

                        else if ( (LA16_0=='p') ) {s = 11;}

                        else if ( (LA16_0=='b') ) {s = 12;}

                        else if ( (LA16_0=='[') ) {s = 13;}

                        else if ( (LA16_0==']') ) {s = 14;}

                        else if ( (LA16_0=='o') ) {s = 15;}

                        else if ( (LA16_0==':') ) {s = 16;}

                        else if ( (LA16_0=='s') ) {s = 17;}

                        else if ( (LA16_0=='/') ) {s = 18;}

                        else if ( (LA16_0=='#') ) {s = 19;}

                        else if ( (LA16_0=='-') ) {s = 20;}

                        else if ( (LA16_0=='a') ) {s = 21;}

                        else if ( (LA16_0=='m') ) {s = 22;}

                        else if ( (LA16_0=='n') ) {s = 23;}

                        else if ( (LA16_0=='r') ) {s = 24;}

                        else if ( (LA16_0=='e') ) {s = 25;}

                        else if ( (LA16_0==',') ) {s = 26;}

                        else if ( (LA16_0=='!') ) {s = 27;}

                        else if ( (LA16_0=='v') ) {s = 28;}

                        else if ( (LA16_0=='f') ) {s = 29;}

                        else if ( (LA16_0=='u') ) {s = 30;}

                        else if ( (LA16_0=='+') ) {s = 31;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 32;}

                        else if ( (LA16_0=='t') ) {s = 33;}

                        else if ( (LA16_0=='T') ) {s = 34;}

                        else if ( (LA16_0=='F') ) {s = 35;}

                        else if ( (LA16_0=='^') ) {s = 36;}

                        else if ( ((LA16_0>='A' && LA16_0<='E')||(LA16_0>='G' && LA16_0<='S')||(LA16_0>='U' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='k')||LA16_0=='q'||(LA16_0>='w' && LA16_0<='z')) ) {s = 37;}

                        else if ( (LA16_0=='\"') ) {s = 38;}

                        else if ( (LA16_0=='\'') ) {s = 39;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 40;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='$' && LA16_0<='&')||LA16_0=='*'||(LA16_0>='<' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
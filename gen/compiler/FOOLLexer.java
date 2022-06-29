// Generated from /Users/barrybassi/IdeaProjects/FOOL 08-11/src/compiler/FOOL.g4 by ANTLR 4.9.2
package compiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FOOLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMIC=1, EQ=2, PLUS=3, MINUS=4, TIMES=5, TRUE=6, FALSE=7, LPAR=8, RPAR=9, 
		CLPAR=10, CRPAR=11, IF=12, THEN=13, ELSE=14, PRINT=15, NUM=16, WHITESP=17, 
		COMMENT=18, ERR=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEMIC", "EQ", "PLUS", "MINUS", "TIMES", "TRUE", "FALSE", "LPAR", "RPAR", 
			"CLPAR", "CRPAR", "IF", "THEN", "ELSE", "PRINT", "NUM", "WHITESP", "COMMENT", 
			"ERR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'=='", "'+'", "'-'", "'*'", "'true'", "'false'", "'('", 
			"')'", "'{'", "'}'", "'if'", "'then'", "'else'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMIC", "EQ", "PLUS", "MINUS", "TIMES", "TRUE", "FALSE", "LPAR", 
			"RPAR", "CLPAR", "CRPAR", "IF", "THEN", "ELSE", "PRINT", "NUM", "WHITESP", 
			"COMMENT", "ERR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	int lexicalErrors=0;


	public FOOLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FOOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 18:
			ERR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 System.out.println("Invalid char: "+ getText()); lexicalErrors++; 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21^\n\21\f\21\16\21a\13\21"+
		"\5\21c\n\21\3\22\6\22f\n\22\r\22\16\22g\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\7\23p\n\23\f\23\16\23s\13\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3q\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\3\5\2\13\f\17\17\"\"\2\u0081"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7.\3\2\2\2\t\60\3\2"+
		"\2\2\13\62\3\2\2\2\r\64\3\2\2\2\179\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25"+
		"C\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33J\3\2\2\2\35O\3\2\2\2\37T\3\2\2\2"+
		"!b\3\2\2\2#e\3\2\2\2%k\3\2\2\2\'y\3\2\2\2)*\7=\2\2*\4\3\2\2\2+,\7?\2\2"+
		",-\7?\2\2-\6\3\2\2\2./\7-\2\2/\b\3\2\2\2\60\61\7/\2\2\61\n\3\2\2\2\62"+
		"\63\7,\2\2\63\f\3\2\2\2\64\65\7v\2\2\65\66\7t\2\2\66\67\7w\2\2\678\7g"+
		"\2\28\16\3\2\2\29:\7h\2\2:;\7c\2\2;<\7n\2\2<=\7u\2\2=>\7g\2\2>\20\3\2"+
		"\2\2?@\7*\2\2@\22\3\2\2\2AB\7+\2\2B\24\3\2\2\2CD\7}\2\2D\26\3\2\2\2EF"+
		"\7\177\2\2F\30\3\2\2\2GH\7k\2\2HI\7h\2\2I\32\3\2\2\2JK\7v\2\2KL\7j\2\2"+
		"LM\7g\2\2MN\7p\2\2N\34\3\2\2\2OP\7g\2\2PQ\7n\2\2QR\7u\2\2RS\7g\2\2S\36"+
		"\3\2\2\2TU\7r\2\2UV\7t\2\2VW\7k\2\2WX\7p\2\2XY\7v\2\2Y \3\2\2\2Zc\7\62"+
		"\2\2[_\4\63;\2\\^\4\62;\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3"+
		"\2\2\2a_\3\2\2\2bZ\3\2\2\2b[\3\2\2\2c\"\3\2\2\2df\t\2\2\2ed\3\2\2\2fg"+
		"\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\22\2\2j$\3\2\2\2kl\7\61\2\2"+
		"lm\7,\2\2mq\3\2\2\2np\13\2\2\2on\3\2\2\2ps\3\2\2\2qr\3\2\2\2qo\3\2\2\2"+
		"rt\3\2\2\2sq\3\2\2\2tu\7,\2\2uv\7\61\2\2vw\3\2\2\2wx\b\23\2\2x&\3\2\2"+
		"\2yz\13\2\2\2z{\b\24\3\2{|\3\2\2\2|}\b\24\2\2}(\3\2\2\2\7\2_bgq\4\2\3"+
		"\2\3\24\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
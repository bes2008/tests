// Generated from Hello.g4 by ANTLR 4.5.3
package com.fjn.tests.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ID=3, INT=4, NEWLINE=5, WS=6, DADD=7, DSUB=8, UNARY_ARITHMETIC=9, 
		MUL=10, DIV=11, ADD=12, SUB=13, BINARY_ARITHMETIC=14, GT=15, GE=16, LT=17, 
		LE=18, EQ=19, NE=20, BINARY_COMPARISION=21, AND0=22, AND=23, OR0=24, OR=25, 
		NOT0=26, NOT=27, UNARY_LOGIC=28, BINARY_LOGIC=29, UNARY_OPERATION=30, 
		BINARY_OPERATION=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "ID", "INT", "NEWLINE", "WS", "DADD", "DSUB", "UNARY_ARITHMETIC", 
		"MUL", "DIV", "ADD", "SUB", "BINARY_ARITHMETIC", "GT", "GE", "LT", "LE", 
		"EQ", "NE", "BINARY_COMPARISION", "AND0", "AND", "OR0", "OR", "NOT0", 
		"NOT", "UNARY_LOGIC", "BINARY_LOGIC", "UNARY_OPERATION", "BINARY_OPERATION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", null, null, null, null, "'++'", "'--'", null, "'*'", 
		"'/'", "'+'", "'-'", null, "'>'", "'>='", "'<'", "'<='", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ID", "INT", "NEWLINE", "WS", "DADD", "DSUB", "UNARY_ARITHMETIC", 
		"MUL", "DIV", "ADD", "SUB", "BINARY_ARITHMETIC", "GT", "GE", "LT", "LE", 
		"EQ", "NE", "BINARY_COMPARISION", "AND0", "AND", "OR0", "OR", "NOT0", 
		"NOT", "UNARY_LOGIC", "BINARY_LOGIC", "UNARY_OPERATION", "BINARY_OPERATION"
	};
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00b4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\6\4G\n\4\r\4\16\4H\3\5\6\5L\n\5\r\5\16\5M\3\6\5\6Q\n"+
		"\6\3\6\3\6\3\7\6\7V\n\7\r\7\16\7W\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\5\nd\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\5\17r\n\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\5\25\u0084\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u008c\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u0095\n\30\3\31\3"+
		"\31\3\31\3\32\3\32\5\32\u009c\n\32\3\33\3\33\3\33\3\33\3\34\3\34\5\34"+
		"\u00a4\n\34\3\35\3\35\3\36\3\36\5\36\u00aa\n\36\3\37\3\37\5\37\u00ae\n"+
		"\37\3 \3 \3 \5 \u00b3\n \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!\3\2\13\4\2C\\c|\3\2\62;\4\2\13\13\""+
		"\"\4\2CCcc\4\2PPpp\4\2FFff\4\2QQqq\4\2TTtt\4\2VVvv\u00c8\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7F\3\2\2\2\tK\3\2\2\2\13P\3\2\2\2"+
		"\rU\3\2\2\2\17[\3\2\2\2\21^\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2"+
		"\2\31i\3\2\2\2\33k\3\2\2\2\35q\3\2\2\2\37s\3\2\2\2!u\3\2\2\2#x\3\2\2\2"+
		"%z\3\2\2\2\'}\3\2\2\2)\u0083\3\2\2\2+\u008b\3\2\2\2-\u008d\3\2\2\2/\u0094"+
		"\3\2\2\2\61\u0096\3\2\2\2\63\u009b\3\2\2\2\65\u009d\3\2\2\2\67\u00a3\3"+
		"\2\2\29\u00a5\3\2\2\2;\u00a9\3\2\2\2=\u00ad\3\2\2\2?\u00b2\3\2\2\2AB\7"+
		"*\2\2B\4\3\2\2\2CD\7+\2\2D\6\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3"+
		"\2\2\2HI\3\2\2\2I\b\3\2\2\2JL\t\3\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN"+
		"\3\2\2\2N\n\3\2\2\2OQ\7\17\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\f\2\2"+
		"S\f\3\2\2\2TV\t\4\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2"+
		"\2YZ\b\7\2\2Z\16\3\2\2\2[\\\7-\2\2\\]\7-\2\2]\20\3\2\2\2^_\7/\2\2_`\7"+
		"/\2\2`\22\3\2\2\2ad\5\17\b\2bd\5\21\t\2ca\3\2\2\2cb\3\2\2\2d\24\3\2\2"+
		"\2ef\7,\2\2f\26\3\2\2\2gh\7\61\2\2h\30\3\2\2\2ij\7-\2\2j\32\3\2\2\2kl"+
		"\7/\2\2l\34\3\2\2\2mr\5\25\13\2nr\5\27\f\2or\5\31\r\2pr\5\33\16\2qm\3"+
		"\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\36\3\2\2\2st\7@\2\2t \3\2\2\2uv"+
		"\7@\2\2vw\7?\2\2w\"\3\2\2\2xy\7>\2\2y$\3\2\2\2z{\7>\2\2{|\7?\2\2|&\3\2"+
		"\2\2}~\7?\2\2~(\3\2\2\2\177\u0080\7#\2\2\u0080\u0084\7?\2\2\u0081\u0082"+
		"\7>\2\2\u0082\u0084\7@\2\2\u0083\177\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"*\3\2\2\2\u0085\u008c\5\37\20\2\u0086\u008c\5!\21\2\u0087\u008c\5#\22"+
		"\2\u0088\u008c\5%\23\2\u0089\u008c\5\'\24\2\u008a\u008c\5)\25\2\u008b"+
		"\u0085\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c,\3\2\2\2\u008d\u008e"+
		"\t\5\2\2\u008e\u008f\t\6\2\2\u008f\u0090\t\7\2\2\u0090.\3\2\2\2\u0091"+
		"\u0095\5-\27\2\u0092\u0093\7(\2\2\u0093\u0095\7(\2\2\u0094\u0091\3\2\2"+
		"\2\u0094\u0092\3\2\2\2\u0095\60\3\2\2\2\u0096\u0097\t\b\2\2\u0097\u0098"+
		"\t\t\2\2\u0098\62\3\2\2\2\u0099\u009c\5\61\31\2\u009a\u009c\7~\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\64\3\2\2\2\u009d\u009e\t\6\2"+
		"\2\u009e\u009f\t\b\2\2\u009f\u00a0\t\n\2\2\u00a0\66\3\2\2\2\u00a1\u00a4"+
		"\5\65\33\2\u00a2\u00a4\7#\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a48\3\2\2\2\u00a5\u00a6\5\67\34\2\u00a6:\3\2\2\2\u00a7\u00aa\5/\30"+
		"\2\u00a8\u00aa\5\63\32\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"<\3\2\2\2\u00ab\u00ae\59\35\2\u00ac\u00ae\5\23\n\2\u00ad\u00ab\3\2\2\2"+
		"\u00ad\u00ac\3\2\2\2\u00ae>\3\2\2\2\u00af\u00b3\5;\36\2\u00b0\u00b3\5"+
		"+\26\2\u00b1\u00b3\5\35\17\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3@\3\2\2\2\21\2HMPWcq\u0083\u008b\u0094\u009b\u00a3"+
		"\u00a9\u00ad\u00b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from Json.g4 by ANTLR 4.5.3
package com.fjn.tests.antlr4.json;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, STRING_START=3, STRING_END=4, STRING=5, NULL=6, OBJ_START=7, 
		OBJ_END=8, ARRAY_START=9, ARRAY_END=10, ID=11, INT=12, NEWLINE=13, WS=14, 
		NUMBER=15, BOOL=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "STRING_START", "STRING_END", "HEX_CHAR", "UNICODE", "ESCAPE_CHAR", 
		"STRING", "NULL", "OBJ_START", "OBJ_END", "ARRAY_START", "ARRAY_END", 
		"ID", "INT", "NEWLINE", "WS", "SIC", "NUMBER", "TRUE", "FALSE", "BOOL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "','", "'\"'", null, null, "'null'", "'{'", "'}'", "'['", 
		"']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "STRING_START", "STRING_END", "STRING", "NULL", "OBJ_START", 
		"OBJ_END", "ARRAY_START", "ARRAY_END", "ID", "INT", "NEWLINE", "WS", "NUMBER", 
		"BOOL"
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


	public JsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Json.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bH\n\b\3\t\3\t\3\t\3\t\7\tN\n\t\f\t\16\tQ\13\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17c\n"+
		"\17\r\17\16\17d\3\20\6\20h\n\20\r\20\16\20i\3\21\5\21m\n\21\3\21\3\21"+
		"\3\22\6\22r\n\22\r\22\16\22s\3\22\3\22\3\23\3\23\5\23z\n\23\3\23\3\23"+
		"\3\24\5\24\177\n\24\3\24\3\24\5\24\u0083\n\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0089\n\24\3\24\3\24\3\24\3\24\5\24\u008f\n\24\5\24\u0091\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u00a0"+
		"\n\27\2\2\30\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\7\23\b\25\t\27\n\31\13\33"+
		"\f\35\r\37\16!\17#\20%\2\'\21)\2+\2-\22\3\2\n\5\2\62;CHch\4\2\n\f\16\17"+
		"\4\2$$^^\4\2C\\c|\3\2\62;\4\2\13\13\"\"\4\2GGgg\4\2--//\u00ac\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2"+
		"\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17G\3\2\2\2\21"+
		"I\3\2\2\2\23T\3\2\2\2\25Y\3\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33_\3\2\2\2"+
		"\35b\3\2\2\2\37g\3\2\2\2!l\3\2\2\2#q\3\2\2\2%w\3\2\2\2\'\u0090\3\2\2\2"+
		")\u0092\3\2\2\2+\u0097\3\2\2\2-\u009f\3\2\2\2/\60\7<\2\2\60\4\3\2\2\2"+
		"\61\62\7.\2\2\62\6\3\2\2\2\63\64\7$\2\2\64\b\3\2\2\2\65\66\5\7\4\2\66"+
		"\n\3\2\2\2\678\t\2\2\28\f\3\2\2\29:\7^\2\2:;\7w\2\2;<\3\2\2\2<=\5\13\6"+
		"\2=>\5\13\6\2>?\5\13\6\2?@\5\13\6\2@\16\3\2\2\2AB\7^\2\2BH\7$\2\2CH\7"+
		"^\2\2DE\7^\2\2EH\7\61\2\2FH\t\3\2\2GA\3\2\2\2GC\3\2\2\2GD\3\2\2\2GF\3"+
		"\2\2\2H\20\3\2\2\2IO\5\7\4\2JN\5\17\b\2KN\5\r\7\2LN\n\4\2\2MJ\3\2\2\2"+
		"MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2"+
		"RS\5\t\5\2S\22\3\2\2\2TU\7p\2\2UV\7w\2\2VW\7n\2\2WX\7n\2\2X\24\3\2\2\2"+
		"YZ\7}\2\2Z\26\3\2\2\2[\\\7\177\2\2\\\30\3\2\2\2]^\7]\2\2^\32\3\2\2\2_"+
		"`\7_\2\2`\34\3\2\2\2ac\t\5\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2"+
		"e\36\3\2\2\2fh\t\6\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j \3\2\2"+
		"\2km\7\17\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\f\2\2o\"\3\2\2\2pr\t\7"+
		"\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\22\2\2v$\3"+
		"\2\2\2wy\t\b\2\2xz\t\t\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\5\37\20\2|"+
		"&\3\2\2\2}\177\7/\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0091"+
		"\5\37\20\2\u0081\u0083\7/\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0085\5\37\20\2\u0085\u0086\5%\23\2\u0086\u0091"+
		"\3\2\2\2\u0087\u0089\7/\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\5\37\20\2\u008b\u008c\7\60\2\2\u008c\u008e"+
		"\5\37\20\2\u008d\u008f\5%\23\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2"+
		"\u008f\u0091\3\2\2\2\u0090~\3\2\2\2\u0090\u0082\3\2\2\2\u0090\u0088\3"+
		"\2\2\2\u0091(\3\2\2\2\u0092\u0093\7v\2\2\u0093\u0094\7t\2\2\u0094\u0095"+
		"\7w\2\2\u0095\u0096\7g\2\2\u0096*\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099"+
		"\7c\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2\u009c"+
		",\3\2\2\2\u009d\u00a0\5)\25\2\u009e\u00a0\5+\26\2\u009f\u009d\3\2\2\2"+
		"\u009f\u009e\3\2\2\2\u00a0.\3\2\2\2\21\2GMOdilsy~\u0082\u0088\u008e\u0090"+
		"\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
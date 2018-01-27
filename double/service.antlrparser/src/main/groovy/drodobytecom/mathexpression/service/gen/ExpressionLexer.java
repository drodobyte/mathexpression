// Generated from /home/dev/draft/mathexpression/detail/src/main/resources/Expression.g4 by ANTLR 4.7
package drodobytecom.mathexpression.service.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, LP=2, RP=3, SUB=4, MUL=5, DIV=6, ADD=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "LP", "RP", "SUB", "MUL", "DIV", "ADD", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'('", "')'", "'-'", "'*'", "'/'", "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "LP", "RP", "SUB", "MUL", "DIV", "ADD", "WS"
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


	public ExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n+\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\25\n\2"+
		"\r\2\16\2\26\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t&"+
		"\n\t\r\t\16\t\'\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\4"+
		"\3\2\62;\4\2\13\13\"\"\2,\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\24\3\2\2\2\5"+
		"\30\3\2\2\2\7\32\3\2\2\2\t\34\3\2\2\2\13\36\3\2\2\2\r \3\2\2\2\17\"\3"+
		"\2\2\2\21%\3\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2"+
		"\2\2\26\27\3\2\2\2\27\4\3\2\2\2\30\31\7*\2\2\31\6\3\2\2\2\32\33\7+\2\2"+
		"\33\b\3\2\2\2\34\35\7/\2\2\35\n\3\2\2\2\36\37\7,\2\2\37\f\3\2\2\2 !\7"+
		"\61\2\2!\16\3\2\2\2\"#\7-\2\2#\20\3\2\2\2$&\t\3\2\2%$\3\2\2\2&\'\3\2\2"+
		"\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\b\t\2\2*\22\3\2\2\2\5\2\26\'\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
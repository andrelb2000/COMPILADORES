// Generated from Gramatica2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Gramatica2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VEZES=1, ACAO=2, VARIAS=3, INICIO=4, CONECTOR=5, NOME=6, PONTO_E_VIRGULA=7, 
		ESPACO=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VEZES", "ACAO", "VARIAS", "INICIO", "CONECTOR", "NOME", "PONTO_E_VIRGULA", 
			"ESPACO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'vezes'", "'andou'", null, "'Era uma vez'", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VEZES", "ACAO", "VARIAS", "INICIO", "CONECTOR", "NOME", "PONTO_E_VIRGULA", 
			"ESPACO"
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


	public Gramatica2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica2.g4"; }

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
		"\u0004\u0000\bB\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002 \b\u0002\n\u0002\f\u0002"+
		"#\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		"5\b\u0005\n\u0005\f\u00058\t\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0004\u0007=\b\u0007\u000b\u0007\f\u0007>\u0001\u0007\u0001\u0007\u0000"+
		"\u0000\b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0001\u0000\u0006\u0001\u000019\u0001\u000009\u0002"+
		"\u0000EEee\u0002\u0000AZ__\u0001\u0000az\u0003\u0000\t\n\r\r  D\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0011"+
		"\u0001\u0000\u0000\u0000\u0003\u0017\u0001\u0000\u0000\u0000\u0005\u001d"+
		"\u0001\u0000\u0000\u0000\u0007$\u0001\u0000\u0000\u0000\t0\u0001\u0000"+
		"\u0000\u0000\u000b2\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000"+
		"\u000f<\u0001\u0000\u0000\u0000\u0011\u0012\u0005v\u0000\u0000\u0012\u0013"+
		"\u0005e\u0000\u0000\u0013\u0014\u0005z\u0000\u0000\u0014\u0015\u0005e"+
		"\u0000\u0000\u0015\u0016\u0005s\u0000\u0000\u0016\u0002\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0005a\u0000\u0000\u0018\u0019\u0005n\u0000\u0000\u0019"+
		"\u001a\u0005d\u0000\u0000\u001a\u001b\u0005o\u0000\u0000\u001b\u001c\u0005"+
		"u\u0000\u0000\u001c\u0004\u0001\u0000\u0000\u0000\u001d!\u0007\u0000\u0000"+
		"\u0000\u001e \u0007\u0001\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		" #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"$%\u0005E\u0000\u0000%&\u0005r\u0000\u0000&\'\u0005a\u0000\u0000\'(\u0005"+
		" \u0000\u0000()\u0005u\u0000\u0000)*\u0005m\u0000\u0000*+\u0005a\u0000"+
		"\u0000+,\u0005 \u0000\u0000,-\u0005v\u0000\u0000-.\u0005e\u0000\u0000"+
		"./\u0005z\u0000\u0000/\b\u0001\u0000\u0000\u000001\u0007\u0002\u0000\u0000"+
		"1\n\u0001\u0000\u0000\u000026\u0007\u0003\u0000\u000035\u0007\u0004\u0000"+
		"\u000043\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u00007\f\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u00009:\u0005;\u0000\u0000:\u000e\u0001\u0000\u0000\u0000"+
		";=\u0007\u0005\u0000\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0006\u0007\u0000\u0000A\u0010\u0001\u0000\u0000\u0000"+
		"\u0004\u0000!6>\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
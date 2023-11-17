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
		INICIO=1, NOME=2, CONECTOR=3, ACAO=4, PROPRIEDADE=5, VEZES=6, VARIAS=7, 
		CONDICAO=8, CONSEQUENCIA=9, PONTO_E_VIRGULA=10, ESPACO=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INICIO", "NOME", "CONECTOR", "ACAO", "PROPRIEDADE", "VEZES", "VARIAS", 
			"CONDICAO", "CONSEQUENCIA", "PONTO_E_VIRGULA", "ESPACO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Era uma vez'", null, null, null, null, "'vezes'", null, null, 
			"'FERROU'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INICIO", "NOME", "CONECTOR", "ACAO", "PROPRIEDADE", "VEZES", "VARIAS", 
			"CONDICAO", "CONSEQUENCIA", "PONTO_E_VIRGULA", "ESPACO"
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
		"\u0004\u0000\u000bb\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"7\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006"+
		"I\b\u0006\n\u0006\f\u0006L\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0004\n]\b\n\u000b\n\f\n^\u0001\n\u0001"+
		"\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000"+
		"\u0006\u0001\u0000AZ\u0001\u0000az\u0002\u0000EEee\u0001\u000019\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  e\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0001\u0017\u0001"+
		"\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005*\u0001\u0000\u0000"+
		"\u0000\u00076\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000\u000b"+
		"@\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000\u000fM\u0001\u0000"+
		"\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013Y\u0001\u0000\u0000\u0000"+
		"\u0015\\\u0001\u0000\u0000\u0000\u0017\u0018\u0005E\u0000\u0000\u0018"+
		"\u0019\u0005r\u0000\u0000\u0019\u001a\u0005a\u0000\u0000\u001a\u001b\u0005"+
		" \u0000\u0000\u001b\u001c\u0005u\u0000\u0000\u001c\u001d\u0005m\u0000"+
		"\u0000\u001d\u001e\u0005a\u0000\u0000\u001e\u001f\u0005 \u0000\u0000\u001f"+
		" \u0005v\u0000\u0000 !\u0005e\u0000\u0000!\"\u0005z\u0000\u0000\"\u0002"+
		"\u0001\u0000\u0000\u0000#\'\u0007\u0000\u0000\u0000$&\u0007\u0001\u0000"+
		"\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000"+
		"\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0004\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000*+\u0007\u0002\u0000\u0000+\u0006\u0001\u0000"+
		"\u0000\u0000,-\u0005a\u0000\u0000-.\u0005n\u0000\u0000./\u0005d\u0000"+
		"\u0000/0\u0005o\u0000\u000007\u0005u\u0000\u000012\u0005p\u0000\u0000"+
		"23\u0005u\u0000\u000034\u0005l\u0000\u000045\u0005o\u0000\u000057\u0005"+
		"u\u0000\u00006,\u0001\u0000\u0000\u000061\u0001\u0000\u0000\u00007\b\u0001"+
		"\u0000\u0000\u000089\u0003\u0015\n\u00009:\u0005p\u0000\u0000:;\u0005"+
		"e\u0000\u0000;<\u0005s\u0000\u0000<=\u0005a\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>?\u0003\u0015\n\u0000?\n\u0001\u0000\u0000\u0000@A\u0005"+
		"v\u0000\u0000AB\u0005e\u0000\u0000BC\u0005z\u0000\u0000CD\u0005e\u0000"+
		"\u0000DE\u0005s\u0000\u0000E\f\u0001\u0000\u0000\u0000FJ\u0007\u0003\u0000"+
		"\u0000GI\u0007\u0004\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u000e"+
		"\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005S\u0000\u0000"+
		"NO\u0005e\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0003\u0015\n\u0000"+
		"Q\u0010\u0001\u0000\u0000\u0000RS\u0005F\u0000\u0000ST\u0005E\u0000\u0000"+
		"TU\u0005R\u0000\u0000UV\u0005R\u0000\u0000VW\u0005O\u0000\u0000WX\u0005"+
		"U\u0000\u0000X\u0012\u0001\u0000\u0000\u0000YZ\u0005;\u0000\u0000Z\u0014"+
		"\u0001\u0000\u0000\u0000[]\u0007\u0005\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0006\n\u0000\u0000a\u0016\u0001"+
		"\u0000\u0000\u0000\u0005\u0000\'6J^\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
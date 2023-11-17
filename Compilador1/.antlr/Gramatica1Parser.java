// Generated from c:/GITRepTemp/ANHEMBI/Teoria da Computacao/COMPILADORES/Compilador1/Gramatica1.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Gramatica1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO=1, CONECTOR=2, NOME=3, ESPACO=4;
	public static final int
		RULE_raiz_programa = 0, RULE_comeco = 1, RULE_personagem = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz_programa", "comeco", "personagem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Era uma vez'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INICIO", "CONECTOR", "NOME", "ESPACO"
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

	@Override
	public String getGrammarFileName() { return "Gramatica1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Gramatica1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raiz_programaContext extends ParserRuleContext {
		public ComecoContext comeco() {
			return getRuleContext(ComecoContext.class,0);
		}
		public Raiz_programaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiz_programa; }
	}

	public final Raiz_programaContext raiz_programa() throws RecognitionException {
		Raiz_programaContext _localctx = new Raiz_programaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_raiz_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			comeco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComecoContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(Gramatica1Parser.INICIO, 0); }
		public List<PersonagemContext> personagem() {
			return getRuleContexts(PersonagemContext.class);
		}
		public PersonagemContext personagem(int i) {
			return getRuleContext(PersonagemContext.class,i);
		}
		public TerminalNode CONECTOR() { return getToken(Gramatica1Parser.CONECTOR, 0); }
		public ComecoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comeco; }
	}

	public final ComecoContext comeco() throws RecognitionException {
		ComecoContext _localctx = new ComecoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comeco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(INICIO);
			setState(9);
			personagem();
			setState(10);
			match(CONECTOR);
			setState(11);
			personagem();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PersonagemContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(Gramatica1Parser.NOME, 0); }
		public PersonagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personagem; }
	}

	public final PersonagemContext personagem() throws RecognitionException {
		PersonagemContext _localctx = new PersonagemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_personagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			match(NOME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0004\u0010\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u0000\f\u0000\u0006\u0001\u0000"+
		"\u0000\u0000\u0002\b\u0001\u0000\u0000\u0000\u0004\r\u0001\u0000\u0000"+
		"\u0000\u0006\u0007\u0003\u0002\u0001\u0000\u0007\u0001\u0001\u0000\u0000"+
		"\u0000\b\t\u0005\u0001\u0000\u0000\t\n\u0003\u0004\u0002\u0000\n\u000b"+
		"\u0005\u0002\u0000\u0000\u000b\f\u0003\u0004\u0002\u0000\f\u0003\u0001"+
		"\u0000\u0000\u0000\r\u000e\u0005\u0003\u0000\u0000\u000e\u0005\u0001\u0000"+
		"\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
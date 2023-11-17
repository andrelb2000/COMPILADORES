// Generated from Gramatica2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Gramatica2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VEZES=1, ACAO=2, VARIAS=3, INICIO=4, CONECTOR=5, NOME=6, PONTO_E_VIRGULA=7, 
		ESPACO=8;
	public static final int
		RULE_raiz_programa = 0, RULE_estoria = 1, RULE_declaracao = 2, RULE_personagem = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz_programa", "estoria", "declaracao", "personagem"
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

	@Override
	public String getGrammarFileName() { return "Gramatica2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Gramatica2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raiz_programaContext extends ParserRuleContext {
		public EstoriaContext estoria() {
			return getRuleContext(EstoriaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Gramatica2Parser.EOF, 0); }
		public Raiz_programaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiz_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).enterRaiz_programa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).exitRaiz_programa(this);
		}
	}

	public final Raiz_programaContext raiz_programa() throws RecognitionException {
		Raiz_programaContext _localctx = new Raiz_programaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_raiz_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			estoria();
			setState(9);
			match(EOF);
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
	public static class EstoriaContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public TerminalNode PONTO_E_VIRGULA() { return getToken(Gramatica2Parser.PONTO_E_VIRGULA, 0); }
		public EstoriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estoria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).enterEstoria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).exitEstoria(this);
		}
	}

	public final EstoriaContext estoria() throws RecognitionException {
		EstoriaContext _localctx = new EstoriaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_estoria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			declaracao();
			{
			setState(12);
			match(PONTO_E_VIRGULA);
			setState(13);
			declaracao();
			}
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(Gramatica2Parser.INICIO, 0); }
		public List<PersonagemContext> personagem() {
			return getRuleContexts(PersonagemContext.class);
		}
		public PersonagemContext personagem(int i) {
			return getRuleContext(PersonagemContext.class,i);
		}
		public TerminalNode CONECTOR() { return getToken(Gramatica2Parser.CONECTOR, 0); }
		public TerminalNode ACAO() { return getToken(Gramatica2Parser.ACAO, 0); }
		public TerminalNode VARIAS() { return getToken(Gramatica2Parser.VARIAS, 0); }
		public TerminalNode VEZES() { return getToken(Gramatica2Parser.VEZES, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INICIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(INICIO);
				setState(16);
				personagem();
				setState(17);
				match(CONECTOR);
				setState(18);
				personagem();
				}
				break;
			case NOME:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				personagem();
				setState(21);
				match(ACAO);
				setState(22);
				match(VARIAS);
				setState(23);
				match(VEZES);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode NOME() { return getToken(Gramatica2Parser.NOME, 0); }
		public PersonagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).enterPersonagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).exitPersonagem(this);
		}
	}

	public final PersonagemContext personagem() throws RecognitionException {
		PersonagemContext _localctx = new PersonagemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_personagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
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
		"\u0004\u0001\b\u001e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001a\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0000"+
		"\u001a\u0000\b\u0001\u0000\u0000\u0000\u0002\u000b\u0001\u0000\u0000\u0000"+
		"\u0004\u0019\u0001\u0000\u0000\u0000\u0006\u001b\u0001\u0000\u0000\u0000"+
		"\b\t\u0003\u0002\u0001\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001\u0001"+
		"\u0000\u0000\u0000\u000b\f\u0003\u0004\u0002\u0000\f\r\u0005\u0007\u0000"+
		"\u0000\r\u000e\u0003\u0004\u0002\u0000\u000e\u0003\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0005\u0004\u0000\u0000\u0010\u0011\u0003\u0006\u0003\u0000"+
		"\u0011\u0012\u0005\u0005\u0000\u0000\u0012\u0013\u0003\u0006\u0003\u0000"+
		"\u0013\u001a\u0001\u0000\u0000\u0000\u0014\u0015\u0003\u0006\u0003\u0000"+
		"\u0015\u0016\u0005\u0002\u0000\u0000\u0016\u0017\u0005\u0003\u0000\u0000"+
		"\u0017\u0018\u0005\u0001\u0000\u0000\u0018\u001a\u0001\u0000\u0000\u0000"+
		"\u0019\u000f\u0001\u0000\u0000\u0000\u0019\u0014\u0001\u0000\u0000\u0000"+
		"\u001a\u0005\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0006\u0000\u0000"+
		"\u001c\u0007\u0001\u0000\u0000\u0000\u0001\u0019";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
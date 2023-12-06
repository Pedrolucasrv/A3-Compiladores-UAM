// Generated from Gramatica2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Gramatica2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO=1, TEXTO1=2, CONECTOR=3, CONSEQUENCIA=4, CONDICAO=5, ACAO=6, ESPACO=7, 
		PESSOA=8, ITENS=9, PROPRIEDADE=10, UMACINCO=11, INT=12, PONTO_E_VIRGULA=13;
	public static final int
		RULE_raiz_programa = 0, RULE_estoria = 1, RULE_declaracao = 2, RULE_consequencia = 3, 
		RULE_consequencia2 = 4, RULE_pessoa = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz_programa", "estoria", "declaracao", "consequencia", "consequencia2", 
			"pessoa"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'foi ao mercado'", null, "'ficou pobre'", "'Se'", "'comprou'", 
			null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INICIO", "TEXTO1", "CONECTOR", "CONSEQUENCIA", "CONDICAO", "ACAO", 
			"ESPACO", "PESSOA", "ITENS", "PROPRIEDADE", "UMACINCO", "INT", "PONTO_E_VIRGULA"
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
			setState(12);
			estoria();
			setState(13);
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
		public TerminalNode EOF() { return getToken(Gramatica2Parser.EOF, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<TerminalNode> PONTO_E_VIRGULA() { return getTokens(Gramatica2Parser.PONTO_E_VIRGULA); }
		public TerminalNode PONTO_E_VIRGULA(int i) {
			return getToken(Gramatica2Parser.PONTO_E_VIRGULA, i);
		}
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
		int _la;
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INICIO) {
					{
					{
					setState(16);
					declaracao();
					setState(17);
					match(PONTO_E_VIRGULA);
					}
					}
					setState(23);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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
		public PessoaContext pessoa() {
			return getRuleContext(PessoaContext.class,0);
		}
		public TerminalNode TEXTO1() { return getToken(Gramatica2Parser.TEXTO1, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(Gramatica2Parser.PONTO_E_VIRGULA, 0); }
		public Consequencia2Context consequencia2() {
			return getRuleContext(Consequencia2Context.class,0);
		}
		public ConsequenciaContext consequencia() {
			return getRuleContext(ConsequenciaContext.class,0);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(INICIO);
			setState(27);
			pessoa();
			setState(28);
			match(TEXTO1);
			setState(29);
			match(PONTO_E_VIRGULA);
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(30);
				consequencia2();
				}
				break;
			case 2:
				{
				setState(31);
				consequencia();
				}
				break;
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
	public static class ConsequenciaContext extends ParserRuleContext {
		public PessoaContext pessoa() {
			return getRuleContext(PessoaContext.class,0);
		}
		public TerminalNode ACAO() { return getToken(Gramatica2Parser.ACAO, 0); }
		public TerminalNode INT() { return getToken(Gramatica2Parser.INT, 0); }
		public TerminalNode ITENS() { return getToken(Gramatica2Parser.ITENS, 0); }
		public TerminalNode CONECTOR() { return getToken(Gramatica2Parser.CONECTOR, 0); }
		public TerminalNode CONSEQUENCIA() { return getToken(Gramatica2Parser.CONSEQUENCIA, 0); }
		public ConsequenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consequencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).enterConsequencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).exitConsequencia(this);
		}
	}

	public final ConsequenciaContext consequencia() throws RecognitionException {
		ConsequenciaContext _localctx = new ConsequenciaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_consequencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			pessoa();
			setState(35);
			match(ACAO);
			setState(36);
			match(INT);
			setState(37);
			match(ITENS);
			setState(38);
			match(CONECTOR);
			setState(39);
			match(CONSEQUENCIA);
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
	public static class Consequencia2Context extends ParserRuleContext {
		public PessoaContext pessoa() {
			return getRuleContext(PessoaContext.class,0);
		}
		public TerminalNode ACAO() { return getToken(Gramatica2Parser.ACAO, 0); }
		public TerminalNode UMACINCO() { return getToken(Gramatica2Parser.UMACINCO, 0); }
		public TerminalNode ITENS() { return getToken(Gramatica2Parser.ITENS, 0); }
		public Consequencia2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consequencia2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).enterConsequencia2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).exitConsequencia2(this);
		}
	}

	public final Consequencia2Context consequencia2() throws RecognitionException {
		Consequencia2Context _localctx = new Consequencia2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_consequencia2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			pessoa();
			setState(42);
			match(ACAO);
			setState(43);
			match(UMACINCO);
			setState(44);
			match(ITENS);
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
	public static class PessoaContext extends ParserRuleContext {
		public TerminalNode PESSOA() { return getToken(Gramatica2Parser.PESSOA, 0); }
		public PessoaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pessoa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).enterPessoa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gramatica2Listener ) ((Gramatica2Listener)listener).exitPessoa(this);
		}
	}

	public final PessoaContext pessoa() throws RecognitionException {
		PessoaContext _localctx = new PessoaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pessoa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(PESSOA);
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
		"\u0004\u0001\r1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0014\b\u0001\n\u0001\f\u0001"+
		"\u0017\t\u0001\u0003\u0001\u0019\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002!\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006"+
		"\b\n\u0000\u0000-\u0000\f\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000"+
		"\u0000\u0000\u0004\u001a\u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000"+
		"\u0000\b)\u0001\u0000\u0000\u0000\n.\u0001\u0000\u0000\u0000\f\r\u0003"+
		"\u0002\u0001\u0000\r\u000e\u0005\u0000\u0000\u0001\u000e\u0001\u0001\u0000"+
		"\u0000\u0000\u000f\u0019\u0005\u0000\u0000\u0001\u0010\u0011\u0003\u0004"+
		"\u0002\u0000\u0011\u0012\u0005\r\u0000\u0000\u0012\u0014\u0001\u0000\u0000"+
		"\u0000\u0013\u0010\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000"+
		"\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000"+
		"\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000"+
		"\u0000\u0018\u000f\u0001\u0000\u0000\u0000\u0018\u0015\u0001\u0000\u0000"+
		"\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0001\u0000"+
		"\u0000\u001b\u001c\u0003\n\u0005\u0000\u001c\u001d\u0005\u0002\u0000\u0000"+
		"\u001d \u0005\r\u0000\u0000\u001e!\u0003\b\u0004\u0000\u001f!\u0003\u0006"+
		"\u0003\u0000 \u001e\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000"+
		"!\u0005\u0001\u0000\u0000\u0000\"#\u0003\n\u0005\u0000#$\u0005\u0006\u0000"+
		"\u0000$%\u0005\f\u0000\u0000%&\u0005\t\u0000\u0000&\'\u0005\u0003\u0000"+
		"\u0000\'(\u0005\u0004\u0000\u0000(\u0007\u0001\u0000\u0000\u0000)*\u0003"+
		"\n\u0005\u0000*+\u0005\u0006\u0000\u0000+,\u0005\u000b\u0000\u0000,-\u0005"+
		"\t\u0000\u0000-\t\u0001\u0000\u0000\u0000./\u0005\b\u0000\u0000/\u000b"+
		"\u0001\u0000\u0000\u0000\u0003\u0015\u0018 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		INICIO=1, TEXTO1=2, CONECTOR=3, CONSEQUENCIA=4, CONDICAO=5, ACAO=6, ESPACO=7, 
		PESSOA=8, ITENS=9, PROPRIEDADE=10, UMACINCO=11, INT=12, PONTO_E_VIRGULA=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INICIO", "TEXTO1", "CONECTOR", "CONSEQUENCIA", "CONDICAO", "ACAO", "ESPACO", 
			"PESSOA", "ITENS", "PROPRIEDADE", "UMACINCO", "INT", "PONTO_E_VIRGULA"
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
		"\u0004\u0000\rj\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006G\b\u0006\u000b"+
		"\u0006\f\u0006H\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0004"+
		"\u0007O\b\u0007\u000b\u0007\f\u0007P\u0001\b\u0004\bT\b\b\u000b\b\f\b"+
		"U\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000bd\b\u000b\n\u000b\f\u000b"+
		"g\t\u000b\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u0001\u0000\b\u0002\u0000AAOO\u0002\u0000"+
		"EEee\u0003\u0000\t\n\r\r  \u0001\u0000AZ\u0001\u0000az\u0001\u000015\u0001"+
		"\u000019\u0001\u000009m\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000"+
		"\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000"+
		"\u0000\u0007.\u0001\u0000\u0000\u0000\t:\u0001\u0000\u0000\u0000\u000b"+
		"=\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000\u000fL\u0001\u0000"+
		"\u0000\u0000\u0011S\u0001\u0000\u0000\u0000\u0013W\u0001\u0000\u0000\u0000"+
		"\u0015_\u0001\u0000\u0000\u0000\u0017a\u0001\u0000\u0000\u0000\u0019h"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0007\u0000\u0000\u0000\u001c\u0002"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0005f\u0000\u0000\u001e\u001f\u0005"+
		"o\u0000\u0000\u001f \u0005i\u0000\u0000 !\u0005 \u0000\u0000!\"\u0005"+
		"a\u0000\u0000\"#\u0005o\u0000\u0000#$\u0005 \u0000\u0000$%\u0005m\u0000"+
		"\u0000%&\u0005e\u0000\u0000&\'\u0005r\u0000\u0000\'(\u0005c\u0000\u0000"+
		"()\u0005a\u0000\u0000)*\u0005d\u0000\u0000*+\u0005o\u0000\u0000+\u0004"+
		"\u0001\u0000\u0000\u0000,-\u0007\u0001\u0000\u0000-\u0006\u0001\u0000"+
		"\u0000\u0000./\u0005f\u0000\u0000/0\u0005i\u0000\u000001\u0005c\u0000"+
		"\u000012\u0005o\u0000\u000023\u0005u\u0000\u000034\u0005 \u0000\u0000"+
		"45\u0005p\u0000\u000056\u0005o\u0000\u000067\u0005b\u0000\u000078\u0005"+
		"r\u0000\u000089\u0005e\u0000\u00009\b\u0001\u0000\u0000\u0000:;\u0005"+
		"S\u0000\u0000;<\u0005e\u0000\u0000<\n\u0001\u0000\u0000\u0000=>\u0005"+
		"c\u0000\u0000>?\u0005o\u0000\u0000?@\u0005m\u0000\u0000@A\u0005p\u0000"+
		"\u0000AB\u0005r\u0000\u0000BC\u0005o\u0000\u0000CD\u0005u\u0000\u0000"+
		"D\f\u0001\u0000\u0000\u0000EG\u0007\u0002\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0006\u0006\u0000\u0000K\u000e"+
		"\u0001\u0000\u0000\u0000LN\u0007\u0003\u0000\u0000MO\u0007\u0004\u0000"+
		"\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u0010\u0001\u0000\u0000\u0000"+
		"RT\u0007\u0004\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0012\u0001"+
		"\u0000\u0000\u0000WX\u0003\r\u0006\u0000XY\u0005p\u0000\u0000YZ\u0005"+
		"e\u0000\u0000Z[\u0005s\u0000\u0000[\\\u0005a\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]^\u0003\r\u0006\u0000^\u0014\u0001\u0000\u0000\u0000_`\u0007"+
		"\u0005\u0000\u0000`\u0016\u0001\u0000\u0000\u0000ae\u0007\u0006\u0000"+
		"\u0000bd\u0007\u0007\u0000\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0018"+
		"\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0005;\u0000\u0000"+
		"i\u001a\u0001\u0000\u0000\u0000\u0005\u0000HPUe\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
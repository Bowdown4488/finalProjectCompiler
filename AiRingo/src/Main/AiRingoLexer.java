// Generated from /home/athena/GitRepo/CMPILER-MP/MingoXD/src/Main/AiRingoParser.g4 by ANTLR 4.7.2
package Main;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AiRingoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ABSTRACT=14, BOOLEAN=15, BREAK=16, 
		CATCH=17, CHAR=18, CLASS=19, CONST=20, DO=21, DOUBLE=22, ELSE=23, EXTENDS=24, 
		FINAL=25, FINALLY=26, FLOAT=27, FOR=28, IF=29, IMPLEMENTS=30, IMPORT=31, 
		INSTANCEOF=32, INT=33, INTERFACE=34, LONG=35, NEW=36, PACKAGE=37, PRIVATE=38, 
		PROTECTED=39, PUBLIC=40, RETURN=41, STATIC=42, SUPER=43, THIS=44, THROW=45, 
		THROWS=46, TRY=47, VOID=48, WHILE=49, IntegerLiteral=50, FloatingPointLiteral=51, 
		BooleanLiteral=52, CharacterLiteral=53, StringLiteral=54, NullLiteral=55, 
		LPAREN=56, RPAREN=57, LBRACE=58, RBRACE=59, LBRACK=60, RBRACK=61, SEMI=62, 
		COMMA=63, DOT=64, ASSIGN=65, GT=66, LT=67, BANG=68, TILDE=69, QUESTION=70, 
		COLON=71, EQUAL=72, LE=73, GE=74, NOTEQUAL=75, AND=76, OR=77, INC=78, 
		DEC=79, ADD=80, SUB=81, MUL=82, DIV=83, BITAND=84, BITOR=85, CARET=86, 
		MOD=87, ARROW=88, COLONCOLON=89, ADD_ASSIGN=90, SUB_ASSIGN=91, MUL_ASSIGN=92, 
		DIV_ASSIGN=93, AND_ASSIGN=94, OR_ASSIGN=95, XOR_ASSIGN=96, MOD_ASSIGN=97, 
		LSHIFT_ASSIGN=98, RSHIFT_ASSIGN=99, URSHIFT_ASSIGN=100, Identifier=101, 
		AT=102, ELLIPSIS=103, WS=104, COMMENT=105, LINE_COMMENT=106;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "ABSTRACT", "BOOLEAN", "BREAK", "CATCH", 
			"CHAR", "CLASS", "CONST", "DO", "DOUBLE", "ELSE", "EXTENDS", "FINAL", 
			"FINALLY", "FLOAT", "FOR", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", 
			"INT", "INTERFACE", "LONG", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", 
			"PUBLIC", "RETURN", "STATIC", "SUPER", "THIS", "THROW", "THROWS", "TRY", 
			"VOID", "WHILE", "IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", 
			"OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", 
			"Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
			"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
			"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", 
			"OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "BinaryNumeral", 
			"BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", 
			"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
			"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
			"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", 
			"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
			"StringCharacter", "EscapeSequence", "OctalEscape", "ZeroToThree", "UnicodeEscape", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", 
			"COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "IdentifierStart", "IdentifierPart", 
			"AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'byte'", "'short'", "'strictfp'", "'transient'", "'volatile'", 
			"'synchronized'", "'native'", "'enum'", "'default'", "'assert'", "'switch'", 
			"'case'", "'continue'", "'abstracc'", "'boolyan'", "'brik'", "'cats'", 
			"'charot'", "'klas'", "'konst'", "'dududu'", "'dubol'", "'ils'", "'ekstinds'", 
			"'pinal'", "'pinally'", "'plute'", "'por'", "'ip'", "'implants'", "'impowrt'", 
			"'instanceop'", "'eent'", "'enterpeys'", "'luung'", "'nyo'", "'pakeyds'", 
			"'praybeyt'", "'prutiktid'", "'pablik'", "'retorn'", "'istatik'", "'souper'", 
			"'dis'", "'thru'", "'thrus'", "'try'", "'boid'", "'wayl'", null, null, 
			null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'+='", 
			"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
			"'>>>='", null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ABSTRACT", "BOOLEAN", "BREAK", "CATCH", "CHAR", "CLASS", 
			"CONST", "DO", "DOUBLE", "ELSE", "EXTENDS", "FINAL", "FINALLY", "FLOAT", 
			"FOR", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", 
			"LONG", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
			"STATIC", "SUPER", "THIS", "THROW", "THROWS", "TRY", "VOID", "WHILE", 
			"IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", 
			"StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
			"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
			"MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
			"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", 
			"ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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


	public AiRingoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AiRingoParser.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2l\u043e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*"+
		"\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3."+
		"\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u0288\n\63\3\64\3\64"+
		"\5\64\u028c\n\64\3\65\3\65\5\65\u0290\n\65\3\66\3\66\5\66\u0294\n\66\3"+
		"\67\3\67\5\67\u0298\n\67\38\38\39\39\39\59\u029f\n9\39\39\39\59\u02a4"+
		"\n9\59\u02a6\n9\3:\3:\5:\u02aa\n:\3:\5:\u02ad\n:\3;\3;\5;\u02b1\n;\3<"+
		"\3<\3=\6=\u02b6\n=\r=\16=\u02b7\3>\3>\5>\u02bc\n>\3?\6?\u02bf\n?\r?\16"+
		"?\u02c0\3@\3@\3@\3@\3A\3A\5A\u02c9\nA\3A\5A\u02cc\nA\3B\3B\3C\6C\u02d1"+
		"\nC\rC\16C\u02d2\3D\3D\5D\u02d7\nD\3E\3E\5E\u02db\nE\3E\3E\3F\3F\5F\u02e1"+
		"\nF\3F\5F\u02e4\nF\3G\3G\3H\6H\u02e9\nH\rH\16H\u02ea\3I\3I\5I\u02ef\n"+
		"I\3J\3J\3J\3J\3K\3K\5K\u02f7\nK\3K\5K\u02fa\nK\3L\3L\3M\6M\u02ff\nM\r"+
		"M\16M\u0300\3N\3N\5N\u0305\nN\3O\3O\5O\u0309\nO\3P\3P\3P\5P\u030e\nP\3"+
		"P\5P\u0311\nP\3P\5P\u0314\nP\3P\3P\3P\5P\u0319\nP\3P\5P\u031c\nP\3P\3"+
		"P\3P\5P\u0321\nP\3P\3P\3P\5P\u0326\nP\3Q\3Q\3Q\3R\3R\3S\5S\u032e\nS\3"+
		"S\3S\3T\3T\3U\3U\3V\3V\3V\5V\u0339\nV\3W\3W\5W\u033d\nW\3W\3W\3W\5W\u0342"+
		"\nW\3W\3W\5W\u0346\nW\3X\3X\3X\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0356"+
		"\nZ\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0360\n[\3\\\3\\\3]\3]\5]\u0366\n]\3]\3"+
		"]\3^\6^\u036b\n^\r^\16^\u036c\3_\3_\5_\u0371\n_\3`\3`\3`\3`\5`\u0377\n"+
		"`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u0384\na\3b\3b\3c\3c\6c\u038a\n"+
		"c\rc\16c\u038b\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3"+
		"i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3"+
		"t\3u\3u\3u\3v\3v\3v\3w\3w\3w\3x\3x\3x\3y\3y\3y\3z\3z\3z\3{\3{\3{\3|\3"+
		"|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3"+
		"\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086"+
		"\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\7\u0092\u040d\n\u0092\f\u0092"+
		"\16\u0092\u0410\13\u0092\3\u0093\5\u0093\u0413\n\u0093\3\u0094\3\u0094"+
		"\5\u0094\u0417\n\u0094\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0097\6\u0097\u0420\n\u0097\r\u0097\16\u0097\u0421\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\7\u0098\u042a\n\u0098\f\u0098\16\u0098"+
		"\u042d\13\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\7\u0099\u0438\n\u0099\f\u0099\16\u0099\u043b\13\u0099"+
		"\3\u0099\3\u0099\3\u042b\2\u009a\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083"+
		"\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095"+
		"\2\u0097\2\u0099\2\u009b\2\u009d\65\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7"+
		"\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\66\u00b5\67\u00b7\2\u00b9"+
		"8\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c79\u00c9:\u00cb"+
		";\u00cd<\u00cf=\u00d1>\u00d3?\u00d5@\u00d7A\u00d9B\u00dbC\u00ddD\u00df"+
		"E\u00e1F\u00e3G\u00e5H\u00e7I\u00e9J\u00ebK\u00edL\u00efM\u00f1N\u00f3"+
		"O\u00f5P\u00f7Q\u00f9R\u00fbS\u00fdT\u00ffU\u0101V\u0103W\u0105X\u0107"+
		"Y\u0109Z\u010b[\u010d\\\u010f]\u0111^\u0113_\u0115`\u0117a\u0119b\u011b"+
		"c\u011dd\u011fe\u0121f\u0123g\u0125\2\u0127\2\u0129h\u012bi\u012dj\u012f"+
		"k\u0131l\3\2\25\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3"+
		"\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\6\2\f\f\17\17))^^\6\2\f\f"+
		"\17\17$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\u0194\2&&C\\aac|\u00a4\u00a7"+
		"\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc\u00c2\u00d8\u00da\u00f8\u00fa\u02c3"+
		"\u02c8\u02d3\u02e2\u02e6\u02ee\u02ee\u02f0\u02f0\u0372\u0376\u0378\u0379"+
		"\u037c\u037f\u0381\u0381\u0388\u0388\u038a\u038c\u038e\u038e\u0390\u03a3"+
		"\u03a5\u03f7\u03f9\u0483\u048c\u0531\u0533\u0558\u055b\u055b\u0563\u0589"+
		"\u0591\u0591\u05d2\u05ec\u05f2\u05f4\u060d\u060d\u0622\u064c\u0670\u0671"+
		"\u0673\u06d5\u06d7\u06d7\u06e7\u06e8\u06f0\u06f1\u06fc\u06fe\u0701\u0701"+
		"\u0712\u0712\u0714\u0731\u074f\u07a7\u07b3\u07b3\u07cc\u07ec\u07f6\u07f7"+
		"\u07fc\u07fc\u0802\u0817\u081c\u081c\u0826\u0826\u082a\u082a\u0842\u085a"+
		"\u0862\u086c\u08a2\u08b6\u08b8\u08bf\u0906\u093b\u093f\u093f\u0952\u0952"+
		"\u095a\u0963\u0973\u0982\u0987\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2"+
		"\u09b4\u09b4\u09b8\u09bb\u09bf\u09bf\u09d0\u09d0\u09de\u09df\u09e1\u09e3"+
		"\u09f2\u09f5\u09fd\u09fe\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32"+
		"\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76"+
		"\u0a87\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb"+
		"\u0abf\u0abf\u0ad2\u0ad2\u0ae2\u0ae3\u0af3\u0af3\u0afb\u0afb\u0b07\u0b0e"+
		"\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b37\u0b3b\u0b3f\u0b3f"+
		"\u0b5e\u0b5f\u0b61\u0b63\u0b73\u0b73\u0b85\u0b85\u0b87\u0b8c\u0b90\u0b92"+
		"\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac"+
		"\u0bb0\u0bbb\u0bd2\u0bd2\u0bfb\u0bfb\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a"+
		"\u0c2c\u0c3b\u0c3f\u0c3f\u0c5a\u0c5c\u0c62\u0c63\u0c82\u0c82\u0c87\u0c8e"+
		"\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0cbf\u0cbf\u0ce0\u0ce0"+
		"\u0ce2\u0ce3\u0cf3\u0cf4\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d3c\u0d3f\u0d3f"+
		"\u0d50\u0d50\u0d56\u0d58\u0d61\u0d63\u0d7c\u0d81\u0d87\u0d98\u0d9c\u0db3"+
		"\u0db5\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e41\u0e48"+
		"\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c\u0e8c\u0e8f\u0e8f\u0e96\u0e99"+
		"\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9\u0eac\u0ead\u0eaf\u0eb2"+
		"\u0eb4\u0eb5\u0ebf\u0ebf\u0ec2\u0ec6\u0ec8\u0ec8\u0ede\u0ee1\u0f02\u0f02"+
		"\u0f42\u0f49\u0f4b\u0f6e\u0f8a\u0f8e\u1002\u102c\u1041\u1041\u1052\u1057"+
		"\u105c\u105f\u1063\u1063\u1067\u1068\u1070\u1072\u1077\u1083\u1090\u1090"+
		"\u10a2\u10c7\u10c9\u10c9\u10cf\u10cf\u10d2\u10fc\u10fe\u124a\u124c\u124f"+
		"\u1252\u1258\u125a\u125a\u125c\u125f\u1262\u128a\u128c\u128f\u1292\u12b2"+
		"\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7\u12ca\u12d8\u12da\u1312"+
		"\u1314\u1317\u131a\u135c\u1382\u1391\u13a2\u13f7\u13fa\u13ff\u1403\u166e"+
		"\u1671\u1681\u1683\u169c\u16a2\u16ec\u16f0\u16fa\u1702\u170e\u1710\u1713"+
		"\u1722\u1733\u1742\u1753\u1762\u176e\u1770\u1772\u1782\u17b5\u17d9\u17d9"+
		"\u17dd\u17de\u1822\u1879\u1882\u1886\u1889\u18aa\u18ac\u18ac\u18b2\u18f7"+
		"\u1902\u1920\u1952\u196f\u1972\u1976\u1982\u19ad\u19b2\u19cb\u1a02\u1a18"+
		"\u1a22\u1a56\u1aa9\u1aa9\u1b07\u1b35\u1b47\u1b4d\u1b85\u1ba2\u1bb0\u1bb1"+
		"\u1bbc\u1be7\u1c02\u1c25\u1c4f\u1c51\u1c5c\u1c7f\u1c82\u1c8a\u1ceb\u1cee"+
		"\u1cf0\u1cf3\u1cf7\u1cf8\u1d02\u1dc1\u1e02\u1f17\u1f1a\u1f1f\u1f22\u1f47"+
		"\u1f4a\u1f4f\u1f52\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f"+
		"\u1f82\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5"+
		"\u1fd8\u1fdd\u1fe2\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2041\u2042\u2056\u2056"+
		"\u2073\u2073\u2081\u2081\u2092\u209e\u20a2\u20c1\u2104\u2104\u2109\u2109"+
		"\u210c\u2115\u2117\u2117\u211b\u211f\u2126\u2126\u2128\u2128\u212a\u212a"+
		"\u212c\u212f\u2131\u213b\u213e\u2141\u2147\u214b\u2150\u2150\u2162\u218a"+
		"\u2c02\u2c30\u2c32\u2c60\u2c62\u2ce6\u2ced\u2cf0\u2cf4\u2cf5\u2d02\u2d27"+
		"\u2d29\u2d29\u2d2f\u2d2f\u2d32\u2d69\u2d71\u2d71\u2d82\u2d98\u2da2\u2da8"+
		"\u2daa\u2db0\u2db2\u2db8\u2dba\u2dc0\u2dc2\u2dc8\u2dca\u2dd0\u2dd2\u2dd8"+
		"\u2dda\u2de0\u2e31\u2e31\u3007\u3009\u3023\u302b\u3033\u3037\u303a\u303e"+
		"\u3043\u3098\u309f\u30a1\u30a3\u30fc\u30fe\u3101\u3107\u3130\u3133\u3190"+
		"\u31a2\u31bc\u31f2\u3201\u3402\u4db7\u4e02\u9fec\ua002\ua48e\ua4d2\ua4ff"+
		"\ua502\ua60e\ua612\ua621\ua62c\ua62d\ua642\ua670\ua681\ua69f\ua6a2\ua6f1"+
		"\ua719\ua721\ua724\ua78a\ua78d\ua7b0\ua7b2\ua7b9\ua7f9\ua803\ua805\ua807"+
		"\ua809\ua80c\ua80e\ua824\ua83a\ua83a\ua842\ua875\ua884\ua8b5\ua8f4\ua8f9"+
		"\ua8fd\ua8fd\ua8ff\ua8ff\ua90c\ua927\ua932\ua948\ua962\ua97e\ua986\ua9b4"+
		"\ua9d1\ua9d1\ua9e2\ua9e6\ua9e8\ua9f1\ua9fc\uaa00\uaa02\uaa2a\uaa42\uaa44"+
		"\uaa46\uaa4d\uaa62\uaa78\uaa7c\uaa7c\uaa80\uaab1\uaab3\uaab3\uaab7\uaab8"+
		"\uaabb\uaabf\uaac2\uaac2\uaac4\uaac4\uaadd\uaadf\uaae2\uaaec\uaaf4\uaaf6"+
		"\uab03\uab08\uab0b\uab10\uab13\uab18\uab22\uab28\uab2a\uab30\uab32\uab5c"+
		"\uab5e\uab67\uab72\uabe4\uac02\ud7a5\ud7b2\ud7c8\ud7cd\ud7fd\uf902\ufa6f"+
		"\ufa72\ufadb\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f\ufb21\ufb2a\ufb2c\ufb38"+
		"\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufd3f"+
		"\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfe\ufe35\ufe36\ufe4f\ufe51\ufe6b\ufe6b"+
		"\ufe72\ufe76\ufe78\ufefe\uff06\uff06\uff23\uff3c\uff41\uff41\uff43\uff5c"+
		"\uff68\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\uffe2\uffe3"+
		"\uffe7\uffe8\u00e6\2\62;\u0081\u00a1\u00af\u00af\u0302\u0371\u0485\u0489"+
		"\u0593\u05bf\u05c1\u05c1\u05c3\u05c4\u05c6\u05c7\u05c9\u05c9\u0602\u0607"+
		"\u0612\u061c\u061e\u061e\u064d\u066b\u0672\u0672\u06d8\u06df\u06e1\u06e6"+
		"\u06e9\u06ea\u06ec\u06ef\u06f2\u06fb\u0711\u0711\u0713\u0713\u0732\u074c"+
		"\u07a8\u07b2\u07c2\u07cb\u07ed\u07f5\u0818\u081b\u081d\u0825\u0827\u0829"+
		"\u082b\u082f\u085b\u085d\u08d6\u0905\u093c\u093e\u0940\u0951\u0953\u0959"+
		"\u0964\u0965\u0968\u0971\u0983\u0985\u09be\u09be\u09c0\u09c6\u09c9\u09ca"+
		"\u09cd\u09cf\u09d9\u09d9\u09e4\u09e5\u09e8\u09f1\u0a03\u0a05\u0a3e\u0a3e"+
		"\u0a40\u0a44\u0a49\u0a4a\u0a4d\u0a4f\u0a53\u0a53\u0a68\u0a73\u0a77\u0a77"+
		"\u0a83\u0a85\u0abe\u0abe\u0ac0\u0ac7\u0ac9\u0acb\u0acd\u0acf\u0ae4\u0ae5"+
		"\u0ae8\u0af1\u0afc\u0b01\u0b03\u0b05\u0b3e\u0b3e\u0b40\u0b46\u0b49\u0b4a"+
		"\u0b4d\u0b4f\u0b58\u0b59\u0b64\u0b65\u0b68\u0b71\u0b84\u0b84\u0bc0\u0bc4"+
		"\u0bc8\u0bca\u0bcc\u0bcf\u0bd9\u0bd9\u0be8\u0bf1\u0c02\u0c05\u0c40\u0c46"+
		"\u0c48\u0c4a\u0c4c\u0c4f\u0c57\u0c58\u0c64\u0c65\u0c68\u0c71\u0c83\u0c85"+
		"\u0cbe\u0cbe\u0cc0\u0cc6\u0cc8\u0cca\u0ccc\u0ccf\u0cd7\u0cd8\u0ce4\u0ce5"+
		"\u0ce8\u0cf1\u0d02\u0d05\u0d3d\u0d3e\u0d40\u0d46\u0d48\u0d4a\u0d4c\u0d4f"+
		"\u0d59\u0d59\u0d64\u0d65\u0d68\u0d71\u0d84\u0d85\u0dcc\u0dcc\u0dd1\u0dd6"+
		"\u0dd8\u0dd8\u0dda\u0de1\u0de8\u0df1\u0df4\u0df5\u0e33\u0e33\u0e36\u0e3c"+
		"\u0e49\u0e50\u0e52\u0e5b\u0eb3\u0eb3\u0eb6\u0ebb\u0ebd\u0ebe\u0eca\u0ecf"+
		"\u0ed2\u0edb\u0f1a\u0f1b\u0f22\u0f2b\u0f37\u0f37\u0f39\u0f39\u0f3b\u0f3b"+
		"\u0f40\u0f41\u0f73\u0f86\u0f88\u0f89\u0f8f\u0f99\u0f9b\u0fbe\u0fc8\u0fc8"+
		"\u102d\u1040\u1042\u104b\u1058\u105b\u1060\u1062\u1064\u1066\u1069\u106f"+
		"\u1073\u1076\u1084\u108f\u1091\u109f\u135f\u1361\u1714\u1716\u1734\u1736"+
		"\u1754\u1755\u1774\u1775\u17b6\u17d5\u17df\u17df\u17e2\u17eb\u180d\u1810"+
		"\u1812\u181b\u1887\u1888\u18ab\u18ab\u1922\u192d\u1932\u193d\u1948\u1951"+
		"\u19d2\u19db\u1a19\u1a1d\u1a57\u1a60\u1a62\u1a7e\u1a81\u1a8b\u1a92\u1a9b"+
		"\u1ab2\u1abf\u1b02\u1b06\u1b36\u1b46\u1b52\u1b5b\u1b6d\u1b75\u1b82\u1b84"+
		"\u1ba3\u1baf\u1bb2\u1bbb\u1be8\u1bf5\u1c26\u1c39\u1c42\u1c4b\u1c52\u1c5b"+
		"\u1cd2\u1cd4\u1cd6\u1cea\u1cef\u1cef\u1cf4\u1cf6\u1cf9\u1cfb\u1dc2\u1dfb"+
		"\u1dfd\u1e01\u200d\u2011\u202c\u2030\u2062\u2066\u2068\u2071\u20d2\u20de"+
		"\u20e3\u20e3\u20e7\u20f2\u2cf1\u2cf3\u2d81\u2d81\u2de2\u2e01\u302c\u3031"+
		"\u309b\u309c\ua622\ua62b\ua671\ua671\ua676\ua67f\ua6a0\ua6a1\ua6f2\ua6f3"+
		"\ua804\ua804\ua808\ua808\ua80d\ua80d\ua825\ua829\ua882\ua883\ua8b6\ua8c7"+
		"\ua8d2\ua8db\ua8e2\ua8f3\ua902\ua90b\ua928\ua92f\ua949\ua955\ua982\ua985"+
		"\ua9b5\ua9c2\ua9d2\ua9db\ua9e7\ua9e7\ua9f2\ua9fb\uaa2b\uaa38\uaa45\uaa45"+
		"\uaa4e\uaa4f\uaa52\uaa5b\uaa7d\uaa7f\uaab2\uaab2\uaab4\uaab6\uaab9\uaaba"+
		"\uaac0\uaac1\uaac3\uaac3\uaaed\uaaf1\uaaf7\uaaf8\uabe5\uabec\uabee\uabef"+
		"\uabf2\uabfb\ufb20\ufb20\ufe02\ufe11\ufe22\ufe31\uff01\uff01\uff12\uff1b"+
		"\ufffb\ufffd\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u044a\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2\u009d\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b9\3"+
		"\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2"+
		"\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7"+
		"\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2"+
		"\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9"+
		"\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2"+
		"\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb"+
		"\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2"+
		"\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d"+
		"\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113\3\2\2\2\2\u0115\3\2\2"+
		"\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011b\3\2\2\2\2\u011d\3\2\2\2\2\u011f"+
		"\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2\2\2\u0129\3\2\2\2\2\u012b\3\2\2"+
		"\2\2\u012d\3\2\2\2\2\u012f\3\2\2\2\2\u0131\3\2\2\2\3\u0133\3\2\2\2\5\u0138"+
		"\3\2\2\2\7\u013e\3\2\2\2\t\u0147\3\2\2\2\13\u0151\3\2\2\2\r\u015a\3\2"+
		"\2\2\17\u0167\3\2\2\2\21\u016e\3\2\2\2\23\u0173\3\2\2\2\25\u017b\3\2\2"+
		"\2\27\u0182\3\2\2\2\31\u0189\3\2\2\2\33\u018e\3\2\2\2\35\u0197\3\2\2\2"+
		"\37\u01a0\3\2\2\2!\u01a8\3\2\2\2#\u01ad\3\2\2\2%\u01b2\3\2\2\2\'\u01b9"+
		"\3\2\2\2)\u01be\3\2\2\2+\u01c4\3\2\2\2-\u01cb\3\2\2\2/\u01d1\3\2\2\2\61"+
		"\u01d5\3\2\2\2\63\u01de\3\2\2\2\65\u01e4\3\2\2\2\67\u01ec\3\2\2\29\u01f2"+
		"\3\2\2\2;\u01f6\3\2\2\2=\u01f9\3\2\2\2?\u0202\3\2\2\2A\u020a\3\2\2\2C"+
		"\u0215\3\2\2\2E\u021a\3\2\2\2G\u0224\3\2\2\2I\u022a\3\2\2\2K\u022e\3\2"+
		"\2\2M\u0236\3\2\2\2O\u023f\3\2\2\2Q\u0249\3\2\2\2S\u0250\3\2\2\2U\u0257"+
		"\3\2\2\2W\u025f\3\2\2\2Y\u0266\3\2\2\2[\u026a\3\2\2\2]\u026f\3\2\2\2_"+
		"\u0275\3\2\2\2a\u0279\3\2\2\2c\u027e\3\2\2\2e\u0287\3\2\2\2g\u0289\3\2"+
		"\2\2i\u028d\3\2\2\2k\u0291\3\2\2\2m\u0295\3\2\2\2o\u0299\3\2\2\2q\u02a5"+
		"\3\2\2\2s\u02a7\3\2\2\2u\u02b0\3\2\2\2w\u02b2\3\2\2\2y\u02b5\3\2\2\2{"+
		"\u02bb\3\2\2\2}\u02be\3\2\2\2\177\u02c2\3\2\2\2\u0081\u02c6\3\2\2\2\u0083"+
		"\u02cd\3\2\2\2\u0085\u02d0\3\2\2\2\u0087\u02d6\3\2\2\2\u0089\u02d8\3\2"+
		"\2\2\u008b\u02de\3\2\2\2\u008d\u02e5\3\2\2\2\u008f\u02e8\3\2\2\2\u0091"+
		"\u02ee\3\2\2\2\u0093\u02f0\3\2\2\2\u0095\u02f4\3\2\2\2\u0097\u02fb\3\2"+
		"\2\2\u0099\u02fe\3\2\2\2\u009b\u0304\3\2\2\2\u009d\u0308\3\2\2\2\u009f"+
		"\u0325\3\2\2\2\u00a1\u0327\3\2\2\2\u00a3\u032a\3\2\2\2\u00a5\u032d\3\2"+
		"\2\2\u00a7\u0331\3\2\2\2\u00a9\u0333\3\2\2\2\u00ab\u0335\3\2\2\2\u00ad"+
		"\u0345\3\2\2\2\u00af\u0347\3\2\2\2\u00b1\u034a\3\2\2\2\u00b3\u0355\3\2"+
		"\2\2\u00b5\u035f\3\2\2\2\u00b7\u0361\3\2\2\2\u00b9\u0363\3\2\2\2\u00bb"+
		"\u036a\3\2\2\2\u00bd\u0370\3\2\2\2\u00bf\u0376\3\2\2\2\u00c1\u0383\3\2"+
		"\2\2\u00c3\u0385\3\2\2\2\u00c5\u0387\3\2\2\2\u00c7\u0392\3\2\2\2\u00c9"+
		"\u0397\3\2\2\2\u00cb\u0399\3\2\2\2\u00cd\u039b\3\2\2\2\u00cf\u039d\3\2"+
		"\2\2\u00d1\u039f\3\2\2\2\u00d3\u03a1\3\2\2\2\u00d5\u03a3\3\2\2\2\u00d7"+
		"\u03a5\3\2\2\2\u00d9\u03a7\3\2\2\2\u00db\u03a9\3\2\2\2\u00dd\u03ab\3\2"+
		"\2\2\u00df\u03ad\3\2\2\2\u00e1\u03af\3\2\2\2\u00e3\u03b1\3\2\2\2\u00e5"+
		"\u03b3\3\2\2\2\u00e7\u03b5\3\2\2\2\u00e9\u03b7\3\2\2\2\u00eb\u03ba\3\2"+
		"\2\2\u00ed\u03bd\3\2\2\2\u00ef\u03c0\3\2\2\2\u00f1\u03c3\3\2\2\2\u00f3"+
		"\u03c6\3\2\2\2\u00f5\u03c9\3\2\2\2\u00f7\u03cc\3\2\2\2\u00f9\u03cf\3\2"+
		"\2\2\u00fb\u03d1\3\2\2\2\u00fd\u03d3\3\2\2\2\u00ff\u03d5\3\2\2\2\u0101"+
		"\u03d7\3\2\2\2\u0103\u03d9\3\2\2\2\u0105\u03db\3\2\2\2\u0107\u03dd\3\2"+
		"\2\2\u0109\u03df\3\2\2\2\u010b\u03e2\3\2\2\2\u010d\u03e5\3\2\2\2\u010f"+
		"\u03e8\3\2\2\2\u0111\u03eb\3\2\2\2\u0113\u03ee\3\2\2\2\u0115\u03f1\3\2"+
		"\2\2\u0117\u03f4\3\2\2\2\u0119\u03f7\3\2\2\2\u011b\u03fa\3\2\2\2\u011d"+
		"\u03fd\3\2\2\2\u011f\u0401\3\2\2\2\u0121\u0405\3\2\2\2\u0123\u040a\3\2"+
		"\2\2\u0125\u0412\3\2\2\2\u0127\u0416\3\2\2\2\u0129\u0418\3\2\2\2\u012b"+
		"\u041a\3\2\2\2\u012d\u041f\3\2\2\2\u012f\u0425\3\2\2\2\u0131\u0433\3\2"+
		"\2\2\u0133\u0134\7d\2\2\u0134\u0135\7{\2\2\u0135\u0136\7v\2\2\u0136\u0137"+
		"\7g\2\2\u0137\4\3\2\2\2\u0138\u0139\7u\2\2\u0139\u013a\7j\2\2\u013a\u013b"+
		"\7q\2\2\u013b\u013c\7t\2\2\u013c\u013d\7v\2\2\u013d\6\3\2\2\2\u013e\u013f"+
		"\7u\2\2\u013f\u0140\7v\2\2\u0140\u0141\7t\2\2\u0141\u0142\7k\2\2\u0142"+
		"\u0143\7e\2\2\u0143\u0144\7v\2\2\u0144\u0145\7h\2\2\u0145\u0146\7r\2\2"+
		"\u0146\b\3\2\2\2\u0147\u0148\7v\2\2\u0148\u0149\7t\2\2\u0149\u014a\7c"+
		"\2\2\u014a\u014b\7p\2\2\u014b\u014c\7u\2\2\u014c\u014d\7k\2\2\u014d\u014e"+
		"\7g\2\2\u014e\u014f\7p\2\2\u014f\u0150\7v\2\2\u0150\n\3\2\2\2\u0151\u0152"+
		"\7x\2\2\u0152\u0153\7q\2\2\u0153\u0154\7n\2\2\u0154\u0155\7c\2\2\u0155"+
		"\u0156\7v\2\2\u0156\u0157\7k\2\2\u0157\u0158\7n\2\2\u0158\u0159\7g\2\2"+
		"\u0159\f\3\2\2\2\u015a\u015b\7u\2\2\u015b\u015c\7{\2\2\u015c\u015d\7p"+
		"\2\2\u015d\u015e\7e\2\2\u015e\u015f\7j\2\2\u015f\u0160\7t\2\2\u0160\u0161"+
		"\7q\2\2\u0161\u0162\7p\2\2\u0162\u0163\7k\2\2\u0163\u0164\7|\2\2\u0164"+
		"\u0165\7g\2\2\u0165\u0166\7f\2\2\u0166\16\3\2\2\2\u0167\u0168\7p\2\2\u0168"+
		"\u0169\7c\2\2\u0169\u016a\7v\2\2\u016a\u016b\7k\2\2\u016b\u016c\7x\2\2"+
		"\u016c\u016d\7g\2\2\u016d\20\3\2\2\2\u016e\u016f\7g\2\2\u016f\u0170\7"+
		"p\2\2\u0170\u0171\7w\2\2\u0171\u0172\7o\2\2\u0172\22\3\2\2\2\u0173\u0174"+
		"\7f\2\2\u0174\u0175\7g\2\2\u0175\u0176\7h\2\2\u0176\u0177\7c\2\2\u0177"+
		"\u0178\7w\2\2\u0178\u0179\7n\2\2\u0179\u017a\7v\2\2\u017a\24\3\2\2\2\u017b"+
		"\u017c\7c\2\2\u017c\u017d\7u\2\2\u017d\u017e\7u\2\2\u017e\u017f\7g\2\2"+
		"\u017f\u0180\7t\2\2\u0180\u0181\7v\2\2\u0181\26\3\2\2\2\u0182\u0183\7"+
		"u\2\2\u0183\u0184\7y\2\2\u0184\u0185\7k\2\2\u0185\u0186\7v\2\2\u0186\u0187"+
		"\7e\2\2\u0187\u0188\7j\2\2\u0188\30\3\2\2\2\u0189\u018a\7e\2\2\u018a\u018b"+
		"\7c\2\2\u018b\u018c\7u\2\2\u018c\u018d\7g\2\2\u018d\32\3\2\2\2\u018e\u018f"+
		"\7e\2\2\u018f\u0190\7q\2\2\u0190\u0191\7p\2\2\u0191\u0192\7v\2\2\u0192"+
		"\u0193\7k\2\2\u0193\u0194\7p\2\2\u0194\u0195\7w\2\2\u0195\u0196\7g\2\2"+
		"\u0196\34\3\2\2\2\u0197\u0198\7c\2\2\u0198\u0199\7d\2\2\u0199\u019a\7"+
		"u\2\2\u019a\u019b\7v\2\2\u019b\u019c\7t\2\2\u019c\u019d\7c\2\2\u019d\u019e"+
		"\7e\2\2\u019e\u019f\7e\2\2\u019f\36\3\2\2\2\u01a0\u01a1\7d\2\2\u01a1\u01a2"+
		"\7q\2\2\u01a2\u01a3\7q\2\2\u01a3\u01a4\7n\2\2\u01a4\u01a5\7{\2\2\u01a5"+
		"\u01a6\7c\2\2\u01a6\u01a7\7p\2\2\u01a7 \3\2\2\2\u01a8\u01a9\7d\2\2\u01a9"+
		"\u01aa\7t\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ac\7m\2\2\u01ac\"\3\2\2\2\u01ad"+
		"\u01ae\7e\2\2\u01ae\u01af\7c\2\2\u01af\u01b0\7v\2\2\u01b0\u01b1\7u\2\2"+
		"\u01b1$\3\2\2\2\u01b2\u01b3\7e\2\2\u01b3\u01b4\7j\2\2\u01b4\u01b5\7c\2"+
		"\2\u01b5\u01b6\7t\2\2\u01b6\u01b7\7q\2\2\u01b7\u01b8\7v\2\2\u01b8&\3\2"+
		"\2\2\u01b9\u01ba\7m\2\2\u01ba\u01bb\7n\2\2\u01bb\u01bc\7c\2\2\u01bc\u01bd"+
		"\7u\2\2\u01bd(\3\2\2\2\u01be\u01bf\7m\2\2\u01bf\u01c0\7q\2\2\u01c0\u01c1"+
		"\7p\2\2\u01c1\u01c2\7u\2\2\u01c2\u01c3\7v\2\2\u01c3*\3\2\2\2\u01c4\u01c5"+
		"\7f\2\2\u01c5\u01c6\7w\2\2\u01c6\u01c7\7f\2\2\u01c7\u01c8\7w\2\2\u01c8"+
		"\u01c9\7f\2\2\u01c9\u01ca\7w\2\2\u01ca,\3\2\2\2\u01cb\u01cc\7f\2\2\u01cc"+
		"\u01cd\7w\2\2\u01cd\u01ce\7d\2\2\u01ce\u01cf\7q\2\2\u01cf\u01d0\7n\2\2"+
		"\u01d0.\3\2\2\2\u01d1\u01d2\7k\2\2\u01d2\u01d3\7n\2\2\u01d3\u01d4\7u\2"+
		"\2\u01d4\60\3\2\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7\7m\2\2\u01d7\u01d8"+
		"\7u\2\2\u01d8\u01d9\7v\2\2\u01d9\u01da\7k\2\2\u01da\u01db\7p\2\2\u01db"+
		"\u01dc\7f\2\2\u01dc\u01dd\7u\2\2\u01dd\62\3\2\2\2\u01de\u01df\7r\2\2\u01df"+
		"\u01e0\7k\2\2\u01e0\u01e1\7p\2\2\u01e1\u01e2\7c\2\2\u01e2\u01e3\7n\2\2"+
		"\u01e3\64\3\2\2\2\u01e4\u01e5\7r\2\2\u01e5\u01e6\7k\2\2\u01e6\u01e7\7"+
		"p\2\2\u01e7\u01e8\7c\2\2\u01e8\u01e9\7n\2\2\u01e9\u01ea\7n\2\2\u01ea\u01eb"+
		"\7{\2\2\u01eb\66\3\2\2\2\u01ec\u01ed\7r\2\2\u01ed\u01ee\7n\2\2\u01ee\u01ef"+
		"\7w\2\2\u01ef\u01f0\7v\2\2\u01f0\u01f1\7g\2\2\u01f18\3\2\2\2\u01f2\u01f3"+
		"\7r\2\2\u01f3\u01f4\7q\2\2\u01f4\u01f5\7t\2\2\u01f5:\3\2\2\2\u01f6\u01f7"+
		"\7k\2\2\u01f7\u01f8\7r\2\2\u01f8<\3\2\2\2\u01f9\u01fa\7k\2\2\u01fa\u01fb"+
		"\7o\2\2\u01fb\u01fc\7r\2\2\u01fc\u01fd\7n\2\2\u01fd\u01fe\7c\2\2\u01fe"+
		"\u01ff\7p\2\2\u01ff\u0200\7v\2\2\u0200\u0201\7u\2\2\u0201>\3\2\2\2\u0202"+
		"\u0203\7k\2\2\u0203\u0204\7o\2\2\u0204\u0205\7r\2\2\u0205\u0206\7q\2\2"+
		"\u0206\u0207\7y\2\2\u0207\u0208\7t\2\2\u0208\u0209\7v\2\2\u0209@\3\2\2"+
		"\2\u020a\u020b\7k\2\2\u020b\u020c\7p\2\2\u020c\u020d\7u\2\2\u020d\u020e"+
		"\7v\2\2\u020e\u020f\7c\2\2\u020f\u0210\7p\2\2\u0210\u0211\7e\2\2\u0211"+
		"\u0212\7g\2\2\u0212\u0213\7q\2\2\u0213\u0214\7r\2\2\u0214B\3\2\2\2\u0215"+
		"\u0216\7g\2\2\u0216\u0217\7g\2\2\u0217\u0218\7p\2\2\u0218\u0219\7v\2\2"+
		"\u0219D\3\2\2\2\u021a\u021b\7g\2\2\u021b\u021c\7p\2\2\u021c\u021d\7v\2"+
		"\2\u021d\u021e\7g\2\2\u021e\u021f\7t\2\2\u021f\u0220\7r\2\2\u0220\u0221"+
		"\7g\2\2\u0221\u0222\7{\2\2\u0222\u0223\7u\2\2\u0223F\3\2\2\2\u0224\u0225"+
		"\7n\2\2\u0225\u0226\7w\2\2\u0226\u0227\7w\2\2\u0227\u0228\7p\2\2\u0228"+
		"\u0229\7i\2\2\u0229H\3\2\2\2\u022a\u022b\7p\2\2\u022b\u022c\7{\2\2\u022c"+
		"\u022d\7q\2\2\u022dJ\3\2\2\2\u022e\u022f\7r\2\2\u022f\u0230\7c\2\2\u0230"+
		"\u0231\7m\2\2\u0231\u0232\7g\2\2\u0232\u0233\7{\2\2\u0233\u0234\7f\2\2"+
		"\u0234\u0235\7u\2\2\u0235L\3\2\2\2\u0236\u0237\7r\2\2\u0237\u0238\7t\2"+
		"\2\u0238\u0239\7c\2\2\u0239\u023a\7{\2\2\u023a\u023b\7d\2\2\u023b\u023c"+
		"\7g\2\2\u023c\u023d\7{\2\2\u023d\u023e\7v\2\2\u023eN\3\2\2\2\u023f\u0240"+
		"\7r\2\2\u0240\u0241\7t\2\2\u0241\u0242\7w\2\2\u0242\u0243\7v\2\2\u0243"+
		"\u0244\7k\2\2\u0244\u0245\7m\2\2\u0245\u0246\7v\2\2\u0246\u0247\7k\2\2"+
		"\u0247\u0248\7f\2\2\u0248P\3\2\2\2\u0249\u024a\7r\2\2\u024a\u024b\7c\2"+
		"\2\u024b\u024c\7d\2\2\u024c\u024d\7n\2\2\u024d\u024e\7k\2\2\u024e\u024f"+
		"\7m\2\2\u024fR\3\2\2\2\u0250\u0251\7t\2\2\u0251\u0252\7g\2\2\u0252\u0253"+
		"\7v\2\2\u0253\u0254\7q\2\2\u0254\u0255\7t\2\2\u0255\u0256\7p\2\2\u0256"+
		"T\3\2\2\2\u0257\u0258\7k\2\2\u0258\u0259\7u\2\2\u0259\u025a\7v\2\2\u025a"+
		"\u025b\7c\2\2\u025b\u025c\7v\2\2\u025c\u025d\7k\2\2\u025d\u025e\7m\2\2"+
		"\u025eV\3\2\2\2\u025f\u0260\7u\2\2\u0260\u0261\7q\2\2\u0261\u0262\7w\2"+
		"\2\u0262\u0263\7r\2\2\u0263\u0264\7g\2\2\u0264\u0265\7t\2\2\u0265X\3\2"+
		"\2\2\u0266\u0267\7f\2\2\u0267\u0268\7k\2\2\u0268\u0269\7u\2\2\u0269Z\3"+
		"\2\2\2\u026a\u026b\7v\2\2\u026b\u026c\7j\2\2\u026c\u026d\7t\2\2\u026d"+
		"\u026e\7w\2\2\u026e\\\3\2\2\2\u026f\u0270\7v\2\2\u0270\u0271\7j\2\2\u0271"+
		"\u0272\7t\2\2\u0272\u0273\7w\2\2\u0273\u0274\7u\2\2\u0274^\3\2\2\2\u0275"+
		"\u0276\7v\2\2\u0276\u0277\7t\2\2\u0277\u0278\7{\2\2\u0278`\3\2\2\2\u0279"+
		"\u027a\7d\2\2\u027a\u027b\7q\2\2\u027b\u027c\7k\2\2\u027c\u027d\7f\2\2"+
		"\u027db\3\2\2\2\u027e\u027f\7y\2\2\u027f\u0280\7c\2\2\u0280\u0281\7{\2"+
		"\2\u0281\u0282\7n\2\2\u0282d\3\2\2\2\u0283\u0288\5g\64\2\u0284\u0288\5"+
		"i\65\2\u0285\u0288\5k\66\2\u0286\u0288\5m\67\2\u0287\u0283\3\2\2\2\u0287"+
		"\u0284\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0286\3\2\2\2\u0288f\3\2\2\2"+
		"\u0289\u028b\5q9\2\u028a\u028c\5o8\2\u028b\u028a\3\2\2\2\u028b\u028c\3"+
		"\2\2\2\u028ch\3\2\2\2\u028d\u028f\5\177@\2\u028e\u0290\5o8\2\u028f\u028e"+
		"\3\2\2\2\u028f\u0290\3\2\2\2\u0290j\3\2\2\2\u0291\u0293\5\u0089E\2\u0292"+
		"\u0294\5o8\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294l\3\2\2\2\u0295"+
		"\u0297\5\u0093J\2\u0296\u0298\5o8\2\u0297\u0296\3\2\2\2\u0297\u0298\3"+
		"\2\2\2\u0298n\3\2\2\2\u0299\u029a\t\2\2\2\u029ap\3\2\2\2\u029b\u02a6\7"+
		"\62\2\2\u029c\u02a3\5w<\2\u029d\u029f\5s:\2\u029e\u029d\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u02a4\3\2\2\2\u02a0\u02a1\5}?\2\u02a1\u02a2\5s:\2"+
		"\u02a2\u02a4\3\2\2\2\u02a3\u029e\3\2\2\2\u02a3\u02a0\3\2\2\2\u02a4\u02a6"+
		"\3\2\2\2\u02a5\u029b\3\2\2\2\u02a5\u029c\3\2\2\2\u02a6r\3\2\2\2\u02a7"+
		"\u02ac\5u;\2\u02a8\u02aa\5y=\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2"+
		"\u02aa\u02ab\3\2\2\2\u02ab\u02ad\5u;\2\u02ac\u02a9\3\2\2\2\u02ac\u02ad"+
		"\3\2\2\2\u02adt\3\2\2\2\u02ae\u02b1\7\62\2\2\u02af\u02b1\5w<\2\u02b0\u02ae"+
		"\3\2\2\2\u02b0\u02af\3\2\2\2\u02b1v\3\2\2\2\u02b2\u02b3\t\3\2\2\u02b3"+
		"x\3\2\2\2\u02b4\u02b6\5{>\2\u02b5\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8z\3\2\2\2\u02b9\u02bc\5u;\2\u02ba"+
		"\u02bc\7a\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02ba\3\2\2\2\u02bc|\3\2\2\2\u02bd"+
		"\u02bf\7a\2\2\u02be\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02be\3\2"+
		"\2\2\u02c0\u02c1\3\2\2\2\u02c1~\3\2\2\2\u02c2\u02c3\7\62\2\2\u02c3\u02c4"+
		"\t\4\2\2\u02c4\u02c5\5\u0081A\2\u02c5\u0080\3\2\2\2\u02c6\u02cb\5\u0083"+
		"B\2\u02c7\u02c9\5\u0085C\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cc\5\u0083B\2\u02cb\u02c8\3\2\2\2\u02cb\u02cc"+
		"\3\2\2\2\u02cc\u0082\3\2\2\2\u02cd\u02ce\t\5\2\2\u02ce\u0084\3\2\2\2\u02cf"+
		"\u02d1\5\u0087D\2\u02d0\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d0"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u0086\3\2\2\2\u02d4\u02d7\5\u0083B"+
		"\2\u02d5\u02d7\7a\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d7\u0088"+
		"\3\2\2\2\u02d8\u02da\7\62\2\2\u02d9\u02db\5}?\2\u02da\u02d9\3\2\2\2\u02da"+
		"\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\5\u008bF\2\u02dd\u008a"+
		"\3\2\2\2\u02de\u02e3\5\u008dG\2\u02df\u02e1\5\u008fH\2\u02e0\u02df\3\2"+
		"\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\5\u008dG\2\u02e3"+
		"\u02e0\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u008c\3\2\2\2\u02e5\u02e6\t\6"+
		"\2\2\u02e6\u008e\3\2\2\2\u02e7\u02e9\5\u0091I\2\u02e8\u02e7\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u0090\3\2"+
		"\2\2\u02ec\u02ef\5\u008dG\2\u02ed\u02ef\7a\2\2\u02ee\u02ec\3\2\2\2\u02ee"+
		"\u02ed\3\2\2\2\u02ef\u0092\3\2\2\2\u02f0\u02f1\7\62\2\2\u02f1\u02f2\t"+
		"\7\2\2\u02f2\u02f3\5\u0095K\2\u02f3\u0094\3\2\2\2\u02f4\u02f9\5\u0097"+
		"L\2\u02f5\u02f7\5\u0099M\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8\u02fa\5\u0097L\2\u02f9\u02f6\3\2\2\2\u02f9\u02fa"+
		"\3\2\2\2\u02fa\u0096\3\2\2\2\u02fb\u02fc\t\b\2\2\u02fc\u0098\3\2\2\2\u02fd"+
		"\u02ff\5\u009bN\2\u02fe\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u02fe"+
		"\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u009a\3\2\2\2\u0302\u0305\5\u0097L"+
		"\2\u0303\u0305\7a\2\2\u0304\u0302\3\2\2\2\u0304\u0303\3\2\2\2\u0305\u009c"+
		"\3\2\2\2\u0306\u0309\5\u009fP\2\u0307\u0309\5\u00abV\2\u0308\u0306\3\2"+
		"\2\2\u0308\u0307\3\2\2\2\u0309\u009e\3\2\2\2\u030a\u030b\5s:\2\u030b\u030d"+
		"\7\60\2\2\u030c\u030e\5s:\2\u030d\u030c\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u0310\3\2\2\2\u030f\u0311\5\u00a1Q\2\u0310\u030f\3\2\2\2\u0310\u0311"+
		"\3\2\2\2\u0311\u0313\3\2\2\2\u0312\u0314\5\u00a9U\2\u0313\u0312\3\2\2"+
		"\2\u0313\u0314\3\2\2\2\u0314\u0326\3\2\2\2\u0315\u0316\7\60\2\2\u0316"+
		"\u0318\5s:\2\u0317\u0319\5\u00a1Q\2\u0318\u0317\3\2\2\2\u0318\u0319\3"+
		"\2\2\2\u0319\u031b\3\2\2\2\u031a\u031c\5\u00a9U\2\u031b\u031a\3\2\2\2"+
		"\u031b\u031c\3\2\2\2\u031c\u0326\3\2\2\2\u031d\u031e\5s:\2\u031e\u0320"+
		"\5\u00a1Q\2\u031f\u0321\5\u00a9U\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2"+
		"\2\2\u0321\u0326\3\2\2\2\u0322\u0323\5s:\2\u0323\u0324\5\u00a9U\2\u0324"+
		"\u0326\3\2\2\2\u0325\u030a\3\2\2\2\u0325\u0315\3\2\2\2\u0325\u031d\3\2"+
		"\2\2\u0325\u0322\3\2\2\2\u0326\u00a0\3\2\2\2\u0327\u0328\5\u00a3R\2\u0328"+
		"\u0329\5\u00a5S\2\u0329\u00a2\3\2\2\2\u032a\u032b\t\t\2\2\u032b\u00a4"+
		"\3\2\2\2\u032c\u032e\5\u00a7T\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2"+
		"\2\u032e\u032f\3\2\2\2\u032f\u0330\5s:\2\u0330\u00a6\3\2\2\2\u0331\u0332"+
		"\t\n\2\2\u0332\u00a8\3\2\2\2\u0333\u0334\t\13\2\2\u0334\u00aa\3\2\2\2"+
		"\u0335\u0336\5\u00adW\2\u0336\u0338\5\u00afX\2\u0337\u0339\5\u00a9U\2"+
		"\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u00ac\3\2\2\2\u033a\u033c"+
		"\5\177@\2\u033b\u033d\7\60\2\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2"+
		"\u033d\u0346\3\2\2\2\u033e\u033f\7\62\2\2\u033f\u0341\t\4\2\2\u0340\u0342"+
		"\5\u0081A\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2"+
		"\2\u0343\u0344\7\60\2\2\u0344\u0346\5\u0081A\2\u0345\u033a\3\2\2\2\u0345"+
		"\u033e\3\2\2\2\u0346\u00ae\3\2\2\2\u0347\u0348\5\u00b1Y\2\u0348\u0349"+
		"\5\u00a5S\2\u0349\u00b0\3\2\2\2\u034a\u034b\t\f\2\2\u034b\u00b2\3\2\2"+
		"\2\u034c\u034d\7v\2\2\u034d\u034e\7t\2\2\u034e\u034f\7w\2\2\u034f\u0356"+
		"\7g\2\2\u0350\u0351\7h\2\2\u0351\u0352\7c\2\2\u0352\u0353\7n\2\2\u0353"+
		"\u0354\7u\2\2\u0354\u0356\7g\2\2\u0355\u034c\3\2\2\2\u0355\u0350\3\2\2"+
		"\2\u0356\u00b4\3\2\2\2\u0357\u0358\7)\2\2\u0358\u0359\5\u00b7\\\2\u0359"+
		"\u035a\7)\2\2\u035a\u0360\3\2\2\2\u035b\u035c\7)\2\2\u035c\u035d\5\u00bf"+
		"`\2\u035d\u035e\7)\2\2\u035e\u0360\3\2\2\2\u035f\u0357\3\2\2\2\u035f\u035b"+
		"\3\2\2\2\u0360\u00b6\3\2\2\2\u0361\u0362\n\r\2\2\u0362\u00b8\3\2\2\2\u0363"+
		"\u0365\7$\2\2\u0364\u0366\5\u00bb^\2\u0365\u0364\3\2\2\2\u0365\u0366\3"+
		"\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\7$\2\2\u0368\u00ba\3\2\2\2\u0369"+
		"\u036b\5\u00bd_\2\u036a\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036a"+
		"\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u00bc\3\2\2\2\u036e\u0371\n\16\2\2"+
		"\u036f\u0371\5\u00bf`\2\u0370\u036e\3\2\2\2\u0370\u036f\3\2\2\2\u0371"+
		"\u00be\3\2\2\2\u0372\u0373\7^\2\2\u0373\u0377\t\17\2\2\u0374\u0377\5\u00c1"+
		"a\2\u0375\u0377\5\u00c5c\2\u0376\u0372\3\2\2\2\u0376\u0374\3\2\2\2\u0376"+
		"\u0375\3\2\2\2\u0377\u00c0\3\2\2\2\u0378\u0379\7^\2\2\u0379\u0384\5\u008d"+
		"G\2\u037a\u037b\7^\2\2\u037b\u037c\5\u008dG\2\u037c\u037d\5\u008dG\2\u037d"+
		"\u0384\3\2\2\2\u037e\u037f\7^\2\2\u037f\u0380\5\u00c3b\2\u0380\u0381\5"+
		"\u008dG\2\u0381\u0382\5\u008dG\2\u0382\u0384\3\2\2\2\u0383\u0378\3\2\2"+
		"\2\u0383\u037a\3\2\2\2\u0383\u037e\3\2\2\2\u0384\u00c2\3\2\2\2\u0385\u0386"+
		"\t\20\2\2\u0386\u00c4\3\2\2\2\u0387\u0389\7^\2\2\u0388\u038a\7w\2\2\u0389"+
		"\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2"+
		"\2\2\u038c\u038d\3\2\2\2\u038d\u038e\5\u0083B\2\u038e\u038f\5\u0083B\2"+
		"\u038f\u0390\5\u0083B\2\u0390\u0391\5\u0083B\2\u0391\u00c6\3\2\2\2\u0392"+
		"\u0393\7p\2\2\u0393\u0394\7w\2\2\u0394\u0395\7n\2\2\u0395\u0396\7n\2\2"+
		"\u0396\u00c8\3\2\2\2\u0397\u0398\7*\2\2\u0398\u00ca\3\2\2\2\u0399\u039a"+
		"\7+\2\2\u039a\u00cc\3\2\2\2\u039b\u039c\7}\2\2\u039c\u00ce\3\2\2\2\u039d"+
		"\u039e\7\177\2\2\u039e\u00d0\3\2\2\2\u039f\u03a0\7]\2\2\u03a0\u00d2\3"+
		"\2\2\2\u03a1\u03a2\7_\2\2\u03a2\u00d4\3\2\2\2\u03a3\u03a4\7=\2\2\u03a4"+
		"\u00d6\3\2\2\2\u03a5\u03a6\7.\2\2\u03a6\u00d8\3\2\2\2\u03a7\u03a8\7\60"+
		"\2\2\u03a8\u00da\3\2\2\2\u03a9\u03aa\7?\2\2\u03aa\u00dc\3\2\2\2\u03ab"+
		"\u03ac\7@\2\2\u03ac\u00de\3\2\2\2\u03ad\u03ae\7>\2\2\u03ae\u00e0\3\2\2"+
		"\2\u03af\u03b0\7#\2\2\u03b0\u00e2\3\2\2\2\u03b1\u03b2\7\u0080\2\2\u03b2"+
		"\u00e4\3\2\2\2\u03b3\u03b4\7A\2\2\u03b4\u00e6\3\2\2\2\u03b5\u03b6\7<\2"+
		"\2\u03b6\u00e8\3\2\2\2\u03b7\u03b8\7?\2\2\u03b8\u03b9\7?\2\2\u03b9\u00ea"+
		"\3\2\2\2\u03ba\u03bb\7>\2\2\u03bb\u03bc\7?\2\2\u03bc\u00ec\3\2\2\2\u03bd"+
		"\u03be\7@\2\2\u03be\u03bf\7?\2\2\u03bf\u00ee\3\2\2\2\u03c0\u03c1\7#\2"+
		"\2\u03c1\u03c2\7?\2\2\u03c2\u00f0\3\2\2\2\u03c3\u03c4\7(\2\2\u03c4\u03c5"+
		"\7(\2\2\u03c5\u00f2\3\2\2\2\u03c6\u03c7\7~\2\2\u03c7\u03c8\7~\2\2\u03c8"+
		"\u00f4\3\2\2\2\u03c9\u03ca\7-\2\2\u03ca\u03cb\7-\2\2\u03cb\u00f6\3\2\2"+
		"\2\u03cc\u03cd\7/\2\2\u03cd\u03ce\7/\2\2\u03ce\u00f8\3\2\2\2\u03cf\u03d0"+
		"\7-\2\2\u03d0\u00fa\3\2\2\2\u03d1\u03d2\7/\2\2\u03d2\u00fc\3\2\2\2\u03d3"+
		"\u03d4\7,\2\2\u03d4\u00fe\3\2\2\2\u03d5\u03d6\7\61\2\2\u03d6\u0100\3\2"+
		"\2\2\u03d7\u03d8\7(\2\2\u03d8\u0102\3\2\2\2\u03d9\u03da\7~\2\2\u03da\u0104"+
		"\3\2\2\2\u03db\u03dc\7`\2\2\u03dc\u0106\3\2\2\2\u03dd\u03de\7\'\2\2\u03de"+
		"\u0108\3\2\2\2\u03df\u03e0\7/\2\2\u03e0\u03e1\7@\2\2\u03e1\u010a\3\2\2"+
		"\2\u03e2\u03e3\7<\2\2\u03e3\u03e4\7<\2\2\u03e4\u010c\3\2\2\2\u03e5\u03e6"+
		"\7-\2\2\u03e6\u03e7\7?\2\2\u03e7\u010e\3\2\2\2\u03e8\u03e9\7/\2\2\u03e9"+
		"\u03ea\7?\2\2\u03ea\u0110\3\2\2\2\u03eb\u03ec\7,\2\2\u03ec\u03ed\7?\2"+
		"\2\u03ed\u0112\3\2\2\2\u03ee\u03ef\7\61\2\2\u03ef\u03f0\7?\2\2\u03f0\u0114"+
		"\3\2\2\2\u03f1\u03f2\7(\2\2\u03f2\u03f3\7?\2\2\u03f3\u0116\3\2\2\2\u03f4"+
		"\u03f5\7~\2\2\u03f5\u03f6\7?\2\2\u03f6\u0118\3\2\2\2\u03f7\u03f8\7`\2"+
		"\2\u03f8\u03f9\7?\2\2\u03f9\u011a\3\2\2\2\u03fa\u03fb\7\'\2\2\u03fb\u03fc"+
		"\7?\2\2\u03fc\u011c\3\2\2\2\u03fd\u03fe\7>\2\2\u03fe\u03ff\7>\2\2\u03ff"+
		"\u0400\7?\2\2\u0400\u011e\3\2\2\2\u0401\u0402\7@\2\2\u0402\u0403\7@\2"+
		"\2\u0403\u0404\7?\2\2\u0404\u0120\3\2\2\2\u0405\u0406\7@\2\2\u0406\u0407"+
		"\7@\2\2\u0407\u0408\7@\2\2\u0408\u0409\7?\2\2\u0409\u0122\3\2\2\2\u040a"+
		"\u040e\5\u0125\u0093\2\u040b\u040d\5\u0127\u0094\2\u040c\u040b\3\2\2\2"+
		"\u040d\u0410\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0124"+
		"\3\2\2\2\u0410\u040e\3\2\2\2\u0411\u0413\t\21\2\2\u0412\u0411\3\2\2\2"+
		"\u0413\u0126\3\2\2\2\u0414\u0417\5\u0125\u0093\2\u0415\u0417\t\22\2\2"+
		"\u0416\u0414\3\2\2\2\u0416\u0415\3\2\2\2\u0417\u0128\3\2\2\2\u0418\u0419"+
		"\7B\2\2\u0419\u012a\3\2\2\2\u041a\u041b\7\60\2\2\u041b\u041c\7\60\2\2"+
		"\u041c\u041d\7\60\2\2\u041d\u012c\3\2\2\2\u041e\u0420\t\23\2\2\u041f\u041e"+
		"\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422"+
		"\u0423\3\2\2\2\u0423\u0424\b\u0097\2\2\u0424\u012e\3\2\2\2\u0425\u0426"+
		"\7\61\2\2\u0426\u0427\7,\2\2\u0427\u042b\3\2\2\2\u0428\u042a\13\2\2\2"+
		"\u0429\u0428\3\2\2\2\u042a\u042d\3\2\2\2\u042b\u042c\3\2\2\2\u042b\u0429"+
		"\3\2\2\2\u042c\u042e\3\2\2\2\u042d\u042b\3\2\2\2\u042e\u042f\7,\2\2\u042f"+
		"\u0430\7\61\2\2\u0430\u0431\3\2\2\2\u0431\u0432\b\u0098\2\2\u0432\u0130"+
		"\3\2\2\2\u0433\u0434\7\61\2\2\u0434\u0435\7\61\2\2\u0435\u0439\3\2\2\2"+
		"\u0436\u0438\n\24\2\2\u0437\u0436\3\2\2\2\u0438\u043b\3\2\2\2\u0439\u0437"+
		"\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043c\3\2\2\2\u043b\u0439\3\2\2\2\u043c"+
		"\u043d\b\u0099\2\2\u043d\u0132\3\2\2\29\2\u0287\u028b\u028f\u0293\u0297"+
		"\u029e\u02a3\u02a5\u02a9\u02ac\u02b0\u02b7\u02bb\u02c0\u02c8\u02cb\u02d2"+
		"\u02d6\u02da\u02e0\u02e3\u02ea\u02ee\u02f6\u02f9\u0300\u0304\u0308\u030d"+
		"\u0310\u0313\u0318\u031b\u0320\u0325\u032d\u0338\u033c\u0341\u0345\u0355"+
		"\u035f\u0365\u036c\u0370\u0376\u0383\u038b\u040e\u0412\u0416\u0421\u042b"+
		"\u0439\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
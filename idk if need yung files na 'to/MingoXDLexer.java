// Generated from C:/Users/Josh/IdeaProjects/CMPILER-MP\MingoXDLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MingoXDLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, BOOLEAN=2, BREAK=3, CATCH=4, CHAR=5, CLASS=6, CONST=7, DO=8, 
		DOUBLE=9, ELSE=10, EXTENDS=11, FINAL=12, FINALLY=13, FLOAT=14, FOR=15, 
		IF=16, IMPLEMENTS=17, IMPORT=18, INSTANCEOF=19, INT=20, INTERFACE=21, 
		LONG=22, NEW=23, PACKAGE=24, PRIVATE=25, PROTECTED=26, PUBLIC=27, RETURN=28, 
		STATIC=29, SUPER=30, THIS=31, THROW=32, THROWS=33, TRY=34, VOID=35, WHILE=36, 
		CASE=37, ENUM=38, NATIVE=39, VOLATILE=40, TRANSIENT=41, STRICTFP=42, BYTE=43, 
		CONTINUE=44, DEFAULT=45, ASSERT=46, SWITCH=47, SYNCHRONIZED=48, SHORT=49, 
		Keyword=50, Operator=51, Literal=52, IntegerLiteral=53, FloatingPointLiteral=54, 
		BooleanLiteral=55, CharacterLiteral=56, StringLiteral=57, NullLiteral=58, 
		LPAREN=59, RPAREN=60, LBRACE=61, RBRACE=62, LBRACK=63, RBRACK=64, SEMI=65, 
		COMMA=66, DOT=67, ASSIGN=68, GT=69, LT=70, BANG=71, TILDE=72, QUESTION=73, 
		COLON=74, EQUAL=75, LE=76, GE=77, NOTEQUAL=78, AND=79, OR=80, INC=81, 
		DEC=82, ADD=83, SUB=84, MUL=85, DIV=86, BITAND=87, BITOR=88, CARET=89, 
		MOD=90, ARROW=91, COLONCOLON=92, ADD_ASSIGN=93, SUB_ASSIGN=94, MUL_ASSIGN=95, 
		DIV_ASSIGN=96, AND_ASSIGN=97, OR_ASSIGN=98, XOR_ASSIGN=99, MOD_ASSIGN=100, 
		LSHIFT_ASSIGN=101, RSHIFT_ASSIGN=102, URSHIFT_ASSIGN=103, Identifier=104, 
		AT=105, ELLIPSIS=106, WS=107, COMMENT=108, LINE_COMMENT=109;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ABSTRACT", "BOOLEAN", "BREAK", "CATCH", "CHAR", "CLASS", "CONST", "DO", 
			"DOUBLE", "ELSE", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NEW", 
			"PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "STATIC", "SUPER", 
			"THIS", "THROW", "THROWS", "TRY", "VOID", "WHILE", "CASE", "ENUM", "NATIVE", 
			"VOLATILE", "TRANSIENT", "STRICTFP", "BYTE", "CONTINUE", "DEFAULT", "ASSERT", 
			"SWITCH", "SYNCHRONIZED", "SHORT", "Keyword", "Operator", "Literal", 
			"IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
			"BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits", 
			"Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
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
			null, "'abstracc'", "'boolyan'", "'brik'", "'cats'", "'charot'", "'klas'", 
			"'konst'", "'dududu'", "'dubol'", "'ils'", "'ekstinds'", "'pinal'", "'pinally'", 
			"'plute'", "'por'", "'ip'", "'implants'", "'impowrt'", "'instanceop'", 
			"'eent'", "'enterpeys'", "'luung'", "'nyo'", "'pakeyds'", "'praybeyt'", 
			"'prutiktid'", "'pablik'", "'retorn'", "'istatik'", "'souper'", "'dis'", 
			"'thru'", "'thrus'", "'try'", "'boid'", "'wayl'", "'case'", "'enum'", 
			"'native'", "'volatile'", "'transient'", "'strictfp'", "'byte'", "'continue'", 
			"'default'", "'assert'", "'switch'", "'synchronized'", "'short'", null, 
			null, null, null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
			"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			"'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
			"'%='", "'<<='", "'>>='", "'>>>='", null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "BOOLEAN", "BREAK", "CATCH", "CHAR", "CLASS", "CONST", 
			"DO", "DOUBLE", "ELSE", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", 
			"IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "STATIC", 
			"SUPER", "THIS", "THROW", "THROWS", "TRY", "VOID", "WHILE", "CASE", "ENUM", 
			"NATIVE", "VOLATILE", "TRANSIENT", "STRICTFP", "BYTE", "CONTINUE", "DEFAULT", 
			"ASSERT", "SWITCH", "SYNCHRONIZED", "SHORT", "Keyword", "Operator", "Literal", 
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


	public MingoXDLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MingoXDLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2o\u0494\b\1\4\2\t"+
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
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\5\63\u02ae\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\5\64\u02cb\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\5\65\u02d8\n\65\3\66\3\66\3\66\3\66\5\66\u02de\n\66\3"+
		"\67\3\67\5\67\u02e2\n\67\38\38\58\u02e6\n8\39\39\59\u02ea\n9\3:\3:\5:"+
		"\u02ee\n:\3;\3;\3<\3<\3<\5<\u02f5\n<\3<\3<\3<\5<\u02fa\n<\5<\u02fc\n<"+
		"\3=\3=\5=\u0300\n=\3=\5=\u0303\n=\3>\3>\5>\u0307\n>\3?\3?\3@\6@\u030c"+
		"\n@\r@\16@\u030d\3A\3A\5A\u0312\nA\3B\6B\u0315\nB\rB\16B\u0316\3C\3C\3"+
		"C\3C\3D\3D\5D\u031f\nD\3D\5D\u0322\nD\3E\3E\3F\6F\u0327\nF\rF\16F\u0328"+
		"\3G\3G\5G\u032d\nG\3H\3H\5H\u0331\nH\3H\3H\3I\3I\5I\u0337\nI\3I\5I\u033a"+
		"\nI\3J\3J\3K\6K\u033f\nK\rK\16K\u0340\3L\3L\5L\u0345\nL\3M\3M\3M\3M\3"+
		"N\3N\5N\u034d\nN\3N\5N\u0350\nN\3O\3O\3P\6P\u0355\nP\rP\16P\u0356\3Q\3"+
		"Q\5Q\u035b\nQ\3R\3R\5R\u035f\nR\3S\3S\3S\5S\u0364\nS\3S\5S\u0367\nS\3"+
		"S\5S\u036a\nS\3S\3S\3S\5S\u036f\nS\3S\5S\u0372\nS\3S\3S\3S\5S\u0377\n"+
		"S\3S\3S\3S\5S\u037c\nS\3T\3T\3T\3U\3U\3V\5V\u0384\nV\3V\3V\3W\3W\3X\3"+
		"X\3Y\3Y\3Y\5Y\u038f\nY\3Z\3Z\5Z\u0393\nZ\3Z\3Z\3Z\5Z\u0398\nZ\3Z\3Z\5"+
		"Z\u039c\nZ\3[\3[\3[\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u03ac\n]\3^"+
		"\3^\3^\3^\3^\3^\3^\3^\5^\u03b6\n^\3_\3_\3`\3`\5`\u03bc\n`\3`\3`\3a\6a"+
		"\u03c1\na\ra\16a\u03c2\3b\3b\5b\u03c7\nb\3c\3c\3c\3c\5c\u03cd\nc\3d\3"+
		"d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u03da\nd\3e\3e\3f\3f\6f\u03e0\nf\rf\16"+
		"f\u03e1\3f\3f\3f\3f\3f\3g\3g\3g\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3"+
		"m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3"+
		"x\3x\3y\3y\3y\3z\3z\3z\3{\3{\3{\3|\3|\3|\3}\3}\3}\3~\3~\3~\3\177\3\177"+
		"\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088"+
		"\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\7\u0095"+
		"\u0463\n\u0095\f\u0095\16\u0095\u0466\13\u0095\3\u0096\5\u0096\u0469\n"+
		"\u0096\3\u0097\3\u0097\5\u0097\u046d\n\u0097\3\u0098\3\u0098\3\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u009a\6\u009a\u0476\n\u009a\r\u009a\16\u009a"+
		"\u0477\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\7\u009b\u0480\n"+
		"\u009b\f\u009b\16\u009b\u0483\13\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\7\u009c\u048e\n\u009c\f\u009c"+
		"\16\u009c\u0491\13\u009c\3\u009c\3\u009c\3\u0481\2\u009d\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m\2o\2q\2s\2u\2"+
		"w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d"+
		"\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f"+
		"\2\u00a1\2\u00a38\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1"+
		"\2\u00b3\2\u00b5\2\u00b7\2\u00b99\u00bb:\u00bd\2\u00bf;\u00c1\2\u00c3"+
		"\2\u00c5\2\u00c7\2\u00c9\2\u00cb\2\u00cd<\u00cf=\u00d1>\u00d3?\u00d5@"+
		"\u00d7A\u00d9B\u00dbC\u00ddD\u00dfE\u00e1F\u00e3G\u00e5H\u00e7I\u00e9"+
		"J\u00ebK\u00edL\u00efM\u00f1N\u00f3O\u00f5P\u00f7Q\u00f9R\u00fbS\u00fd"+
		"T\u00ffU\u0101V\u0103W\u0105X\u0107Y\u0109Z\u010b[\u010d\\\u010f]\u0111"+
		"^\u0113_\u0115`\u0117a\u0119b\u011bc\u011dd\u011fe\u0121f\u0123g\u0125"+
		"h\u0127i\u0129j\u012b\2\u012d\2\u012fk\u0131l\u0133m\u0135n\u0137o\3\2"+
		"\25\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2"+
		"GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\n"+
		"\2$$))^^ddhhppttvv\3\2\62\65\u0194\2&&C\\aac|\u00a4\u00a7\u00ac\u00ac"+
		"\u00b7\u00b7\u00bc\u00bc\u00c2\u00d8\u00da\u00f8\u00fa\u02c3\u02c8\u02d3"+
		"\u02e2\u02e6\u02ee\u02ee\u02f0\u02f0\u0372\u0376\u0378\u0379\u037c\u037f"+
		"\u0381\u0381\u0388\u0388\u038a\u038c\u038e\u038e\u0390\u03a3\u03a5\u03f7"+
		"\u03f9\u0483\u048c\u0531\u0533\u0558\u055b\u055b\u0563\u0589\u0591\u0591"+
		"\u05d2\u05ec\u05f2\u05f4\u060d\u060d\u0622\u064c\u0670\u0671\u0673\u06d5"+
		"\u06d7\u06d7\u06e7\u06e8\u06f0\u06f1\u06fc\u06fe\u0701\u0701\u0712\u0712"+
		"\u0714\u0731\u074f\u07a7\u07b3\u07b3\u07cc\u07ec\u07f6\u07f7\u07fc\u07fc"+
		"\u0802\u0817\u081c\u081c\u0826\u0826\u082a\u082a\u0842\u085a\u0862\u086c"+
		"\u08a2\u08b6\u08b8\u08bf\u0906\u093b\u093f\u093f\u0952\u0952\u095a\u0963"+
		"\u0973\u0982\u0987\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2\u09b4\u09b4"+
		"\u09b8\u09bb\u09bf\u09bf\u09d0\u09d0\u09de\u09df\u09e1\u09e3\u09f2\u09f5"+
		"\u09fd\u09fe\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35"+
		"\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87\u0a8f"+
		"\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf\u0abf"+
		"\u0ad2\u0ad2\u0ae2\u0ae3\u0af3\u0af3\u0afb\u0afb\u0b07\u0b0e\u0b11\u0b12"+
		"\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b37\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f"+
		"\u0b61\u0b63\u0b73\u0b73\u0b85\u0b85\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97"+
		"\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bbb"+
		"\u0bd2\u0bd2\u0bfb\u0bfb\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c3b"+
		"\u0c3f\u0c3f\u0c5a\u0c5c\u0c62\u0c63\u0c82\u0c82\u0c87\u0c8e\u0c90\u0c92"+
		"\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0cbf\u0cbf\u0ce0\u0ce0\u0ce2\u0ce3"+
		"\u0cf3\u0cf4\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d3c\u0d3f\u0d3f\u0d50\u0d50"+
		"\u0d56\u0d58\u0d61\u0d63\u0d7c\u0d81\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd"+
		"\u0dbf\u0dbf\u0dc2\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e41\u0e48\u0e83\u0e84"+
		"\u0e86\u0e86\u0e89\u0e8a\u0e8c\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1"+
		"\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5"+
		"\u0ebf\u0ebf\u0ec2\u0ec6\u0ec8\u0ec8\u0ede\u0ee1\u0f02\u0f02\u0f42\u0f49"+
		"\u0f4b\u0f6e\u0f8a\u0f8e\u1002\u102c\u1041\u1041\u1052\u1057\u105c\u105f"+
		"\u1063\u1063\u1067\u1068\u1070\u1072\u1077\u1083\u1090\u1090\u10a2\u10c7"+
		"\u10c9\u10c9\u10cf\u10cf\u10d2\u10fc\u10fe\u124a\u124c\u124f\u1252\u1258"+
		"\u125a\u125a\u125c\u125f\u1262\u128a\u128c\u128f\u1292\u12b2\u12b4\u12b7"+
		"\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7\u12ca\u12d8\u12da\u1312\u1314\u1317"+
		"\u131a\u135c\u1382\u1391\u13a2\u13f7\u13fa\u13ff\u1403\u166e\u1671\u1681"+
		"\u1683\u169c\u16a2\u16ec\u16f0\u16fa\u1702\u170e\u1710\u1713\u1722\u1733"+
		"\u1742\u1753\u1762\u176e\u1770\u1772\u1782\u17b5\u17d9\u17d9\u17dd\u17de"+
		"\u1822\u1879\u1882\u1886\u1889\u18aa\u18ac\u18ac\u18b2\u18f7\u1902\u1920"+
		"\u1952\u196f\u1972\u1976\u1982\u19ad\u19b2\u19cb\u1a02\u1a18\u1a22\u1a56"+
		"\u1aa9\u1aa9\u1b07\u1b35\u1b47\u1b4d\u1b85\u1ba2\u1bb0\u1bb1\u1bbc\u1be7"+
		"\u1c02\u1c25\u1c4f\u1c51\u1c5c\u1c7f\u1c82\u1c8a\u1ceb\u1cee\u1cf0\u1cf3"+
		"\u1cf7\u1cf8\u1d02\u1dc1\u1e02\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f"+
		"\u1f52\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6"+
		"\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd"+
		"\u1fe2\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2041\u2042\u2056\u2056\u2073\u2073"+
		"\u2081\u2081\u2092\u209e\u20a2\u20c1\u2104\u2104\u2109\u2109\u210c\u2115"+
		"\u2117\u2117\u211b\u211f\u2126\u2126\u2128\u2128\u212a\u212a\u212c\u212f"+
		"\u2131\u213b\u213e\u2141\u2147\u214b\u2150\u2150\u2162\u218a\u2c02\u2c30"+
		"\u2c32\u2c60\u2c62\u2ce6\u2ced\u2cf0\u2cf4\u2cf5\u2d02\u2d27\u2d29\u2d29"+
		"\u2d2f\u2d2f\u2d32\u2d69\u2d71\u2d71\u2d82\u2d98\u2da2\u2da8\u2daa\u2db0"+
		"\u2db2\u2db8\u2dba\u2dc0\u2dc2\u2dc8\u2dca\u2dd0\u2dd2\u2dd8\u2dda\u2de0"+
		"\u2e31\u2e31\u3007\u3009\u3023\u302b\u3033\u3037\u303a\u303e\u3043\u3098"+
		"\u309f\u30a1\u30a3\u30fc\u30fe\u3101\u3107\u3130\u3133\u3190\u31a2\u31bc"+
		"\u31f2\u3201\u3402\u4db7\u4e02\u9fec\ua002\ua48e\ua4d2\ua4ff\ua502\ua60e"+
		"\ua612\ua621\ua62c\ua62d\ua642\ua670\ua681\ua69f\ua6a2\ua6f1\ua719\ua721"+
		"\ua724\ua78a\ua78d\ua7b0\ua7b2\ua7b9\ua7f9\ua803\ua805\ua807\ua809\ua80c"+
		"\ua80e\ua824\ua83a\ua83a\ua842\ua875\ua884\ua8b5\ua8f4\ua8f9\ua8fd\ua8fd"+
		"\ua8ff\ua8ff\ua90c\ua927\ua932\ua948\ua962\ua97e\ua986\ua9b4\ua9d1\ua9d1"+
		"\ua9e2\ua9e6\ua9e8\ua9f1\ua9fc\uaa00\uaa02\uaa2a\uaa42\uaa44\uaa46\uaa4d"+
		"\uaa62\uaa78\uaa7c\uaa7c\uaa80\uaab1\uaab3\uaab3\uaab7\uaab8\uaabb\uaabf"+
		"\uaac2\uaac2\uaac4\uaac4\uaadd\uaadf\uaae2\uaaec\uaaf4\uaaf6\uab03\uab08"+
		"\uab0b\uab10\uab13\uab18\uab22\uab28\uab2a\uab30\uab32\uab5c\uab5e\uab67"+
		"\uab72\uabe4\uac02\ud7a5\ud7b2\ud7c8\ud7cd\ud7fd\uf902\ufa6f\ufa72\ufadb"+
		"\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f\ufb21\ufb2a\ufb2c\ufb38\ufb3a\ufb3e"+
		"\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufd3f\ufd52\ufd91"+
		"\ufd94\ufdc9\ufdf2\ufdfe\ufe35\ufe36\ufe4f\ufe51\ufe6b\ufe6b\ufe72\ufe76"+
		"\ufe78\ufefe\uff06\uff06\uff23\uff3c\uff41\uff41\uff43\uff5c\uff68\uffc0"+
		"\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\uffe2\uffe3\uffe7\uffe8"+
		"\u00e6\2\62;\u0081\u00a1\u00af\u00af\u0302\u0371\u0485\u0489\u0593\u05bf"+
		"\u05c1\u05c1\u05c3\u05c4\u05c6\u05c7\u05c9\u05c9\u0602\u0607\u0612\u061c"+
		"\u061e\u061e\u064d\u066b\u0672\u0672\u06d8\u06df\u06e1\u06e6\u06e9\u06ea"+
		"\u06ec\u06ef\u06f2\u06fb\u0711\u0711\u0713\u0713\u0732\u074c\u07a8\u07b2"+
		"\u07c2\u07cb\u07ed\u07f5\u0818\u081b\u081d\u0825\u0827\u0829\u082b\u082f"+
		"\u085b\u085d\u08d6\u0905\u093c\u093e\u0940\u0951\u0953\u0959\u0964\u0965"+
		"\u0968\u0971\u0983\u0985\u09be\u09be\u09c0\u09c6\u09c9\u09ca\u09cd\u09cf"+
		"\u09d9\u09d9\u09e4\u09e5\u09e8\u09f1\u0a03\u0a05\u0a3e\u0a3e\u0a40\u0a44"+
		"\u0a49\u0a4a\u0a4d\u0a4f\u0a53\u0a53\u0a68\u0a73\u0a77\u0a77\u0a83\u0a85"+
		"\u0abe\u0abe\u0ac0\u0ac7\u0ac9\u0acb\u0acd\u0acf\u0ae4\u0ae5\u0ae8\u0af1"+
		"\u0afc\u0b01\u0b03\u0b05\u0b3e\u0b3e\u0b40\u0b46\u0b49\u0b4a\u0b4d\u0b4f"+
		"\u0b58\u0b59\u0b64\u0b65\u0b68\u0b71\u0b84\u0b84\u0bc0\u0bc4\u0bc8\u0bca"+
		"\u0bcc\u0bcf\u0bd9\u0bd9\u0be8\u0bf1\u0c02\u0c05\u0c40\u0c46\u0c48\u0c4a"+
		"\u0c4c\u0c4f\u0c57\u0c58\u0c64\u0c65\u0c68\u0c71\u0c83\u0c85\u0cbe\u0cbe"+
		"\u0cc0\u0cc6\u0cc8\u0cca\u0ccc\u0ccf\u0cd7\u0cd8\u0ce4\u0ce5\u0ce8\u0cf1"+
		"\u0d02\u0d05\u0d3d\u0d3e\u0d40\u0d46\u0d48\u0d4a\u0d4c\u0d4f\u0d59\u0d59"+
		"\u0d64\u0d65\u0d68\u0d71\u0d84\u0d85\u0dcc\u0dcc\u0dd1\u0dd6\u0dd8\u0dd8"+
		"\u0dda\u0de1\u0de8\u0df1\u0df4\u0df5\u0e33\u0e33\u0e36\u0e3c\u0e49\u0e50"+
		"\u0e52\u0e5b\u0eb3\u0eb3\u0eb6\u0ebb\u0ebd\u0ebe\u0eca\u0ecf\u0ed2\u0edb"+
		"\u0f1a\u0f1b\u0f22\u0f2b\u0f37\u0f37\u0f39\u0f39\u0f3b\u0f3b\u0f40\u0f41"+
		"\u0f73\u0f86\u0f88\u0f89\u0f8f\u0f99\u0f9b\u0fbe\u0fc8\u0fc8\u102d\u1040"+
		"\u1042\u104b\u1058\u105b\u1060\u1062\u1064\u1066\u1069\u106f\u1073\u1076"+
		"\u1084\u108f\u1091\u109f\u135f\u1361\u1714\u1716\u1734\u1736\u1754\u1755"+
		"\u1774\u1775\u17b6\u17d5\u17df\u17df\u17e2\u17eb\u180d\u1810\u1812\u181b"+
		"\u1887\u1888\u18ab\u18ab\u1922\u192d\u1932\u193d\u1948\u1951\u19d2\u19db"+
		"\u1a19\u1a1d\u1a57\u1a60\u1a62\u1a7e\u1a81\u1a8b\u1a92\u1a9b\u1ab2\u1abf"+
		"\u1b02\u1b06\u1b36\u1b46\u1b52\u1b5b\u1b6d\u1b75\u1b82\u1b84\u1ba3\u1baf"+
		"\u1bb2\u1bbb\u1be8\u1bf5\u1c26\u1c39\u1c42\u1c4b\u1c52\u1c5b\u1cd2\u1cd4"+
		"\u1cd6\u1cea\u1cef\u1cef\u1cf4\u1cf6\u1cf9\u1cfb\u1dc2\u1dfb\u1dfd\u1e01"+
		"\u200d\u2011\u202c\u2030\u2062\u2066\u2068\u2071\u20d2\u20de\u20e3\u20e3"+
		"\u20e7\u20f2\u2cf1\u2cf3\u2d81\u2d81\u2de2\u2e01\u302c\u3031\u309b\u309c"+
		"\ua622\ua62b\ua671\ua671\ua676\ua67f\ua6a0\ua6a1\ua6f2\ua6f3\ua804\ua804"+
		"\ua808\ua808\ua80d\ua80d\ua825\ua829\ua882\ua883\ua8b6\ua8c7\ua8d2\ua8db"+
		"\ua8e2\ua8f3\ua902\ua90b\ua928\ua92f\ua949\ua955\ua982\ua985\ua9b5\ua9c2"+
		"\ua9d2\ua9db\ua9e7\ua9e7\ua9f2\ua9fb\uaa2b\uaa38\uaa45\uaa45\uaa4e\uaa4f"+
		"\uaa52\uaa5b\uaa7d\uaa7f\uaab2\uaab2\uaab4\uaab6\uaab9\uaaba\uaac0\uaac1"+
		"\uaac3\uaac3\uaaed\uaaf1\uaaf7\uaaf8\uabe5\uabec\uabee\uabef\uabf2\uabfb"+
		"\ufb20\ufb20\ufe02\ufe11\ufe22\ufe31\uff01\uff01\uff12\uff1b\ufffb\ufffd"+
		"\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u04e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2\u00a3\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bf\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2"+
		"\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db"+
		"\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2"+
		"\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed"+
		"\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2"+
		"\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff"+
		"\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2"+
		"\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111"+
		"\3\2\2\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2"+
		"\2\2\u011b\3\2\2\2\2\u011d\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123"+
		"\3\2\2\2\2\u0125\3\2\2\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\2\u012f\3\2\2"+
		"\2\2\u0131\3\2\2\2\2\u0133\3\2\2\2\2\u0135\3\2\2\2\2\u0137\3\2\2\2\3\u0139"+
		"\3\2\2\2\5\u0142\3\2\2\2\7\u014a\3\2\2\2\t\u014f\3\2\2\2\13\u0154\3\2"+
		"\2\2\r\u015b\3\2\2\2\17\u0160\3\2\2\2\21\u0166\3\2\2\2\23\u016d\3\2\2"+
		"\2\25\u0173\3\2\2\2\27\u0177\3\2\2\2\31\u0180\3\2\2\2\33\u0186\3\2\2\2"+
		"\35\u018e\3\2\2\2\37\u0194\3\2\2\2!\u0198\3\2\2\2#\u019b\3\2\2\2%\u01a4"+
		"\3\2\2\2\'\u01ac\3\2\2\2)\u01b7\3\2\2\2+\u01bc\3\2\2\2-\u01c6\3\2\2\2"+
		"/\u01cc\3\2\2\2\61\u01d0\3\2\2\2\63\u01d8\3\2\2\2\65\u01e1\3\2\2\2\67"+
		"\u01eb\3\2\2\29\u01f2\3\2\2\2;\u01f9\3\2\2\2=\u0201\3\2\2\2?\u0208\3\2"+
		"\2\2A\u020c\3\2\2\2C\u0211\3\2\2\2E\u0217\3\2\2\2G\u021b\3\2\2\2I\u0220"+
		"\3\2\2\2K\u0225\3\2\2\2M\u022a\3\2\2\2O\u022f\3\2\2\2Q\u0236\3\2\2\2S"+
		"\u023f\3\2\2\2U\u0249\3\2\2\2W\u0252\3\2\2\2Y\u0257\3\2\2\2[\u0260\3\2"+
		"\2\2]\u0268\3\2\2\2_\u026f\3\2\2\2a\u0276\3\2\2\2c\u0283\3\2\2\2e\u02ad"+
		"\3\2\2\2g\u02ca\3\2\2\2i\u02d7\3\2\2\2k\u02dd\3\2\2\2m\u02df\3\2\2\2o"+
		"\u02e3\3\2\2\2q\u02e7\3\2\2\2s\u02eb\3\2\2\2u\u02ef\3\2\2\2w\u02fb\3\2"+
		"\2\2y\u02fd\3\2\2\2{\u0306\3\2\2\2}\u0308\3\2\2\2\177\u030b\3\2\2\2\u0081"+
		"\u0311\3\2\2\2\u0083\u0314\3\2\2\2\u0085\u0318\3\2\2\2\u0087\u031c\3\2"+
		"\2\2\u0089\u0323\3\2\2\2\u008b\u0326\3\2\2\2\u008d\u032c\3\2\2\2\u008f"+
		"\u032e\3\2\2\2\u0091\u0334\3\2\2\2\u0093\u033b\3\2\2\2\u0095\u033e\3\2"+
		"\2\2\u0097\u0344\3\2\2\2\u0099\u0346\3\2\2\2\u009b\u034a\3\2\2\2\u009d"+
		"\u0351\3\2\2\2\u009f\u0354\3\2\2\2\u00a1\u035a\3\2\2\2\u00a3\u035e\3\2"+
		"\2\2\u00a5\u037b\3\2\2\2\u00a7\u037d\3\2\2\2\u00a9\u0380\3\2\2\2\u00ab"+
		"\u0383\3\2\2\2\u00ad\u0387\3\2\2\2\u00af\u0389\3\2\2\2\u00b1\u038b\3\2"+
		"\2\2\u00b3\u039b\3\2\2\2\u00b5\u039d\3\2\2\2\u00b7\u03a0\3\2\2\2\u00b9"+
		"\u03ab\3\2\2\2\u00bb\u03b5\3\2\2\2\u00bd\u03b7\3\2\2\2\u00bf\u03b9\3\2"+
		"\2\2\u00c1\u03c0\3\2\2\2\u00c3\u03c6\3\2\2\2\u00c5\u03cc\3\2\2\2\u00c7"+
		"\u03d9\3\2\2\2\u00c9\u03db\3\2\2\2\u00cb\u03dd\3\2\2\2\u00cd\u03e8\3\2"+
		"\2\2\u00cf\u03ed\3\2\2\2\u00d1\u03ef\3\2\2\2\u00d3\u03f1\3\2\2\2\u00d5"+
		"\u03f3\3\2\2\2\u00d7\u03f5\3\2\2\2\u00d9\u03f7\3\2\2\2\u00db\u03f9\3\2"+
		"\2\2\u00dd\u03fb\3\2\2\2\u00df\u03fd\3\2\2\2\u00e1\u03ff\3\2\2\2\u00e3"+
		"\u0401\3\2\2\2\u00e5\u0403\3\2\2\2\u00e7\u0405\3\2\2\2\u00e9\u0407\3\2"+
		"\2\2\u00eb\u0409\3\2\2\2\u00ed\u040b\3\2\2\2\u00ef\u040d\3\2\2\2\u00f1"+
		"\u0410\3\2\2\2\u00f3\u0413\3\2\2\2\u00f5\u0416\3\2\2\2\u00f7\u0419\3\2"+
		"\2\2\u00f9\u041c\3\2\2\2\u00fb\u041f\3\2\2\2\u00fd\u0422\3\2\2\2\u00ff"+
		"\u0425\3\2\2\2\u0101\u0427\3\2\2\2\u0103\u0429\3\2\2\2\u0105\u042b\3\2"+
		"\2\2\u0107\u042d\3\2\2\2\u0109\u042f\3\2\2\2\u010b\u0431\3\2\2\2\u010d"+
		"\u0433\3\2\2\2\u010f\u0435\3\2\2\2\u0111\u0438\3\2\2\2\u0113\u043b\3\2"+
		"\2\2\u0115\u043e\3\2\2\2\u0117\u0441\3\2\2\2\u0119\u0444\3\2\2\2\u011b"+
		"\u0447\3\2\2\2\u011d\u044a\3\2\2\2\u011f\u044d\3\2\2\2\u0121\u0450\3\2"+
		"\2\2\u0123\u0453\3\2\2\2\u0125\u0457\3\2\2\2\u0127\u045b\3\2\2\2\u0129"+
		"\u0460\3\2\2\2\u012b\u0468\3\2\2\2\u012d\u046c\3\2\2\2\u012f\u046e\3\2"+
		"\2\2\u0131\u0470\3\2\2\2\u0133\u0475\3\2\2\2\u0135\u047b\3\2\2\2\u0137"+
		"\u0489\3\2\2\2\u0139\u013a\7c\2\2\u013a\u013b\7d\2\2\u013b\u013c\7u\2"+
		"\2\u013c\u013d\7v\2\2\u013d\u013e\7t\2\2\u013e\u013f\7c\2\2\u013f\u0140"+
		"\7e\2\2\u0140\u0141\7e\2\2\u0141\4\3\2\2\2\u0142\u0143\7d\2\2\u0143\u0144"+
		"\7q\2\2\u0144\u0145\7q\2\2\u0145\u0146\7n\2\2\u0146\u0147\7{\2\2\u0147"+
		"\u0148\7c\2\2\u0148\u0149\7p\2\2\u0149\6\3\2\2\2\u014a\u014b\7d\2\2\u014b"+
		"\u014c\7t\2\2\u014c\u014d\7k\2\2\u014d\u014e\7m\2\2\u014e\b\3\2\2\2\u014f"+
		"\u0150\7e\2\2\u0150\u0151\7c\2\2\u0151\u0152\7v\2\2\u0152\u0153\7u\2\2"+
		"\u0153\n\3\2\2\2\u0154\u0155\7e\2\2\u0155\u0156\7j\2\2\u0156\u0157\7c"+
		"\2\2\u0157\u0158\7t\2\2\u0158\u0159\7q\2\2\u0159\u015a\7v\2\2\u015a\f"+
		"\3\2\2\2\u015b\u015c\7m\2\2\u015c\u015d\7n\2\2\u015d\u015e\7c\2\2\u015e"+
		"\u015f\7u\2\2\u015f\16\3\2\2\2\u0160\u0161\7m\2\2\u0161\u0162\7q\2\2\u0162"+
		"\u0163\7p\2\2\u0163\u0164\7u\2\2\u0164\u0165\7v\2\2\u0165\20\3\2\2\2\u0166"+
		"\u0167\7f\2\2\u0167\u0168\7w\2\2\u0168\u0169\7f\2\2\u0169\u016a\7w\2\2"+
		"\u016a\u016b\7f\2\2\u016b\u016c\7w\2\2\u016c\22\3\2\2\2\u016d\u016e\7"+
		"f\2\2\u016e\u016f\7w\2\2\u016f\u0170\7d\2\2\u0170\u0171\7q\2\2\u0171\u0172"+
		"\7n\2\2\u0172\24\3\2\2\2\u0173\u0174\7k\2\2\u0174\u0175\7n\2\2\u0175\u0176"+
		"\7u\2\2\u0176\26\3\2\2\2\u0177\u0178\7g\2\2\u0178\u0179\7m\2\2\u0179\u017a"+
		"\7u\2\2\u017a\u017b\7v\2\2\u017b\u017c\7k\2\2\u017c\u017d\7p\2\2\u017d"+
		"\u017e\7f\2\2\u017e\u017f\7u\2\2\u017f\30\3\2\2\2\u0180\u0181\7r\2\2\u0181"+
		"\u0182\7k\2\2\u0182\u0183\7p\2\2\u0183\u0184\7c\2\2\u0184\u0185\7n\2\2"+
		"\u0185\32\3\2\2\2\u0186\u0187\7r\2\2\u0187\u0188\7k\2\2\u0188\u0189\7"+
		"p\2\2\u0189\u018a\7c\2\2\u018a\u018b\7n\2\2\u018b\u018c\7n\2\2\u018c\u018d"+
		"\7{\2\2\u018d\34\3\2\2\2\u018e\u018f\7r\2\2\u018f\u0190\7n\2\2\u0190\u0191"+
		"\7w\2\2\u0191\u0192\7v\2\2\u0192\u0193\7g\2\2\u0193\36\3\2\2\2\u0194\u0195"+
		"\7r\2\2\u0195\u0196\7q\2\2\u0196\u0197\7t\2\2\u0197 \3\2\2\2\u0198\u0199"+
		"\7k\2\2\u0199\u019a\7r\2\2\u019a\"\3\2\2\2\u019b\u019c\7k\2\2\u019c\u019d"+
		"\7o\2\2\u019d\u019e\7r\2\2\u019e\u019f\7n\2\2\u019f\u01a0\7c\2\2\u01a0"+
		"\u01a1\7p\2\2\u01a1\u01a2\7v\2\2\u01a2\u01a3\7u\2\2\u01a3$\3\2\2\2\u01a4"+
		"\u01a5\7k\2\2\u01a5\u01a6\7o\2\2\u01a6\u01a7\7r\2\2\u01a7\u01a8\7q\2\2"+
		"\u01a8\u01a9\7y\2\2\u01a9\u01aa\7t\2\2\u01aa\u01ab\7v\2\2\u01ab&\3\2\2"+
		"\2\u01ac\u01ad\7k\2\2\u01ad\u01ae\7p\2\2\u01ae\u01af\7u\2\2\u01af\u01b0"+
		"\7v\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7e\2\2\u01b3"+
		"\u01b4\7g\2\2\u01b4\u01b5\7q\2\2\u01b5\u01b6\7r\2\2\u01b6(\3\2\2\2\u01b7"+
		"\u01b8\7g\2\2\u01b8\u01b9\7g\2\2\u01b9\u01ba\7p\2\2\u01ba\u01bb\7v\2\2"+
		"\u01bb*\3\2\2\2\u01bc\u01bd\7g\2\2\u01bd\u01be\7p\2\2\u01be\u01bf\7v\2"+
		"\2\u01bf\u01c0\7g\2\2\u01c0\u01c1\7t\2\2\u01c1\u01c2\7r\2\2\u01c2\u01c3"+
		"\7g\2\2\u01c3\u01c4\7{\2\2\u01c4\u01c5\7u\2\2\u01c5,\3\2\2\2\u01c6\u01c7"+
		"\7n\2\2\u01c7\u01c8\7w\2\2\u01c8\u01c9\7w\2\2\u01c9\u01ca\7p\2\2\u01ca"+
		"\u01cb\7i\2\2\u01cb.\3\2\2\2\u01cc\u01cd\7p\2\2\u01cd\u01ce\7{\2\2\u01ce"+
		"\u01cf\7q\2\2\u01cf\60\3\2\2\2\u01d0\u01d1\7r\2\2\u01d1\u01d2\7c\2\2\u01d2"+
		"\u01d3\7m\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7{\2\2\u01d5\u01d6\7f\2\2"+
		"\u01d6\u01d7\7u\2\2\u01d7\62\3\2\2\2\u01d8\u01d9\7r\2\2\u01d9\u01da\7"+
		"t\2\2\u01da\u01db\7c\2\2\u01db\u01dc\7{\2\2\u01dc\u01dd\7d\2\2\u01dd\u01de"+
		"\7g\2\2\u01de\u01df\7{\2\2\u01df\u01e0\7v\2\2\u01e0\64\3\2\2\2\u01e1\u01e2"+
		"\7r\2\2\u01e2\u01e3\7t\2\2\u01e3\u01e4\7w\2\2\u01e4\u01e5\7v\2\2\u01e5"+
		"\u01e6\7k\2\2\u01e6\u01e7\7m\2\2\u01e7\u01e8\7v\2\2\u01e8\u01e9\7k\2\2"+
		"\u01e9\u01ea\7f\2\2\u01ea\66\3\2\2\2\u01eb\u01ec\7r\2\2\u01ec\u01ed\7"+
		"c\2\2\u01ed\u01ee\7d\2\2\u01ee\u01ef\7n\2\2\u01ef\u01f0\7k\2\2\u01f0\u01f1"+
		"\7m\2\2\u01f18\3\2\2\2\u01f2\u01f3\7t\2\2\u01f3\u01f4\7g\2\2\u01f4\u01f5"+
		"\7v\2\2\u01f5\u01f6\7q\2\2\u01f6\u01f7\7t\2\2\u01f7\u01f8\7p\2\2\u01f8"+
		":\3\2\2\2\u01f9\u01fa\7k\2\2\u01fa\u01fb\7u\2\2\u01fb\u01fc\7v\2\2\u01fc"+
		"\u01fd\7c\2\2\u01fd\u01fe\7v\2\2\u01fe\u01ff\7k\2\2\u01ff\u0200\7m\2\2"+
		"\u0200<\3\2\2\2\u0201\u0202\7u\2\2\u0202\u0203\7q\2\2\u0203\u0204\7w\2"+
		"\2\u0204\u0205\7r\2\2\u0205\u0206\7g\2\2\u0206\u0207\7t\2\2\u0207>\3\2"+
		"\2\2\u0208\u0209\7f\2\2\u0209\u020a\7k\2\2\u020a\u020b\7u\2\2\u020b@\3"+
		"\2\2\2\u020c\u020d\7v\2\2\u020d\u020e\7j\2\2\u020e\u020f\7t\2\2\u020f"+
		"\u0210\7w\2\2\u0210B\3\2\2\2\u0211\u0212\7v\2\2\u0212\u0213\7j\2\2\u0213"+
		"\u0214\7t\2\2\u0214\u0215\7w\2\2\u0215\u0216\7u\2\2\u0216D\3\2\2\2\u0217"+
		"\u0218\7v\2\2\u0218\u0219\7t\2\2\u0219\u021a\7{\2\2\u021aF\3\2\2\2\u021b"+
		"\u021c\7d\2\2\u021c\u021d\7q\2\2\u021d\u021e\7k\2\2\u021e\u021f\7f\2\2"+
		"\u021fH\3\2\2\2\u0220\u0221\7y\2\2\u0221\u0222\7c\2\2\u0222\u0223\7{\2"+
		"\2\u0223\u0224\7n\2\2\u0224J\3\2\2\2\u0225\u0226\7e\2\2\u0226\u0227\7"+
		"c\2\2\u0227\u0228\7u\2\2\u0228\u0229\7g\2\2\u0229L\3\2\2\2\u022a\u022b"+
		"\7g\2\2\u022b\u022c\7p\2\2\u022c\u022d\7w\2\2\u022d\u022e\7o\2\2\u022e"+
		"N\3\2\2\2\u022f\u0230\7p\2\2\u0230\u0231\7c\2\2\u0231\u0232\7v\2\2\u0232"+
		"\u0233\7k\2\2\u0233\u0234\7x\2\2\u0234\u0235\7g\2\2\u0235P\3\2\2\2\u0236"+
		"\u0237\7x\2\2\u0237\u0238\7q\2\2\u0238\u0239\7n\2\2\u0239\u023a\7c\2\2"+
		"\u023a\u023b\7v\2\2\u023b\u023c\7k\2\2\u023c\u023d\7n\2\2\u023d\u023e"+
		"\7g\2\2\u023eR\3\2\2\2\u023f\u0240\7v\2\2\u0240\u0241\7t\2\2\u0241\u0242"+
		"\7c\2\2\u0242\u0243\7p\2\2\u0243\u0244\7u\2\2\u0244\u0245\7k\2\2\u0245"+
		"\u0246\7g\2\2\u0246\u0247\7p\2\2\u0247\u0248\7v\2\2\u0248T\3\2\2\2\u0249"+
		"\u024a\7u\2\2\u024a\u024b\7v\2\2\u024b\u024c\7t\2\2\u024c\u024d\7k\2\2"+
		"\u024d\u024e\7e\2\2\u024e\u024f\7v\2\2\u024f\u0250\7h\2\2\u0250\u0251"+
		"\7r\2\2\u0251V\3\2\2\2\u0252\u0253\7d\2\2\u0253\u0254\7{\2\2\u0254\u0255"+
		"\7v\2\2\u0255\u0256\7g\2\2\u0256X\3\2\2\2\u0257\u0258\7e\2\2\u0258\u0259"+
		"\7q\2\2\u0259\u025a\7p\2\2\u025a\u025b\7v\2\2\u025b\u025c\7k\2\2\u025c"+
		"\u025d\7p\2\2\u025d\u025e\7w\2\2\u025e\u025f\7g\2\2\u025fZ\3\2\2\2\u0260"+
		"\u0261\7f\2\2\u0261\u0262\7g\2\2\u0262\u0263\7h\2\2\u0263\u0264\7c\2\2"+
		"\u0264\u0265\7w\2\2\u0265\u0266\7n\2\2\u0266\u0267\7v\2\2\u0267\\\3\2"+
		"\2\2\u0268\u0269\7c\2\2\u0269\u026a\7u\2\2\u026a\u026b\7u\2\2\u026b\u026c"+
		"\7g\2\2\u026c\u026d\7t\2\2\u026d\u026e\7v\2\2\u026e^\3\2\2\2\u026f\u0270"+
		"\7u\2\2\u0270\u0271\7y\2\2\u0271\u0272\7k\2\2\u0272\u0273\7v\2\2\u0273"+
		"\u0274\7e\2\2\u0274\u0275\7j\2\2\u0275`\3\2\2\2\u0276\u0277\7u\2\2\u0277"+
		"\u0278\7{\2\2\u0278\u0279\7p\2\2\u0279\u027a\7e\2\2\u027a\u027b\7j\2\2"+
		"\u027b\u027c\7t\2\2\u027c\u027d\7q\2\2\u027d\u027e\7p\2\2\u027e\u027f"+
		"\7k\2\2\u027f\u0280\7|\2\2\u0280\u0281\7g\2\2\u0281\u0282\7f\2\2\u0282"+
		"b\3\2\2\2\u0283\u0284\7u\2\2\u0284\u0285\7j\2\2\u0285\u0286\7q\2\2\u0286"+
		"\u0287\7t\2\2\u0287\u0288\7v\2\2\u0288d\3\2\2\2\u0289\u02ae\5\3\2\2\u028a"+
		"\u02ae\5\5\3\2\u028b\u02ae\5\7\4\2\u028c\u02ae\5\t\5\2\u028d\u02ae\5\13"+
		"\6\2\u028e\u02ae\5\r\7\2\u028f\u02ae\5\17\b\2\u0290\u02ae\5\21\t\2\u0291"+
		"\u02ae\5\23\n\2\u0292\u02ae\5\25\13\2\u0293\u02ae\5\27\f\2\u0294\u02ae"+
		"\5\31\r\2\u0295\u02ae\5\33\16\2\u0296\u02ae\5\35\17\2\u0297\u02ae\5\37"+
		"\20\2\u0298\u02ae\5!\21\2\u0299\u02ae\5#\22\2\u029a\u02ae\5%\23\2\u029b"+
		"\u02ae\5\'\24\2\u029c\u02ae\5!\21\2\u029d\u02ae\5+\26\2\u029e\u02ae\5"+
		"-\27\2\u029f\u02ae\5/\30\2\u02a0\u02ae\5\61\31\2\u02a1\u02ae\5\63\32\2"+
		"\u02a2\u02ae\5\65\33\2\u02a3\u02ae\5\67\34\2\u02a4\u02ae\59\35\2\u02a5"+
		"\u02ae\5;\36\2\u02a6\u02ae\5=\37\2\u02a7\u02ae\5? \2\u02a8\u02ae\5A!\2"+
		"\u02a9\u02ae\5C\"\2\u02aa\u02ae\5E#\2\u02ab\u02ae\5G$\2\u02ac\u02ae\5"+
		"I%\2\u02ad\u0289\3\2\2\2\u02ad\u028a\3\2\2\2\u02ad\u028b\3\2\2\2\u02ad"+
		"\u028c\3\2\2\2\u02ad\u028d\3\2\2\2\u02ad\u028e\3\2\2\2\u02ad\u028f\3\2"+
		"\2\2\u02ad\u0290\3\2\2\2\u02ad\u0291\3\2\2\2\u02ad\u0292\3\2\2\2\u02ad"+
		"\u0293\3\2\2\2\u02ad\u0294\3\2\2\2\u02ad\u0295\3\2\2\2\u02ad\u0296\3\2"+
		"\2\2\u02ad\u0297\3\2\2\2\u02ad\u0298\3\2\2\2\u02ad\u0299\3\2\2\2\u02ad"+
		"\u029a\3\2\2\2\u02ad\u029b\3\2\2\2\u02ad\u029c\3\2\2\2\u02ad\u029d\3\2"+
		"\2\2\u02ad\u029e\3\2\2\2\u02ad\u029f\3\2\2\2\u02ad\u02a0\3\2\2\2\u02ad"+
		"\u02a1\3\2\2\2\u02ad\u02a2\3\2\2\2\u02ad\u02a3\3\2\2\2\u02ad\u02a4\3\2"+
		"\2\2\u02ad\u02a5\3\2\2\2\u02ad\u02a6\3\2\2\2\u02ad\u02a7\3\2\2\2\u02ad"+
		"\u02a8\3\2\2\2\u02ad\u02a9\3\2\2\2\u02ad\u02aa\3\2\2\2\u02ad\u02ab\3\2"+
		"\2\2\u02ad\u02ac\3\2\2\2\u02aef\3\2\2\2\u02af\u02cb\5\u00e1q\2\u02b0\u02cb"+
		"\5\u00e3r\2\u02b1\u02cb\5\u00e5s\2\u02b2\u02cb\5\u00e7t\2\u02b3\u02cb"+
		"\5\u00e9u\2\u02b4\u02cb\5\u00ebv\2\u02b5\u02cb\5\u00edw\2\u02b6\u02cb"+
		"\5\u00efx\2\u02b7\u02cb\5\u00f1y\2\u02b8\u02cb\5\u00f3z\2\u02b9\u02cb"+
		"\5\u00f5{\2\u02ba\u02cb\5\u00f7|\2\u02bb\u02cb\5\u00f9}\2\u02bc\u02cb"+
		"\5\u00fb~\2\u02bd\u02cb\5\u00fd\177\2\u02be\u02cb\5\u00ff\u0080\2\u02bf"+
		"\u02cb\5\u0101\u0081\2\u02c0\u02cb\5\u0103\u0082\2\u02c1\u02cb\5\u0105"+
		"\u0083\2\u02c2\u02cb\5\u010b\u0086\2\u02c3\u02cb\5\u010d\u0087\2\u02c4"+
		"\u02cb\5\u010f\u0088\2\u02c5\u02cb\5\u0111\u0089\2\u02c6\u02cb\5\u0113"+
		"\u008a\2\u02c7\u02cb\5\u0115\u008b\2\u02c8\u02cb\5\u0117\u008c\2\u02c9"+
		"\u02cb\5\u0119\u008d\2\u02ca\u02af\3\2\2\2\u02ca\u02b0\3\2\2\2\u02ca\u02b1"+
		"\3\2\2\2\u02ca\u02b2\3\2\2\2\u02ca\u02b3\3\2\2\2\u02ca\u02b4\3\2\2\2\u02ca"+
		"\u02b5\3\2\2\2\u02ca\u02b6\3\2\2\2\u02ca\u02b7\3\2\2\2\u02ca\u02b8\3\2"+
		"\2\2\u02ca\u02b9\3\2\2\2\u02ca\u02ba\3\2\2\2\u02ca\u02bb\3\2\2\2\u02ca"+
		"\u02bc\3\2\2\2\u02ca\u02bd\3\2\2\2\u02ca\u02be\3\2\2\2\u02ca\u02bf\3\2"+
		"\2\2\u02ca\u02c0\3\2\2\2\u02ca\u02c1\3\2\2\2\u02ca\u02c2\3\2\2\2\u02ca"+
		"\u02c3\3\2\2\2\u02ca\u02c4\3\2\2\2\u02ca\u02c5\3\2\2\2\u02ca\u02c6\3\2"+
		"\2\2\u02ca\u02c7\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cb"+
		"h\3\2\2\2\u02cc\u02d8\5m\67\2\u02cd\u02d8\5o8\2\u02ce\u02d8\5q9\2\u02cf"+
		"\u02d8\5s:\2\u02d0\u02d8\5\u00b9]\2\u02d1\u02d8\5\u00bb^\2\u02d2\u02d8"+
		"\5\u00a5S\2\u02d3\u02d8\5\u00a3R\2\u02d4\u02d8\5\u00b1Y\2\u02d5\u02d8"+
		"\5\u00cdg\2\u02d6\u02d8\5\u00bf`\2\u02d7\u02cc\3\2\2\2\u02d7\u02cd\3\2"+
		"\2\2\u02d7\u02ce\3\2\2\2\u02d7\u02cf\3\2\2\2\u02d7\u02d0\3\2\2\2\u02d7"+
		"\u02d1\3\2\2\2\u02d7\u02d2\3\2\2\2\u02d7\u02d3\3\2\2\2\u02d7\u02d4\3\2"+
		"\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8j\3\2\2\2\u02d9\u02de"+
		"\5m\67\2\u02da\u02de\5o8\2\u02db\u02de\5q9\2\u02dc\u02de\5s:\2\u02dd\u02d9"+
		"\3\2\2\2\u02dd\u02da\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02dc\3\2\2\2\u02de"+
		"l\3\2\2\2\u02df\u02e1\5w<\2\u02e0\u02e2\5u;\2\u02e1\u02e0\3\2\2\2\u02e1"+
		"\u02e2\3\2\2\2\u02e2n\3\2\2\2\u02e3\u02e5\5\u0085C\2\u02e4\u02e6\5u;\2"+
		"\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6p\3\2\2\2\u02e7\u02e9\5"+
		"\u008fH\2\u02e8\u02ea\5u;\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"r\3\2\2\2\u02eb\u02ed\5\u0099M\2\u02ec\u02ee\5u;\2\u02ed\u02ec\3\2\2\2"+
		"\u02ed\u02ee\3\2\2\2\u02eet\3\2\2\2\u02ef\u02f0\t\2\2\2\u02f0v\3\2\2\2"+
		"\u02f1\u02fc\7\62\2\2\u02f2\u02f9\5}?\2\u02f3\u02f5\5y=\2\u02f4\u02f3"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02fa\3\2\2\2\u02f6\u02f7\5\u0083B"+
		"\2\u02f7\u02f8\5y=\2\u02f8\u02fa\3\2\2\2\u02f9\u02f4\3\2\2\2\u02f9\u02f6"+
		"\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02f1\3\2\2\2\u02fb\u02f2\3\2\2\2\u02fc"+
		"x\3\2\2\2\u02fd\u0302\5{>\2\u02fe\u0300\5\177@\2\u02ff\u02fe\3\2\2\2\u02ff"+
		"\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303\5{>\2\u0302\u02ff\3\2\2"+
		"\2\u0302\u0303\3\2\2\2\u0303z\3\2\2\2\u0304\u0307\7\62\2\2\u0305\u0307"+
		"\5}?\2\u0306\u0304\3\2\2\2\u0306\u0305\3\2\2\2\u0307|\3\2\2\2\u0308\u0309"+
		"\t\3\2\2\u0309~\3\2\2\2\u030a\u030c\5\u0081A\2\u030b\u030a\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0080\3\2"+
		"\2\2\u030f\u0312\5{>\2\u0310\u0312\7a\2\2\u0311\u030f\3\2\2\2\u0311\u0310"+
		"\3\2\2\2\u0312\u0082\3\2\2\2\u0313\u0315\7a\2\2\u0314\u0313\3\2\2\2\u0315"+
		"\u0316\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0084\3\2"+
		"\2\2\u0318\u0319\7\62\2\2\u0319\u031a\t\4\2\2\u031a\u031b\5\u0087D\2\u031b"+
		"\u0086\3\2\2\2\u031c\u0321\5\u0089E\2\u031d\u031f\5\u008bF\2\u031e\u031d"+
		"\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\5\u0089E"+
		"\2\u0321\u031e\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0088\3\2\2\2\u0323\u0324"+
		"\t\5\2\2\u0324\u008a\3\2\2\2\u0325\u0327\5\u008dG\2\u0326\u0325\3\2\2"+
		"\2\u0327\u0328\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u008c"+
		"\3\2\2\2\u032a\u032d\5\u0089E\2\u032b\u032d\7a\2\2\u032c\u032a\3\2\2\2"+
		"\u032c\u032b\3\2\2\2\u032d\u008e\3\2\2\2\u032e\u0330\7\62\2\2\u032f\u0331"+
		"\5\u0083B\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\3\2\2"+
		"\2\u0332\u0333\5\u0091I\2\u0333\u0090\3\2\2\2\u0334\u0339\5\u0093J\2\u0335"+
		"\u0337\5\u0095K\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338"+
		"\3\2\2\2\u0338\u033a\5\u0093J\2\u0339\u0336\3\2\2\2\u0339\u033a\3\2\2"+
		"\2\u033a\u0092\3\2\2\2\u033b\u033c\t\6\2\2\u033c\u0094\3\2\2\2\u033d\u033f"+
		"\5\u0097L\2\u033e\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u033e\3\2\2"+
		"\2\u0340\u0341\3\2\2\2\u0341\u0096\3\2\2\2\u0342\u0345\5\u0093J\2\u0343"+
		"\u0345\7a\2\2\u0344\u0342\3\2\2\2\u0344\u0343\3\2\2\2\u0345\u0098\3\2"+
		"\2\2\u0346\u0347\7\62\2\2\u0347\u0348\t\7\2\2\u0348\u0349\5\u009bN\2\u0349"+
		"\u009a\3\2\2\2\u034a\u034f\5\u009dO\2\u034b\u034d\5\u009fP\2\u034c\u034b"+
		"\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0350\5\u009dO"+
		"\2\u034f\u034c\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u009c\3\2\2\2\u0351\u0352"+
		"\t\b\2\2\u0352\u009e\3\2\2\2\u0353\u0355\5\u00a1Q\2\u0354\u0353\3\2\2"+
		"\2\u0355\u0356\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u00a0"+
		"\3\2\2\2\u0358\u035b\5\u009dO\2\u0359\u035b\7a\2\2\u035a\u0358\3\2\2\2"+
		"\u035a\u0359\3\2\2\2\u035b\u00a2\3\2\2\2\u035c\u035f\5\u00a5S\2\u035d"+
		"\u035f\5\u00b1Y\2\u035e\u035c\3\2\2\2\u035e\u035d\3\2\2\2\u035f\u00a4"+
		"\3\2\2\2\u0360\u0361\5y=\2\u0361\u0363\7\60\2\2\u0362\u0364\5y=\2\u0363"+
		"\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u0367\5\u00a7"+
		"T\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0369\3\2\2\2\u0368"+
		"\u036a\5\u00afX\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u037c"+
		"\3\2\2\2\u036b\u036c\7\60\2\2\u036c\u036e\5y=\2\u036d\u036f\5\u00a7T\2"+
		"\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371\3\2\2\2\u0370\u0372"+
		"\5\u00afX\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u037c\3\2\2"+
		"\2\u0373\u0374\5y=\2\u0374\u0376\5\u00a7T\2\u0375\u0377\5\u00afX\2\u0376"+
		"\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u037c\3\2\2\2\u0378\u0379\5y"+
		"=\2\u0379\u037a\5\u00afX\2\u037a\u037c\3\2\2\2\u037b\u0360\3\2\2\2\u037b"+
		"\u036b\3\2\2\2\u037b\u0373\3\2\2\2\u037b\u0378\3\2\2\2\u037c\u00a6\3\2"+
		"\2\2\u037d\u037e\5\u00a9U\2\u037e\u037f\5\u00abV\2\u037f\u00a8\3\2\2\2"+
		"\u0380\u0381\t\t\2\2\u0381\u00aa\3\2\2\2\u0382\u0384\5\u00adW\2\u0383"+
		"\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\5y"+
		"=\2\u0386\u00ac\3\2\2\2\u0387\u0388\t\n\2\2\u0388\u00ae\3\2\2\2\u0389"+
		"\u038a\t\13\2\2\u038a\u00b0\3\2\2\2\u038b\u038c\5\u00b3Z\2\u038c\u038e"+
		"\5\u00b5[\2\u038d\u038f\5\u00afX\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2"+
		"\2\2\u038f\u00b2\3\2\2\2\u0390\u0392\5\u0085C\2\u0391\u0393\7\60\2\2\u0392"+
		"\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u039c\3\2\2\2\u0394\u0395\7\62"+
		"\2\2\u0395\u0397\t\4\2\2\u0396\u0398\5\u0087D\2\u0397\u0396\3\2\2\2\u0397"+
		"\u0398\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\7\60\2\2\u039a\u039c\5"+
		"\u0087D\2\u039b\u0390\3\2\2\2\u039b\u0394\3\2\2\2\u039c\u00b4\3\2\2\2"+
		"\u039d\u039e\5\u00b7\\\2\u039e\u039f\5\u00abV\2\u039f\u00b6\3\2\2\2\u03a0"+
		"\u03a1\t\f\2\2\u03a1\u00b8\3\2\2\2\u03a2\u03a3\7v\2\2\u03a3\u03a4\7t\2"+
		"\2\u03a4\u03a5\7w\2\2\u03a5\u03ac\7g\2\2\u03a6\u03a7\7h\2\2\u03a7\u03a8"+
		"\7c\2\2\u03a8\u03a9\7n\2\2\u03a9\u03aa\7u\2\2\u03aa\u03ac\7g\2\2\u03ab"+
		"\u03a2\3\2\2\2\u03ab\u03a6\3\2\2\2\u03ac\u00ba\3\2\2\2\u03ad\u03ae\7)"+
		"\2\2\u03ae\u03af\5\u00bd_\2\u03af\u03b0\7)\2\2\u03b0\u03b6\3\2\2\2\u03b1"+
		"\u03b2\7)\2\2\u03b2\u03b3\5\u00c5c\2\u03b3\u03b4\7)\2\2\u03b4\u03b6\3"+
		"\2\2\2\u03b5\u03ad\3\2\2\2\u03b5\u03b1\3\2\2\2\u03b6\u00bc\3\2\2\2\u03b7"+
		"\u03b8\n\r\2\2\u03b8\u00be\3\2\2\2\u03b9\u03bb\7$\2\2\u03ba\u03bc\5\u00c1"+
		"a\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03be\7$\2\2\u03be\u00c0\3\2\2\2\u03bf\u03c1\5\u00c3b\2\u03c0\u03bf\3"+
		"\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"+
		"\u00c2\3\2\2\2\u03c4\u03c7\n\16\2\2\u03c5\u03c7\5\u00c5c\2\u03c6\u03c4"+
		"\3\2\2\2\u03c6\u03c5\3\2\2\2\u03c7\u00c4\3\2\2\2\u03c8\u03c9\7^\2\2\u03c9"+
		"\u03cd\t\17\2\2\u03ca\u03cd\5\u00c7d\2\u03cb\u03cd\5\u00cbf\2\u03cc\u03c8"+
		"\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cb\3\2\2\2\u03cd\u00c6\3\2\2\2\u03ce"+
		"\u03cf\7^\2\2\u03cf\u03da\5\u0093J\2\u03d0\u03d1\7^\2\2\u03d1\u03d2\5"+
		"\u0093J\2\u03d2\u03d3\5\u0093J\2\u03d3\u03da\3\2\2\2\u03d4\u03d5\7^\2"+
		"\2\u03d5\u03d6\5\u00c9e\2\u03d6\u03d7\5\u0093J\2\u03d7\u03d8\5\u0093J"+
		"\2\u03d8\u03da\3\2\2\2\u03d9\u03ce\3\2\2\2\u03d9\u03d0\3\2\2\2\u03d9\u03d4"+
		"\3\2\2\2\u03da\u00c8\3\2\2\2\u03db\u03dc\t\20\2\2\u03dc\u00ca\3\2\2\2"+
		"\u03dd\u03df\7^\2\2\u03de\u03e0\7w\2\2\u03df\u03de\3\2\2\2\u03e0\u03e1"+
		"\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3"+
		"\u03e4\5\u0089E\2\u03e4\u03e5\5\u0089E\2\u03e5\u03e6\5\u0089E\2\u03e6"+
		"\u03e7\5\u0089E\2\u03e7\u00cc\3\2\2\2\u03e8\u03e9\7p\2\2\u03e9\u03ea\7"+
		"w\2\2\u03ea\u03eb\7n\2\2\u03eb\u03ec\7n\2\2\u03ec\u00ce\3\2\2\2\u03ed"+
		"\u03ee\7*\2\2\u03ee\u00d0\3\2\2\2\u03ef\u03f0\7+\2\2\u03f0\u00d2\3\2\2"+
		"\2\u03f1\u03f2\7}\2\2\u03f2\u00d4\3\2\2\2\u03f3\u03f4\7\177\2\2\u03f4"+
		"\u00d6\3\2\2\2\u03f5\u03f6\7]\2\2\u03f6\u00d8\3\2\2\2\u03f7\u03f8\7_\2"+
		"\2\u03f8\u00da\3\2\2\2\u03f9\u03fa\7=\2\2\u03fa\u00dc\3\2\2\2\u03fb\u03fc"+
		"\7.\2\2\u03fc\u00de\3\2\2\2\u03fd\u03fe\7\60\2\2\u03fe\u00e0\3\2\2\2\u03ff"+
		"\u0400\7?\2\2\u0400\u00e2\3\2\2\2\u0401\u0402\7@\2\2\u0402\u00e4\3\2\2"+
		"\2\u0403\u0404\7>\2\2\u0404\u00e6\3\2\2\2\u0405\u0406\7#\2\2\u0406\u00e8"+
		"\3\2\2\2\u0407\u0408\7\u0080\2\2\u0408\u00ea\3\2\2\2\u0409\u040a\7A\2"+
		"\2\u040a\u00ec\3\2\2\2\u040b\u040c\7<\2\2\u040c\u00ee\3\2\2\2\u040d\u040e"+
		"\7?\2\2\u040e\u040f\7?\2\2\u040f\u00f0\3\2\2\2\u0410\u0411\7>\2\2\u0411"+
		"\u0412\7?\2\2\u0412\u00f2\3\2\2\2\u0413\u0414\7@\2\2\u0414\u0415\7?\2"+
		"\2\u0415\u00f4\3\2\2\2\u0416\u0417\7#\2\2\u0417\u0418\7?\2\2\u0418\u00f6"+
		"\3\2\2\2\u0419\u041a\7(\2\2\u041a\u041b\7(\2\2\u041b\u00f8\3\2\2\2\u041c"+
		"\u041d\7~\2\2\u041d\u041e\7~\2\2\u041e\u00fa\3\2\2\2\u041f\u0420\7-\2"+
		"\2\u0420\u0421\7-\2\2\u0421\u00fc\3\2\2\2\u0422\u0423\7/\2\2\u0423\u0424"+
		"\7/\2\2\u0424\u00fe\3\2\2\2\u0425\u0426\7-\2\2\u0426\u0100\3\2\2\2\u0427"+
		"\u0428\7/\2\2\u0428\u0102\3\2\2\2\u0429\u042a\7,\2\2\u042a\u0104\3\2\2"+
		"\2\u042b\u042c\7\61\2\2\u042c\u0106\3\2\2\2\u042d\u042e\7(\2\2\u042e\u0108"+
		"\3\2\2\2\u042f\u0430\7~\2\2\u0430\u010a\3\2\2\2\u0431\u0432\7`\2\2\u0432"+
		"\u010c\3\2\2\2\u0433\u0434\7\'\2\2\u0434\u010e\3\2\2\2\u0435\u0436\7/"+
		"\2\2\u0436\u0437\7@\2\2\u0437\u0110\3\2\2\2\u0438\u0439\7<\2\2\u0439\u043a"+
		"\7<\2\2\u043a\u0112\3\2\2\2\u043b\u043c\7-\2\2\u043c\u043d\7?\2\2\u043d"+
		"\u0114\3\2\2\2\u043e\u043f\7/\2\2\u043f\u0440\7?\2\2\u0440\u0116\3\2\2"+
		"\2\u0441\u0442\7,\2\2\u0442\u0443\7?\2\2\u0443\u0118\3\2\2\2\u0444\u0445"+
		"\7\61\2\2\u0445\u0446\7?\2\2\u0446\u011a\3\2\2\2\u0447\u0448\7(\2\2\u0448"+
		"\u0449\7?\2\2\u0449\u011c\3\2\2\2\u044a\u044b\7~\2\2\u044b\u044c\7?\2"+
		"\2\u044c\u011e\3\2\2\2\u044d\u044e\7`\2\2\u044e\u044f\7?\2\2\u044f\u0120"+
		"\3\2\2\2\u0450\u0451\7\'\2\2\u0451\u0452\7?\2\2\u0452\u0122\3\2\2\2\u0453"+
		"\u0454\7>\2\2\u0454\u0455\7>\2\2\u0455\u0456\7?\2\2\u0456\u0124\3\2\2"+
		"\2\u0457\u0458\7@\2\2\u0458\u0459\7@\2\2\u0459\u045a\7?\2\2\u045a\u0126"+
		"\3\2\2\2\u045b\u045c\7@\2\2\u045c\u045d\7@\2\2\u045d\u045e\7@\2\2\u045e"+
		"\u045f\7?\2\2\u045f\u0128\3\2\2\2\u0460\u0464\5\u012b\u0096\2\u0461\u0463"+
		"\5\u012d\u0097\2\u0462\u0461\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0462\3"+
		"\2\2\2\u0464\u0465\3\2\2\2\u0465\u012a\3\2\2\2\u0466\u0464\3\2\2\2\u0467"+
		"\u0469\t\21\2\2\u0468\u0467\3\2\2\2\u0469\u012c\3\2\2\2\u046a\u046d\5"+
		"\u012b\u0096\2\u046b\u046d\t\22\2\2\u046c\u046a\3\2\2\2\u046c\u046b\3"+
		"\2\2\2\u046d\u012e\3\2\2\2\u046e\u046f\7B\2\2\u046f\u0130\3\2\2\2\u0470"+
		"\u0471\7\60\2\2\u0471\u0472\7\60\2\2\u0472\u0473\7\60\2\2\u0473\u0132"+
		"\3\2\2\2\u0474\u0476\t\23\2\2\u0475\u0474\3\2\2\2\u0476\u0477\3\2\2\2"+
		"\u0477\u0475\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a"+
		"\b\u009a\2\2\u047a\u0134\3\2\2\2\u047b\u047c\7\61\2\2\u047c\u047d\7,\2"+
		"\2\u047d\u0481\3\2\2\2\u047e\u0480\13\2\2\2\u047f\u047e\3\2\2\2\u0480"+
		"\u0483\3\2\2\2\u0481\u0482\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u0484\3\2"+
		"\2\2\u0483\u0481\3\2\2\2\u0484\u0485\7,\2\2\u0485\u0486\7\61\2\2\u0486"+
		"\u0487\3\2\2\2\u0487\u0488\b\u009b\2\2\u0488\u0136\3\2\2\2\u0489\u048a"+
		"\7\61\2\2\u048a\u048b\7\61\2\2\u048b\u048f\3\2\2\2\u048c\u048e\n\24\2"+
		"\2\u048d\u048c\3\2\2\2\u048e\u0491\3\2\2\2\u048f\u048d\3\2\2\2\u048f\u0490"+
		"\3\2\2\2\u0490\u0492\3\2\2\2\u0491\u048f\3\2\2\2\u0492\u0493\b\u009c\2"+
		"\2\u0493\u0138\3\2\2\2<\2\u02ad\u02ca\u02d7\u02dd\u02e1\u02e5\u02e9\u02ed"+
		"\u02f4\u02f9\u02fb\u02ff\u0302\u0306\u030d\u0311\u0316\u031e\u0321\u0328"+
		"\u032c\u0330\u0336\u0339\u0340\u0344\u034c\u034f\u0356\u035a\u035e\u0363"+
		"\u0366\u0369\u036e\u0371\u0376\u037b\u0383\u038e\u0392\u0397\u039b\u03ab"+
		"\u03b5\u03bb\u03c2\u03c6\u03cc\u03d9\u03e1\u0464\u0468\u046c\u0477\u0481"+
		"\u048f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
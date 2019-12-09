// Generated from C:/Users/Paolo/Documents/Compilr/finalCompiler/CMPILER-MP/AiRingo/src/Main\AiRingoParser.g4 by ANTLR 4.7.2
package Main;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AiRingoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ARROW=89, COLONCOLON=90, 
		ADD_ASSIGN=91, SUB_ASSIGN=92, MUL_ASSIGN=93, DIV_ASSIGN=94, AND_ASSIGN=95, 
		OR_ASSIGN=96, XOR_ASSIGN=97, MOD_ASSIGN=98, LSHIFT_ASSIGN=99, RSHIFT_ASSIGN=100, 
		URSHIFT_ASSIGN=101, Identifier=102, AT=103, ELLIPSIS=104, WS=105, COMMENT=106, 
		LINE_COMMENT=107;
	public static final int
		RULE_startRule = 0, RULE_literal = 1, RULE_primitiveType = 2, RULE_numericType = 3, 
		RULE_integralType = 4, RULE_floatingPointType = 5, RULE_referenceType = 6, 
		RULE_classOrInterfaceType = 7, RULE_classType = 8, RULE_classType_lf_classOrInterfaceType = 9, 
		RULE_classType_lfno_classOrInterfaceType = 10, RULE_interfaceType = 11, 
		RULE_interfaceType_lf_classOrInterfaceType = 12, RULE_interfaceType_lfno_classOrInterfaceType = 13, 
		RULE_typeVariable = 14, RULE_arrayType = 15, RULE_dims = 16, RULE_typeParameter = 17, 
		RULE_typeBound = 18, RULE_additionalBound = 19, RULE_typeArguments = 20, 
		RULE_typeArgumentList = 21, RULE_typeArgument = 22, RULE_wildcard = 23, 
		RULE_wildcardBounds = 24, RULE_typeName = 25, RULE_expressionName = 26, 
		RULE_methodName = 27, RULE_ambiguousName = 28, RULE_classDeclaration = 29, 
		RULE_normalClassDeclaration = 30, RULE_classModifier = 31, RULE_typeParameters = 32, 
		RULE_typeParameterList = 33, RULE_superclass = 34, RULE_superinterfaces = 35, 
		RULE_interfaceTypeList = 36, RULE_classBody = 37, RULE_classBodyDeclaration = 38, 
		RULE_classMemberDeclaration = 39, RULE_fieldDeclaration = 40, RULE_fieldModifier = 41, 
		RULE_variableDeclaratorList = 42, RULE_variableDeclarator = 43, RULE_variableDeclaratorId = 44, 
		RULE_variableInitializer = 45, RULE_unannType = 46, RULE_unannPrimitiveType = 47, 
		RULE_unannReferenceType = 48, RULE_unannClassOrInterfaceType = 49, RULE_unannClassType = 50, 
		RULE_unannClassType_lf_unannClassOrInterfaceType = 51, RULE_unannClassType_lfno_unannClassOrInterfaceType = 52, 
		RULE_unannInterfaceType = 53, RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 54, 
		RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 55, RULE_unannTypeVariable = 56, 
		RULE_unannArrayType = 57, RULE_methodDeclaration = 58, RULE_methodModifier = 59, 
		RULE_methodHeader = 60, RULE_result = 61, RULE_methodDeclarator = 62, 
		RULE_formalParameterList = 63, RULE_variableModifier = 64, RULE_throws_ = 65, 
		RULE_exceptionTypeList = 66, RULE_exceptionType = 67, RULE_methodBody = 68, 
		RULE_instanceInitializer = 69, RULE_staticInitializer = 70, RULE_constructorDeclaration = 71, 
		RULE_constructorModifier = 72, RULE_constructorDeclarator = 73, RULE_simpleTypeName = 74, 
		RULE_constructorBody = 75, RULE_explicitConstructorInvocation = 76, RULE_enumDeclaration = 77, 
		RULE_enumBody = 78, RULE_enumConstantList = 79, RULE_enumConstant = 80, 
		RULE_enumBodyDeclarations = 81, RULE_arrayInitializer = 82, RULE_variableInitializerList = 83, 
		RULE_block = 84, RULE_blockStatements = 85, RULE_blockStatement = 86, 
		RULE_localVariableDeclarationStatement = 87, RULE_localVariableDeclaration = 88, 
		RULE_statement = 89, RULE_statementNoShortIf = 90, RULE_statementWithoutTrailingSubstatement = 91, 
		RULE_emptyStatement = 92, RULE_labeledStatement = 93, RULE_labeledStatementNoShortIf = 94, 
		RULE_expressionStatement = 95, RULE_statementExpression = 96, RULE_ifThenStatement = 97, 
		RULE_ifThenElseStatement = 98, RULE_ifThenElseStatementNoShortIf = 99, 
		RULE_assertStatement = 100, RULE_switchStatement = 101, RULE_switchBlock = 102, 
		RULE_switchBlockStatementGroup = 103, RULE_switchLabels = 104, RULE_switchLabel = 105, 
		RULE_enumConstantName = 106, RULE_whileStatement = 107, RULE_whileStatementNoShortIf = 108, 
		RULE_doStatement = 109, RULE_forStatement = 110, RULE_forStatementNoShortIf = 111, 
		RULE_basicForStatement = 112, RULE_basicForStatementNoShortIf = 113, RULE_forInit = 114, 
		RULE_forUpdate = 115, RULE_statementExpressionList = 116, RULE_enhancedForStatement = 117, 
		RULE_enhancedForStatementNoShortIf = 118, RULE_breakStatement = 119, RULE_continueStatement = 120, 
		RULE_returnStatement = 121, RULE_throwStatement = 122, RULE_synchronizedStatement = 123, 
		RULE_tryStatement = 124, RULE_catches = 125, RULE_catchClause = 126, RULE_catchFormalParameter = 127, 
		RULE_catchType = 128, RULE_finally_ = 129, RULE_tryWithResourcesStatement = 130, 
		RULE_resourceSpecification = 131, RULE_resourceList = 132, RULE_resource = 133, 
		RULE_primary = 134, RULE_primaryNoNewArray = 135, RULE_primaryNoNewArray_lf_arrayAccess = 136, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 137, RULE_primaryNoNewArray_lf_primary = 138, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 139, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 140, 
		RULE_primaryNoNewArray_lfno_primary = 141, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 142, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 143, 
		RULE_classInstanceCreationExpression = 144, RULE_classInstanceCreationExpression_lf_primary = 145, 
		RULE_classInstanceCreationExpression_lfno_primary = 146, RULE_typeArgumentsOrDiamond = 147, 
		RULE_fieldAccess = 148, RULE_fieldAccess_lf_primary = 149, RULE_fieldAccess_lfno_primary = 150, 
		RULE_arrayAccess = 151, RULE_arrayAccess_lf_primary = 152, RULE_arrayAccess_lfno_primary = 153, 
		RULE_methodInvocation = 154, RULE_methodInvocation_lf_primary = 155, RULE_methodInvocation_lfno_primary = 156, 
		RULE_argumentList = 157, RULE_methodReference = 158, RULE_methodReference_lf_primary = 159, 
		RULE_methodReference_lfno_primary = 160, RULE_arrayCreationExpression = 161, 
		RULE_dimExprs = 162, RULE_dimExpr = 163, RULE_constantExpression = 164, 
		RULE_expression = 165, RULE_lambdaExpression = 166, RULE_lambdaParameters = 167, 
		RULE_inferredFormalParameterList = 168, RULE_lambdaBody = 169, RULE_assignmentExpression = 170, 
		RULE_assignment = 171, RULE_leftHandSide = 172, RULE_assignmentOperator = 173, 
		RULE_conditionalExpression = 174, RULE_conditionalOrExpression = 175, 
		RULE_conditionalAndExpression = 176, RULE_inclusiveOrExpression = 177, 
		RULE_exclusiveOrExpression = 178, RULE_andExpression = 179, RULE_equalityExpression = 180, 
		RULE_relationalExpression = 181, RULE_shiftExpression = 182, RULE_additiveExpression = 183, 
		RULE_multiplicativeExpression = 184, RULE_unaryExpression = 185, RULE_preIncrementExpression = 186, 
		RULE_preDecrementExpression = 187, RULE_unaryExpressionNotPlusMinus = 188, 
		RULE_postfixExpression = 189, RULE_postIncrementExpression = 190, RULE_postIncrementExpression_lf_postfixExpression = 191, 
		RULE_postDecrementExpression = 192, RULE_postDecrementExpression_lf_postfixExpression = 193, 
		RULE_castExpression = 194;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "literal", "primitiveType", "numericType", "integralType", 
			"floatingPointType", "referenceType", "classOrInterfaceType", "classType", 
			"classType_lf_classOrInterfaceType", "classType_lfno_classOrInterfaceType", 
			"interfaceType", "interfaceType_lf_classOrInterfaceType", "interfaceType_lfno_classOrInterfaceType", 
			"typeVariable", "arrayType", "dims", "typeParameter", "typeBound", "additionalBound", 
			"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
			"typeName", "expressionName", "methodName", "ambiguousName", "classDeclaration", 
			"normalClassDeclaration", "classModifier", "typeParameters", "typeParameterList", 
			"superclass", "superinterfaces", "interfaceTypeList", "classBody", "classBodyDeclaration", 
			"classMemberDeclaration", "fieldDeclaration", "fieldModifier", "variableDeclaratorList", 
			"variableDeclarator", "variableDeclaratorId", "variableInitializer", 
			"unannType", "unannPrimitiveType", "unannReferenceType", "unannClassOrInterfaceType", 
			"unannClassType", "unannClassType_lf_unannClassOrInterfaceType", "unannClassType_lfno_unannClassOrInterfaceType", 
			"unannInterfaceType", "unannInterfaceType_lf_unannClassOrInterfaceType", 
			"unannInterfaceType_lfno_unannClassOrInterfaceType", "unannTypeVariable", 
			"unannArrayType", "methodDeclaration", "methodModifier", "methodHeader", 
			"result", "methodDeclarator", "formalParameterList", "variableModifier", 
			"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
			"staticInitializer", "constructorDeclaration", "constructorModifier", 
			"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
			"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumBodyDeclarations", 
			"arrayInitializer", "variableInitializerList", "block", "blockStatements", 
			"blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
			"statement", "statementNoShortIf", "statementWithoutTrailingSubstatement", 
			"emptyStatement", "labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
			"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
			"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
			"switchLabels", "switchLabel", "enumConstantName", "whileStatement", 
			"whileStatementNoShortIf", "doStatement", "forStatement", "forStatementNoShortIf", 
			"basicForStatement", "basicForStatementNoShortIf", "forInit", "forUpdate", 
			"statementExpressionList", "enhancedForStatement", "enhancedForStatementNoShortIf", 
			"breakStatement", "continueStatement", "returnStatement", "throwStatement", 
			"synchronizedStatement", "tryStatement", "catches", "catchClause", "catchFormalParameter", 
			"catchType", "finally_", "tryWithResourcesStatement", "resourceSpecification", 
			"resourceList", "resource", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
			"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
			"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
			"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
			"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
			"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
			"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
			"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", 
			"methodInvocation", "methodInvocation_lf_primary", "methodInvocation_lfno_primary", 
			"argumentList", "methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
			"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
			"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
			"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
			"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
			"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
			"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
			"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
			"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
			"postDecrementExpression_lf_postfixExpression", "castExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstrakto'", "'asserto'", "'boorean'", "'bureko'", "'byto'", 
			"'kesu'", "'katchu'", "'karu'", "'kurasu'", "'konst'", "'kontinu'", "'deporuto'", 
			"'do'", "'doburu'", "'erusu'", "'enumu'", "'extendo'", "'finar'", "'finarri'", 
			"'furoto'", "'foru'", "'ifu'", "'iku'", "'impremento'", "'importo'", 
			"'insutaof'", "'into'", "'intefeseru'", "'rongu'", "'netivu'", "'newu'", 
			"'pakeju'", "'privatto'", "'protekto'", "'pubriko'", "'returno'", "'shorto'", 
			"'statiku'", "'strictofp'", "'supa'", "'switchu'", "'sinkuronaizu'", 
			"'disu'", "'throwu'", "'throwsu'", "'transento'", "'tryu'", "'boido'", 
			"'voratiru'", "'wairu'", null, null, null, null, null, "'null'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
			"'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
			"'%'", "'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
			"'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", 
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", 
			"COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "WS", 
			"COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "AiRingoParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AiRingoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartRuleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AiRingoParser.EOF, 0); }
		public List<BlockStatementsContext> blockStatements() {
			return getRuleContexts(BlockStatementsContext.class);
		}
		public BlockStatementsContext blockStatements(int i) {
			return getRuleContext(BlockStatementsContext.class,i);
		}
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitStartRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)))) != 0)) {
				{
				{
				setState(390);
				blockStatements();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(AiRingoParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(AiRingoParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AiRingoParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(AiRingoParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(AiRingoParser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(AiRingoParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(AiRingoParser.BOOLEAN, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(BOOLEAN);
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

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericType);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				floatingPointType();
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

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(AiRingoParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(AiRingoParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(AiRingoParser.INT, 0); }
		public TerminalNode LONG() { return getToken(AiRingoParser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(AiRingoParser.CHAR, 0); }
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitIntegralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(AiRingoParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(AiRingoParser.DOUBLE, 0); }
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFloatingPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referenceType);
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				arrayType();
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(417);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(418);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(423);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(421);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(422);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType);
		int _la;
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(Identifier);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(429);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				classOrInterfaceType();
				setState(433);
				match(DOT);
				setState(434);
				match(Identifier);
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(435);
					typeArguments();
					}
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

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(DOT);
			setState(441);
			match(Identifier);
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(442);
				typeArguments();
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

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(Identifier);
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(446);
				typeArguments();
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

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			classType();
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

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInterfaceType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			classType_lf_classOrInterfaceType();
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

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInterfaceType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			classType_lfno_classOrInterfaceType();
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

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(Identifier);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				primitiveType();
				setState(458);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				classOrInterfaceType();
				setState(461);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				typeVariable();
				setState(464);
				dims();
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

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dims);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(LBRACK);
			setState(469);
			match(RBRACK);
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(470);
					match(LBRACK);
					setState(471);
					match(RBRACK);
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(Identifier);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(478);
				typeBound();
				}
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

	public static class TypeBoundContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(AiRingoParser.EXTENDS, 0); }
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeBound);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(EXTENDS);
				setState(482);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				match(EXTENDS);
				setState(484);
				classOrInterfaceType();
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(485);
					additionalBound();
					}
					}
					setState(490);
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

	public static class AdditionalBoundContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(AiRingoParser.BITAND, 0); }
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAdditionalBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAdditionalBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(BITAND);
			setState(494);
			interfaceType();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(AiRingoParser.LT, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode GT() { return getToken(AiRingoParser.GT, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(LT);
			setState(497);
			typeArgumentList();
			setState(498);
			match(GT);
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

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			typeArgument();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(501);
				match(COMMA);
				setState(502);
				typeArgument();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgument);
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				referenceType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				wildcard();
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

	public static class WildcardContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(AiRingoParser.QUESTION, 0); }
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(QUESTION);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(513);
				wildcardBounds();
				}
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

	public static class WildcardBoundsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(AiRingoParser.EXTENDS, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitWildcardBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcardBounds);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(EXTENDS);
				setState(517);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(SUPER);
				setState(519);
				referenceType();
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(Identifier);
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

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionName);
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				ambiguousName(0);
				setState(526);
				match(DOT);
				setState(527);
				match(Identifier);
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(Identifier);
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

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAmbiguousName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAmbiguousName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(534);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(536);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(537);
					match(DOT);
					setState(538);
					match(Identifier);
					}
					} 
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_classDeclaration);
		try {
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				enumDeclaration();
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

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AiRingoParser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT) {
				{
				{
				setState(548);
				classModifier();
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(554);
			match(CLASS);
			setState(555);
			match(Identifier);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(556);
				typeParameters();
				}
			}

			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(559);
				superclass();
				}
			}

			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(562);
				superinterfaces();
				}
			}

			setState(565);
			classBody();
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

	public static class ClassModifierContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(AiRingoParser.ABSTRACT, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_classModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(ABSTRACT);
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(AiRingoParser.LT, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode GT() { return getToken(AiRingoParser.GT, 0); }
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(LT);
			setState(570);
			typeParameterList();
			setState(571);
			match(GT);
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

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			typeParameter();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(574);
				match(COMMA);
				setState(575);
				typeParameter();
				}
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(AiRingoParser.EXTENDS, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSuperclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(EXTENDS);
			setState(582);
			classType();
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

	public static class SuperinterfacesContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(AiRingoParser.IMPLEMENTS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSuperinterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSuperinterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(IMPLEMENTS);
			setState(585);
			interfaceTypeList();
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

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInterfaceTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInterfaceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			interfaceType();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(588);
				match(COMMA);
				setState(589);
				interfaceType();
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AiRingoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AiRingoParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(LBRACE);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || _la==LT || _la==Identifier) {
				{
				{
				setState(596);
				classBodyDeclaration();
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(602);
			match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classBodyDeclaration);
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(606);
				staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(607);
				constructorDeclaration();
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

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classMemberDeclaration);
		try {
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
				match(SEMI);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) {
				{
				{
				setState(616);
				fieldModifier();
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(622);
			unannType();
			setState(623);
			variableDeclaratorList();
			setState(624);
			match(SEMI);
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

	public static class FieldModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(AiRingoParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(AiRingoParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(AiRingoParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(AiRingoParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(AiRingoParser.FINAL, 0); }
		public TerminalNode TRANSIENT() { return getToken(AiRingoParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(AiRingoParser.VOLATILE, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFieldModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitVariableDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			variableDeclarator();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(629);
				match(COMMA);
				setState(630);
				variableDeclarator();
				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AiRingoParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			variableDeclaratorId();
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(637);
				match(ASSIGN);
				setState(638);
				variableInitializer();
				}
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(Identifier);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(642);
				dims();
				}
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableInitializer);
		try {
			setState(647);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				expression();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				arrayInitializer();
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

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unannType);
		try {
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				unannReferenceType();
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

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(AiRingoParser.BOOLEAN, 0); }
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unannPrimitiveType);
		try {
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				match(BOOLEAN);
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

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_unannReferenceType);
		try {
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(659);
				unannArrayType();
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

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(662);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(663);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(668);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(666);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(667);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unannClassType);
		int _la;
		try {
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				match(Identifier);
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(674);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				unannClassOrInterfaceType();
				setState(678);
				match(DOT);
				setState(679);
				match(Identifier);
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(680);
					typeArguments();
					}
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

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannClassType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(DOT);
			setState(686);
			match(Identifier);
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(687);
				typeArguments();
				}
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

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannClassType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(Identifier);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(691);
				typeArguments();
				}
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

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			unannClassType();
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

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			unannClassType_lf_unannClassOrInterfaceType();
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

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			unannClassType_lfno_unannClassOrInterfaceType();
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

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(Identifier);
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

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unannArrayType);
		try {
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				unannPrimitiveType();
				setState(703);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				unannClassOrInterfaceType();
				setState(706);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(708);
				unannTypeVariable();
				setState(709);
				dims();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT) {
				{
				{
				setState(713);
				methodModifier();
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(719);
			methodHeader();
			setState(720);
			methodBody();
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

	public static class MethodModifierContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(AiRingoParser.ABSTRACT, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_methodModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(ABSTRACT);
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

	public static class MethodHeaderContext extends ParserRuleContext {
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(724);
				result();
				}
				break;
			}
			setState(727);
			methodDeclarator();
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(728);
				throws_();
				}
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

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			unannType();
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

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(Identifier);
			setState(734);
			match(LPAREN);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(735);
				formalParameterList();
				}
			}

			setState(738);
			match(RPAREN);
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(739);
				dims();
				}
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AiRingoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AiRingoParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(Identifier);
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(743);
				match(COMMA);
				setState(744);
				match(Identifier);
				}
				}
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AiRingoParser.CONST, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(CONST);
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

	public static class Throws_Context extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(AiRingoParser.THROWS, 0); }
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitThrows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitThrows_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 130, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(THROWS);
			setState(753);
			exceptionTypeList();
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

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExceptionTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExceptionTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			exceptionType();
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(756);
				match(COMMA);
				setState(757);
				exceptionType();
				}
				}
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExceptionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExceptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_exceptionType);
		try {
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				typeVariable();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_methodBody);
		try {
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				match(SEMI);
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

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInstanceInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInstanceInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			block();
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

	public static class StaticInitializerContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(AiRingoParser.STATIC, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitStaticInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitStaticInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(STATIC);
			setState(774);
			block();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				{
				setState(776);
				constructorModifier();
				}
				}
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(782);
			constructorDeclarator();
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(783);
				throws_();
				}
			}

			setState(786);
			constructorBody();
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

	public static class ConstructorModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(AiRingoParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(AiRingoParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(AiRingoParser.PRIVATE, 0); }
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConstructorModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConstructorModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_constructorModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConstructorDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConstructorDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(790);
				typeParameters();
				}
			}

			setState(793);
			simpleTypeName();
			setState(794);
			match(LPAREN);
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(795);
				formalParameterList();
				}
			}

			setState(798);
			match(RPAREN);
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

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSimpleTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSimpleTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(Identifier);
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AiRingoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AiRingoParser.RBRACE, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(LBRACE);
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(803);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)))) != 0)) {
				{
				setState(806);
				blockStatements();
				}
			}

			setState(809);
			match(RBRACE);
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

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AiRingoParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExplicitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(811);
					typeArguments();
					}
				}

				setState(814);
				match(THIS);
				setState(815);
				match(LPAREN);
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(816);
					argumentList();
					}
				}

				setState(819);
				match(RPAREN);
				setState(820);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(821);
					typeArguments();
					}
				}

				setState(824);
				match(SUPER);
				setState(825);
				match(LPAREN);
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(826);
					argumentList();
					}
				}

				setState(829);
				match(RPAREN);
				setState(830);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(831);
				expressionName();
				setState(832);
				match(DOT);
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(833);
					typeArguments();
					}
				}

				setState(836);
				match(SUPER);
				setState(837);
				match(LPAREN);
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(838);
					argumentList();
					}
				}

				setState(841);
				match(RPAREN);
				setState(842);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(844);
				primary();
				setState(845);
				match(DOT);
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(846);
					typeArguments();
					}
				}

				setState(849);
				match(SUPER);
				setState(850);
				match(LPAREN);
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(851);
					argumentList();
					}
				}

				setState(854);
				match(RPAREN);
				setState(855);
				match(SEMI);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(AiRingoParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT) {
				{
				{
				setState(859);
				classModifier();
				}
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(865);
			match(ENUM);
			setState(866);
			match(Identifier);
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(867);
				superinterfaces();
				}
			}

			setState(870);
			enumBody();
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

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AiRingoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AiRingoParser.RBRACE, 0); }
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AiRingoParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(LBRACE);
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(873);
				enumConstantList();
				}
			}

			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(876);
				match(COMMA);
				}
			}

			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(879);
				enumBodyDeclarations();
				}
			}

			setState(882);
			match(RBRACE);
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

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnumConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnumConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			enumConstant();
			setState(889);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(885);
					match(COMMA);
					setState(886);
					enumConstant();
					}
					} 
				}
				setState(891);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(Identifier);
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(893);
				match(LPAREN);
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(894);
					argumentList();
					}
				}

				setState(897);
				match(RPAREN);
				}
			}

			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(900);
				classBody();
				}
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(SEMI);
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || _la==LT || _la==Identifier) {
				{
				{
				setState(904);
				classBodyDeclaration();
				}
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AiRingoParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AiRingoParser.RBRACK, 0); }
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AiRingoParser.COMMA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(LBRACK);
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACK))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(911);
				variableInitializerList();
				}
			}

			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(914);
				match(COMMA);
				}
			}

			setState(917);
			match(RBRACK);
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

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitVariableInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitVariableInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			variableInitializer();
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(920);
					match(COMMA);
					setState(921);
					variableInitializer();
					}
					} 
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AiRingoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AiRingoParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(LBRACE);
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)))) != 0)) {
				{
				setState(928);
				blockStatements();
				}
			}

			setState(931);
			match(RBRACE);
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

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_blockStatements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(934); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(933);
					blockStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(936); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_blockStatement);
		try {
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(940);
				methodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(941);
				statement();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			localVariableDeclaration();
			setState(945);
			match(SEMI);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(947);
				variableModifier();
				}
				}
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(953);
				unannType();
				}
				break;
			}
			setState(956);
			variableDeclaratorList();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_statement);
		try {
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(958);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(959);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(960);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(961);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(962);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(963);
				forStatement();
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

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_statementNoShortIf);
		try {
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(968);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(969);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(970);
				forStatementNoShortIf();
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

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(973);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				emptyStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(975);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(976);
				assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(977);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(978);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(979);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(980);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(981);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(982);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(983);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(984);
				tryStatement();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(SEMI);
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(AiRingoParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(Identifier);
			setState(990);
			match(COLON);
			setState(991);
			statement();
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

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(AiRingoParser.COLON, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLabeledStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLabeledStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			match(Identifier);
			setState(994);
			match(COLON);
			setState(995);
			statementNoShortIf();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			statementExpression();
			setState(998);
			match(SEMI);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_statementExpression);
		try {
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1000);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1001);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1002);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1003);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1004);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1005);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1006);
				classInstanceCreationExpression();
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

	public static class IfThenStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AiRingoParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitIfThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitIfThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(IF);
			setState(1010);
			match(LPAREN);
			setState(1011);
			expression();
			setState(1012);
			match(RPAREN);
			setState(1013);
			statement();
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

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AiRingoParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(AiRingoParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitIfThenElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitIfThenElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(IF);
			setState(1016);
			match(LPAREN);
			setState(1017);
			expression();
			setState(1018);
			match(RPAREN);
			setState(1019);
			statementNoShortIf();
			setState(1020);
			match(ELSE);
			setState(1021);
			statement();
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

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AiRingoParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AiRingoParser.ELSE, 0); }
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitIfThenElseStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitIfThenElseStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			match(IF);
			setState(1024);
			match(LPAREN);
			setState(1025);
			expression();
			setState(1026);
			match(RPAREN);
			setState(1027);
			statementNoShortIf();
			setState(1028);
			match(ELSE);
			setState(1029);
			statementNoShortIf();
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

	public static class AssertStatementContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(AiRingoParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(AiRingoParser.COLON, 0); }
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_assertStatement);
		try {
			setState(1041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1031);
				match(ASSERT);
				setState(1032);
				expression();
				setState(1033);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				match(ASSERT);
				setState(1036);
				expression();
				setState(1037);
				match(COLON);
				setState(1038);
				expression();
				setState(1039);
				match(SEMI);
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(AiRingoParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			match(SWITCH);
			setState(1044);
			match(LPAREN);
			setState(1045);
			expression();
			setState(1046);
			match(RPAREN);
			setState(1047);
			switchBlock();
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AiRingoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AiRingoParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			match(LBRACE);
			setState(1053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1050);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			setState(1059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1056);
				switchLabel();
				}
				}
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1062);
			match(RBRACE);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			switchLabels();
			setState(1065);
			blockStatements();
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

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSwitchLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSwitchLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			switchLabel();
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1068);
				switchLabel();
				}
				}
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(AiRingoParser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AiRingoParser.COLON, 0); }
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(AiRingoParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_switchLabel);
		try {
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				match(CASE);
				setState(1075);
				constantExpression();
				setState(1076);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
				match(CASE);
				setState(1079);
				enumConstantName();
				setState(1080);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1082);
				match(DEFAULT);
				setState(1083);
				match(COLON);
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

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			match(Identifier);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AiRingoParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			match(WHILE);
			setState(1089);
			match(LPAREN);
			setState(1090);
			expression();
			setState(1091);
			match(RPAREN);
			setState(1092);
			statement();
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

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AiRingoParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitWhileStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitWhileStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(WHILE);
			setState(1095);
			match(LPAREN);
			setState(1096);
			expression();
			setState(1097);
			match(RPAREN);
			setState(1098);
			statementNoShortIf();
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

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(AiRingoParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(AiRingoParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			match(DO);
			setState(1101);
			statement();
			setState(1102);
			match(WHILE);
			setState(1103);
			match(LPAREN);
			setState(1104);
			expression();
			setState(1105);
			match(RPAREN);
			setState(1106);
			match(SEMI);
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

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_forStatement);
		try {
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1108);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				enhancedForStatement();
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

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_forStatementNoShortIf);
		try {
			setState(1114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1112);
				basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1113);
				enhancedForStatementNoShortIf();
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

	public static class BasicForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AiRingoParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(AiRingoParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AiRingoParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitBasicForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitBasicForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			match(FOR);
			setState(1117);
			match(LPAREN);
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)))) != 0)) {
				{
				setState(1118);
				forInit();
				}
			}

			setState(1121);
			match(SEMI);
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1122);
				expression();
				}
			}

			setState(1125);
			match(SEMI);
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)))) != 0)) {
				{
				setState(1126);
				forUpdate();
				}
			}

			setState(1129);
			match(RPAREN);
			setState(1130);
			statement();
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

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AiRingoParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(AiRingoParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AiRingoParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitBasicForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitBasicForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			match(FOR);
			setState(1133);
			match(LPAREN);
			setState(1135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)))) != 0)) {
				{
				setState(1134);
				forInit();
				}
			}

			setState(1137);
			match(SEMI);
			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1138);
				expression();
				}
			}

			setState(1141);
			match(SEMI);
			setState(1143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)))) != 0)) {
				{
				setState(1142);
				forUpdate();
				}
			}

			setState(1145);
			match(RPAREN);
			setState(1146);
			statementNoShortIf();
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

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_forInit);
		try {
			setState(1150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1148);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1149);
				localVariableDeclaration();
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

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			statementExpressionList();
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

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitStatementExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitStatementExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			statementExpression();
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1155);
				match(COMMA);
				setState(1156);
				statementExpression();
				}
				}
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AiRingoParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AiRingoParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnhancedForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnhancedForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(FOR);
			setState(1163);
			match(LPAREN);
			setState(1167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(1164);
				variableModifier();
				}
				}
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1170);
			unannType();
			setState(1171);
			variableDeclaratorId();
			setState(1172);
			match(COLON);
			setState(1173);
			expression();
			setState(1174);
			match(RPAREN);
			setState(1175);
			statement();
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

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AiRingoParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AiRingoParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnhancedForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnhancedForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			match(FOR);
			setState(1178);
			match(LPAREN);
			setState(1182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(1179);
				variableModifier();
				}
				}
				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1185);
			unannType();
			setState(1186);
			variableDeclaratorId();
			setState(1187);
			match(COLON);
			setState(1188);
			expression();
			setState(1189);
			match(RPAREN);
			setState(1190);
			statementNoShortIf();
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AiRingoParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(BREAK);
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1193);
				match(Identifier);
				}
			}

			setState(1196);
			match(SEMI);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(AiRingoParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			match(CONTINUE);
			setState(1200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1199);
				match(Identifier);
				}
			}

			setState(1202);
			match(SEMI);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AiRingoParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			match(RETURN);
			setState(1206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1205);
				expression();
				}
			}

			setState(1208);
			match(SEMI);
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(AiRingoParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			match(THROW);
			setState(1211);
			expression();
			setState(1212);
			match(SEMI);
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

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(AiRingoParser.SYNCHRONIZED, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(SYNCHRONIZED);
			setState(1215);
			match(LPAREN);
			setState(1216);
			expression();
			setState(1217);
			match(RPAREN);
			setState(1218);
			block();
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

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(AiRingoParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_tryStatement);
		int _la;
		try {
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1220);
				match(TRY);
				setState(1221);
				block();
				setState(1222);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224);
				match(TRY);
				setState(1225);
				block();
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1226);
					catches();
					}
				}

				setState(1229);
				finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1231);
				tryWithResourcesStatement();
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

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			catchClause();
			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1235);
				catchClause();
				}
				}
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(AiRingoParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(CATCH);
			setState(1242);
			match(LPAREN);
			setState(1243);
			catchFormalParameter();
			setState(1244);
			match(RPAREN);
			setState(1245);
			block();
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

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitCatchFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitCatchFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(1247);
				variableModifier();
				}
				}
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1253);
			catchType();
			setState(1254);
			variableDeclaratorId();
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

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<TerminalNode> BITOR() { return getTokens(AiRingoParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(AiRingoParser.BITOR, i);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			unannClassType();
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1257);
				match(BITOR);
				setState(1258);
				classType();
				}
				}
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Finally_Context extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(AiRingoParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFinally_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFinally_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 258, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			match(FINALLY);
			setState(1265);
			block();
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

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(AiRingoParser.TRY, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTryWithResourcesStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTryWithResourcesStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			match(TRY);
			setState(1268);
			resourceSpecification();
			setState(1269);
			block();
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1270);
				catches();
				}
			}

			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1273);
				finally_();
				}
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(LPAREN);
			setState(1277);
			resourceList();
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1278);
				match(SEMI);
				}
			}

			setState(1281);
			match(RPAREN);
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

	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(AiRingoParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AiRingoParser.SEMI, i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitResourceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitResourceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			resource();
			setState(1288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1284);
					match(SEMI);
					setState(1285);
					resource();
					}
					} 
				}
				setState(1290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AiRingoParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(1291);
				variableModifier();
				}
				}
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1297);
			unannType();
			setState(1298);
			variableDeclaratorId();
			setState(1299);
			match(ASSIGN);
			setState(1300);
			expression();
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1302);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1303);
				arrayCreationExpression();
				}
				break;
			}
			setState(1309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1306);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
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

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(AiRingoParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(AiRingoParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(AiRingoParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1312);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1313);
				typeName();
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1314);
					match(LBRACK);
					setState(1315);
					match(RBRACK);
					}
					}
					setState(1320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1321);
				match(DOT);
				setState(1322);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1324);
				match(VOID);
				setState(1325);
				match(DOT);
				setState(1326);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1327);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1328);
				typeName();
				setState(1329);
				match(DOT);
				setState(1330);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1332);
				match(LPAREN);
				setState(1333);
				expression();
				setState(1334);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1336);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1337);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1338);
				arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1339);
				methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1340);
				methodReference();
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

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(AiRingoParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(AiRingoParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(AiRingoParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1345);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				typeName();
				setState(1351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1347);
					match(LBRACK);
					setState(1348);
					match(RBRACK);
					}
					}
					setState(1353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1354);
				match(DOT);
				setState(1355);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1357);
				match(VOID);
				setState(1358);
				match(DOT);
				setState(1359);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1360);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1361);
				typeName();
				setState(1362);
				match(DOT);
				setState(1363);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1365);
				match(LPAREN);
				setState(1366);
				expression();
				setState(1367);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1369);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1370);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1371);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1372);
				methodReference();
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

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1375);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1376);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1377);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1378);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1379);
				methodReference_lf_primary();
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

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1384);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1385);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1386);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1387);
				methodReference_lf_primary();
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

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(AiRingoParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(AiRingoParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(AiRingoParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(1430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1390);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1391);
				typeName();
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1392);
					match(LBRACK);
					setState(1393);
					match(RBRACK);
					}
					}
					setState(1398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1399);
				match(DOT);
				setState(1400);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1402);
				unannPrimitiveType();
				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1403);
					match(LBRACK);
					setState(1404);
					match(RBRACK);
					}
					}
					setState(1409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1410);
				match(DOT);
				setState(1411);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1413);
				match(VOID);
				setState(1414);
				match(DOT);
				setState(1415);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1416);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1417);
				typeName();
				setState(1418);
				match(DOT);
				setState(1419);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1421);
				match(LPAREN);
				setState(1422);
				expression();
				setState(1423);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1425);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1426);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1427);
				arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1428);
				methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1429);
				methodReference_lfno_primary();
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

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(AiRingoParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(AiRingoParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(AiRingoParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(1473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1434);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1435);
				typeName();
				setState(1440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1436);
					match(LBRACK);
					setState(1437);
					match(RBRACK);
					}
					}
					setState(1442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1443);
				match(DOT);
				setState(1444);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1446);
				unannPrimitiveType();
				setState(1451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1447);
					match(LBRACK);
					setState(1448);
					match(RBRACK);
					}
					}
					setState(1453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1454);
				match(DOT);
				setState(1455);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1457);
				match(VOID);
				setState(1458);
				match(DOT);
				setState(1459);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1460);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1461);
				typeName();
				setState(1462);
				match(DOT);
				setState(1463);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1465);
				match(LPAREN);
				setState(1466);
				expression();
				setState(1467);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1469);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1470);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1471);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1472);
				methodReference_lfno_primary();
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

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(AiRingoParser.NEW, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AiRingoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AiRingoParser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(AiRingoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AiRingoParser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassInstanceCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassInstanceCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(1534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1475);
				match(NEW);
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1476);
					typeArguments();
					}
				}

				setState(1479);
				match(Identifier);
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1480);
					match(DOT);
					setState(1481);
					match(Identifier);
					}
					}
					setState(1486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1487);
					typeArgumentsOrDiamond();
					}
				}

				setState(1490);
				match(LPAREN);
				setState(1492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1491);
					argumentList();
					}
				}

				setState(1494);
				match(RPAREN);
				setState(1496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(1495);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1498);
				expressionName();
				setState(1499);
				match(DOT);
				setState(1500);
				match(NEW);
				setState(1502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1501);
					typeArguments();
					}
				}

				setState(1504);
				match(Identifier);
				setState(1506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1505);
					typeArgumentsOrDiamond();
					}
				}

				setState(1508);
				match(LPAREN);
				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1509);
					argumentList();
					}
				}

				setState(1512);
				match(RPAREN);
				setState(1514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(1513);
					classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1516);
				primary();
				setState(1517);
				match(DOT);
				setState(1518);
				match(NEW);
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1519);
					typeArguments();
					}
				}

				setState(1522);
				match(Identifier);
				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1523);
					typeArgumentsOrDiamond();
					}
				}

				setState(1526);
				match(LPAREN);
				setState(1528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1527);
					argumentList();
					}
				}

				setState(1530);
				match(RPAREN);
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(1531);
					classBody();
					}
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

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode NEW() { return getToken(AiRingoParser.NEW, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassInstanceCreationExpression_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(DOT);
			setState(1537);
			match(NEW);
			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1538);
				typeArguments();
				}
			}

			setState(1541);
			match(Identifier);
			setState(1543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1542);
				typeArgumentsOrDiamond();
				}
			}

			setState(1545);
			match(LPAREN);
			setState(1547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1546);
				argumentList();
				}
			}

			setState(1549);
			match(RPAREN);
			setState(1551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1550);
				classBody();
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

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(AiRingoParser.NEW, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AiRingoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AiRingoParser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(AiRingoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AiRingoParser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassInstanceCreationExpression_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(1594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1553);
				match(NEW);
				setState(1555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1554);
					typeArguments();
					}
				}

				setState(1557);
				match(Identifier);
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1558);
					match(DOT);
					setState(1559);
					match(Identifier);
					}
					}
					setState(1564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1565);
					typeArgumentsOrDiamond();
					}
				}

				setState(1568);
				match(LPAREN);
				setState(1570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1569);
					argumentList();
					}
				}

				setState(1572);
				match(RPAREN);
				setState(1574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1573);
					classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1576);
				expressionName();
				setState(1577);
				match(DOT);
				setState(1578);
				match(NEW);
				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1579);
					typeArguments();
					}
				}

				setState(1582);
				match(Identifier);
				setState(1584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1583);
					typeArgumentsOrDiamond();
					}
				}

				setState(1586);
				match(LPAREN);
				setState(1588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1587);
					argumentList();
					}
				}

				setState(1590);
				match(RPAREN);
				setState(1592);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1591);
					classBody();
					}
					break;
				}
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode LT() { return getToken(AiRingoParser.LT, 0); }
		public TerminalNode GT() { return getToken(AiRingoParser.GT, 0); }
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_typeArgumentsOrDiamond);
		try {
			setState(1599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1596);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1597);
				match(LT);
				setState(1598);
				match(GT);
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

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(AiRingoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AiRingoParser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_fieldAccess);
		try {
			setState(1614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1601);
				primary();
				setState(1602);
				match(DOT);
				setState(1603);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1605);
				match(SUPER);
				setState(1606);
				match(DOT);
				setState(1607);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1608);
				typeName();
				setState(1609);
				match(DOT);
				setState(1610);
				match(SUPER);
				setState(1611);
				match(DOT);
				setState(1612);
				match(Identifier);
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

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFieldAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFieldAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			match(DOT);
			setState(1617);
			match(Identifier);
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

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public List<TerminalNode> DOT() { return getTokens(AiRingoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AiRingoParser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFieldAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFieldAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_fieldAccess_lfno_primary);
		try {
			setState(1628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1619);
				match(SUPER);
				setState(1620);
				match(DOT);
				setState(1621);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1622);
				typeName();
				setState(1623);
				match(DOT);
				setState(1624);
				match(SUPER);
				setState(1625);
				match(DOT);
				setState(1626);
				match(Identifier);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1630);
				expressionName();
				setState(1631);
				match(LBRACK);
				setState(1632);
				expression();
				setState(1633);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(1635);
				primaryNoNewArray_lfno_arrayAccess();
				setState(1636);
				match(LBRACK);
				setState(1637);
				expression();
				setState(1638);
				match(RBRACK);
				}
				break;
			}
			setState(1649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1642);
				primaryNoNewArray_lf_arrayAccess();
				setState(1643);
				match(LBRACK);
				setState(1644);
				expression();
				setState(1645);
				match(RBRACK);
				}
				}
				setState(1651);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitArrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitArrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1652);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(1653);
			match(LBRACK);
			setState(1654);
			expression();
			setState(1655);
			match(RBRACK);
			}
			setState(1664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1657);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(1658);
					match(LBRACK);
					setState(1659);
					expression();
					setState(1660);
					match(RBRACK);
					}
					} 
				}
				setState(1666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
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

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitArrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitArrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1667);
				expressionName();
				setState(1668);
				match(LBRACK);
				setState(1669);
				expression();
				setState(1670);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(1672);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(1673);
				match(LBRACK);
				setState(1674);
				expression();
				setState(1675);
				match(RBRACK);
				}
				break;
			}
			setState(1686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1679);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(1680);
					match(LBRACK);
					setState(1681);
					expression();
					setState(1682);
					match(RBRACK);
					}
					} 
				}
				setState(1688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
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

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(AiRingoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AiRingoParser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_methodInvocation);
		int _la;
		try {
			setState(1757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1689);
				methodName();
				setState(1690);
				match(LPAREN);
				setState(1692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1691);
					argumentList();
					}
				}

				setState(1694);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1696);
				typeName();
				setState(1697);
				match(DOT);
				setState(1699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1698);
					typeArguments();
					}
				}

				setState(1701);
				match(Identifier);
				setState(1702);
				match(LPAREN);
				setState(1704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1703);
					argumentList();
					}
				}

				setState(1706);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1708);
				expressionName();
				setState(1709);
				match(DOT);
				setState(1711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1710);
					typeArguments();
					}
				}

				setState(1713);
				match(Identifier);
				setState(1714);
				match(LPAREN);
				setState(1716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1715);
					argumentList();
					}
				}

				setState(1718);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1720);
				primary();
				setState(1721);
				match(DOT);
				setState(1723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1722);
					typeArguments();
					}
				}

				setState(1725);
				match(Identifier);
				setState(1726);
				match(LPAREN);
				setState(1728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1727);
					argumentList();
					}
				}

				setState(1730);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1732);
				match(SUPER);
				setState(1733);
				match(DOT);
				setState(1735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1734);
					typeArguments();
					}
				}

				setState(1737);
				match(Identifier);
				setState(1738);
				match(LPAREN);
				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1739);
					argumentList();
					}
				}

				setState(1742);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1743);
				typeName();
				setState(1744);
				match(DOT);
				setState(1745);
				match(SUPER);
				setState(1746);
				match(DOT);
				setState(1748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1747);
					typeArguments();
					}
				}

				setState(1750);
				match(Identifier);
				setState(1751);
				match(LPAREN);
				setState(1753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1752);
					argumentList();
					}
				}

				setState(1755);
				match(RPAREN);
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

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodInvocation_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodInvocation_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			match(DOT);
			setState(1761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1760);
				typeArguments();
				}
			}

			setState(1763);
			match(Identifier);
			setState(1764);
			match(LPAREN);
			setState(1766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1765);
				argumentList();
				}
			}

			setState(1768);
			match(RPAREN);
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

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(AiRingoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AiRingoParser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodInvocation_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodInvocation_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(1826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				methodName();
				setState(1771);
				match(LPAREN);
				setState(1773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1772);
					argumentList();
					}
				}

				setState(1775);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1777);
				typeName();
				setState(1778);
				match(DOT);
				setState(1780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1779);
					typeArguments();
					}
				}

				setState(1782);
				match(Identifier);
				setState(1783);
				match(LPAREN);
				setState(1785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1784);
					argumentList();
					}
				}

				setState(1787);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1789);
				expressionName();
				setState(1790);
				match(DOT);
				setState(1792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1791);
					typeArguments();
					}
				}

				setState(1794);
				match(Identifier);
				setState(1795);
				match(LPAREN);
				setState(1797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1796);
					argumentList();
					}
				}

				setState(1799);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1801);
				match(SUPER);
				setState(1802);
				match(DOT);
				setState(1804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1803);
					typeArguments();
					}
				}

				setState(1806);
				match(Identifier);
				setState(1807);
				match(LPAREN);
				setState(1809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1808);
					argumentList();
					}
				}

				setState(1811);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1812);
				typeName();
				setState(1813);
				match(DOT);
				setState(1814);
				match(SUPER);
				setState(1815);
				match(DOT);
				setState(1817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1816);
					typeArguments();
					}
				}

				setState(1819);
				match(Identifier);
				setState(1820);
				match(LPAREN);
				setState(1822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1821);
					argumentList();
					}
				}

				setState(1824);
				match(RPAREN);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			expression();
			setState(1833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1829);
				match(COMMA);
				setState(1830);
				expression();
				}
				}
				setState(1835);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MethodReferenceContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(AiRingoParser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(AiRingoParser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_methodReference);
		int _la;
		try {
			setState(1883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1836);
				expressionName();
				setState(1837);
				match(COLONCOLON);
				setState(1839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1838);
					typeArguments();
					}
				}

				setState(1841);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1843);
				referenceType();
				setState(1844);
				match(COLONCOLON);
				setState(1846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1845);
					typeArguments();
					}
				}

				setState(1848);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1850);
				primary();
				setState(1851);
				match(COLONCOLON);
				setState(1853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1852);
					typeArguments();
					}
				}

				setState(1855);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1857);
				match(SUPER);
				setState(1858);
				match(COLONCOLON);
				setState(1860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1859);
					typeArguments();
					}
				}

				setState(1862);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1863);
				typeName();
				setState(1864);
				match(DOT);
				setState(1865);
				match(SUPER);
				setState(1866);
				match(COLONCOLON);
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1867);
					typeArguments();
					}
				}

				setState(1870);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1872);
				classType();
				setState(1873);
				match(COLONCOLON);
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1874);
					typeArguments();
					}
				}

				setState(1877);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1879);
				arrayType();
				setState(1880);
				match(COLONCOLON);
				setState(1881);
				match(NEW);
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

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(AiRingoParser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodReference_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodReference_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			match(COLONCOLON);
			setState(1887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1886);
				typeArguments();
				}
			}

			setState(1889);
			match(Identifier);
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

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(AiRingoParser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(AiRingoParser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodReference_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodReference_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(1931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1891);
				expressionName();
				setState(1892);
				match(COLONCOLON);
				setState(1894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1893);
					typeArguments();
					}
				}

				setState(1896);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1898);
				referenceType();
				setState(1899);
				match(COLONCOLON);
				setState(1901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1900);
					typeArguments();
					}
				}

				setState(1903);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1905);
				match(SUPER);
				setState(1906);
				match(COLONCOLON);
				setState(1908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1907);
					typeArguments();
					}
				}

				setState(1910);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1911);
				typeName();
				setState(1912);
				match(DOT);
				setState(1913);
				match(SUPER);
				setState(1914);
				match(COLONCOLON);
				setState(1916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1915);
					typeArguments();
					}
				}

				setState(1918);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1920);
				classType();
				setState(1921);
				match(COLONCOLON);
				setState(1923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1922);
					typeArguments();
					}
				}

				setState(1925);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1927);
				arrayType();
				setState(1928);
				match(COLONCOLON);
				setState(1929);
				match(NEW);
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

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(AiRingoParser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_arrayCreationExpression);
		try {
			setState(1955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1933);
				match(NEW);
				setState(1934);
				primitiveType();
				setState(1935);
				dimExprs();
				setState(1937);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1936);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1939);
				match(NEW);
				setState(1940);
				classOrInterfaceType();
				setState(1941);
				dimExprs();
				setState(1943);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1942);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1945);
				match(NEW);
				setState(1946);
				primitiveType();
				setState(1947);
				dims();
				setState(1948);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1950);
				match(NEW);
				setState(1951);
				classOrInterfaceType();
				setState(1952);
				dims();
				setState(1953);
				arrayInitializer();
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

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			dimExpr();
			setState(1961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1958);
					dimExpr();
					}
					} 
				}
				setState(1963);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
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

	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AiRingoParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(AiRingoParser.RBRACK, 0); }
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitDimExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_dimExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			match(LBRACK);
			setState(1965);
			expression();
			setState(1966);
			match(RBRACK);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_expression);
		try {
			setState(1972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1970);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1971);
				assignmentExpression();
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(AiRingoParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974);
			lambdaParameters();
			setState(1975);
			match(ARROW);
			setState(1976);
			lambdaBody();
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

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_lambdaParameters);
		int _la;
		try {
			setState(1988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1978);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1979);
				match(LPAREN);
				setState(1981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1980);
					formalParameterList();
					}
				}

				setState(1983);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1984);
				match(LPAREN);
				setState(1985);
				inferredFormalParameterList();
				setState(1986);
				match(RPAREN);
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

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AiRingoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AiRingoParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInferredFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInferredFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			match(Identifier);
			setState(1995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1991);
				match(COMMA);
				setState(1992);
				match(Identifier);
				}
				}
				setState(1997);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_lambdaBody);
		try {
			setState(2000);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1998);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1999);
				block();
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_assignmentExpression);
		try {
			setState(2004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2002);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2003);
				assignment();
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

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2006);
			leftHandSide();
			setState(2007);
			assignmentOperator();
			setState(2008);
			expression();
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

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLeftHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_leftHandSide);
		try {
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2010);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2011);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2012);
				arrayAccess();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(AiRingoParser.ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(AiRingoParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(AiRingoParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(AiRingoParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(AiRingoParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(AiRingoParser.SUB_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(AiRingoParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(AiRingoParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(AiRingoParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(AiRingoParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(AiRingoParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(AiRingoParser.OR_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(AiRingoParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AiRingoParser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_conditionalExpression);
		try {
			setState(2024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2017);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2018);
				conditionalOrExpression(0);
				setState(2019);
				match(QUESTION);
				setState(2020);
				expression();
				setState(2021);
				match(COLON);
				setState(2022);
				conditionalExpression();
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(AiRingoParser.OR, 0); }
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 350;
		enterRecursionRule(_localctx, 350, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2027);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2034);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2029);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2030);
					match(OR);
					setState(2031);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2036);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(AiRingoParser.AND, 0); }
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 352;
		enterRecursionRule(_localctx, 352, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2038);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2045);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2040);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2041);
					match(AND);
					setState(2042);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(2047);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode BITOR() { return getToken(AiRingoParser.BITOR, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 354;
		enterRecursionRule(_localctx, 354, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2049);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2056);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2051);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2052);
					match(BITOR);
					setState(2053);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(2058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode CARET() { return getToken(AiRingoParser.CARET, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 356;
		enterRecursionRule(_localctx, 356, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2060);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2067);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2062);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2063);
					match(CARET);
					setState(2064);
					andExpression(0);
					}
					} 
				}
				setState(2069);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode BITAND() { return getToken(AiRingoParser.BITAND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 358;
		enterRecursionRule(_localctx, 358, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2071);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2078);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2073);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2074);
					match(BITAND);
					setState(2075);
					equalityExpression(0);
					}
					} 
				}
				setState(2080);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AiRingoParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(AiRingoParser.NOTEQUAL, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 360;
		enterRecursionRule(_localctx, 360, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2082);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2092);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2090);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2084);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2085);
						match(EQUAL);
						setState(2086);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2087);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2088);
						match(NOTEQUAL);
						setState(2089);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2094);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(AiRingoParser.LT, 0); }
		public TerminalNode GT() { return getToken(AiRingoParser.GT, 0); }
		public TerminalNode LE() { return getToken(AiRingoParser.LE, 0); }
		public TerminalNode GE() { return getToken(AiRingoParser.GE, 0); }
		public TerminalNode INSTANCEOF() { return getToken(AiRingoParser.INSTANCEOF, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 362;
		enterRecursionRule(_localctx, 362, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2096);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2098);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2099);
						match(LT);
						setState(2100);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2101);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2102);
						match(GT);
						setState(2103);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2104);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2105);
						match(LE);
						setState(2106);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2107);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2108);
						match(GE);
						setState(2109);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2110);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2111);
						match(INSTANCEOF);
						setState(2112);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(2117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public List<TerminalNode> LT() { return getTokens(AiRingoParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(AiRingoParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(AiRingoParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(AiRingoParser.GT, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 364;
		enterRecursionRule(_localctx, 364, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2119);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2121);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2122);
						match(LT);
						setState(2123);
						match(LT);
						setState(2124);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2125);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2126);
						match(GT);
						setState(2127);
						match(GT);
						setState(2128);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2129);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2130);
						match(GT);
						setState(2131);
						match(GT);
						setState(2132);
						match(GT);
						setState(2133);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(AiRingoParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(AiRingoParser.SUB, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 366;
		enterRecursionRule(_localctx, 366, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2140);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2148);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2142);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2143);
						match(ADD);
						setState(2144);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2145);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2146);
						match(SUB);
						setState(2147);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(AiRingoParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AiRingoParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(AiRingoParser.MOD, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 368;
		enterRecursionRule(_localctx, 368, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2154);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2156);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2157);
						match(MUL);
						setState(2158);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2159);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2160);
						match(DIV);
						setState(2161);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2162);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2163);
						match(MOD);
						setState(2164);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(AiRingoParser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(AiRingoParser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_unaryExpression);
		try {
			setState(2177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2170);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2171);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2172);
				match(ADD);
				setState(2173);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2174);
				match(SUB);
				setState(2175);
				unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(2176);
				unaryExpressionNotPlusMinus();
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

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(AiRingoParser.INC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2179);
			match(INC);
			setState(2180);
			unaryExpression();
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

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(AiRingoParser.DEC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPreDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPreDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2182);
			match(DEC);
			setState(2183);
			unaryExpression();
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

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(AiRingoParser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(AiRingoParser.BANG, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2185);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2186);
				match(TILDE);
				setState(2187);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2188);
				match(BANG);
				setState(2189);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2190);
				castExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(2193);
				primary();
				}
				break;
			case 2:
				{
				setState(2194);
				expressionName();
				}
				break;
			}
			setState(2201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2199);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2197);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2198);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
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

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(AiRingoParser.INC, 0); }
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			postfixExpression();
			setState(2205);
			match(INC);
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

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(AiRingoParser.INC, 0); }
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPostIncrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2207);
			match(INC);
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

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(AiRingoParser.DEC, 0); }
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPostDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2209);
			postfixExpression();
			setState(2210);
			match(DEC);
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

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(AiRingoParser.DEC, 0); }
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPostDecrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2212);
			match(DEC);
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

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_castExpression);
		int _la;
		try {
			setState(2241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2214);
				match(LPAREN);
				setState(2215);
				primitiveType();
				setState(2216);
				match(RPAREN);
				setState(2217);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2219);
				match(LPAREN);
				setState(2220);
				referenceType();
				setState(2224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2221);
					additionalBound();
					}
					}
					setState(2226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2227);
				match(RPAREN);
				setState(2228);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2230);
				match(LPAREN);
				setState(2231);
				referenceType();
				setState(2235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2232);
					additionalBound();
					}
					}
					setState(2237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2238);
				match(RPAREN);
				setState(2239);
				lambdaExpression();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 175:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 176:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 177:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 178:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 179:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 180:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 181:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 182:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 183:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 184:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 3);
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3m\u08c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\3\2\7\2\u018a\n\2\f\2\16\2\u018d\13\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\5\4\u0195\n\4\3\5\3\5\5\5\u0199\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b\u01a2"+
		"\n\b\3\t\3\t\5\t\u01a6\n\t\3\t\3\t\7\t\u01aa\n\t\f\t\16\t\u01ad\13\t\3"+
		"\n\3\n\5\n\u01b1\n\n\3\n\3\n\3\n\3\n\5\n\u01b7\n\n\5\n\u01b9\n\n\3\13"+
		"\3\13\3\13\5\13\u01be\n\13\3\f\3\f\5\f\u01c2\n\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01d5"+
		"\n\21\3\22\3\22\3\22\3\22\7\22\u01db\n\22\f\22\16\22\u01de\13\22\3\23"+
		"\3\23\5\23\u01e2\n\23\3\24\3\24\3\24\3\24\3\24\7\24\u01e9\n\24\f\24\16"+
		"\24\u01ec\13\24\5\24\u01ee\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\7\27\u01fa\n\27\f\27\16\27\u01fd\13\27\3\30\3\30\5\30\u0201"+
		"\n\30\3\31\3\31\5\31\u0205\n\31\3\32\3\32\3\32\3\32\5\32\u020b\n\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u0214\n\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u021e\n\36\f\36\16\36\u0221\13\36\3\37\3\37"+
		"\5\37\u0225\n\37\3 \7 \u0228\n \f \16 \u022b\13 \3 \3 \3 \5 \u0230\n "+
		"\3 \5 \u0233\n \3 \5 \u0236\n \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\7"+
		"#\u0243\n#\f#\16#\u0246\13#\3$\3$\3$\3%\3%\3%\3&\3&\3&\7&\u0251\n&\f&"+
		"\16&\u0254\13&\3\'\3\'\7\'\u0258\n\'\f\'\16\'\u025b\13\'\3\'\3\'\3(\3"+
		"(\3(\3(\5(\u0263\n(\3)\3)\3)\3)\5)\u0269\n)\3*\7*\u026c\n*\f*\16*\u026f"+
		"\13*\3*\3*\3*\3*\3+\3+\3,\3,\3,\7,\u027a\n,\f,\16,\u027d\13,\3-\3-\3-"+
		"\5-\u0282\n-\3.\3.\5.\u0286\n.\3/\3/\5/\u028a\n/\3\60\3\60\5\60\u028e"+
		"\n\60\3\61\3\61\5\61\u0292\n\61\3\62\3\62\3\62\5\62\u0297\n\62\3\63\3"+
		"\63\5\63\u029b\n\63\3\63\3\63\7\63\u029f\n\63\f\63\16\63\u02a2\13\63\3"+
		"\64\3\64\5\64\u02a6\n\64\3\64\3\64\3\64\3\64\5\64\u02ac\n\64\5\64\u02ae"+
		"\n\64\3\65\3\65\3\65\5\65\u02b3\n\65\3\66\3\66\5\66\u02b7\n\66\3\67\3"+
		"\67\38\38\39\39\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u02ca\n;\3<\7<\u02cd"+
		"\n<\f<\16<\u02d0\13<\3<\3<\3<\3=\3=\3>\5>\u02d8\n>\3>\3>\5>\u02dc\n>\3"+
		"?\3?\3@\3@\3@\5@\u02e3\n@\3@\3@\5@\u02e7\n@\3A\3A\3A\7A\u02ec\nA\fA\16"+
		"A\u02ef\13A\3B\3B\3C\3C\3C\3D\3D\3D\7D\u02f9\nD\fD\16D\u02fc\13D\3E\3"+
		"E\5E\u0300\nE\3F\3F\5F\u0304\nF\3G\3G\3H\3H\3H\3I\7I\u030c\nI\fI\16I\u030f"+
		"\13I\3I\3I\5I\u0313\nI\3I\3I\3J\3J\3K\5K\u031a\nK\3K\3K\3K\5K\u031f\n"+
		"K\3K\3K\3L\3L\3M\3M\5M\u0327\nM\3M\5M\u032a\nM\3M\3M\3N\5N\u032f\nN\3"+
		"N\3N\3N\5N\u0334\nN\3N\3N\3N\5N\u0339\nN\3N\3N\3N\5N\u033e\nN\3N\3N\3"+
		"N\3N\3N\5N\u0345\nN\3N\3N\3N\5N\u034a\nN\3N\3N\3N\3N\3N\3N\5N\u0352\n"+
		"N\3N\3N\3N\5N\u0357\nN\3N\3N\3N\5N\u035c\nN\3O\7O\u035f\nO\fO\16O\u0362"+
		"\13O\3O\3O\3O\5O\u0367\nO\3O\3O\3P\3P\5P\u036d\nP\3P\5P\u0370\nP\3P\5"+
		"P\u0373\nP\3P\3P\3Q\3Q\3Q\7Q\u037a\nQ\fQ\16Q\u037d\13Q\3R\3R\3R\5R\u0382"+
		"\nR\3R\5R\u0385\nR\3R\5R\u0388\nR\3S\3S\7S\u038c\nS\fS\16S\u038f\13S\3"+
		"T\3T\5T\u0393\nT\3T\5T\u0396\nT\3T\3T\3U\3U\3U\7U\u039d\nU\fU\16U\u03a0"+
		"\13U\3V\3V\5V\u03a4\nV\3V\3V\3W\6W\u03a9\nW\rW\16W\u03aa\3X\3X\3X\3X\5"+
		"X\u03b1\nX\3Y\3Y\3Y\3Z\7Z\u03b7\nZ\fZ\16Z\u03ba\13Z\3Z\5Z\u03bd\nZ\3Z"+
		"\3Z\3[\3[\3[\3[\3[\3[\5[\u03c7\n[\3\\\3\\\3\\\3\\\3\\\5\\\u03ce\n\\\3"+
		"]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u03dc\n]\3^\3^\3_\3_\3_\3_\3`\3"+
		"`\3`\3`\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\5b\u03f2\nb\3c\3c\3c\3c\3c\3c\3"+
		"d\3d\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3"+
		"f\3f\3f\5f\u0414\nf\3g\3g\3g\3g\3g\3g\3h\3h\7h\u041e\nh\fh\16h\u0421\13"+
		"h\3h\7h\u0424\nh\fh\16h\u0427\13h\3h\3h\3i\3i\3i\3j\3j\7j\u0430\nj\fj"+
		"\16j\u0433\13j\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u043f\nk\3l\3l\3m\3m\3"+
		"m\3m\3m\3m\3n\3n\3n\3n\3n\3n\3o\3o\3o\3o\3o\3o\3o\3o\3p\3p\5p\u0459\n"+
		"p\3q\3q\5q\u045d\nq\3r\3r\3r\5r\u0462\nr\3r\3r\5r\u0466\nr\3r\3r\5r\u046a"+
		"\nr\3r\3r\3r\3s\3s\3s\5s\u0472\ns\3s\3s\5s\u0476\ns\3s\3s\5s\u047a\ns"+
		"\3s\3s\3s\3t\3t\5t\u0481\nt\3u\3u\3v\3v\3v\7v\u0488\nv\fv\16v\u048b\13"+
		"v\3w\3w\3w\7w\u0490\nw\fw\16w\u0493\13w\3w\3w\3w\3w\3w\3w\3w\3x\3x\3x"+
		"\7x\u049f\nx\fx\16x\u04a2\13x\3x\3x\3x\3x\3x\3x\3x\3y\3y\5y\u04ad\ny\3"+
		"y\3y\3z\3z\5z\u04b3\nz\3z\3z\3{\3{\5{\u04b9\n{\3{\3{\3|\3|\3|\3|\3}\3"+
		"}\3}\3}\3}\3}\3~\3~\3~\3~\3~\3~\3~\5~\u04ce\n~\3~\3~\3~\5~\u04d3\n~\3"+
		"\177\3\177\7\177\u04d7\n\177\f\177\16\177\u04da\13\177\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\7\u0081\u04e3\n\u0081\f\u0081"+
		"\16\u0081\u04e6\13\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082"+
		"\7\u0082\u04ee\n\u0082\f\u0082\16\u0082\u04f1\13\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u04fa\n\u0084\3\u0084"+
		"\5\u0084\u04fd\n\u0084\3\u0085\3\u0085\3\u0085\5\u0085\u0502\n\u0085\3"+
		"\u0085\3\u0085\3\u0086\3\u0086\3\u0086\7\u0086\u0509\n\u0086\f\u0086\16"+
		"\u0086\u050c\13\u0086\3\u0087\7\u0087\u050f\n\u0087\f\u0087\16\u0087\u0512"+
		"\13\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\5\u0088"+
		"\u051b\n\u0088\3\u0088\7\u0088\u051e\n\u0088\f\u0088\16\u0088\u0521\13"+
		"\u0088\3\u0089\3\u0089\3\u0089\3\u0089\7\u0089\u0527\n\u0089\f\u0089\16"+
		"\u0089\u052a\13\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0540\n\u0089\3\u008a"+
		"\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\7\u008b\u0548\n\u008b\f\u008b"+
		"\16\u008b\u054b\13\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0560\n\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\5\u008c\u0567\n\u008c\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\5\u008e\u056f\n\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\7\u008f\u0575\n\u008f\f\u008f\16\u008f\u0578\13\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u0580\n\u008f\f\u008f"+
		"\16\u008f\u0583\13\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u0599\n\u008f\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u05a1\n\u0091\f\u0091"+
		"\16\u0091\u05a4\13\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\7\u0091\u05ac\n\u0091\f\u0091\16\u0091\u05af\13\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u05c4\n\u0091\3\u0092\3\u0092\5\u0092\u05c8\n\u0092\3\u0092\3\u0092\3"+
		"\u0092\7\u0092\u05cd\n\u0092\f\u0092\16\u0092\u05d0\13\u0092\3\u0092\5"+
		"\u0092\u05d3\n\u0092\3\u0092\3\u0092\5\u0092\u05d7\n\u0092\3\u0092\3\u0092"+
		"\5\u0092\u05db\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u05e1\n"+
		"\u0092\3\u0092\3\u0092\5\u0092\u05e5\n\u0092\3\u0092\3\u0092\5\u0092\u05e9"+
		"\n\u0092\3\u0092\3\u0092\5\u0092\u05ed\n\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\5\u0092\u05f3\n\u0092\3\u0092\3\u0092\5\u0092\u05f7\n\u0092\3"+
		"\u0092\3\u0092\5\u0092\u05fb\n\u0092\3\u0092\3\u0092\5\u0092\u05ff\n\u0092"+
		"\5\u0092\u0601\n\u0092\3\u0093\3\u0093\3\u0093\5\u0093\u0606\n\u0093\3"+
		"\u0093\3\u0093\5\u0093\u060a\n\u0093\3\u0093\3\u0093\5\u0093\u060e\n\u0093"+
		"\3\u0093\3\u0093\5\u0093\u0612\n\u0093\3\u0094\3\u0094\5\u0094\u0616\n"+
		"\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u061b\n\u0094\f\u0094\16\u0094"+
		"\u061e\13\u0094\3\u0094\5\u0094\u0621\n\u0094\3\u0094\3\u0094\5\u0094"+
		"\u0625\n\u0094\3\u0094\3\u0094\5\u0094\u0629\n\u0094\3\u0094\3\u0094\3"+
		"\u0094\3\u0094\5\u0094\u062f\n\u0094\3\u0094\3\u0094\5\u0094\u0633\n\u0094"+
		"\3\u0094\3\u0094\5\u0094\u0637\n\u0094\3\u0094\3\u0094\5\u0094\u063b\n"+
		"\u0094\5\u0094\u063d\n\u0094\3\u0095\3\u0095\3\u0095\5\u0095\u0642\n\u0095"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0651\n\u0096\3\u0097\3\u0097"+
		"\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\5\u0098\u065f\n\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u066b\n\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099\u0672\n\u0099\f\u0099\16\u0099"+
		"\u0675\13\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\7\u009a\u0681\n\u009a\f\u009a\16\u009a\u0684"+
		"\13\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\5\u009b\u0690\n\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\7\u009b\u0697\n\u009b\f\u009b\16\u009b\u069a\13\u009b\3\u009c"+
		"\3\u009c\3\u009c\5\u009c\u069f\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\5\u009c\u06a6\n\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u06ab\n"+
		"\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u06b2\n\u009c\3"+
		"\u009c\3\u009c\3\u009c\5\u009c\u06b7\n\u009c\3\u009c\3\u009c\3\u009c\3"+
		"\u009c\3\u009c\5\u009c\u06be\n\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u06c3"+
		"\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u06ca\n\u009c"+
		"\3\u009c\3\u009c\3\u009c\5\u009c\u06cf\n\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\5\u009c\u06d7\n\u009c\3\u009c\3\u009c\3\u009c"+
		"\5\u009c\u06dc\n\u009c\3\u009c\3\u009c\5\u009c\u06e0\n\u009c\3\u009d\3"+
		"\u009d\5\u009d\u06e4\n\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u06e9\n\u009d"+
		"\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\5\u009e\u06f0\n\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u06f7\n\u009e\3\u009e\3\u009e"+
		"\3\u009e\5\u009e\u06fc\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\5\u009e\u0703\n\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u0708\n\u009e\3"+
		"\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u070f\n\u009e\3\u009e\3"+
		"\u009e\3\u009e\5\u009e\u0714\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3"+
		"\u009e\3\u009e\5\u009e\u071c\n\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u0721"+
		"\n\u009e\3\u009e\3\u009e\5\u009e\u0725\n\u009e\3\u009f\3\u009f\3\u009f"+
		"\7\u009f\u072a\n\u009f\f\u009f\16\u009f\u072d\13\u009f\3\u00a0\3\u00a0"+
		"\3\u00a0\5\u00a0\u0732\n\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\5\u00a0\u0739\n\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0"+
		"\u0740\n\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0747\n"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u074f\n"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0756\n\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u075e\n\u00a0\3"+
		"\u00a1\3\u00a1\5\u00a1\u0762\n\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3"+
		"\u00a2\5\u00a2\u0769\n\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5"+
		"\u00a2\u0770\n\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0777"+
		"\n\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u077f"+
		"\n\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0786\n\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u078e\n\u00a2"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0794\n\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\5\u00a3\u079a\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u07a6\n\u00a3"+
		"\3\u00a4\3\u00a4\7\u00a4\u07aa\n\u00a4\f\u00a4\16\u00a4\u07ad\13\u00a4"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\5\u00a7"+
		"\u07b7\n\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u07c0\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u07c7\n\u00a9\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u07cc\n\u00aa\f\u00aa\16"+
		"\u00aa\u07cf\13\u00aa\3\u00ab\3\u00ab\5\u00ab\u07d3\n\u00ab\3\u00ac\3"+
		"\u00ac\5\u00ac\u07d7\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3"+
		"\u00ae\3\u00ae\5\u00ae\u07e0\n\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u07eb\n\u00b0\3\u00b1\3"+
		"\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u07f3\n\u00b1\f\u00b1\16"+
		"\u00b1\u07f6\13\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\7\u00b2\u07fe\n\u00b2\f\u00b2\16\u00b2\u0801\13\u00b2\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u0809\n\u00b3\f\u00b3\16\u00b3"+
		"\u080c\13\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\7\u00b4"+
		"\u0814\n\u00b4\f\u00b4\16\u00b4\u0817\13\u00b4\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u081f\n\u00b5\f\u00b5\16\u00b5\u0822"+
		"\13\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\7\u00b6\u082d\n\u00b6\f\u00b6\16\u00b6\u0830\13\u00b6\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\7\u00b7"+
		"\u0844\n\u00b7\f\u00b7\16\u00b7\u0847\13\u00b7\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u0859\n\u00b8\f\u00b8\16\u00b8"+
		"\u085c\13\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\7\u00b9\u0867\n\u00b9\f\u00b9\16\u00b9\u086a\13\u00b9"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u0878\n\u00ba\f\u00ba\16\u00ba\u087b"+
		"\13\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb"+
		"\u0884\n\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0892\n\u00be\3\u00bf"+
		"\3\u00bf\5\u00bf\u0896\n\u00bf\3\u00bf\3\u00bf\7\u00bf\u089a\n\u00bf\f"+
		"\u00bf\16\u00bf\u089d\13\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u08b1\n\u00c4\f\u00c4\16\u00c4"+
		"\u08b4\13\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4"+
		"\u08bc\n\u00c4\f\u00c4\16\u00c4\u08bf\13\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\5\u00c4\u08c4\n\u00c4\3\u00c4\2\r:\u0160\u0162\u0164\u0166\u0168\u016a"+
		"\u016c\u016e\u0170\u0172\u00c5\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172"+
		"\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\2\b\3\2\65"+
		":\7\2\7\7\n\n\35\35\37\37\'\'\4\2\20\20\26\26\7\2\24\24#%((\60\60\63\63"+
		"\3\2#%\4\2DD]g\2\u096a\2\u018b\3\2\2\2\4\u0190\3\2\2\2\6\u0194\3\2\2\2"+
		"\b\u0198\3\2\2\2\n\u019a\3\2\2\2\f\u019c\3\2\2\2\16\u01a1\3\2\2\2\20\u01a5"+
		"\3\2\2\2\22\u01b8\3\2\2\2\24\u01ba\3\2\2\2\26\u01bf\3\2\2\2\30\u01c3\3"+
		"\2\2\2\32\u01c5\3\2\2\2\34\u01c7\3\2\2\2\36\u01c9\3\2\2\2 \u01d4\3\2\2"+
		"\2\"\u01d6\3\2\2\2$\u01df\3\2\2\2&\u01ed\3\2\2\2(\u01ef\3\2\2\2*\u01f2"+
		"\3\2\2\2,\u01f6\3\2\2\2.\u0200\3\2\2\2\60\u0202\3\2\2\2\62\u020a\3\2\2"+
		"\2\64\u020c\3\2\2\2\66\u0213\3\2\2\28\u0215\3\2\2\2:\u0217\3\2\2\2<\u0224"+
		"\3\2\2\2>\u0229\3\2\2\2@\u0239\3\2\2\2B\u023b\3\2\2\2D\u023f\3\2\2\2F"+
		"\u0247\3\2\2\2H\u024a\3\2\2\2J\u024d\3\2\2\2L\u0255\3\2\2\2N\u0262\3\2"+
		"\2\2P\u0268\3\2\2\2R\u026d\3\2\2\2T\u0274\3\2\2\2V\u0276\3\2\2\2X\u027e"+
		"\3\2\2\2Z\u0283\3\2\2\2\\\u0289\3\2\2\2^\u028d\3\2\2\2`\u0291\3\2\2\2"+
		"b\u0296\3\2\2\2d\u029a\3\2\2\2f\u02ad\3\2\2\2h\u02af\3\2\2\2j\u02b4\3"+
		"\2\2\2l\u02b8\3\2\2\2n\u02ba\3\2\2\2p\u02bc\3\2\2\2r\u02be\3\2\2\2t\u02c9"+
		"\3\2\2\2v\u02ce\3\2\2\2x\u02d4\3\2\2\2z\u02d7\3\2\2\2|\u02dd\3\2\2\2~"+
		"\u02df\3\2\2\2\u0080\u02e8\3\2\2\2\u0082\u02f0\3\2\2\2\u0084\u02f2\3\2"+
		"\2\2\u0086\u02f5\3\2\2\2\u0088\u02ff\3\2\2\2\u008a\u0303\3\2\2\2\u008c"+
		"\u0305\3\2\2\2\u008e\u0307\3\2\2\2\u0090\u030d\3\2\2\2\u0092\u0316\3\2"+
		"\2\2\u0094\u0319\3\2\2\2\u0096\u0322\3\2\2\2\u0098\u0324\3\2\2\2\u009a"+
		"\u035b\3\2\2\2\u009c\u0360\3\2\2\2\u009e\u036a\3\2\2\2\u00a0\u0376\3\2"+
		"\2\2\u00a2\u037e\3\2\2\2\u00a4\u0389\3\2\2\2\u00a6\u0390\3\2\2\2\u00a8"+
		"\u0399\3\2\2\2\u00aa\u03a1\3\2\2\2\u00ac\u03a8\3\2\2\2\u00ae\u03b0\3\2"+
		"\2\2\u00b0\u03b2\3\2\2\2\u00b2\u03b8\3\2\2\2\u00b4\u03c6\3\2\2\2\u00b6"+
		"\u03cd\3\2\2\2\u00b8\u03db\3\2\2\2\u00ba\u03dd\3\2\2\2\u00bc\u03df\3\2"+
		"\2\2\u00be\u03e3\3\2\2\2\u00c0\u03e7\3\2\2\2\u00c2\u03f1\3\2\2\2\u00c4"+
		"\u03f3\3\2\2\2\u00c6\u03f9\3\2\2\2\u00c8\u0401\3\2\2\2\u00ca\u0413\3\2"+
		"\2\2\u00cc\u0415\3\2\2\2\u00ce\u041b\3\2\2\2\u00d0\u042a\3\2\2\2\u00d2"+
		"\u042d\3\2\2\2\u00d4\u043e\3\2\2\2\u00d6\u0440\3\2\2\2\u00d8\u0442\3\2"+
		"\2\2\u00da\u0448\3\2\2\2\u00dc\u044e\3\2\2\2\u00de\u0458\3\2\2\2\u00e0"+
		"\u045c\3\2\2\2\u00e2\u045e\3\2\2\2\u00e4\u046e\3\2\2\2\u00e6\u0480\3\2"+
		"\2\2\u00e8\u0482\3\2\2\2\u00ea\u0484\3\2\2\2\u00ec\u048c\3\2\2\2\u00ee"+
		"\u049b\3\2\2\2\u00f0\u04aa\3\2\2\2\u00f2\u04b0\3\2\2\2\u00f4\u04b6\3\2"+
		"\2\2\u00f6\u04bc\3\2\2\2\u00f8\u04c0\3\2\2\2\u00fa\u04d2\3\2\2\2\u00fc"+
		"\u04d4\3\2\2\2\u00fe\u04db\3\2\2\2\u0100\u04e4\3\2\2\2\u0102\u04ea\3\2"+
		"\2\2\u0104\u04f2\3\2\2\2\u0106\u04f5\3\2\2\2\u0108\u04fe\3\2\2\2\u010a"+
		"\u0505\3\2\2\2\u010c\u0510\3\2\2\2\u010e\u051a\3\2\2\2\u0110\u053f\3\2"+
		"\2\2\u0112\u0541\3\2\2\2\u0114\u055f\3\2\2\2\u0116\u0566\3\2\2\2\u0118"+
		"\u0568\3\2\2\2\u011a\u056e\3\2\2\2\u011c\u0598\3\2\2\2\u011e\u059a\3\2"+
		"\2\2\u0120\u05c3\3\2\2\2\u0122\u0600\3\2\2\2\u0124\u0602\3\2\2\2\u0126"+
		"\u063c\3\2\2\2\u0128\u0641\3\2\2\2\u012a\u0650\3\2\2\2\u012c\u0652\3\2"+
		"\2\2\u012e\u065e\3\2\2\2\u0130\u066a\3\2\2\2\u0132\u0676\3\2\2\2\u0134"+
		"\u068f\3\2\2\2\u0136\u06df\3\2\2\2\u0138\u06e1\3\2\2\2\u013a\u0724\3\2"+
		"\2\2\u013c\u0726\3\2\2\2\u013e\u075d\3\2\2\2\u0140\u075f\3\2\2\2\u0142"+
		"\u078d\3\2\2\2\u0144\u07a5\3\2\2\2\u0146\u07a7\3\2\2\2\u0148\u07ae\3\2"+
		"\2\2\u014a\u07b2\3\2\2\2\u014c\u07b6\3\2\2\2\u014e\u07b8\3\2\2\2\u0150"+
		"\u07c6\3\2\2\2\u0152\u07c8\3\2\2\2\u0154\u07d2\3\2\2\2\u0156\u07d6\3\2"+
		"\2\2\u0158\u07d8\3\2\2\2\u015a\u07df\3\2\2\2\u015c\u07e1\3\2\2\2\u015e"+
		"\u07ea\3\2\2\2\u0160\u07ec\3\2\2\2\u0162\u07f7\3\2\2\2\u0164\u0802\3\2"+
		"\2\2\u0166\u080d\3\2\2\2\u0168\u0818\3\2\2\2\u016a\u0823\3\2\2\2\u016c"+
		"\u0831\3\2\2\2\u016e\u0848\3\2\2\2\u0170\u085d\3\2\2\2\u0172\u086b\3\2"+
		"\2\2\u0174\u0883\3\2\2\2\u0176\u0885\3\2\2\2\u0178\u0888\3\2\2\2\u017a"+
		"\u0891\3\2\2\2\u017c\u0895\3\2\2\2\u017e\u089e\3\2\2\2\u0180\u08a1\3\2"+
		"\2\2\u0182\u08a3\3\2\2\2\u0184\u08a6\3\2\2\2\u0186\u08c3\3\2\2\2\u0188"+
		"\u018a\5\u00acW\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u018f\7\2\2\3\u018f\3\3\2\2\2\u0190\u0191\t\2\2\2\u0191\5\3\2\2\2\u0192"+
		"\u0195\5\b\5\2\u0193\u0195\7\5\2\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2"+
		"\2\2\u0195\7\3\2\2\2\u0196\u0199\5\n\6\2\u0197\u0199\5\f\7\2\u0198\u0196"+
		"\3\2\2\2\u0198\u0197\3\2\2\2\u0199\t\3\2\2\2\u019a\u019b\t\3\2\2\u019b"+
		"\13\3\2\2\2\u019c\u019d\t\4\2\2\u019d\r\3\2\2\2\u019e\u01a2\5\20\t\2\u019f"+
		"\u01a2\5\36\20\2\u01a0\u01a2\5 \21\2\u01a1\u019e\3\2\2\2\u01a1\u019f\3"+
		"\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\17\3\2\2\2\u01a3\u01a6\5\26\f\2\u01a4"+
		"\u01a6\5\34\17\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01ab\3"+
		"\2\2\2\u01a7\u01aa\5\24\13\2\u01a8\u01aa\5\32\16\2\u01a9\u01a7\3\2\2\2"+
		"\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\21\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b0\7h\2\2\u01af"+
		"\u01b1\5*\26\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b9\3\2"+
		"\2\2\u01b2\u01b3\5\20\t\2\u01b3\u01b4\7C\2\2\u01b4\u01b6\7h\2\2\u01b5"+
		"\u01b7\5*\26\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2"+
		"\2\2\u01b8\u01ae\3\2\2\2\u01b8\u01b2\3\2\2\2\u01b9\23\3\2\2\2\u01ba\u01bb"+
		"\7C\2\2\u01bb\u01bd\7h\2\2\u01bc\u01be\5*\26\2\u01bd\u01bc\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\25\3\2\2\2\u01bf\u01c1\7h\2\2\u01c0\u01c2\5*\26\2"+
		"\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\27\3\2\2\2\u01c3\u01c4"+
		"\5\22\n\2\u01c4\31\3\2\2\2\u01c5\u01c6\5\24\13\2\u01c6\33\3\2\2\2\u01c7"+
		"\u01c8\5\26\f\2\u01c8\35\3\2\2\2\u01c9\u01ca\7h\2\2\u01ca\37\3\2\2\2\u01cb"+
		"\u01cc\5\6\4\2\u01cc\u01cd\5\"\22\2\u01cd\u01d5\3\2\2\2\u01ce\u01cf\5"+
		"\20\t\2\u01cf\u01d0\5\"\22\2\u01d0\u01d5\3\2\2\2\u01d1\u01d2\5\36\20\2"+
		"\u01d2\u01d3\5\"\22\2\u01d3\u01d5\3\2\2\2\u01d4\u01cb\3\2\2\2\u01d4\u01ce"+
		"\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d5!\3\2\2\2\u01d6\u01d7\7?\2\2\u01d7\u01dc"+
		"\7@\2\2\u01d8\u01d9\7?\2\2\u01d9\u01db\7@\2\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd#\3\2\2\2"+
		"\u01de\u01dc\3\2\2\2\u01df\u01e1\7h\2\2\u01e0\u01e2\5&\24\2\u01e1\u01e0"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2%\3\2\2\2\u01e3\u01e4\7\23\2\2\u01e4"+
		"\u01ee\5\36\20\2\u01e5\u01e6\7\23\2\2\u01e6\u01ea\5\20\t\2\u01e7\u01e9"+
		"\5(\25\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01e3\3\2"+
		"\2\2\u01ed\u01e5\3\2\2\2\u01ee\'\3\2\2\2\u01ef\u01f0\7W\2\2\u01f0\u01f1"+
		"\5\30\r\2\u01f1)\3\2\2\2\u01f2\u01f3\7F\2\2\u01f3\u01f4\5,\27\2\u01f4"+
		"\u01f5\7E\2\2\u01f5+\3\2\2\2\u01f6\u01fb\5.\30\2\u01f7\u01f8\7B\2\2\u01f8"+
		"\u01fa\5.\30\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fb\u01fc\3\2\2\2\u01fc-\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0201"+
		"\5\16\b\2\u01ff\u0201\5\60\31\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2"+
		"\2\u0201/\3\2\2\2\u0202\u0204\7I\2\2\u0203\u0205\5\62\32\2\u0204\u0203"+
		"\3\2\2\2\u0204\u0205\3\2\2\2\u0205\61\3\2\2\2\u0206\u0207\7\23\2\2\u0207"+
		"\u020b\5\16\b\2\u0208\u0209\7*\2\2\u0209\u020b\5\16\b\2\u020a\u0206\3"+
		"\2\2\2\u020a\u0208\3\2\2\2\u020b\63\3\2\2\2\u020c\u020d\7h\2\2\u020d\65"+
		"\3\2\2\2\u020e\u0214\7h\2\2\u020f\u0210\5:\36\2\u0210\u0211\7C\2\2\u0211"+
		"\u0212\7h\2\2\u0212\u0214\3\2\2\2\u0213\u020e\3\2\2\2\u0213\u020f\3\2"+
		"\2\2\u0214\67\3\2\2\2\u0215\u0216\7h\2\2\u02169\3\2\2\2\u0217\u0218\b"+
		"\36\1\2\u0218\u0219\7h\2\2\u0219\u021f\3\2\2\2\u021a\u021b\f\3\2\2\u021b"+
		"\u021c\7C\2\2\u021c\u021e\7h\2\2\u021d\u021a\3\2\2\2\u021e\u0221\3\2\2"+
		"\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220;\3\2\2\2\u0221\u021f"+
		"\3\2\2\2\u0222\u0225\5> \2\u0223\u0225\5\u009cO\2\u0224\u0222\3\2\2\2"+
		"\u0224\u0223\3\2\2\2\u0225=\3\2\2\2\u0226\u0228\5@!\2\u0227\u0226\3\2"+
		"\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\7\13\2\2\u022d\u022f\7"+
		"h\2\2\u022e\u0230\5B\"\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0232\3\2\2\2\u0231\u0233\5F$\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2"+
		"\2\u0233\u0235\3\2\2\2\u0234\u0236\5H%\2\u0235\u0234\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\5L\'\2\u0238?\3\2\2\2\u0239\u023a"+
		"\7\3\2\2\u023aA\3\2\2\2\u023b\u023c\7F\2\2\u023c\u023d\5D#\2\u023d\u023e"+
		"\7E\2\2\u023eC\3\2\2\2\u023f\u0244\5$\23\2\u0240\u0241\7B\2\2\u0241\u0243"+
		"\5$\23\2\u0242\u0240\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245E\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0248\7\23\2\2"+
		"\u0248\u0249\5\22\n\2\u0249G\3\2\2\2\u024a\u024b\7\32\2\2\u024b\u024c"+
		"\5J&\2\u024cI\3\2\2\2\u024d\u0252\5\30\r\2\u024e\u024f\7B\2\2\u024f\u0251"+
		"\5\30\r\2\u0250\u024e\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2"+
		"\u0252\u0253\3\2\2\2\u0253K\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0259\7"+
		"=\2\2\u0256\u0258\5N(\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2"+
		"\2\2\u025c\u025d\7>\2\2\u025dM\3\2\2\2\u025e\u0263\5P)\2\u025f\u0263\5"+
		"\u008cG\2\u0260\u0263\5\u008eH\2\u0261\u0263\5\u0090I\2\u0262\u025e\3"+
		"\2\2\2\u0262\u025f\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0261\3\2\2\2\u0263"+
		"O\3\2\2\2\u0264\u0269\5R*\2\u0265\u0269\5v<\2\u0266\u0269\5<\37\2\u0267"+
		"\u0269\7A\2\2\u0268\u0264\3\2\2\2\u0268\u0265\3\2\2\2\u0268\u0266\3\2"+
		"\2\2\u0268\u0267\3\2\2\2\u0269Q\3\2\2\2\u026a\u026c\5T+\2\u026b\u026a"+
		"\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u0270\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0271\5^\60\2\u0271\u0272\5V"+
		",\2\u0272\u0273\7A\2\2\u0273S\3\2\2\2\u0274\u0275\t\5\2\2\u0275U\3\2\2"+
		"\2\u0276\u027b\5X-\2\u0277\u0278\7B\2\2\u0278\u027a\5X-\2\u0279\u0277"+
		"\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"W\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0281\5Z.\2\u027f\u0280\7D\2\2\u0280"+
		"\u0282\5\\/\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282Y\3\2\2\2\u0283"+
		"\u0285\7h\2\2\u0284\u0286\5\"\22\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2"+
		"\2\2\u0286[\3\2\2\2\u0287\u028a\5\u014c\u00a7\2\u0288\u028a\5\u00a6T\2"+
		"\u0289\u0287\3\2\2\2\u0289\u0288\3\2\2\2\u028a]\3\2\2\2\u028b\u028e\5"+
		"`\61\2\u028c\u028e\5b\62\2\u028d\u028b\3\2\2\2\u028d\u028c\3\2\2\2\u028e"+
		"_\3\2\2\2\u028f\u0292\5\b\5\2\u0290\u0292\7\5\2\2\u0291\u028f\3\2\2\2"+
		"\u0291\u0290\3\2\2\2\u0292a\3\2\2\2\u0293\u0297\5d\63\2\u0294\u0297\5"+
		"r:\2\u0295\u0297\5t;\2\u0296\u0293\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0295"+
		"\3\2\2\2\u0297c\3\2\2\2\u0298\u029b\5j\66\2\u0299\u029b\5p9\2\u029a\u0298"+
		"\3\2\2\2\u029a\u0299\3\2\2\2\u029b\u02a0\3\2\2\2\u029c\u029f\5h\65\2\u029d"+
		"\u029f\5n8\2\u029e\u029c\3\2\2\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2"+
		"\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1e\3\2\2\2\u02a2\u02a0"+
		"\3\2\2\2\u02a3\u02a5\7h\2\2\u02a4\u02a6\5*\26\2\u02a5\u02a4\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6\u02ae\3\2\2\2\u02a7\u02a8\5d\63\2\u02a8\u02a9\7C"+
		"\2\2\u02a9\u02ab\7h\2\2\u02aa\u02ac\5*\26\2\u02ab\u02aa\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02a3\3\2\2\2\u02ad\u02a7\3\2"+
		"\2\2\u02aeg\3\2\2\2\u02af\u02b0\7C\2\2\u02b0\u02b2\7h\2\2\u02b1\u02b3"+
		"\5*\26\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3i\3\2\2\2\u02b4"+
		"\u02b6\7h\2\2\u02b5\u02b7\5*\26\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2"+
		"\2\2\u02b7k\3\2\2\2\u02b8\u02b9\5f\64\2\u02b9m\3\2\2\2\u02ba\u02bb\5h"+
		"\65\2\u02bbo\3\2\2\2\u02bc\u02bd\5j\66\2\u02bdq\3\2\2\2\u02be\u02bf\7"+
		"h\2\2\u02bfs\3\2\2\2\u02c0\u02c1\5`\61\2\u02c1\u02c2\5\"\22\2\u02c2\u02ca"+
		"\3\2\2\2\u02c3\u02c4\5d\63\2\u02c4\u02c5\5\"\22\2\u02c5\u02ca\3\2\2\2"+
		"\u02c6\u02c7\5r:\2\u02c7\u02c8\5\"\22\2\u02c8\u02ca\3\2\2\2\u02c9\u02c0"+
		"\3\2\2\2\u02c9\u02c3\3\2\2\2\u02c9\u02c6\3\2\2\2\u02cau\3\2\2\2\u02cb"+
		"\u02cd\5x=\2\u02cc\u02cb\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2"+
		"\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2"+
		"\5z>\2\u02d2\u02d3\5\u008aF\2\u02d3w\3\2\2\2\u02d4\u02d5\7\3\2\2\u02d5"+
		"y\3\2\2\2\u02d6\u02d8\5|?\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9\u02db\5~@\2\u02da\u02dc\5\u0084C\2\u02db\u02da\3"+
		"\2\2\2\u02db\u02dc\3\2\2\2\u02dc{\3\2\2\2\u02dd\u02de\5^\60\2\u02de}\3"+
		"\2\2\2\u02df\u02e0\7h\2\2\u02e0\u02e2\7;\2\2\u02e1\u02e3\5\u0080A\2\u02e2"+
		"\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\7<"+
		"\2\2\u02e5\u02e7\5\"\22\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\177\3\2\2\2\u02e8\u02ed\7h\2\2\u02e9\u02ea\7B\2\2\u02ea\u02ec\7h\2\2"+
		"\u02eb\u02e9\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee"+
		"\3\2\2\2\u02ee\u0081\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f1\7\f\2\2\u02f1"+
		"\u0083\3\2\2\2\u02f2\u02f3\7/\2\2\u02f3\u02f4\5\u0086D\2\u02f4\u0085\3"+
		"\2\2\2\u02f5\u02fa\5\u0088E\2\u02f6\u02f7\7B\2\2\u02f7\u02f9\5\u0088E"+
		"\2\u02f8\u02f6\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb"+
		"\3\2\2\2\u02fb\u0087\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u0300\5\22\n\2"+
		"\u02fe\u0300\5\36\20\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300\u0089"+
		"\3\2\2\2\u0301\u0304\5\u00aaV\2\u0302\u0304\7A\2\2\u0303\u0301\3\2\2\2"+
		"\u0303\u0302\3\2\2\2\u0304\u008b\3\2\2\2\u0305\u0306\5\u00aaV\2\u0306"+
		"\u008d\3\2\2\2\u0307\u0308\7(\2\2\u0308\u0309\5\u00aaV\2\u0309\u008f\3"+
		"\2\2\2\u030a\u030c\5\u0092J\2\u030b\u030a\3\2\2\2\u030c\u030f\3\2\2\2"+
		"\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f\u030d"+
		"\3\2\2\2\u0310\u0312\5\u0094K\2\u0311\u0313\5\u0084C\2\u0312\u0311\3\2"+
		"\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\5\u0098M\2\u0315"+
		"\u0091\3\2\2\2\u0316\u0317\t\6\2\2\u0317\u0093\3\2\2\2\u0318\u031a\5B"+
		"\"\2\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u031c\5\u0096L\2\u031c\u031e\7;\2\2\u031d\u031f\5\u0080A\2\u031e\u031d"+
		"\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\7<\2\2\u0321"+
		"\u0095\3\2\2\2\u0322\u0323\7h\2\2\u0323\u0097\3\2\2\2\u0324\u0326\7=\2"+
		"\2\u0325\u0327\5\u009aN\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0329\3\2\2\2\u0328\u032a\5\u00acW\2\u0329\u0328\3\2\2\2\u0329\u032a"+
		"\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\7>\2\2\u032c\u0099\3\2\2\2\u032d"+
		"\u032f\5*\26\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330\u0331\7-\2\2\u0331\u0333\7;\2\2\u0332\u0334\5\u013c\u009f\2"+
		"\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336"+
		"\7<\2\2\u0336\u035c\7A\2\2\u0337\u0339\5*\26\2\u0338\u0337\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\7*\2\2\u033b\u033d\7;\2"+
		"\2\u033c\u033e\5\u013c\u009f\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2\2\2"+
		"\u033e\u033f\3\2\2\2\u033f\u0340\7<\2\2\u0340\u035c\7A\2\2\u0341\u0342"+
		"\5\66\34\2\u0342\u0344\7C\2\2\u0343\u0345\5*\26\2\u0344\u0343\3\2\2\2"+
		"\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\7*\2\2\u0347\u0349"+
		"\7;\2\2\u0348\u034a\5\u013c\u009f\2\u0349\u0348\3\2\2\2\u0349\u034a\3"+
		"\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\7<\2\2\u034c\u034d\7A\2\2\u034d"+
		"\u035c\3\2\2\2\u034e\u034f\5\u010e\u0088\2\u034f\u0351\7C\2\2\u0350\u0352"+
		"\5*\26\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0354\7*\2\2\u0354\u0356\7;\2\2\u0355\u0357\5\u013c\u009f\2\u0356\u0355"+
		"\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\7<\2\2\u0359"+
		"\u035a\7A\2\2\u035a\u035c\3\2\2\2\u035b\u032e\3\2\2\2\u035b\u0338\3\2"+
		"\2\2\u035b\u0341\3\2\2\2\u035b\u034e\3\2\2\2\u035c\u009b\3\2\2\2\u035d"+
		"\u035f\5@!\2\u035e\u035d\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2"+
		"\2\u0360\u0361\3\2\2\2\u0361\u0363\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0364"+
		"\7\22\2\2\u0364\u0366\7h\2\2\u0365\u0367\5H%\2\u0366\u0365\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\5\u009eP\2\u0369\u009d"+
		"\3\2\2\2\u036a\u036c\7=\2\2\u036b\u036d\5\u00a0Q\2\u036c\u036b\3\2\2\2"+
		"\u036c\u036d\3\2\2\2\u036d\u036f\3\2\2\2\u036e\u0370\7B\2\2\u036f\u036e"+
		"\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0372\3\2\2\2\u0371\u0373\5\u00a4S"+
		"\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375"+
		"\7>\2\2\u0375\u009f\3\2\2\2\u0376\u037b\5\u00a2R\2\u0377\u0378\7B\2\2"+
		"\u0378\u037a\5\u00a2R\2\u0379\u0377\3\2\2\2\u037a\u037d\3\2\2\2\u037b"+
		"\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u00a1\3\2\2\2\u037d\u037b\3\2"+
		"\2\2\u037e\u0384\7h\2\2\u037f\u0381\7;\2\2\u0380\u0382\5\u013c\u009f\2"+
		"\u0381\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0385"+
		"\7<\2\2\u0384\u037f\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\3\2\2\2\u0386"+
		"\u0388\5L\'\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u00a3\3\2"+
		"\2\2\u0389\u038d\7A\2\2\u038a\u038c\5N(\2\u038b\u038a\3\2\2\2\u038c\u038f"+
		"\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u00a5\3\2\2\2\u038f"+
		"\u038d\3\2\2\2\u0390\u0392\7?\2\2\u0391\u0393\5\u00a8U\2\u0392\u0391\3"+
		"\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\3\2\2\2\u0394\u0396\7B\2\2\u0395"+
		"\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\7@"+
		"\2\2\u0398\u00a7\3\2\2\2\u0399\u039e\5\\/\2\u039a\u039b\7B\2\2\u039b\u039d"+
		"\5\\/\2\u039c\u039a\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039c\3\2\2\2\u039e"+
		"\u039f\3\2\2\2\u039f\u00a9\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1\u03a3\7="+
		"\2\2\u03a2\u03a4\5\u00acW\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4"+
		"\u03a5\3\2\2\2\u03a5\u03a6\7>\2\2\u03a6\u00ab\3\2\2\2\u03a7\u03a9\5\u00ae"+
		"X\2\u03a8\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u00ad\3\2\2\2\u03ac\u03b1\5\u00b0Y\2\u03ad\u03b1"+
		"\5<\37\2\u03ae\u03b1\5v<\2\u03af\u03b1\5\u00b4[\2\u03b0\u03ac\3\2\2\2"+
		"\u03b0\u03ad\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03af\3\2\2\2\u03b1\u00af"+
		"\3\2\2\2\u03b2\u03b3\5\u00b2Z\2\u03b3\u03b4\7A\2\2\u03b4\u00b1\3\2\2\2"+
		"\u03b5\u03b7\5\u0082B\2\u03b6\u03b5\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8"+
		"\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2"+
		"\2\2\u03bb\u03bd\5^\60\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03be\u03bf\5V,\2\u03bf\u00b3\3\2\2\2\u03c0\u03c7\5\u00b8"+
		"]\2\u03c1\u03c7\5\u00bc_\2\u03c2\u03c7\5\u00c4c\2\u03c3\u03c7\5\u00c6"+
		"d\2\u03c4\u03c7\5\u00d8m\2\u03c5\u03c7\5\u00dep\2\u03c6\u03c0\3\2\2\2"+
		"\u03c6\u03c1\3\2\2\2\u03c6\u03c2\3\2\2\2\u03c6\u03c3\3\2\2\2\u03c6\u03c4"+
		"\3\2\2\2\u03c6\u03c5\3\2\2\2\u03c7\u00b5\3\2\2\2\u03c8\u03ce\5\u00b8]"+
		"\2\u03c9\u03ce\5\u00be`\2\u03ca\u03ce\5\u00c8e\2\u03cb\u03ce\5\u00dan"+
		"\2\u03cc\u03ce\5\u00e0q\2\u03cd\u03c8\3\2\2\2\u03cd\u03c9\3\2\2\2\u03cd"+
		"\u03ca\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03cc\3\2\2\2\u03ce\u00b7\3\2"+
		"\2\2\u03cf\u03dc\5\u00aaV\2\u03d0\u03dc\5\u00ba^\2\u03d1\u03dc\5\u00c0"+
		"a\2\u03d2\u03dc\5\u00caf\2\u03d3\u03dc\5\u00ccg\2\u03d4\u03dc\5\u00dc"+
		"o\2\u03d5\u03dc\5\u00f0y\2\u03d6\u03dc\5\u00f2z\2\u03d7\u03dc\5\u00f4"+
		"{\2\u03d8\u03dc\5\u00f8}\2\u03d9\u03dc\5\u00f6|\2\u03da\u03dc\5\u00fa"+
		"~\2\u03db\u03cf\3\2\2\2\u03db\u03d0\3\2\2\2\u03db\u03d1\3\2\2\2\u03db"+
		"\u03d2\3\2\2\2\u03db\u03d3\3\2\2\2\u03db\u03d4\3\2\2\2\u03db\u03d5\3\2"+
		"\2\2\u03db\u03d6\3\2\2\2\u03db\u03d7\3\2\2\2\u03db\u03d8\3\2\2\2\u03db"+
		"\u03d9\3\2\2\2\u03db\u03da\3\2\2\2\u03dc\u00b9\3\2\2\2\u03dd\u03de\7A"+
		"\2\2\u03de\u00bb\3\2\2\2\u03df\u03e0\7h\2\2\u03e0\u03e1\7J\2\2\u03e1\u03e2"+
		"\5\u00b4[\2\u03e2\u00bd\3\2\2\2\u03e3\u03e4\7h\2\2\u03e4\u03e5\7J\2\2"+
		"\u03e5\u03e6\5\u00b6\\\2\u03e6\u00bf\3\2\2\2\u03e7\u03e8\5\u00c2b\2\u03e8"+
		"\u03e9\7A\2\2\u03e9\u00c1\3\2\2\2\u03ea\u03f2\5\u0158\u00ad\2\u03eb\u03f2"+
		"\5\u0176\u00bc\2\u03ec\u03f2\5\u0178\u00bd\2\u03ed\u03f2\5\u017e\u00c0"+
		"\2\u03ee\u03f2\5\u0182\u00c2\2\u03ef\u03f2\5\u0136\u009c\2\u03f0\u03f2"+
		"\5\u0122\u0092\2\u03f1\u03ea\3\2\2\2\u03f1\u03eb\3\2\2\2\u03f1\u03ec\3"+
		"\2\2\2\u03f1\u03ed\3\2\2\2\u03f1\u03ee\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1"+
		"\u03f0\3\2\2\2\u03f2\u00c3\3\2\2\2\u03f3\u03f4\7\30\2\2\u03f4\u03f5\7"+
		";\2\2\u03f5\u03f6\5\u014c\u00a7\2\u03f6\u03f7\7<\2\2\u03f7\u03f8\5\u00b4"+
		"[\2\u03f8\u00c5\3\2\2\2\u03f9\u03fa\7\30\2\2\u03fa\u03fb\7;\2\2\u03fb"+
		"\u03fc\5\u014c\u00a7\2\u03fc\u03fd\7<\2\2\u03fd\u03fe\5\u00b6\\\2\u03fe"+
		"\u03ff\7\21\2\2\u03ff\u0400\5\u00b4[\2\u0400\u00c7\3\2\2\2\u0401\u0402"+
		"\7\30\2\2\u0402\u0403\7;\2\2\u0403\u0404\5\u014c\u00a7\2\u0404\u0405\7"+
		"<\2\2\u0405\u0406\5\u00b6\\\2\u0406\u0407\7\21\2\2\u0407\u0408\5\u00b6"+
		"\\\2\u0408\u00c9\3\2\2\2\u0409\u040a\7\4\2\2\u040a\u040b\5\u014c\u00a7"+
		"\2\u040b\u040c\7A\2\2\u040c\u0414\3\2\2\2\u040d\u040e\7\4\2\2\u040e\u040f"+
		"\5\u014c\u00a7\2\u040f\u0410\7J\2\2\u0410\u0411\5\u014c\u00a7\2\u0411"+
		"\u0412\7A\2\2\u0412\u0414\3\2\2\2\u0413\u0409\3\2\2\2\u0413\u040d\3\2"+
		"\2\2\u0414\u00cb\3\2\2\2\u0415\u0416\7+\2\2\u0416\u0417\7;\2\2\u0417\u0418"+
		"\5\u014c\u00a7\2\u0418\u0419\7<\2\2\u0419\u041a\5\u00ceh\2\u041a\u00cd"+
		"\3\2\2\2\u041b\u041f\7=\2\2\u041c\u041e\5\u00d0i\2\u041d\u041c\3\2\2\2"+
		"\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0425"+
		"\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0424\5\u00d4k\2\u0423\u0422\3\2\2"+
		"\2\u0424\u0427\3\2\2\2\u0425\u0423\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0428"+
		"\3\2\2\2\u0427\u0425\3\2\2\2\u0428\u0429\7>\2\2\u0429\u00cf\3\2\2\2\u042a"+
		"\u042b\5\u00d2j\2\u042b\u042c\5\u00acW\2\u042c\u00d1\3\2\2\2\u042d\u0431"+
		"\5\u00d4k\2\u042e\u0430\5\u00d4k\2\u042f\u042e\3\2\2\2\u0430\u0433\3\2"+
		"\2\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u00d3\3\2\2\2\u0433"+
		"\u0431\3\2\2\2\u0434\u0435\7\b\2\2\u0435\u0436\5\u014a\u00a6\2\u0436\u0437"+
		"\7J\2\2\u0437\u043f\3\2\2\2\u0438\u0439\7\b\2\2\u0439\u043a\5\u00d6l\2"+
		"\u043a\u043b\7J\2\2\u043b\u043f\3\2\2\2\u043c\u043d\7\16\2\2\u043d\u043f"+
		"\7J\2\2\u043e\u0434\3\2\2\2\u043e\u0438\3\2\2\2\u043e\u043c\3\2\2\2\u043f"+
		"\u00d5\3\2\2\2\u0440\u0441\7h\2\2\u0441\u00d7\3\2\2\2\u0442\u0443\7\64"+
		"\2\2\u0443\u0444\7;\2\2\u0444\u0445\5\u014c\u00a7\2\u0445\u0446\7<\2\2"+
		"\u0446\u0447\5\u00b4[\2\u0447\u00d9\3\2\2\2\u0448\u0449\7\64\2\2\u0449"+
		"\u044a\7;\2\2\u044a\u044b\5\u014c\u00a7\2\u044b\u044c\7<\2\2\u044c\u044d"+
		"\5\u00b6\\\2\u044d\u00db\3\2\2\2\u044e\u044f\7\17\2\2\u044f\u0450\5\u00b4"+
		"[\2\u0450\u0451\7\64\2\2\u0451\u0452\7;\2\2\u0452\u0453\5\u014c\u00a7"+
		"\2\u0453\u0454\7<\2\2\u0454\u0455\7A\2\2\u0455\u00dd\3\2\2\2\u0456\u0459"+
		"\5\u00e2r\2\u0457\u0459\5\u00ecw\2\u0458\u0456\3\2\2\2\u0458\u0457\3\2"+
		"\2\2\u0459\u00df\3\2\2\2\u045a\u045d\5\u00e4s\2\u045b\u045d\5\u00eex\2"+
		"\u045c\u045a\3\2\2\2\u045c\u045b\3\2\2\2\u045d\u00e1\3\2\2\2\u045e\u045f"+
		"\7\27\2\2\u045f\u0461\7;\2\2\u0460\u0462\5\u00e6t\2\u0461\u0460\3\2\2"+
		"\2\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0465\7A\2\2\u0464\u0466"+
		"\5\u014c\u00a7\2\u0465\u0464\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467\3"+
		"\2\2\2\u0467\u0469\7A\2\2\u0468\u046a\5\u00e8u\2\u0469\u0468\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\7<\2\2\u046c\u046d\5\u00b4"+
		"[\2\u046d\u00e3\3\2\2\2\u046e\u046f\7\27\2\2\u046f\u0471\7;\2\2\u0470"+
		"\u0472\5\u00e6t\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473"+
		"\3\2\2\2\u0473\u0475\7A\2\2\u0474\u0476\5\u014c\u00a7\2\u0475\u0474\3"+
		"\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479\7A\2\2\u0478"+
		"\u047a\5\u00e8u\2\u0479\u0478\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b"+
		"\3\2\2\2\u047b\u047c\7<\2\2\u047c\u047d\5\u00b6\\\2\u047d\u00e5\3\2\2"+
		"\2\u047e\u0481\5\u00eav\2\u047f\u0481\5\u00b2Z\2\u0480\u047e\3\2\2\2\u0480"+
		"\u047f\3\2\2\2\u0481\u00e7\3\2\2\2\u0482\u0483\5\u00eav\2\u0483\u00e9"+
		"\3\2\2\2\u0484\u0489\5\u00c2b\2\u0485\u0486\7B\2\2\u0486\u0488\5\u00c2"+
		"b\2\u0487\u0485\3\2\2\2\u0488\u048b\3\2\2\2\u0489\u0487\3\2\2\2\u0489"+
		"\u048a\3\2\2\2\u048a\u00eb\3\2\2\2\u048b\u0489\3\2\2\2\u048c\u048d\7\27"+
		"\2\2\u048d\u0491\7;\2\2\u048e\u0490\5\u0082B\2\u048f\u048e\3\2\2\2\u0490"+
		"\u0493\3\2\2\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0494\3\2"+
		"\2\2\u0493\u0491\3\2\2\2\u0494\u0495\5^\60\2\u0495\u0496\5Z.\2\u0496\u0497"+
		"\7J\2\2\u0497\u0498\5\u014c\u00a7\2\u0498\u0499\7<\2\2\u0499\u049a\5\u00b4"+
		"[\2\u049a\u00ed\3\2\2\2\u049b\u049c\7\27\2\2\u049c\u04a0\7;\2\2\u049d"+
		"\u049f\5\u0082B\2\u049e\u049d\3\2\2\2\u049f\u04a2\3\2\2\2\u04a0\u049e"+
		"\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a3\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a3"+
		"\u04a4\5^\60\2\u04a4\u04a5\5Z.\2\u04a5\u04a6\7J\2\2\u04a6\u04a7\5\u014c"+
		"\u00a7\2\u04a7\u04a8\7<\2\2\u04a8\u04a9\5\u00b6\\\2\u04a9\u00ef\3\2\2"+
		"\2\u04aa\u04ac\7\6\2\2\u04ab\u04ad\7h\2\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad"+
		"\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04af\7A\2\2\u04af\u00f1\3\2\2\2\u04b0"+
		"\u04b2\7\r\2\2\u04b1\u04b3\7h\2\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2"+
		"\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\7A\2\2\u04b5\u00f3\3\2\2\2\u04b6"+
		"\u04b8\7&\2\2\u04b7\u04b9\5\u014c\u00a7\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9"+
		"\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bb\7A\2\2\u04bb\u00f5\3\2\2\2\u04bc"+
		"\u04bd\7.\2\2\u04bd\u04be\5\u014c\u00a7\2\u04be\u04bf\7A\2\2\u04bf\u00f7"+
		"\3\2\2\2\u04c0\u04c1\7,\2\2\u04c1\u04c2\7;\2\2\u04c2\u04c3\5\u014c\u00a7"+
		"\2\u04c3\u04c4\7<\2\2\u04c4\u04c5\5\u00aaV\2\u04c5\u00f9\3\2\2\2\u04c6"+
		"\u04c7\7\61\2\2\u04c7\u04c8\5\u00aaV\2\u04c8\u04c9\5\u00fc\177\2\u04c9"+
		"\u04d3\3\2\2\2\u04ca\u04cb\7\61\2\2\u04cb\u04cd\5\u00aaV\2\u04cc\u04ce"+
		"\5\u00fc\177\2\u04cd\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2"+
		"\2\2\u04cf\u04d0\5\u0104\u0083\2\u04d0\u04d3\3\2\2\2\u04d1\u04d3\5\u0106"+
		"\u0084\2\u04d2\u04c6\3\2\2\2\u04d2\u04ca\3\2\2\2\u04d2\u04d1\3\2\2\2\u04d3"+
		"\u00fb\3\2\2\2\u04d4\u04d8\5\u00fe\u0080\2\u04d5\u04d7\5\u00fe\u0080\2"+
		"\u04d6\u04d5\3\2\2\2\u04d7\u04da\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9"+
		"\3\2\2\2\u04d9\u00fd\3\2\2\2\u04da\u04d8\3\2\2\2\u04db\u04dc\7\t\2\2\u04dc"+
		"\u04dd\7;\2\2\u04dd\u04de\5\u0100\u0081\2\u04de\u04df\7<\2\2\u04df\u04e0"+
		"\5\u00aaV\2\u04e0\u00ff\3\2\2\2\u04e1\u04e3\5\u0082B\2\u04e2\u04e1\3\2"+
		"\2\2\u04e3\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5"+
		"\u04e7\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04e8\5\u0102\u0082\2\u04e8\u04e9"+
		"\5Z.\2\u04e9\u0101\3\2\2\2\u04ea\u04ef\5f\64\2\u04eb\u04ec\7X\2\2\u04ec"+
		"\u04ee\5\22\n\2\u04ed\u04eb\3\2\2\2\u04ee\u04f1\3\2\2\2\u04ef\u04ed\3"+
		"\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u0103\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f2"+
		"\u04f3\7\25\2\2\u04f3\u04f4\5\u00aaV\2\u04f4\u0105\3\2\2\2\u04f5\u04f6"+
		"\7\61\2\2\u04f6\u04f7\5\u0108\u0085\2\u04f7\u04f9\5\u00aaV\2\u04f8\u04fa"+
		"\5\u00fc\177\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fc\3\2"+
		"\2\2\u04fb\u04fd\5\u0104\u0083\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd\3\2\2"+
		"\2\u04fd\u0107\3\2\2\2\u04fe\u04ff\7;\2\2\u04ff\u0501\5\u010a\u0086\2"+
		"\u0500\u0502\7A\2\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0503"+
		"\3\2\2\2\u0503\u0504\7<\2\2\u0504\u0109\3\2\2\2\u0505\u050a\5\u010c\u0087"+
		"\2\u0506\u0507\7A\2\2\u0507\u0509\5\u010c\u0087\2\u0508\u0506\3\2\2\2"+
		"\u0509\u050c\3\2\2\2\u050a\u0508\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u010b"+
		"\3\2\2\2\u050c\u050a\3\2\2\2\u050d\u050f\5\u0082B\2\u050e\u050d\3\2\2"+
		"\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0513"+
		"\3\2\2\2\u0512\u0510\3\2\2\2\u0513\u0514\5^\60\2\u0514\u0515\5Z.\2\u0515"+
		"\u0516\7D\2\2\u0516\u0517\5\u014c\u00a7\2\u0517\u010d\3\2\2\2\u0518\u051b"+
		"\5\u011c\u008f\2\u0519\u051b\5\u0144\u00a3\2\u051a\u0518\3\2\2\2\u051a"+
		"\u0519\3\2\2\2\u051b\u051f\3\2\2\2\u051c\u051e\5\u0116\u008c\2\u051d\u051c"+
		"\3\2\2\2\u051e\u0521\3\2\2\2\u051f\u051d\3\2\2\2\u051f\u0520\3\2\2\2\u0520"+
		"\u010f\3\2\2\2\u0521\u051f\3\2\2\2\u0522\u0540\5\4\3\2\u0523\u0528\5\64"+
		"\33\2\u0524\u0525\7?\2\2\u0525\u0527\7@\2\2\u0526\u0524\3\2\2\2\u0527"+
		"\u052a\3\2\2\2\u0528\u0526\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052b\3\2"+
		"\2\2\u052a\u0528\3\2\2\2\u052b\u052c\7C\2\2\u052c\u052d\7\13\2\2\u052d"+
		"\u0540\3\2\2\2\u052e\u052f\7\62\2\2\u052f\u0530\7C\2\2\u0530\u0540\7\13"+
		"\2\2\u0531\u0540\7-\2\2\u0532\u0533\5\64\33\2\u0533\u0534\7C\2\2\u0534"+
		"\u0535\7-\2\2\u0535\u0540\3\2\2\2\u0536\u0537\7;\2\2\u0537\u0538\5\u014c"+
		"\u00a7\2\u0538\u0539\7<\2\2\u0539\u0540\3\2\2\2\u053a\u0540\5\u0122\u0092"+
		"\2\u053b\u0540\5\u012a\u0096\2\u053c\u0540\5\u0130\u0099\2\u053d\u0540"+
		"\5\u0136\u009c\2\u053e\u0540\5\u013e\u00a0\2\u053f\u0522\3\2\2\2\u053f"+
		"\u0523\3\2\2\2\u053f\u052e\3\2\2\2\u053f\u0531\3\2\2\2\u053f\u0532\3\2"+
		"\2\2\u053f\u0536\3\2\2\2\u053f\u053a\3\2\2\2\u053f\u053b\3\2\2\2\u053f"+
		"\u053c\3\2\2\2\u053f\u053d\3\2\2\2\u053f\u053e\3\2\2\2\u0540\u0111\3\2"+
		"\2\2\u0541\u0542\3\2\2\2\u0542\u0113\3\2\2\2\u0543\u0560\5\4\3\2\u0544"+
		"\u0549\5\64\33\2\u0545\u0546\7?\2\2\u0546\u0548\7@\2\2\u0547\u0545\3\2"+
		"\2\2\u0548\u054b\3\2\2\2\u0549\u0547\3\2\2\2\u0549\u054a\3\2\2\2\u054a"+
		"\u054c\3\2\2\2\u054b\u0549\3\2\2\2\u054c\u054d\7C\2\2\u054d\u054e\7\13"+
		"\2\2\u054e\u0560\3\2\2\2\u054f\u0550\7\62\2\2\u0550\u0551\7C\2\2\u0551"+
		"\u0560\7\13\2\2\u0552\u0560\7-\2\2\u0553\u0554\5\64\33\2\u0554\u0555\7"+
		"C\2\2\u0555\u0556\7-\2\2\u0556\u0560\3\2\2\2\u0557\u0558\7;\2\2\u0558"+
		"\u0559\5\u014c\u00a7\2\u0559\u055a\7<\2\2\u055a\u0560\3\2\2\2\u055b\u0560"+
		"\5\u0122\u0092\2\u055c\u0560\5\u012a\u0096\2\u055d\u0560\5\u0136\u009c"+
		"\2\u055e\u0560\5\u013e\u00a0\2\u055f\u0543\3\2\2\2\u055f\u0544\3\2\2\2"+
		"\u055f\u054f\3\2\2\2\u055f\u0552\3\2\2\2\u055f\u0553\3\2\2\2\u055f\u0557"+
		"\3\2\2\2\u055f\u055b\3\2\2\2\u055f\u055c\3\2\2\2\u055f\u055d\3\2\2\2\u055f"+
		"\u055e\3\2\2\2\u0560\u0115\3\2\2\2\u0561\u0567\5\u0124\u0093\2\u0562\u0567"+
		"\5\u012c\u0097\2\u0563\u0567\5\u0132\u009a\2\u0564\u0567\5\u0138\u009d"+
		"\2\u0565\u0567\5\u0140\u00a1\2\u0566\u0561\3\2\2\2\u0566\u0562\3\2\2\2"+
		"\u0566\u0563\3\2\2\2\u0566\u0564\3\2\2\2\u0566\u0565\3\2\2\2\u0567\u0117"+
		"\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u0119\3\2\2\2\u056a\u056f\5\u0124\u0093"+
		"\2\u056b\u056f\5\u012c\u0097\2\u056c\u056f\5\u0138\u009d\2\u056d\u056f"+
		"\5\u0140\u00a1\2\u056e\u056a\3\2\2\2\u056e\u056b\3\2\2\2\u056e\u056c\3"+
		"\2\2\2\u056e\u056d\3\2\2\2\u056f\u011b\3\2\2\2\u0570\u0599\5\4\3\2\u0571"+
		"\u0576\5\64\33\2\u0572\u0573\7?\2\2\u0573\u0575\7@\2\2\u0574\u0572\3\2"+
		"\2\2\u0575\u0578\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577"+
		"\u0579\3\2\2\2\u0578\u0576\3\2\2\2\u0579\u057a\7C\2\2\u057a\u057b\7\13"+
		"\2\2\u057b\u0599\3\2\2\2\u057c\u0581\5`\61\2\u057d\u057e\7?\2\2\u057e"+
		"\u0580\7@\2\2\u057f\u057d\3\2\2\2\u0580\u0583\3\2\2\2\u0581\u057f\3\2"+
		"\2\2\u0581\u0582\3\2\2\2\u0582\u0584\3\2\2\2\u0583\u0581\3\2\2\2\u0584"+
		"\u0585\7C\2\2\u0585\u0586\7\13\2\2\u0586\u0599\3\2\2\2\u0587\u0588\7\62"+
		"\2\2\u0588\u0589\7C\2\2\u0589\u0599\7\13\2\2\u058a\u0599\7-\2\2\u058b"+
		"\u058c\5\64\33\2\u058c\u058d\7C\2\2\u058d\u058e\7-\2\2\u058e\u0599\3\2"+
		"\2\2\u058f\u0590\7;\2\2\u0590\u0591\5\u014c\u00a7\2\u0591\u0592\7<\2\2"+
		"\u0592\u0599\3\2\2\2\u0593\u0599\5\u0126\u0094\2\u0594\u0599\5\u012e\u0098"+
		"\2\u0595\u0599\5\u0134\u009b\2\u0596\u0599\5\u013a\u009e\2\u0597\u0599"+
		"\5\u0142\u00a2\2\u0598\u0570\3\2\2\2\u0598\u0571\3\2\2\2\u0598\u057c\3"+
		"\2\2\2\u0598\u0587\3\2\2\2\u0598\u058a\3\2\2\2\u0598\u058b\3\2\2\2\u0598"+
		"\u058f\3\2\2\2\u0598\u0593\3\2\2\2\u0598\u0594\3\2\2\2\u0598\u0595\3\2"+
		"\2\2\u0598\u0596\3\2\2\2\u0598\u0597\3\2\2\2\u0599\u011d\3\2\2\2\u059a"+
		"\u059b\3\2\2\2\u059b\u011f\3\2\2\2\u059c\u05c4\5\4\3\2\u059d\u05a2\5\64"+
		"\33\2\u059e\u059f\7?\2\2\u059f\u05a1\7@\2\2\u05a0\u059e\3\2\2\2\u05a1"+
		"\u05a4\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a5\3\2"+
		"\2\2\u05a4\u05a2\3\2\2\2\u05a5\u05a6\7C\2\2\u05a6\u05a7\7\13\2\2\u05a7"+
		"\u05c4\3\2\2\2\u05a8\u05ad\5`\61\2\u05a9\u05aa\7?\2\2\u05aa\u05ac\7@\2"+
		"\2\u05ab\u05a9\3\2\2\2\u05ac\u05af\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ad\u05ae"+
		"\3\2\2\2\u05ae\u05b0\3\2\2\2\u05af\u05ad\3\2\2\2\u05b0\u05b1\7C\2\2\u05b1"+
		"\u05b2\7\13\2\2\u05b2\u05c4\3\2\2\2\u05b3\u05b4\7\62\2\2\u05b4\u05b5\7"+
		"C\2\2\u05b5\u05c4\7\13\2\2\u05b6\u05c4\7-\2\2\u05b7\u05b8\5\64\33\2\u05b8"+
		"\u05b9\7C\2\2\u05b9\u05ba\7-\2\2\u05ba\u05c4\3\2\2\2\u05bb\u05bc\7;\2"+
		"\2\u05bc\u05bd\5\u014c\u00a7\2\u05bd\u05be\7<\2\2\u05be\u05c4\3\2\2\2"+
		"\u05bf\u05c4\5\u0126\u0094\2\u05c0\u05c4\5\u012e\u0098\2\u05c1\u05c4\5"+
		"\u013a\u009e\2\u05c2\u05c4\5\u0142\u00a2\2\u05c3\u059c\3\2\2\2\u05c3\u059d"+
		"\3\2\2\2\u05c3\u05a8\3\2\2\2\u05c3\u05b3\3\2\2\2\u05c3\u05b6\3\2\2\2\u05c3"+
		"\u05b7\3\2\2\2\u05c3\u05bb\3\2\2\2\u05c3\u05bf\3\2\2\2\u05c3\u05c0\3\2"+
		"\2\2\u05c3\u05c1\3\2\2\2\u05c3\u05c2\3\2\2\2\u05c4\u0121\3\2\2\2\u05c5"+
		"\u05c7\7!\2\2\u05c6\u05c8\5*\26\2\u05c7\u05c6\3\2\2\2\u05c7\u05c8\3\2"+
		"\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ce\7h\2\2\u05ca\u05cb\7C\2\2\u05cb\u05cd"+
		"\7h\2\2\u05cc\u05ca\3\2\2\2\u05cd\u05d0\3\2\2\2\u05ce\u05cc\3\2\2\2\u05ce"+
		"\u05cf\3\2\2\2\u05cf\u05d2\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d1\u05d3\5\u0128"+
		"\u0095\2\u05d2\u05d1\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4"+
		"\u05d6\7;\2\2\u05d5\u05d7\5\u013c\u009f\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7"+
		"\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05da\7<\2\2\u05d9\u05db\5L\'\2\u05da"+
		"\u05d9\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u0601\3\2\2\2\u05dc\u05dd\5\66"+
		"\34\2\u05dd\u05de\7C\2\2\u05de\u05e0\7!\2\2\u05df\u05e1\5*\26\2\u05e0"+
		"\u05df\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e4\7h"+
		"\2\2\u05e3\u05e5\5\u0128\u0095\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5\3\2\2"+
		"\2\u05e5\u05e6\3\2\2\2\u05e6\u05e8\7;\2\2\u05e7\u05e9\5\u013c\u009f\2"+
		"\u05e8\u05e7\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05ec"+
		"\7<\2\2\u05eb\u05ed\5L\'\2\u05ec\u05eb\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed"+
		"\u0601\3\2\2\2\u05ee\u05ef\5\u010e\u0088\2\u05ef\u05f0\7C\2\2\u05f0\u05f2"+
		"\7!\2\2\u05f1\u05f3\5*\26\2\u05f2\u05f1\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3"+
		"\u05f4\3\2\2\2\u05f4\u05f6\7h\2\2\u05f5\u05f7\5\u0128\u0095\2\u05f6\u05f5"+
		"\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fa\7;\2\2\u05f9"+
		"\u05fb\5\u013c\u009f\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc"+
		"\3\2\2\2\u05fc\u05fe\7<\2\2\u05fd\u05ff\5L\'\2\u05fe\u05fd\3\2\2\2\u05fe"+
		"\u05ff\3\2\2\2\u05ff\u0601\3\2\2\2\u0600\u05c5\3\2\2\2\u0600\u05dc\3\2"+
		"\2\2\u0600\u05ee\3\2\2\2\u0601\u0123\3\2\2\2\u0602\u0603\7C\2\2\u0603"+
		"\u0605\7!\2\2\u0604\u0606\5*\26\2\u0605\u0604\3\2\2\2\u0605\u0606\3\2"+
		"\2\2\u0606\u0607\3\2\2\2\u0607\u0609\7h\2\2\u0608\u060a\5\u0128\u0095"+
		"\2\u0609\u0608\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060d"+
		"\7;\2\2\u060c\u060e\5\u013c\u009f\2\u060d\u060c\3\2\2\2\u060d\u060e\3"+
		"\2\2\2\u060e\u060f\3\2\2\2\u060f\u0611\7<\2\2\u0610\u0612\5L\'\2\u0611"+
		"\u0610\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0125\3\2\2\2\u0613\u0615\7!"+
		"\2\2\u0614\u0616\5*\26\2\u0615\u0614\3\2\2\2\u0615\u0616\3\2\2\2\u0616"+
		"\u0617\3\2\2\2\u0617\u061c\7h\2\2\u0618\u0619\7C\2\2\u0619\u061b\7h\2"+
		"\2\u061a\u0618\3\2\2\2\u061b\u061e\3\2\2\2\u061c\u061a\3\2\2\2\u061c\u061d"+
		"\3\2\2\2\u061d\u0620\3\2\2\2\u061e\u061c\3\2\2\2\u061f\u0621\5\u0128\u0095"+
		"\2\u0620\u061f\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0624"+
		"\7;\2\2\u0623\u0625\5\u013c\u009f\2\u0624\u0623\3\2\2\2\u0624\u0625\3"+
		"\2\2\2\u0625\u0626\3\2\2\2\u0626\u0628\7<\2\2\u0627\u0629\5L\'\2\u0628"+
		"\u0627\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u063d\3\2\2\2\u062a\u062b\5\66"+
		"\34\2\u062b\u062c\7C\2\2\u062c\u062e\7!\2\2\u062d\u062f\5*\26\2\u062e"+
		"\u062d\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0632\7h"+
		"\2\2\u0631\u0633\5\u0128\u0095\2\u0632\u0631\3\2\2\2\u0632\u0633\3\2\2"+
		"\2\u0633\u0634\3\2\2\2\u0634\u0636\7;\2\2\u0635\u0637\5\u013c\u009f\2"+
		"\u0636\u0635\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u063a"+
		"\7<\2\2\u0639\u063b\5L\'\2\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2\2\u063b"+
		"\u063d\3\2\2\2\u063c\u0613\3\2\2\2\u063c\u062a\3\2\2\2\u063d\u0127\3\2"+
		"\2\2\u063e\u0642\5*\26\2\u063f\u0640\7F\2\2\u0640\u0642\7E\2\2\u0641\u063e"+
		"\3\2\2\2\u0641\u063f\3\2\2\2\u0642\u0129\3\2\2\2\u0643\u0644\5\u010e\u0088"+
		"\2\u0644\u0645\7C\2\2\u0645\u0646\7h\2\2\u0646\u0651\3\2\2\2\u0647\u0648"+
		"\7*\2\2\u0648\u0649\7C\2\2\u0649\u0651\7h\2\2\u064a\u064b\5\64\33\2\u064b"+
		"\u064c\7C\2\2\u064c\u064d\7*\2\2\u064d\u064e\7C\2\2\u064e\u064f\7h\2\2"+
		"\u064f\u0651\3\2\2\2\u0650\u0643\3\2\2\2\u0650\u0647\3\2\2\2\u0650\u064a"+
		"\3\2\2\2\u0651\u012b\3\2\2\2\u0652\u0653\7C\2\2\u0653\u0654\7h\2\2\u0654"+
		"\u012d\3\2\2\2\u0655\u0656\7*\2\2\u0656\u0657\7C\2\2\u0657\u065f\7h\2"+
		"\2\u0658\u0659\5\64\33\2\u0659\u065a\7C\2\2\u065a\u065b\7*\2\2\u065b\u065c"+
		"\7C\2\2\u065c\u065d\7h\2\2\u065d\u065f\3\2\2\2\u065e\u0655\3\2\2\2\u065e"+
		"\u0658\3\2\2\2\u065f\u012f\3\2\2\2\u0660\u0661\5\66\34\2\u0661\u0662\7"+
		"?\2\2\u0662\u0663\5\u014c\u00a7\2\u0663\u0664\7@\2\2\u0664\u066b\3\2\2"+
		"\2\u0665\u0666\5\u0114\u008b\2\u0666\u0667\7?\2\2\u0667\u0668\5\u014c"+
		"\u00a7\2\u0668\u0669\7@\2\2\u0669\u066b\3\2\2\2\u066a\u0660\3\2\2\2\u066a"+
		"\u0665\3\2\2\2\u066b\u0673\3\2\2\2\u066c\u066d\5\u0112\u008a\2\u066d\u066e"+
		"\7?\2\2\u066e\u066f\5\u014c\u00a7\2\u066f\u0670\7@\2\2\u0670\u0672\3\2"+
		"\2\2\u0671\u066c\3\2\2\2\u0672\u0675\3\2\2\2\u0673\u0671\3\2\2\2\u0673"+
		"\u0674\3\2\2\2\u0674\u0131\3\2\2\2\u0675\u0673\3\2\2\2\u0676\u0677\5\u011a"+
		"\u008e\2\u0677\u0678\7?\2\2\u0678\u0679\5\u014c\u00a7\2\u0679\u067a\7"+
		"@\2\2\u067a\u0682\3\2\2\2\u067b\u067c\5\u0118\u008d\2\u067c\u067d\7?\2"+
		"\2\u067d\u067e\5\u014c\u00a7\2\u067e\u067f\7@\2\2\u067f\u0681\3\2\2\2"+
		"\u0680\u067b\3\2\2\2\u0681\u0684\3\2\2\2\u0682\u0680\3\2\2\2\u0682\u0683"+
		"\3\2\2\2\u0683\u0133\3\2\2\2\u0684\u0682\3\2\2\2\u0685\u0686\5\66\34\2"+
		"\u0686\u0687\7?\2\2\u0687\u0688\5\u014c\u00a7\2\u0688\u0689\7@\2\2\u0689"+
		"\u0690\3\2\2\2\u068a\u068b\5\u0120\u0091\2\u068b\u068c\7?\2\2\u068c\u068d"+
		"\5\u014c\u00a7\2\u068d\u068e\7@\2\2\u068e\u0690\3\2\2\2\u068f\u0685\3"+
		"\2\2\2\u068f\u068a\3\2\2\2\u0690\u0698\3\2\2\2\u0691\u0692\5\u011e\u0090"+
		"\2\u0692\u0693\7?\2\2\u0693\u0694\5\u014c\u00a7\2\u0694\u0695\7@\2\2\u0695"+
		"\u0697\3\2\2\2\u0696\u0691\3\2\2\2\u0697\u069a\3\2\2\2\u0698\u0696\3\2"+
		"\2\2\u0698\u0699\3\2\2\2\u0699\u0135\3\2\2\2\u069a\u0698\3\2\2\2\u069b"+
		"\u069c\58\35\2\u069c\u069e\7;\2\2\u069d\u069f\5\u013c\u009f\2\u069e\u069d"+
		"\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a1\7<\2\2\u06a1"+
		"\u06e0\3\2\2\2\u06a2\u06a3\5\64\33\2\u06a3\u06a5\7C\2\2\u06a4\u06a6\5"+
		"*\26\2\u06a5\u06a4\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7"+
		"\u06a8\7h\2\2\u06a8\u06aa\7;\2\2\u06a9\u06ab\5\u013c\u009f\2\u06aa\u06a9"+
		"\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ad\7<\2\2\u06ad"+
		"\u06e0\3\2\2\2\u06ae\u06af\5\66\34\2\u06af\u06b1\7C\2\2\u06b0\u06b2\5"+
		"*\26\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3"+
		"\u06b4\7h\2\2\u06b4\u06b6\7;\2\2\u06b5\u06b7\5\u013c\u009f\2\u06b6\u06b5"+
		"\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\7<\2\2\u06b9"+
		"\u06e0\3\2\2\2\u06ba\u06bb\5\u010e\u0088\2\u06bb\u06bd\7C\2\2\u06bc\u06be"+
		"\5*\26\2\u06bd\u06bc\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf"+
		"\u06c0\7h\2\2\u06c0\u06c2\7;\2\2\u06c1\u06c3\5\u013c\u009f\2\u06c2\u06c1"+
		"\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c5\7<\2\2\u06c5"+
		"\u06e0\3\2\2\2\u06c6\u06c7\7*\2\2\u06c7\u06c9\7C\2\2\u06c8\u06ca\5*\26"+
		"\2\u06c9\u06c8\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cc"+
		"\7h\2\2\u06cc\u06ce\7;\2\2\u06cd\u06cf\5\u013c\u009f\2\u06ce\u06cd\3\2"+
		"\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06e0\7<\2\2\u06d1"+
		"\u06d2\5\64\33\2\u06d2\u06d3\7C\2\2\u06d3\u06d4\7*\2\2\u06d4\u06d6\7C"+
		"\2\2\u06d5\u06d7\5*\26\2\u06d6\u06d5\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7"+
		"\u06d8\3\2\2\2\u06d8\u06d9\7h\2\2\u06d9\u06db\7;\2\2\u06da\u06dc\5\u013c"+
		"\u009f\2\u06db\u06da\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd"+
		"\u06de\7<\2\2\u06de\u06e0\3\2\2\2\u06df\u069b\3\2\2\2\u06df\u06a2\3\2"+
		"\2\2\u06df\u06ae\3\2\2\2\u06df\u06ba\3\2\2\2\u06df\u06c6\3\2\2\2\u06df"+
		"\u06d1\3\2\2\2\u06e0\u0137\3\2\2\2\u06e1\u06e3\7C\2\2\u06e2\u06e4\5*\26"+
		"\2\u06e3\u06e2\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e6"+
		"\7h\2\2\u06e6\u06e8\7;\2\2\u06e7\u06e9\5\u013c\u009f\2\u06e8\u06e7\3\2"+
		"\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06eb\7<\2\2\u06eb"+
		"\u0139\3\2\2\2\u06ec\u06ed\58\35\2\u06ed\u06ef\7;\2\2\u06ee\u06f0\5\u013c"+
		"\u009f\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1"+
		"\u06f2\7<\2\2\u06f2\u0725\3\2\2\2\u06f3\u06f4\5\64\33\2\u06f4\u06f6\7"+
		"C\2\2\u06f5\u06f7\5*\26\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7"+
		"\u06f8\3\2\2\2\u06f8\u06f9\7h\2\2\u06f9\u06fb\7;\2\2\u06fa\u06fc\5\u013c"+
		"\u009f\2\u06fb\u06fa\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd"+
		"\u06fe\7<\2\2\u06fe\u0725\3\2\2\2\u06ff\u0700\5\66\34\2\u0700\u0702\7"+
		"C\2\2\u0701\u0703\5*\26\2\u0702\u0701\3\2\2\2\u0702\u0703\3\2\2\2\u0703"+
		"\u0704\3\2\2\2\u0704\u0705\7h\2\2\u0705\u0707\7;\2\2\u0706\u0708\5\u013c"+
		"\u009f\2\u0707\u0706\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u0709\3\2\2\2\u0709"+
		"\u070a\7<\2\2\u070a\u0725\3\2\2\2\u070b\u070c\7*\2\2\u070c\u070e\7C\2"+
		"\2\u070d\u070f\5*\26\2\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0710"+
		"\3\2\2\2\u0710\u0711\7h\2\2\u0711\u0713\7;\2\2\u0712\u0714\5\u013c\u009f"+
		"\2\u0713\u0712\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0725"+
		"\7<\2\2\u0716\u0717\5\64\33\2\u0717\u0718\7C\2\2\u0718\u0719\7*\2\2\u0719"+
		"\u071b\7C\2\2\u071a\u071c\5*\26\2\u071b\u071a\3\2\2\2\u071b\u071c\3\2"+
		"\2\2\u071c\u071d\3\2\2\2\u071d\u071e\7h\2\2\u071e\u0720\7;\2\2\u071f\u0721"+
		"\5\u013c\u009f\2\u0720\u071f\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0722\3"+
		"\2\2\2\u0722\u0723\7<\2\2\u0723\u0725\3\2\2\2\u0724\u06ec\3\2\2\2\u0724"+
		"\u06f3\3\2\2\2\u0724\u06ff\3\2\2\2\u0724\u070b\3\2\2\2\u0724\u0716\3\2"+
		"\2\2\u0725\u013b\3\2\2\2\u0726\u072b\5\u014c\u00a7\2\u0727\u0728\7B\2"+
		"\2\u0728\u072a\5\u014c\u00a7\2\u0729\u0727\3\2\2\2\u072a\u072d\3\2\2\2"+
		"\u072b\u0729\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u013d\3\2\2\2\u072d\u072b"+
		"\3\2\2\2\u072e\u072f\5\66\34\2\u072f\u0731\7\\\2\2\u0730\u0732\5*\26\2"+
		"\u0731\u0730\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0734"+
		"\7h\2\2\u0734\u075e\3\2\2\2\u0735\u0736\5\16\b\2\u0736\u0738\7\\\2\2\u0737"+
		"\u0739\5*\26\2\u0738\u0737\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073a\3\2"+
		"\2\2\u073a\u073b\7h\2\2\u073b\u075e\3\2\2\2\u073c\u073d\5\u010e\u0088"+
		"\2\u073d\u073f\7\\\2\2\u073e\u0740\5*\26\2\u073f\u073e\3\2\2\2\u073f\u0740"+
		"\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0742\7h\2\2\u0742\u075e\3\2\2\2\u0743"+
		"\u0744\7*\2\2\u0744\u0746\7\\\2\2\u0745\u0747\5*\26\2\u0746\u0745\3\2"+
		"\2\2\u0746\u0747\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u075e\7h\2\2\u0749"+
		"\u074a\5\64\33\2\u074a\u074b\7C\2\2\u074b\u074c\7*\2\2\u074c\u074e\7\\"+
		"\2\2\u074d\u074f\5*\26\2\u074e\u074d\3\2\2\2\u074e\u074f\3\2\2\2\u074f"+
		"\u0750\3\2\2\2\u0750\u0751\7h\2\2\u0751\u075e\3\2\2\2\u0752\u0753\5\22"+
		"\n\2\u0753\u0755\7\\\2\2\u0754\u0756\5*\26\2\u0755\u0754\3\2\2\2\u0755"+
		"\u0756\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u0758\7!\2\2\u0758\u075e\3\2"+
		"\2\2\u0759\u075a\5 \21\2\u075a\u075b\7\\\2\2\u075b\u075c\7!\2\2\u075c"+
		"\u075e\3\2\2\2\u075d\u072e\3\2\2\2\u075d\u0735\3\2\2\2\u075d\u073c\3\2"+
		"\2\2\u075d\u0743\3\2\2\2\u075d\u0749\3\2\2\2\u075d\u0752\3\2\2\2\u075d"+
		"\u0759\3\2\2\2\u075e\u013f\3\2\2\2\u075f\u0761\7\\\2\2\u0760\u0762\5*"+
		"\26\2\u0761\u0760\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0763\3\2\2\2\u0763"+
		"\u0764\7h\2\2\u0764\u0141\3\2\2\2\u0765\u0766\5\66\34\2\u0766\u0768\7"+
		"\\\2\2\u0767\u0769\5*\26\2\u0768\u0767\3\2\2\2\u0768\u0769\3\2\2\2\u0769"+
		"\u076a\3\2\2\2\u076a\u076b\7h\2\2\u076b\u078e\3\2\2\2\u076c\u076d\5\16"+
		"\b\2\u076d\u076f\7\\\2\2\u076e\u0770\5*\26\2\u076f\u076e\3\2\2\2\u076f"+
		"\u0770\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0772\7h\2\2\u0772\u078e\3\2"+
		"\2\2\u0773\u0774\7*\2\2\u0774\u0776\7\\\2\2\u0775\u0777\5*\26\2\u0776"+
		"\u0775\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u078e\7h"+
		"\2\2\u0779\u077a\5\64\33\2\u077a\u077b\7C\2\2\u077b\u077c\7*\2\2\u077c"+
		"\u077e\7\\\2\2\u077d\u077f\5*\26\2\u077e\u077d\3\2\2\2\u077e\u077f\3\2"+
		"\2\2\u077f\u0780\3\2\2\2\u0780\u0781\7h\2\2\u0781\u078e\3\2\2\2\u0782"+
		"\u0783\5\22\n\2\u0783\u0785\7\\\2\2\u0784\u0786\5*\26\2\u0785\u0784\3"+
		"\2\2\2\u0785\u0786\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0788\7!\2\2\u0788"+
		"\u078e\3\2\2\2\u0789\u078a\5 \21\2\u078a\u078b\7\\\2\2\u078b\u078c\7!"+
		"\2\2\u078c\u078e\3\2\2\2\u078d\u0765\3\2\2\2\u078d\u076c\3\2\2\2\u078d"+
		"\u0773\3\2\2\2\u078d\u0779\3\2\2\2\u078d\u0782\3\2\2\2\u078d\u0789\3\2"+
		"\2\2\u078e\u0143\3\2\2\2\u078f\u0790\7!\2\2\u0790\u0791\5\6\4\2\u0791"+
		"\u0793\5\u0146\u00a4\2\u0792\u0794\5\"\22\2\u0793\u0792\3\2\2\2\u0793"+
		"\u0794\3\2\2\2\u0794\u07a6\3\2\2\2\u0795\u0796\7!\2\2\u0796\u0797\5\20"+
		"\t\2\u0797\u0799\5\u0146\u00a4\2\u0798\u079a\5\"\22\2\u0799\u0798\3\2"+
		"\2\2\u0799\u079a\3\2\2\2\u079a\u07a6\3\2\2\2\u079b\u079c\7!\2\2\u079c"+
		"\u079d\5\6\4\2\u079d\u079e\5\"\22\2\u079e\u079f\5\u00a6T\2\u079f\u07a6"+
		"\3\2\2\2\u07a0\u07a1\7!\2\2\u07a1\u07a2\5\20\t\2\u07a2\u07a3\5\"\22\2"+
		"\u07a3\u07a4\5\u00a6T\2\u07a4\u07a6\3\2\2\2\u07a5\u078f\3\2\2\2\u07a5"+
		"\u0795\3\2\2\2\u07a5\u079b\3\2\2\2\u07a5\u07a0\3\2\2\2\u07a6\u0145\3\2"+
		"\2\2\u07a7\u07ab\5\u0148\u00a5\2\u07a8\u07aa\5\u0148\u00a5\2\u07a9\u07a8"+
		"\3\2\2\2\u07aa\u07ad\3\2\2\2\u07ab\u07a9\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac"+
		"\u0147\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ae\u07af\7?\2\2\u07af\u07b0\5\u014c"+
		"\u00a7\2\u07b0\u07b1\7@\2\2\u07b1\u0149\3\2\2\2\u07b2\u07b3\5\u014c\u00a7"+
		"\2\u07b3\u014b\3\2\2\2\u07b4\u07b7\5\u014e\u00a8\2\u07b5\u07b7\5\u0156"+
		"\u00ac\2\u07b6\u07b4\3\2\2\2\u07b6\u07b5\3\2\2\2\u07b7\u014d\3\2\2\2\u07b8"+
		"\u07b9\5\u0150\u00a9\2\u07b9\u07ba\7[\2\2\u07ba\u07bb\5\u0154\u00ab\2"+
		"\u07bb\u014f\3\2\2\2\u07bc\u07c7\7h\2\2\u07bd\u07bf\7;\2\2\u07be\u07c0"+
		"\5\u0080A\2\u07bf\u07be\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0\u07c1\3\2\2"+
		"\2\u07c1\u07c7\7<\2\2\u07c2\u07c3\7;\2\2\u07c3\u07c4\5\u0152\u00aa\2\u07c4"+
		"\u07c5\7<\2\2\u07c5\u07c7\3\2\2\2\u07c6\u07bc\3\2\2\2\u07c6\u07bd\3\2"+
		"\2\2\u07c6\u07c2\3\2\2\2\u07c7\u0151\3\2\2\2\u07c8\u07cd\7h\2\2\u07c9"+
		"\u07ca\7B\2\2\u07ca\u07cc\7h\2\2\u07cb\u07c9\3\2\2\2\u07cc\u07cf\3\2\2"+
		"\2\u07cd\u07cb\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce\u0153\3\2\2\2\u07cf\u07cd"+
		"\3\2\2\2\u07d0\u07d3\5\u014c\u00a7\2\u07d1\u07d3\5\u00aaV\2\u07d2\u07d0"+
		"\3\2\2\2\u07d2\u07d1\3\2\2\2\u07d3\u0155\3\2\2\2\u07d4\u07d7\5\u015e\u00b0"+
		"\2\u07d5\u07d7\5\u0158\u00ad\2\u07d6\u07d4\3\2\2\2\u07d6\u07d5\3\2\2\2"+
		"\u07d7\u0157\3\2\2\2\u07d8\u07d9\5\u015a\u00ae\2\u07d9\u07da\5\u015c\u00af"+
		"\2\u07da\u07db\5\u014c\u00a7\2\u07db\u0159\3\2\2\2\u07dc\u07e0\5\66\34"+
		"\2\u07dd\u07e0\5\u012a\u0096\2\u07de\u07e0\5\u0130\u0099\2\u07df\u07dc"+
		"\3\2\2\2\u07df\u07dd\3\2\2\2\u07df\u07de\3\2\2\2\u07e0\u015b\3\2\2\2\u07e1"+
		"\u07e2\t\7\2\2\u07e2\u015d\3\2\2\2\u07e3\u07eb\5\u0160\u00b1\2\u07e4\u07e5"+
		"\5\u0160\u00b1\2\u07e5\u07e6\7I\2\2\u07e6\u07e7\5\u014c\u00a7\2\u07e7"+
		"\u07e8\7J\2\2\u07e8\u07e9\5\u015e\u00b0\2\u07e9\u07eb\3\2\2\2\u07ea\u07e3"+
		"\3\2\2\2\u07ea\u07e4\3\2\2\2\u07eb\u015f\3\2\2\2\u07ec\u07ed\b\u00b1\1"+
		"\2\u07ed\u07ee\5\u0162\u00b2\2\u07ee\u07f4\3\2\2\2\u07ef\u07f0\f\3\2\2"+
		"\u07f0\u07f1\7P\2\2\u07f1\u07f3\5\u0162\u00b2\2\u07f2\u07ef\3\2\2\2\u07f3"+
		"\u07f6\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u0161\3\2"+
		"\2\2\u07f6\u07f4\3\2\2\2\u07f7\u07f8\b\u00b2\1\2\u07f8\u07f9\5\u0164\u00b3"+
		"\2\u07f9\u07ff\3\2\2\2\u07fa\u07fb\f\3\2\2\u07fb\u07fc\7O\2\2\u07fc\u07fe"+
		"\5\u0164\u00b3\2\u07fd\u07fa\3\2\2\2\u07fe\u0801\3\2\2\2\u07ff\u07fd\3"+
		"\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0163\3\2\2\2\u0801\u07ff\3\2\2\2\u0802"+
		"\u0803\b\u00b3\1\2\u0803\u0804\5\u0166\u00b4\2\u0804\u080a\3\2\2\2\u0805"+
		"\u0806\f\3\2\2\u0806\u0807\7X\2\2\u0807\u0809\5\u0166\u00b4\2\u0808\u0805"+
		"\3\2\2\2\u0809\u080c\3\2\2\2\u080a\u0808\3\2\2\2\u080a\u080b\3\2\2\2\u080b"+
		"\u0165\3\2\2\2\u080c\u080a\3\2\2\2\u080d\u080e\b\u00b4\1\2\u080e\u080f"+
		"\5\u0168\u00b5\2\u080f\u0815\3\2\2\2\u0810\u0811\f\3\2\2\u0811\u0812\7"+
		"Y\2\2\u0812\u0814\5\u0168\u00b5\2\u0813\u0810\3\2\2\2\u0814\u0817\3\2"+
		"\2\2\u0815\u0813\3\2\2\2\u0815\u0816\3\2\2\2\u0816\u0167\3\2\2\2\u0817"+
		"\u0815\3\2\2\2\u0818\u0819\b\u00b5\1\2\u0819\u081a\5\u016a\u00b6\2\u081a"+
		"\u0820\3\2\2\2\u081b\u081c\f\3\2\2\u081c\u081d\7W\2\2\u081d\u081f\5\u016a"+
		"\u00b6\2\u081e\u081b\3\2\2\2\u081f\u0822\3\2\2\2\u0820\u081e\3\2\2\2\u0820"+
		"\u0821\3\2\2\2\u0821\u0169\3\2\2\2\u0822\u0820\3\2\2\2\u0823\u0824\b\u00b6"+
		"\1\2\u0824\u0825\5\u016c\u00b7\2\u0825\u082e\3\2\2\2\u0826\u0827\f\4\2"+
		"\2\u0827\u0828\7K\2\2\u0828\u082d\5\u016c\u00b7\2\u0829\u082a\f\3\2\2"+
		"\u082a\u082b\7N\2\2\u082b\u082d\5\u016c\u00b7\2\u082c\u0826\3\2\2\2\u082c"+
		"\u0829\3\2\2\2\u082d\u0830\3\2\2\2\u082e\u082c\3\2\2\2\u082e\u082f\3\2"+
		"\2\2\u082f\u016b\3\2\2\2\u0830\u082e\3\2\2\2\u0831\u0832\b\u00b7\1\2\u0832"+
		"\u0833\5\u016e\u00b8\2\u0833\u0845\3\2\2\2\u0834\u0835\f\7\2\2\u0835\u0836"+
		"\7F\2\2\u0836\u0844\5\u016e\u00b8\2\u0837\u0838\f\6\2\2\u0838\u0839\7"+
		"E\2\2\u0839\u0844\5\u016e\u00b8\2\u083a\u083b\f\5\2\2\u083b\u083c\7L\2"+
		"\2\u083c\u0844\5\u016e\u00b8\2\u083d\u083e\f\4\2\2\u083e\u083f\7M\2\2"+
		"\u083f\u0844\5\u016e\u00b8\2\u0840\u0841\f\3\2\2\u0841\u0842\7\34\2\2"+
		"\u0842\u0844\5\16\b\2\u0843\u0834\3\2\2\2\u0843\u0837\3\2\2\2\u0843\u083a"+
		"\3\2\2\2\u0843\u083d\3\2\2\2\u0843\u0840\3\2\2\2\u0844\u0847\3\2\2\2\u0845"+
		"\u0843\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u016d\3\2\2\2\u0847\u0845\3\2"+
		"\2\2\u0848\u0849\b\u00b8\1\2\u0849\u084a\5\u0170\u00b9\2\u084a\u085a\3"+
		"\2\2\2\u084b\u084c\f\5\2\2\u084c\u084d\7F\2\2\u084d\u084e\7F\2\2\u084e"+
		"\u0859\5\u0170\u00b9\2\u084f\u0850\f\4\2\2\u0850\u0851\7E\2\2\u0851\u0852"+
		"\7E\2\2\u0852\u0859\5\u0170\u00b9\2\u0853\u0854\f\3\2\2\u0854\u0855\7"+
		"E\2\2\u0855\u0856\7E\2\2\u0856\u0857\7E\2\2\u0857\u0859\5\u0170\u00b9"+
		"\2\u0858\u084b\3\2\2\2\u0858\u084f\3\2\2\2\u0858\u0853\3\2\2\2\u0859\u085c"+
		"\3\2\2\2\u085a\u0858\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u016f\3\2\2\2\u085c"+
		"\u085a\3\2\2\2\u085d\u085e\b\u00b9\1\2\u085e\u085f\5\u0172\u00ba\2\u085f"+
		"\u0868\3\2\2\2\u0860\u0861\f\4\2\2\u0861\u0862\7S\2\2\u0862\u0867\5\u0172"+
		"\u00ba\2\u0863\u0864\f\3\2\2\u0864\u0865\7T\2\2\u0865\u0867\5\u0172\u00ba"+
		"\2\u0866\u0860\3\2\2\2\u0866\u0863\3\2\2\2\u0867\u086a\3\2\2\2\u0868\u0866"+
		"\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u0171\3\2\2\2\u086a\u0868\3\2\2\2\u086b"+
		"\u086c\b\u00ba\1\2\u086c\u086d\5\u0174\u00bb\2\u086d\u0879\3\2\2\2\u086e"+
		"\u086f\f\5\2\2\u086f\u0870\7U\2\2\u0870\u0878\5\u0174\u00bb\2\u0871\u0872"+
		"\f\4\2\2\u0872\u0873\7V\2\2\u0873\u0878\5\u0174\u00bb\2\u0874\u0875\f"+
		"\3\2\2\u0875\u0876\7Z\2\2\u0876\u0878\5\u0174\u00bb\2\u0877\u086e\3\2"+
		"\2\2\u0877\u0871\3\2\2\2\u0877\u0874\3\2\2\2\u0878\u087b\3\2\2\2\u0879"+
		"\u0877\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u0173\3\2\2\2\u087b\u0879\3\2"+
		"\2\2\u087c\u0884\5\u0176\u00bc\2\u087d\u0884\5\u0178\u00bd\2\u087e\u087f"+
		"\7S\2\2\u087f\u0884\5\u0174\u00bb\2\u0880\u0881\7T\2\2\u0881\u0884\5\u0174"+
		"\u00bb\2\u0882\u0884\5\u017a\u00be\2\u0883\u087c\3\2\2\2\u0883\u087d\3"+
		"\2\2\2\u0883\u087e\3\2\2\2\u0883\u0880\3\2\2\2\u0883\u0882\3\2\2\2\u0884"+
		"\u0175\3\2\2\2\u0885\u0886\7Q\2\2\u0886\u0887\5\u0174\u00bb\2\u0887\u0177"+
		"\3\2\2\2\u0888\u0889\7R\2\2\u0889\u088a\5\u0174\u00bb\2\u088a\u0179\3"+
		"\2\2\2\u088b\u0892\5\u017c\u00bf\2\u088c\u088d\7H\2\2\u088d\u0892\5\u0174"+
		"\u00bb\2\u088e\u088f\7G\2\2\u088f\u0892\5\u0174\u00bb\2\u0890\u0892\5"+
		"\u0186\u00c4\2\u0891\u088b\3\2\2\2\u0891\u088c\3\2\2\2\u0891\u088e\3\2"+
		"\2\2\u0891\u0890\3\2\2\2\u0892\u017b\3\2\2\2\u0893\u0896\5\u010e\u0088"+
		"\2\u0894\u0896\5\66\34\2\u0895\u0893\3\2\2\2\u0895\u0894\3\2\2\2\u0896"+
		"\u089b\3\2\2\2\u0897\u089a\5\u0180\u00c1\2\u0898\u089a\5\u0184\u00c3\2"+
		"\u0899\u0897\3\2\2\2\u0899\u0898\3\2\2\2\u089a\u089d\3\2\2\2\u089b\u0899"+
		"\3\2\2\2\u089b\u089c\3\2\2\2\u089c\u017d\3\2\2\2\u089d\u089b\3\2\2\2\u089e"+
		"\u089f\5\u017c\u00bf\2\u089f\u08a0\7Q\2\2\u08a0\u017f\3\2\2\2\u08a1\u08a2"+
		"\7Q\2\2\u08a2\u0181\3\2\2\2\u08a3\u08a4\5\u017c\u00bf\2\u08a4\u08a5\7"+
		"R\2\2\u08a5\u0183\3\2\2\2\u08a6\u08a7\7R\2\2\u08a7\u0185\3\2\2\2\u08a8"+
		"\u08a9\7;\2\2\u08a9\u08aa\5\6\4\2\u08aa\u08ab\7<\2\2\u08ab\u08ac\5\u0174"+
		"\u00bb\2\u08ac\u08c4\3\2\2\2\u08ad\u08ae\7;\2\2\u08ae\u08b2\5\16\b\2\u08af"+
		"\u08b1\5(\25\2\u08b0\u08af\3\2\2\2\u08b1\u08b4\3\2\2\2\u08b2\u08b0\3\2"+
		"\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b5\3\2\2\2\u08b4\u08b2\3\2\2\2\u08b5"+
		"\u08b6\7<\2\2\u08b6\u08b7\5\u017a\u00be\2\u08b7\u08c4\3\2\2\2\u08b8\u08b9"+
		"\7;\2\2\u08b9\u08bd\5\16\b\2\u08ba\u08bc\5(\25\2\u08bb\u08ba\3\2\2\2\u08bc"+
		"\u08bf\3\2\2\2\u08bd\u08bb\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08c0\3\2"+
		"\2\2\u08bf\u08bd\3\2\2\2\u08c0\u08c1\7<\2\2\u08c1\u08c2\5\u014e\u00a8"+
		"\2\u08c2\u08c4\3\2\2\2\u08c3\u08a8\3\2\2\2\u08c3\u08ad\3\2\2\2\u08c3\u08b8"+
		"\3\2\2\2\u08c4\u0187\3\2\2\2\u00fc\u018b\u0194\u0198\u01a1\u01a5\u01a9"+
		"\u01ab\u01b0\u01b6\u01b8\u01bd\u01c1\u01d4\u01dc\u01e1\u01ea\u01ed\u01fb"+
		"\u0200\u0204\u020a\u0213\u021f\u0224\u0229\u022f\u0232\u0235\u0244\u0252"+
		"\u0259\u0262\u0268\u026d\u027b\u0281\u0285\u0289\u028d\u0291\u0296\u029a"+
		"\u029e\u02a0\u02a5\u02ab\u02ad\u02b2\u02b6\u02c9\u02ce\u02d7\u02db\u02e2"+
		"\u02e6\u02ed\u02fa\u02ff\u0303\u030d\u0312\u0319\u031e\u0326\u0329\u032e"+
		"\u0333\u0338\u033d\u0344\u0349\u0351\u0356\u035b\u0360\u0366\u036c\u036f"+
		"\u0372\u037b\u0381\u0384\u0387\u038d\u0392\u0395\u039e\u03a3\u03aa\u03b0"+
		"\u03b8\u03bc\u03c6\u03cd\u03db\u03f1\u0413\u041f\u0425\u0431\u043e\u0458"+
		"\u045c\u0461\u0465\u0469\u0471\u0475\u0479\u0480\u0489\u0491\u04a0\u04ac"+
		"\u04b2\u04b8\u04cd\u04d2\u04d8\u04e4\u04ef\u04f9\u04fc\u0501\u050a\u0510"+
		"\u051a\u051f\u0528\u053f\u0549\u055f\u0566\u056e\u0576\u0581\u0598\u05a2"+
		"\u05ad\u05c3\u05c7\u05ce\u05d2\u05d6\u05da\u05e0\u05e4\u05e8\u05ec\u05f2"+
		"\u05f6\u05fa\u05fe\u0600\u0605\u0609\u060d\u0611\u0615\u061c\u0620\u0624"+
		"\u0628\u062e\u0632\u0636\u063a\u063c\u0641\u0650\u065e\u066a\u0673\u0682"+
		"\u068f\u0698\u069e\u06a5\u06aa\u06b1\u06b6\u06bd\u06c2\u06c9\u06ce\u06d6"+
		"\u06db\u06df\u06e3\u06e8\u06ef\u06f6\u06fb\u0702\u0707\u070e\u0713\u071b"+
		"\u0720\u0724\u072b\u0731\u0738\u073f\u0746\u074e\u0755\u075d\u0761\u0768"+
		"\u076f\u0776\u077e\u0785\u078d\u0793\u0799\u07a5\u07ab\u07b6\u07bf\u07c6"+
		"\u07cd\u07d2\u07d6\u07df\u07ea\u07f4\u07ff\u080a\u0815\u0820\u082c\u082e"+
		"\u0843\u0845\u0858\u085a\u0866\u0868\u0877\u0879\u0883\u0891\u0895\u0899"+
		"\u089b\u08b2\u08bd\u08c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
/*
 * [The "BSD license"]
 *  Copyright (c) 2014 Terence Parr
 *  Copyright (c) 2014 Sam Harwell
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 *  IMPLIED WARRANTIES, INCLUDING, BUT  LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * A Java 8 grammar for ANTLR 4 derived from the Java Language Specification
 * chapter 19.
 *
 * NOTE: This grammar results in a generated parser that is much slower
 *       than the Java 7 grammar in the grammars-v4/java directory. This
 *     one is, however, extremely close to the spec.
 *
 * You can test with
 *
 *  $ antlr4 Java8.g4
 *  $ javac *.java
 *  $ grun Java8 compilationUnit *.java
 *
 * Or,
~/antlr/code/grammars-v4/java8 $ java Test .
/Users/parrt/antlr/code/grammars-v4/java8/./Java8BaseListener.java
/Users/parrt/antlr/code/grammars-v4/java8/./Java8Lexer.java
/Users/parrt/antlr/code/grammars-v4/java8/./Java8Listener.java
/Users/parrt/antlr/code/grammars-v4/java8/./Java8Parser.java
/Users/parrt/antlr/code/grammars-v4/java8/./Test.java
Total lexer+parser time 30844ms.
 */
parser grammar AiRingoParser;

options {
    tokenVocab=AiRingoLexer;
}

startRule
	: blockStatements* EOF
	;

/*
 * Productions from §3 (Lexical Structure)
 */

literal
	:	IntegerLiteral
	|	FloatingPointLiteral
	|	BooleanLiteral
	|	CharacterLiteral
	|	StringLiteral
	|	NullLiteral
	;

/*
 * Productions from §4 (Types, Values, and Variables)
 */

primitiveType
	:	 numericType
	|	 'boorean'
	;

numericType
	:	integralType
	|	floatingPointType
	;

integralType
	:	'byto'
	|	'shorto'
	|	'into'
	|	'rongu'
	|	'karu'
	;

floatingPointType
	:	'furoto'
	|	'doburu'
	;

referenceType
	:	classOrInterfaceType
	|	typeVariable
	|	arrayType
	;

classOrInterfaceType
	:	(	classType_lfno_classOrInterfaceType
		|	interfaceType_lfno_classOrInterfaceType
		)
		(	classType_lf_classOrInterfaceType
		|	interfaceType_lf_classOrInterfaceType
		)*
	;

classType
	:	 Identifier typeArguments?
	|	classOrInterfaceType '.'  Identifier typeArguments?
	;

classType_lf_classOrInterfaceType
	:	'.'  Identifier typeArguments?
	;

classType_lfno_classOrInterfaceType
	:	 Identifier typeArguments?
	;

interfaceType
	:	classType
	;

interfaceType_lf_classOrInterfaceType
	:	classType_lf_classOrInterfaceType
	;

interfaceType_lfno_classOrInterfaceType
	:	classType_lfno_classOrInterfaceType
	;

typeVariable
	:	 Identifier
	;

arrayType
	:	primitiveType dims
	|	classOrInterfaceType dims
	|	typeVariable dims
	;

dims
	:	 '[' ']' ( '[' ']')*
	;

typeParameter
	:	Identifier typeBound?
	;


typeBound
	:	'extendo' typeVariable
	|	'extendo' classOrInterfaceType additionalBound*
	;

additionalBound
	:	'&' interfaceType
	;

typeArguments
	:	'<' typeArgumentList '>'
	;

typeArgumentList
	:	typeArgument (',' typeArgument)*
	;

typeArgument
	:	referenceType
	|	wildcard
	;

wildcard
	:	 '?' wildcardBounds?
	;

wildcardBounds
	:	'extendo' referenceType
	|	'supa' referenceType
	;

/*
 * Productions from §6 (Names)
 */

typeName
	:	Identifier
	;

expressionName
	:	Identifier
	|	ambiguousName '.' Identifier
	;

methodName
	:	Identifier
	;

ambiguousName
	:	Identifier
	|	ambiguousName '.' Identifier
	;

/*
 * Productions from §8 (Classes)
 */

classDeclaration
	:	normalClassDeclaration
	|	enumDeclaration
	;

normalClassDeclaration
	:	classModifier* 'kurasu' Identifier typeParameters? superclass? superinterfaces? classBody
	;

classModifier
	:	'abstrakto'
	;

typeParameters
	:	'<' typeParameterList '>'
	;

typeParameterList
	:	typeParameter (',' typeParameter)*
	;

superclass
	:	'extendo' classType
	;

superinterfaces
	:	'impremento' interfaceTypeList
	;

interfaceTypeList
	:	interfaceType (',' interfaceType)*
	;

classBody
	:	'{' classBodyDeclaration* '}'
	;

classBodyDeclaration
	:	classMemberDeclaration
	|	instanceInitializer
	|	staticInitializer
	|	constructorDeclaration
	;

classMemberDeclaration
	:	fieldDeclaration
	|	methodDeclaration
	|	classDeclaration
	|	';'
	;

fieldDeclaration
	:	fieldModifier* unannType variableDeclaratorList ';'
	;

fieldModifier
	:
		'pubriko'
	|	'protekto'
	|	'privatto'
	|	'statiku'
	|	'finar'
	|	'transento'
	|	'voratiru'
	;

variableDeclaratorList
	:	variableDeclarator (',' variableDeclarator)*
	;

variableDeclarator
	:	variableDeclaratorId ('=' variableInitializer)?
	;

variableDeclaratorId
	:	Identifier dims?
	;

variableInitializer
	:	expression
	|	arrayInitializer
	;

unannType
	:	unannPrimitiveType
	|	unannReferenceType
	;

unannPrimitiveType
	:	numericType
	|	'boorean'
	;

unannReferenceType
	:	unannClassOrInterfaceType
	|	unannTypeVariable
	|	unannArrayType
	;

unannClassOrInterfaceType
	:	(	unannClassType_lfno_unannClassOrInterfaceType
		|	unannInterfaceType_lfno_unannClassOrInterfaceType
		)
		(	unannClassType_lf_unannClassOrInterfaceType
		|	unannInterfaceType_lf_unannClassOrInterfaceType
		)*
	;

unannClassType
	:	Identifier typeArguments?
	|	unannClassOrInterfaceType '.'  Identifier typeArguments?
	;

unannClassType_lf_unannClassOrInterfaceType
	:	'.'  Identifier typeArguments?
	;

unannClassType_lfno_unannClassOrInterfaceType
	:	Identifier typeArguments?
	;

unannInterfaceType
	:	unannClassType
	;

unannInterfaceType_lf_unannClassOrInterfaceType
	:	unannClassType_lf_unannClassOrInterfaceType
	;

unannInterfaceType_lfno_unannClassOrInterfaceType
	:	unannClassType_lfno_unannClassOrInterfaceType
	;

unannTypeVariable
	:	Identifier
	;

unannArrayType
	:	unannPrimitiveType dims
	|	unannClassOrInterfaceType dims
	|	unannTypeVariable dims
	;

methodDeclaration
	:	methodModifier* methodHeader methodBody
	;

methodModifier
	:	'abstrakto'
	;

methodHeader
	:	result? methodDeclarator throws_?
	;

result
	:	unannType
	;

methodDeclarator
	:	Identifier '(' formalParameterList? ')' dims?
	;

formalParameterList
	:	Identifier (',' Identifier)*
	;

variableModifier
	: 'konst'
	;

throws_
	:	'throwsu' exceptionTypeList
	;

exceptionTypeList
	:	exceptionType (',' exceptionType)*
	;

exceptionType
	:	classType
	|	typeVariable
	;

methodBody
	:	block
	|	';'
	;

instanceInitializer
	:	block
	;

staticInitializer
	:	'statiku' block
	;

constructorDeclaration
	:	constructorModifier* constructorDeclarator throws_? constructorBody
	;

constructorModifier
	:
		'pubriko'
	|	'protekto'
	|	'privatto'
	;

constructorDeclarator
	:	typeParameters? simpleTypeName '(' formalParameterList? ')'
	;

simpleTypeName
	:	Identifier
	;

constructorBody
	:	'{' explicitConstructorInvocation? blockStatements? '}'
	;

explicitConstructorInvocation
	:	typeArguments? 'disu' '(' argumentList? ')' ';'
	|	typeArguments? 'supa' '(' argumentList? ')' ';'
	|	expressionName '.' typeArguments? 'supa' '(' argumentList? ')' ';'
	|	primary '.' typeArguments? 'supa' '(' argumentList? ')' ';'
	;

enumDeclaration
	:	classModifier* 'enumu' Identifier superinterfaces? enumBody
	;

enumBody
	:	'{' enumConstantList? ','? enumBodyDeclarations? '}'
	;

enumConstantList
	:	enumConstant (',' enumConstant)*
	;

enumConstant
	:	Identifier ('(' argumentList? ')')? classBody?
	;

enumBodyDeclarations
	:	';' classBodyDeclaration*
	;

/*
 * Productions from §10 (Arrays)
 */

arrayInitializer
	:	'[' variableInitializerList? ','? ']'
	;

variableInitializerList
	:	variableInitializer (',' variableInitializer)*
	;

/*
 * Productions from §14 (Blocks and Statements)
 */

block
	:	'{' blockStatements? '}'
	;

blockStatements
	:	blockStatement+
	;

blockStatement
	:	localVariableDeclarationStatement
	|	classDeclaration
	|   methodDeclaration
	|	statement
	;

localVariableDeclarationStatement
	:	localVariableDeclaration ';'
	;

localVariableDeclaration
	:	variableModifier* unannType? variableDeclaratorList
	;

statement
	:	statementWithoutTrailingSubstatement
	|	labeledStatement
	|	ifThenStatement
	|	ifThenElseStatement
	|	whileStatement
	|	forStatement
	;

statementNoShortIf
	:	statementWithoutTrailingSubstatement
	|	labeledStatementNoShortIf
	|	ifThenElseStatementNoShortIf
	|	whileStatementNoShortIf
	|	forStatementNoShortIf
	;

statementWithoutTrailingSubstatement
	:	block
	|	emptyStatement
	|	expressionStatement
	|	assertStatement
	|	switchStatement
	|	doStatement
	|	breakStatement
	|	continueStatement
	|	returnStatement
	|	synchronizedStatement
	|	throwStatement
	|	tryStatement
	;

emptyStatement
	:	';'
	;

labeledStatement
	:	Identifier ':' statement
	;

labeledStatementNoShortIf
	:	Identifier ':' statementNoShortIf
	;

expressionStatement
	:	statementExpression ';'
	;

statementExpression
	:	assignment
	|	preIncrementExpression
	|	preDecrementExpression
	|	postIncrementExpression
	|	postDecrementExpression
	|	methodInvocation
	|	classInstanceCreationExpression
	;

ifThenStatement
	:	'ifu' '(' expression ')' statement
	;

ifThenElseStatement
	:	'ifu' '(' expression ')' statementNoShortIf 'erusu' statement
	;

ifThenElseStatementNoShortIf
	:	'ifu' '(' expression ')' statementNoShortIf 'erusu' statementNoShortIf
	;

assertStatement
	:	'asserto' expression ';'
	|	'asserto' expression ':' expression ';'
	;

switchStatement
	:	'switchu' '(' expression ')' switchBlock
	;

switchBlock
	:	'{' switchBlockStatementGroup* switchLabel* '}'
	;

switchBlockStatementGroup
	:	switchLabels blockStatements
	;

switchLabels
	:	switchLabel switchLabel*
	;

switchLabel
	:	'kesu' constantExpression ':'
	|	'kesu' enumConstantName ':'
	|	'deporuto' ':'
	;

enumConstantName
	:	Identifier
	;

whileStatement
	:	'wairu' '(' expression ')' statement
	;

whileStatementNoShortIf
	:	'wairu' '(' expression ')' statementNoShortIf
	;

doStatement
	:	'do' statement 'wairu' '(' expression ')' ';'
	;

forStatement
	:	basicForStatement
	|	enhancedForStatement
	;

forStatementNoShortIf
	:	basicForStatementNoShortIf
	|	enhancedForStatementNoShortIf
	;

basicForStatement
	:	FOR '(' forInit? ';' expression? ';' forUpdate? ')' statement
	;

//specialForStatement
//    :   FOR '(' Identifier 'in' Identifier ')' block
//    ;

basicForStatementNoShortIf
	:	FOR '(' forInit? ';' expression? ';' forUpdate? ')' statementNoShortIf
	;

forInit
	:	statementExpressionList
	|	localVariableDeclaration
	;

forUpdate
	:	statementExpressionList
	;

statementExpressionList
	:	statementExpression (',' statementExpression)*
	;

enhancedForStatement
	:	FOR '(' variableModifier* unannType variableDeclaratorId ':' expression ')' statement
	;

enhancedForStatementNoShortIf
	:	FOR '(' variableModifier* unannType variableDeclaratorId ':' expression ')' statementNoShortIf
	;

breakStatement
	:	'bureko' Identifier? ';'
	;

continueStatement
	:	'kontinu' Identifier? ';'
	;

returnStatement
	:	'returno' expression? ';'
	;

throwStatement
	:	'throwu' expression ';'
	;

synchronizedStatement
	:	'sinkuronaizu' '(' expression ')' block
	;

tryStatement
	:	'tryu' block catches
	|	'tryu' block catches? finally_
	|	tryWithResourcesStatement
	;

catches
	:	catchClause catchClause*
	;

catchClause
	:	'katchu' '(' catchFormalParameter ')' block
	;

catchFormalParameter
	:	variableModifier* catchType variableDeclaratorId
	;

catchType
	:	unannClassType ('|' classType)*
	;

finally_
	:	'finarri' block
	;

tryWithResourcesStatement
	:	'tryu' resourceSpecification block catches? finally_?
	;

resourceSpecification
	:	'(' resourceList ';'? ')'
	;

resourceList
	:	resource (';' resource)*
	;

resource
	:	variableModifier* unannType variableDeclaratorId '=' expression
	;

/*
 * Productions from §15 (Expressions)
 */

primary
	:	(	primaryNoNewArray_lfno_primary
		|	arrayCreationExpression
		)
		(	primaryNoNewArray_lf_primary
		)*
	;

primaryNoNewArray
	:	literal
	|	typeName ('[' ']')* '.' 'kurasu'
	|	'boido' '.' 'kurasu'
	|	'disu'
	|	typeName '.' 'disu'
	|	'(' expression ')'
	|	classInstanceCreationExpression
	|	fieldAccess
	|	arrayAccess
	|	methodInvocation
	|	methodReference
	;

primaryNoNewArray_lf_arrayAccess
	:
	;

primaryNoNewArray_lfno_arrayAccess
	:	literal
	|	typeName ('[' ']')* '.' 'kurasu'
	|	'boido' '.' 'kurasu'
	|	'disu'
	|	typeName '.' 'disu'
	|	'(' expression ')'
	|	classInstanceCreationExpression
	|	fieldAccess
	|	methodInvocation
	|	methodReference
	;

primaryNoNewArray_lf_primary
	:	classInstanceCreationExpression_lf_primary
	|	fieldAccess_lf_primary
	|	arrayAccess_lf_primary
	|	methodInvocation_lf_primary
	|	methodReference_lf_primary
	;

primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
	:
	;

primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
	:	classInstanceCreationExpression_lf_primary
	|	fieldAccess_lf_primary
	|	methodInvocation_lf_primary
	|	methodReference_lf_primary
	;

primaryNoNewArray_lfno_primary
	:	literal
	|	typeName ('[' ']')* '.' 'kurasu'
	|	unannPrimitiveType ('[' ']')* '.' 'kurasu'
	|	'boido' '.' 'kurasu'
	|	'disu'
	|	typeName '.' 'disu'
	|	'(' expression ')'
	|	classInstanceCreationExpression_lfno_primary
	|	fieldAccess_lfno_primary
	|	arrayAccess_lfno_primary
	|	methodInvocation_lfno_primary
	|	methodReference_lfno_primary
	;

primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
	:
	;

primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
	:	literal
	|	typeName ('[' ']')* '.' 'kurasu'
	|	unannPrimitiveType ('[' ']')* '.' 'kurasu'
	|	'boido' '.' 'kurasu'
	|	'disu'
	|	typeName '.' 'disu'
	|	'(' expression ')'
	|	classInstanceCreationExpression_lfno_primary
	|	fieldAccess_lfno_primary
	|	methodInvocation_lfno_primary
	|	methodReference_lfno_primary
	;

classInstanceCreationExpression
	:	'newu' typeArguments?  Identifier ('.'  Identifier)* typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
	|	expressionName '.' 'newu' typeArguments?  Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
	|	primary '.' 'newu' typeArguments?  Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
	;

classInstanceCreationExpression_lf_primary
	:	'.' 'newu' typeArguments?  Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
	;

classInstanceCreationExpression_lfno_primary
	:	'newu' typeArguments?  Identifier ('.'  Identifier)* typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
	|	expressionName '.' 'newu' typeArguments?  Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
	;

typeArgumentsOrDiamond
	:	typeArguments
	|	'<' '>'
	;

fieldAccess
	:	primary '.' Identifier
	|	'supa' '.' Identifier
	|	typeName '.' 'supa' '.' Identifier
	;

fieldAccess_lf_primary
	:	'.' Identifier
	;

fieldAccess_lfno_primary
	:	'supa' '.' Identifier
	|	typeName '.' 'supa' '.' Identifier
	;

arrayAccess
	:	(	expressionName '[' expression ']'
		|	primaryNoNewArray_lfno_arrayAccess '[' expression ']'
		)
		(	primaryNoNewArray_lf_arrayAccess '[' expression ']'
		)*
	;

arrayAccess_lf_primary
	:	(	primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary '[' expression ']'
		)
		(	primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary '[' expression ']'
		)*
	;

arrayAccess_lfno_primary
	:	(	expressionName '[' expression ']'
		|	primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary '[' expression ']'
		)
		(	primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary '[' expression ']'
		)*
	;

methodInvocation
	:	methodName '(' argumentList? ')'
	|	typeName '.' typeArguments? Identifier '(' argumentList? ')'
	|	expressionName '.' typeArguments? Identifier '(' argumentList? ')'
	|	primary '.' typeArguments? Identifier '(' argumentList? ')'
	|	'supa' '.' typeArguments? Identifier '(' argumentList? ')'
	|	typeName '.' 'supa' '.' typeArguments? Identifier '(' argumentList? ')'
	;

methodInvocation_lf_primary
	:	'.' typeArguments? Identifier '(' argumentList? ')'
	;

methodInvocation_lfno_primary
	:	methodName '(' argumentList? ')'
	|	typeName '.' typeArguments? Identifier '(' argumentList? ')'
	|	expressionName '.' typeArguments? Identifier '(' argumentList? ')'
	|	'supa' '.' typeArguments? Identifier '(' argumentList? ')'
	|	typeName '.' 'supa' '.' typeArguments? Identifier '(' argumentList? ')'
	;

argumentList
	:	expression (',' expression)*
	;

methodReference
	:	expressionName '::' typeArguments? Identifier
	|	referenceType '::' typeArguments? Identifier
	|	primary '::' typeArguments? Identifier
	|	'supa' '::' typeArguments? Identifier
	|	typeName '.' 'supa' '::' typeArguments? Identifier
	|	classType '::' typeArguments? 'newu'
	|	arrayType '::' 'newu'
	;

methodReference_lf_primary
	:	'::' typeArguments? Identifier
	;

methodReference_lfno_primary
	:	expressionName '::' typeArguments? Identifier
	|	referenceType '::' typeArguments? Identifier
	|	'supa' '::' typeArguments? Identifier
	|	typeName '.' 'supa' '::' typeArguments? Identifier
	|	classType '::' typeArguments? 'newu'
	|	arrayType '::' 'newu'
	;

arrayCreationExpression
	:	'newu' primitiveType dimExprs dims?
	|	'newu' classOrInterfaceType dimExprs dims?
	|	'newu' primitiveType dims arrayInitializer
	|	'newu' classOrInterfaceType dims arrayInitializer
	;

dimExprs
	:	dimExpr dimExpr*
	;

dimExpr
	:	 '[' expression ']'
	;

constantExpression
	:	expression
	;

expression
	:	lambdaExpression
	|	assignmentExpression
	;

lambdaExpression
	:	lambdaParameters '->' lambdaBody
	;

lambdaParameters
	:	Identifier
	|	'(' formalParameterList? ')'
	|	'(' inferredFormalParameterList ')'
	;

inferredFormalParameterList
	:	Identifier (',' Identifier)*
	;

lambdaBody
	:	expression
	|	block
	;

assignmentExpression
	:	conditionalExpression
	|	assignment
	;

assignment
	:	leftHandSide assignmentOperator expression
	;

leftHandSide
	:	expressionName
	|	fieldAccess
	|	arrayAccess
	;

assignmentOperator
	:	'='
	|	'*='
	|	'/='
	|	'%='
	|	'+='
	|	'-='
	|	'<<='
	|	'>>='
	|	'>>>='
	|	'&='
	|	'^='
	|	'|='
	;

conditionalExpression
	:	conditionalOrExpression
	|	conditionalOrExpression '?' expression ':' conditionalExpression
	;

conditionalOrExpression
	:	conditionalAndExpression
	|	conditionalOrExpression OR conditionalAndExpression
	;

conditionalAndExpression
	:	inclusiveOrExpression
	|	conditionalAndExpression AND inclusiveOrExpression
	;

inclusiveOrExpression
	:	exclusiveOrExpression
	|	inclusiveOrExpression '|' exclusiveOrExpression
	;

exclusiveOrExpression
	:	andExpression
	|	exclusiveOrExpression '^' andExpression
	;

andExpression
	:	equalityExpression
	|	andExpression '&' equalityExpression
	;

equalityExpression
	:	relationalExpression
	|	equalityExpression '==' relationalExpression
	|	equalityExpression '!=' relationalExpression
	;

relationalExpression
	:	shiftExpression
	|	relationalExpression '<' shiftExpression
	|	relationalExpression '>' shiftExpression
	|	relationalExpression '<=' shiftExpression
	|	relationalExpression '>=' shiftExpression
	|	relationalExpression 'insutaof' referenceType
	;

shiftExpression
	:	additiveExpression
	|	shiftExpression '<' '<' additiveExpression
	|	shiftExpression '>' '>' additiveExpression
	|	shiftExpression '>' '>' '>' additiveExpression
	;

additiveExpression
	:	multiplicativeExpression
	|	additiveExpression '+' multiplicativeExpression
	|	additiveExpression '-' multiplicativeExpression
	;

multiplicativeExpression
	:	unaryExpression
	|	multiplicativeExpression '*' unaryExpression
	|	multiplicativeExpression '/' unaryExpression
	|	multiplicativeExpression '%' unaryExpression
	;

unaryExpression
	:	preIncrementExpression
	|	preDecrementExpression
	|	'+' unaryExpression
	|	'-' unaryExpression
	|	unaryExpressionNotPlusMinus
	;

preIncrementExpression
	:	'++' unaryExpression
	;

preDecrementExpression
	:	'--' unaryExpression
	;

unaryExpressionNotPlusMinus
	:	postfixExpression
	|	'~' unaryExpression
	|	'!' unaryExpression
	|	castExpression
	;

postfixExpression
	:	(	primary
		|	expressionName
		)
		(	postIncrementExpression_lf_postfixExpression
		|	postDecrementExpression_lf_postfixExpression
		)*
	;

postIncrementExpression
	:	postfixExpression '++'
	;

postIncrementExpression_lf_postfixExpression
	:	'++'
	;

postDecrementExpression
	:	postfixExpression '--'
	;

postDecrementExpression_lf_postfixExpression
	:	'--'
	;

castExpression
	:	'(' primitiveType ')' unaryExpression
	|	'(' referenceType additionalBound* ')' unaryExpressionNotPlusMinus
	|	'(' referenceType additionalBound* ')' lambdaExpression
	;

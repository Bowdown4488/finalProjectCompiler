// Generated from C:/Users/Paolo/Documents/Compilr/finalCompiler/CMPILER-MP/AiRingo/src/Main\AiRingoParser.g4 by ANTLR 4.7.2
package Main;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AiRingoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AiRingoParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AiRingoParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(AiRingoParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(AiRingoParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(AiRingoParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(AiRingoParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(AiRingoParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(AiRingoParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(AiRingoParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(AiRingoParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(AiRingoParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(AiRingoParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(AiRingoParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(AiRingoParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(AiRingoParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(AiRingoParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(AiRingoParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(AiRingoParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(AiRingoParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(AiRingoParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(AiRingoParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(AiRingoParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(AiRingoParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(AiRingoParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(AiRingoParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(AiRingoParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(AiRingoParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(AiRingoParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(AiRingoParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(AiRingoParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(AiRingoParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(AiRingoParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(AiRingoParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(AiRingoParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(AiRingoParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(AiRingoParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(AiRingoParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(AiRingoParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(AiRingoParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(AiRingoParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(AiRingoParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AiRingoParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(AiRingoParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(AiRingoParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(AiRingoParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(AiRingoParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(AiRingoParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(AiRingoParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(AiRingoParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AiRingoParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(AiRingoParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(AiRingoParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(AiRingoParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(AiRingoParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(AiRingoParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(AiRingoParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(AiRingoParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(AiRingoParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(AiRingoParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(AiRingoParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(AiRingoParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(AiRingoParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(AiRingoParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(AiRingoParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(AiRingoParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(AiRingoParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(AiRingoParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(AiRingoParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(AiRingoParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(AiRingoParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(AiRingoParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(AiRingoParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(AiRingoParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(AiRingoParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(AiRingoParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(AiRingoParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(AiRingoParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(AiRingoParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(AiRingoParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(AiRingoParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(AiRingoParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(AiRingoParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(AiRingoParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(AiRingoParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(AiRingoParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(AiRingoParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(AiRingoParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(AiRingoParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(AiRingoParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(AiRingoParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(AiRingoParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(AiRingoParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(AiRingoParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(AiRingoParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(AiRingoParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(AiRingoParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(AiRingoParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(AiRingoParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(AiRingoParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(AiRingoParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(AiRingoParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(AiRingoParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(AiRingoParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(AiRingoParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(AiRingoParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(AiRingoParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(AiRingoParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(AiRingoParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(AiRingoParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(AiRingoParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(AiRingoParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(AiRingoParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(AiRingoParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(AiRingoParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(AiRingoParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(AiRingoParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(AiRingoParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(AiRingoParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(AiRingoParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(AiRingoParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(AiRingoParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(AiRingoParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(AiRingoParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(AiRingoParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(AiRingoParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(AiRingoParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AiRingoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(AiRingoParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(AiRingoParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(AiRingoParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(AiRingoParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AiRingoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(AiRingoParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(AiRingoParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(AiRingoParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(AiRingoParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(AiRingoParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(AiRingoParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(AiRingoParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(AiRingoParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(AiRingoParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(AiRingoParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(AiRingoParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(AiRingoParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(AiRingoParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(AiRingoParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(AiRingoParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(AiRingoParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(AiRingoParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AiRingoParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(AiRingoParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(AiRingoParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(AiRingoParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(AiRingoParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(AiRingoParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(AiRingoParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(AiRingoParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(AiRingoParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(AiRingoParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(AiRingoParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(AiRingoParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(AiRingoParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(AiRingoParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AiRingoParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(AiRingoParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(AiRingoParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(AiRingoParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(AiRingoParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(AiRingoParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(AiRingoParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(AiRingoParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(AiRingoParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(AiRingoParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(AiRingoParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(AiRingoParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(AiRingoParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(AiRingoParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(AiRingoParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(AiRingoParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(AiRingoParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(AiRingoParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(AiRingoParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(AiRingoParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(AiRingoParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(AiRingoParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(AiRingoParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(AiRingoParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(AiRingoParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(AiRingoParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(AiRingoParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(AiRingoParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(AiRingoParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(AiRingoParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(AiRingoParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(AiRingoParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(AiRingoParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(AiRingoParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(AiRingoParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(AiRingoParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(AiRingoParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(AiRingoParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(AiRingoParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(AiRingoParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(AiRingoParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(AiRingoParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(AiRingoParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(AiRingoParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AiRingoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(AiRingoParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(AiRingoParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(AiRingoParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(AiRingoParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(AiRingoParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AiRingoParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(AiRingoParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(AiRingoParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(AiRingoParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(AiRingoParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(AiRingoParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(AiRingoParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(AiRingoParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(AiRingoParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(AiRingoParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(AiRingoParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(AiRingoParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(AiRingoParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(AiRingoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(AiRingoParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(AiRingoParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(AiRingoParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(AiRingoParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(AiRingoParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(AiRingoParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(AiRingoParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(AiRingoParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(AiRingoParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AiRingoParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(AiRingoParser.CastExpressionContext ctx);
}
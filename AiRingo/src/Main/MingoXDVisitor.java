// Generated from /home/athena/GitRepo/CMPILER-MP/MingoXD/src/Main/MingoXD.g4 by ANTLR 4.7.2
package Main;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MingoXDParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MingoXDVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#run}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun(MingoXDParser.RunContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MingoXDParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(MingoXDParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(MingoXDParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(MingoXDParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(MingoXDParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(MingoXDParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(MingoXDParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(MingoXDParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(MingoXDParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(MingoXDParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(MingoXDParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(MingoXDParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(MingoXDParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(MingoXDParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(MingoXDParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(MingoXDParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(MingoXDParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(MingoXDParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(MingoXDParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(MingoXDParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(MingoXDParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(MingoXDParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(MingoXDParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(MingoXDParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(MingoXDParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(MingoXDParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(MingoXDParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(MingoXDParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(MingoXDParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(MingoXDParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(MingoXDParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(MingoXDParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(MingoXDParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(MingoXDParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(MingoXDParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(MingoXDParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(MingoXDParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(MingoXDParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(MingoXDParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MingoXDParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(MingoXDParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(MingoXDParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(MingoXDParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(MingoXDParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(MingoXDParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(MingoXDParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(MingoXDParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(MingoXDParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(MingoXDParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(MingoXDParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(MingoXDParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(MingoXDParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(MingoXDParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(MingoXDParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(MingoXDParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(MingoXDParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(MingoXDParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(MingoXDParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(MingoXDParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(MingoXDParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(MingoXDParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(MingoXDParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(MingoXDParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(MingoXDParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(MingoXDParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(MingoXDParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(MingoXDParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(MingoXDParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(MingoXDParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(MingoXDParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(MingoXDParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(MingoXDParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(MingoXDParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(MingoXDParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(MingoXDParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(MingoXDParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(MingoXDParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(MingoXDParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(MingoXDParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(MingoXDParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(MingoXDParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(MingoXDParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(MingoXDParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(MingoXDParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(MingoXDParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(MingoXDParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(MingoXDParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(MingoXDParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(MingoXDParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(MingoXDParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(MingoXDParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(MingoXDParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(MingoXDParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(MingoXDParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(MingoXDParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(MingoXDParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(MingoXDParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(MingoXDParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(MingoXDParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(MingoXDParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(MingoXDParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(MingoXDParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(MingoXDParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(MingoXDParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(MingoXDParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(MingoXDParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(MingoXDParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(MingoXDParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(MingoXDParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(MingoXDParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(MingoXDParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(MingoXDParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(MingoXDParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(MingoXDParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(MingoXDParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(MingoXDParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(MingoXDParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(MingoXDParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(MingoXDParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(MingoXDParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(MingoXDParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(MingoXDParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(MingoXDParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(MingoXDParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MingoXDParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(MingoXDParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(MingoXDParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(MingoXDParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(MingoXDParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MingoXDParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(MingoXDParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(MingoXDParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(MingoXDParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(MingoXDParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(MingoXDParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(MingoXDParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(MingoXDParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(MingoXDParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(MingoXDParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(MingoXDParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(MingoXDParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(MingoXDParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(MingoXDParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(MingoXDParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(MingoXDParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(MingoXDParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(MingoXDParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MingoXDParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(MingoXDParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(MingoXDParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(MingoXDParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(MingoXDParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(MingoXDParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(MingoXDParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(MingoXDParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(MingoXDParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(MingoXDParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(MingoXDParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(MingoXDParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(MingoXDParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(MingoXDParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MingoXDParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(MingoXDParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(MingoXDParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(MingoXDParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(MingoXDParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(MingoXDParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(MingoXDParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(MingoXDParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(MingoXDParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(MingoXDParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(MingoXDParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(MingoXDParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(MingoXDParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(MingoXDParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(MingoXDParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(MingoXDParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(MingoXDParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(MingoXDParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(MingoXDParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(MingoXDParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(MingoXDParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(MingoXDParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(MingoXDParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(MingoXDParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(MingoXDParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(MingoXDParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(MingoXDParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(MingoXDParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(MingoXDParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(MingoXDParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(MingoXDParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(MingoXDParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(MingoXDParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(MingoXDParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(MingoXDParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(MingoXDParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(MingoXDParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(MingoXDParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(MingoXDParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(MingoXDParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(MingoXDParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(MingoXDParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(MingoXDParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(MingoXDParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MingoXDParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(MingoXDParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(MingoXDParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(MingoXDParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(MingoXDParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(MingoXDParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MingoXDParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(MingoXDParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(MingoXDParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(MingoXDParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(MingoXDParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(MingoXDParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(MingoXDParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(MingoXDParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(MingoXDParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(MingoXDParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(MingoXDParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(MingoXDParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(MingoXDParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(MingoXDParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(MingoXDParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(MingoXDParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(MingoXDParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(MingoXDParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(MingoXDParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(MingoXDParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(MingoXDParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(MingoXDParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(MingoXDParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MingoXDParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(MingoXDParser.CastExpressionContext ctx);
}
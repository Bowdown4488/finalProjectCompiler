// Generated from C:/Users/Josh/IdeaProjects/CMPILER-MP\Java8.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Java8}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Java8Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Java8#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Java8.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(Java8.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(Java8.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(Java8.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(Java8.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(Java8.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(Java8.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(Java8.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(Java8.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(Java8.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(Java8.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(Java8.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(Java8.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(Java8.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(Java8.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(Java8.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(Java8.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(Java8.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(Java8.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(Java8.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(Java8.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(Java8.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(Java8.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(Java8.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(Java8.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(Java8.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(Java8.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(Java8.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(Java8.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(Java8.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(Java8.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(Java8.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(Java8.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(Java8.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(Java8.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(Java8.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(Java8.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(Java8.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(Java8.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(Java8.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(Java8.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(Java8.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(Java8.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(Java8.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(Java8.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(Java8.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(Java8.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(Java8.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(Java8.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(Java8.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(Java8.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(Java8.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(Java8.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(Java8.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(Java8.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(Java8.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(Java8.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(Java8.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(Java8.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(Java8.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(Java8.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(Java8.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(Java8.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(Java8.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(Java8.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(Java8.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(Java8.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(Java8.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(Java8.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(Java8.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(Java8.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(Java8.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(Java8.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(Java8.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(Java8.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(Java8.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(Java8.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(Java8.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(Java8.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(Java8.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(Java8.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(Java8.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(Java8.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(Java8.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(Java8.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(Java8.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(Java8.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(Java8.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(Java8.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(Java8.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(Java8.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(Java8.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(Java8.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(Java8.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(Java8.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(Java8.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(Java8.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(Java8.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(Java8.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(Java8.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(Java8.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(Java8.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(Java8.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(Java8.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(Java8.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(Java8.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(Java8.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(Java8.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(Java8.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(Java8.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(Java8.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(Java8.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(Java8.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(Java8.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(Java8.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(Java8.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(Java8.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(Java8.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(Java8.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(Java8.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(Java8.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(Java8.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(Java8.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(Java8.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(Java8.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Java8.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(Java8.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(Java8.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(Java8.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(Java8.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Java8.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(Java8.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(Java8.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(Java8.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(Java8.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(Java8.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(Java8.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(Java8.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(Java8.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(Java8.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(Java8.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(Java8.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(Java8.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(Java8.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(Java8.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(Java8.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(Java8.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(Java8.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Java8.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(Java8.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(Java8.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(Java8.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(Java8.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(Java8.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(Java8.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(Java8.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(Java8.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(Java8.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(Java8.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(Java8.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(Java8.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(Java8.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Java8.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(Java8.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(Java8.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(Java8.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(Java8.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(Java8.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(Java8.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(Java8.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(Java8.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(Java8.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(Java8.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(Java8.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(Java8.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Java8.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(Java8.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(Java8.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(Java8.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(Java8.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(Java8.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(Java8.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(Java8.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(Java8.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(Java8.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(Java8.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(Java8.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(Java8.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(Java8.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(Java8.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(Java8.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(Java8.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(Java8.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(Java8.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(Java8.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(Java8.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(Java8.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(Java8.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(Java8.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(Java8.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(Java8.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(Java8.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Java8.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(Java8.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(Java8.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(Java8.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(Java8.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(Java8.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Java8.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(Java8.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(Java8.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(Java8.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(Java8.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(Java8.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(Java8.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(Java8.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(Java8.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(Java8.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(Java8.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(Java8.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(Java8.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(Java8.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(Java8.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(Java8.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(Java8.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(Java8.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(Java8.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(Java8.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(Java8.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(Java8.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(Java8.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(Java8.CastExpressionContext ctx);
}
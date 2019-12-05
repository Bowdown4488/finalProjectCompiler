// Generated from C:/Users/Josh/IdeaProjects/CMPILER-MP\g.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(gParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(gParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(gParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(gParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(gParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(gParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(gParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(gParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(gParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(gParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(gParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(gParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(gParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(gParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(gParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(gParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(gParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(gParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(gParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(gParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(gParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(gParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(gParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(gParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(gParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(gParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(gParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(gParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(gParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(gParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(gParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(gParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(gParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(gParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(gParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(gParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(gParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(gParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(gParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(gParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(gParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(gParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(gParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(gParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(gParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(gParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(gParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(gParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(gParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(gParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(gParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(gParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(gParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(gParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(gParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(gParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(gParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(gParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(gParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(gParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(gParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(gParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(gParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(gParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(gParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(gParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(gParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(gParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(gParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(gParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(gParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(gParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(gParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(gParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(gParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(gParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(gParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(gParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(gParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(gParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(gParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(gParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(gParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(gParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(gParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(gParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(gParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(gParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(gParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(gParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(gParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(gParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(gParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(gParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(gParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(gParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(gParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(gParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(gParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(gParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(gParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(gParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(gParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(gParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(gParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(gParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(gParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(gParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(gParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(gParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(gParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(gParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(gParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(gParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(gParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(gParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(gParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(gParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(gParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(gParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(gParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(gParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(gParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(gParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(gParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(gParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(gParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(gParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(gParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(gParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(gParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(gParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(gParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(gParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(gParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(gParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(gParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(gParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(gParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(gParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(gParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(gParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(gParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(gParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(gParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(gParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(gParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(gParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(gParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(gParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(gParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(gParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(gParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(gParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(gParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(gParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(gParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(gParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(gParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(gParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(gParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(gParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(gParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(gParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(gParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(gParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(gParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(gParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(gParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(gParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(gParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(gParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(gParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(gParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(gParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(gParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(gParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(gParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(gParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(gParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(gParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(gParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(gParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(gParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(gParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(gParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(gParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(gParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(gParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(gParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(gParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(gParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(gParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(gParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(gParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(gParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(gParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(gParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(gParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(gParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(gParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(gParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(gParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(gParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(gParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(gParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(gParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(gParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(gParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(gParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(gParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(gParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(gParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(gParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(gParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(gParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(gParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(gParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(gParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(gParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(gParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(gParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(gParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(gParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(gParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(gParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(gParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(gParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(gParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(gParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(gParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(gParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(gParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(gParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(gParser.CastExpressionContext ctx);
}
// Generated from C:/Users/Josh/IdeaProjects/CMPILER-MP\Java8.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Java8}.
 */
public interface Java8Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Java8#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Java8.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Java8.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(Java8.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(Java8.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(Java8.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(Java8.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(Java8.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(Java8.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(Java8.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(Java8.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(Java8.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(Java8.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(Java8.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(Java8.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(Java8.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(Java8.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(Java8.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(Java8.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(Java8.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(Java8.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(Java8.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(Java8.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(Java8.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(Java8.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(Java8.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(Java8.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(Java8.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(Java8.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(Java8.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(Java8.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(Java8.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(Java8.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(Java8.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(Java8.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(Java8.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(Java8.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(Java8.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(Java8.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(Java8.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(Java8.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(Java8.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(Java8.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(Java8.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(Java8.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(Java8.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(Java8.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(Java8.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(Java8.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(Java8.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(Java8.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(Java8.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(Java8.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(Java8.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(Java8.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(Java8.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(Java8.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(Java8.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(Java8.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(Java8.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(Java8.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(Java8.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(Java8.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(Java8.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(Java8.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(Java8.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(Java8.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(Java8.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(Java8.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(Java8.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(Java8.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(Java8.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(Java8.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(Java8.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(Java8.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(Java8.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(Java8.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(Java8.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(Java8.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(Java8.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(Java8.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(Java8.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(Java8.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(Java8.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(Java8.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(Java8.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(Java8.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(Java8.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(Java8.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(Java8.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(Java8.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(Java8.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(Java8.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(Java8.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(Java8.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(Java8.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(Java8.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(Java8.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(Java8.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(Java8.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(Java8.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(Java8.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(Java8.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(Java8.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(Java8.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(Java8.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(Java8.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(Java8.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(Java8.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(Java8.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(Java8.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(Java8.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(Java8.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(Java8.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(Java8.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(Java8.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(Java8.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(Java8.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(Java8.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(Java8.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(Java8.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(Java8.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(Java8.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(Java8.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(Java8.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(Java8.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(Java8.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(Java8.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(Java8.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(Java8.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(Java8.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(Java8.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(Java8.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(Java8.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(Java8.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(Java8.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(Java8.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(Java8.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(Java8.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(Java8.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(Java8.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(Java8.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(Java8.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(Java8.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(Java8.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(Java8.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(Java8.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(Java8.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(Java8.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(Java8.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(Java8.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(Java8.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(Java8.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(Java8.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(Java8.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(Java8.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(Java8.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(Java8.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(Java8.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(Java8.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(Java8.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(Java8.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(Java8.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(Java8.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(Java8.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(Java8.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(Java8.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(Java8.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(Java8.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(Java8.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(Java8.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(Java8.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(Java8.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(Java8.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(Java8.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(Java8.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(Java8.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(Java8.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(Java8.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(Java8.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(Java8.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(Java8.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(Java8.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(Java8.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(Java8.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(Java8.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(Java8.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(Java8.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(Java8.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(Java8.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(Java8.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(Java8.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(Java8.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(Java8.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(Java8.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(Java8.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(Java8.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(Java8.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(Java8.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(Java8.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(Java8.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(Java8.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(Java8.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(Java8.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(Java8.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(Java8.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(Java8.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(Java8.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(Java8.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(Java8.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(Java8.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(Java8.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(Java8.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(Java8.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(Java8.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(Java8.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(Java8.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(Java8.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(Java8.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(Java8.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(Java8.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(Java8.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(Java8.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(Java8.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(Java8.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(Java8.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(Java8.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(Java8.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(Java8.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(Java8.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(Java8.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(Java8.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(Java8.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(Java8.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(Java8.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(Java8.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(Java8.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(Java8.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(Java8.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(Java8.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(Java8.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(Java8.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(Java8.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(Java8.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(Java8.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(Java8.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(Java8.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(Java8.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(Java8.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(Java8.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(Java8.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Java8.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Java8.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(Java8.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(Java8.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(Java8.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(Java8.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(Java8.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(Java8.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(Java8.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(Java8.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Java8.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Java8.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(Java8.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(Java8.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(Java8.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(Java8.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(Java8.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(Java8.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(Java8.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(Java8.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(Java8.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(Java8.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(Java8.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(Java8.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(Java8.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(Java8.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(Java8.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(Java8.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(Java8.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(Java8.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(Java8.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(Java8.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(Java8.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(Java8.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(Java8.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(Java8.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(Java8.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(Java8.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(Java8.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(Java8.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(Java8.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(Java8.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(Java8.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(Java8.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(Java8.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(Java8.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(Java8.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(Java8.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(Java8.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(Java8.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(Java8.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(Java8.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(Java8.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(Java8.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(Java8.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(Java8.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(Java8.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(Java8.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(Java8.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(Java8.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(Java8.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(Java8.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(Java8.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(Java8.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(Java8.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(Java8.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(Java8.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(Java8.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(Java8.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(Java8.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(Java8.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(Java8.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(Java8.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(Java8.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(Java8.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(Java8.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(Java8.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(Java8.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(Java8.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(Java8.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(Java8.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(Java8.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(Java8.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(Java8.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(Java8.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(Java8.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(Java8.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(Java8.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(Java8.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(Java8.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(Java8.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(Java8.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(Java8.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(Java8.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(Java8.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(Java8.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(Java8.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(Java8.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(Java8.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(Java8.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Java8.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Java8.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(Java8.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(Java8.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(Java8.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(Java8.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(Java8.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(Java8.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(Java8.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(Java8.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(Java8.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(Java8.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(Java8.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(Java8.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(Java8.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(Java8.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(Java8.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(Java8.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(Java8.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(Java8.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(Java8.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(Java8.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(Java8.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(Java8.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(Java8.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(Java8.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(Java8.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(Java8.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(Java8.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(Java8.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(Java8.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(Java8.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(Java8.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(Java8.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(Java8.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(Java8.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(Java8.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(Java8.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(Java8.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(Java8.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(Java8.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(Java8.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(Java8.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(Java8.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(Java8.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(Java8.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(Java8.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(Java8.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(Java8.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(Java8.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(Java8.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(Java8.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(Java8.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(Java8.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Java8.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Java8.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(Java8.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(Java8.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(Java8.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(Java8.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(Java8.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(Java8.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(Java8.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(Java8.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(Java8.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(Java8.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Java8.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Java8.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(Java8.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(Java8.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(Java8.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(Java8.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(Java8.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(Java8.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(Java8.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(Java8.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(Java8.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(Java8.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(Java8.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(Java8.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(Java8.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(Java8.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(Java8.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(Java8.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(Java8.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(Java8.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(Java8.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(Java8.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(Java8.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(Java8.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(Java8.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(Java8.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(Java8.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(Java8.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(Java8.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(Java8.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(Java8.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(Java8.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(Java8.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(Java8.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(Java8.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(Java8.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(Java8.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(Java8.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(Java8.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(Java8.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(Java8.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(Java8.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(Java8.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(Java8.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(Java8.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(Java8.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(Java8.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(Java8.CastExpressionContext ctx);
}
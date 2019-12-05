// Generated from C:/Users/Josh/IdeaProjects/CMPILER-MP\g.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(gParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(gParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(gParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(gParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(gParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(gParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(gParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(gParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(gParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(gParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(gParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(gParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(gParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(gParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(gParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(gParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(gParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(gParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(gParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(gParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(gParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(gParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(gParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(gParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(gParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(gParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(gParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(gParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(gParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(gParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(gParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(gParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(gParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(gParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(gParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(gParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(gParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(gParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(gParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(gParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(gParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(gParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(gParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(gParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(gParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(gParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(gParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(gParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(gParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(gParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(gParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(gParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(gParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(gParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(gParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(gParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(gParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(gParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(gParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(gParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(gParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(gParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(gParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(gParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(gParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(gParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(gParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(gParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(gParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(gParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(gParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(gParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(gParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(gParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(gParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(gParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(gParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(gParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(gParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(gParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(gParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(gParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(gParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(gParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(gParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(gParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(gParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(gParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(gParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(gParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(gParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(gParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(gParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(gParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(gParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(gParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(gParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(gParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(gParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(gParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(gParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(gParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(gParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(gParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(gParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(gParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(gParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(gParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(gParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(gParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(gParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(gParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(gParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(gParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(gParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(gParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(gParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(gParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(gParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(gParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(gParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(gParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(gParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(gParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(gParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(gParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(gParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(gParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(gParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(gParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(gParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(gParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(gParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(gParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(gParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(gParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(gParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(gParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(gParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(gParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(gParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(gParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(gParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(gParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(gParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(gParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(gParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(gParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(gParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(gParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(gParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(gParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(gParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(gParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(gParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(gParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(gParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(gParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(gParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(gParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(gParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(gParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(gParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(gParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(gParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(gParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(gParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(gParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(gParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(gParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(gParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(gParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(gParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(gParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(gParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(gParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(gParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(gParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(gParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(gParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(gParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(gParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(gParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(gParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(gParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(gParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(gParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(gParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(gParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(gParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(gParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(gParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(gParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(gParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(gParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(gParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(gParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(gParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(gParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(gParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(gParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(gParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(gParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(gParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(gParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(gParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(gParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(gParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(gParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(gParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(gParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(gParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(gParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(gParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(gParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(gParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(gParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(gParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(gParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(gParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(gParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(gParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(gParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(gParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(gParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(gParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(gParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(gParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(gParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(gParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(gParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(gParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(gParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(gParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(gParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(gParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(gParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(gParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(gParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(gParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(gParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(gParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(gParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(gParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(gParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(gParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(gParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(gParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(gParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(gParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(gParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(gParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(gParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(gParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(gParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(gParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(gParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(gParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(gParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(gParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(gParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(gParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(gParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(gParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(gParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(gParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(gParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(gParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(gParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(gParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(gParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(gParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(gParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(gParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(gParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(gParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(gParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(gParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(gParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(gParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(gParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(gParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(gParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(gParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(gParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(gParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(gParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(gParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(gParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(gParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(gParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(gParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(gParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(gParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(gParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(gParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(gParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(gParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(gParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(gParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(gParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(gParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(gParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(gParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(gParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(gParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(gParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(gParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(gParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(gParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(gParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(gParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(gParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(gParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(gParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(gParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(gParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(gParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(gParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(gParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(gParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(gParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(gParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(gParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(gParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(gParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(gParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(gParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(gParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(gParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(gParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(gParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(gParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(gParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(gParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(gParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(gParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(gParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(gParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(gParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(gParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(gParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(gParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(gParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(gParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(gParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(gParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(gParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(gParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(gParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(gParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(gParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(gParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(gParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(gParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(gParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(gParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(gParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(gParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(gParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(gParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(gParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(gParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(gParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(gParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(gParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(gParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(gParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(gParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(gParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(gParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(gParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(gParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(gParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(gParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(gParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(gParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(gParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(gParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(gParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(gParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(gParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(gParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(gParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(gParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(gParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(gParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(gParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(gParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(gParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(gParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(gParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(gParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(gParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(gParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(gParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(gParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(gParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(gParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(gParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(gParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(gParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(gParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(gParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(gParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(gParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(gParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(gParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(gParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(gParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(gParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(gParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(gParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(gParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(gParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(gParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(gParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(gParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(gParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(gParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(gParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(gParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(gParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(gParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(gParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(gParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(gParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(gParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(gParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(gParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(gParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(gParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(gParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(gParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(gParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(gParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(gParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(gParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(gParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(gParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(gParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(gParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(gParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(gParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(gParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(gParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(gParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(gParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(gParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(gParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(gParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(gParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(gParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(gParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(gParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(gParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(gParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(gParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(gParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(gParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(gParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(gParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(gParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(gParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(gParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(gParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(gParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(gParser.CastExpressionContext ctx);
}
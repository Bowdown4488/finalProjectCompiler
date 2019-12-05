// Generated from /home/athena/GitRepo/CMPILER-MP/MingoXD/src/Main/MingoXD.g4 by ANTLR 4.7.2
package Main;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MingoXDParser}.
 */
public interface MingoXDListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#run}.
	 * @param ctx the parse tree
	 */
	void enterRun(MingoXDParser.RunContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#run}.
	 * @param ctx the parse tree
	 */
	void exitRun(MingoXDParser.RunContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MingoXDParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MingoXDParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(MingoXDParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(MingoXDParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(MingoXDParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(MingoXDParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(MingoXDParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(MingoXDParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(MingoXDParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(MingoXDParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(MingoXDParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(MingoXDParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(MingoXDParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(MingoXDParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(MingoXDParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(MingoXDParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(MingoXDParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(MingoXDParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(MingoXDParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(MingoXDParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(MingoXDParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(MingoXDParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(MingoXDParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(MingoXDParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(MingoXDParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(MingoXDParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(MingoXDParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(MingoXDParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(MingoXDParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(MingoXDParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(MingoXDParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(MingoXDParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(MingoXDParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(MingoXDParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(MingoXDParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(MingoXDParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(MingoXDParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(MingoXDParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(MingoXDParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(MingoXDParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(MingoXDParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(MingoXDParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(MingoXDParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(MingoXDParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(MingoXDParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(MingoXDParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(MingoXDParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(MingoXDParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(MingoXDParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(MingoXDParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(MingoXDParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(MingoXDParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(MingoXDParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(MingoXDParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(MingoXDParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(MingoXDParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(MingoXDParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(MingoXDParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(MingoXDParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(MingoXDParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(MingoXDParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(MingoXDParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(MingoXDParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(MingoXDParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(MingoXDParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(MingoXDParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(MingoXDParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(MingoXDParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(MingoXDParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(MingoXDParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(MingoXDParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(MingoXDParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(MingoXDParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(MingoXDParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(MingoXDParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(MingoXDParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(MingoXDParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(MingoXDParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MingoXDParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MingoXDParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(MingoXDParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(MingoXDParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(MingoXDParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(MingoXDParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(MingoXDParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(MingoXDParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(MingoXDParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(MingoXDParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(MingoXDParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(MingoXDParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(MingoXDParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(MingoXDParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(MingoXDParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(MingoXDParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(MingoXDParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(MingoXDParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(MingoXDParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(MingoXDParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(MingoXDParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(MingoXDParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(MingoXDParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(MingoXDParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(MingoXDParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(MingoXDParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(MingoXDParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(MingoXDParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(MingoXDParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(MingoXDParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(MingoXDParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(MingoXDParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(MingoXDParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(MingoXDParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(MingoXDParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(MingoXDParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(MingoXDParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(MingoXDParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(MingoXDParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(MingoXDParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(MingoXDParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(MingoXDParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(MingoXDParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(MingoXDParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(MingoXDParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(MingoXDParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(MingoXDParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(MingoXDParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(MingoXDParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(MingoXDParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(MingoXDParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(MingoXDParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(MingoXDParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(MingoXDParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(MingoXDParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(MingoXDParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(MingoXDParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(MingoXDParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MingoXDParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MingoXDParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(MingoXDParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(MingoXDParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(MingoXDParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(MingoXDParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(MingoXDParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(MingoXDParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(MingoXDParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(MingoXDParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(MingoXDParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(MingoXDParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(MingoXDParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(MingoXDParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(MingoXDParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(MingoXDParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(MingoXDParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(MingoXDParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(MingoXDParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(MingoXDParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(MingoXDParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(MingoXDParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(MingoXDParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(MingoXDParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(MingoXDParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(MingoXDParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(MingoXDParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(MingoXDParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(MingoXDParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(MingoXDParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(MingoXDParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(MingoXDParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(MingoXDParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(MingoXDParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(MingoXDParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(MingoXDParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(MingoXDParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(MingoXDParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(MingoXDParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(MingoXDParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(MingoXDParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(MingoXDParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(MingoXDParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(MingoXDParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(MingoXDParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(MingoXDParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(MingoXDParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(MingoXDParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(MingoXDParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(MingoXDParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(MingoXDParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(MingoXDParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(MingoXDParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(MingoXDParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(MingoXDParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(MingoXDParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(MingoXDParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(MingoXDParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(MingoXDParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(MingoXDParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(MingoXDParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(MingoXDParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(MingoXDParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(MingoXDParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(MingoXDParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(MingoXDParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(MingoXDParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(MingoXDParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(MingoXDParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(MingoXDParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(MingoXDParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(MingoXDParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(MingoXDParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(MingoXDParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(MingoXDParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(MingoXDParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(MingoXDParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(MingoXDParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(MingoXDParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(MingoXDParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(MingoXDParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(MingoXDParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(MingoXDParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(MingoXDParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(MingoXDParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(MingoXDParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(MingoXDParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(MingoXDParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(MingoXDParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(MingoXDParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(MingoXDParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(MingoXDParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(MingoXDParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(MingoXDParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(MingoXDParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(MingoXDParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(MingoXDParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(MingoXDParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(MingoXDParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(MingoXDParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(MingoXDParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(MingoXDParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(MingoXDParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(MingoXDParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(MingoXDParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(MingoXDParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(MingoXDParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(MingoXDParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(MingoXDParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(MingoXDParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(MingoXDParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(MingoXDParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MingoXDParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MingoXDParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(MingoXDParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(MingoXDParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(MingoXDParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(MingoXDParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(MingoXDParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(MingoXDParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(MingoXDParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(MingoXDParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MingoXDParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MingoXDParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(MingoXDParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(MingoXDParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(MingoXDParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(MingoXDParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(MingoXDParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(MingoXDParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(MingoXDParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(MingoXDParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(MingoXDParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(MingoXDParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(MingoXDParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(MingoXDParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(MingoXDParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(MingoXDParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(MingoXDParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(MingoXDParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(MingoXDParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(MingoXDParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(MingoXDParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(MingoXDParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(MingoXDParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(MingoXDParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(MingoXDParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(MingoXDParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(MingoXDParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(MingoXDParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(MingoXDParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(MingoXDParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(MingoXDParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(MingoXDParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(MingoXDParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(MingoXDParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(MingoXDParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(MingoXDParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MingoXDParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MingoXDParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(MingoXDParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(MingoXDParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(MingoXDParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(MingoXDParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MingoXDParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MingoXDParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(MingoXDParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(MingoXDParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(MingoXDParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(MingoXDParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(MingoXDParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(MingoXDParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(MingoXDParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(MingoXDParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(MingoXDParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(MingoXDParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(MingoXDParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(MingoXDParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(MingoXDParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(MingoXDParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(MingoXDParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(MingoXDParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(MingoXDParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(MingoXDParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(MingoXDParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(MingoXDParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MingoXDParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MingoXDParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(MingoXDParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(MingoXDParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(MingoXDParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(MingoXDParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(MingoXDParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(MingoXDParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(MingoXDParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(MingoXDParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(MingoXDParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(MingoXDParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(MingoXDParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(MingoXDParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(MingoXDParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(MingoXDParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(MingoXDParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(MingoXDParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(MingoXDParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(MingoXDParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(MingoXDParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(MingoXDParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(MingoXDParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(MingoXDParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(MingoXDParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(MingoXDParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(MingoXDParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(MingoXDParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(MingoXDParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(MingoXDParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(MingoXDParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(MingoXDParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(MingoXDParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(MingoXDParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(MingoXDParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(MingoXDParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(MingoXDParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(MingoXDParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(MingoXDParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(MingoXDParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(MingoXDParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(MingoXDParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(MingoXDParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(MingoXDParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(MingoXDParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(MingoXDParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(MingoXDParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(MingoXDParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(MingoXDParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(MingoXDParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(MingoXDParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(MingoXDParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(MingoXDParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(MingoXDParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(MingoXDParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(MingoXDParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(MingoXDParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(MingoXDParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(MingoXDParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(MingoXDParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(MingoXDParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(MingoXDParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(MingoXDParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(MingoXDParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(MingoXDParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(MingoXDParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(MingoXDParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(MingoXDParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(MingoXDParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(MingoXDParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(MingoXDParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(MingoXDParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(MingoXDParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(MingoXDParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(MingoXDParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(MingoXDParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(MingoXDParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(MingoXDParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(MingoXDParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(MingoXDParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(MingoXDParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(MingoXDParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(MingoXDParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(MingoXDParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(MingoXDParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(MingoXDParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(MingoXDParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(MingoXDParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MingoXDParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MingoXDParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(MingoXDParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(MingoXDParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(MingoXDParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(MingoXDParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(MingoXDParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(MingoXDParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(MingoXDParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(MingoXDParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(MingoXDParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(MingoXDParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MingoXDParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MingoXDParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(MingoXDParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(MingoXDParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(MingoXDParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(MingoXDParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(MingoXDParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(MingoXDParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(MingoXDParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(MingoXDParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(MingoXDParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(MingoXDParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(MingoXDParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(MingoXDParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(MingoXDParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(MingoXDParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(MingoXDParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(MingoXDParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(MingoXDParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(MingoXDParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(MingoXDParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(MingoXDParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(MingoXDParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(MingoXDParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(MingoXDParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(MingoXDParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(MingoXDParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(MingoXDParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(MingoXDParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(MingoXDParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(MingoXDParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(MingoXDParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(MingoXDParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(MingoXDParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(MingoXDParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(MingoXDParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(MingoXDParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(MingoXDParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(MingoXDParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(MingoXDParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(MingoXDParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(MingoXDParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(MingoXDParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(MingoXDParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(MingoXDParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(MingoXDParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MingoXDParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(MingoXDParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MingoXDParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(MingoXDParser.CastExpressionContext ctx);
}
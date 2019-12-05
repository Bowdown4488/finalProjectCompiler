// Generated from /home/athena/GitRepo/CMPILER-MP/MingoXD/src/Main/AiRingoParser.g4 by ANTLR 4.7.2
package Main;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AiRingoParser}.
 */
public interface AiRingoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#run}.
	 * @param ctx the parse tree
	 */
	void enterRun(AiRingoParser.RunContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#run}.
	 * @param ctx the parse tree
	 */
	void exitRun(AiRingoParser.RunContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AiRingoParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AiRingoParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(AiRingoParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(AiRingoParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(AiRingoParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(AiRingoParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(AiRingoParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(AiRingoParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(AiRingoParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(AiRingoParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(AiRingoParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(AiRingoParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(AiRingoParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(AiRingoParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(AiRingoParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(AiRingoParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(AiRingoParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(AiRingoParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(AiRingoParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(AiRingoParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(AiRingoParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(AiRingoParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(AiRingoParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(AiRingoParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(AiRingoParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(AiRingoParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(AiRingoParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(AiRingoParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(AiRingoParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(AiRingoParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(AiRingoParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(AiRingoParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(AiRingoParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(AiRingoParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(AiRingoParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(AiRingoParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(AiRingoParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(AiRingoParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(AiRingoParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(AiRingoParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(AiRingoParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(AiRingoParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(AiRingoParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(AiRingoParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(AiRingoParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(AiRingoParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(AiRingoParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(AiRingoParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(AiRingoParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(AiRingoParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(AiRingoParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(AiRingoParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(AiRingoParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(AiRingoParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(AiRingoParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(AiRingoParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(AiRingoParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(AiRingoParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(AiRingoParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(AiRingoParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(AiRingoParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(AiRingoParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(AiRingoParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(AiRingoParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(AiRingoParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(AiRingoParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(AiRingoParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(AiRingoParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(AiRingoParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(AiRingoParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(AiRingoParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(AiRingoParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(AiRingoParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(AiRingoParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(AiRingoParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(AiRingoParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(AiRingoParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(AiRingoParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AiRingoParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AiRingoParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(AiRingoParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(AiRingoParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(AiRingoParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(AiRingoParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(AiRingoParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(AiRingoParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(AiRingoParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(AiRingoParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(AiRingoParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(AiRingoParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(AiRingoParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(AiRingoParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(AiRingoParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(AiRingoParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AiRingoParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AiRingoParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(AiRingoParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(AiRingoParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(AiRingoParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(AiRingoParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(AiRingoParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(AiRingoParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(AiRingoParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(AiRingoParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(AiRingoParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(AiRingoParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(AiRingoParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(AiRingoParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(AiRingoParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(AiRingoParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(AiRingoParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(AiRingoParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(AiRingoParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(AiRingoParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(AiRingoParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(AiRingoParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(AiRingoParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(AiRingoParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(AiRingoParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(AiRingoParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(AiRingoParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(AiRingoParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(AiRingoParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(AiRingoParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(AiRingoParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(AiRingoParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(AiRingoParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(AiRingoParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(AiRingoParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(AiRingoParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(AiRingoParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(AiRingoParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(AiRingoParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(AiRingoParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(AiRingoParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(AiRingoParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AiRingoParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AiRingoParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(AiRingoParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(AiRingoParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(AiRingoParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(AiRingoParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(AiRingoParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(AiRingoParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(AiRingoParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(AiRingoParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(AiRingoParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(AiRingoParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(AiRingoParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(AiRingoParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(AiRingoParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(AiRingoParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(AiRingoParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(AiRingoParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(AiRingoParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(AiRingoParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(AiRingoParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(AiRingoParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(AiRingoParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(AiRingoParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(AiRingoParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(AiRingoParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(AiRingoParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(AiRingoParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(AiRingoParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(AiRingoParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(AiRingoParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(AiRingoParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(AiRingoParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(AiRingoParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(AiRingoParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(AiRingoParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(AiRingoParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(AiRingoParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(AiRingoParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(AiRingoParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(AiRingoParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(AiRingoParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(AiRingoParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(AiRingoParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(AiRingoParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(AiRingoParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(AiRingoParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(AiRingoParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(AiRingoParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(AiRingoParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(AiRingoParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(AiRingoParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(AiRingoParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(AiRingoParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(AiRingoParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(AiRingoParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(AiRingoParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(AiRingoParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(AiRingoParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(AiRingoParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(AiRingoParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(AiRingoParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(AiRingoParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(AiRingoParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(AiRingoParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(AiRingoParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(AiRingoParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(AiRingoParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(AiRingoParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(AiRingoParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(AiRingoParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(AiRingoParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(AiRingoParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(AiRingoParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(AiRingoParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(AiRingoParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(AiRingoParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(AiRingoParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(AiRingoParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(AiRingoParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(AiRingoParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(AiRingoParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(AiRingoParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(AiRingoParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(AiRingoParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(AiRingoParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(AiRingoParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(AiRingoParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(AiRingoParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(AiRingoParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(AiRingoParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(AiRingoParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(AiRingoParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(AiRingoParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(AiRingoParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(AiRingoParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(AiRingoParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(AiRingoParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(AiRingoParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(AiRingoParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(AiRingoParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(AiRingoParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(AiRingoParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(AiRingoParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(AiRingoParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(AiRingoParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(AiRingoParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(AiRingoParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(AiRingoParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(AiRingoParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(AiRingoParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(AiRingoParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AiRingoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AiRingoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(AiRingoParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(AiRingoParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(AiRingoParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(AiRingoParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(AiRingoParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(AiRingoParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(AiRingoParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(AiRingoParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AiRingoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AiRingoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(AiRingoParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(AiRingoParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(AiRingoParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(AiRingoParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(AiRingoParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(AiRingoParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(AiRingoParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(AiRingoParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(AiRingoParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(AiRingoParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(AiRingoParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(AiRingoParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(AiRingoParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(AiRingoParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(AiRingoParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(AiRingoParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(AiRingoParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(AiRingoParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(AiRingoParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(AiRingoParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(AiRingoParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(AiRingoParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(AiRingoParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(AiRingoParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(AiRingoParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(AiRingoParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(AiRingoParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(AiRingoParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(AiRingoParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(AiRingoParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(AiRingoParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(AiRingoParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(AiRingoParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(AiRingoParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AiRingoParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AiRingoParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(AiRingoParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(AiRingoParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(AiRingoParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(AiRingoParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(AiRingoParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(AiRingoParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(AiRingoParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(AiRingoParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(AiRingoParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(AiRingoParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(AiRingoParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(AiRingoParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(AiRingoParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(AiRingoParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(AiRingoParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(AiRingoParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(AiRingoParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(AiRingoParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(AiRingoParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(AiRingoParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(AiRingoParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(AiRingoParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(AiRingoParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(AiRingoParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(AiRingoParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(AiRingoParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AiRingoParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AiRingoParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(AiRingoParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(AiRingoParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(AiRingoParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(AiRingoParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(AiRingoParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(AiRingoParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(AiRingoParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(AiRingoParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(AiRingoParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(AiRingoParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(AiRingoParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(AiRingoParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(AiRingoParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(AiRingoParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(AiRingoParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(AiRingoParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(AiRingoParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(AiRingoParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(AiRingoParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(AiRingoParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(AiRingoParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(AiRingoParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(AiRingoParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(AiRingoParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(AiRingoParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(AiRingoParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(AiRingoParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(AiRingoParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(AiRingoParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(AiRingoParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(AiRingoParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(AiRingoParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(AiRingoParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(AiRingoParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(AiRingoParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(AiRingoParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(AiRingoParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(AiRingoParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(AiRingoParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(AiRingoParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(AiRingoParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(AiRingoParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(AiRingoParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(AiRingoParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(AiRingoParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(AiRingoParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(AiRingoParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(AiRingoParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(AiRingoParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(AiRingoParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(AiRingoParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(AiRingoParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(AiRingoParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(AiRingoParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(AiRingoParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(AiRingoParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(AiRingoParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(AiRingoParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(AiRingoParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(AiRingoParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(AiRingoParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(AiRingoParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(AiRingoParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(AiRingoParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(AiRingoParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(AiRingoParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(AiRingoParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(AiRingoParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(AiRingoParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(AiRingoParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(AiRingoParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(AiRingoParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(AiRingoParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(AiRingoParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(AiRingoParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(AiRingoParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(AiRingoParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(AiRingoParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(AiRingoParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(AiRingoParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(AiRingoParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(AiRingoParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(AiRingoParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(AiRingoParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(AiRingoParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(AiRingoParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AiRingoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AiRingoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(AiRingoParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(AiRingoParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(AiRingoParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(AiRingoParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(AiRingoParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(AiRingoParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(AiRingoParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(AiRingoParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(AiRingoParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(AiRingoParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AiRingoParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AiRingoParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(AiRingoParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(AiRingoParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(AiRingoParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(AiRingoParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(AiRingoParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(AiRingoParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(AiRingoParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(AiRingoParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(AiRingoParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(AiRingoParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(AiRingoParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(AiRingoParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(AiRingoParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(AiRingoParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(AiRingoParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(AiRingoParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(AiRingoParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(AiRingoParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(AiRingoParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(AiRingoParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(AiRingoParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(AiRingoParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(AiRingoParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(AiRingoParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(AiRingoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(AiRingoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(AiRingoParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(AiRingoParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(AiRingoParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(AiRingoParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(AiRingoParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(AiRingoParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(AiRingoParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(AiRingoParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(AiRingoParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(AiRingoParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(AiRingoParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(AiRingoParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(AiRingoParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(AiRingoParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(AiRingoParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(AiRingoParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(AiRingoParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(AiRingoParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AiRingoParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(AiRingoParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AiRingoParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(AiRingoParser.CastExpressionContext ctx);
}
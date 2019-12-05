// Generated from /home/athena/GitRepo/CMPILER-MP/MingoXD/src/Main/MingoXD.g4 by ANTLR 4.7.2
package Main;
import Main.evalex.Expression;
import bsh.EvalError;
import bsh.Interpreter;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * This class provides an empty implementation of {@link MingoXDVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class MingoXDInterpreter<T> extends AbstractParseTreeVisitor<T> implements MingoXDVisitor<T> {
    final String PRINT = "output";
    final String PRINTLN = "outputln";
    final String INPUT = "input";

    class Value {
        final Object value;
        boolean isVariable;

        public Value(Object value){
            this.value = value;
            this.isVariable = false;
        }

        public BigDecimal asNumber(){
            return (BigDecimal) value;
        }

        public String asString(){
            if(value instanceof BigDecimal){
                return ((BigDecimal) value).toPlainString();
            }
            return (String) value;
        }

        public String asPrintString(){
            String oldString = (String) value;
            String newString = (oldString).substring(1,oldString.length()-1);
            return newString;
        }

        public boolean isNumber() {
            return value instanceof BigDecimal;
        }

        public boolean isString() {
            return value instanceof String;
        }

    }

    class Function{
        String functionName;
        Object functionParameters;
        Object functionBody;

        public Function(String functionName){
            this.functionName = functionName;
        }
    }

    class Class{
        String className;
        Map<String, MingoXDInterpreter.Value> classSpace = new HashMap<>();
        Object classFields;
        Object classMethods;

        public Class(String className){
            this.className = className;
        }
    }

    private Map<String, Value> globalVariables = new HashMap<String, Value>();
    private Stack<Map<String, Value>> localVariableStack = new Stack();
    private Map<String, Function> globalFunctions = new HashMap<String, Function>();
    private Map<String, Class> globalClasses = new HashMap<String, Class>();

    inputFrame frame;
    String srccode;

    public MingoXDInterpreter(inputFrame frame, String srccode){
        this.frame = frame;
        this.srccode = srccode;
    }

    public T evalExp(Expression exp, ParserRuleContext ctx){
        Value result;
        try {
            List<String> variables = exp.getUsedVariables();
            for (int i = 0; i < variables.size(); i++) {
                try{
                    exp.setVariable(variables.get(i),globalVariables.get(variables.get(i)).asNumber());
                }catch(NullPointerException e){
                }
            }
            if(!localVariableStack.isEmpty()){
                for (int i = 0; i < variables.size(); i++) {
                    try{
                        exp.setVariable(variables.get(i),localVariableStack.peek().get(variables.get(i)).asNumber());
                    }catch(NullPointerException e){
                    }
                }
            }
            result = new Value(exp.eval());
        }catch(Exception e){
//		    System.out.println("["+ctx.getText()+"]" + "Evalex not successful. Exploring children.");
            Value val = (Value) visitChildren(ctx);
            return (T) val;
        }
        return (T) result;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    @Override public T visitRun(MingoXDParser.RunContext ctx) {
        final ByteArrayOutputStream pBaos = new ByteArrayOutputStream();
        final ByteArrayOutputStream eBaos = new ByteArrayOutputStream();
        try {
            PrintStream ps = new PrintStream(pBaos, true, "UTF-8");
            PrintStream eps = new PrintStream(eBaos, true, "UTF-8");
            Interpreter bsh = new Interpreter();
            try {
                bsh.setOut(ps);
                bsh.setErr(eps);
                ctx.removeLastChild();
                bsh.eval(srccode);
//				NameSpace nm = bsh.getNameSpace();
//				String globalVariablesString = "";
//				String[] variables = nm.getAllNames();
//				for(int i = 0 ; i < variables.length ; i++){
//					if(!variables[i].equals("bsh") && !variables[i].equals("print") && !variables[i].equals("println"))
//						globalVariablesString += variables[i] + " : " + nm.getVariable(variables[i]) + "\n";
//				}
                String output = new String(pBaos.toByteArray(), StandardCharsets.UTF_8);
                String errors = new String(eBaos.toByteArray(), StandardCharsets.UTF_8);
                frame.printOutput(output);
                frame.printError(errors);
//				frame.printVariables(globalVariablesString);
            } catch (EvalError evalError) {
                frame.printError(evalError.getMessage());
                evalError.printStackTrace();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLiteral(MingoXDParser.LiteralContext ctx) {
        return (T) new Value(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimitiveType(MingoXDParser.PrimitiveTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitNumericType(MingoXDParser.NumericTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitIntegralType(MingoXDParser.IntegralTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFloatingPointType(MingoXDParser.FloatingPointTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitReferenceType(MingoXDParser.ReferenceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassOrInterfaceType(MingoXDParser.ClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassType(MingoXDParser.ClassTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassType_lf_classOrInterfaceType(MingoXDParser.ClassType_lf_classOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassType_lfno_classOrInterfaceType(MingoXDParser.ClassType_lfno_classOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceType(MingoXDParser.InterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceType_lf_classOrInterfaceType(MingoXDParser.InterfaceType_lf_classOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceType_lfno_classOrInterfaceType(MingoXDParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeVariable(MingoXDParser.TypeVariableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArrayType(MingoXDParser.ArrayTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitDims(MingoXDParser.DimsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeParameter(MingoXDParser.TypeParameterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeParameterModifier(MingoXDParser.TypeParameterModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeBound(MingoXDParser.TypeBoundContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAdditionalBound(MingoXDParser.AdditionalBoundContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeArguments(MingoXDParser.TypeArgumentsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeArgumentList(MingoXDParser.TypeArgumentListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeArgument(MingoXDParser.TypeArgumentContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitWildcard(MingoXDParser.WildcardContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitWildcardBounds(MingoXDParser.WildcardBoundsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPackageName(MingoXDParser.PackageNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeName(MingoXDParser.TypeNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPackageOrTypeName(MingoXDParser.PackageOrTypeNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExpressionName(MingoXDParser.ExpressionNameContext ctx) {
        Value val = new Value(ctx.getText());
        val.isVariable = true;
        return (T) val;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodName(MingoXDParser.MethodNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAmbiguousName(MingoXDParser.AmbiguousNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPackageDeclaration(MingoXDParser.PackageDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPackageModifier(MingoXDParser.PackageModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitImportDeclaration(MingoXDParser.ImportDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSingleTypeImportDeclaration(MingoXDParser.SingleTypeImportDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeImportOnDemandDeclaration(MingoXDParser.TypeImportOnDemandDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSingleStaticImportDeclaration(MingoXDParser.SingleStaticImportDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStaticImportOnDemandDeclaration(MingoXDParser.StaticImportOnDemandDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeDeclaration(MingoXDParser.TypeDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassDeclaration(MingoXDParser.ClassDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitNormalClassDeclaration(MingoXDParser.NormalClassDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassModifier(MingoXDParser.ClassModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeParameters(MingoXDParser.TypeParametersContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeParameterList(MingoXDParser.TypeParameterListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSuperclass(MingoXDParser.SuperclassContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSuperinterfaces(MingoXDParser.SuperinterfacesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceTypeList(MingoXDParser.InterfaceTypeListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassBody(MingoXDParser.ClassBodyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassBodyDeclaration(MingoXDParser.ClassBodyDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassMemberDeclaration(MingoXDParser.ClassMemberDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFieldDeclaration(MingoXDParser.FieldDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFieldModifier(MingoXDParser.FieldModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitVariableDeclaratorList(MingoXDParser.VariableDeclaratorListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitVariableDeclarator(MingoXDParser.VariableDeclaratorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitVariableDeclaratorId(MingoXDParser.VariableDeclaratorIdContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitVariableInitializer(MingoXDParser.VariableInitializerContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannType(MingoXDParser.UnannTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannPrimitiveType(MingoXDParser.UnannPrimitiveTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannReferenceType(MingoXDParser.UnannReferenceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannClassOrInterfaceType(MingoXDParser.UnannClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannClassType(MingoXDParser.UnannClassTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannClassType_lf_unannClassOrInterfaceType(MingoXDParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannClassType_lfno_unannClassOrInterfaceType(MingoXDParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannInterfaceType(MingoXDParser.UnannInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannInterfaceType_lf_unannClassOrInterfaceType(MingoXDParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(MingoXDParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannTypeVariable(MingoXDParser.UnannTypeVariableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannArrayType(MingoXDParser.UnannArrayTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodDeclaration(MingoXDParser.MethodDeclarationContext ctx) {
        Function func = (Function) visit(ctx.methodHeader());
        func.functionBody = ctx.methodBody();
        globalFunctions.put(func.functionName, func);
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodModifier(MingoXDParser.MethodModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodHeader(MingoXDParser.MethodHeaderContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitResult(MingoXDParser.ResultContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodDeclarator(MingoXDParser.MethodDeclaratorContext ctx) {
        Function func = new Function(ctx.getChild(0).getText());
        if(ctx.formalParameterList() != null){
            func.functionParameters = visit(ctx.formalParameterList());
        }
        return (T) func;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFormalParameterList(MingoXDParser.FormalParameterListContext ctx) {
        ArrayList<String> parameters = new ArrayList<>();
        for(int i = 0 ; i < ctx.getChildCount() ; i++){
            parameters.add(ctx.getChild(i).getText());
        }
        return (T) parameters;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFormalParameters(MingoXDParser.FormalParametersContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFormalParameter(MingoXDParser.FormalParameterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitVariableModifier(MingoXDParser.VariableModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLastFormalParameter(MingoXDParser.LastFormalParameterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitReceiverParameter(MingoXDParser.ReceiverParameterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitThrows_(MingoXDParser.Throws_Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExceptionTypeList(MingoXDParser.ExceptionTypeListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExceptionType(MingoXDParser.ExceptionTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodBody(MingoXDParser.MethodBodyContext ctx) {
        Value returnVal = (Value)visit(ctx.block());
//		localVariableStack.pop();
        return (T) returnVal;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInstanceInitializer(MingoXDParser.InstanceInitializerContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStaticInitializer(MingoXDParser.StaticInitializerContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConstructorDeclaration(MingoXDParser.ConstructorDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConstructorModifier(MingoXDParser.ConstructorModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConstructorDeclarator(MingoXDParser.ConstructorDeclaratorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSimpleTypeName(MingoXDParser.SimpleTypeNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConstructorBody(MingoXDParser.ConstructorBodyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExplicitConstructorInvocation(MingoXDParser.ExplicitConstructorInvocationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnumDeclaration(MingoXDParser.EnumDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnumBody(MingoXDParser.EnumBodyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnumConstantList(MingoXDParser.EnumConstantListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnumConstant(MingoXDParser.EnumConstantContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnumConstantModifier(MingoXDParser.EnumConstantModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnumBodyDeclarations(MingoXDParser.EnumBodyDeclarationsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceDeclaration(MingoXDParser.InterfaceDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitNormalInterfaceDeclaration(MingoXDParser.NormalInterfaceDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceModifier(MingoXDParser.InterfaceModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExtendsInterfaces(MingoXDParser.ExtendsInterfacesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceBody(MingoXDParser.InterfaceBodyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceMemberDeclaration(MingoXDParser.InterfaceMemberDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConstantDeclaration(MingoXDParser.ConstantDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConstantModifier(MingoXDParser.ConstantModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceMethodDeclaration(MingoXDParser.InterfaceMethodDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceMethodModifier(MingoXDParser.InterfaceMethodModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAnnotationTypeDeclaration(MingoXDParser.AnnotationTypeDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAnnotationTypeBody(MingoXDParser.AnnotationTypeBodyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAnnotationTypeMemberDeclaration(MingoXDParser.AnnotationTypeMemberDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAnnotationTypeElementDeclaration(MingoXDParser.AnnotationTypeElementDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAnnotationTypeElementModifier(MingoXDParser.AnnotationTypeElementModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitDefaultValue(MingoXDParser.DefaultValueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAnnotation(MingoXDParser.AnnotationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitNormalAnnotation(MingoXDParser.NormalAnnotationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitElementValuePairList(MingoXDParser.ElementValuePairListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitElementValuePair(MingoXDParser.ElementValuePairContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitElementValue(MingoXDParser.ElementValueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitElementValueArrayInitializer(MingoXDParser.ElementValueArrayInitializerContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitElementValueList(MingoXDParser.ElementValueListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMarkerAnnotation(MingoXDParser.MarkerAnnotationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSingleElementAnnotation(MingoXDParser.SingleElementAnnotationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArrayInitializer(MingoXDParser.ArrayInitializerContext ctx) {
        return visit(ctx.variableInitializerList());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitVariableInitializerList(MingoXDParser.VariableInitializerListContext ctx) {
        ArrayList<Value> values = new ArrayList<>();
        for(int i = 0 ; i < ctx.getChildCount() ; i += 2){
            values.add(new Value(ctx.getChild(i).getText()));
        }
        return (T) new Value(values);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitBlock(MingoXDParser.BlockContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitBlockStatements(MingoXDParser.BlockStatementsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitBlockStatement(MingoXDParser.BlockStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLocalVariableDeclarationStatement(MingoXDParser.LocalVariableDeclarationStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLocalVariableDeclaration(MingoXDParser.LocalVariableDeclarationContext ctx) {
        if(ctx.variableModifier().size() > 0){

        }
        String id = ctx.variableDeclaratorList().variableDeclarator(0).variableDeclaratorId().getText();
        Value val = (Value) visit(ctx.variableDeclaratorList().variableDeclarator(0).variableInitializer());
        if(val.isVariable){
            val = globalVariables.get(val.asString());
            if(!localVariableStack.isEmpty())
                try{
                    val = localVariableStack.peek().get(val.asString());
                }catch(NullPointerException e){
                }
        }
        if(!localVariableStack.isEmpty()){
            if(localVariableStack.peek().containsKey(id)){
                return (T) localVariableStack.peek().put(id, val);
            }else{
                if(!globalVariables.containsKey(id)){
                    return (T) localVariableStack.peek().put(id, val);
                }
            }
        }
        return (T) globalVariables.put(id, val);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStatement(MingoXDParser.StatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStatementNoShortIf(MingoXDParser.StatementNoShortIfContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStatementWithoutTrailingSubstatement(MingoXDParser.StatementWithoutTrailingSubstatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEmptyStatement(MingoXDParser.EmptyStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLabeledStatement(MingoXDParser.LabeledStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLabeledStatementNoShortIf(MingoXDParser.LabeledStatementNoShortIfContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExpressionStatement(MingoXDParser.ExpressionStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStatementExpression(MingoXDParser.StatementExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitIfThenStatement(MingoXDParser.IfThenStatementContext ctx) {
        if(((Value) visit(ctx.expression())).asNumber().intValue() > 0){
            return visit(ctx.statement());
        }
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitIfThenElseStatement(MingoXDParser.IfThenElseStatementContext ctx) {
        if(((Value) visit(ctx.expression())).asNumber().intValue() > 0){
            return visit(ctx.statementNoShortIf());
        }else{
            return visit(ctx.statement());
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitIfThenElseStatementNoShortIf(MingoXDParser.IfThenElseStatementNoShortIfContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAssertStatement(MingoXDParser.AssertStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSwitchStatement(MingoXDParser.SwitchStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSwitchBlock(MingoXDParser.SwitchBlockContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSwitchBlockStatementGroup(MingoXDParser.SwitchBlockStatementGroupContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSwitchLabels(MingoXDParser.SwitchLabelsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSwitchLabel(MingoXDParser.SwitchLabelContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnumConstantName(MingoXDParser.EnumConstantNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitWhileStatement(MingoXDParser.WhileStatementContext ctx) {
        while(((Value) visit(ctx.expression())).asNumber().intValue() > 0){
            visit(ctx.statement());
        }
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitWhileStatementNoShortIf(MingoXDParser.WhileStatementNoShortIfContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitDoStatement(MingoXDParser.DoStatementContext ctx) {
        do{
            visit(ctx.statement());
        }while(((Value) visit(ctx.expression())).asNumber().intValue() > 0);
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitForStatement(MingoXDParser.ForStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitForStatementNoShortIf(MingoXDParser.ForStatementNoShortIfContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitBasicForStatement(MingoXDParser.BasicForStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitBasicForStatementNoShortIf(MingoXDParser.BasicForStatementNoShortIfContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitForInit(MingoXDParser.ForInitContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitForUpdate(MingoXDParser.ForUpdateContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStatementExpressionList(MingoXDParser.StatementExpressionListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnhancedForStatement(MingoXDParser.EnhancedForStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnhancedForStatementNoShortIf(MingoXDParser.EnhancedForStatementNoShortIfContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitBreakStatement(MingoXDParser.BreakStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitContinueStatement(MingoXDParser.ContinueStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitReturnStatement(MingoXDParser.ReturnStatementContext ctx) {
        Value val = (Value) visit(ctx.expression());
        return (T) val;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitThrowStatement(MingoXDParser.ThrowStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSynchronizedStatement(MingoXDParser.SynchronizedStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTryStatement(MingoXDParser.TryStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitCatches(MingoXDParser.CatchesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitCatchClause(MingoXDParser.CatchClauseContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitCatchFormalParameter(MingoXDParser.CatchFormalParameterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitCatchType(MingoXDParser.CatchTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFinally_(MingoXDParser.Finally_Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTryWithResourcesStatement(MingoXDParser.TryWithResourcesStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitResourceSpecification(MingoXDParser.ResourceSpecificationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitResourceList(MingoXDParser.ResourceListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitResource(MingoXDParser.ResourceContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimary(MingoXDParser.PrimaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray(MingoXDParser.PrimaryNoNewArrayContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lf_arrayAccess(MingoXDParser.PrimaryNoNewArray_lf_arrayAccessContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lfno_arrayAccess(MingoXDParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lf_primary(MingoXDParser.PrimaryNoNewArray_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(MingoXDParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(MingoXDParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lfno_primary(MingoXDParser.PrimaryNoNewArray_lfno_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(MingoXDParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(MingoXDParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassInstanceCreationExpression(MingoXDParser.ClassInstanceCreationExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassInstanceCreationExpression_lf_primary(MingoXDParser.ClassInstanceCreationExpression_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassInstanceCreationExpression_lfno_primary(MingoXDParser.ClassInstanceCreationExpression_lfno_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeArgumentsOrDiamond(MingoXDParser.TypeArgumentsOrDiamondContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFieldAccess(MingoXDParser.FieldAccessContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFieldAccess_lf_primary(MingoXDParser.FieldAccess_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFieldAccess_lfno_primary(MingoXDParser.FieldAccess_lfno_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArrayAccess(MingoXDParser.ArrayAccessContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArrayAccess_lf_primary(MingoXDParser.ArrayAccess_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArrayAccess_lfno_primary(MingoXDParser.ArrayAccess_lfno_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodInvocation(MingoXDParser.MethodInvocationContext ctx) {
        String methodName = ctx.methodName().getText();
        String s;
        //Pre-defined functions
        if(methodName.equals(PRINT)){
            ArrayList<Value> arguments = (ArrayList<Value>)visit(ctx.argumentList());
            for(int i = 0 ; i < arguments.size() ; i++){
                if(arguments.get(i).isVariable){
                    s = (globalVariables.get(arguments.get(i).asString())).asString();
                }else{
                    s = (arguments.get(i).asString());
                }
                s = s + " ";
                frame.printOutput(s);
            }
            return null;
        }else if(methodName.equals(PRINTLN)){
            ArrayList<Value> arguments = (ArrayList<Value>)visit(ctx.argumentList());
            for(int i = 0 ; i < arguments.size() ; i++){
                if(arguments.get(i).isVariable){
                    s = (globalVariables.get(arguments.get(i).asString())).asString();
                }else{
                    s = (arguments.get(i).asString());
                }
                s = s + "\n";
                frame.printOutput(s);
            }
            return null;
        }else if(methodName.equals(INPUT)){
            ArrayList<Value> arguments = (ArrayList<Value>)visit(ctx.argumentList());
            for(int i = 0 ; i < arguments.size() ; i++){
                if(arguments.get(i).isVariable){
                    s = (globalVariables.get(arguments.get(i).asString())).asString();
                }else{
                    s = (arguments.get(i).asString());
                }
                s = s + "\n";
                Value val;
                String input = frame.getInput(s);
                try{
                    BigDecimal number = new BigDecimal(input);
                    val = new Value(number);
                }catch(Exception e){
                    val = new Value(input);
                }
                return (T) val;
            }
        }
        Function func = globalFunctions.get(methodName);
        Map<String, Value> functionSpace = new HashMap<String, Value>();
        if(func.functionParameters != null){
            ArrayList<Value> arguments = (ArrayList<Value>)visit(ctx.argumentList());
            ArrayList<String> variables = (ArrayList<String>)func.functionParameters;
            if(arguments.size() == variables.size()){
                for(int i = 0 ; i < arguments.size() ; i++){
                    if(arguments.get(i) != null){
                        if(arguments.get(i).isVariable){
                            Value val = (globalVariables.get(arguments.get(i).asString()));
                            if(!localVariableStack.isEmpty()){
                                try{
                                    val = localVariableStack.peek().get(arguments.get(i).asString());
                                }catch(NullPointerException e){
                                }
                            }
                            functionSpace.put(variables.get(i), val);
                        }else{
                            functionSpace.put(variables.get(i), arguments.get(i));
                        }
                    }
                }
            }else{
                System.out.println("error");
            }
        }
        localVariableStack.push(functionSpace);
        Value returnVal = (Value)visit((MingoXDParser.MethodBodyContext)func.functionBody);
        return (T) returnVal;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodInvocation_lf_primary(MingoXDParser.MethodInvocation_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodInvocation_lfno_primary(MingoXDParser.MethodInvocation_lfno_primaryContext ctx) {
        String methodName = ctx.methodName().getText();
        String s;
        //Pre-defined functions
        if(methodName.equals(PRINT)){
            ArrayList<Value> arguments = (ArrayList<Value>)visit(ctx.argumentList());
            for(int i = 0 ; i < arguments.size() ; i++){
                if(arguments.get(i).isVariable){
                    s = (globalVariables.get(arguments.get(i).asString())).asString();
                }else{
                    s = (arguments.get(i).asString());
                }
                s = s + " ";
                frame.printOutput(s);
            }
            return null;
        }else if(methodName.equals(PRINTLN)){
            ArrayList<Value> arguments = (ArrayList<Value>)visit(ctx.argumentList());
            for(int i = 0 ; i < arguments.size() ; i++){
                if(arguments.get(i).isVariable){
                    s = (globalVariables.get(arguments.get(i).asString())).asString();
                }else{
                    s = (arguments.get(i).asString());
                }
                s = s + "\n";
                frame.printOutput(s);
            }
            return null;
        }else if(methodName.equals(INPUT)){
            ArrayList<Value> arguments = (ArrayList<Value>)visit(ctx.argumentList());
            for(int i = 0 ; i < arguments.size() ; i++){
                if(arguments.get(i).isVariable){
                    s = (globalVariables.get(arguments.get(i).asString())).asString();
                }else{
                    s = (arguments.get(i).asString());
                }
                s = s + "\n";
                Value val;
                String input = frame.getInput(s);
                try{
                    BigDecimal number = new BigDecimal(input);
                    val = new Value(number);
                }catch(Exception e){
                    val = new Value(input);
                }
                return (T) val;
            }
        }
        Function func = globalFunctions.get(methodName);
        Map<String, Value> functionSpace = new HashMap<String, Value>();
        if(func.functionParameters != null){
            ArrayList<Value> arguments = (ArrayList<Value>)visit(ctx.argumentList());
            ArrayList<String> variables = (ArrayList<String>)func.functionParameters;
            if(arguments.size() == variables.size()){
                for(int i = 0 ; i < arguments.size() ; i++){
                    if(arguments.get(i) != null){
                        if(arguments.get(i).isVariable){
                            Value val = (globalVariables.get(arguments.get(i).asString()));
                            if(!localVariableStack.isEmpty()){
                                try{
                                    val = localVariableStack.peek().get(arguments.get(i).asString());
                                }catch(NullPointerException e){
                                }
                            }
                            functionSpace.put(variables.get(i), val);
                        }else{
                            functionSpace.put(variables.get(i), arguments.get(i));
                        }
                    }
                }
            }else{
                System.out.println("error");
            }
        }
        localVariableStack.push(functionSpace);
        Value returnVal = (Value)visit((MingoXDParser.MethodBodyContext)func.functionBody);
        return (T) returnVal;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArgumentList(MingoXDParser.ArgumentListContext ctx) {
        ArrayList<Value> arguments = new ArrayList<>();
        for(int i = 0 ; i < ctx.getChildCount() ; i++){
            arguments.add((Value) visit(ctx.getChild(i)));
        }
        return (T) arguments;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodReference(MingoXDParser.MethodReferenceContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodReference_lf_primary(MingoXDParser.MethodReference_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodReference_lfno_primary(MingoXDParser.MethodReference_lfno_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArrayCreationExpression(MingoXDParser.ArrayCreationExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitDimExprs(MingoXDParser.DimExprsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitDimExpr(MingoXDParser.DimExprContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConstantExpression(MingoXDParser.ConstantExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExpression(MingoXDParser.ExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLambdaExpression(MingoXDParser.LambdaExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLambdaParameters(MingoXDParser.LambdaParametersContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInferredFormalParameterList(MingoXDParser.InferredFormalParameterListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLambdaBody(MingoXDParser.LambdaBodyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAssignmentExpression(MingoXDParser.AssignmentExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAssignment(MingoXDParser.AssignmentContext ctx) {
        String id = ctx.leftHandSide().getText();
        Value val = (Value) visit(ctx.expression());
        if(val.isVariable){
            val = globalVariables.get(val.asString());
            if(!localVariableStack.isEmpty())
                try{
                    val = localVariableStack.peek().get(val.asString());
                }catch(NullPointerException e){
                }
        }
        if(!localVariableStack.isEmpty()){
            if(localVariableStack.peek().containsKey(id)){
                return (T) localVariableStack.peek().put(id, val);
            }else{
                if(!globalVariables.containsKey(id)){
                    return (T) localVariableStack.peek().put(id, val);
                }
            }
        }
        return (T) globalVariables.put(id, val);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLeftHandSide(MingoXDParser.LeftHandSideContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAssignmentOperator(MingoXDParser.AssignmentOperatorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConditionalExpression(MingoXDParser.ConditionalExpressionContext ctx) {
        if(ctx.getChildCount() > 1){
            Value left = (Value)visit(ctx.getChild(0));
            Value right = (Value)visit(ctx.getChild(2));
            Expression exp = new Expression(left.asString() + ctx.getChild(1) + right.asString());
            return (T) evalExp(exp, ctx);
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConditionalOrExpression(MingoXDParser.ConditionalOrExpressionContext ctx) {
        if(ctx.getChildCount() > 1){
            Value left = (Value)visit(ctx.getChild(0));
            Value right = (Value)visit(ctx.getChild(2));
            Expression exp = new Expression(left.asString() + ctx.getChild(1) + right.asString());
            return (T) evalExp(exp, ctx);
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConditionalAndExpression(MingoXDParser.ConditionalAndExpressionContext ctx) {
        if(ctx.getChildCount() > 1){
            Value left = (Value)visit(ctx.getChild(0));
            Value right = (Value)visit(ctx.getChild(2));
            Expression exp = new Expression(left.asString() + ctx.getChild(1) + right.asString());
            return (T) evalExp(exp, ctx);
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInclusiveOrExpression(MingoXDParser.InclusiveOrExpressionContext ctx) {
        if(ctx.getChildCount() > 1){
            Value left = (Value)visit(ctx.getChild(0));
            Value right = (Value)visit(ctx.getChild(2));
            Expression exp = new Expression(left.asString() + ctx.getChild(1) + right.asString());
            return (T) evalExp(exp, ctx);
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExclusiveOrExpression(MingoXDParser.ExclusiveOrExpressionContext ctx) {
        if(ctx.getChildCount() > 1){
            Value left = (Value)visit(ctx.getChild(0));
            Value right = (Value)visit(ctx.getChild(2));
            Expression exp = new Expression(left.asString() + ctx.getChild(1) + right.asString());
            return (T) evalExp(exp, ctx);
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAndExpression(MingoXDParser.AndExpressionContext ctx) {
        if(ctx.getChildCount() > 1){
            Value left = (Value)visit(ctx.getChild(0));
            Value right = (Value)visit(ctx.getChild(2));
            Expression exp = new Expression(left.asString() + ctx.getChild(1) + right.asString());
            return (T) evalExp(exp, ctx);
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEqualityExpression(MingoXDParser.EqualityExpressionContext ctx) {
        if(ctx.getChildCount() > 1){
            Value left = (Value)visit(ctx.getChild(0));
            Value right = (Value)visit(ctx.getChild(2));
            Expression exp = new Expression(left.asString() + ctx.getChild(1) + right.asString());
            return (T) evalExp(exp, ctx);
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitRelationalExpression(MingoXDParser.RelationalExpressionContext ctx) {
        if(ctx.getChildCount() > 1){
            Value left = (Value)visit(ctx.getChild(0));
            Value right = (Value)visit(ctx.getChild(2));
            Expression exp = new Expression(left.asString() + ctx.getChild(1) + right.asString());
            return (T) evalExp(exp, ctx);
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitShiftExpression(MingoXDParser.ShiftExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAdditiveExpression(MingoXDParser.AdditiveExpressionContext ctx) {
        if(ctx.getChildCount() > 1){
            Value left = (Value)visit(ctx.getChild(0));
            Value right = (Value)visit(ctx.getChild(2));
            Expression exp = new Expression(left.asString() + ctx.getChild(1) + right.asString());
            return (T) evalExp(exp, ctx);
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMultiplicativeExpression(MingoXDParser.MultiplicativeExpressionContext ctx) {
        if(ctx.getChildCount() > 1){
            Value left = (Value)visit(ctx.getChild(0));
            Value right = (Value)visit(ctx.getChild(2));
            Expression exp = new Expression(left.asString() + ctx.getChild(1) + right.asString());
            return (T) evalExp(exp, ctx);
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnaryExpression(MingoXDParser.UnaryExpressionContext ctx) {
        Expression exp = new Expression(ctx.getText());
        return (T) evalExp(exp, ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPreIncrementExpression(MingoXDParser.PreIncrementExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPreDecrementExpression(MingoXDParser.PreDecrementExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnaryExpressionNotPlusMinus(MingoXDParser.UnaryExpressionNotPlusMinusContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPostfixExpression(MingoXDParser.PostfixExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPostIncrementExpression(MingoXDParser.PostIncrementExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPostIncrementExpression_lf_postfixExpression(MingoXDParser.PostIncrementExpression_lf_postfixExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPostDecrementExpression(MingoXDParser.PostDecrementExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPostDecrementExpression_lf_postfixExpression(MingoXDParser.PostDecrementExpression_lf_postfixExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitCastExpression(MingoXDParser.CastExpressionContext ctx) { return visitChildren(ctx); }
}
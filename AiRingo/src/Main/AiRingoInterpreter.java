// Generated from /home/athena/GitRepo/CMPILER-MP/MingoXD/src/Main/AiRingoParser.g4 by ANTLR 4.7.2
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
 * This class provides an empty implementation of {@link AiRingoVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class AiRingoInterpreter<T> extends AbstractParseTreeVisitor<T> implements AiRingoVisitor<T> {
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
        Map<String, AiRingoInterpreter.Value> classSpace = new HashMap<>();
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

    public AiRingoInterpreter(inputFrame frame, String srccode){
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

    @Override public T visitRun(AiRingoParser.RunContext ctx) {
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
    @Override public T visitLiteral(AiRingoParser.LiteralContext ctx) {
        return (T) new Value(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimitiveType(AiRingoParser.PrimitiveTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitNumericType(AiRingoParser.NumericTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitIntegralType(AiRingoParser.IntegralTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFloatingPointType(AiRingoParser.FloatingPointTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitReferenceType(AiRingoParser.ReferenceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassOrInterfaceType(AiRingoParser.ClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassType(AiRingoParser.ClassTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassType_lf_classOrInterfaceType(AiRingoParser.ClassType_lf_classOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassType_lfno_classOrInterfaceType(AiRingoParser.ClassType_lfno_classOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceType(AiRingoParser.InterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceType_lf_classOrInterfaceType(AiRingoParser.InterfaceType_lf_classOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceType_lfno_classOrInterfaceType(AiRingoParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeVariable(AiRingoParser.TypeVariableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArrayType(AiRingoParser.ArrayTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitDims(AiRingoParser.DimsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeParameter(AiRingoParser.TypeParameterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeParameterModifier(AiRingoParser.TypeParameterModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeBound(AiRingoParser.TypeBoundContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAdditionalBound(AiRingoParser.AdditionalBoundContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeArguments(AiRingoParser.TypeArgumentsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeArgumentList(AiRingoParser.TypeArgumentListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeArgument(AiRingoParser.TypeArgumentContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitWildcard(AiRingoParser.WildcardContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitWildcardBounds(AiRingoParser.WildcardBoundsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPackageName(AiRingoParser.PackageNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeName(AiRingoParser.TypeNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPackageOrTypeName(AiRingoParser.PackageOrTypeNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExpressionName(AiRingoParser.ExpressionNameContext ctx) {
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
    @Override public T visitMethodName(AiRingoParser.MethodNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAmbiguousName(AiRingoParser.AmbiguousNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPackageDeclaration(AiRingoParser.PackageDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPackageModifier(AiRingoParser.PackageModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitImportDeclaration(AiRingoParser.ImportDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSingleTypeImportDeclaration(AiRingoParser.SingleTypeImportDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeImportOnDemandDeclaration(AiRingoParser.TypeImportOnDemandDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSingleStaticImportDeclaration(AiRingoParser.SingleStaticImportDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStaticImportOnDemandDeclaration(AiRingoParser.StaticImportOnDemandDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeDeclaration(AiRingoParser.TypeDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassDeclaration(AiRingoParser.ClassDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitNormalClassDeclaration(AiRingoParser.NormalClassDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassModifier(AiRingoParser.ClassModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeParameters(AiRingoParser.TypeParametersContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeParameterList(AiRingoParser.TypeParameterListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSuperclass(AiRingoParser.SuperclassContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSuperinterfaces(AiRingoParser.SuperinterfacesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceTypeList(AiRingoParser.InterfaceTypeListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassBody(AiRingoParser.ClassBodyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassBodyDeclaration(AiRingoParser.ClassBodyDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassMemberDeclaration(AiRingoParser.ClassMemberDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFieldDeclaration(AiRingoParser.FieldDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFieldModifier(AiRingoParser.FieldModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitVariableDeclaratorList(AiRingoParser.VariableDeclaratorListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitVariableDeclarator(AiRingoParser.VariableDeclaratorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitVariableDeclaratorId(AiRingoParser.VariableDeclaratorIdContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitVariableInitializer(AiRingoParser.VariableInitializerContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannType(AiRingoParser.UnannTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannPrimitiveType(AiRingoParser.UnannPrimitiveTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannReferenceType(AiRingoParser.UnannReferenceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannClassOrInterfaceType(AiRingoParser.UnannClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannClassType(AiRingoParser.UnannClassTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannClassType_lf_unannClassOrInterfaceType(AiRingoParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannClassType_lfno_unannClassOrInterfaceType(AiRingoParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannInterfaceType(AiRingoParser.UnannInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannInterfaceType_lf_unannClassOrInterfaceType(AiRingoParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(AiRingoParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannTypeVariable(AiRingoParser.UnannTypeVariableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnannArrayType(AiRingoParser.UnannArrayTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodDeclaration(AiRingoParser.MethodDeclarationContext ctx) {
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
    @Override public T visitMethodModifier(AiRingoParser.MethodModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodHeader(AiRingoParser.MethodHeaderContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitResult(AiRingoParser.ResultContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodDeclarator(AiRingoParser.MethodDeclaratorContext ctx) {
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
    @Override public T visitFormalParameterList(AiRingoParser.FormalParameterListContext ctx) {
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
    @Override public T visitFormalParameters(AiRingoParser.FormalParametersContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFormalParameter(AiRingoParser.FormalParameterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitVariableModifier(AiRingoParser.VariableModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLastFormalParameter(AiRingoParser.LastFormalParameterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitReceiverParameter(AiRingoParser.ReceiverParameterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitThrows_(AiRingoParser.Throws_Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExceptionTypeList(AiRingoParser.ExceptionTypeListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExceptionType(AiRingoParser.ExceptionTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodBody(AiRingoParser.MethodBodyContext ctx) {
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
    @Override public T visitInstanceInitializer(AiRingoParser.InstanceInitializerContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStaticInitializer(AiRingoParser.StaticInitializerContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConstructorDeclaration(AiRingoParser.ConstructorDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConstructorModifier(AiRingoParser.ConstructorModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConstructorDeclarator(AiRingoParser.ConstructorDeclaratorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSimpleTypeName(AiRingoParser.SimpleTypeNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConstructorBody(AiRingoParser.ConstructorBodyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExplicitConstructorInvocation(AiRingoParser.ExplicitConstructorInvocationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnumDeclaration(AiRingoParser.EnumDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnumBody(AiRingoParser.EnumBodyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnumConstantList(AiRingoParser.EnumConstantListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnumConstant(AiRingoParser.EnumConstantContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnumConstantModifier(AiRingoParser.EnumConstantModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnumBodyDeclarations(AiRingoParser.EnumBodyDeclarationsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceDeclaration(AiRingoParser.InterfaceDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitNormalInterfaceDeclaration(AiRingoParser.NormalInterfaceDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceModifier(AiRingoParser.InterfaceModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExtendsInterfaces(AiRingoParser.ExtendsInterfacesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceBody(AiRingoParser.InterfaceBodyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceMemberDeclaration(AiRingoParser.InterfaceMemberDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConstantDeclaration(AiRingoParser.ConstantDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConstantModifier(AiRingoParser.ConstantModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceMethodDeclaration(AiRingoParser.InterfaceMethodDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInterfaceMethodModifier(AiRingoParser.InterfaceMethodModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAnnotationTypeDeclaration(AiRingoParser.AnnotationTypeDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAnnotationTypeBody(AiRingoParser.AnnotationTypeBodyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAnnotationTypeMemberDeclaration(AiRingoParser.AnnotationTypeMemberDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAnnotationTypeElementDeclaration(AiRingoParser.AnnotationTypeElementDeclarationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAnnotationTypeElementModifier(AiRingoParser.AnnotationTypeElementModifierContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitDefaultValue(AiRingoParser.DefaultValueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAnnotation(AiRingoParser.AnnotationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitNormalAnnotation(AiRingoParser.NormalAnnotationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitElementValuePairList(AiRingoParser.ElementValuePairListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitElementValuePair(AiRingoParser.ElementValuePairContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitElementValue(AiRingoParser.ElementValueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitElementValueArrayInitializer(AiRingoParser.ElementValueArrayInitializerContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitElementValueList(AiRingoParser.ElementValueListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMarkerAnnotation(AiRingoParser.MarkerAnnotationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSingleElementAnnotation(AiRingoParser.SingleElementAnnotationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArrayInitializer(AiRingoParser.ArrayInitializerContext ctx) {
        return visit(ctx.variableInitializerList());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitVariableInitializerList(AiRingoParser.VariableInitializerListContext ctx) {
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
    @Override public T visitBlock(AiRingoParser.BlockContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitBlockStatements(AiRingoParser.BlockStatementsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitBlockStatement(AiRingoParser.BlockStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLocalVariableDeclarationStatement(AiRingoParser.LocalVariableDeclarationStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLocalVariableDeclaration(AiRingoParser.LocalVariableDeclarationContext ctx) {
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
    @Override public T visitStatement(AiRingoParser.StatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStatementNoShortIf(AiRingoParser.StatementNoShortIfContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStatementWithoutTrailingSubstatement(AiRingoParser.StatementWithoutTrailingSubstatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEmptyStatement(AiRingoParser.EmptyStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLabeledStatement(AiRingoParser.LabeledStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLabeledStatementNoShortIf(AiRingoParser.LabeledStatementNoShortIfContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExpressionStatement(AiRingoParser.ExpressionStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStatementExpression(AiRingoParser.StatementExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitIfThenStatement(AiRingoParser.IfThenStatementContext ctx) {
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
    @Override public T visitIfThenElseStatement(AiRingoParser.IfThenElseStatementContext ctx) {
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
    @Override public T visitIfThenElseStatementNoShortIf(AiRingoParser.IfThenElseStatementNoShortIfContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAssertStatement(AiRingoParser.AssertStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSwitchStatement(AiRingoParser.SwitchStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSwitchBlock(AiRingoParser.SwitchBlockContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSwitchBlockStatementGroup(AiRingoParser.SwitchBlockStatementGroupContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSwitchLabels(AiRingoParser.SwitchLabelsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSwitchLabel(AiRingoParser.SwitchLabelContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnumConstantName(AiRingoParser.EnumConstantNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitWhileStatement(AiRingoParser.WhileStatementContext ctx) {
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
    @Override public T visitWhileStatementNoShortIf(AiRingoParser.WhileStatementNoShortIfContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitDoStatement(AiRingoParser.DoStatementContext ctx) {
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
    @Override public T visitForStatement(AiRingoParser.ForStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitForStatementNoShortIf(AiRingoParser.ForStatementNoShortIfContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitBasicForStatement(AiRingoParser.BasicForStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitBasicForStatementNoShortIf(AiRingoParser.BasicForStatementNoShortIfContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitForInit(AiRingoParser.ForInitContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitForUpdate(AiRingoParser.ForUpdateContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitStatementExpressionList(AiRingoParser.StatementExpressionListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnhancedForStatement(AiRingoParser.EnhancedForStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitEnhancedForStatementNoShortIf(AiRingoParser.EnhancedForStatementNoShortIfContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitBreakStatement(AiRingoParser.BreakStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitContinueStatement(AiRingoParser.ContinueStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitReturnStatement(AiRingoParser.ReturnStatementContext ctx) {
        Value val = (Value) visit(ctx.expression());
        return (T) val;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitThrowStatement(AiRingoParser.ThrowStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitSynchronizedStatement(AiRingoParser.SynchronizedStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTryStatement(AiRingoParser.TryStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitCatches(AiRingoParser.CatchesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitCatchClause(AiRingoParser.CatchClauseContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitCatchFormalParameter(AiRingoParser.CatchFormalParameterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitCatchType(AiRingoParser.CatchTypeContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFinally_(AiRingoParser.Finally_Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTryWithResourcesStatement(AiRingoParser.TryWithResourcesStatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitResourceSpecification(AiRingoParser.ResourceSpecificationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitResourceList(AiRingoParser.ResourceListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitResource(AiRingoParser.ResourceContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimary(AiRingoParser.PrimaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray(AiRingoParser.PrimaryNoNewArrayContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lf_arrayAccess(AiRingoParser.PrimaryNoNewArray_lf_arrayAccessContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lfno_arrayAccess(AiRingoParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lf_primary(AiRingoParser.PrimaryNoNewArray_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(AiRingoParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(AiRingoParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lfno_primary(AiRingoParser.PrimaryNoNewArray_lfno_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(AiRingoParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(AiRingoParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassInstanceCreationExpression(AiRingoParser.ClassInstanceCreationExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassInstanceCreationExpression_lf_primary(AiRingoParser.ClassInstanceCreationExpression_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitClassInstanceCreationExpression_lfno_primary(AiRingoParser.ClassInstanceCreationExpression_lfno_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitTypeArgumentsOrDiamond(AiRingoParser.TypeArgumentsOrDiamondContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFieldAccess(AiRingoParser.FieldAccessContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFieldAccess_lf_primary(AiRingoParser.FieldAccess_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitFieldAccess_lfno_primary(AiRingoParser.FieldAccess_lfno_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArrayAccess(AiRingoParser.ArrayAccessContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArrayAccess_lf_primary(AiRingoParser.ArrayAccess_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArrayAccess_lfno_primary(AiRingoParser.ArrayAccess_lfno_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodInvocation(AiRingoParser.MethodInvocationContext ctx) {
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
        Value returnVal = (Value)visit((AiRingoParser.MethodBodyContext)func.functionBody);
        return (T) returnVal;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodInvocation_lf_primary(AiRingoParser.MethodInvocation_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodInvocation_lfno_primary(AiRingoParser.MethodInvocation_lfno_primaryContext ctx) {
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
        Value returnVal = (Value)visit((AiRingoParser.MethodBodyContext)func.functionBody);
        return (T) returnVal;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArgumentList(AiRingoParser.ArgumentListContext ctx) {
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
    @Override public T visitMethodReference(AiRingoParser.MethodReferenceContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodReference_lf_primary(AiRingoParser.MethodReference_lf_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitMethodReference_lfno_primary(AiRingoParser.MethodReference_lfno_primaryContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitArrayCreationExpression(AiRingoParser.ArrayCreationExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitDimExprs(AiRingoParser.DimExprsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitDimExpr(AiRingoParser.DimExprContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConstantExpression(AiRingoParser.ConstantExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitExpression(AiRingoParser.ExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLambdaExpression(AiRingoParser.LambdaExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLambdaParameters(AiRingoParser.LambdaParametersContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitInferredFormalParameterList(AiRingoParser.InferredFormalParameterListContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitLambdaBody(AiRingoParser.LambdaBodyContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAssignmentExpression(AiRingoParser.AssignmentExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAssignment(AiRingoParser.AssignmentContext ctx) {
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
    @Override public T visitLeftHandSide(AiRingoParser.LeftHandSideContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAssignmentOperator(AiRingoParser.AssignmentOperatorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitConditionalExpression(AiRingoParser.ConditionalExpressionContext ctx) {
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
    @Override public T visitConditionalOrExpression(AiRingoParser.ConditionalOrExpressionContext ctx) {
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
    @Override public T visitConditionalAndExpression(AiRingoParser.ConditionalAndExpressionContext ctx) {
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
    @Override public T visitInclusiveOrExpression(AiRingoParser.InclusiveOrExpressionContext ctx) {
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
    @Override public T visitExclusiveOrExpression(AiRingoParser.ExclusiveOrExpressionContext ctx) {
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
    @Override public T visitAndExpression(AiRingoParser.AndExpressionContext ctx) {
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
    @Override public T visitEqualityExpression(AiRingoParser.EqualityExpressionContext ctx) {
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
    @Override public T visitRelationalExpression(AiRingoParser.RelationalExpressionContext ctx) {
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
    @Override public T visitShiftExpression(AiRingoParser.ShiftExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitAdditiveExpression(AiRingoParser.AdditiveExpressionContext ctx) {
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
    @Override public T visitMultiplicativeExpression(AiRingoParser.MultiplicativeExpressionContext ctx) {
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
    @Override public T visitUnaryExpression(AiRingoParser.UnaryExpressionContext ctx) {
        Expression exp = new Expression(ctx.getText());
        return (T) evalExp(exp, ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPreIncrementExpression(AiRingoParser.PreIncrementExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPreDecrementExpression(AiRingoParser.PreDecrementExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitUnaryExpressionNotPlusMinus(AiRingoParser.UnaryExpressionNotPlusMinusContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPostfixExpression(AiRingoParser.PostfixExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPostIncrementExpression(AiRingoParser.PostIncrementExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPostIncrementExpression_lf_postfixExpression(AiRingoParser.PostIncrementExpression_lf_postfixExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPostDecrementExpression(AiRingoParser.PostDecrementExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitPostDecrementExpression_lf_postfixExpression(AiRingoParser.PostDecrementExpression_lf_postfixExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public T visitCastExpression(AiRingoParser.CastExpressionContext ctx) { return visitChildren(ctx); }
}
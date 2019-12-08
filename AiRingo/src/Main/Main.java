package Main;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Arrays;

public class Main
{
    private inputFrame frame;

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main() {
        this.frame = new inputFrame(this);
        this.frame.setVisible(true);
        this.frame.setSplitPanes();
    }

    public void scan(String srccode) {
        try {

            AiRingoLexer lexer = new AiRingoLexer(new ANTLRInputStream(srccode));
            Token token;
            int count = 1;
            frame.printOutput("## Tokens ##\n");
            while ((token = lexer.nextToken()).getType() != -1) {
                if (token.getType() != 59)
                    frame.printOutput(count + ": " + token.getText() + "\n");
                    count++;
            }
            frame.printOutput("\n");
        } catch (Throwable t) {
            System.out.println("Exception: " + t);
            t.printStackTrace();
        }
    }


    public void parse(String srccode) {

        AiRingoLexer lexer = new AiRingoLexer(new ANTLRInputStream(srccode));
        AiRingoParser parser = new AiRingoParser(new CommonTokenStream(lexer));

        try {
            parser.removeErrorListeners();
            ParseTree pTree = parser.run();
            frame.printOutput("## Parse Tree ##\n");
            frame.printOutput(pTree.toStringTree(parser));
            frame.printOutput("\n\n");
            TreeViewer viewr = new TreeViewer(Arrays.asList(
                    parser.getRuleNames()),pTree);
            viewr.open();
        }
        catch (RecognitionException e) {
            e.printStackTrace();
        }
    }

    public void run(String srccode) {

        String newCode = "";
        AiRingoLexer lexer = new AiRingoLexer(new ANTLRInputStream(srccode));
        Token token;
        while ((token = lexer.nextToken()).getType() != AiRingoParser.EOF) {
            if (token.getType() != AiRingoParser.EOF) {
                String tokenText = token.getText();
                if(tokenText.equals("printo")){
                    tokenText = "print";
                }else if(tokenText.equals("abstrakto")){
                    tokenText = "abstract";
                }else if(tokenText.equals("boorean")){
                    tokenText = "boolean";
                }else if(tokenText.equals("bureko")){
                    tokenText = "break";
                }else if(tokenText.equals("byto")){
                    tokenText = "byte";
                }else if(tokenText.equals("kesu")){
                    tokenText = "case";
                }else if(tokenText.equals("katchu")){
                    tokenText = "catch";
                }else if(tokenText.equals("karu")){
                    tokenText = "char";
                }else if(tokenText.equals("kurasu")){
                    tokenText = "class";
                }else if(tokenText.equals("kontinu")){
                    tokenText = "continue";
                }else if(tokenText.equals("deporuto")){
                    tokenText = "default";
                }else if(tokenText.equals("do")){
                    tokenText = "do";
                }else if(tokenText.equals("doburu")){
                    tokenText = "double";
                }else if(tokenText.equals("erusu")){
                    tokenText = "else";
                }else if(tokenText.equals("erusu ifu")){
                    tokenText = "else if";
                }else if(tokenText.equals("enumu")){
                    tokenText = "enum";
                }else if(tokenText.equals("extendo")){
                    tokenText = "extends";
                }else if(tokenText.equals("finar")){
                    tokenText = "final";
                }else if(tokenText.equals("finarri")){
                    tokenText = "finally";
                }else if(tokenText.equals("furoto")){
                    tokenText = "float";
                }else if(tokenText.equals("foru")){
                    tokenText = "for";
                }else if(tokenText.equals("ifu")){
                    tokenText = "if";
                }else if(tokenText.equals("impremento")){
                    tokenText = "implements";
                }else if(tokenText.equals("importo")){
                    tokenText = "import";
                }else if(tokenText.equals("insutaof")){
                    tokenText = "instanceof";
                }else if(tokenText.equals("into")){
                    tokenText = "int";
                }else if(tokenText.equals("intefeseru")){
                    tokenText = "interface";
                }else if(tokenText.equals("rongu")){
                    tokenText = "long";
                }else if(tokenText.equals("netivu")){
                    tokenText = "native";
                }else if(tokenText.equals("newu")){
                    tokenText = "new";
                }else if(tokenText.equals("pakeju")){
                    tokenText = "package";
                }else if(tokenText.equals("privatto")){
                    tokenText = "private";
                }else if(tokenText.equals("protekto")){
                    tokenText = "protected";
                }else if(tokenText.equals("pubriko")){
                    tokenText = "public";
                }else if(tokenText.equals("returno")){
                    tokenText = "return";
                }else if(tokenText.equals("shorto")){
                    tokenText = "short";
                }else if(tokenText.equals("statiku")){
                    tokenText = "static";
                }else if(tokenText.equals("strictofp")){
                    tokenText = "strictfp";
                }else if(tokenText.equals("Stringu")){
                    tokenText = "String";
                }else if(tokenText.equals("supa")){
                    tokenText = "super";
                }else if(tokenText.equals("switchu")){
                    tokenText = "switch";
                }else if(tokenText.equals("sinkuronaizu")){
                    tokenText = "synchronized";
                }else if(tokenText.equals("disu")){
                    tokenText = "this";
                }else if(tokenText.equals("throwu")){
                    tokenText = "throw";
                }else if(tokenText.equals("throwsu")){
                    tokenText = "throws";
                }else if(tokenText.equals("transento")){
                    tokenText = "transient";
                }else if(tokenText.equals("tryu")){
                    tokenText = "try";
                }else if(tokenText.equals("boido")){
                    tokenText = "void";
                }else if(tokenText.equals("voratiru")){
                    tokenText = "volatile";
                }else if(tokenText.equals("wairu")){
                    tokenText = "while";
                }

            newCode += tokenText + " ";
            }
        }
        AiRingoParser parser = new AiRingoParser(new CommonTokenStream(lexer));

        try {
            AiRingoInterpreter interpreter = new AiRingoInterpreter(frame, newCode);
            ParseTree pTree = parser.run();
            interpreter.visit(pTree);
        }
        catch (RecognitionException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            this.frame.printError(String.valueOf(e.getMessage()) + "\n");
        }
    }

}

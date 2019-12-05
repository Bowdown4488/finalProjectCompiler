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
                }else if(tokenText.equals("pubriko")){
                    tokenText = "public";
                }else if(tokenText.equals("boido")){
                    tokenText = "void";
                }else if(tokenText.equals("kurasu")){
                    tokenText = "class";
                }else if(tokenText.equals("into")){
                    tokenText = "int";
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

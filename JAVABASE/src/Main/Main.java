package Main;

import bsh.EvalError;
import bsh.Interpreter;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.OutputStream;
import java.io.PrintStream;
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

            Java8Lexer lexer = new Java8Lexer(new ANTLRInputStream(srccode));
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

        Java8Lexer lexer = new Java8Lexer(new ANTLRInputStream(srccode));
        Java8Parser parser = new Java8Parser(new CommonTokenStream(lexer));

        try {
            parser.removeErrorListeners();
            ParseTree pTree = parser.compilationUnit();
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

        Java8Lexer lexer = new Java8Lexer(new ANTLRInputStream(srccode));
        Java8Parser parser = new Java8Parser(new CommonTokenStream(lexer));

        try {
            Java8Interpreter interpreter = new Java8Interpreter(frame, srccode);
            ParseTree pTree = parser.compilationUnit();
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

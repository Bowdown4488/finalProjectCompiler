import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class AntlrParser{
    public static double SIZE = 0.5;

    private JFrame frame;
    JTextPane textPane;
    JTextPane textPane2;
    gParser parser;
    gLexer lexer;

    public AntlrParser(){
        initialize();
    }

    public String getInput(){
        return textPane.getText();
    }

    public void putOutput(String output){
        textPane2.setText(textPane2.getText()+output);
    }

    public void run(){

        ANTLRInputStream input = new ANTLRInputStream(getInput());
        lexer = new gLexer(input);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        parser = new gParser(tokenStream);

        ErrorListener listener = new ErrorListener();
        parser.addErrorListener(listener);
        ParseTree tree = parser.compilationUnit();
        gBaseVisitor visitor = new gBaseVisitor(this);
        visitor.visit(tree);

        /*List <Errors> errors = listener.getSyntaxErrors();

        for(int i=0; i < errors.size(); i++){

            if(i == 0 || errors.get(i).getLine() != errors.get(i-1).getLine()){
                System.out.println("LINE " + errors.get(i).getLine());
            }

            System.out.println("\t- " + errors.get(i).getMessage());
        }*/

        // no viable alternative at input
        // mismatched input
        // missing
        // extraneous

        //listener.getSyntaxErrors().get(0).printALL();
        // OUTPUT PARSE TREE IN CONSOLE
        //System.out.println(tree.toStringTree(parser));

        // OUTPUT PARSE TREE IN GUI
        //JFrame frame = new JFrame("Antlr Parse Tree");
        //JPanel mainPanel = new JPanel();

        //JPanel panel = new JPanel();

        // UNCOMMENT FOR PARSE TREE PROJECTION
//        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
//        viewer.setScale(1.5); //scale a little
//        viewer.open();

        //panel.add(viewer);

        //JPanel newPanel = new JPanel();
        //newPanel.add(panel);
        //JScrollPane scrollPanel = new JScrollPane(newPanel);
        //mainPanel.add(scrollPanel);

        //frame.add(scrollPanel);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(1000,800);
        //frame.setVisible(true);

        //process(inputs);

        for(int i=0;i<listener.getSyntaxErrors().size();i++){
            System.out.print(listener.getSyntaxErrors().get(i).getLine() + " - ");
            //System.out.println("Message: "+listener.getSyntaxErrors().get(i).getOffendingSymbol());

            String msg = listener.getSyntaxErrors().get(i).getMessage();
            String error = msg.split("'")[1];
            System.out.println(msg.split("'")[0]);
            System.out.println("\tError symbols found: " + error);
            //System.out.println("_____________________________________________________________");

            if (msg.contains("missing")) {
                System.out.println("\tSuggestion: " + "missing -> " + error + "\n");
            }
            else if (msg.contains("extraneous input")){
                System.out.println("\tSuggestion: " + "extra character/s -> " + error + "\n");
            }
            else if(msg.contains("mismatched input")){
                System.out.println("\t(Suggestion: " + "unexpected -> " + error + "\n");
            }
            else if(msg.contains("no viable alternative at input")){
                String test = listener.getSyntaxErrors().get(i).getOffendingSymbol().toString();
                test = test.split("'")[1];
//                System.out.println(test);
                System.out.println("\tSuggestion: " + "consider changing symbol in expression -> " + test + "\n");
            }
            else if(msg.contains("cannot find symbol")){
                System.out.println("\tSuggestion: " + "missing symbol -> " + error + "\n");
            }
            else {
                System.out.println("\tSuggestion: " + listener.getSyntaxErrors().get(i).getMessage() + "\n");
            }
        }

        // OUTPUT PARSING ERRORS
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1100, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Run");
        btnNewButton.setBounds(724, 402, 150, 45);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                run();
            }
        });
        frame.getContentPane().add(btnNewButton);

        JButton btnParse = new JButton("Parse");
        btnParse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ANTLRInputStream input = new ANTLRInputStream(getInput());
                lexer = new gLexer(input);
                TokenStream tokenStream = new CommonTokenStream(lexer);
                parser = new gParser(tokenStream);

                ErrorListener listener = new ErrorListener();
                parser.addErrorListener(listener);
                ParseTree tree = parser.compilationUnit();
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
                viewer.setScale(1.5); //scale a little
                viewer.open();
            }
        });
        btnParse.setBounds(564, 402, 150, 45);
        frame.getContentPane().add(btnParse);

        JButton btn_scan = new JButton("Scan");
        btn_scan.setBounds(404, 402, 150, 45);
        frame.getContentPane().add(btn_scan);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(10, 339, 388, 111);
        frame.getContentPane().add(panel);

        JList list = new JList();
        list.setBounds(884, 11, 190, 436);
        frame.getContentPane().add(list);

        textPane = new JTextPane();
        textPane.setBounds(10, 11, 388, 321);
        frame.getContentPane().add(textPane);

        textPane2 = new JTextPane();
        textPane2.setBounds(408, 11, 466, 380);
        frame.getContentPane().add(textPane2);
        frame.setVisible(true);
    }
    /*static public void process(CharStream input){
//        CharStream stream = fromString(input);
        gLexer lexer  = new gLexer(input);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        gParser parser = new gParser(tokenStream);

        ErrorListener listener = new ErrorListener();
        parser.addErrorListener(listener);
        ParseTree tree = parser.compilationUnit();

        for(int i=0;i<listener.getSyntaxErrors().size();i++){
            System.out.println("Line " + listener.getSyntaxErrors().get(i).getLine());
            System.out.println("Message: "+listener.getSyntaxErrors().get(i).getOffendingSymbol());
            String msg = listener.getSyntaxErrors().get(i).getMessage();
            String error = msg.split("'")[1];
            System.out.println(msg.split("'")[0]);
            System.out.println("Error symbols found: " + error);
            System.out.println("_____________________________________________________________");
            if (msg.contains("missing")) {
                System.out.println("(Syntax error at line:" + listener.getSyntaxErrors().get(i).getLine() + ") " + "missing -> " + error + "\n");
            }
            else if (msg.contains("extraneous input")){
                System.out.println("(Syntax error at line:" + listener.getSyntaxErrors().get(i).getLine() + ") " + "extra character/s -> " + error + "\n");
            }
            else if(msg.contains("mismatched input")){
                System.out.println("(Syntax error at line:" + listener.getSyntaxErrors().get(i).getLine() + ") " + "unexpected -> " + error + "\n");
            }
            else if(msg.contains("no viable alternative at input")){
                String test = listener.getSyntaxErrors().get(i).getOffendingSymbol().toString();
                test = test.split("'")[1];
//                System.out.println(test);
                System.out.println("(Syntax error at line:" + listener.getSyntaxErrors().get(i).getLine() + ") " + "consider changing symbol in expression -> " + test + "\n");
            }
            else if(msg.contains("cannot find symbol")){
                System.out.println("(Syntax error at line:" + listener.getSyntaxErrors().get(i).getLine() + ") " + "missing symbol -> " + error + "\n");
            }
            else {
                System.out.println("(Syntax error at line:" + listener.getSyntaxErrors().get(i).getLine() + ") " + listener.getSyntaxErrors().get(i).getMessage() + "\n");
            }
        }
    }*/

    public static void main(String[] args) throws IOException {
        AntlrParser antlrParser = new AntlrParser();
    }

}

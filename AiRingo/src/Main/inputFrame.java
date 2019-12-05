package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.prefs.Preferences;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.JTextComponent;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import org.fife.ui.autocomplete.AutoCompletion;
import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.Completion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.DefaultCompletionProvider;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxScheme;
import org.fife.ui.rtextarea.RTextScrollPane;


public class inputFrame extends JFrame {

    private JPanel contentPane;
    private Main main;
    Preferences prefs;
    private RTextScrollPane scrollPane;
    private RSyntaxTextArea textArea;
    private JButton btnScan;
    private JButton btnParse;
    private JButton btnInterpret;
    private JSeparator separator;
    private JTextField textField_1;
    //    private JTextField txtSearch;
    private JSplitPane splitPane;
    private JSplitPane lowerSplitPane;
    private JTextPane textPane;
    private JPanel panel;
    StyleContext sc;
    AttributeSet asetRed;
    AttributeSet asetBlack;
    private JButton btnClearConsole;
    private JScrollPane scrollPane_1;
    private JScrollPane scrollPane_2;
    private JLabel icon;

    private JTextPane variablePane;


    public void setSplitPanes(){
        splitPane.setDividerLocation(0.5);
        lowerSplitPane.setDividerLocation(0.5);
    }
    public inputFrame() {
        this.sc = StyleContext.getDefaultStyleContext();
        this.asetRed = this.sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Color.RED);
        this.asetBlack = this.sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Color.BLACK);
        addWindowListener(new WindowAdapter() {
                              public void windowClosing(WindowEvent arg0) {
                                  inputFrame.this.prefs.put("init", inputFrame.this.textArea.getText());
                                  inputFrame.this.prefs.putInt("width", inputFrame.this.getWidth());
                                  inputFrame.this.prefs.putInt("height", inputFrame.this.getHeight());
                                  inputFrame.this.prefs.putInt("x", inputFrame.this.getX());
                                  inputFrame.this.prefs.putInt("y", inputFrame.this.getY());
                              }
                          }
        );
        setDefaultCloseOperation(3);
        setBounds(100, 100, 1366, 720);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(this.contentPane);
        setTitle("JAVA");
        this.splitPane = new JSplitPane();
        this.splitPane.setOneTouchExpandable(true);
        this.splitPane.setOrientation(0);
        this.contentPane.add(this.splitPane, "Center");
        this.panel = new JPanel();
        this.splitPane.setLeftComponent(this.panel);

        this.lowerSplitPane= new JSplitPane();
        this.lowerSplitPane.setOneTouchExpandable(true);
        this.lowerSplitPane.setOrientation(1);
        this.panel.setLayout(new BorderLayout(0, 0));
        JToolBar toolBar = new JToolBar();
        this.panel.add(toolBar, "North");
        btnParse = new JButton("Parse");
        btnParse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                inputFrame.this.parseButtonPressed();
            }
        });
        this.btnScan = new JButton("Scan");
        this.btnScan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                inputFrame.this.scanButtonPressed();
            }
        });
        this.icon = new JLabel();
        this.icon.setText("");
        toolBar.add(this.icon);
        toolBar.add(this.btnScan);
        toolBar.add(this.btnParse);
        this.separator = new JSeparator();
        toolBar.add(this.separator);
        this.btnInterpret = new JButton("Interpret");
        this.btnInterpret.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                inputFrame.this.interpretButtonPressed();
            }
        });
        toolBar.add(this.btnInterpret);
        this.btnClearConsole = new JButton("Clear Console");
        this.btnClearConsole.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                inputFrame.this.clearButtonPressed();
            }
        });
        toolBar.add(this.btnClearConsole);
        this.textField_1 = new JTextField();
        this.textField_1.setEditable(false);
        toolBar.add(this.textField_1);
        this.textField_1.setColumns(10);
        this.scrollPane = new RTextScrollPane();
        this.panel.add((Component) this.scrollPane, "Center");
        CompletionProvider provider = createCompletionProvider();
        AutoCompletion ac = new AutoCompletion(provider);
        this.textArea = new RSyntaxTextArea();
        this.textArea.setWrapStyleWord(true);
        this.textArea.setFont(new Font("Courier New", 0, 14));
        this.textArea.setWrapStyleWord(true);
        this.textArea.setFont(new Font("Courier New", 0, 14));
        this.textArea.setSyntaxEditingStyle("text/java");
        this.textArea.setAutoIndentEnabled(true);
        this.textArea.setAnimateBracketMatching(true);
        this.textArea.setBracketMatchingEnabled(true);
        this.textArea.setCloseCurlyBraces(true);
        this.textArea.setMarkOccurrences(true);
        this.textArea.setCloseMarkupTags(true);
        SyntaxScheme scheme = this.textArea.getSyntaxScheme();
        (scheme.styles[16]).foreground = Color.black;
        (scheme.styles[2]).foreground = Color.gray;
        (scheme.styles[15]).foreground = Color.black;
        (scheme.styles[4]).foreground = Color.magenta.darker();
        (scheme.styles[13]).foreground = Color.blue;
        (scheme.styles[15]).foreground = Color.black;
        (scheme.styles[18]).foreground = Color.black;
        (scheme.styles[17]).foreground = Color.black;
        (scheme.styles[6]).foreground = Color.green.darker();
        (scheme.styles[11]).foreground = Color.green.darker();
        (scheme.styles[7]).foreground = Color.green.darker();
        (scheme.styles[8]).foreground = Color.green.darker();
        (scheme.styles[9]).foreground = Color.green.darker();
        (scheme.styles[10]).foreground = Color.green.darker();
        this.scrollPane.setViewportView((Component) this.textArea);
        ac.install((JTextComponent) this.textArea);
        this.scrollPane_1 = new JScrollPane();
        this.scrollPane_2 = new JScrollPane();
        this.splitPane.setRightComponent(this.lowerSplitPane);
        variablePane = new JTextPane();
        this.lowerSplitPane.setLeftComponent(this.scrollPane_1);
        this.lowerSplitPane.setRightComponent(this.scrollPane_2);
        this.textPane = new JTextPane();
//        this.textPane.setEditable(false);
        this.scrollPane_1.setViewportView(this.textPane);
        this.scrollPane_2.setViewportView(this.variablePane);
        this.textPane.setFont(new Font("Lucida Console", 0, 11));
        this.variablePane.setFont(new Font("Lucida Console", 0, 11));

        setPreference();


    }

    private CompletionProvider createCompletionProvider() {
        DefaultCompletionProvider provider = new DefaultCompletionProvider();
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "do"));
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "else"));
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "typedef"));
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "for"));
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "if"));
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "return"));
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "void"));
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "while"));
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "pointer"));
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "main"));
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "func"));
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "struct"));
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "print"));
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "println"));
        provider.addCompletion((Completion) new BasicCompletion((CompletionProvider) provider, "scan"));
        return (CompletionProvider) provider;
    }


    public inputFrame(Main m) {
        this();
        this.main = m;
    }

//    protected void findText(boolean forward) {
//        String text = this.txtSearch.getText();
//        if (text.length() == 0)
//            return;
//        boolean wholeWord = false;
//        boolean found = SearchEngine.find((JTextArea) this.textArea, text, forward, false, wholeWord, false);
//        if (!found) {
//            int pos = this.textArea.getCaretPosition();
//            if (forward) {
//                this.textArea.setCaretPosition(0);
//            } else {
//                this.textArea.setCaretPosition(this.textArea.getText().length());
//            }
//            boolean found2 = SearchEngine.find((JTextArea) this.textArea, text, forward, false, wholeWord, false);
//            if (!found2) {
//                this.textArea.setCaretPosition(pos);
//                JOptionPane.showMessageDialog(this, "Text not found");
//            }
//        }
//    }

    private void setPreference() {
        this.prefs = Preferences.userNodeForPackage(inputFrame.class);
        String starterText = "pablik klas Main{\n" +
                "\tpablik Main(){\n" +
                "\t\t// Enter main code here\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "Main m = new Main();";
        String text = this.prefs.get("init", "");
        int width = this.prefs.getInt("width", 400);
        int height = this.prefs.getInt("height", 300);
        int x = this.prefs.getInt("x", 100);
        int y = this.prefs.getInt("y", 100);
        this.textArea.setText(starterText);
        setBounds(x, y, width, height);
    }

    protected void scanButtonPressed() {
        this.main.scan(this.textArea.getText());
    }

    protected void parseButtonPressed() {
        this.main.parse(this.textArea.getText());
    }

    protected void interpretButtonPressed() {
        this.main.run(this.textArea.getText());
    }

    protected void clearButtonPressed() {
        this.textPane.setText("");
        this.variablePane.setText("");
    }

    public void printOutput(String s) {
        int len = this.textPane.getDocument().getLength();
        this.textPane.setCaretPosition(len);
        this.textPane.setCharacterAttributes(this.asetBlack, false);
        this.textPane.replaceSelection(s);
    }

    public void printError(String s) {
        int len = this.textPane.getDocument().getLength();
        this.textPane.setCaretPosition(len);
        this.textPane.setCharacterAttributes(this.asetRed, false);
        this.textPane.replaceSelection(s);
    }

    public String getInput(String s){
        return (String)JOptionPane.showInputDialog(
                this,
                s,
                "Input",
                JOptionPane.PLAIN_MESSAGE);
    }

    public void printVariables(String s){
        variablePane.setText(s);
    }
}

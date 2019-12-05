package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.lang.reflect.Array;
import java.util.LinkedList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.fife.ui.autocomplete.AutoCompletion;
import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.DefaultCompletionProvider;
import org.fife.ui.autocomplete.FunctionCompletion;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.SyntaxScheme;
import org.fife.ui.rtextarea.RTextScrollPane;
import org.fife.ui.rsyntaxtextarea.Token;

import SyntaxColor.MiniJavaScanner;
import SyntaxColor.SyntaxHighlighter;

/**
 *
 * @author Jeleen
 */
public class ScrollPane extends JScrollPane implements KeyListener{
   private String directory;
    public JPanel panel = new JPanel(new BorderLayout());
    public RSyntaxTextArea typeArea;
    public UndoManager manager = new UndoManager();
    Color green = new Color(50,205,50);
    Color orange = new Color(244,164,96);


    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public void setNameDirectory(String name, String directory){
        setName(name);
        setDirectory(directory);
    }

    public ScrollPane() {
        initComponents();
    }
    
    private void initComponents(){
    	List funcnames= new List();
        typeArea = new RSyntaxTextArea();
        typeArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        typeArea.setAutoIndentEnabled(true);
        typeArea.setAnimateBracketMatching(true);
        typeArea.setBracketMatchingEnabled(true);
        typeArea.setCloseCurlyBraces(true);
        typeArea.setMarkOccurrences(true);
        typeArea.setCloseMarkupTags(true);
        
        //CompletionProvider complete = createCompletionProvider(new LinkedList<String>());
        typeArea.addKeyListener(this);
        
        
        RTextScrollPane sp = new RTextScrollPane(typeArea);
        panel.add(sp);

        SyntaxScheme scheme = typeArea.getSyntaxScheme();

          scheme.styles[Token.WHITESPACE].foreground =  Color.black;
          scheme.styles[Token.COMMENT_MULTILINE].foreground =  Color.gray;
          scheme.styles[Token.IDENTIFIER].foreground = Color.green.darker();
          scheme.styles[Token.RESERVED_WORD].foreground =  Color.blue;
          scheme.styles[Token.DATA_TYPE].foreground =  Color.blue;
          scheme.styles[Token.IDENTIFIER].foreground =  Color.green.darker();
          scheme.styles[Token.OPERATOR].foreground =  Color.black;
          scheme.styles[Token.SEPARATOR].foreground =  Color.black;
          scheme.styles[Token.FUNCTION].foreground =  Color.green;

        setViewportView(panel);

        typeArea.getDocument().addUndoableEditListener(new UndoableEditListener() {
            public void undoableEditHappened(UndoableEditEvent e) {
                    manager.addEdit(e.getEdit());
            }
        });
    }
    public String getSourceCode(){
        return typeArea.getText();
    }

    public void undo(){
        if(manager.canUndo())
            manager.undo();
    }

    public void redo(){
        if(manager.canRedo())
            manager.redo();

    }

    public CompletionProvider createCompletionProvider(LinkedList<String> nList) {

      // A DefaultCompletionProvider is the simplest concrete implementation
      // of CompletionProvider.  This provider has no understanding of
      // language semantics. It simply checks the text entered up to the
      // caret position for a match against known completions. This is all
      // that is needed in the majority of cases.
      DefaultCompletionProvider provider = new DefaultCompletionProvider();
      //provider.clear();
      // Add completions for all Java keywords.  A BasicCompletion is just
      // a straightforward word completion.
      System.out.println("completion");
      for(int i = 0; i<nList.size(); i++)
    	  provider.addCompletion(new BasicCompletion(provider, nList.get(i)));
      /*
      provider.addCompletion(new BasicCompletion(provider, "do"+"\n{ }"+"while( )"));
      provider.addCompletion(new BasicCompletion(provider, "else"));
      provider.addCompletion(new BasicCompletion(provider, "for"));
      provider.addCompletion(new BasicCompletion(provider, "if( )"));
      provider.addCompletion(new BasicCompletion(provider, "func"));
      provider.addCompletion(new BasicCompletion(provider, "return"));
      provider.addCompletion(new BasicCompletion(provider, "void"));
      provider.addCompletion(new BasicCompletion(provider, "main"));
      provider.addCompletion(new BasicCompletion(provider, "scan"));
      provider.addCompletion(new BasicCompletion(provider, "print"));
      //DataTypes
      provider.addCompletion(new BasicCompletion(provider, "int"));
      provider.addCompletion(new BasicCompletion(provider, "float"));
      provider.addCompletion(new BasicCompletion(provider, "string"));
      provider.addCompletion(new BasicCompletion(provider, "char"));
      provider.addCompletion(new BasicCompletion(provider, "bool"));*/
      
      return provider;

   }

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		LinkedList exList=new LinkedList();
		System.out.println(arg0.getKeyChar());
		if(arg0.getKeyChar()=='@')
		{	String trial;
			trial=typeArea.getText();

			CompletionProvider complete = new DefaultCompletionProvider();
			if(trial.contains("func @"))
			{
				String[] funclist=trial.split("func @");
				System.out.println("funclist length is "+ funclist.length);
				int i=0;
				for(i=0; i<funclist.length; i++)
				{
					int cj=0;
					String temp="";
					while(cj<funclist[i].length())
					{
						System.out.println("funclist: "+funclist[i]);
						System.out.println("temp is "+ temp);
						if(funclist[i].charAt(cj)!=')' )
						{
							temp+=funclist[i].charAt(cj);
							System.out.println("temp: "+temp);
						}
						else
							break;
						cj++;
					}
					exList.add(temp);
				 ((DefaultCompletionProvider)complete).addCompletion(new BasicCompletion(complete,temp+")"));
				}	
				AutoCompletion auto = new AutoCompletion(complete);
		        auto.install(typeArea);
			}
		}
		
		
		
	}
}

package javaswing018_menus;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame
{
  private TextPanel mTextPanel;
  
  private Toolbar mToolbar;
  private FormPanel mFormPanel;
 
 
  public MainFrame()
  {
    super ("Hello World");
   
    setLayout (new BorderLayout());
   
    mTextPanel= new TextPanel();
    
    mToolbar = new Toolbar();
    mFormPanel = new FormPanel();
    
    setJMenuBar(createMenuBar());
    
    // pass a callback to mToolbar which would be called when buttons are pressed
    mToolbar.setStringListener(new StringListener(){

		@Override
		public void textEmitted(String text)
		{
			mTextPanel.appendText(text);
			
		}
    	
    });
    
    mFormPanel.setFormEventListener(new FormEventListener(){
      
      @Override
      public void formEventOccurred (FormEvent e)
      {
        String name = e.getName();
        String occupation = e.getOccupation();
        
        int ageCategoryIndex = e.getAgeCategory();
        String empCat = e.getEmploymentCategory();
        String taxId = e.getTaxId();
        String gender = e.getGender();
        
        
        mTextPanel.appendText(name + ": " + occupation + ": " + ageCategoryIndex + ": " + empCat + ": " + taxId+ ": " + gender + "\n");
      }
    });
                               
   
    add (mTextPanel, BorderLayout.CENTER);

    add (mToolbar, BorderLayout.NORTH);
    
    add (mFormPanel, BorderLayout.WEST);
   
    
   
    
    
    setSize(600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  private JMenuBar createMenuBar()
  {
	  JMenuBar menuBar = new JMenuBar();
	  
	  JMenu fileMenu = new JMenu("File");
	  
	  
	  JMenuItem exportDataItem = new JMenuItem("Export Data...");
	  JMenuItem importDataItem = new JMenuItem("Import Data...");
	  JMenuItem exitItem = new JMenuItem("Exit");
	  
	  fileMenu.add(exportDataItem);
	  fileMenu.add(importDataItem);
	  fileMenu.addSeparator();
	  fileMenu.add(exitItem);
	  
	  JMenu windowMenu = new JMenu("Window");
	  
	  JMenu showMenu = new JMenu("Show");
	  JMenuItem showFormItem = new JMenuItem("Person Form");
	  showMenu.add(showFormItem);
	  windowMenu.add(showMenu);
	  
	  menuBar.add(fileMenu);
	  menuBar.add(windowMenu);
	  //menuBar.add(showMenu);
	  
	  return menuBar;
	  
  }
 
 
}
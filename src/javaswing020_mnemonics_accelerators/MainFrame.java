package javaswing020_mnemonics_accelerators;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

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
	  JCheckBoxMenuItem showFormCheckBoxItem = new JCheckBoxMenuItem("Person Form");
	  showFormCheckBoxItem.setSelected(true);
	  showMenu.add(showFormCheckBoxItem);
	  windowMenu.add(showMenu);
	  
	  menuBar.add(fileMenu);
	  menuBar.add(windowMenu);
	  //menuBar.add(showMenu);
	  
	  showFormCheckBoxItem.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			JCheckBoxMenuItem menuItem = (JCheckBoxMenuItem)e.getSource();
			
			mFormPanel.setVisible(menuItem.isSelected());
			
		}
		  
	  });
	  
	  fileMenu.setMnemonic(KeyEvent.VK_F);
	  exitItem.setMnemonic(KeyEvent.VK_X);
	  windowMenu.setMnemonic(KeyEvent.VK_W);
	  
	  exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
	  
	  
	  exitItem.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
			
		}
		  
			  
	  });
	  
	  return menuBar;
	  
  }
 
 
}
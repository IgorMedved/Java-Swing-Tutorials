package javaswing015_combobox;

import java.awt.BorderLayout;

import javax.swing.JFrame;

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
        
        mTextPanel.appendText(name + ": " + occupation + ": " + ageCategoryIndex + "\n");
      }
    });
                               
   
    add (mTextPanel, BorderLayout.CENTER);

    add (mToolbar, BorderLayout.NORTH);
    
    add (mFormPanel, BorderLayout.WEST);
   
    
   
    
    
    setSize(600,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
 
 
}
package javaswing007_interfaces_for_communication;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame
{
  private TextPanel mTextPanel;
  
  private Toolbar mToolbar;
 
 
  public MainFrame()
  {
    super ("Hello World");
   
    setLayout (new BorderLayout());
   
    mTextPanel= new TextPanel();
    
    mToolbar = new Toolbar();
    
    // pass a callback to mToolbar which would be called when buttons are pressed
    mToolbar.setStringListener(new StringListener(){

		@Override
		public void textEmitted(String text)
		{
			mTextPanel.appendText(text);
			
		}
    	
    });
   
    add (mTextPanel, BorderLayout.CENTER);

    add (mToolbar, BorderLayout.NORTH);
   
    
   
    
    
    setSize(600,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
 
 
}
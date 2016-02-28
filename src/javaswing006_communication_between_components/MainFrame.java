package javaswing006_communication_between_components;

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
    
    mToolbar.setTextPanel(mTextPanel);
   
    add (mTextPanel, BorderLayout.CENTER);

    add (mToolbar, BorderLayout.NORTH);
   
    
   
    
    
    setSize(600,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
 
 
}
package javaswing004_panels_modulardesign;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MainFrame extends JFrame
{
  private TextPanel mTextPanel;
  private JButton mBtn;
  
  
  public MainFrame()
  {
    super ("Hello World");
    
    setLayout (new BorderLayout());
    
    mTextPanel= new TextPanel();
    mBtn = new JButton("Click me!" );
    
    add (mTextPanel, BorderLayout.CENTER);
    add (mBtn, BorderLayout.SOUTH);
    
    mBtn.addActionListener(new ActionListener()
    {
      
      @Override
      public void actionPerformed(ActionEvent e)
      {
        mTextPanel.appendText("Hello\n");
      }
      
                            
     });
    
    setSize(600,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  
}
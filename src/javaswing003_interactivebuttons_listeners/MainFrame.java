package javaswing003_interactivebuttons_listeners;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame
{
  private JTextArea mTextArea;
  private JButton mBtn;
  
  
  public MainFrame()
  {
    super ("Hello World");
    
    setLayout (new BorderLayout());
    
    mTextArea = new JTextArea();
    mBtn = new JButton("Click me!" );
    
    add (mTextArea, BorderLayout.CENTER);
    add (mBtn, BorderLayout.SOUTH);
    
    mBtn.addActionListener(new ActionListener()
    {
      
      @Override
      public void actionPerformed(ActionEvent e)
      {
        mTextArea.append("Hello\n");
      }
      
                            
     });
    
    setSize(600,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  
}
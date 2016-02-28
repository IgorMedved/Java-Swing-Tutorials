package javaswing002_layouts_buttons;

import java.awt.BorderLayout;

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
    
    
    
    setSize(600,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  
}

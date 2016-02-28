package javaswing005_toolbar_morecomponents;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel
{
  private JButton mHelloButton;
  private JButton mGoodbyeButton;
  
  public Toolbar()
  {
    mHelloButton = new JButton ("Hello");
    mGoodbyeButton = new JButton ("Goodbye!");
    
    setLayout (new FlowLayout(FlowLayout.LEFT));
    
    add (mHelloButton);
    add (mGoodbyeButton);
  }
  
}

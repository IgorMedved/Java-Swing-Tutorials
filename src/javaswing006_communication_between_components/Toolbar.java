package javaswing006_communication_between_components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener
{
  private JButton mHelloButton;
  private JButton mGoodbyeButton;
  
  private TextPanel mTextPanel; // bad practice Toolbar should have no knowledge of TextPanel
  								// use stringListener interface instead
 
  public Toolbar()
  {
    mHelloButton = new JButton ("Hello");
    mGoodbyeButton = new JButton ("Goodbye!");
   
    setLayout (new FlowLayout(FlowLayout.LEFT));
   
    add (mHelloButton);
    add (mGoodbyeButton);
    
    mHelloButton.addActionListener(this);
    mGoodbyeButton.addActionListener(this);
  }
  
  @Override
  public void actionPerformed(ActionEvent e)
  {
    if (mTextPanel!=null)
    {
      JButton buttonClicked = (JButton)e.getSource();
      
      if (buttonClicked == mHelloButton)
      {
        mTextPanel.appendText("Hello\n"); // a string listener interface passing string "Hello" should be used instead!!!
      }
      else if (buttonClicked == (JButton)e.getSource())
      {
        mTextPanel.appendText("Goodbye!\n");
      }
    }
    
  }
  
  
  // pass Text panel to Toolbar so that one can react to button presses on 
  // Toolbar buttons. Bad practice as toolbar should have no knowledge of TextPanel existence
  public void setTextPanel (TextPanel textPanel)
  {
    mTextPanel = textPanel;
  }
  
               
 
}

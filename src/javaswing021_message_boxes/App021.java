package javaswing021_message_boxes;

import javax.swing.SwingUtilities;

public class App021
{

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{

			@Override
			public void run()
			{
				MainFrame testFrame = new MainFrame();
			}
		});

	}
  
  	
  

}
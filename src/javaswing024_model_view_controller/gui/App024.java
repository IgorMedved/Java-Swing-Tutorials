package javaswing024_model_view_controller.gui;

import javax.swing.SwingUtilities;

public class App024
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
package javaswing018_menus;

import javax.swing.SwingUtilities;

public class App018
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
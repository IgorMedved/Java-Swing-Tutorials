package javaswing004_panels_modulardesign;

import javax.swing.SwingUtilities;

public class App004
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

package javaswing003_interactivebuttons_listeners;

import javax.swing.SwingUtilities;

public class App003
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

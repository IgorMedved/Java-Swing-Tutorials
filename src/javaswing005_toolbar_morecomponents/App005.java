package javaswing005_toolbar_morecomponents;

import javax.swing.SwingUtilities;

public class App005
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

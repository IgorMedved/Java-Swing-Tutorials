package javaswing007_interfaces_for_communication;

import javax.swing.SwingUtilities;

public class App007
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

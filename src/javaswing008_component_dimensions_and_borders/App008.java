package javaswing008_component_dimensions_and_borders;

import javax.swing.SwingUtilities;

public class App008
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

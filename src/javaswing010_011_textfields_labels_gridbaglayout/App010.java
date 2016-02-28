package javaswing010_011_textfields_labels_gridbaglayout;

import javax.swing.SwingUtilities;

public class App010
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

package javaswing015_combobox;

import javax.swing.SwingUtilities;

public class App015
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
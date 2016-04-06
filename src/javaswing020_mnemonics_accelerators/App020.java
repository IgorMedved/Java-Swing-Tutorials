package javaswing020_mnemonics_accelerators;

import javax.swing.SwingUtilities;

public class App020
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
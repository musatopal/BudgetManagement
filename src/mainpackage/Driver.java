package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;

/** main class **/
public class Driver 
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				GUI_PersonalBudget GUI = new GUI_PersonalBudget();
			}
		});
	}
}
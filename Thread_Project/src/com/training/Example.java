package com.training;

public class Example extends Thread {

	public void run()
	{
		for (int i=0; i<=2;i++)
		{
			if (this.isInterrupted())
			{
				System.out.println("Sorry for Interuption");
			}
			
			else
			{
				System.out.println("Hello");
				
			}
		}
	}
}

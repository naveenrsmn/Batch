package com.training;

import java.io.IOException;

public class ReadInfo extends Thread {

	public void run()
	{
		System.out.println("Start Reading");
		
		try {
			System.out.println(this.isAlive());
			System.in.read();
			} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Finished Reading");
	}
}

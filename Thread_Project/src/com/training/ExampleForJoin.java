package com.training;

public class ExampleForJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Main Starting");
		
		Thread info = new ReadInfo();
		Thread info1 = new ReadInfo();
		
		info.start();
		
		try
		{
			info.join();
			info1.start();
			System.out.println("Interrupted inside block " + info.isInterrupted());
			
			
		}catch (InterruptedException e)
		{
			e.printStackTrace();
			System.out.println("Interrupted inside catch block " + info.isInterrupted());
		}
		System.out.println("Interrupted " + info.isInterrupted());
		System.out.println(info.isAlive());
		System.out.println("Main Finished");
		//info.start();
	}

}

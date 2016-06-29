package com.training;

public class ExampleForSleep {

	public static void main(String[] args) {
		try
		{
		System.out.println("5999");
		Thread.sleep(1000);
		
		System.out.println("Sapient");
		
		Thread.sleep(1000);
		System.out.println("Brilliant");
		
		Thread.sleep(1000);
		System.out.println("Batch");
		
		Thread.sleep(1000);
		System.out.println("B");
		} catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}
		
		
		
}


package com.training;

public class UsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable runnable1= new SecondThread();
		
		Thread thread1 =new Thread(runnable1,"Suaesh");
		Thread thread2 =new Thread(runnable1,"Subesh");
		Thread thread3 =new Thread(runnable1,"Sucesh");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}

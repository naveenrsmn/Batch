package com.training;

public class TestInterruption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example e1 = new Example();
		e1.start();
		System.out.println("Check"+ e1.isInterrupted());
		e1.interrupt();
		
		Example e2 = new Example();
		e2.start();
	}

}

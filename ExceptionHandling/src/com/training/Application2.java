package com.training;

public class Application2 {
	public static void main(String[] args)
	{
		int num =45;
		
		try {
			int den =Integer.parseInt(args[0]);
			System.out.println(num/den);
		} catch (ArithmeticException e) {
			System.out.println("");
			// TODO: handle exception
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Pass Command Line Argument");
		}
		catch (Exception e)
		{
			System.out.println("Exception Denomination");
		}
	}
}

package com.training;

public class Application {
public static void main(String[] args)
	{
	try
		{
		Book bk1 = new Book(101,4500,"Java");
		Book bk2 = new  Book(101,4500,"Java");
		System.out.println(bk1.equals(bk2));
		Book bk3 = bk2;
		System.out.println(bk2.equals(bk3));
		Book bk4= null;
		System.out.println(bk1.equals(bk4));
		String name = new String("Ramesh");
		System.out.println(bk1.equals(name));
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

package com.training;

public class bookManager
{
// static functions and arrays	
public static void printBooks(Book[] bks)
	{
	/*
	 * Static method
	 * arrays
	 * For Each Loop
	 */
		for (Book bk : bks)
		{
			System.out.println(bk);
			System.out.println("Discount :="+ findDiscount(bk.getPrice()));
			
			
		}
	}

/*auto boxing
 * 
 */
	public static double findDiscount(Double price)
	{
		return price*.10;
	}
}

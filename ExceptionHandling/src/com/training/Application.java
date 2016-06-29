package com.training;

public class Application {
	public static void main(String[] args)
	{
		try 
		{
			Book bk= new Book(10,"Head First Java",500.0);
			
		
		}catch (Exception e)
		{
			System.out.println("Exception Cause" + e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Inside Finally Block");
		
		}
		
		Book bk2=new Book();
				bk2.setBookName("Effective jave");
				bk2.setBookNumber(202);
				bk2.setPrice(2000);
		
	}

}

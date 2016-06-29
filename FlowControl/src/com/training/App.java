package com.training;

public class App {
	public static void main(String[] args)
	{
		Book book1= new Book(100,"harrypotter",1000);
		System.out.println(book1);
		
		Book book2 = new Book(200,"Inferno",2000);
		
		Book[] bks =new Book[2];
		
		bks[0]=book1;
		bks[1]=book2;
		
		bookManager.printBooks(bks);
		//
		
	}
}

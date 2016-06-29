package com.training;

import java.util.Scanner;

public class Application {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int s,type;
		Media[] m =new Media[20];
		//Book[] b = new Book[5];
		//DVD[] d = new DVD[5];
		//Periodical[] p = new Periodical[5];
		m[0]=b;
		int i=0,j=0,k=0;;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Select One: 1.Store Data or 2.Retrieve Data ");
		s=sc.nextInt();
		switch (s)
		{
		case 1:
		{
			System.out.println("Select One: 1.Book or 2.DVD 3. Periodicals");
			type=sc.nextInt();
			switch (type)
			{
			case 1:
				{
					System.out.println("Enter title, type, rating, price, author, isbn, volumeNumber ");
					b[i].setTitle(sc.nextLine());
					b[i].setType(sc.nextLine());
					b[i].setRating(sc.nextLine());
					b[i].setPrice(sc.nextDouble());
					b[i].setAuthor(sc.nextLine());
					b[i].setIsbn(sc.nextInt());
					b[i].setVolumeNumber(sc.nextDouble());
					i++;
					
					break;
				}
			case 2:
				{
				System.out.println("Enter title, type, rating, price, Running time ");
				d[j].setTitle(sc.nextLine());
				d[j].setType(sc.nextLine());
				d[j].setRating(sc.nextLine());
				d[j].setPrice(sc.nextDouble());
				d[j].setRunningTime(sc.nextDouble());
				j++;
				break;
				}
			
				case 3:
				{
					System.out.println("Enter title, type, rating, price, month of Issue ");
					p[k].setTitle(sc.nextLine());
					p[k].setType(sc.nextLine());
					p[k].setRating(sc.nextLine());
					p[k].setPrice(sc.nextDouble());
					p[k].setmonthofIssue(sc.nextDouble());
					k++;
				break;
				}
			}
			break;
		}
			
		case 2:
		{
			
			break;
		}
		}
	}
}

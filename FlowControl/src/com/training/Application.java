package com.training;

import java.util.Scanner;

public class Application {

	public static void main(String[] args){
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Consumer Number");
			long consumerNumber =sc.nextLong();
		
		System.out.println("Consumer Name");
			String consumerName = sc.next();
			
		System.out.println("Current Month Reading");
			double currentMonthReading= sc.nextDouble();
			
		System.out.println("last Month Reading");
			double lastMonthReading= sc.nextDouble();
			
		System.out.println("Consumer Type [DOM - COM]");
			String consumerType = sc.next();
			
			
		MeterReading reading = new MeterReading(consumerNumber, consumerName,lastMonthReading,currentMonthReading,consumerType);
			
		
		
		BillManager mgr1= new BillManager();
		double amt1=mgr1.calculateBillAmount(reading);
		System.out.print(amt1);
		
		
		BillManager mgr2 = new BillManager(new MeterReading(102,"ganesh", 100,300,"DOM" ));
		double amt2 = mgr2.calculateBillAmount();
		System.out.print(amt2);;
	
		sc.close();
		
		
	}
}

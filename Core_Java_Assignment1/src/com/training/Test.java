package com.training;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TaxWhiz t= new TaxWhiz(2,5,1000);
		TaxWhiz t1 = new TaxWhiz();
		System.out.println("Total Bill " + t.calctax());
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Current tax rate");
		t1.setCurrentTaxrate(sc.nextDouble());
		
		System.out.println("Enter Surcharge Tax rate");
		t1.setsurChargeRate(sc.nextDouble());

		System.out.println("Enter Purchase");
		t1.setPurchase(sc.nextDouble());
		double p= t1.getPurchase();

		System.out.println("Total Bill " + t1.calctax(p));
		sc.close();
	}

}

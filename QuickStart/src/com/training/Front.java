package com.training;

public class Front {
	public static void main(String[] args)
	{
		Converter c = new Converter(20,35);
		
		System.out.println(c.convertToRupees());
		System.out.print(c.convertToFahrenheit());
		
	
	}
}

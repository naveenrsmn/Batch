package com.training;

public class Application {
public static void main(String[] args){
	LifeInsurance Policy = new LifeInsurance(1001,"Moneyback",50000.00,"QTR");
	PolicyHolder Holder = new PolicyHolder("Ramesh","Reshmi");
	InsuranceAgent Agent = new InsuranceAgent();
	
	double PremiumAmount = Agent.calculatePremium(Policy);
	
	String message = Holder.payPremium(PremiumAmount);
	
	System.out.println(message);
	}
}

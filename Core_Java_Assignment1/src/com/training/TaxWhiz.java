package com.training;

public class TaxWhiz {

private double surChargeRate;
private double currentTaxrate;
private double purchase;
public TaxWhiz() {
	super();
	// TODO Auto-generated constructor stub
}
public TaxWhiz( double surChargeRate, double currentTaxrate, double purchase) {
	super();
	
	this.surChargeRate = surChargeRate;
	this.currentTaxrate = currentTaxrate;
	this.purchase = purchase;
}


public double getsurChargeRate() {
	return surChargeRate;
}
public void setsurChargeRate(double surChargeRate) {
	this.surChargeRate = surChargeRate;
}
public double getCurrentTaxrate() {
	return currentTaxrate;
}
public void setCurrentTaxrate(double currentTaxrate) {
	this.currentTaxrate = currentTaxrate;
}
public double getPurchase() {
	return purchase;
}
public void setPurchase(double purchase) {
	this.purchase = purchase;
}

public double calctax()
	{
			double amt;
			amt= purchase + (purchase*currentTaxrate*0.01)+((purchase*currentTaxrate*0.01)*surChargeRate*0.01);
			return amt;
	}
public double calctax(double p)
{
		double amt;
		amt= p + (p*currentTaxrate*0.01)+((p*currentTaxrate*0.01)*surChargeRate*0.01);
		return amt;
}

}

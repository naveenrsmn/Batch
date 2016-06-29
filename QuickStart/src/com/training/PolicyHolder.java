package com.training;

public class PolicyHolder {
	private String PolicyHolderName;
	private String Nominee;
	public String getPolicyHolderName() {
		return PolicyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		PolicyHolderName = policyHolderName;
	}
	public String getNominee() {
		return Nominee;
	}
	public void setNominee(String nominee) {
		Nominee = nominee;
	}
	
	public PolicyHolder(String policyHolderName, String nominee) {
		super();
		PolicyHolderName = policyHolderName;
		Nominee = nominee;
	}
	public PolicyHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String payPremium(double PremiumAmount)
	{
	return 	PremiumAmount + ": Paid by Cash";
	}
}

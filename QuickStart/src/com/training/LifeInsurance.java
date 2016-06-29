package com.training;

public class LifeInsurance {
		private long PolicyNumber;
		private String PolicyHolder;
		private double PolicyAmount;
		private double Premium;
		private String PaymentMode;
		
		
		
		public LifeInsurance() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		


		public LifeInsurance(long policyNumber, String policyHolder, double policyAmount, String paymentMode) {
			super();
			PolicyNumber = policyNumber;
			PolicyHolder = policyHolder;
			PolicyAmount = policyAmount;
			PaymentMode = paymentMode;
		}





		public long getPolicyNumber() {
			return PolicyNumber;
		}
		public void setPolicyNumber(long policyNumber) {
			PolicyNumber = policyNumber;
		}
		public String getPolicyHolder() {
			return PolicyHolder;
		}
		public void setPolicyHolder(String policyHolder) {
			PolicyHolder = policyHolder;
		}
		public double getPolicyAmount() {
			return PolicyAmount;
		}
		public void setPolicyAmount(double policyAmount) {
			PolicyAmount = policyAmount;
		}
		public double getPremium() {
			return Premium;
		}
		public void setPremium(double premium) {
			Premium = premium;
		}
		public String getPaymentMode() {
			return PaymentMode;
		}
		public void setPaymentMode(String paymentMode) {
			PaymentMode = paymentMode;
		}
		

							}

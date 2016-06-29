package com.training;

public class DVD extends Media {
	private double runningTime;

	public DVD() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DVD(String title, String type, String rating, double price, double runningTime) {
		super(title, type, rating, price);
		this.runningTime = runningTime;
	}


	public double getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(double runningTime) {
		this.runningTime = runningTime;
	}
	

}

package com.training;

public class Periodical extends Media {

	private double monthofIssue;

	public Periodical() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Periodical(String title, String type, String rating, double price, double monthofIssue) {
		super(title, type, rating, price);
		this.monthofIssue = monthofIssue;
	}
	

	public double getmonthofIssue() {
		return monthofIssue;
	}

	public void setmonthofIssue(double monthofIssue) {
		this.monthofIssue = monthofIssue;
	}
	
}

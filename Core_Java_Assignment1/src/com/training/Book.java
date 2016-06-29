package com.training;

public class Book extends Media {
	private String author;
	private int isbn;
	private double volumeNumber;
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, String type, String rating, double price, String author, int isbn, double volumeNumber) {
		super(title, type, rating, price);
		this.author = author;
		this.isbn = isbn;
		this.volumeNumber = volumeNumber;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public double getVolumeNumber() {
		return volumeNumber;
	}
	public void setVolumeNumber(double volumeNumber) {
		this.volumeNumber = volumeNumber;
	}
	
	
}

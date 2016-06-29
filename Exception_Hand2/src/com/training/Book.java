package com.training;

public class Book {
private double bookNo;
private double price;
private String bookName;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(double bookNo, double price, String bookName) {
	super();
	this.bookNo = bookNo;
	this.price = price;
	this.bookName = bookName;
}
public double getBookNo() {
	return bookNo;
}
public void setBookNo(double bookNo) {
	this.bookNo = bookNo;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if (this == obj)
		return true;
	if (obj==null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	
	Book bk =(Book)obj;
	return bk.bookName.equals(this.bookName) && bk.bookNo== this.bookNo && bk.price==this.price;
	
	
}

}

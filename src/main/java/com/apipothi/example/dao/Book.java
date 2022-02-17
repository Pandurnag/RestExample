package com.apipothi.example.dao;

public class Book {
	
	int bookid;
	String bookName;
	int bookprice;
	
	public Book() {
		
	}
	
	public Book(int bookid, String bookName, int bookprice) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.bookprice = bookprice;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookName=" + bookName + ", bookprice=" + bookprice + "]";
	}
		

}

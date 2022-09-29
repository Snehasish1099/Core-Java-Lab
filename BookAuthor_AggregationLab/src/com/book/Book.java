//3. Write a program to show aggregation of a book and author class
//@author: Snehasish
//@date: 

package com.book;

public class Book {

	// instance variables
	private String bookName;
	private double price;
	private Author author;

	// creation of parameterized constructor
	public Book(String bookName, double price, Author author) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}

	// getters and setters
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return ", Book: " + bookName + ", Price = " + price;
	}

}

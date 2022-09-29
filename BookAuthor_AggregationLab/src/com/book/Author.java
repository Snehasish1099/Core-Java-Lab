//3. Write a program to show aggregation of a book and author class
//@author: Snehasish
//@date: 

package com.book;

public class Author {

	private String authorName;
	private String birthPlace;

	public Author(String authorName, String birthPlace) {
		super();
		this.authorName = authorName;
		this.birthPlace = birthPlace;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	@Override
	public String toString() {
		return "Author: " + authorName + ", Born = " + birthPlace;
	}
}
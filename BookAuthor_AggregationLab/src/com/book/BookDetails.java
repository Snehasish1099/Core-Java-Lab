//3. Write a program to show aggregation of a book and author class
//@author: Snehasish
//@date: 

package com.book;

public class BookDetails {

	static void display(Author a, Book b) {
		System.out.println(" " + a + " " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The list of books that are available are ");

		Author a1 = new Author("A", "USA");
		Book b1 = new Book("Why so serious? ", 1000, a1);
		display(a1, b1);

		Author a2 = new Author("Snehasish1099", "UK");
		Book b2 = new Book("Kazekage is dead? ", 500, a2);
		display(a2, b2);

		Author a3 = new Author("Snehasish", "USSR");
		Book b3 = new Book("What is the meaning of life? ", 9999, a3);
		display(a3, b3);

		Author a4 = new Author("D", "Germany");
		Book b4 = new Book("Halo Zusammen, danke dir? ", 1999, a4);
		display(a4, b4);

		Author a5 = new Author("Sne Ha Sish", "Japan");
		Book b5 = new Book("Omae wa mou shinderu.....Naniii? ", 15000, a5);
		display(a5, b5);

		Author a6 = new Author("Subham", "India");
		Book b6 = new Book("4 no. goli te gelam kano? Mou kano bewafa? ", 5000, a6);
		display(a6, b6);

	}

}
/* 
Program:
	3.Write a java program to print the tagline of 
	any 5 companies (Enhanced switch case).
		
@author: Snehasish
@date: 15th Sept, 2022
*/

import java.util.Scanner;


class enhancedSwitchCaseLab
{
	//Calling The Main Method
	public static void main(String args[])     
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the company ");
		String company = sc.next();     //Takes the I/P from the user
		
		
		//Starting the Enhanced Switch-Case conditions
		switch (company) 
		{
		case "Google" -> System.out.println("One of my favourite companies is "+company+". I will like to visit the office at least once.");
		case "Amazon" -> System.out.println("One of my favourite companies is "+company+". I really love the products.");
		case "Flipkart" -> System.out.println("One of my favourite companies is "+company+". Another company I would love to visit.");
		case "Microsoft" -> System.out.println("One of my favourite companies is "+company+". Bill Gates is my idol.");
		case "Facebook" -> System.out.println("One of my favourite companies is "+company+". A place full of Angel Priyas.");
		default -> System.out.println("Please write a valid company name");
		}
	}
}
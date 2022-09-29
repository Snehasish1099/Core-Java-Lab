/*
2. Java progam to find whether the character entered 
   is vowel ,consonant ,number and special character.	

@author: Snehasish
@Date: 15th Sept, 2022
*/

import java.util.Scanner;

// Declaring the class 
class AsciiLab{
	
	static void printAsciiValue(char cValue)    //For printing Ascii value of the given character
	{	int asciiValue = cValue;
		System.out.println("The ASCII value of "+cValue +" is : "+asciiValue); 
	}
	
	static void checkChar(char cValue)    //For checking the type of the character
	{	int asciiValue = cValue;
		if ((asciiValue>=65) && (asciiValue <=90))     //For UpperCase alphabets
		{
			if ((cValue == 'A') ||(cValue == 'E') ||(cValue == 'I') || (cValue == 'O') || (cValue == 'U'))
			{
			System.out.println("Vowel");       
			}
			else
			System.out.println("Consonent");
		}
		
		else if ((asciiValue>=97) && (asciiValue <=122))     //For Lowercase alphabets
			{
			if ((cValue == 'a') ||(cValue == 'e') ||(cValue == 'i') || (cValue == 'o') || (cValue == 'u'))
			{
			System.out.println("Vowel");
			}
			else
			System.out.println("Consonent");
		}
		else if((asciiValue>=48)&&(asciiValue<=57))
		{
			System.out.println("It is a Number");  
		}
		else
			System.out.println("It is a Special character");

	}
	
	//Calling The Main Method
	public static void main(String args[])     
	{ 	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		checkChar(ch);
		printAsciiValue(ch);
	}
}
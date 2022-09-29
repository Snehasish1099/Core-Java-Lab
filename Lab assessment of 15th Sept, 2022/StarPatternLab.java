/* 
Program:
	
	2.	   *
		  * *
		 * * *
		* * * * 
		
@author: Snehasish
@date: 15th Sept, 2022
*/

import java.util.Scanner;

//Calling the class
class StarPatternLab
{
	static void pattern(int rows)
	{
		for(int i=1; i<=rows; i++) 			//Beginning of the outer loop
		{
			System.out.println(); 
			for(int spaces=rows; spaces>i; spaces--)
			{
				System.out.print(" ");        	//Beginning of the inner loop
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		}
	}

//Calling the main method
   public static void main(String args[])
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no. of rows: ");
	int num = sc.nextInt();     //Takes the I/P from the user
	pattern(num);
   }
}
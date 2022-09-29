/*
Program: 3. Write a  java program to create a BankBankAcc and 
			display the people with balance less than 1000.
@author: Snehasish
@date: 22nd Sept, 2022
*/

import java.util.*;

//Declaring the class Bank
class Bank
{
	//Start of main method
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		BankAcc[] bankArr = new BankAcc[10];
		
		//Constructor injection
		bankArr[0]=new BankAcc("A", 1, 9999);
		bankArr[1]=new BankAcc("B", 2, 5475);
		bankArr[2]=new BankAcc("C", 3, 7392);
		bankArr[3]=new BankAcc("D", 4, 892);
		bankArr[4]=new BankAcc("E", 5, 9521);
		bankArr[5]=new BankAcc("F", 6, 505);
		bankArr[6]=new BankAcc("G", 7, 642);
		bankArr[7]=new BankAcc("H", 8, 8532);
		bankArr[8]=new BankAcc("I",9, 999);
		bankArr[9]=new BankAcc("J", 10, 1000);
		 
		for(int i = 0; i < bankArr.length ; i++)
		{
			double p = bankArr[i].getBalance();
			// if amount is less than 1000
			if(p<1000)
			{
				System.out.println("Details of Bank account of Id "+(i+1));
				System.out.println("Account Holder: "+bankArr[i].getAccName());
				System.out.println("Account ID: "+bankArr[i].getAccId());
				System.out.println("Balance: "+bankArr[i].getBalance());
			} 
			//bankArr[i] = new BankAcc();
		}
	}
}
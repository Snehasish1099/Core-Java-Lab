/*
Program: 3. Write a  java program to create a BankAccount and 
			display the people with balance less than 1000.
@author: Snehasish
@date: 22nd Sept, 2022
*/

import java.util.*;

//declaring class BankAcc
class BankAcc
{
	//Instance variables
	private String accName;
	public int accId;
	private double balance;
	

	//paramaterized constructor
	BankAcc(String accName, int accId, double balance)
	{
		this.accId = accId;
		this.accName = accName;
		this.balance = balance;
	}
	
	//method to display Bank details
	void displayBankDetails()
	{
    System.out.println("Account Holder:"+ this.accName+" "+ "Account ID:"+ this.accId+ "  "+"Balance: "+this.balance);
	}

	// Setter and getter for...
	
	public void setAccName(String accName)            //accName
	{
		this.accName = accName;
	}
	public String getAccName()
	{
		return this.accName;
	}
	
	
	public void setAccId(int accId)            //accId
	{
		this.accId = accId;					
	}
	public int getAccId()
	{
		return this.accId;
	}
	
	
	public void setBalance(double balance)            //balance
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return this.balance;
	}
	
}
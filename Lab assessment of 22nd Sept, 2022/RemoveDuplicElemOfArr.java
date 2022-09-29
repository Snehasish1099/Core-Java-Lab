/*
Program: 1. Write a Java program to print the duplicate entries , 
			Sort the array and then remove the duplicate entry.	
@author: Snehasish
@date: 22nd Sept, 2022
*/

import java.util.Scanner;
import java.util.*;

class RemoveDuplicElemOfArr
{
	static void inputArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of Array: ");		//Asks the user to give inputs
		int rows = sc.nextInt();
		
		int arr[] = new int[rows];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<rows;i++)
		{	
	     	arr[i] = sc.nextInt();
		}
		
		//For sorting the elements using Bubble sort	
	    int n= arr.length;
		for(int i = 0;i<n-1;i++)
		{
			for(int j = 0;j<n-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j] ;
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				} 
			}   
		}	   

		System.out.println("Array elements after sorting...");		//Displays the sorted array
        displayArray(arr);
		
		System.out.println();
		
		System.out.println("After removing Duplicate elements...");		//Displays the sorted array asfter removing the duplicate elements
        removeDuplicate(arr);
	}
	
	//
	static void displayArray(int arr[])
	{
		System.out.println();
		for(int myrow:arr)
		{
		 System.out.print(myrow+ "  ");		
		}
	}
   
	static void removeDuplicate(int arr[])		//Logic given by ma'am
	{
	   int size = arr.length;
	   int new_size;
	   if(size==0||size==1)
	   {
		   new_size=size;
	   }
	   int temp[] = new int[size];
	   int j=0;
	   for(int i=0;i<size-1;i++)
	   {
		   if(arr[i] != arr[i+1])
		   {
			   temp[j++] = arr[i];
		   }
	   }
	   temp[j++]=arr[size-1];
	   
	   //changing original array
	   for(int i=0; i<j;i++)
	   {
		   arr[i] = temp[i];
	   }
	   
	   //printing after removing duplicate entries
	   
	   for(int i=0;i<j;i++)
	   {
		   System.out.print(arr[i]+"  ");
	   }
	}

	//Declaring main method
	public static void main(String args[])
	{
		inputArray();
	}

}   
/*
Program: 2. Write a Student and create an array of 10 students
			and display the students whose marks are more than 90%.
@author: Snehasish
@date: 22nd Sept, 2022
*/

import java.util.*;

class Student
{
	String name;
	int id;
	float percentage;
	
	Student(String name, int id, float percentage)
	{
		this.name = name;
		this.id = id;
		this.percentage = percentage;
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Percentage: "+percentage);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the total number of students: ");
		int size = sc.nextInt();
		
		Student[] s = new Student[size];
       
        for(int i = 0; i < size; i++)
		{
            System.out.print("Name: ");
            String name = sc.next();
			
            System.out.print("Id: ");
            int id = sc.nextInt();
			
            System.out.print("Percentage: ");
            float percentage = sc.nextFloat();
			
            s[i] = new Student(name, id, percentage);
        }
		
		int check = 0;
		
        for(int i = 0; i < s.length; i++)
		{	
			if(s[i].percentage >= 90)
			{
				System.out.println("The students with 90% and above is/are ");
				s[i].display();
				check = 1;
			}
        }
		if(check == 0)
			System.out.println("Not Found ");
		
	}
}
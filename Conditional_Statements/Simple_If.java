package Conditional_Statements;

import java.util.Scanner;

public class Simple_If {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//int age=22;
		
		System.out.println("Enter your age Here: ");
		int age=scan.nextInt();
		
		if(age>=18) //22>=18 T 10>=18
		{
		System.out.println("You are Eligible to apply Vote "); //TBS	
		}
		//Exit
	}

}

package Conditional_Statements;

import java.util.Scanner;

public class Even_OR_Odd {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
	//int num=22;
	
	System.out.println("Enter any number: ");
	int num=scan.nextInt();
	
	/*
	if(num%2==0)
	{
		System.out.println("Even Number");
	}
	else
	{
		System.out.println("Odd Number");
	}
	*/
	if(num%2==1)
	{
		System.out.println("Odd Number");
		
	}
	else
	{
		System.out.println("Even Number");
	}
	}

}

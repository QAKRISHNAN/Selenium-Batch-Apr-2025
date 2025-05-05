package Conditional_Statements;

import java.util.Scanner;

public class BiggestNumber 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter any three numbers: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		if(num1>num2)  //5 3 2 5>3
		{
			if(num1>num3) //5>2
			{
				System.out.println("Number 1 is Big: "+ num1);
			}
		}
	
		else if(num2>num3) //3>2 T 
		{
			System.out.println("Number 2 is Big: "+ num2);
			
		}
		
		else
		{
			System.out.println("Number 3 is Big: "+ num3);
			
		}
	}
}

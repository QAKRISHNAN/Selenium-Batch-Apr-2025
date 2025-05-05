package Operators;

import java.util.Scanner;

public class Arthametic_Operators 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		
	
		/*
		int a=10,b=5;
		
		System.out.println(a+b); //15
		System.out.println(a-b); //5
		System.out.println(a*b); //50
		System.out.println(a/b); //2
		System.out.println(a%b); //0
		
		System.out.println(10+5); //15
		System.out.println(10-5); //5
		System.out.println(10*5); //50
		System.out.println(10/5); //2
		System.out.println(10%5); //0

		int x=10,y=5;
		
		int sum=x+y;
		int sub=x-y;
		int mul=x*y;
		int div=x/y;
		int mdiv=x%y;
		
		System.out.println(sum); //15
		System.out.println(sub); //5
		System.out.println(mul); //50
		System.out.println(div); //2
		System.out.println(mdiv); //0	
		
	int total=sum+sub+mul+div+mdiv;
	System.out.println(total); //0
	*/
	
		System.out.println("Enter any a,b Values: ");
		//int a=scan.nextInt();
		//int b=scan.nextInt();
		
		float a=scan.nextFloat();
		float b=scan.nextFloat();
		
		System.out.println("Enter any x,y Values: ");
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		System.out.println(a+b); //15
		System.out.println(a-b); //5
		System.out.println(a*b); //50
		System.out.println(a/b); //2
		System.out.println(a%b); //0
				
		int sum=x+y;
		int sub=x-y;
		int mul=x*y;
		int div=x/y;
		int mdiv=x%y;
		
		System.out.println(sum); //15
		System.out.println(sub); //5
		System.out.println(mul); //50
		System.out.println(div); //2
		System.out.println(mdiv); //0	
		
	}

}

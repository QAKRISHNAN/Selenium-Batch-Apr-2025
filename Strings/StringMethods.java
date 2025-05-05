package Strings;

import java.util.Scanner;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
	
		/*//1.length()
	//String s1="Core Java";
	System.out.println("Enter any String: ");
	//String s1=scan.next();
	String s1=scan.nextLine();
	System.out.println("Length: "+ s1.length());
*/
		//2.LowerCase
		String s2="Core Java";
		System.out.println("Actual String: "+s2);
		System.out.println("Lower Case String: "+s2.toLowerCase());
		
		//3.UpperCase
		String s3="core java";
		System.out.println("Actual String: "+s3);
		System.out.println("Upper Case String: "+s3.toUpperCase());
		
		
	}

}

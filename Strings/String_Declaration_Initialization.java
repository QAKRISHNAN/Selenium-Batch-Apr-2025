package Strings;

import java.util.Scanner;

public class String_Declaration_Initialization {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		// Using Literal
		//Static
		//String name1="Ramesh";
		//String name2="Krishna";
	/*
		String name="Krishna";
		System.out.println("Enter any String");
		//String name=scan.next();
		String name=scan.nextLine();
		System.out.println(name);
*/
		//new KeyWord
	String name1=new String("Ramesh");
	String name2=new String("Krishna");
	System.out.println(name1);
	System.out.println(name2);
		
	}

}

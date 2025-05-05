package Arrays;

import java.util.Scanner;

public class IntegerArray 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		/*
		 * //Static Method	
		int htno[]= {101,102,103,104,105};
		
		for(int i=0;i<5;i++) //0<5 5<5
		{
		//System.out.println(htno[i]); //SR MC or MR SC
			System.out.print(htno[i]+"  ");
		}
		*/
		//Memory Allocation
		//datatype arrayvariablename=new datatype[Size];
		
			int htno[]=new int[5];
		
		System.out.println("Enter Arary Elements: ");
		for(int i=0;i<5;i++) //0<5 5<5
		{
		htno[i]=scan.nextInt();
		}
		
		System.out.println("Given Array:");
		for(int i=0;i<5;i++) //0<5 5<5
		{
		//System.out.println(htno[i]); //SR MC or MR SC
			System.out.print(htno[i]+"  ");
		}
}
	
}

package Looping_Statements;

import java.util.Scanner;

public class BloodDonation_Loop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		//for(int i=1;i<=4;i++)
		for(;;)
		{
	
		System.out.println("Enter Your Age Here: ");
		byte age= scan.nextByte();
			
		if(age>=18) //30>=18 T 15>=18 F 
		{
			
			System.out.println("Enter Your Weight Here: ");
			byte weight= scan.nextByte();
			
		if(weight>=40)
			{
				System.out.println("You are Eligible to donate bllod ");
			}
		else //Inner else
		{
			System.out.println("Your weight is under 40." );
			System.out.println("You are not Eligible.");
		}
		
		}
		else //Outer else
		{
			System.out.println("Your age is under 18." );
			System.out.println("You are not Eligible");
		}
		
		

	}
		
	}

}

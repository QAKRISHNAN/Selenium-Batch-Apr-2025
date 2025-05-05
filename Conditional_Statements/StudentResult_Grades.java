package Conditional_Statements;

import java.util.Scanner;

public class StudentResult_Grades {

	public static void main(String[] args) {
		/* A->=80
		 * B->=75
		 * C->=50
		 * D->=45
		 * Fail-<35 
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Student Marks: ");
		//int marks=scan.nextInt();
		float marks=scan.nextFloat();
		
		if(marks<=100 && marks>=80) //99>=80 T 78>=80F 85>=80T
		{  //110<=100 F && 110>=80 T = F  
			System.out.println("A Grade");
		} //Exit 
		
		else if(marks<80 && marks>=75) //78>=80 T  85>=75T
		{
			System.out.println("B Grade");
		}
		
		else if(marks<75 && marks>=50) //85>=75T
		{
			System.out.println("C Grade");
		}
		else if(marks<50 && marks>=45)
		{
			System.out.println("D Grade");
		}
		else if(marks<45 && marks>=35)
		{
			System.out.println("Pass");
		}
		else if(marks<35 && marks>=0)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid marks. Please enter a number between 0 and 100");
		}
	}

}

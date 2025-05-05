package DataType_Variables;

import java.util.Scanner;

public class Student_Information_Dynamic 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
 		
			//Declaration 
			System.out.println("Enter Your RollNO: ");
			short roll_No=scan.nextShort();
			
			System.out.println("Enter Your Name: ");
			String name=scan.next(); 
			
			System.out.println("Enter Your Percentage: ");
			float percentage=scan.nextFloat();
			
			System.out.println("Enter Your Gender: ");
			char gender=scan.next().charAt(0); 
			
			System.out.println("Enter Your Result: ");
			boolean result=scan.nextBoolean();
			
			System.out.println("Student Information");
			System.out.println("Roll Number: "+roll_No);
			System.out.println("Student Name : "+name);
			System.out.println("Percentage: "+percentage);
			System.out.println("Gender: "+gender);
			System.out.println("Result: "+result);

			
	}

}

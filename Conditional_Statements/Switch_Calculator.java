package Conditional_Statements;

import java.util.Scanner;

public class Switch_Calculator {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
			System.out.println("Enter any Two Values Here: ");
			int a=scan.nextInt(),b=scan.nextInt();
			
			System.out.println("CALCULATOR");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulo Division");
			
			System.out.println("Choose your Option: ");
			byte option=scan.nextByte();
			
			switch(option)
			{
			case 1: //1
			{
				int sum=a+b;
				System.out.println("Addition: "+sum);
				break;
				//continue;
			} 		//Exit 
			case 2:
			{
				int sub=a-b;
				System.out.println("Substraction: "+sub);
				break;
			}
			
			case 3:
			{
				int mul=a*b;
				System.out.println("Multiplication: "+mul);
				break;
			}
			
			case 4:
			{
				int div=a/b;
				System.out.println("Division: "+div);
				break;
			}
			
			case 5:
			{
				int mdiv=a%b;
				System.out.println("Modulo Diviison: "+mdiv);
				break;
			}
			default:
			{
				System.out.println("Please Choose 1 to 5 Only ");
				
			}
						
			}
			
	}

}

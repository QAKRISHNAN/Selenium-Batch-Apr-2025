package Conditional_Statements;

import java.util.Scanner;

public class Switch_Calculator_2 
{

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
			String option=scan.next().toLowerCase();
						
			switch(option)
			{
			
			case "addition": //1
			{
				int sum=a+b;
				System.out.println("Addition: "+sum);
				break;
			} 		//Exit 
								
			case "substraction":
			{
				int sub=a-b;
				System.out.println("Substraction: "+sub);
				break;
			}
			
			case "multification":
			{
				int mul=a*b;
				System.out.println("Multiplication: "+mul);
				break;
			}
			
			case "division":
			{
				int div=a/b;
				System.out.println("Division: "+div);
				break;
			}
			
			case "modulo":
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

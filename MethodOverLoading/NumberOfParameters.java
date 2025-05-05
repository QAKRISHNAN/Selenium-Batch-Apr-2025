package MethodOverLoading;

public class NumberOfParameters 
{
	public static void Addition(int a,int b)
	{
		System.out.println("Addition: "+(a+b));
	}
	
	protected static void Addition(int a,int b,int c)
	{
		System.out.println("Addition: "+(a+b+c));
		
	}
	private static void Addition(int a,int b,int c,int d)
	{
		System.out.println("Addition: "+(a+b+c));
		
	}
	
	public static void main(String[] args)
	{
		NumberOfParameters.Addition(10, 20);
		NumberOfParameters.Addition(10, 20, 30);
		NumberOfParameters.Addition(10, 20, 30, 40);
	}
}

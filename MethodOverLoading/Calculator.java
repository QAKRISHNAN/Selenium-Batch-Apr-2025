package MethodOverLoading;

public class Calculator
{
	public void Addition(int a,int b)
	{
		System.out.println(a+b);
	}
	
	private void Addition(int a,int b,int c)
	{
		System.out.println(a+b+c);
		
	}
	
	
	public void Addition(float a,float b)
	{
		System.out.println(a+b);
	}
	public void Addition(float a,float b,float c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) 
	{
		
		Calculator cal=new Calculator();
		cal.Addition(10, 20);
		cal.Addition(10, 20, 30);
		cal.Addition(2.5f, 3.5f);
		cal.Addition(2.5f, 3.5f, 4.5f);
		
	}

}

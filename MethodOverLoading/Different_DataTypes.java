package MethodOverLoading;

public class Different_DataTypes 
{

	public void Addition(int a,int b)
	{
		System.out.println("Addition: "+(a+b));
	}
	
	public void Addition(float a,float b)
	{
		System.out.println("Addition: "+(a+b));
	}
	
	public void Addition(double a,double b)
	{
		System.out.println("Addition: "+(a+b));
	}
	
	public static void main(String[] args) 
	{
		
		Different_DataTypes ddt=new Different_DataTypes();
		ddt.Addition(10, 20);
		ddt.Addition(10.5f, 20.5f);
		ddt.Addition(22.5, 33.5);
		
	}
}

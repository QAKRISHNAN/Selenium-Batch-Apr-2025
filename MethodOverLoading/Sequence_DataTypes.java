package MethodOverLoading;

public class Sequence_DataTypes 
{
	public void Addition(int a,float b)
	{
		System.out.println("Addition: "+(a+b));
	}
	
	public void Addition(float a,int b)
	{
		System.out.println("Addition: "+(a+b));
	}
	
	public void Addition(int a,double b)
	{
		System.out.println("Addition: "+(a+b));
	}
	public void Addition(double a,float b)
	{
		System.out.println("Addition: "+(a+b));
	}
	
	public static void main(String[] args) 
	{
		Sequence_DataTypes sdt=new Sequence_DataTypes();
		
		sdt.Addition(10, 20.5f);
		sdt.Addition(20.5, 10);
		sdt.Addition(10, 20.5);
		sdt.Addition(10, 20.5f);
	}
}

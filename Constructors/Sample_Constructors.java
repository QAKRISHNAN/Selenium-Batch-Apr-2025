package Constructors;

public class Sample_Constructors 
{
	public  Sample_Constructors()
	{
		System.out.println("I am Sample Constructors");
	}
	
	public  void Sample_Method1()
	{
		System.out.println("I am Sample Method1");
	}
	public  void Sample_Method2()
	{
		System.out.println("I am Sample Method2");
	}
	public static void main(String[] args) 
	{
		Sample_Constructors sc=new Sample_Constructors();
		sc.Sample_Method1();
		
		Non_Paremeterized np=new Non_Paremeterized();
		
	}
}

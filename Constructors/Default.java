package Constructors;

public class Default 
{
	int htno=101;
	String sname;
	char gender='M';
	float percentage;
	boolean result;
	
	{
		System.out.println("I am Default");
		System.out.print("HTNO: "+htno);
		System.out.print(" SName: "+sname);
		System.out.print(" Gender: "+gender);
		System.out.print(" Percentage: "+percentage);
		System.out.println(" Result: "+ result);
	}
	public static void main(String[] args) 
	{
		Default def=new Default();
	}
}

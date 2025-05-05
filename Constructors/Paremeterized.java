package Constructors;

public class Paremeterized 
{
	public Paremeterized(int htno,String sname,char gender, float percentage, boolean result)
	{
		System.out.print("HTNO: "+htno);
		System.out.print(" SName: "+sname);
		System.out.print(" Gender: "+gender);
		System.out.print(" Percentage: "+percentage);
		System.out.println(" Result: "+ result);
		
	}
	public static void main(String[] args)
	{
		
		Paremeterized pc1=new Paremeterized(101,"Krishna",'M',99.99f,true);
		Paremeterized pc2=new Paremeterized(102,"Suresh",'M',100.00f,true);
		
	
	
	}
}

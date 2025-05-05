package Operators;

public class Relational_Logical_Operators 
{

	public static void main(String[] args)
	{
		int a=34,b=24;
		
		System.out.println(a<b); //false
		System.out.println(a>b); //true 
		
						
		System.out.println((a<b)&(a>b)); //false 
		System.out.println((a<b)|(a>b)); //true 
		System.out.println((a>b)&(a<b)); //false 
		System.out.println((a>b)|(a<b)); //true 
		System.out.println((a==b)&(a==b)); //false 
		System.out.println((a==b)|(a==b)); //false 
		
		//System.out.println((false)&(true));
	}

}

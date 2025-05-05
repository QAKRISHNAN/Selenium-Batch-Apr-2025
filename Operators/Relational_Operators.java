package Operators;

public class Relational_Operators {

	public static void main(String[] args) {
	
		int a=10,b=20;
		a=20;
		b=10;
		
		a=20;
		b=20;
		
		System.out.println(a<b);  //true false false
		System.out.println(a<=b); //true false true
		
		System.out.println(a>b); //false true  false
		System.out.println(a>=b); //false true true
		
		System.out.println(a==b); //false false true
		System.out.println(a!=b); //true  true false
	
		//char x='B',y='A';
		
		//String x="A",y="B";
		
		//boolean x=true,y=false;
		
		//System.out.println("Char: "+ (x>=y));
	
	
	}

}

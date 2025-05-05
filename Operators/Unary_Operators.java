package Operators;

public class Unary_Operators {

	public static void main(String[] args) {
		// A.Increment Operators[++]:
		
		/*
		int a=5,b=5,c=5,d=5;
		
		System.out.println("++a Print: "+(++a));  //6
		System.out.println("Hold: "+ a); 	  //6
		
		System.out.println("b++ Print: "+(b++));  //5
		System.out.println("Hold: "+ b);       //6
		
		System.out.println("--c Print: "+(--c));  //4
		System.out.println("Hold: "+ c);       //4
		
		System.out.println("d-- Print: "+(d--));  //5
		System.out.println("Hold: "+ d);       //4
		
		//B.Decrement Operators[--]:
		//int b=5;
		//System.out.println(b--); //4
		///
				
		 */
		/*
		int a=5; //Normal Variable 
		
		System.out.println("a Actuval Value: "+a); //5
		
		System.out.println("++a Print: "+(++a));  //6
		System.out.println("Hold: "+ a); 	  //6 a=6 
		
		System.out.println("b++ Print: "+(a++));  //6 
		System.out.println("Hold: "+ a);       //7 a=7 
		
		System.out.println("--c Print: "+(--a));  //6 
		System.out.println("Hold: "+ a);       // 6 a=6 
		
		System.out.println("d-- Print: "+(a--));  //6  
		System.out.println("Hold: "+ a);       //5 a=5 
				
		System.out.println("a Final Value: "+a); //5
		*/
		
		//int a=5;
		//System.out.println(a+=2);
		//a=a+2 a=5+2 a=7 
		
	//	for(int i=1;i<=5;i+=5000) //1<=5  3<=5 5<=5 7<=5F
		
		for(int i=1;i<=5;i-=2) //1<=5 1 -1<=5 -3<5 
		{
			System.out.println(i); //1  -1  -3 
		}
	}
	

}

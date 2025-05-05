package Type_Conversition;

public class Implicit_Type_Conversition 
{

	public static void main(String[] args)
	{
		// 1.Implicit[Automatic][Narrowing]
		//byte-short-char-int-long-float-double
		
		//Type mismatch: cannot convert from short to byte
		//Type mismatch: cannot convert from double to float

	//byte a=10;
	//short b=a;
	//float b=a;
		//float a=10.3f;
	
		char a='&';
		//int b=a;
		float b=a;
	
	System.out.println("Before Conversition: "+a);
	System.out.println("After Conversition: "+b);
	}

}

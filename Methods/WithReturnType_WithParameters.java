package Methods;

public class WithReturnType_WithParameters 
{
	public float Addition(float a,float b)
	{
		float c=a+b;
		
		return c;
		
	}
	public static void main(String[] args)
	{
		WithReturnType_WithParameters wrwp = new WithReturnType_WithParameters();
		//wrwp.Addition(2.5f, 3.5f);
		
		System.out.println("Addition1: "+wrwp.Addition(2.5f, 3.5f));
		System.out.println("Addition2: "+wrwp.Addition(1.5f, 1.5f));
		System.out.println("Addition3: "+wrwp.Addition(5.5f, 5.5f));
	}
}

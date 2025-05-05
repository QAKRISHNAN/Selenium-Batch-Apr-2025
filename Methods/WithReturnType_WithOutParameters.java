package Methods;

public class WithReturnType_WithOutParameters 
{
	public int Addition()
	{
		int a=10,b=10;
		//int c=a+b;
		//System.out.println("Addition: "+c);
		//return c;
		return (a+b);
	}
	
	public static void main(String[] args) 
	{
		WithReturnType_WithOutParameters wrwop=new WithReturnType_WithOutParameters();
		
		//wrwop.Addition();
		//System.out.println("Addition: "+wrwop.Addition());
			int printAdd=wrwop.Addition();
			System.out.println("Addition: "+printAdd);
	}
}

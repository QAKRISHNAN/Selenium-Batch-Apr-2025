package Methods;

public class WithOutReturnType_WithParameters 
{
	public void Addition(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("Addition: "+d);
	}
	public static void main(String[] args)
	{
		WithOutReturnType_WithParameters worwp=new WithOutReturnType_WithParameters();
		worwp.Addition(10, 20, 30);
		worwp.Addition(100, 200, 300);
		worwp.Addition(1000, 2000, 3000);
		
	}
}

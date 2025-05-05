package TsetNG_Scripts;

import org.testng.annotations.Test;
public class Sample_TsetNG_Script 
{

	@Test(priority=3, invocationCount=3)
	public void India()
	{
		System.out.println("I am India");
	}
	
	@Test(priority=2)
	public void Telangana()
	{
		System.out.println("I am Telangana");
	}
	
	@Test(priority=1)
	public void Hyderabd()
	{
		System.out.println("I am Hyderabad");
	}
	
	@Test(priority=4 )
	public void KPHB()
	{
		System.out.println("I am KPHB");
	}
	
	
	
}

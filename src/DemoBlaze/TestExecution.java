package DemoBlaze;

import org.testng.annotations.Test;

import EndToEnd_AutomationFrameWork_SwagLabs.BaseTest;

public class TestExecution extends BaseTest
{
	
	@Test
	public void AllTest() throws InterruptedException 
	{
		LoginPageDemo valid=new LoginPageDemo(driver);
		valid.ValidLogin();
		
		Cart car=new Cart(driver);
		car.AddCart();
		
	}
}

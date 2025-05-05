package EndToEnd_AutomationFrameWork_SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage 
{

	 WebDriver driver;

	    public CartPage(WebDriver inputDriver) 
	    {
	    	driver = inputDriver;
	    }

	    public void proceedToCheckout() {
	    	driver.findElement(By.id("checkout")).click();
	    }
}

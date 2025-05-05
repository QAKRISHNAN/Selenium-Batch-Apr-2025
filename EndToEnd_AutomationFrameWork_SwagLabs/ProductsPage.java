package EndToEnd_AutomationFrameWork_SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage 
{
	WebDriver driver;

    public ProductsPage(WebDriver inputDriver) 
    {
    	driver = inputDriver;
    }

    public void addItemToCart() {
    	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    	driver.findElement(By.className("shopping_cart_link")).click();
    }

}

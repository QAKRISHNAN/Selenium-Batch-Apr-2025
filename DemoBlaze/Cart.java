package DemoBlaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart
{
	WebDriver driver;

	public  Cart(WebDriver inputdriver)
	{
		this.driver=inputdriver;
	}
	public void AddCart()
	{
		driver.findElement(By.xpath("//a[text()=\"Samsung galaxy s6\"]")).click();
	}
}

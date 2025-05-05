package EndToEnd_AutomationFrameWork_SwagLabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage 

{
	 WebDriver driver;

	    public CheckoutPage(WebDriver inputDriver) 
	    {
	    	driver = inputDriver;
	    }

	    public void fillCheckoutForm() {
	    	driver.findElement(By.id("first-name")).sendKeys("John");
	    	driver.findElement(By.id("last-name")).sendKeys("Doe");
	    	driver.findElement(By.id("postal-code")).sendKeys("12345");
	    	driver.findElement(By.id("continue")).click();
	        // Wait until #finish is visible and clickable
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("finish")));
	    	driver.findElement(By.id("finish")).click();
	    }
}

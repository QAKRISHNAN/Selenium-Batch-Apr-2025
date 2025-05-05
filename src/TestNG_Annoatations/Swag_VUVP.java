package TestNG_Annoatations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Swag_VUVP
{

	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser()
	{
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void Swag_VUVPWD() throws InterruptedException
	{
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
	}
		
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
}

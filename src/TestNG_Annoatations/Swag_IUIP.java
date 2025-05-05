package TestNG_Annoatations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Swag_IUIP 
{

	WebDriver driver;
	//@BeforeMethod
	@BeforeClass
	public void OpenBrowser()
	{
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	
	@Test
	public void Swag_IVUIVP() throws InterruptedException
	{
		
		driver.findElement(By.id("user-name")).sendKeys("sfghdfgd");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("3534534");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
	}
	
	//@AfterMethod
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
}

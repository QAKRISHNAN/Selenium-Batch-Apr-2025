package TsetNG_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Swag_Annonations
{
	WebDriver driver;
	@BeforeMethod
	//@BeforeClass
	//@BeforeTest
	public void OpenBrowser()
	{
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void Swag_VUVP() throws InterruptedException
	{
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test
	public void Swag_IVUIVP() throws InterruptedException
	{
		
		driver.findElement(By.id("user-name")).sendKeys("sfghdfgd");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("3534534");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
	}
	
	@AfterMethod
	//@AfterClass
	//@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}

}

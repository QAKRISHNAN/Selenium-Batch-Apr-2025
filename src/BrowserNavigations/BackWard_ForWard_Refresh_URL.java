package BrowserNavigations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackWard_ForWard_Refresh_URL
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		
		/*
		//driver.get("https://demowebshop.tricentis.com/register");
		driver.navigate().to("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		
		WebElement Login=driver.findElement(By.linkText("Log in"));
		Login.click();
		Thread.sleep(2000);
		
		WebElement ForgetPWD=driver.findElement(By.partialLinkText("Forgot passw"));
		ForgetPWD.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		*/
		
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
	}
	

}

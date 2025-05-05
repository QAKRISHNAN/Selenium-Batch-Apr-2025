package DemoBlaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPageDemo 
{
	WebDriver driver;
	public LoginPageDemo(WebDriver inputdriver)
	{
		this.driver=inputdriver;
	}
	public void ValidLogin() throws InterruptedException
	{
		//driver=new ChromeDriver();
		driver=new EdgeDriver();
		//System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver","Drivers\\msedgedriver.exe");
		
		
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		driver.findElement(By.id("login2")).click();
    	Thread.sleep(2000);
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("loginusername")));
		driver.findElement(By.id("loginusername")).sendKeys("aaa");
    	driver.findElement(By.id("loginpassword")).sendKeys("12345");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
    	
	}
	/*
	public static void main(String[] args) throws InterruptedException {
		LoginPage login=new LoginPage();
		login.ValidLogin();
	}
	*/
}

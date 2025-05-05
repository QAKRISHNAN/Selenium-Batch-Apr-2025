package SwagLabs_LoginFunctionality;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllUsersLogin 
{
	WebDriver driver;
	
	public void SwagAllLogins(String UserName,String Password) throws InterruptedException
	{
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys(UserName);
    	driver.findElement(By.id("password")).sendKeys(Password);
    	driver.findElement(By.id("login-button")).click();
    	
    	driver.findElement(By.id("react-burger-menu-btn")).click();
    	//WebDriver wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	
    	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         
    	Thread.sleep(3000);
    	
    	driver.findElement(By.id("logout_sidebar_link")).click();
    	Thread.sleep(3000);
    	//driver.close();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		AllUsersLogin all=new AllUsersLogin();
		all.SwagAllLogins("standard_user", "secret_sauce");
		//all.SwagAllLogins("locked_out_user", "secret_sauce");
		//all.SwagAllLogins("problem_user", "secret_sauce");
		//all.SwagAllLogins("performance_glitch_user", "secret_sauce");
		//all.SwagAllLogins("error_user", "secret_sauce");
		all.SwagAllLogins("visual_user", "secret_sauce");
		
	}
	

}

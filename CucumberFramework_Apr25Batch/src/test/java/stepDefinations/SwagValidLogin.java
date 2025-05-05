package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagValidLogin 
{
	WebDriver driver;
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() 
	{
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.edgedriver().setup();
		driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}

	@When("the user enters valid credentials")
	public void the_user_enters_valid_credentials() throws InterruptedException 
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
	}

	@Then("the user is redirected to the dashboard")
	public void the_user_is_redirected_to_the_dashboard() throws InterruptedException 
	{
	    
		String ExceptedURL="https://www.saucedemo.com/inventory.html";
		String ActualURL=driver.getCurrentUrl();
		
		System.out.println("Excepted URL: "+ExceptedURL);
		System.out.println("Actual URL: "+ActualURL);
		
		//if(ExceptedURL.equalsIgnoreCase(ActualURL))
		if(ExceptedURL.equals(ActualURL))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		Thread.sleep(2000);
		//driver.close();
	}
	
}

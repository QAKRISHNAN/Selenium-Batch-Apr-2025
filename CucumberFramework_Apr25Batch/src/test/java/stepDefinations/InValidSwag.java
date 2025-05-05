package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InValidSwag 
{
	static WebDriver driver;

	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() 
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@When("The user enters a username {string}")
	public void the_user_enters_a_username(String username) throws InterruptedException 
	{
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(2000);

		
	}

	@When("The user enters a password {string}")
	public void the_user_enters_a_password(String password) throws InterruptedException 
	{
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
	}

	@When("The user clicks the login button")
	public void the_user_clicks_the_login_button() 
	{
		driver.findElement(By.id("login-button")).click();
	}

	@Then("The user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() throws InterruptedException 
	{
		String ExceptedURL="https://www.saucedemo.com/";
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
		driver.close();
	}

}

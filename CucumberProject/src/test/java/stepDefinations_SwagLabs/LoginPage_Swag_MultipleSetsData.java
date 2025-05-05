package stepDefinations_SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_Swag_MultipleSetsData 
{
	WebDriver driver;
	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() throws InterruptedException {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Feb-2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@When("The user enters a valid username {string}")
	public void the_user_enters_a_valid_username(String username) throws InterruptedException 
	{
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(2000);
	}

	@When("The user enters a valid password {string}")
	public void the_user_enters_a_valid_password(String password) throws InterruptedException 
	{
		driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);
	}

	@When("The user clicks the login button")
	public void the_user_clicks_the_login_button() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	@Then("The user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
		String ExceptedURL="https://www.saucedemo.com/inventory.html";
	    String ActuavalURL=driver.getCurrentUrl();	 
	    
	    if(ExceptedURL.equalsIgnoreCase(ActuavalURL)) //true or false
	    {
	    	System.out.println("user redirected to products page");
	    	System.out.println("Test Case is Pass");
	    }
	    else
	    {
	    	System.out.println("user not redirected to products page");
	    	System.out.println("Test Case is Fail");
	    }
	}
	
	}



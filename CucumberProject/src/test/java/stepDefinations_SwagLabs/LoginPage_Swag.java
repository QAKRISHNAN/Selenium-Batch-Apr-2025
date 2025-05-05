package stepDefinations_SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_Swag
{
	WebDriver driver;
	@Given("The user is on the signup page")
	public void the_user_is_on_the_signup_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Feb-2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@When("The user enters a username {string}")
	public void the_user_enters_a_username(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("user-name")).sendKeys("testuser");
		Thread.sleep(2000);
	}

	@When("The user enters a password {string}")
	public void the_user_enters_a_password(String string)  throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys("password123");
		Thread.sleep(2000);
	}

	@When("The user clicks the signup button")
	public void the_user_clicks_the_signup_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	@Then("The user should see a signup successful alert")
	public void the_user_should_see_a_signup_successful_alert() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
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

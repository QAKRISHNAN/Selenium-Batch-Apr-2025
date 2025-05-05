package EndToEnd_AutomationFrameWork_SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	  WebDriver driver;

	    public LoginPage(WebDriver inputDriver)
	    {
	    	//driver = inputDriver;
	    	this.driver=inputDriver;
	    }
	    

	    public void login(String user, String pass) throws InterruptedException {
	    	driver.findElement(By.id("user-name")).sendKeys(user);
	    	driver.findElement(By.id("password")).sendKeys(pass);
	    	driver.findElement(By.id("login-button")).click();
	    	// Handle alert if it appears
	    	/*
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.alertIsPresent());  // Wait for alert

	            // Switch to alert and handle it
	            Alert alert = driver.switchTo().alert();
	            alert.accept();  // Accept the alert (dismiss if needed)
	            System.out.println("Alert accepted successfully.");
	        } catch (NoAlertPresentException e) {
	            System.out.println("No alert present.");
	        } catch (TimeoutException e) {
	            System.out.println("Alert did not appear within the expected time.");
	        }
	        */
	    }
}


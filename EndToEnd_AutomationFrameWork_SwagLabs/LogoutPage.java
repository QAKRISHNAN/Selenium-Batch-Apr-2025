package EndToEnd_AutomationFrameWork_SwagLabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage 
{
	WebDriver driver;

    public LogoutPage(WebDriver inputDriver) 
    {
        driver = inputDriver;
    }

    public void logout() 
    {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Wait for the logout button to be Clickable
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        logoutButton.click();
        
        //driver.findElement(By.id("logout_sidebar_link")).click();
    }
}



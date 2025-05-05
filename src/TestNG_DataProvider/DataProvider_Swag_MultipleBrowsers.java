package TestNG_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Swag_MultipleBrowsers 
{
	 WebDriver driver;

	    @DataProvider(name = "BrowserSelection")
	    public Object[][] SetUpBrowser() {
	        return new Object[][]{
	                {"chrome"}, 
	                
	                {"firefox"},
	                {"edge"}, 
	        };
	    }

	    public void setUp(String browser) 
	    {
	        switch (browser) 
	        {
	            case "chrome":
	                System.setProperty("webdriver.chrome.driver", "D:\\Selenium Feb-2025\\chromedriver.exe");
	                driver = new ChromeDriver();
	                break;
	                
	            case "firefox":
	                System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM APR-2025\\geckodriver.exe");
	                driver = new FirefoxDriver();
	                break;

	            case "edge":
	                System.setProperty("webdriver.edge.driver", "D:\\SELENIUM APR-2025\\msedgedriver.exe");
	                driver = new EdgeDriver();
	                break;
	        }
	        
	        driver.manage().window().maximize();
	    }

	    @Test(dataProvider = "BrowserSelection")
	    public void Loginpage(String browser) throws InterruptedException {
	        setUp(browser);  // Call setup inside the test method

	        driver.get("https://www.saucedemo.com/");
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	        Thread.sleep(2000);
	    }

	    @AfterMethod
	    public void tearDown() throws InterruptedException {
	        if (driver != null) {
	            driver.quit();
	            Thread.sleep(2000);
	        }
	    }

}

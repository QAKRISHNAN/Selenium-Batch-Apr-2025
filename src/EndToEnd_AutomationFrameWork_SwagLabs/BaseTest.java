package EndToEnd_AutomationFrameWork_SwagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{

	protected WebDriver driver;

    @BeforeMethod
    public void setUp() 
    {
		driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
	driver.manage().window().maximize();
	//driver.get("https://www.saucedemo.com/");
    
	driver.get("https://www.demoblaze.com/index.html");
	}

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

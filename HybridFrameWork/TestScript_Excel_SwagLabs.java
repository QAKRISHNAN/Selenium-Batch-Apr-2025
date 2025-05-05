package HybridFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestScript_Excel_SwagLabs 
{

	WebDriver driver;

    @Test(dataProvider = "testdata")
    public void DemoProject(String EmailID, String password) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        // Setup browser
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);

        // Use test data from Excel
        driver.findElement(By.id("user-name")).sendKeys(EmailID);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000); // Optional: For observation; replace with WebDriverWait for real testing
    }

    @AfterMethod
    public void ProgramTermination() 
    {
        if (driver != null) 
        {
            driver.quit();
        }
    }

    @DataProvider(name = "testdata")
    public Object[][] TestDataFeed() throws IOException 
    {
        String excelPath = "D:\\SELENIUM APR-2025\\SwagLabsTestData.xlsx";
      
        //Object Creation
        TestData_Excel config = new TestData_Excel(excelPath);

        int rows = config.getRowCount(0);
        Object[][] credentials = new Object[rows][2];
        
        for (int i = 0; i < rows; i++) 
        {
            credentials[i][0] = config.getData(0, i, 0);
            credentials[i][1] = config.getData(0, i, 1);
        }

        return credentials; 
    }
}

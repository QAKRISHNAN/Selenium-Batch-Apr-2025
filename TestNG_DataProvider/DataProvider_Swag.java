package TestNG_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Swag {
	WebDriver driver;

	@DataProvider(name = "SwagLabTestData")
	public Object[][] SwagLagData() {
		return new Object[][] { 
			{ "standard_user", "secret_sauce" },
			{ "standard_user", "abcdefg" },
				{ "adsnhjhj", "secret_sauce" },
				{ "dfghjk", "asghjfgkhj" },
				{ "standard_user", "" },
				{ "", "secret_sauce" }, 
				{ "", "" },

		};
	}

	@Test(dataProvider = "SwagLabTestData")
	public void SwagLabLoginpage(String UserName, String Password) throws InterruptedException {

		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("user-name")).sendKeys(UserName);
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void BrowserClose() {
		driver.close();

	}

}

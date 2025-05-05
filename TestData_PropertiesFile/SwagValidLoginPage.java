package TestData_PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagValidLoginPage {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		Properties prop = new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace-2025-03\\SELENIUM_APR_2025\\src\\TestData_PropertiesFile\\SwagTestData.properties");
		Thread.sleep(2000);
		
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		
		WebElement UserName=driver.findElement(By.id(prop.getProperty("UserNameID")));
		UserName.sendKeys(prop.getProperty("userName"));
		
		WebElement Password=driver.findElement(By.id(prop.getProperty("PaswwordID")));
		Password.sendKeys(prop.getProperty("password"));
		
		WebElement Login=driver.findElement(By.id(prop.getProperty("LoginButtonID")));
		Login.click();
		
		
		/*
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		*/
	}

}

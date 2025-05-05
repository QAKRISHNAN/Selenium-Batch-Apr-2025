package Browsers_URL_Tittle;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLess_Browser {

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Choose your Browser: ");
		String browserselection=scan.next().toLowerCase();
		 WebDriver driver;  //Global 
		 
		switch(browserselection) 
		{
		case "chrome":
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
		
			driver=new ChromeDriver(options);
			
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			System.out.println("Chrome Browser Opened");
			driver.manage().window().maximize();
					
			driver.get("https://apgvb.in/");
			Thread.sleep(2000);
			driver.close();
			System.out.println("Chrome Browser Closed");
			break;
		}
		case "edge":
		{
			//Edge Driver
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--headless");
			 driver=new EdgeDriver(options);
			
			System.setProperty("webdriver.edge.driver", "Drivers\\msedgedriver.exe");
			System.out.println("Edge Browser Opened");
			driver.manage().window().maximize();
					
			driver.get("https://www.facebook.com");
			driver.manage().window().minimize();
			
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.close();
			System.out.println("Edge Browser Closed");
			break;
		}
		case "firefox":
		{
			//FireFox Driver
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			 driver=new FirefoxDriver(options);
			
			System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
			System.out.println("FireFox Browser Opened");
			driver.manage().window().maximize();
					
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			driver.close();
			System.out.println("FireFox Browser Closed");
			break;
		}
		default:
		{
			System.out.println("Choose only above 3 browsers");
		}
		
		}


	}

}

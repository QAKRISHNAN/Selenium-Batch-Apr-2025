package Browsers_URL_Tittle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RunSeleniumScript_MultipleBrowsers 
{
	static WebDriver driver;  //Global 
	public static void main(String[] args) throws InterruptedException 
	{
		
		//Edge Driver
		 driver=new EdgeDriver();
		
		System.setProperty("webdriver.edge.driver", "Drivers\\msedgedriver.exe");
		System.out.println("Edge Browser Opened");
		driver.manage().window().maximize();
				
		driver.get("https://www.facebook.com");
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.close();
		System.out.println("Edge Browser Closed");
		
		//FireFox Driver
		 driver=new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		System.out.println("FireFox Browser Opened");
		driver.manage().window().maximize();
				
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.close();
		System.out.println("FireFox Browser Closed");
		
		//Chrome Driver
		driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		System.out.println("Chrome Browser Opened");
		driver.manage().window().maximize();
				
		driver.get("https://apgvb.in/");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Chrome Browser Closed");
	}

}

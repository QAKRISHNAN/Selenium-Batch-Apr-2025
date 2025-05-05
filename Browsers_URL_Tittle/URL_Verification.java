package Browsers_URL_Tittle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Verification
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Create Object for Selenium WebDriver
		WebDriver driver=new ChromeDriver();
		
		//Browser Configuration
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM APR-2025\\chromedriver.exe");

		//Browser Maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Enter URL
		//driver.get("https://in.bookmyshow.com/");
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		
		String ExceptedURL="https://in.bookmyshow.com/";
		String ActualURL=driver.getCurrentUrl();
		
		System.out.println("Excepted URL: "+ExceptedURL);
		System.out.println("Actual URL: "+ActualURL);
		
		//if(ExceptedURL.equalsIgnoreCase(ActualURL))
		if(ExceptedURL.equals(ActualURL))
		{
			System.out.println("Smoke Test Pass");
		}
		else
		{
			System.out.println("Smoke Test Fail");
		}
		
		//Close Browser
		driver.close();
	}

}

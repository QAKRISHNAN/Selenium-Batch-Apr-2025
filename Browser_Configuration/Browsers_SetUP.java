package Browser_Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers_SetUP 
{
	public WebDriver driver;
	
	public void ChromeBrowser_Open()
	{
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
	}
	public void ChromeBrowser_Close()
	{
		driver.close();
	}
	

}

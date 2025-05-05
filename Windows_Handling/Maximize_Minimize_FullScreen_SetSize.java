package Windows_Handling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Minimize_FullScreen_SetSize 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		/*
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		*/
		Dimension dim=new Dimension(800,200);
		
		driver.manage().window().setSize(dim);
		
		
		
		
	}

}

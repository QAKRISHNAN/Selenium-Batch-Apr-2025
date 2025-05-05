package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ScreenShots 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver=new ChromeDriver(options);
		Thread.sleep(1000);
		
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(1000);
		
		//Screenshot-1
		File u1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(u1, new File("D:\\SELENIUM APR-2025\\Screenshots\\1Url.jpeg"));
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		//Screenshot-2
		File u2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(u2, new File("D:\\SELENIUM APR-2025\\Screenshots\\2Refresh.jpeg"));
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		//Screenshot-3
		File u3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(u3, new File("D:\\SELENIUM APR-2025\\Screenshots\\3Back.jpeg"));
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		//Screenshot-4
		File u4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(u4, new File("D:\\SELENIUM APR-2025\\Screenshots\\4Forward.jpeg"));
		Thread.sleep(1000);
		
		driver.close();
	
	}

}

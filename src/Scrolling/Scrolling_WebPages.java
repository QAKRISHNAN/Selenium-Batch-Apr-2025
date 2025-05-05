package Scrolling;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class Scrolling_WebPages {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(2000);
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);
		driver.findElement(By.id("rt01tab1-jdk24-windows")).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);
		driver.findElement(By.linkText("https://download.oracle.com/java/24/latest/jdk-24_windows-x64_bin.exe")).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-500)", "");
	}

}

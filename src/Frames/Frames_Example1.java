package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Example1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("file:///D:/SELENIUM/Selenium%20Scripts/Frames/frames.html");
				
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement frametb1=driver.findElement(By.id("001"));
		frametb1.sendKeys("Frame-1");
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		WebElement frametb2=driver.findElement(By.id("002"));
		frametb2.sendKeys("Frame-2");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		WebElement frame3=driver.findElement(By.xpath("//frame[@src=\"D:\\SELENIUM\\Selenium Scripts\\Frames\\frame_c.html\"]"));
		Thread.sleep(2000);
		driver.switchTo().frame(frame3);
		Thread.sleep(2000);
		WebElement frametb3=driver.findElement(By.id("003"));
		frametb3.sendKeys("Frame-3");
		
		
}
}

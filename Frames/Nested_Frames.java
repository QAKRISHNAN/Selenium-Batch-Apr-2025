package Frames;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Nested_Frames {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		driver.switchTo().frame("singleframe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Manual");
		Thread.sleep(2000);
		//Screenshot-1
		File u1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(u1, new File("D:\\SELENIUM APR-2025\\Screenshots\\SingleFrame.jpeg"));
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Iframe with in an Iframe\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]")));
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div/div/iframe")));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Automation");
		Thread.sleep(2000);
		//Screenshot-1
		File u2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(u2, new File("D:\\SELENIUM APR-2025\\Screenshots\\NestedFrame.jpeg"));
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}

}

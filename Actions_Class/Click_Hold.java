package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Hold 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/dragabble");
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", ""); //Top to Down
		
		WebElement dragBox=driver.findElement(By.id("dragBox"));
		
		Actions action=new Actions(driver);
		//action.clickAndHold(dragBox);
		//action.moveByOffset(0, 200);
		Thread.sleep(2000);
		//action.dragAndDropBy(dragBox, 0, 400).build().perform();
		Thread.sleep(2000);
		//action.dragAndDropBy(dragBox, 0, -100).build().perform();
		action.dragAndDropBy(dragBox, 100, 0).build().perform();
	}

}

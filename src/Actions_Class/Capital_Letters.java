package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Capital_Letters {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://omayo.blogspot.com/");
		
		Actions action=new Actions(driver);
		
		WebElement TextArea1=driver.findElement(By.id("ta1"));
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", ""); //Top to Down
		
		Thread.sleep(2000);
		//action.keyDown(Keys.SHIFT).sendKeys("selenium with java").keyUp(Keys.SHIFT).build().perform();
		
		action.keyDown(TextArea1, Keys.SHIFT).sendKeys("selenium with java").keyUp(Keys.SHIFT).build().perform();
		
		
		//TextArea1.sendKeys("DFJGDJFJKJD");
	}

}

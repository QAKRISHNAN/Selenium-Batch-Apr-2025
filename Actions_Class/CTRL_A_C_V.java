package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CTRL_A_C_V {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://omayo.blogspot.com/");
		
		Actions action=new Actions(driver);
		
		WebElement TextArea1=driver.findElement(By.id("ta1"));
		WebElement TextArea2=driver.findElement(By.xpath("//textarea[@cols=\"30\"]"));
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", ""); //Top to Down
		
		Thread.sleep(2000);
		
		//action.keyDown(TextArea1, Keys.SHIFT).sendKeys("selenium with java").keyUp(Keys.SHIFT).build().perform();
		
		action.keyDown(TextArea1, Keys.SHIFT).perform();
		action.sendKeys("selenium with java").perform();
		action.keyUp(Keys.SHIFT).perform();
		Thread.sleep(2000);
		
		//Ctrl A
		//action.keyDown(TextArea1, Keys.CONTROL).sendKeys("a").sendKeys("c").sendKeys("v").perform();
		//action.keyDown(TextArea1, Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		//Ctrl C
				//action.keyDown(TextArea1, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
				
		action.keyDown(TextArea1, Keys.CONTROL).sendKeys("a").sendKeys("c").perform();
		Thread.sleep(2000);
		
		action.keyDown(TextArea2, Keys.CONTROL).sendKeys("a").perform();
		Thread.sleep(2000);
		action.keyDown(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		//Ctrl V
		action.keyDown(TextArea2, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
	}

}

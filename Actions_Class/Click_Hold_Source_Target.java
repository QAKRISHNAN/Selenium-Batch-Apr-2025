package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Hold_Source_Target {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/droppable");
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", ""); //Top to Down
		
		WebElement dragBox=driver.findElement(By.id("draggable"));
		WebElement drropBox=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDrop(dragBox, drropBox).build().perform();
		
	}

}

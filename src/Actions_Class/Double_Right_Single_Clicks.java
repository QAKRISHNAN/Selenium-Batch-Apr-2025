package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Right_Single_Clicks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/buttons");
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", ""); //Top to Down
		
		WebElement doubleClickButton=driver.findElement(By.id("doubleClickBtn"));
		WebElement rightClickButton=driver.findElement(By.id("rightClickBtn"));
		WebElement SingleClickButton=driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		//Double Click
		action.doubleClick(doubleClickButton).perform();
		Thread.sleep(2000);
		
		action.contextClick(rightClickButton).perform();
		Thread.sleep(2000);
		
		action.click(SingleClickButton).perform();
		
	}

}

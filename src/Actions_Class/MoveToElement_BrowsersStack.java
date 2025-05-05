package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_BrowsersStack {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.browserstack.com/test-management");
		Thread.sleep(2000);
		WebElement products=driver.findElement(By.id("products-dd-toggle"));
		WebElement testManagement=driver.findElement(By.xpath("//*[@id=\"products-dd-tabpanel-1-inner-1\"]/div[3]/div[2]/a/span"));
		WebElement appTesting=driver.findElement(By.id("products-dd-tab-2"));
		WebElement appLive=driver.findElement(By.xpath("//span[text()=\"App Live\"]"));
		
		
		//products.click();
		Actions action=new Actions(driver);
	
		action.moveToElement(products).perform();
		Thread.sleep(2000);
		//testManagement.click();
		action.moveToElement(appTesting).perform();
		Thread.sleep(2000);
		appLive.click();
	}

}

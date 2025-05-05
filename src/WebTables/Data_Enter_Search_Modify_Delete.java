package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Enter_Search_Modify_Delete 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/webtables");
		
		driver.findElement(By.id("addNewRecordButton")).click();

		driver.findElement(By.id("firstName")).sendKeys("Krishna");
		WebElement LastName=driver.findElement(By.id("lastName"));
		LastName.sendKeys("np");
		driver.findElement(By.id("userEmail")).sendKeys("Krishna@gmail.com");
		driver.findElement(By.id("age")).sendKeys("35");
		driver.findElement(By.id("salary")).sendKeys("9999");
		driver.findElement(By.id("department")).sendKeys("IT");
		
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("searchBox")).sendKeys("Krishna");
		Thread.sleep(2000);
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", ""); //Top to Down
		Thread.sleep(2000);
		
		driver.findElement(By.id("edit-record-4")).click();
		Thread.sleep(2000);
		
		//LastName.clear();
		driver.findElement(By.id("lastName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("N");
		//LastName.sendKeys("N");
	}

}

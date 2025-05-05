package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOK {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		
		WebElement AlertBox=driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
		AlertBox.click();
		Thread.sleep(2000);
		
		Alert alertClick=driver.switchTo().alert();
		System.out.println(alertClick.getText());
		alertClick.accept();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}

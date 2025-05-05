package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		

		WebElement AlertWithTextBox=driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]"));
		AlertWithTextBox.click();
		Thread.sleep(2000);
		
		WebElement AlertPromptBox=driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
		AlertPromptBox.click();
		Thread.sleep(2000);
				
		Alert alertClickTextBox=driver.switchTo().alert();
		alertClickTextBox.sendKeys("Krishna");
		Thread.sleep(2000);
		
		System.out.println(alertClickTextBox.getText());
		alertClickTextBox.accept();
		//alertClickTextBox.dismiss();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("demo1")).getText());
		
		driver.close();

	}

}

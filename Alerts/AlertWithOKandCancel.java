package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOKandCancel {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		
			
		WebElement AlertOKCancel=driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]"));
		AlertOKCancel.click();
		Thread.sleep(2000);
		
		WebElement AlertConfirmBox=driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
		AlertConfirmBox.click();
		Thread.sleep(2000);
				
		Alert alertClickOK=driver.switchTo().alert();
		System.out.println(alertClickOK.getText());
		//alertClickOK.accept();
		alertClickOK.dismiss();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("demo")).getText());
		
		driver.close();
		
	

	}

}

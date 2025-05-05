package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari_Registration {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		WebElement Name=driver.findElement(By.xpath("//input[@id='name']"));
		Name.sendKeys("Sankara krishna");
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("sankarakrishna@gmail.com");
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("dnhvcjldsncj");
		Thread.sleep(2000);
		WebElement Mobile=driver.findElement(By.xpath("//input[@id='mobile']"));
		Mobile.sendKeys("9515197719");////p[normalize-space()='I have work experience (excluding internships)']
		Thread.sleep(2000);
		WebElement status=driver.findElement(By.xpath("//p[normalize-space()='I have work experience (excluding internships)']"));
		status.click();
		Thread.sleep(2000);
		
		WebElement UploadResume=driver.findElement(By.xpath("//button[normalize-space()='Upload Resume']"));
		UploadResume.click();
		Thread.sleep(3000);
		//UploadResume.sendKeys("D:\\MY Resume.docx");
		//Thread.sleep(2000);
		//Runtime.getRuntime().exec("D:\\SELENIUM APR-2025\\AutoITScript\\NoukariResumeUpload.exe");

		Runtime.getRuntime().exec("D:\\SELENIUM APR-2025\\AutoITScript\\Cancel.exe");

	}

}

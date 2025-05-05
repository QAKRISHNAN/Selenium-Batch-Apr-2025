package File_Upload_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Download1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", ""); //Top to Down
				
		WebElement download1=driver.findElement(By.xpath("//a[text()=\"Download\"]"));
		download1.click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,300)", ""); //Top to Down
		
		//Text File
		WebElement textbox1=driver.findElement(By.id("textbox"));
		textbox1.sendKeys("Manual Testing");
		Thread.sleep(2000);
		
		WebElement generateFile1=driver.findElement(By.xpath("//button[text()=\"Generate File\"]"));
		generateFile1.click();
		Thread.sleep(2000);
				
		WebElement download2=driver.findElement(By.id("link-to-download"));
		download2.click();
		
		
		js.executeScript("window.scrollBy(0,300)", ""); //Top to Down
		
		//PDF File
		WebElement textbox2=driver.findElement(By.id("pdfbox"));
		textbox2.sendKeys("Automation Testing");
		Thread.sleep(2000);
		
		WebElement generateFile2=driver.findElement(By.id("createPdf"));
		generateFile2.click();
		Thread.sleep(2000);
				
		WebElement download3=driver.findElement(By.id("pdf-link-to-download"));
		download3.click();
		
		
	}

}

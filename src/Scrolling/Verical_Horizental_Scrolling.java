package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verical_Horizental_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		//driver.manage().window().maximize();
		
	//	driver.get("https://www.amazon.in/");
		
		driver.get("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		//Vertical 	
		
			js.executeScript("window.scrollBy(0,500)", ""); //Top to Down
			 
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,-500)", ""); //Down to UP
			Thread.sleep(3000);
			//Horizontal
			
			js.executeScript("window.scrollBy(500,0)", ""); //Left to Right
					
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(-500,0)", ""); //Right to Left
					
		
		

	}

}

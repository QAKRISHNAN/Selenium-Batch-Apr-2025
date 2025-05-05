package Windows_Handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab_Window_Close_Quit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		//driver.close();
				
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		String WindowHandle1=driver.getWindowHandle();
		System.out.println(WindowHandle1);
		//driver.close();
		//driver.quit();

	}

}

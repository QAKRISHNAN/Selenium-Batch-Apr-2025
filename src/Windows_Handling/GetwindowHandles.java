package Windows_Handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		String WindowHandle1=driver.getWindowHandle();
		System.out.println("Frames: "+WindowHandle1);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String WindowHandle2=driver.getWindowHandle();
		System.out.println("Facebook: "+WindowHandle2);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		//driver.close();
		String WindowHandle3=driver.getWindowHandle();
		System.out.println("Saucedemo: "+WindowHandle3);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		String WindowHandle4=driver.getWindowHandle();
		System.out.println("Amazon: "+WindowHandle4);
		//driver.close();
		driver.quit();

	}

}

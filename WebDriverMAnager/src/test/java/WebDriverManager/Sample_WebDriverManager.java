package WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample_WebDriverManager
{

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/webdrivermanager/");
	}
}

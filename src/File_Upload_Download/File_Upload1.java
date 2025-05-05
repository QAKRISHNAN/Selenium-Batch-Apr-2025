package File_Upload_Download;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
		
		WebElement browse=driver.findElement(By.id("input-4"));
		browse.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Instead of 2 Identified 22 .jpg");
	}

}

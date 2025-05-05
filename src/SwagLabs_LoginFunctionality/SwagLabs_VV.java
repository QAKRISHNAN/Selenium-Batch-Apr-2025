package SwagLabs_LoginFunctionality;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwagLabs_VV 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--headless");
	//WebDriver driver=new ChromeDriver(options);
	
		WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.id("login-button")).click();
	
	/*
	String ExceptedTittle="Swag Labs";
	String ActualTittle=driver.getTitle();
	
	System.out.println("Excepted URL: "+ExceptedTittle);
	System.out.println("Actual URL: "+ActualTittle);
	
	//if(ExceptedURL.equalsIgnoreCase(ActualURL))
	if(ExceptedTittle.equals(ActualTittle))
	{
		System.out.println("Test Pass");
	}
	else
	{
		System.out.println("Test Fail");
	}
	Thread.sleep(2000);
	//driver.close();
*/
	}

}

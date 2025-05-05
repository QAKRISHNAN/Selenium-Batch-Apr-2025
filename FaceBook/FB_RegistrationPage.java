package FaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Browser_Configuration.Browsers_SetUP;

public class FB_RegistrationPage extends Browsers_SetUP 
{

	public void Registration() throws InterruptedException
	{
		ChromeBrowser_Open();
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		//driver.findElement(By.linkText("Forgotten password")).click();
		
		//driver.findElement(By.partialLinkText("Forgotten password?")).click();
			
		//Click on Create New Account Button
		
		WebElement CreateNewAccountButton=driver.findElement(By.linkText("Create new account"));
		CreateNewAccountButton.click();
		//Thread.sleep(2000);
		
		WebElement FirstName=driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Krishna");
		
		
		WebElement SurName=driver.findElement(By.name("lastname"));
		SurName.sendKeys("N");
		
		
		WebElement Date=driver.findElement(By.name("birthday_day"));
		//Date.sendKeys("22");
		Select dateselect=new Select(Date);
		dateselect.selectByIndex(22);
		//Thread.sleep(2000);
		
		WebElement Month=driver.findElement(By.name("birthday_month"));
		Select monthselect=new Select(Month);
		monthselect.selectByValue("6");
		//Thread.sleep(2000);
		
		WebElement Year=driver.findElement(By.name("birthday_year"));
		Select yearselect=new Select(Year);
		yearselect.selectByVisibleText("2018");
		Thread.sleep(2000);
		
		WebElement Gender_FeMale=driver.findElement(By.xpath("//input[@value=\"1\"]"));
		Gender_FeMale.click();
		Thread.sleep(2000);
		
		WebElement Gender_Male=driver.findElement(By.xpath("//input[@value=\"2\"]"));
		Gender_Male.click();
		
		}
	
	public static void main(String[] args) throws InterruptedException {
		
		FB_RegistrationPage fbr=new FB_RegistrationPage();
		fbr.Registration();
		
	}
}

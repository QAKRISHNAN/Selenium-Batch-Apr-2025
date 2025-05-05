package Buzilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser_Configuration.Browsers_SetUP;

public class Buzilla_LoginPage extends Browsers_SetUP
{
	
	public void Buzilla_Valid_InValid() throws InterruptedException
	{
		ChromeBrowser_Open();
		driver.get("https://bugs.documentfoundation.org/");
		Thread.sleep(2000);
		
		//Click on LogIN Link
		WebElement LogINLink=driver.findElement(By.id("login_link_top"));
		LogINLink.click();
		Thread.sleep(2000);
		
		//Enter Email Address
		WebElement EmailAddress=driver.findElement(By.className("bz_login"));
		EmailAddress.sendKeys("tronixtechkrishna@gmail.com");
		Thread.sleep(2000);
		
		//Enter Password
		WebElement Password=driver.findElement(By.name("Bugzilla_password"));
		Password.sendKeys("jdghfkjlkk345443");
		Thread.sleep(2000);
		
		WebElement LoginClick=driver.findElement(By.name("GoAheadAndLogIn"));
		LoginClick.click();
		Thread.sleep(2000);
		
		
	}
	
	public void TitleVerification()
	{
		String ExceptedTitle="Account Locked";
		String ActuvalTitle=driver.getTitle();
		
		if(ExceptedTitle.equalsIgnoreCase(ActuvalTitle))
		{
			System.out.println("Test Case is Pass");
		}
		else
		{
			System.out.println("Test Case is Fail");
		}
		
		ChromeBrowser_Close();
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		Buzilla_LoginPage buzilla=new Buzilla_LoginPage();
		
		buzilla.Buzilla_Valid_InValid();
		buzilla.TitleVerification();
		
	}
	
	
}

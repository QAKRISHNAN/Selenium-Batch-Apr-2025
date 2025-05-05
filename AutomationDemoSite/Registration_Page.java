package AutomationDemoSite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser_Configuration.Browsers_SetUP;

public class Registration_Page extends Browsers_SetUP
{

	public  Registration_Page() throws InterruptedException
	{
		ChromeBrowser_Open();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement FirstName=driver.findElement(By.tagName("input"));
		FirstName.sendKeys("Krishna");
		//Thread.sleep(2000);
		/*
		FirstName.clear();
		Thread.sleep(2000);
		FirstName.sendKeys("RamaRao");
		*/
		
		//WebElement LastName=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input"));
		WebElement LastName=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		LastName.sendKeys("Rao");
		//Thread.sleep(2000);
		
		WebElement Address=driver.findElement(By.tagName("textarea"));
		Address.sendKeys("KPHB \n HYD \n 50002");
		//Thread.sleep(2000);
		
		WebElement EmailAddress=driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]"));
		EmailAddress.sendKeys("krishna@123.gmail.com");
		//Thread.sleep(2000);
		
		WebElement Phone=driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]"));
		Phone.sendKeys("123456789");
		//Thread.sleep(2000);
		
		WebElement GenderMale=driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		GenderMale.click();
		//Thread.sleep(2000);
		
		WebElement GenderFeMale=driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
		GenderFeMale.click();
		Thread.sleep(2000);
		
		List<WebElement> Hobbies=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for(int i=0;i<Hobbies.size();i++) //0<3 T 1<3T 2<3T
		{
			if(i==1) //0==1 F 1==1T 2==1F
			{
				//break;
			continue;
			}
			
			Hobbies.get(i).click();
			
			Thread.sleep(2000);
		}
		
		/*
		WebElement Hobbies1=driver.findElement(By.id("checkbox1"));
		Hobbies1.click();
		Thread.sleep(2000);
		
		WebElement Hobbies2=driver.findElement(By.id("checkbox2"));
		Hobbies2.click();
		Thread.sleep(2000);
		
		WebElement Hobbies3=driver.findElement(By.id("checkbox3"));
		Hobbies3.click();
		*/
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Registration_Page rpage=new Registration_Page();
		
		
	}
}

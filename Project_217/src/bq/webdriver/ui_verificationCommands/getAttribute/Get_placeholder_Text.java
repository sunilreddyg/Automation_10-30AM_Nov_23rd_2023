package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_placeholder_Text 
{

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		
		//Verify Required placeholder text presented at editbox
		WebElement Email=driver.findElement(By.id("email"));
		
		String Label=Email.getAttribute("placeholder");
		if(Label.equals("Email address or phone number"))
			System.out.println("Testpass");
		else
			System.out.println("Testfail");
			

	}

}

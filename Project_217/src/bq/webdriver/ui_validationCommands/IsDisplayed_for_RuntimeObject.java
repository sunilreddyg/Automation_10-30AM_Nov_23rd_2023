package ui_validationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed_for_RuntimeObject {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Verify Retype Email is visible after typing valid email
		 */
		
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.facebook.com/reg/");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window

		
		WebElement Email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Email.clear();
		//Email.sendKeys("info@mindqsystems.com");
		Thread.sleep(4000);
		
		boolean flag=false;
		try {

			WebElement Retype_email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
			flag=Retype_email.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(flag==true)
			System.out.println("Object Visible at webpage");
		else
			System.out.println("Object Not visible");
		
		
	}

}

package ui_validationCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Or_Disabled 
{

	public static void main(String[] args) throws Exception 
	{
	
		WebDriver driver=new ChromeDriver();  	
		driver.get("https://www.instagram.com/");  
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Verify Login button is disabled
		WebElement LoginBtn=driver.findElement(By.xpath("(//button[contains(.,'Log in')])[1]"));
		if(!LoginBtn.isEnabled())
		{
			System.out.println("Testpass, Button is disabled before entry of name and email");
		}
		else
		{
			System.out.println("Testfail, Button is enabled before entry of name and email");
		}
		
			
		
		/*
		 * Testcase1:--> 
		 * 			Check City Dropdown option disabled
		 * 			before selection of State dropdown
		 * 
		 * Testcase2:-->
		 * 		 	Check City Dropdown option enabled
		 * 			after selection of state dropdown
		 * 
		 * 		URL:--> https://near-me.hdfcbank.com/branch-atm-locator/?lat=17.3687663&long=78.5307314&shared=1
		 */
		

	}

}

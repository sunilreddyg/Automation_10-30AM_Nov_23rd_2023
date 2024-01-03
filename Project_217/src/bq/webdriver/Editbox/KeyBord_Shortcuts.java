package bq.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBord_Shortcuts 
{


	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		

		driver.findElement(By.xpath("//input[@aria-label='First name']"))
		.sendKeys("Raj"+Keys.TAB+"Kumar");
		
		driver.findElement(By.name("reg_email__"))
		.sendKeys("9030248855"+Keys.TAB+"HRM@123");
		
		//Dropdown option selection using sendkeys
		driver.findElement(By.xpath("//select[@id='day']"))
		.sendKeys("28"+Keys.TAB+Keys.ARROW_DOWN+Keys.TAB+"1990");
		
		//Radio button selection using keyboard shortcut
		driver.findElement(By.xpath("//input[@value='1']"))
		.sendKeys(Keys.SPACE,Keys.ARROW_RIGHT);
	}

}

package bq.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingKeys 
{

	public static void main(String[] args) 
	{
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Typing email at entrybox and pressing ENTER key using keyboard shortcut
		driver.findElement(By.name("loginfmt"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		//Typing email at entrybox and pressing ENTER key using keyboard shortcut
		driver.findElement(By.xpath("//input[@placeholder='Password']"))
		.sendKeys("Hello@123"+Keys.ENTER);

	}

}

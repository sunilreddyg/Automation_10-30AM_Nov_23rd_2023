package bq.webdriver.Link;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_And_PartialLinktext {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Identifying link using linktext locator [Using Original linkname]
		driver.findElement(By.linkText("Locations")).click();
		
		//Identifying link with linktext locator
		driver.findElement(By.linkText("India")).click();
		
		//Link identification using xpath
		driver.findElement(By.xpath("//a[contains(.,'FortArea')]")).click();
		
		//Partial Linkname
		driver.findElement(By.partialLinkText("Siwaji Mahraj Turminas")).click();
		
	}
}

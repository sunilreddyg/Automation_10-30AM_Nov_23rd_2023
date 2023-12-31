package bq.webdriver.AutoCompleteBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggesstions 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Account login
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.cssSelector(".oxd-button")).click();
	    
	    WebElement PIM=driver.findElement(By.cssSelector(".oxd-main-menu-item-wrapper:nth-child(2) .oxd-text"));
	    PIM.click();
	    
	    
	    /*
	     * Note:--> There is no separate command for autocompleted
	     * 			editbox.
	     * 
	     * 			=> Selecting Auto suggesstions 
	     * 			1. Type hint at Entrybox
	     * 			2. Wait for the Sugessions
	     * 			3. Using mouse click one of the suggession.
	     */
	    driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("Anthony");
	    driver.findElement(By.xpath("//span[contains(.,'Anthony  Nolan')]")).click();


	}

}

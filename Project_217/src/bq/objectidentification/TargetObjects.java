package objectidentification;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetObjects 
{


	public static void main(String[] args) 
	{
		//Browser setup
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		//Manage backup time upto 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("email")).sendKeys("darshan");
		driver.findElement(By.id("pass")).sendKeys("hello@123");
		driver.findElement(By.name("login")).click();
		
		
		

	}

}

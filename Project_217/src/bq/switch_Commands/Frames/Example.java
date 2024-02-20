package switch_Commands.Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://support.orangehrm.com/portal/en/signin");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	    
	    //Switch to frame using frame ID
	    driver.switchTo().frame("iamFrame");
	    
	    WebElement Email=driver.findElement(By.xpath("//input[@name='username']"));
	    Email.sendKeys("Admin");
	    
	    WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	    password.sendKeys("admin123");
	    
	    WebElement Signin=driver.findElement(By.xpath("//input[@type='submit']"));
	    Signin.click();
	}

}

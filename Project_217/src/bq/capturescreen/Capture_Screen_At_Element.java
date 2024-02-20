package capturescreen;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Capture_Screen_At_Element {

	public static void main(String[] args) throws Exception {
		
		
		/*
		 * Note:--> Only selenium 4 have this feature..
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	    
	    WebElement FooterLinks=driver.findElement(By.id("pageFooterChildren"));
	    
	    //Capturing screen at selected location
	    File src=FooterLinks.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File("Screens\\image2.png"));
	    
	}

}

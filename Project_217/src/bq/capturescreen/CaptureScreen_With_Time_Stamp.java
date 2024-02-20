package capturescreen;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_With_Time_Stamp {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	    
	    
	    
	    WebElement Form=driver.findElement(By.xpath("//div[contains(@class,'52jv')]"));
	    File src=Form.getScreenshotAs(OutputType.FILE);
	    
	    //Create Time Stamp in java
	    Date date=new Date();
	    //Create simple format
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-EEE-dd hh-mm-ss");
	    //Convert Date using simple format
	    String time=sdf.format(date);
	    
	    //Dump screen into local folder
	    FileHandler.copy(src, new File("Screens\\image"+time+".png"));
	    
	    
	    
		/*
		 * Time Regular expressions in java
		 * 
		 * 	yy  ----> year   23
		 * yyyy ----> year   2023
		 * MM   ----> month	 01-12
		 * MMM  ----> month  JAN-DEC
		 * EEE  ----> week   MON -SUN
		 * dd   ----> date	 01-31
		 * hh   ----> hour	 01-24
		 * mm   ----> minute 01 -60
		 * ss   ----> seconds 01-60
		 */
	}

}

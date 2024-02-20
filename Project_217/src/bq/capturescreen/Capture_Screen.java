package capturescreen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Capture_Screen 
{

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	    
	    //Capturing screenshot at webpage and converting into file format
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    //Create folder
	    FileHandler.createDir(new File("Screens"));
	    
	    //Copy file to location
	    FileHandler.copy(src, new File("Screens\\image.png"));
	    
	    
	    //Image Extension [PNG-portable network graphic]
	}

}

package ui_validationCommands;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsChecked {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();  	
		driver.get("https://www.facebook.com/reg/");  
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		


	}

}

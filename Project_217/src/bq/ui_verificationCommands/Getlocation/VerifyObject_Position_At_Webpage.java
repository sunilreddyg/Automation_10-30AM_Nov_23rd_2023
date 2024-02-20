package ui_verificationCommands.Getlocation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyObject_Position_At_Webpage {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//Get Window Size
		int WinSize=driver.manage().window().getSize().getWidth();
		
		//Get Element Location at webpage
		WebElement Element=driver.findElement(By.xpath("//div[contains(@id,'headerPicture')]"));
		int EleLocX=Element.getLocation().getX();
		
		//Prove that element is right side of the webpage
		if(EleLocX > WinSize/2)
			System.out.println("Element is presented at right side of the page");
		else
			System.out.println("Element is presented at left side of the page");
	}

}

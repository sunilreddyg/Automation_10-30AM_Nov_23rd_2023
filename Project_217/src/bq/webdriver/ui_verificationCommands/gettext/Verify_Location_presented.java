package ui_verificationCommands.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Location_presented {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		boolean flag=false;
		try {
			driver.findElement(By.linkText("Instagram"));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		if(flag)
			System.out.println("Element Presented");
		else
			System.out.println("element is not presented");

	}

}

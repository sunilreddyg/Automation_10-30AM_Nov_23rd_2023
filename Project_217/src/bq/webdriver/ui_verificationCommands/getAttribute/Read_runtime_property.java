package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_runtime_property {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Scenario:--> Verifying Double Seat fares Disabled
		 * 				on roundtrip selection
		 * 
		 * 		Give site url is  http://makemytrip.com
		 * 		When User Select Roundtrip Radio button
		 * 		And verify roundtrip is selected
		 * 		Then Verify Double fares checkbox is disabled
		 */
		
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://makemytrip.com");
		Thread.sleep(8000);
		
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip'][contains(.,'Round Trip')]"));
		Roundtrip.click();
		Thread.sleep(2000);
		
		
		//Verify Round trip is selected
		if(Roundtrip.getAttribute("class").equals("selected"))
		{
			System.out.println("Roundtrip is selected");
			
			WebElement DoubleSeatFares=driver.findElement(By.xpath("//p[contains(.,'Double Seat  Fares')]"));
			String Value=DoubleSeatFares.getAttribute("class");
			if(Value.equals("disabled"))
				System.out.println("Testpass, As Expected option disabled on roundtrip selection");
			else
				System.out.println("Testfail,Description");
		}
		else
			System.out.println("Roundtrip selection failed");
		

	}

}

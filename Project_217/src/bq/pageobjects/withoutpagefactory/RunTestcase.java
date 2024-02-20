package pageobjects.withoutpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTestcase 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		Testcase obj=new Testcase(driver);
		obj.Test1_FbValidRegistration();
	}

}

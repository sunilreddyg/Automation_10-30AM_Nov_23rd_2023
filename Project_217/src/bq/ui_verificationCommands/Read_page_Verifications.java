package ui_verificationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_page_Verifications {

	public static void main(String[] args) 
	{
		
		//Browser setup
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		
		String PageTitle=driver.getTitle();
		System.out.println("Current window title is :--> "+PageTitle);

		String PageUrl=driver.getCurrentUrl();
		System.out.println("Current Window url is :--> "+PageUrl);
		
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
	}

}

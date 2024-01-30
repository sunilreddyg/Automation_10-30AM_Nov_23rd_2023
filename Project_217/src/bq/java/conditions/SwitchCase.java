package bq.java.conditions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCase {

	public static void main(String[] args) 
	{
		
		/*
		 * switch:--> 
		 * 			multi decision statement, It works similar
		 * 			as else if but only difference is it will
		 * 			switch to requried case instead of checking
		 * 			all conditions..
		 */
		
		
		String month="feb";
		
		switch (month) 
		{
		case "jan":
			System.out.println("10% discount");
			break;

		case "feb":
			System.out.println("20% discount");
			break;
			
		case "mar":
			System.out.println("30% discount");
			break;
			
		default:
			System.out.println("Month Mismatch");
			break;
		}
		
		
		//Switch using number
		int mnth=1;
		switch (mnth) 
		{
		case 1:
			System.out.println("10% Discount");
			break;
			
		case 5:
			System.out.println("20% Discount");
			break;
			
		default:
			System.out.println("No Discount");
			break;
		}
		
		
		
		//Cross Browser testing
		WebDriver driver=null;
		String browserpath="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\";
		String browser="chrome";
		switch (browser) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", browserpath+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", browserpath+"geckodriver.exe");
			driver=new ChromeDriver();
			break;

		default:
			System.out.println("browser mismatch");
			break;
		}
		
		
		
		if(driver!=null)
		{
			driver.get("http://facebook.com");
		}
		else
			System.out.println("browser launch failed");

	}

}

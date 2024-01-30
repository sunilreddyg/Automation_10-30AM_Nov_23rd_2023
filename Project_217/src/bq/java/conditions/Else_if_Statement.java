package bq.java.conditions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Else_if_Statement {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Elseif:-->
		 * 		Multiple decision take place here..
		 */
		
		
		 int a=18;
		 
		if (a > 18) 
		{
			System.out.println("Valid");
		}
		else if(a < 18)
		{
			System.out.println("invalid age");
		}
		else if(a == 18)
		{
			System.out.println("Same age");
		}
		else
		{
			System.out.println("All are wrong");
		}
		
		
		
		
		String browser="firefox1";
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		if(driver!=null)
		{
			driver.get("http://facebook.com");
		}
		else
			System.out.println("browser launch failed");
		
		
		
		 
		
		
	}

}

package testchrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome
{


	public static void main(String[] args) 
	{
				//Launching chrome driver
				ChromeDriver chrome=new ChromeDriver();
				
				//Loading webpage
				chrome.get("http://facebook.com");
	}

}

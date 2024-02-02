package ui_verificationCommands.getAttribute;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_EntryBox_input_Value {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		
		//Reading input value from textbox.
		WebElement DateEB=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		String Act_Date=DateEB.getAttribute("value");
		System.out.println(Act_Date);
		
		
		
	}

}

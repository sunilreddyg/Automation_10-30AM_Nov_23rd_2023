package bq.webdriver.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Commands {


	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Selecting dropdown option using option text
		WebElement DOB_Day=driver.findElement(By.id("day"));
		new Select(DOB_Day).selectByVisibleText("12");
		
		//Selecting dropdown option with value property
		WebElement DOB_month=driver.findElement(By.id("month"));
		new Select(DOB_month).selectByValue("11");
		
		//Selectind dropdown option using index number
		WebElement DOB_year=driver.findElement(By.id("year"));
		new Select(DOB_year).selectByIndex(10);
	}

}

package bq.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownSelection_Using_ClickMethod 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		/*
		 * => Identifying Parent Object   [Select Tag Element]
		 * => Identifying Child Object under parent object  [Option Tag Element]
		 * => Then we used click option to select one of dropdown option
		 */
		
		WebElement DayDD=driver.findElement(By.id("day"));
		DayDD.findElement(By.xpath("//option[@value='14']")).click();
		
		
		/*
		 * => I Copied direct xpath of Dropdown Option [Option tag xpath]
		 * => Then I Located element and perform click action
		 */
		WebElement MonthDD=driver.findElement(By.xpath("//option[contains(.,'Nov')]"));
		MonthDD.click();
		
		
		/*
		 * => Identifying Parent Object   [Select Tag Element]
		 * => Identifying Child Object under parent object  [Option Tag Element]
		 * => Then we used click option to select one of dropdown option
		 */
		WebElement DD_Year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		DD_Year.findElement(By.xpath("//option[@value='1990']")).click();
		
	}
}

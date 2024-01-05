package bq.webdriver.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Option_Selection 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/*
		 * Converting Single Selection Dropdown into
		 * Multiple Selection dropdown..
		 */
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('day').setAttribute('multiple','multiple')");
		Thread.sleep(4000);
		
		//Selecting Multiple Option Under Dropdown
		//Note:--> There is no default method for multiple selection
		//user selection method multiple times to select multiple options
		WebElement DD_Day=driver.findElement(By.id("day"));
		new Select(DD_Day).deselectAll();  //This method only works when dropdown is multiple selection type
		new Select(DD_Day).selectByVisibleText("5");
		new Select(DD_Day).selectByVisibleText("10");
		new Select(DD_Day).selectByVisibleText("15");
	}

}

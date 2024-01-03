package bq.webdriver.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Reference {


	public static void main(String[] args) 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		//Storing WebElement into Reference variable
		WebElement Firstname=driver.findElement(By.xpath("//input[@aria-label='First name']"));
		Firstname.sendKeys("Raj");
		Firstname.clear();
		Firstname.sendKeys("Yuvraj");
		
		//Storing Object location into reference variable
		By surname=By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input");
		WebElement SurnamepageElement=driver.findElement(surname);
		SurnamepageElement.sendKeys("Kumar");

	}

}

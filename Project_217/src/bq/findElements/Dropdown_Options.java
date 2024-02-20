package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown_Options 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//Target Single Dropdown 
		WebElement StateDrodpown=driver.findElement(By.id("customState"));
		//finding list of options tags under dropdown
		List<WebElement> Alloptions=StateDrodpown.findElements(By.tagName("option"));
		
		if(Alloptions.size() > 0)
		{
			System.out.println("Options Count is --> "+Alloptions.size());
			Alloptions.remove(0);
			
			for (WebElement eachoption : Alloptions) 
			{
				System.out.println(eachoption.getText());
				eachoption.click();
				Thread.sleep(300);
			}
		}
		else
			System.out.println("Zero objects found");
		
		
		
		
	}

}

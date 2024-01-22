package switch_Commands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_OK_button {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    
	    //This action open alert at webbrowser
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    
	    //This action read text presented at alert window
	    String alert_msg=driver.switchTo().alert().getText();
	    System.out.println(alert_msg);
	    
	    //This action press ok button at alert windriver.switchTo().alert().accept();
	    driver.switchTo().alert().accept();
	   
	    
	    
	   

	}

}

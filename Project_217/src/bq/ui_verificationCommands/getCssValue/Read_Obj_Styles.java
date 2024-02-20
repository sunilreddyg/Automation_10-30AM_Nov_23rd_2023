package ui_verificationCommands.getCssValue;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;


public class Read_Obj_Styles 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		
		WebElement LoginBtn=driver.findElement(By.xpath("//button[contains(.,'Login')]"));
		
		//Read background color
		String BGcolor=LoginBtn.getCssValue("background-color");
		System.out.println("BG color in RGBA format--> "+BGcolor);
		
		String Exp_Color_in_HEX="#ff7b1d";
		
		Color clr=Color.fromString(Exp_Color_in_HEX);
		String Exp_Color_in_RGBA=clr.asRgba();
		
		
		if(BGcolor.equals(Exp_Color_in_RGBA))
			System.out.println("Testpass");
		else
			System.out.println("Tesfail");
	}

}

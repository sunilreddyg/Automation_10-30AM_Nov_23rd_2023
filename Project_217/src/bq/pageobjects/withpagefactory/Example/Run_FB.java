package pageobjects.withpagefactory.Example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_FB 
{

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Inorder to use @findby annotated methods we should use
		//PageFactory Library class
		FBLogin login=PageFactory.initElements(driver, FBLogin.class);
		login.email.sendKeys("user1");
		login.password.sendKeys("admin@123");
		login.login.click();
		
		login.userlogin();
		
		
		//Create object for registration
		FBreg reg=new FBreg(driver);
		reg.userregistration();
		
	}

}

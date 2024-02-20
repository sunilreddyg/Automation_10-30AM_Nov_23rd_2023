package pageobjects.withpagefactory.Example;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBLogin 
{
	WebDriver driver;
	public FBLogin(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement email;
	
	//Declaring object using pagefactory.
	@FindBy(xpath="//input[@id='pass']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@name='login']")
	public WebElement login;
	
	@FindBy(xpath = "//a[contains(.,'Forgotten password?')]")
	public WebElement forgotpassword;
	
	
	public void userlogin()
	{
		verifypagetitlepresented();
		email.sendKeys("user1");
		password.sendKeys("admin123");
		login.click();
	}
	
	
	
	
	String Exp_title="Facebook – log in or sign up";
	public void verifypagetitlepresented()
	{
		try {
			new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.titleIs(Exp_title));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	


}

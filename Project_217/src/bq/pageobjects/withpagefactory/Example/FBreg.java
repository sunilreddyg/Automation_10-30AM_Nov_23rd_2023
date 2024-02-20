package pageobjects.withpagefactory.Example;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FBreg
{
	WebDriver driver;
	public FBreg(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	

	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement  firstname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement  Surname;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	public WebElement  email;
	
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	public WebElement  Retypeemail;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	public WebElement  password;
	
	@FindBy(xpath = "//select[@aria-label='Day']")
	public WebElement  DOBday;
	
	@FindBy(xpath = "//select[@aria-label='Month']")
	public WebElement  DOBmonth;
	
	@FindBy(xpath = "//select[@aria-label='Year']")
	public WebElement  DOBYear;
	
	
	public void userregistration()
	{
		firstname.sendKeys("SUresh");
		Surname.sendKeys("Kumar");
		email.sendKeys("suresh@gmail.com");
		
	}

}
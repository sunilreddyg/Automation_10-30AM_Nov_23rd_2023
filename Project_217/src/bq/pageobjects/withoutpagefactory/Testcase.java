package pageobjects.withoutpagefactory;

import org.openqa.selenium.WebDriver;



public class Testcase 
{
	WebDriver driver;
	FBLogin login;
	FB_Reg reg;
	
	public Testcase(WebDriver driver) 
	{
		this.driver=driver;
		login=new FBLogin(driver);
		reg=new FB_Reg(driver);
	}
	
	public void Test1_FbValidRegistration()
	{
		login.createnewaccount();
		reg.userregistration();
	}
	
	

}

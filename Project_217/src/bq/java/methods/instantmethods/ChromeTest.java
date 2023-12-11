package bq.java.methods.instantmethods;

public class ChromeTest 
{
	
	public ChromeTest() 
	{
		System.out.println("Checking Internet connection");
	}
	
	public void OpenPage() 
	{
		System.out.println("page is Opened");
	}
	
	public void EnterLogin()
	{
		System.out.println("Login Details entered");
	}
	
	public void Logout()
	{
		System.out.println("User Logout Successful");
	}
	
	public static void main(String[] args) 
	{
		new ChromeTest().OpenPage();
		new ChromeTest().EnterLogin();
		new ChromeTest().Logout();
		
	}

}

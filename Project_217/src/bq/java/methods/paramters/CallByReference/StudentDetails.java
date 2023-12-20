package bq.java.methods.paramters.CallByReference;

public class StudentDetails 
{
	
	String name="Aakash";
	
	public void GetAddress()
	{
		System.out.println(name+" Address is ---> HYD ");	
	}
	
	public static String Country(String Cityname)
	{
		System.out.println("Address :--> "+Cityname);
		return Cityname;
	}

}

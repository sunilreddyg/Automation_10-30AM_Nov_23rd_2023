package bq.java.methods;

public class TVRemote 
{
	
	//Reusable methods
	public void turnon() 
	{
		System.out.println("Turned on");
	}
	
	//Reusable methods
	public void turnoff() 
	{
		System.out.println("Turned off");
	}
	
	public static void main(String[] args) 
	{
		//new TVRemote().turnon();
		new TVRemote().turnoff();
	}

}

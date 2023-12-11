package bq.java.constrcutor;

public class RobotB 
{
	//Class Constructor [or] Class Instance
	public RobotB() 
	{
		System.out.println("Instance Executed");
	}
	
	//Reusable method [and] instance method
	public void run() 
	{
		System.out.println("Run Exeuted");
	}
	
	//Reusable method [and] instance method
	public void walk() 
	{
		System.out.println("walk Exeuted");
	}
	
	//Static Method
	public static void standby() 
	{
		System.out.println("Robot in stand by mode");
	}
	
	public static void main(String[] args) 
	{
		//Calling Instant method using constructor
		new RobotB().run();
		new RobotB().walk();
		
		//Calling static method without using class
		//Note:--> with in class no need to use class-name
		standby();
		
		//Calling static method from different class.
		//To call static method outside the class we must use Classname
		RobotB.standby();
	}

}

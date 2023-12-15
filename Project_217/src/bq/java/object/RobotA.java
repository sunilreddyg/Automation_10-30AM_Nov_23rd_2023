package bq.java.object;

public class RobotA 
{

	public RobotA()
	{
		System.out.println("Power on");
	}

	public void startWalk()
	{
		 System.out.println("Walk started");
	}

	public void IncreaseSpeed()
	{
		 System.out.println("Speed Increased");
	}

	
	
	public static void main(String[] args) 
	{
		
		/*
		 * Object Creation Syntax:-->
		 * 		Classname obj=new Classname();
		 * 		obj.methodname();
		 */
		
		RobotA obj=new RobotA();
		obj.startWalk();
		obj.IncreaseSpeed();

	}

}

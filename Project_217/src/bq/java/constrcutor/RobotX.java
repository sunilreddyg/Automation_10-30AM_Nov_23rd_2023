package bq.java.constrcutor;

public class RobotX 
{
	int speed;

	public RobotX(int speedinkmps) 
	{
		System.out.println("SpeedSet:--> "+speedinkmps);
		speed=speedinkmps;
	}
	
	public void walk()
	{
		System.out.println("Walk Executed in KMSP is --> "+speed);
	}
	
	public void Run()
	{
		System.out.println("Run Executed in KMSP is --> "+speed);
	}

	public static void main(String[] args) 
	{
		new RobotX(100).walk();
		new RobotX(12).Run();
		

	}

}

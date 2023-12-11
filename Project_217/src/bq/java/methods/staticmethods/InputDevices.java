package bq.java.methods.staticmethods;



public class InputDevices 
{
	
	public static void Keyboard() 
	{
		System.out.println("keyboard is active");
	}
	
	public static void Mouse()
	{
		System.out.println("Mouse is active");
	}

	public static void main(String[] args) 
	{
		//Calling Static method With in class
		Keyboard();
		Mouse();

		//Calling Static methods outside the class
		InputDevices.Keyboard();
		InputDevices.Mouse();
		
		
	}

}

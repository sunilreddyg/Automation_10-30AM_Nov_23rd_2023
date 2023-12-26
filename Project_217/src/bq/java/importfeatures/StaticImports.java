package importfeatures;
import static java.lang.Math.*;
import static java.lang.System.*;                                                                                                                                    
import static bq.java.methods.staticmethods.InputDevices.*;
public class StaticImports 
{


	public static void main(String[] args) 
	{
		
			//Without static import
			System.out.println(Math.abs(10.0));
			System.setProperty("Webdriver", ".exe");
		
			//When user declare import with static
			//We no need to include classname get static methods and variables.
			System.out.println(abs(10));
			setProperty("Webdriver", ".exe");
			
			//Calling static method without classname
			Keyboard();
	}

}

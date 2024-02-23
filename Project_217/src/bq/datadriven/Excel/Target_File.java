package datadriven.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Target_File 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Create Excel binary file
		FileOutputStream fo=new FileOutputStream("TestData\\output.xlsx");
		System.out.println("File Created");
		
		//Locate Excel file
		FileInputStream fi=new FileInputStream("TestData\\input.xlsx");
		System.out.println("File located");
	}

}

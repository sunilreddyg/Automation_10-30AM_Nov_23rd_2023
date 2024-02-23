package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import library.CommonActions;

public class ReadData_From_ExcelWorkbook 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Locate Excel file
		FileInputStream fi=new FileInputStream("TestData\\input.xlsx");
		System.out.println("File located");
		
		//Get Excel Workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using workbook
		XSSFSheet sht=book.getSheet("login");
		
		//Target Row using sheet
		XSSFRow row=sht.getRow(1);
		
		//Target Cell using row reference
		XSSFCell cell=row.getCell(0);

		//Reading characters from Cell
		String browser=cell.getStringCellValue();
		System.out.println(browser);
		
		
		//Read url from cell
		String url=row.getCell(1).getStringCellValue();
		System.out.println(url);
		
		//Read  username and password
		String UID=row.getCell(2).getStringCellValue();
		String PWD=row.getCell(3).getStringCellValue();
		
		
		CommonActions action=new CommonActions();
		action.launchBrowser(browser);
		action.LoadPage(url);
		action.explicitwait(30);
		
		
		By username=By.xpath("//input[@name='username']");
		By password=By.xpath("//input[@name='password']");
		By login=By.xpath("//button[@type='submit']");
		
		
		action.typetext(username, UID);
		action.typetext(password, PWD);
		action.ClickonElement(login);
	}

}

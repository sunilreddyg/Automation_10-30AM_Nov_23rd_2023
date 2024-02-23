package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Numeric_Value {

	public static void main(String[] args) throws Exception {
		
		//Target file from local system
		FileInputStream fi=new FileInputStream("TestData\\Input.xlsx");
		System.out.println("File located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book reference
		XSSFSheet sht=book.getSheet("Numbers");
		
		//Target using sheet Reference
		XSSFRow row=sht.getRow(1);
		
		//GetNumricCellvalue method by default read numer into double format
		Double dvalue=row.getCell(2).getNumericCellValue();
		
		
		if(dvalue==30)
			System.out.println("Testpass");
		else
			System.out.println("Testfail");
		
		
		
		
		//Convert numer into String
		String ExpNum="30";
		double dvalue1=row.getCell(2).getNumericCellValue();
		String Svalue=NumberToTextConverter.toText(dvalue1);
		if(Svalue.equals(ExpNum))
			System.out.println("Testpass");
		else
			System.out.println("Testfail");
	}

}

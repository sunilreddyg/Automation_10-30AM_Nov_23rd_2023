package datadriven.Keywords;

import java.util.List;

public class ReadExcelData_Using_Keywords {

	public static void main(String[] args) {
		
		
		Excel.getexcel("Input.xlsx", "login");
		String Browser=Excel.getCellData(1, 0);
		System.out.println(Browser);
		
		
		String filepath="TestData\\Input.xlsx";
		String sheetname="multiple";
		
		List<List<String>> list=ExcelReader.readExcel(filepath, sheetname);
		list.remove(0);
		
		for (List<String> row : list) 
		{
			String UID=row.get(0);
			String PWD=row.get(1);
			System.out.println(UID+"  "+PWD);
		}
		

	}

}

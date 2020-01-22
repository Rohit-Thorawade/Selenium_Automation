/**
 * @author Rohit Thorawade
 * @purpose Adding Excel sheetname in File 
 *
 */
package com.bridgelabz.datadriven.selenium;

import com.bridgelabz.datadriven.selenium.excelutility.Xls_Reader;

public class AddExcelSheet extends BaseClass{
	public static void main(String[] args)
	{
		//Reading Excel file 
		Xls_Reader reader = new Xls_Reader("/home/admin-1/eclipse-workspace/SeleniumDemo/src/test/java/com/bridgelabz/datadriven/selenium/test/EbayTestData.xlsx");

		//Check Excel sheetName present in the file 
			if(!reader.isSheetExist("Login"))
			{
				reader.addSheet("Login");
			}
			//Calculating Column Count 
			int colCount = reader.getColumnCount("RegTestData");
			System.out.println("Column count is:"+colCount);
			
			//Calculating Row Count
			System.out.println("Row Number ::"+reader.getCellRowNum("RegTestData", "FirstName", "Rohit"));
	
	}
	
}

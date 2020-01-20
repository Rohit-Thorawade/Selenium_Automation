package com.bridgelabz.seleniumpractice.concept;

import java.util.ArrayList;
import com.bridgelabz.datadriven.selenium.excelutility.Xls_Reader;

public class TestUtilEbay {
	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel()

	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();

		try {
			reader = new Xls_Reader(
					"/home/admin-1/eclipse-workspace/SeleniumDemo/src/test/java/com/bridgelabz/datadriven/selenium/test/EbayTestData.xlsx");

		} catch (Exception e) {
			e.printStackTrace();
		}

		// parameterize data
		for (int rowNum = 2; rowNum <= reader.getRowCount("RegTestData"); rowNum++) {
			// Reading Data
			String firstname = reader.getCellData("RegTestData", "FirstName", rowNum);
			String lastname = reader.getCellData("RegTestData", "LastName", rowNum);
			String email = reader.getCellData("RegTestData", "Email", rowNum);
			String password = reader.getCellData("RegTestData", "Password", rowNum);

			Object[] obj = { firstname, lastname, email, password };
			mydata.add(obj);

		}

		return mydata;

	}

}

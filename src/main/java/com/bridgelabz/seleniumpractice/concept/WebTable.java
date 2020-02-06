/**
 * @author Rohit Thorawade
 * @purpose Implementing program to read PDF file 
 *
 */
package com.bridgelabz.seleniumpractice.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable extends BaseClass {
	
	
		public static void main(String[] args)
		{
			driver.get("file:///home/admin-1/Desktop/WebTable.html");
			
			//Total number of rows
			List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
			int totalrow = allRows.size();
			System.out.println("Total rows:::"+totalrow);
			
			//Total number of columns
			List<WebElement> allColumn = driver.findElements(By.xpath("//th"));
			int totalcolumn = allColumn.size();
			System.out.println("Total rows:::"+totalcolumn);
			
			//Total number of cells
			List<WebElement> allCell = driver.findElements(By.xpath("//th|//td"));
			int totalcell = allCell.size();
			System.out.println("Total rows:::"+totalcell);
			
			int countofnumber =0;
			int sum=0;
			for(WebElement cell:allCell)
			{
				String text = cell.getText();
				try
				{
					int number= Integer.parseInt(text);
					System.out.println(""+number);
					countofnumber++;
					sum+=number;
				}
				catch (Exception e) {
				}
			}
			
			System.out.println("COUNT OF NUMBER::"+countofnumber);
			System.out.println("TOTAL SUM::"+sum);
		
			driver.close();
		}
		

}

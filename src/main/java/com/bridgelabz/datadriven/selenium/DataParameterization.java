/**
 * @author Rohit Thorawade]
 * @purpose Implementing Data parameterization using XML File 
 *
 */
package com.bridgelabz.datadriven.selenium;

import java.io.IOException;

import org.openqa.selenium.By;

import com.bridgelabz.datadriven.selenium.excelutility.Xls_Reader;

public class DataParameterization extends BaseClass {
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	
		//Reading excel file
		Xls_Reader reader = new Xls_Reader("/home/admin-1/eclipse-workspace/SeleniumDemo/src/test/java/com/bridgelabz/datadriven/selenium/test/EbayTestData.xlsx");
		String firstname = reader.getCellData("RegTestData", "FirstName", 2);
		String lastname = reader.getCellData("RegTestData", "LastName", 2);
		String email = reader.getCellData("RegTestData", "Email", 2);
		String password = reader.getCellData("RegTestData", "Password", 2);
		
		//calculating row count
		int  rowcount = reader.getRowCount("RegTestData");
		
		//parameterize data
		for(int i=rowcount;i<=6;i++)
		{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='u_0_q']")).clear();
		driver.findElement(By.xpath("//input[@id='u_0_q']")).sendKeys(firstname);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='u_0_s']")).clear();
		driver.findElement(By.xpath("//input[@id='u_0_s']")).sendKeys(lastname);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='u_0_v']")).clear();
		driver.findElement(By.xpath("//input[@id='u_0_v']")).sendKeys(email);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='u_0_10']")).clear();
		driver.findElement(By.xpath("//input[@id='u_0_10']")).sendKeys(password);
		Thread.sleep(1000);
		}
		driver.close();
	
	}

}

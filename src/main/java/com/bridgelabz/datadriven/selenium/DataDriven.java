package com.bridgelabz.datadriven.selenium;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridgelabz.datadriven.selenium.excelutility.Xls_Reader;

public class DataDriven extends BaseClass{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		//driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F");
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='gh-control ghn-b gh-eb-li-a']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'sign-in')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='InLineCreateAnAccount']")).click();
		Thread.sleep(4000);
		//Reading Excel file
		Xls_Reader reader = new Xls_Reader("/home/admin-1/eclipse-workspace/SeleniumDemo/src/test/java/com/bridgelabz/datadriven/selenium/test/EbayTestData.xlsx");

		//add column into excel sheet
		reader.addColumn("RegTestData","Status");
		
		//calculating row count
		int rowcount = reader.getRowCount("RegTestData");
		
		//parameterize 
		for(int rowNum=2 ;rowNum<=rowcount;rowNum++)
		{
			//Reading Data 
			String firstname = reader.getCellData("RegTestData", "FirstName", rowNum);
			String lastname = reader.getCellData("RegTestData", "LastName", rowNum);
			String email = reader.getCellData("RegTestData", "Email", rowNum);
			String password = reader.getCellData("RegTestData", "Password", rowNum);
			
			//Entering  Data 
			Thread.sleep(1000);
			WebElement fname =driver.findElement(By.xpath("//input[@id='firstname']"));
			fname.clear();
			fname.sendKeys(firstname);
			
			Thread.sleep(1000);
			WebElement lname =driver.findElement(By.xpath("//input[@id='lastname']"));
			lname.clear();
			lname.sendKeys(lastname);
		
			Thread.sleep(1000);
			WebElement emailId= driver.findElement(By.xpath("//input[@id='email']"));
			emailId.clear();
			emailId.sendKeys(email);
			
			Thread.sleep(1000);
			
			WebElement pass= driver.findElement(By.xpath("//input[@id='PASSWORD']"));
			pass.clear();
			pass.sendKeys(password);
			Thread.sleep(1000);	
			
			reader.setCellData("RegTestData", "Status", rowNum, "Pass");
			
		}
		driver.close();
		
	}
}

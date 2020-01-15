/**
 * @author Rohit Thorawade
 * @Purpose Implementing Take Screenshot interface Method
 *
 */
package com.bridgelabz.seleniumpractice.concept;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CapturingScreenshot  extends BaseClass{

	public static void main(String[] args) throws IOException, InterruptedException
	{

		driver.get("http://www.google.com");	
		Date date1 = new Date();
		String date2 = date1.toString();		
		System.out.println(date1);
		String date3 = date2.replaceAll(":", "_");	
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;	
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("/home/admin-1/eclipse-workspace/SeleniumDemo/screenshot/"+date3+"photo.png");	
		FileUtils.copyFile(srcFile, destFile);
		Thread.sleep(3000);
		driver.close();	
		
	}
	
	
}

package com.bridgelabz.seleniumpractice.concept;

import org.openqa.selenium.By;

public class FileUploadPopUp extends BaseClass {
	public static void main(String[] args) throws InterruptedException
	{
		driver.get("https://html.com/input-type-file/");
		
		Thread.sleep(3000);
		//upload file 
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/home/admin-1/Desktop/page2.html");
	
		Thread.sleep(2000);
		//driver.close();
			
		
	}
	

}

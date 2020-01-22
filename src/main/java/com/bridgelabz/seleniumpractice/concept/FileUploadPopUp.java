/**
 * @author Rohit Thorawade]
 * @purpose Implementing File Upload Pop-up 
 *
 */
package com.bridgelabz.seleniumpractice.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopUp  {
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", "/home/admin-1/eclipse-workspace/Selenium/FireFoxDriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://html.com/input-type-file/");
		
		Thread.sleep(3000);
		//upload file 
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/home/admin-1/Desktop/page2.html");
	
		Thread.sleep(2000);
		//driver.close();

	}
	

}

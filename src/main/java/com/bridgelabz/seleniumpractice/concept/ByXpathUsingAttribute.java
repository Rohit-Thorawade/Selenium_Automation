/**
 * @author Rohit Thorawade
 * @Purpose Implementing Xpath on facebook application for registration  purpose  
 *
 */
package com.bridgelabz.seleniumpractice.concept;

import org.openqa.selenium.By;

public class ByXpathUsingAttribute extends BaseClass  {
			

	public static void main(String[] args) throws InterruptedException
	{
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		
		
		String email_xpath ="//input[@name='email']";
		driver.findElement(By.xpath(email_xpath)).sendKeys("8109555221");

		//finding Element using contains attribute 
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("test@123");
		Thread.sleep(3000);
		
		//finding Element using contains attribute
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
//		Thread.sleep(2000);
				
		driver.close();
	
	}

}

/**
 * @author Rohit Thorawade
 * @Purpose Implementing Xpath on facebook application for registration  purpose  
 *
 */
package com.bridgelabz.seleniumpractice.concept;

import org.openqa.selenium.By;

public class ByXpathUsingAttribute extends BaseClass {
			

	public static void main(String[] args) throws InterruptedException
	{

		driver.get("http://www.facebook.com");
		String email_xpath ="//input[@name='email']";
		driver.findElement(By.xpath(email_xpath)).sendKeys("rohit.thorawade51@gmail.com");

		//finding Element using contains attribute 
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("king@21324");
		Thread.sleep(3000);
		
		//finding Element using contains attribute
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).click();
		driver.close();
	
	}

}

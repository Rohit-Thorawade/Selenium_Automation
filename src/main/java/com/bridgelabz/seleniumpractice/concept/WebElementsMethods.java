/**
 * @author Rohit Thorawade
 * @Purpose Implementing WebElements Interface Methods 
 *
 */
package com.bridgelabz.seleniumpractice.concept;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementsMethods extends BaseClass {

	public static void main(String[] args) throws InterruptedException, AWTException {

		driver.get("http://www.facebook.com");

		String email_xpath = "//input[@name='email'][@id='email']";
		WebElement emailId = driver.findElement(By.xpath(email_xpath));
		
		//Finding and sending Keys to the elements
		driver.findElement(By.xpath(email_xpath)).sendKeys("rotz2209@gmail.com");
		driver.findElement(By.xpath(email_xpath)).clear();

		//finding height of the elements
		int emailId_height = emailId.getSize().getHeight();
		System.out.println("Height of the emailID Textbox::::" + emailId_height);

		//finding width of the elements
		int emailId_width = emailId.getSize().getWidth();
		System.out.println("width of the emailID Textbox::::" + emailId_width);

		//finding the X co-ordinate of the emailId textbox
		int emailId_X = emailId.getLocation().getX();
		System.out.println("X co-ordinate of the emailID Textbox::::" + emailId_X);
		
		//finding the Y co-ordinate of the emailId textbox
		int emailId_Y = emailId.getLocation().getY();
		System.out.println("Y co-ordinate of the emailID Textbox::::" + emailId_Y);
		
		Thread.sleep(3000);
		driver.close();

	}

}

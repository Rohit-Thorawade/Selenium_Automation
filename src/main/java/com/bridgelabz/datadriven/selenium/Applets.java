/**
 * @author Rohit Thorawade
 * @purpose Implementing applets program
 *
 */
package com.bridgelabz.datadriven.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


public class Applets extends BaseClass {

	
	
	public static void main(String [] args) throws InterruptedException
	{
		driver.get("http://lionsgate.tripod.com/");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//font[contains(text(),'Some Online Tools')]")).click();
		Thread.sleep(5000);
		
	}
}

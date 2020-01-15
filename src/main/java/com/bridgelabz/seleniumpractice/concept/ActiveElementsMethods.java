/**
 * @author Rohit Thorawade
 * @Purpose Implementing activeElements methods
 *
 */
package com.bridgelabz.seleniumpractice.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ActiveElementsMethods  extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException
	{
		driver.get("http://www.facebook.com");
		
		driver.switchTo().activeElement().sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		Thread.sleep(2000);
		driver.close();
	}

}

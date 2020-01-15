/**
 * @author Rohit Thorawade
 * @Purpose Implementing activeElements methods
 *
 */
package com.bridgelabz.seleniumpractice.concept;

public class ActiveElementsMethods  extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException
	{
		driver.get("http://www.facebook.com");
		
		driver.switchTo().activeElement().sendKeys("admin");
		
		driver.switchTo().activeElement().clear();

		Thread.sleep(3000);
		driver.close();
	}

}

/**
 * @author Rohit Thorawade
 * @Purpose Opening & navigating Chrome Browser
 *
 */
package com.bridgelabz.seleniumpractice.concept;


public class NavigateBrowser extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		driver.get("http://www.google.com");
		Thread.sleep(2000);
		
		//Navigate to given URL
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(2000);
		//Backward Navigation 
		driver.navigate().back();
		Thread.sleep(2000);
		//Forward Navigation
		driver.navigate().forward();
		Thread.sleep(2000);
		//Refresh Navigated page
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
	}

}

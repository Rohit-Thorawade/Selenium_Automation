/**
 * @author Rohit Thorawade
 * @Purpose Implementing baseclass to set the property for driver 
 *
 */
package com.bridgelabz.seleniumpractice.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver",
				"/home/admin-1/eclipse-workspace/SeleniumDemo/driver/chromedriver");
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}

}

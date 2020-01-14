/**
 * @author Rohit Thorawade
 * @Purpose Implementing Xpath on facebook application for registration  purpose  
 *
 */
package com.bridgelabz.OpenBrowser.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpathUsingAttribute extends Base {
			

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	
		String email_xpath ="//input[@name='email']";
		driver.findElement(By.xpath(email_xpath)).sendKeys("rohit.thorawade51@gmail.com");

		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("king@21324");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).click();
		driver.close();
	}

}

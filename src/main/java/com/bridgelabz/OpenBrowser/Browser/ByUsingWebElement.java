/**
 * @author Rohit Thorawade
 * @Purpose Find locator using id & name
 *
 */
package com.bridgelabz.OpenBrowser.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin-1/eclipse-workspace/SeleniumDemo/driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		WebElement user = driver.findElement(By.id("email"));
		user.clear();
		user.sendKeys("rotz2209@gmail.com");

		WebElement pass = driver.findElement(By.name("pass"));
		pass.clear();
		pass.sendKeys("7896547896");

		Thread.sleep(5000);
		driver.close();

	}

}

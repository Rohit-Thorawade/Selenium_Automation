/**
 * @author Rohit Thorawade
 * @Purpose Opening  Chrome Browser
 *
 */
package com.bridgelabz.OpenBrowser.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin-1/eclipse-workspace/SeleniumDemo/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.close();
	}

}

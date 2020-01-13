/**
 * @author Rohit Thorawade
 * @Purpose Handling key events on facebook application
 *
 */
package com.bridgelabz.OpenBrowser.Browser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardMouse {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin-1/eclipse-workspace/SeleniumDemo/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);

		driver.get("http://www.google.com");

		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);

		Thread.sleep(3000);

		driver.close();

	}

}

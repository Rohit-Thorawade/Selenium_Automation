/**
 * @author Rohit Thorawade
 * @Purpose Implementing Xpath on Facebook application for login purpose  
 *
 */
package com.bridgelabz.OpenBrowser.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/admin-1/eclipse-workspace/SeleniumDemo/driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		String email_xpath = "//input[@name='email'][@id='email']";
		driver.findElement(By.xpath(email_xpath)).sendKeys("rotz2209@gmail.com");

		Thread.sleep(2000);

		String pwd_xpath = "//input[@name='pass'][@id='pass']";
		driver.findElement(By.xpath(pwd_xpath)).sendKeys("7896547896");

		String login_xpath = "//input[@type='submit'][@id='u_0_b']";

		driver.findElement(By.xpath(login_xpath)).click();

		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		driver.close();

	}
}

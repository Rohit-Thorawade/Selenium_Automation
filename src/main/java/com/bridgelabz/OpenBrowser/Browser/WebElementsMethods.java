package com.bridgelabz.OpenBrowser.Browser;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods extends Base {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		String email_xpath = "//input[@name='email'][@id='email']";
		WebElement emailId = driver.findElement(By.xpath(email_xpath));
		driver.findElement(By.xpath(email_xpath)).sendKeys("rotz2209@gmail.com");
		driver.findElement(By.xpath(email_xpath)).clear();

		int emailId_height = emailId.getSize().getHeight();
		System.out.println("Height of the emailID Textbox::::" + emailId_height);

		int emailId_width = emailId.getSize().getWidth();
		System.out.println("width of the emailID Textbox::::" + emailId_width);

		int emailId_X = emailId.getLocation().getX();
		System.out.println("X co-ordinate of the emailID Textbox::::" + emailId_X);
		
		int emailId_Y = emailId.getLocation().getY();
		System.out.println("Y co-ordinate of the emailID Textbox::::" + emailId_Y);

		Thread.sleep(3000);
		driver.close();

	}

}

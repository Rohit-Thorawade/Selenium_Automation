/**
 * @author Rohit Thorawade
 * @purpose Implementing applets program
 *
 */
package com.bridgelabz.datadriven.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class AppletTestingWebdriver  extends BaseClass{
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		
				driver.get("https://www.raditha.com/java/alert.php");
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				Thread.sleep(2000);
				driver.findElement(By.xpath("//textarea[@name='txt1']")).clear();

				driver.findElement(By.xpath("//textarea[@name='txt1']")).click();
				driver.findElement(By.xpath("//textarea[@name='txt1']")).sendKeys("Hello World");
				WebElement button = driver.findElement(By.xpath("//input[@value='Update applet']"));
				js.executeScript("arguments[3].click();", button);
 
	}
 
}
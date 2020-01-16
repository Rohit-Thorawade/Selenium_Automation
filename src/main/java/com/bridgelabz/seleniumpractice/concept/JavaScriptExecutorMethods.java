/**
 * @author Rohit Thorawade
 * @Purpose Implementing JavaScriptExecutor Interface Methods
 *
 */
package com.bridgelabz.seleniumpractice.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorMethods extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException
	{
		driver.get("http:www.amazon.com");
		
		WebElement element = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		int x= element.getLocation().getX();
		int y= element.getLocation().getY();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		
		element.click();
		Thread.sleep(3000);
		driver.close();

		
		
		
	}

}

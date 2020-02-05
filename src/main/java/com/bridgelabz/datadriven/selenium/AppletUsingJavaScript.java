package com.bridgelabz.datadriven.selenium;

import org.openqa.selenium.JavascriptExecutor;

public class AppletUsingJavaScript extends BaseClass {
	
	public static void main(String[] args)
	{
		driver.get("http://tinyurl.com/ct697n7");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("receiver.incrementCounter();");
		 js.executeScript("receiver.incrementCounter();");
		 js.executeScript("receiver.incrementCounter();");
		 js.executeScript("receiver.incrementCounter();");
		 js.executeScript("receiver.incrementCounter();");
		 js.executeScript("receiver.incrementCounter();");
		
	}

}

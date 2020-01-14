package com.bridgelabz.OpenBrowser.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElementsMethods  extends Base {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.switchTo().activeElement().sendKeys("admin");
		Thread.sleep(3000);
		driver.close();
	}

}

package com.bridgelabz.seleniumpractice.concept;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadOnFirefox {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "/home/admin-1/eclipse-workspace/SeleniumDemo/FireFoxDriver/geckodriver");
		
		// creating an instance of FirefoxProfile
		FirefoxProfile profile = new FirefoxProfile();

		
		profile.setPreference("","");


		// instantiating firefox driver with defined FirefoxProfile

		@SuppressWarnings("deprecation")
		WebDriver driver = new FirefoxDriver((Capabilities) profile);
		
	}

}

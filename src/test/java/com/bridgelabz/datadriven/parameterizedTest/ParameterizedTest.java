package com.bridgelabz.datadriven.parameterizedTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterizedTest {
	WebDriver driver;
	
	
	@BeforeSuite
	public void setup()
	{

		System.setProperty("webdriver.chrome.driver", "/home/admin-1/eclipse-workspace/SeleniumDemo/driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	
	
	@Test
	@Parameters({"emailId","password"})
	public void testFbLogin(String emailId,String password)
	{
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailId);
	
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		
	}
	
	@AfterSuite
	public void teardown()
	{
		driver.close();
	}

}

package com.bridgelabz.seleniumpractice.concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class RecordTestVideo {
	
	WebDriver driver;
	ATUTestRecorder recorder;
	
	@BeforeMethod
	public void setup() throws ATUTestRecorderException
	{

		System.setProperty("webdriver.chrome.driver", "/home/admin-1/eclipse-workspace/Selenium/driver/chromedriver");
		recorder = new ATUTestRecorder("VideoRecord/","FacebokLoginExecution",false);
		recorder.start();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	
	@Test
	public void testFbLogin() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8109555221");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("testdata@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		
	}
	
	@AfterMethod
	public void teardown() throws ATUTestRecorderException
	{
		driver.close();
		recorder.stop();
	}

}



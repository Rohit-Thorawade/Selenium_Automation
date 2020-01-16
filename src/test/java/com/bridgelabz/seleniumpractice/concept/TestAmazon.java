package com.bridgelabz.seleniumpractice.concept;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestAmazon {

	static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver",
				"/home/admin-1/eclipse-workspace/SeleniumDemo/driver/chromedriver");

	}

	// opening Browser
	@BeforeSuite()
	public void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");

	}

	@Test
	public void TestCreateAccount() throws InterruptedException {

		driver.findElement(By
				.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][contains(text(),'Sign in')]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("yash");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("demo.mayuresh@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("King@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("King@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(1000);
	
		driver.navigate().to("http://www.gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("demomayuresh@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo@123");;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search mail']")).sendKeys("verify your new Amazon Account");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@id='gs_sbt50']//tbody")).click();
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		
	
	}
		
	

	@AfterSuite()
	public void closeBrowser() {
		driver.close();
	}

}

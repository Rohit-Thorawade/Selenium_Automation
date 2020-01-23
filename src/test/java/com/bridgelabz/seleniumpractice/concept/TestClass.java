package com.bridgelabz.seleniumpractice.concept;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass {

	static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver",
				"/home/admin-1/eclipse-workspace/Selenium/driver/chromedriver");

	}

	// opening Browser and disabling browser level notifications
	@BeforeSuite()
	public void openBrowser() {

		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");

	}

	@DataProvider(name = "login data")
	public Object[][] provideData() {

		return new Object[][] { { "8109555221", "testdata@123" } };

	}

	// Testing Login Functionality
	@Test(dataProvider = "login data", priority = 1)
	public void testLogin(String email, String password) throws InterruptedException {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		assertEquals(actualTitle, expectedTitle);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).click();
		Thread.sleep(1000);
		
		
//		//click on profile icon
//		driver.findElement(By.xpath("//span[@class='_1qv9']")).click();
//		Thread.sleep(2000);
//		//click on Add cover photo
//		driver.findElement(By.id("fbProfileCoverPhotoSelector")).click();
//		
//		//Click on OK Button
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(1000);
//		alert.accept();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.id("fbProfileCoverPhotoSelector")).click();
//
//		Thread.sleep(1000);
		
		
		
	}

	//closing browser
	@AfterSuite(alwaysRun = true)
	public void closeBrowser() {
	 driver.close();
	}

}

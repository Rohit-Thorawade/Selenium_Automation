package com.bridgelabz.seleniumpractice.concept;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass {

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
		driver.get("http://www.facebook.com");

	}

	@DataProvider(name = "login data")
	public Object[][] provideData() {

		return new Object[][] { { "8109555221", "test@123" } };

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
		System.out.println("i am first");

	}

	// closing browser
	@AfterSuite(alwaysRun = true)
	public void closeBrowser() {
		// driver.close();
	}

}

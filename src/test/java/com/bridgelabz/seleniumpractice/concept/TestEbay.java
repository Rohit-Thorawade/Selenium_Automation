package com.bridgelabz.seleniumpractice.concept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestEbay {

	static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver",
				"/home/admin-1/eclipse-workspace/SeleniumDemo/driver/chromedriver");

	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='gh-control ghn-b gh-eb-li-a']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'sign-in')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='InLineCreateAnAccount']")).click();

	}

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtilEbay.getDataFromExcel();
		return testData.iterator();

	}

	@Test(dataProvider = "getTestData")
	public void TestRegEbay(String firstname, String lastname, String email, String password)
			throws InterruptedException {
		
		// Entering Data
		Thread.sleep(1000);
		WebElement fname = driver.findElement(By.xpath("//input[@id='firstname']"));
		fname.clear();
		fname.sendKeys(firstname);

		Thread.sleep(1000);
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastname']"));
		lname.clear();
		lname.sendKeys(lastname);

		Thread.sleep(1000);
		WebElement emailId = driver.findElement(By.xpath("//input[@id='email']"));
		emailId.clear();
		emailId.sendKeys(email);

		Thread.sleep(1000);

		WebElement pass = driver.findElement(By.xpath("//input[@id='PASSWORD']"));
		pass.clear();
		pass.sendKeys(password);
		Thread.sleep(1000);
	}

	@AfterSuite
	public void tearDown() {

		driver.close();
	}

}

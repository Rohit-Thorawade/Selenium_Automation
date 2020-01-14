/**
 * @author Rohit Thorawade
 * @Purpose Find locator using id & name
 *
 */
package com.bridgelabz.OpenBrowser.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator extends Base{

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		// By USING ID
		WebElement firstname = driver.findElement(By.id("u_0_m"));
		firstname.clear();
		firstname.sendKeys("Rohit");

		// BY USING NAME
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.clear();
		lastname.sendKeys("Thorawade");

		// BY USING CssSELECTOR
		driver.findElement(By.cssSelector("input[id='u_0_r']")).sendKeys("7896547896");

		// BY USING XPATH:- RELATIVE PATH
		driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("jikuo@123");

		// BY USING XPATH :- ABSOLUTE PATH
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[1]"))
				.sendKeys("23");

		// BY USING PARTIAL LINK TEXT
		driver.findElement(By.partialLinkText("Up")).click();

		driver.navigate().back();

		// BY USING LINKTEXT
		driver.findElement(By.linkText("Create a Page")).click();

		// driver.findElement(By.className("_5dba _8esg")).sendKeys("25");
		Thread.sleep(5000);
		driver.close();

	}

}

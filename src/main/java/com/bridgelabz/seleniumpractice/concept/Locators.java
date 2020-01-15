/**
 * @author Rohit Thorawade
 * @Purpose Find locator using id & name
 *
 */
package com.bridgelabz.seleniumpractice.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		driver.get("http://www.facebook.com");

		// By using id locator
		WebElement firstname = driver.findElement(By.id("u_0_m"));
		firstname.clear();
		firstname.sendKeys("Rohit");

		// BY using name locator
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.clear();
		lastname.sendKeys("Thorawade");

		// By using CssSELECTOR locator
		driver.findElement(By.cssSelector("input[id='u_0_r']")).sendKeys("7896547896");

		// By using Xpath - Relative Path locators
		driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("jikuo@123");

		// By USING Xpath :- Absoulte Path locators
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[1]"))
				.sendKeys("23");

		// By using partial link text locators
		driver.findElement(By.partialLinkText("Up")).click();

		driver.navigate().back();

		// By using LinkText locators
		driver.findElement(By.linkText("Create a Page")).click();

		// driver.findElement(By.className("_5dba _8esg")).sendKeys("25");
		Thread.sleep(5000);
		driver.close();

	}

}

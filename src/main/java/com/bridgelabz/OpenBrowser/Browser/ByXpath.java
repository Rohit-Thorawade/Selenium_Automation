/**
 * @author Rohit Thorawade
 * @Purpose Implementing Xpath on facebook application for registration  purpose  
 *
 */
package com.bridgelabz.OpenBrowser.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpath extends Base {
			

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Rohit");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Thorawade");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("8657839756");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("king@4321");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("22");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Aug");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1994");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#u_0_7")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //button[@id='u_0_13']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}

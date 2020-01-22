/**
 * @author Rohit Thorawade]
 * @purpose Handled Frames 
 *
 */
package com.bridgelabz.seleniumpractice.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///home/admin-1/Desktop/page2.html");

		// using index of the frame entered text in t1 and t2
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("Hello");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("world");
		Thread.sleep(2000);

		// using id of the frames
		driver.switchTo().frame("f1");
		WebElement t1 = driver.findElement(By.id("t1"));
		t1.clear();
		Thread.sleep(1000);
		t1.sendKeys("Bye");

		driver.switchTo().defaultContent();
		WebElement t2 = driver.findElement(By.id("t2"));
		t2.clear();
		Thread.sleep(1000);
		t2.sendKeys("Bye");
		Thread.sleep(2000);

		// using name attribute of frame
		driver.switchTo().frame("n1");
		WebElement t3 = driver.findElement(By.id("t1"));
		t3.clear();
		Thread.sleep(1000);
		t3.sendKeys("Good");

		driver.switchTo().defaultContent();
		WebElement t4 = driver.findElement(By.id("t2"));
		t4.clear();
		Thread.sleep(1000);
		t4.sendKeys("Morning");
		Thread.sleep(2000);

		// using address of frame
		WebElement t5 = driver.findElement(By.className("c1"));
		driver.switchTo().frame(0);
		t5.clear();
		Thread.sleep(1000);
		t5.sendKeys("Good");

		driver.switchTo().defaultContent();
		WebElement t6 = driver.findElement(By.id("t2"));
		t6.clear();
		Thread.sleep(1000);
		t6.sendKeys("Morning");
		Thread.sleep(2000);
		driver.close();

	}

}

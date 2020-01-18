package com.bridgelabz.seleniumpractice.concept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertPopUp extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.rediff.com/");
		// click on search button
		driver.findElement(By.xpath("//form[@id='queryTop']//input[@class='newsrchbtn']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		// System.out.println("Alert Message:"+alert.getText());
		String alertMsg = alert.getText();
		
		
		// Validation for correct alert Message
		if (alertMsg.equals("Please enter search keyword")) {
			System.out.println("Correct Alert Message");
		} else {
			System.out.println("InCorrect Alert Message");
		}

		alert.accept();
		driver.close();

	}
}

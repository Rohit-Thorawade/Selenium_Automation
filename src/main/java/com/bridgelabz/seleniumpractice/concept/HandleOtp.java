package com.bridgelabz.seleniumpractice.concept;

import org.openqa.selenium.By;

public class HandleOtp extends BaseClass {
	
	public static final String ACCOUNT_SID="AC8084706038735bf8dfbc14ffa2e51a40";
	public static final String AUTH_TOKEN="c6e012057b2abcdb9eba1b33d224c39e";
	
	public static void main(String[] args) throws InterruptedException
	{
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']//a[@class='nav-a'][contains(text(),'Start here.')]")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Yash");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("rohitmilind2209@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Ticket@123");
		
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("Ticket@123");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		
		
	}
	
	

}

package com.bridgelabz.seleniumpractice.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoSuggestion extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		
		Thread.sleep(5000);
		List<WebElement> alloptions = driver.findElements(By.xpath("//*[contains(text(),'selenium']"));
		int countofoption=alloptions.size();
		Thread.sleep(2000);
		System.out.println("count of options::"+countofoption);
		String expected ="selenium interview questions";
		
		for(WebElement option:alloptions)
		{
			String text = option.getText();
			System.out.println(" "+text);
			
					if(text.equalsIgnoreCase(expected))
						{
						option.click();
						break;
						}
		}
		
		
		
	}

}

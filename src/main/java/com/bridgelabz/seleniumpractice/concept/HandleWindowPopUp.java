package com.bridgelabz.seleniumpractice.concept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class HandleWindowPopUp extends BaseClass{

	public static void main(String[] args) throws InterruptedException
	{
		driver.get("http://www.popuptest.com/goodpopups.html");
		Thread.sleep(3000);
		
		//click on Good PopUp #3
		driver.findElement(By.xpath("//a[@class='black']")).click();
		
		//multiple windows 
		Set<String> handler =driver.getWindowHandles();
		
		//for set objects
		Iterator<String> it = handler.iterator();
		
		//Parent window Id
		String parentWindowId = it.next();
		System.out.println("Parent window id :"+parentWindowId);
		
		//Child Window Id
		String childWindowId =it.next();
		System.out.println("Child Window id :"+childWindowId);
	
		Thread.sleep(2000);
		//Switching to child Window
		driver.switchTo().window(childWindowId);
		Thread.sleep(1500);
		
		//printing title of child window pop-up
		System.out.println("Child Window pop up Title:"+driver.getTitle());

		driver.close();
		
		Thread.sleep(2000);
		//Switching to parent Window
		driver.switchTo().window(parentWindowId);
		Thread.sleep(1500);
		
		//printing title of child window pop-up
		System.out.println("parent Window pop up Title:"+driver.getTitle());
		
	
	}
	
	
}

/**
 * @author Rohit Thorawade
 * @purpose Implementing Action class Methods
 *
 */
package com.bridgelabz.seleniumpractice.concept;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMethods extends BaseClass {

	public static void main(String[] args) throws InterruptedException, AWTException {

		Actions action = new Actions(driver);

		driver.get("https://jqueryui.com/droppable");

		// Switch to frame 0
		driver.switchTo().frame(0);

		// Selecting the block to be dropped
		WebElement drag = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));

		// selecting the element in which the block needs to be dropped
		WebElement drop = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));

		Thread.sleep(1000);
		// action.doubleClick(block1);
		action.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		Thread.sleep(2000);
		// action.dragAndDrop(block1, block2).perform();
		Thread.sleep(2000);

		driver.close();

	}

}

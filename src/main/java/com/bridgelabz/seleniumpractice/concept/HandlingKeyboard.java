/**
 * @author Rohit Thorawade
 * @Purpose Handling key events on facebook application
 *
 */
package com.bridgelabz.seleniumpractice.concept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class HandlingKeyboard extends BaseClass{

	public static void main(String[] args) throws AWTException, InterruptedException {
		driver.get("http://www.google.com");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.mouseMove(240, 90);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_O);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);	
		Thread.sleep(2000);
		driver.close();

	}

}

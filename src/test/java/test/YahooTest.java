package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bridgelabz.datadriven.selenium.BaseClass;

public class YahooTest extends BaseClass {

	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://login.yahoo.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("testdata@gmail.com");
		Thread.sleep(4000);
		driver.quit();
	}
}

package com.atmecs.restAssured.SeleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void testPurpose() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("sachin.singh@atmecs.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/span")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("620011");
		driver.findElement(By.xpath("//*[@id=\'passwordNext\']/span")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[(text()='Forgot password?')]")).click();
	    driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.zQJV3 > div > div.daaWTb > div > span > span"))
	    .click();
	    driver.close();
	    
	}

}

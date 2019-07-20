package com.atmecs.SeleniumAutomation.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels {
	public void  windowHandel() {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.skyscanner.co.in/hotels?sd=2019-07-26&ed=2019-07-27");
	String parent = driver.getWindowHandle();
	

}
}

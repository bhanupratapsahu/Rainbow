package com.atmecs.skyscannerTest;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.atmecs.ReadExel.ExelFileConfig;
import com.atmecs.ReadExel.FileLocations;

public class TestApplication {
	WebDriver driver;
	String url;
	String userName;
	String password;
       @Test
	public void getTestData() {
		ExelFileConfig filelocation = new ExelFileConfig(FileLocations.filePath);
		userName= filelocation.getData("dataSheet", 1, 0);
		password = filelocation.getData("dataSheet", 1, 1);
	    url = filelocation.getData("dataSheet", 1, 2);
		System.out.println("url is"+url);
	}
		@Test
		public void loginTest() {
			driver = new ChromeDriver();
			driver.get(url);
			WebElement element = driver.findElement(By.)
		}

}

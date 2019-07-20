package com.atmecs.SeleniumAutomation.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.atmecs.ReadExel.ExelFileConfig;
import com.atmecs.ReadExel.FileLocations;

public class ApplicationFormTest {

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
	public void browserInitailze() {
		System.setProperty("webdriver.gecko.driver","C:\\firefox_driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(url);
		driver.close();
	}

}

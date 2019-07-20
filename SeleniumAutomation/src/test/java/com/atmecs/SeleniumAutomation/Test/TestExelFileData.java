package com.atmecs.SeleniumAutomation.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.atmecs.ReadExel.ExelFileConfig;
import com.atmecs.ReadExel.FileLocations;

public class TestExelFileData {
	
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
	public void testPurpose() {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id='identifierNext']/span")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id=\'passwordNext\']/span")).click();
	
	    driver.close();
	    
	}

}

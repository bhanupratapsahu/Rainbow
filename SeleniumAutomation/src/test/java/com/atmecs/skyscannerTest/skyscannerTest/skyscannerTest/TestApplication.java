package com.atmecs.skyscannerTest;



import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.atmecs.ReadExel.ExelFileConfig;
import com.atmecs.ReadExel.FileLocations;
import com.atmecs.readTestData.ReadPropertiesfile;

public class TestApplication extends ReadPropertiesfile {
	WebDriver driver = new ChromeDriver();;
	static String url;
	String username;
	String Password;
     //  @Test
	/*public void getTestData() {
		ExelFileConfig filelocation = new ExelFileConfig(FileLocations.filePath);
		userName= filelocation.getData("dataSheet", 1, 0);
		System.out.println(userName);
		password = filelocation.getData("dataSheet", 1, 1);
	    url = filelocation.getData("dataSheet", 2, 2);
		System.out.println("url is"+url);
	
	}*/
       @Test
   	public void getTestData() throws IOException {
   	
   		 username = getData("userName");
   		 System.out.println(username);
   		 url = getData("url");
   		
   		 System.out.println(url);
   	}

		//@Test
		public void SignUpTest() throws IOException {
			
		  
		    username = getData("userName");
		    Password = getData("password");
			driver.get(getData("url"));
			//driver.get( );
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[text()='Log in']")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[@data-testid='login-email-button']")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@data-testid='login-signup-toggle-button']")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		    driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//button[@data-testid='signup-button']")).click();
		    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
		    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//button[@data-testid='signup-button']")).click();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//span[@class= 'login' and text()='Account']")).click();
			driver.findElement(By.xpath("//button[text()='Log out']")).click();
			
		}
	
		
		@Test 
		public void loginTest() throws IOException {
			 username = getData("userName");
			  Password = getData("password");
			  driver.get(getData("url"));
			driver.findElement(By.xpath("//span[text()='Log in']")).click();
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[@data-testid='login-email-button']")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
			driver.findElement(By.xpath("//button[@data-testid='login-button']")).click();
			
		
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			WebElement element = driver.findElement(By.xpath("//span[@class= 'login' and text()='Account' and @id= 'authentication-link']"));
			element.click();
			driver.findElement(By.xpath("//button[text()='Log out']")).click();
		}

}

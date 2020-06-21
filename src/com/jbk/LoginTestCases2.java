package com.jbk;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class LoginTestCases2 {
  @Test(dataProvider = "RegisterData")
  public void RegisterData(String tcId, String testDesc, String name, String mobile,String email,String password, String expMessage) 
  {
	  System.out.println("starting a  >>> " + testDesc + "having Id  >> " + tcId);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Selenium%20Software/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();

		//get the xpath of register new membership
		
		driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
		//driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("mobile")).sendKeys(mobile);
		driver.findElement(By.id("mobile")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
  }

  @DataProvider
  public Object[][] RegisterData() 
  {
    return new Object[][] 
    { 
    	   new Object[] { "TC02", "Blank", "", "","","", "blank not allowed.s" },
    	   new Object[] { "TC02", "Invalid", "hs", "sjds","90876","sdsk@gmail.com", "Invalid data not allowed" },
    	   new Object[] { "TC02", "SpeChar", "^$^$&", "^$^$&","^$^$&","^$^$&", "Special character not allowed" },
    	   new Object[] { "TC02", "Valid", "Shraddha", "9087654389","shri23@gmail.com","shraddha", "Data store successfully" },
			
    };
  }
}

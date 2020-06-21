package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class DriverLoad 
{
	WebDriver driver;
    @BeforeMethod
	public void initialize()
	{
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Selenium%20Software/Offline%20Website/Offline%20Website/index.html");
		
	}

    @AfterMethod
    public void close()
    {
    	driver.close();
    }
}

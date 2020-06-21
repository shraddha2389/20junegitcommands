package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestCaseWithoutDataProvider 
{
	@Test
	public void testBlank()
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Selenium%20Software/Offline%20Website/Offline%20Website/index.html");
		
		driver.manage().window().maximize();
		//System.out.println(1234);
		driver.findElement(By.id("/html/body/div/div[2]/a")).click();
		
		driver.findElement(By.id("name")).sendKeys("");
		driver.findElement(By.id("name")).clear();
		
		driver.findElement(By.id("mobile")).sendKeys("");
		driver.findElement(By.id("mobile")).clear();
		
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("password")).sendKeys("");
		
		driver.findElement(By.xpath("//*[@id='form']/div[5]/div/button"));
		
		String actTitle=driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
		System.out.println(actTitle);
		String expTitle="Java By Kiran";
		
	     org.testng.Assert.assertEquals(actTitle, expTitle);
		
	}
	
	@Test
	public void testInvalid()
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
		
		driver.findElement(By.id("name")).sendKeys("dks");
		driver.findElement(By.id("name")).clear();
		
		driver.findElement(By.id("mobile")).sendKeys("sahd");
		driver.findElement(By.id("mobile")).clear();
		
		driver.findElement(By.id("email")).sendKeys("sdasj");
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("password")).sendKeys("sjjhds");
		
		driver.findElement(By.xpath("//*[@id='form']/div[5]/div/button"));
		

		String actual=driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
		System.out.println(actual);
		String expTitle="JBK Class";
		
	    org.testng.Assert.assertEquals(actual, expTitle);	
	}
}


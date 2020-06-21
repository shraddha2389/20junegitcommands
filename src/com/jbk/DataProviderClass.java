package com.jbk;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderClass
{
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) 
  {
	  
  }

  @DataProvider	
  public Object[][] loginData() 
  {
  		return new Object[][] 
     { 
  				new Object[] { "TC01", "Blank", "", "", "blank not allowed.s" },
  				new Object[] { "TC01", "invalid", "dggd", "dhd", "blank not allowed.s" },
  				new Object[] { "TC01", "spChars", "^$^$&", "&*(*((", "spchars not allowed.s" },
  				new Object[] { "TC01", "valid", "kiran@gmail.com", "123456", "" }};
  				
  	}
  
  
  }
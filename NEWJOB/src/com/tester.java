package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class tester {
     
	@Test
	public void mytest()
	{
	  WebDriver dr=new FirefoxDriver();
	  dr.navigate().to("https://www.google.co.in/");
	  dr.quit();
	}
}

package Test;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//Edit this file for test
//import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.*; 

public class BasicTestIT {
  @Test
  public void f() {
	 System.setProperty("webdriver.chrome.driver", "/bin/chromedriver");
	 //WebDriver	driver = new ChromeDriver();
	 //WebDriver	driver = new FirefoxDriver();
	 //WebDriver	driver = new HtmlUnitDriver();
	 //driver.get("http://172.16.5.185:8080/retail-web/");
	 //Assert.assertEquals("Retail Application Demo", driver.getTitle());
	 //Assert.assertEquals("Jenkins", driver.getTitle());
	 //driver.close();
  }
}

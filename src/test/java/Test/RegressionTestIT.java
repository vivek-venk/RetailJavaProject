package Test;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.*;
import org.testng.annotations.Test;
import org.openqa.selenium.htmlunit.*; 

import Page.homePage;
import Page.loginPage;
import Page.orderReportPage;

// Adding a new comment to change the file.

public class RegressionTestIT {
  @Test
  public void searchTest() {
	  
	  //System.setProperty("webdriver.chrome.driver", "/bin/chromedriver");
	  //WebDriver	driver = new ChromeDriver();
	 //WebDriver	driver = new FirefoxDriver();
	 //WebDriver	driver = new HtmlUnitDriver();
	 //driver.get("http://172.16.5.185:8080/retail-web/");
	 //Assert.assertEquals("Jenkins", driver.getTitle());
	  
	 //loginPage loginpage = new loginPage(driver);
	 //loginpage.validLogin().validSearch().validCheckout().proceedToCheckout().fillAddress().confirmOrder().makePayments();
	 //orderReportPage reportPage = new orderReportPage(driver);
	 //reportPage.orderConfirmation();
	 //loginpage =  reportPage.logout();
	 //driver.close();
  }
}

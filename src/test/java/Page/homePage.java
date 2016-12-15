package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	
	private By search = By.name("key");
	private By searchbtn = By.xpath("//input[2]");
	
	
	
	private WebDriver driver;
	
	public homePage(WebDriver driver)
	{
		this.driver = driver;
		if ( !driver.getTitle().equals("Search Items"))
		{
			throw new IllegalStateException("This is not sign in page, current page is: "
                    +driver.getCurrentUrl());
		}
	}
	
	public resultsPage validSearch()
	{
		driver.findElement(search).sendKeys("camera");
		driver.findElement(searchbtn).click();
		return new resultsPage(driver);
		
		
	}

}

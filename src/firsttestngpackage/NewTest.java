package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest
{
	WebDriver driver = new FirefoxDriver();
	String url = "http://www.google.com";

	@BeforeTest
	public void beforeTest()
	{
		driver.get(url);
	}
	@Test
	public void f()
	{
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
}

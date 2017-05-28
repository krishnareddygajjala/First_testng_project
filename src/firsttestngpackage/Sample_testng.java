package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample_testng
{
	public String url="http://newtours.demoaut.com/";
	public WebDriver driver=new FirefoxDriver();
	public String exp="";
	public String act="";
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println(driver.getCurrentUrl());
	}
	
	@BeforeMethod
	public void otherClass()
	{
		CheckTitle t=new CheckTitle();
		t.browser();
	}
	
	@BeforeTest
	public void launchBrowser()
	{
		driver.get(url);
		System.out.println("Launched the URL");
	}
	@AfterTest
	public void quitBrowser()
	{
		driver.close();
		System.out.println("Quit browser");
	}
	
	@Test(priority=0)
	public void register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		System.out.println("REGISTER click");
	}
	
	@Test(priority=1)
	public void support()
	{
		driver.findElement(By.linkText("SUPPORT")).click();
		System.out.println("SUPPORT click");
	}
	
	@Test(priority=2)
	public void contact()
	{
		driver.findElement(By.linkText("CONTACT")).click();
		System.out.println("CONTACT click");
	}
	
	@AfterMethod
	public void homePage()
	{
		driver.findElement(By.linkText("Home")).click();
		System.out.println("Home page click");
		System.out.println("***************************");
	}
}


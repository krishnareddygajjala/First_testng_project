package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckTitle
{
	public void browser()
	{
		WebDriver wd = new FirefoxDriver();
		String baseurl = "http://www.google.com";
		wd.get(baseurl);
		
		wd.manage().window().maximize();
		String expectedtitle = "Google";
	    String actualtitle = wd.getTitle();
	    
	    System.out.println(actualtitle);
	    
	    if (actualtitle.contentEquals(expectedtitle))
	    {
	    	System.out.println("Test Passed");
	    }
	    else
	    {
	    	System.out.println("Test Failed");
	    }
	    wd.close();
		}
	
	
	public static void main(String args[])
	{
		CheckTitle t = new CheckTitle();
		t.browser();
	}
}

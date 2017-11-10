package Venkat.gitDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Google2Test {
  @Test
  public void f() {
	  WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
  }
}

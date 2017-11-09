package Venkat.gitDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google2 {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in/");
	System.out.println(driver.getTitle());
}
}

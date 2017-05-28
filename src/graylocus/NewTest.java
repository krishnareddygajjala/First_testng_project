package graylocus;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='authiframe']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='id_mobile']")).sendKeys("9999988888");
		driver.findElement(By.xpath("//input[@id='id_password1']")).sendKeys("password123");
		driver.findElement(By.id("id_email")).sendKeys("graylocus@gmail.com");
	    driver.findElement(By.xpath("//input[@class='loginBut marginT5 button blue large width100']")).click();
		driver.close();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\selenium required software\\selenium drivers\\chromedriver.exe");
		
  }
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  
  }

}

package graylocus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Amazon {
	public static void main(String[] args) throws InterruptedException
	{
     WebDriver driver=new FirefoxDriver();
	 driver.get("http://www.amazon.in/");
	driver.manage().window().maximize();
	String str=driver.getTitle();
	System.out.println("page title is   "+str);
	System.out.println(driver);
	
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Actions actions = new Actions(driver);
	  WebElement category = driver.findElement(By.xpath("//a[@id='nav-link-shopall']"));
	  actions.moveToElement(category).perform();
      WebElement subMenu = driver.findElement(By.xpath("//span[contains(text(),'Computers & Accessories')][1]"));
	  actions.moveToElement(subMenu).perform();
	 // actions.build().perform();
	  WebElement subMenu1 = driver.findElement(By.xpath("//span[contains(text(),'Pen Drives')]"));
	  actions.moveToElement(subMenu1).click().build().perform();
	  driver.findElement(By.xpath("//span[@class='refinementLink' and text()='32 GB']")).click();
	  driver.findElement(By.xpath("//span[@class='refinementLink' and text()='SanDisk']")).click();
	  Thread.sleep(12000);
	  driver.findElement(By.xpath("//span[@class='refinementLink' and text()='Sony']")).click();
	
  }
}



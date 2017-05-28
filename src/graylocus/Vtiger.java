package graylocus;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Vtiger {
	
	@Test
	public void test() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\selenium required software\\selenium drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String expRes = "dell inspiron i5559";

		driver.get("http://www.binaryzombies.com/vtiger");
		driver.manage().window().maximize();
		//login to the application
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("crmuser");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("crmuser");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		//click on Products button
		driver.findElement(By.xpath("(//strong[text()='Products'])[1]")).click();
		
		//click on Add Product button
		driver.findElement(By.xpath("//strong[text()='Add Product']")).click();
		
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(expRes);
		
		driver.findElement(By.xpath("(//strong[contains(.,'Save')])[1]")).click();
		
		String actRes = driver.findElement(By.xpath("//label[text()='Product Name']/ancestor::td/following-sibling::td[1]/descendant::span[1]")).getText();
		
		
		if(expRes.equals(actRes)) {
			System.out.println("Product Added Successfully");
		}
		else {
			System.out.println("Product not Added");
		}
		
		driver.findElement(By.xpath("//text()[.='Products List']/ancestor::p[1]")).click();
		//click Edit button
		driver.findElement(By.xpath("//td[a='"+expRes+"']/ancestor::tr/descendant::i[@title='Edit']")).click();
		
		
		String editProductName = "nokia 8";
		driver.findElement(By.xpath("//input[@name='productname']")).clear();
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(editProductName);
		
		driver.findElement(By.xpath("(//strong[contains(.,'Save')])[1]")).click();
		
		
		String editactRes = driver.findElement(By.xpath("//label[text()='Product Name']/ancestor::td/following-sibling::td[1]/descendant::span[1]")).getText();
		
		if(editProductName.equals(editactRes)) {
			System.out.println("Product Edited Successfully");
		}
		else {
			System.out.println("Product not Edited");
		}
		
		driver.findElement(By.xpath("//text()[.='Products List']/ancestor::p[1]")).click();
		
		driver.findElement(By.xpath("//td[a='"+editProductName+"']/ancestor::tr/descendant::i[@title='Delete']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Yes']")));
									
		driver.findElement(By.xpath("//a[text()='Yes']")).click();
	
	}

}


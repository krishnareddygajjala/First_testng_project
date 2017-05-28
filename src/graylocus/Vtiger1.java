package graylocus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vtiger1 {
	
	@Test
	public void test() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\selenium required software\\selenium drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String expRes = "dell inspiron i5559 slv edition";
		
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
		driver.findElement(By.xpath("//input[@id='Products_editView_fieldName_sales_start_date']")).sendKeys("02-05-2017");
        driver.findElement(By.xpath("//input[@id='Products-editview-fieldname-unit_price']")).sendKeys("999");
		driver.findElement(By.xpath("(//strong[contains(.,'Save')])[1]")).click();
		driver.findElement(By.xpath("//p[@id='Products_sideBar_link_LBL_RECORDS_LIST']")).click();
		driver.findElement(By.xpath("(//input[@class='listViewEntriesCheckBox' and @type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//i[@title='Edit'])[1]")).click();
	}
}
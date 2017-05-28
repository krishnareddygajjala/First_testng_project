
package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action 
{
  @Test
  public void f() 
  {

		
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.facebook.com/");
		WebElement txt= wd.findElement(By.id("u_0_1"));
		Actions builder=new Actions(wd);
		org.openqa.selenium.interactions.Action seriesOfActions=builder.moveToElement(txt).click().keyDown(txt,Keys.SHIFT).
		sendKeys(txt,"hello").keyUp(txt,Keys.SHIFT).doubleClick(txt).
		contextClick().build();
		seriesOfActions.perform();	
	
  }
}

package Flipcart.ItemPurchase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.configuation.System_Properties;

public class AcionClassFlipcartPurchase extends System_Properties{

	public static WebDriver driver;
	public static WebElement xpah ;
	public static WebElement linktext ;
	public static WebElement name ;
	public static WebElement  mob;
	public static WebElement  pass;
	public static WebElement  sign;
	public static WebElement  search;
	public static WebElement  clicks;
	public static WebElement  sel;
	public static WebElement  cart;
		
	public static void main(String[] args) throws InterruptedException {
	
	     driver=browser_Start(driver,"https://www.flipkart.com/");
		 Actions actions= new Actions(driver);
		 xpah=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		 actions.moveToElement(xpah).click().perform();
		 linktext=driver.findElement(By.linkText("Login & Signup"));
		 actions.moveToElement(linktext).click().perform();
	     //name=driver.findElement(By.className("_2zrpKA"));
	     //actions.moveToElement(name).click().perform();
		 Thread.sleep(2000);
         mob=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));	      	//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
         actions.moveToElement(mob).sendKeys(mob,"7977011378");
         pass=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));	      	//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
         actions.moveToElement(pass).sendKeys(pass,"flipcart@1234");
	       //driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
           sign=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span"));
           actions.moveToElement(sign).click().perform();
	       Thread.sleep(5000);
	       WebDriverWait wait= new WebDriverWait(driver, 20); 
	       search=driver.findElement(By.name("q"));
	       actions.sendKeys(search,"motog latest mobiles");
		   clicks=driver.findElement(By.className("_2BhAHa"));
		   actions.moveToElement(clicks).click().perform();
		   Thread.sleep(5000); 
		   sel=driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div/a[2]"));	    
           actions.moveToElement(sel).click().perform();
           cart=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='container']/div/div[1]/div/div/div[1]/div/div[1]/div[2]/ul/li[2]/form/button")));
           //cart=driver.findElement();
           actions.moveToElement(cart).click().perform();	
           //driver.switchTo().defaultContent();
    }
}

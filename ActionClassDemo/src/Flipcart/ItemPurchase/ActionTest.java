package Flipcart.ItemPurchase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.configuation.System_Properties;

public class ActionTest extends System_Properties{

	public static  WebDriver driver;
	public static Actions action;
	public static void main(String[] args) {
		
		try{  
		driver=browser_Start(driver,"http://newtours.demoaut.com/");
        action=new Actions(driver);
	/*	WebElement test=driver.findElement(By.xpath("//*[@id='maximenuck243']/div[2]/ul/li[4]/span/span"));
		WebElement test1=driver.findElement(By.xpath("//*[@id='maximenuck243']/div[2]/ul/li[10]/a/span"));
       */ 
        WebElement test=driver.findElement(By.name("userName"));
        WebElement test1=driver.findElement(By.name("password"));
		
        Action act=action.keyDown("Laxman")
        		  
                  .build();
                   act.perform();  
                
		Thread.sleep(5000);
		}
		catch (Exception e) {
        System.out.println("element not found "+e.getMessage()); 
		}
		finally {
			if(driver!=null)
			{
				driver.close();
			}
		}
	}
}

package Selenium.basic.start;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FlipCartShoping {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://JarfilesandLibraryanddrivers//chromedriver_win32//chromedriver//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
	    driver.get("https://www.flipkart.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	    Actions act=new Actions(driver);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //WebElement loginclick=driver.findElement(By.linkText("Login & Signup"));
	  
	    WebElement loginclick=driver.findElement(By.xpath("//*[@id=/container/]/div/a"));
	    Thread.sleep(5000);                           
	    WebElement username= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
	    WebElement password=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
	    WebElement login=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
	    Action action=act.moveToElement(loginclick).click()
	    		 .moveToElement(username).sendKeys(username,"7977011378")
	    		 .moveToElement(password).sendKeys(password,"flipcart@1234")
	    		 .moveToElement(login).click().build();
	              action.perform();
	           
	    driver.findElement(By.name("q")).sendKeys("Samsung mobiles");
	    driver.findElement(By.className("vh79eN")).click();
	    //select product....
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    driver.findElement(By.linkText("Samsung Galaxy On6 (Black, 64 GB)")).click();
	    
	    driver.findElement(By.xpath(".//*[type='button']")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	  
	}
}

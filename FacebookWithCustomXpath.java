package Selenium.basic.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookWithCustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//*[@type='email']")).sendKeys("laxmanmore26@gmail.com");;
	    driver.findElement(By.xpath("//*[@type='password']")).sendKeys("!!@@##$$1991");
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   /* driver.findElement(By.xpath(".//[@class='_5lxs _3qct _p']")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	    driver.findElement(By.xpath("//*[@class='_54nh']")).click();
*/	    
	}
}

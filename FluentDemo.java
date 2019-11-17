package Selenium.basic.start;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\JarfilesandLibraryanddrivers\\chromedriver_win32\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.manage().window().maximize();
	    //driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
		 
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(120,TimeUnit.SECONDS)
		        .pollingEvery(120, TimeUnit.SECONDS)
		        .ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		 public WebElement apply(WebDriver driver) 
		 {
			 WebElement ele=  driver.findElement(By.linkText("HOME"));
			 return ele;
			
		/* String getTextOnPage = element.getText();
		 System.out.println(getTextOnPage);
		 if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
		 System.out.println(getTextOnPage);
		 return element;
		 }else{
		 System.out.println("FluentWait Failed");
		 return null;
 }	*/	
		 }
		 });
		element.click();
	}
}

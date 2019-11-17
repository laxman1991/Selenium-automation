package Selenium.basic.start;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentwaitCanadaJob {
	
	public static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\JarfilesandLibraryanddrivers\\chromedriver_win32\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.canadajobs.com/");
		driver.manage().window().maximize();
		 
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(120,TimeUnit.SECONDS)
		        .pollingEvery(120, TimeUnit.SECONDS)
		        .ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		 public WebElement apply(WebDriver driver) 
		 {
			 WebElement ele=  driver.findElement(By.linkText("Engineering"));
			 return ele;
			 }	
		 });
		element.click();
		
	WebElement jobs=driver.findElement(By.xpath("//*[@id='fullcontainer']/div[2]/div/div[1]/div[2]/div/ul[2]/li[1]/a"));
	System.out.println("Diretc jobs are:-"+jobs.getText());
	
	}
}

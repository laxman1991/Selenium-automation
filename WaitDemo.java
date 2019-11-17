package Selenium.basic.start;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {
	 
	public static void main(String[] args) throws InterruptedException {
	    	
		System.setProperty("webdriver.chrome.driver","D:\\JarfilesandLibraryanddrivers\\chromedriver_win32\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
	    driver.manage().window().maximize();
        String title=driver.getTitle();	    
        System.out.println(title);
		WebDriverWait wait= new WebDriverWait(driver,120);
        WebElement dest= wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Financial")));
        dest.click();
        
        }
}


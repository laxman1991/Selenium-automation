package Selenium.basic.start;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathTest {

	public static WebDriver driver;
	public static void main(String[] args) throws AWTException {

		 System.setProperty("webdriver.chrome.driver","D://JarfilesandLibraryanddrivers//chromedriver_win32//chromedriver//chromedriver.exe");
		 ChromeOptions opt= new ChromeOptions();
	     opt.addArguments("--disable-notifications");
		 driver= new ChromeDriver(opt);
         driver.manage().window().maximize();
         driver.get("https://www.timesjobs.com/");
         List<WebElement> list =driver.findElements(By.linkText("pop"));
        
         
	}
}

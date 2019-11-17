package Selenium.basic.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolipdemo {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.rebus.eu.com/");
	driver.manage().window().maximize();
	String aalr=driver.findElement(By.xpath("//*[@id='header-logo-image']/a/img")).getAttribute("title"); 
	System.out.println(aalr);
	}
}

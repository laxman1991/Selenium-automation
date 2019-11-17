package Selenium.basic.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlerExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://JarfilesandLibraryanddrivers//chromedriver_win32//chromedriver//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
	    driver.get("https://www.snapdeal.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/span[2]/i")).click();
		driver.findElement(By.xpath("//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]")).click();
		driver.switchTo().frame("iframeLogin");
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("8786859685");;
		driver.findElement(By.xpath("//*[@id='checkUser']")).click();
        }
}
	
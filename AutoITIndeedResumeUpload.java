package Selenium.basic.start;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITIndeedResumeUpload { 
	
     public static WebDriver driver;
	 public static void main(String[] args) throws IOException {
	
		 System.setProperty("webdriver.chrome.driver","D://JarfilesandLibraryanddrivers//chromedriver_win32//chromedriver//chromedriver.exe");
         driver= new ChromeDriver();
		 driver.get("https://www.indeed.co.in/?r=us");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Post your resume")).click();
         driver.findElement(By.xpath("//*[@id='container']/div/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[1]/button")).click();
         //driver.findElement(By.xpath("//*[@id='container']/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/label")).click();
         Runtime.getRuntime().exec("D://AutoIT//IndeedresumeUpload.exe");
         
         driver.findElement(By.xpath("//*[@id='container']/div/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[1]/button")).click();
         
    }
}

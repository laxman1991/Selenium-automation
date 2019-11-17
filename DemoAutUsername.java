package Selenium.basic.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutUsername {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\JarfilesandLibraryanddrivers\\chromedriver_win32\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("tutorial2");
		int width=driver.findElement(By.name("userName")).getSize().getWidth();
		System.out.println(width); 
		driver.findElement(By.name("password")).sendKeys("tutorial2");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String title=driver.getTitle();
	    System.out.println("title of web page "+title);
	    
	      JavascriptExecutor JS = (JavascriptExecutor)driver;
	      // To get the site title.
	      String titles = (String)JS.executeScript("return document.title");
	      System.out.println("Title of the webpage : " + titles);
	      //score down web page.
	}
}

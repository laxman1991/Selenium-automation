package Selenium.basic.start;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logjdemo {

	public static WebDriver driver;
	public static Logger logg;
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","D:\\JarfilesandLibraryanddrivers\\chromedriver_win32\\chromedriver\\chromedriver.exe");
			logg=Logger.getLogger(Logjdemo.class);
			logg.info("Launching chrome browser..."); 	
			driver=new ChromeDriver();
			logg.info("Launching guru99 URL...");
		    driver.get("https://www.guru99.com/introduction-to-selenium.html");
		    	
		    

	}

}
;
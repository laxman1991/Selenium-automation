package Selenium.basic.start;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Wndowhande {

	public static WebDriver driver;
	public static void main(String[] args) {


	  	 System.setProperty("webdriver.chrome.driver","D:\\JarfilesandLibraryanddrivers\\chromedriver_win32\\chromedriver\\chromedriver.exe");
		 ChromeOptions opt= new ChromeOptions();
	     opt.addArguments("--disable-notifications");
		 driver= new ChromeDriver(opt);
	     driver.get("https://www.naukri.com/");
	     driver.manage().window().maximize();
	     Set<String> ee=driver.getWindowHandles();
	     ArrayList<String> winID=new ArrayList<String>(ee);
	     String maiWIn=winID.get(0);
	      
	    for(int i=1;i<winID.size();i++)
	    {
	    	driver.switchTo().window(winID.get(i));
	    	driver.close();
	    }
	    driver.switchTo().window(maiWIn);
	   //driver.switchTo().defaultContent();
	    driver.close();
	}
}

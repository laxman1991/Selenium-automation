package Selenium.basic.start;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoughPractcie {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver\\chromedriver.exe");
         WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://newtours.demoaut.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		List<WebElement> inks=driver.findElements(By.tagName("a"));
		String text="";
		for(WebElement alllinks:inks)
		{    System.out.println(alllinks.getText());
			 text=alllinks.getText();
		}
	}
}

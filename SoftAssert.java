package AssertDemo.com.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SoftAssert {

	   @Test
		public void testCaseVerifyHomePage() {
		  WebDriver driver;
		   System.setProperty("webdriver.chrome.driver","D:/ChromDriver/chromedriver.exe");
			 driver= new ChromeDriver();
        	 driver.get("https://www.google.com/");
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	 driver.findElement(By.linkText("Gmail")).click();
        	 String expectedResult="Enter an email or phone number";
			
        	 WebElement actuslRresult=driver.findElement(By.xpath("//*[@id=identifierNext]/content/span"));
        	 
        	 actuslRresult.click();
        	 Assert.assertEquals(actuslRresult,expectedResult);
        	 System.out.println("test case finished");
	   }
}

	
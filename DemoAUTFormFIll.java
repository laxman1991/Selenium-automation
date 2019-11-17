package Selenium.basic.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAUTFormFIll {

	public static void main(String[] args) throws InterruptedException {
	     System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver\\chromedriver.exe");
         WebDriver driver= new ChromeDriver();
		 driver.get("http://newtours.demoaut.com/");
		 driver.manage().window().maximize();
		 //Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		 //Thread.sleep(5000);
 		//first name
		 driver.findElement(By.name("firstName")).sendKeys("laxman");
		 driver.findElement(By.name("lastName")).sendKeys("more");
		 driver.findElement(By.name("phone")).sendKeys("8899665544");
         driver.findElement(By.id("userName")).sendKeys("laxmanmore26@gmai.com");		
         //  Mailing Information
         driver.findElement(By.name("address1")).sendKeys("nerul");
         driver.findElement(By.name("address2")).sendKeys("navi mumbai");
         driver.findElement(By.name("city")).sendKeys("karad");
         driver.findElement(By.name("state")).sendKeys("maharashtra");
         driver.findElement(By.name("postalCode")).sendKeys("400706");
         
         Select select;
         select =new Select(driver.findElement(By.name("country")));
         select.selectByVisibleText("ALGERIA");
         //user information.
         driver.findElement(By.name("email")).sendKeys("laxman");
         driver.findElement(By.name("password")).sendKeys("laxman");
         driver.findElement(By.name("confirmPassword")).sendKeys("laxman");
         //click on submit button.
         driver.findElement(By.name("register")).click();
    }
}

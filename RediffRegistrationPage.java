package Selenium.basic.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffRegistrationPage {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver","D:\\JarfilesandLibraryanddrivers\\chromedriver_win32\\chromedriver\\chromedriver.exe");
         WebDriver driver= new ChromeDriver();
		 driver.get("http://www.rediff.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.findElement(By.linkText("Create a Rediffmail account")).click();
         driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("laxman");
         driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("laxmore.926");
         driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("laxmanmorerediff");
         driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("laxmanmorerediff");
         driver.findElement(By.xpath("//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input")).sendKeys("laxmanmore26@gmail.com");
         driver.findElement(By.id("mobno")).sendKeys("8422010520");
         //date
         
         Select select;
         select= new Select(driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]")));
         if(select.isMultiple())
         {
         select.selectByIndex(10);
         }
         else
         {
        	 select.selectByIndex(10);
         }
         //MOnth;
         select= new Select(driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]")));
         select.selectByVisibleText("FEB");
         //year;
         select= new Select(driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]")));
         select.selectByVisibleText("1992");
         
         //I live in.
         select = new Select(driver.findElement(By.id("country")));
         select.selectByIndex(0);
         //select city.
         
         select = new Select(driver.findElement(By.cssSelector("#div_city > table > tbody > tr:nth-child(1) > td:nth-child(3) > select")));
         select.selectByIndex(5);
         //Thread.sleep(4000);
         
         driver.findElement(By.id("Register")).click();
         Thread.sleep(5000);
         Alert alert= driver.switchTo().alert();
         System.out.println(alert.getText());;
         alert.accept();
         
  }
}

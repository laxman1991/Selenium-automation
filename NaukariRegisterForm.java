package Selenium.basic.start;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukariRegisterForm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
        opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
	    driver.get("https://www.naukri.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.linkText("Register Now")).click();
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebDriverWait wait=new WebDriverWait(driver, 5); 
	    WebElement element;
	    element=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("bifurcation")));
	    element.click();                                                           
	    //fill form
	    driver.findElement(By.id("fname")).sendKeys("vishal");
	    driver.findElement(By.id("email")).sendKeys("vishal@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("vishal@1234");
	    driver.findElement(By.id("number")).sendKeys("8987887664");
	    Select select;
	    select=new Select(driver.findElement(By.id("city")));
	    select.selectByIndex(2);
	    driver.findElement(By.name("basicDetailSubmit")).click();
	}
}

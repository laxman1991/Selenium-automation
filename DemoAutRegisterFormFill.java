package Selenium.basic.start;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutRegisterFormFill {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
	    driver.get("http://newtours.demoaut.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.linkText("sign-in")).click();
		//login after registered
		driver.findElement(By.name("userName")).sendKeys("laxman");
		driver.findElement(By.name("password")).sendKeys("laxman");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//flight details
		driver.findElement(By.cssSelector("input[value='oneway']")).click();
		
		select=new Select(driver.findElement(By.name("passCount")));
		select.selectByIndex(2);
		
		select=new Select(driver.findElement(By.name("fromPort")));
		select.selectByValue("London");
		
		select=new Select(driver.findElement(By.name("fromMonth")));
		select.selectByIndex(4);
		
		select=new Select(driver.findElement(By.name("fromDay")));
		select.selectByValue("20");
		
		select=new Select(driver.findElement(By.name("toPort")));
		select.selectByVisibleText("Frankfurt");
		
		select=new Select(driver.findElement(By.name("toMonth")));
		select.selectByVisibleText("December");
		
		select=new Select(driver.findElement(By.name("toDay")));
		select.selectByVisibleText("10");
		
		//preferences.
		driver.findElement(By.cssSelector("input[value='Business']"));
		
		select=new Select(driver.findElement(By.name("airline")));
		select.selectByIndex(2);
		
		//click on continue.........
		driver.findElement(By.name("findFlights")).click();
		//depart details
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")).click();
		
		driver.findElement(By.name("reserveFlights")).click();
		
		//Book flight...
		
		driver.findElement(By.name("passFirst0")).sendKeys("neha");
		driver.findElement(By.name("passLast0")).sendKeys("more");

		//Meal...........
		select= new Select(driver.findElement(By.name("pass.0.meal")));
		select.selectByIndex(4);
		
		//seelct card...
		select= new Select(driver.findElement(By.name("creditCard")));
		select.selectByIndex(3);
		
		driver.findElement(By.name("creditnumber")).sendKeys("848984987656");

		select= new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		select.selectByIndex(3);
		
		select= new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		select.selectByIndex(3);
		
		driver.findElement(By.name("cc_frst_name")).sendKeys("laxman");
		driver.findElement(By.name("cc_mid_name")).sendKeys("ananda");
		driver.findElement(By.name("cc_last_name")).sendKeys("more");
		
		//billing address
		
		driver.findElement(By.name("billAddress2")).sendKeys("Navi mumbai");
		
		
		//buy flight
		
		driver.findElement(By.name("buyFlights")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Logout...
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")).click();
		
	}
}

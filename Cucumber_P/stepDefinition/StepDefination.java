package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.configuation.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class StepDefination extends TestBase{

	 
	public static WebDriver driver;
	
		
		@Given("^Open chrome and launch the site$") 	
		public void open_chrome_and_launch_the_site(WebDriver driver) throws Throwable{
		    
			driver=browser_Start(driver,"http://www.newtours.demoaut.com/");
		    
		}
		@When("^enter user name$")
		public void enter_user_name(WebDriver driver) throws Throwable{
		WebElement username=driver.findElement(By.name("userName"));
		   username.sendKeys("tutorial1");
		    
		}

		@And("^enter user password$")
		public void enter_user_password(WebDriver driver) throws Throwable{
			WebElement password=driver.findElement(By.name("password"));
			password.sendKeys("tutorial1");
		    
		}

		@And("^click signIn buton$")
		public void click_signIn_buton(WebDriver driver) throws Throwable{
			WebElement signIn=driver.findElement(By.name("login"));
			signIn.click();
			
		}

		@Then("^login successfully$")
		public void login_successfully(WebDriver driver) throws Throwable{
			String expectedTitle="Welcome: Mercury Tours";
			String actualTitle=driver.getTitle();
			if(actualTitle.contentEquals(expectedTitle))
			{
				System.out.println("User login successfully");
			}
			else
			{
				System.out.println("check login details....");
			}
		   
	}
}

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;

public class Gurulogin {

	public static WebDriver driver;

@Given("^I am on career\\.guru(\\d+)\\.com$")
public void i_am_on_career_guru_com() {
   
	System.out.println("indside given");
	throw new PendingException();
}

@When("^I click on career guide menu$")
public void i_click_on_career_guide_menu() {
	System.out.println("indside given");
	throw new PendingException();
}

@Then("^I should see career guide page$")
public void i_should_see_career_guide_page() {
	System.out.println("indside given");
	throw new PendingException();
}
}

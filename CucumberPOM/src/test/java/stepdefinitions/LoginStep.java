package stepdefinitions;

import org.junit.Assert;

import com.page.Login;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	private static String title;
	private Login login= new Login(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = login.getLoginPageTitle();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String pageTitle) {
		
		Assert.assertTrue(title.contains(pageTitle));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {

	}

	@When("user enters username {string}")
	public void user_enters_username(String string) {

	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {

	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {

	}


}

package stepdefinitions;



import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;

public class LoginPageSteps {

	private static String title ;
	private LoginPage loginpage =new LoginPage(DriverFactory.getDriver());
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	    
		Thread.sleep(2000);
		DriverFactory.getDriver()
		.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		System.out.println("0000000000000000000000000000");
		
		
		
		
		
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginpage.getLoginPageTitile();
		System.out.println("LoginPage Titile is:" + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
	    
	    Assert.assertTrue(loginpage.isForgotPwdLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	    loginpage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	    loginpage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    loginpage.clickOnLogin();
	}

	@Then("user gets the title of the accounts page")
	public void user_gets_the_title_of_the_accounts_page() {
	    
	}
	
}

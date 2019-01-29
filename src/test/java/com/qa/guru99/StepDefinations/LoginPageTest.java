package com.qa.guru99.StepDefinations;

import com.qa.guru99.Pages.LoginPage;
import com.qa.guru99.TestBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	TestBase testbase;

	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() {
		testbase= new TestBase();
		testbase.setUp("chrome");

		driver.get("http://demo.guru99.com/V4/");

	}

	@When("^Title of the page is Guru Bank$")
	public void title_of_the_page_is_Guru_Bank() {	
		
		loginpage = new LoginPage();
		String actPageTitle= loginpage.loginPageTitle();
		Assert.assertEquals("Guru99 Bank Home Page", actPageTitle);

	}

	@Then("^User enters the valid UserName \"([^\"]*)\" and Password \"([^\"]*)\" and  click on Login button$")
	public void user_enters_the_valid_UserName_and_Password_and_click_on_Login_button(String userName, String password){
		loginpage.login(userName, password);

	}

	

	@Then("^User should login into the application and should navigate to Homepage after Login$")
	public void user_should_login_into_the_application_and_should_navigate_to_Homepage_after_Login() {
		Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage");

	}

}

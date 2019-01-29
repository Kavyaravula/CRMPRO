package com.qa.guru99.StepDefinations;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class HooksTest {
	
	@Before
	public void setUp(){
		
		System.out.println("Lauch browser");
		System.out.println("Open the URl");
	}

	@After
	public void tearDown(){
		System.out.println("Logout and Close");
		
	}

	@Given("^user on login apge$")
	public void user_on_login_apge() {
		System.out.println("User on Login Page");
	}

	@When("^user enters data$")
	public void user_enters_data()  {
		System.out.println("User Enter data");
	    
	}

	@Then("^sucessfully login$")
	public void sucessfully_login()  {
	    System.out.println("Sucessfully login");
	}

	@Given("^user on customer page$")
	public void user_on_customer_page() {
		System.out.println("user on customer page");
	   
	}

	@When("^enter the deatils$")
	public void enter_the_deatils()  {
	    System.out.println("enter the deatils");
	}

	@Then("^customer created$")
	public void customer_created()  {
		System.out.println("customer created");
	    
	}

	@Given("^user on Account page$")
	public void user_on_Account_page()  {
	    System.out.println("user on Account page");
	}

	@When("^enter the Account deatils$")
	public void enter_the_Account_deatils() {
		System.out.println("enter the Account deatils");
	    
	}

	@Then("^Account created$")
	public void account_created()  {
		System.out.println("Account created");
	    
	}

}

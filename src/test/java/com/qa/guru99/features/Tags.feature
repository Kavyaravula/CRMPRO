Feature: End to end tesing of Guru bank application

@Regression @SmokeTest
Scenario: Testing Guru Bank manager login with valid user credentials
Given User is on Login page of guru Bnak application
When  User enter correcrt usernmae and password
Then user should sucessfuuly login into application

@SmokeTest
Scenario: Verify Homepage Message and User details
Given User is on Home page of guru Bnak application
When  user verify the user deatials and Welcome message 
Then User deatials and Welcome message should display corretly

@SmokeTest
Scenario: Verify New Customer details creation
Given User is on New Customer page of guru Bnak application
When  user enter the deatials to create the new customer
Then User should sucessfully able to create new customer

@Regression @SmokeTest
Scenario: Verify Edit Customer details 
Given User is on the Edit Customer page of guru Bnak application
When  user edit the deatails to update the customer
Then User should sucessfully able to Edit customer details

@Regression @E2ETest
Scenario: Verify Delete Customer details 
Given User is on the Delete Customer page of guru Bnak application
When  user Delete the customer
Then User should sucessfully able to Delete customer details

@E2ETest
Scenario: Verify New Account details creation
Given User is on New Account page of guru Bnak application
When  user enter the deatials to create the new Account
Then User should sucessfully able to create new Account

@Regression
Scenario: Verify Edit Account details 
Given User is on the Edit Account page of guru Bnak application
When  user edit the deatails to update the Account
Then User should sucessfully able to Edit Account details

@Regression
Scenario: Verify Delete Account details 
Given User is on the Delete Account page of guru Bnak application
When  user Delete the Account
Then User should sucessfully able to Delete Account details

@Regression
Scenario: Verify Amount deposit to the Account
Given User is on  Account Deposit page of guru Bnak application
When  user enter the Deposit amount deatils 
Then User should sucessfully able to Deposit the Amount

@E2ETest
Scenario: Verify Amount Withdraw from the Account
Given User is on  Account WithDraw page of guru Bnak application
When  user enter the Withdraw Amount deatils
Then User should sucessfully able to Withdraw the Amount

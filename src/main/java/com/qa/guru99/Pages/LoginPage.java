package com.qa.guru99.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.guru99.TestBase.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="uid")
	public WebElement txtUserName;
	
	@FindBy(name="password")
	public WebElement txtPassword;
	
	@FindBy(xpath="//input[@type='submit' and @ name='btnLogin']")
	public WebElement btnLogin;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String loginPageTitle(){
		String loginpageTitle= driver.getTitle();
		return loginpageTitle;
	}
	public void login(String userName, String password){
		txtUserName.sendKeys(userName);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}

}

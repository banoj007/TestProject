package com.ToolsQA.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	WebDriver driver;
	
	public LoginPageObject(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="userName") 
	WebElement txtUserName;
	
	@CacheLookup
	@FindBy(how=How.ID, using = "password") 
	WebElement txtPassword;
	
	@CacheLookup
	@FindBy(how=How.ID, using = "login") 
	WebElement btnLogin;

	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	
	public void setPassowrd(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
}

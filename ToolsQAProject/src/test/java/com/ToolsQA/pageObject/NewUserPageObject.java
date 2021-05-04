package com.ToolsQA.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserPageObject {
	
	WebDriver driver;
	public NewUserPageObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="newUser") WebElement newUser;
	@FindBy(id="firstname") WebElement firstName;
	@FindBy(id="lastname") WebElement lastName;
	@FindBy(id="userName") WebElement userName;
	@FindBy(id="password") WebElement password;
	@FindBy(id="register") WebElement clickOn;
	//@FindBy(id="recaptcha-checkbox-border") WebElement captcha;
	
	public void clickNewUser()
	{
		newUser.click();
	}
	
	
	public void insertFirstName(String fn)
	{
		firstName.sendKeys(fn);
	}
	
	public void insertLastName(String ln) {
		lastName.sendKeys(ln);
		
	}
	
	public void insertUserName(String un)
	{
		userName.sendKeys(un);
	}
	
	public void insertPassword(String pw)
	{
		password.sendKeys(pw);
	}
	
	public void clickRegister()
	{
		clickOn.click();
	}
	
//	public void clickOnCaptcha()
//	{
//		captcha.click();
//	}





}

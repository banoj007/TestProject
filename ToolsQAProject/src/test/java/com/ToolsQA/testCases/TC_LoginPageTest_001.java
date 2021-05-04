package com.ToolsQA.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ToolsQA.pageObject.LoginPageObject;

public class TC_LoginPageTest_001 extends BaseClass {


	
	@Test
	public void loginTest()
	{
			
		driver.get(baseURL);
		
		LoginPageObject lp = new LoginPageObject(driver);
		
		lp.setUserName(username);
		lp.setPassowrd(password);
		lp.clickSubmit();
		
		
		String actTxt = driver.getTitle();
		Assert.assertEquals(actTxt,"ToolsQA");

	}

}

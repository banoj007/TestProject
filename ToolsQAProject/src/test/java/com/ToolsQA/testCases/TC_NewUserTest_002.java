package com.ToolsQA.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ToolsQA.pageObject.NewUserPageObject;

public class TC_NewUserTest_002 extends BaseClass{
	
	@Test
	public void loginTest() throws Exception
	{
			
		driver.get(baseURL);
		
		NewUserPageObject obj2 = new NewUserPageObject(driver);
		

		obj2.clickNewUser();
		obj2.insertFirstName(firstName);
		obj2.insertLastName(lastName);
		
		obj2.insertUserName(userName);
		obj2.insertPassword(password);

		
		obj2.clickRegister();

		
		String errString = driver.findElement(By.id("name")).getText(); //
		 System.out.println(errString);
		 
		Thread.sleep(5000);
		 	
		Assert.assertEquals(errString, "Please verify reCaptcha to register!");
		
		
	}

}



package com.ToolsQA.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		
		
		
		try
		
		{
			File src = new File("./Configuration/config.properties");
			FileInputStream fis = new FileInputStream(src);		
			pro = new Properties();
			pro.load(fis);
		} 
		
		catch (Exception e) 
		{
			System.out.println("Exception is " +e.getMessage());
		}		
		
	}
	
	public String getBaseURL()
	{
		return pro.getProperty("baseURL");
	}
	
	public String getUserName()
	{
		return pro.getProperty("username");
	}
	
	public String getPassword()
	{
		return pro.getProperty("password");
	}

	public String getFirstName()
	{
		return pro.getProperty("firstName");
	}
	public String getLastName()
	{
		return pro.getProperty("lastName");
	}
	
	public String getUsrName()
	{
		return pro.getProperty("userName");
	}
	
	public String getPasswodNewUser()
	{
		return pro.getProperty("passwordNewUser");
	}
	
	public String getChrome()
	{
		return pro.getProperty("chromepath");
	}
	public String getIE()
	{
		return pro.getProperty("iepath");
	}
	public String getFirefox()
	{
		return pro.getProperty("firefoxpath");
	}
	
	
}

package com.ToolsQA.testCases;
import com.ToolsQA.utilities.ReadConfig;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static WebDriver driver;
	
	ReadConfig rc = new ReadConfig();
	
	public String baseURL = rc.getBaseURL();
	public String username = rc.getUserName();
	public String password = rc.getPassword();

	public String firstName =rc.getFirstName();
	public String lastName = rc.getLastName();
	public String userName = rc.getUserName();
	public String passwordNewUser = rc.getPasswodNewUser();
	
	
	
	
	
	@BeforeClass
	@Parameters("browser")
	public void setUp(String br)
	{
		
		  if(br.equalsIgnoreCase("chrome")) 
		  {
			  System.setProperty("webdriver.chrome.driver", rc.getChrome()); 
			  driver = new ChromeDriver(); 
		  }
		  
		  else if (br.equalsIgnoreCase("firefox")) 
		  {
			  System.setProperty("webdriver.gecko.driver", rc.getFirefox()); 
			  driver = new FirefoxDriver(); 
		  } 
		  
		  else if(br.equalsIgnoreCase("ie")) 
		  {
			  System.setProperty("webdriver.ie.driver", rc.getIE()); 
			  driver = new InternetExplorerDriver(); 
		  }
		 
		
		driver.get(baseURL);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}

package com.SFDC_Bajaj.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.SFDC_Bajaj.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass		
{	
	@Test
	public void loginTest() throws IOException
	{
		driver.get(baseURL);
		logger.info("URL is Opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username Entered");
		
		lp.setPassword(pw);
		logger.info("Password Entered");
		
		lp.clickSubmit();
		
		//System.out.print("value of title :"+driver.getTitle());
		
		if(driver.getTitle().contains("Home"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}
	}
}

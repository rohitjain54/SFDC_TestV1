package com.SFDC_Bajaj.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		WebDriver ldriver;
		public LoginPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
		@FindBy(name="username")
		@CacheLookup
		WebElement txtUserName;
		
		@FindBy(name="pw")
		@CacheLookup
		WebElement txtPassword;
		
		@FindBy(name="Login")
		@CacheLookup
		WebElement Login;
		
		@FindBy(xpath="/html/body/div[3]/div/ul/li/[15]/a")//(name="Logout")
		@CacheLookup
		WebElement lnkLogout;		
		
		public void setUserName(String username)
		{
			txtUserName.sendKeys(username);
		}
		public void setPassword(String pw)
		{
			txtPassword.sendKeys(pw);
		}
		public void clickSubmit()
		{
			Login.click();
		}
		public void clickLogout()
		{
			lnkLogout.click();
		}
}


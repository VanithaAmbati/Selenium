package com.websecurity.app.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(id="user_login")
	private WebElement uName;
	
	@FindBy(id="user_password")
	private WebElement pwd;
	
	@FindBy(name="submit")
	private WebElement submitBtn;
	
	public Login(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 
	public void applicationLogin(String username, String password) {
		uName.sendKeys(username);
		pwd.sendKeys(password);
		submitBtn.click();
	}
	
}

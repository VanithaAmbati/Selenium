package com.websecurity.app.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfirmation {
	
	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement confirmationText;
	
	@FindBy(css="#settingsBox > ul > li:nth-child(3) > a")
	private WebElement uname;
	
	@FindBy(id="logout_link")
	private WebElement logout;
	
	public TransferFundsConfirmation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	


	public String transferFundsConfirmation() {
		
		String confTxt = confirmationText.getText();
		return confTxt;
	}
		
	public void logout() {
		
		uname.click();
		logout.click();
	
		
		}

}

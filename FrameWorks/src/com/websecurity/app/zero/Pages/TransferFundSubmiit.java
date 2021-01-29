package com.websecurity.app.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundSubmiit {
	
	@FindBy(id="btn_submit")
	private WebElement submit;
	
	public TransferFundSubmiit(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void transferfundssubmit() {
		submit.click();
	}

}

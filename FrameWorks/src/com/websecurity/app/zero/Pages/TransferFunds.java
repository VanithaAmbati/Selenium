package com.websecurity.app.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {
	
	@FindBy (id ="tf_fromAccountId")
	private WebElement fromAccount;
	
	@FindBy (id ="tf_toAccountId")
	private WebElement toAccount;
	
	@FindBy(id ="tf_amount")
	private WebElement amount;
	

	@FindBy(id ="tf_description")
	private WebElement description;
	

	@FindBy(id ="btn_submit")
	private WebElement continuebtn;
	
	public TransferFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void fundsTransfer(String amt, String desc) {
		
		Select fromdd = new Select(fromAccount);
		fromdd.selectByIndex(2);
		
		Select todd = new Select(toAccount);
		todd.selectByIndex(3);
		
		amount.sendKeys(amt);
		description.sendKeys(desc);
		continuebtn.click();
	}

}

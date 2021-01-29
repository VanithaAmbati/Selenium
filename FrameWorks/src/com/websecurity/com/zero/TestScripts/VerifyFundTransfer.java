package com.websecurity.com.zero.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.websecurity.app.zero.Pages.*;

import utils.GenericMethods;

public class VerifyFundTransfer extends Base {
	
	@Test
	public void verifyFundTransfer() throws IOException {
		
		Login lp = new Login(driver);
		AccountSummary acc = new AccountSummary(driver);
		TransferFunds tf = new TransferFunds(driver);
		TransferFundSubmiit tfs = new TransferFundSubmiit(driver);
		TransferFundsConfirmation tfc = new TransferFundsConfirmation(driver);
		
		String[][] data = GenericMethods.getData("C:\\Users\\chandu\\Desktop\\Selenium\\TestData.xlsx","Sheet1");
		
		for(int i=1;i<data.length;i++) {
	
		lp.applicationLogin(data[i][0],data[i][1]);
		acc.clickFundTransfer();
		tf.fundsTransfer(data[i][2], data[i][3]);
		tfs.transferfundssubmit();
		String actualText = tfc.transferFundsConfirmation();
		Assert.assertEquals(actualText, data[i][4]);
		tfc.logout();
		driver.navigate().to("http://zero.webappsecurity.com/login.html");
		
		}
	}
}

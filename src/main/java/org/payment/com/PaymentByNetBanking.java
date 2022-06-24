package org.payment.com;

import java.io.IOException;

import org.browser.com.Browser;
import org.excel.com.Excel;
import org.openqa.selenium.WebElement;
import org.pages.com.Card;
import org.pages.com.NetBanking;

public class PaymentByNetBanking {
	private NetBanking netBanking;
	private Excel excel;
	
	public PaymentByNetBanking() throws IOException {
		netBanking=new NetBanking();
		excel = new Excel();
		excel.readExcel(3);
	}
	public void  clickOnNetBanking () {
		netBanking.clickOnNetBanking.click();
	}
	public void  selectBankDetails () throws InterruptedException {
		Thread.sleep(2000);
		String bankName=excel.getData(0,1);
		netBanking.selectBank.sendKeys(bankName);
		Thread.sleep(2000);
		for (WebElement bank : netBanking.bankPath) {
			if (bank.getText().equalsIgnoreCase(bankName)) {
				bank.click();
				Thread.sleep(3000);
			}
		}
	}
	public void clickOnPayButton() throws InterruptedException {
		netBanking.payButton.click();
		Thread.sleep(2000);
	}
	
	public boolean verifyResult() {
		String expectedResult=excel.getData(1, 1);
		String actualResult=Browser.getCurrentUrl();
		return actualResult.toLowerCase().contains(expectedResult.toLowerCase());		
	}
}

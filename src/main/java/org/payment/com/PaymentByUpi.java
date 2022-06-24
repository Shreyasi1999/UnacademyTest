package org.payment.com;

import java.io.IOException;

import org.excel.com.Excel;
import org.openqa.selenium.WebElement;
import org.pages.com.Upi;

public class PaymentByUpi {
	private Upi upi;
	private Excel excel;

	public PaymentByUpi() throws IOException {
		upi = new Upi();
		excel=new Excel();
		excel.readExcel(2);
		
	}
	
	public void clickUpiButton() throws InterruptedException {
		Thread.sleep(2000);
		upi.clickUpiOption.click();
		Thread.sleep(2000);}
	
	public void enterUpiId() throws InterruptedException {
		String upiId=excel.getData(0, 1).replace("a", "");
		upi.enterUpiId.sendKeys(upiId);
		Thread.sleep(2000);
	}
	
	public void enterBank() throws InterruptedException {
		String bankName=excel.getData(1, 1);
		upi.enterBankInput.sendKeys(bankName);
		Thread.sleep(1000);
		for(WebElement element:upi.selectBank) {
			if(element.getText().contains(bankName)) {
				element.click();
			}
		}
	}
	public void clickPayButton() throws InterruptedException {
		upi.payButton.click();
		Thread.sleep(5000);
	}
	
}

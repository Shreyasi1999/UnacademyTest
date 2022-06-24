package org.payment.com;

import java.util.List;

import org.excel.com.Excel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pages.com.Emi;

public class PaymentByEmi {
	private Emi emi;

	public PaymentByEmi() throws Exception {
		emi = new Emi();
	}

	public void clickOnEmi() throws InterruptedException {
		emi.clickEmi.click();
		Thread.sleep(2000);
	}

	public void enterTheBank(String bankName) throws InterruptedException {
		List<WebElement> li = emi.clickBankForcreditCardEmi;
		WebElement element = null;
		for (int i = 6; i < li.size(); i++) {
			if (li.get(i).getText().split("\n")[0].equalsIgnoreCase(bankName)) {
				element = li.get(i);
			}
		}
		System.out.println(element);
		emi.moveCursorTo(element);
		Thread.sleep(3000);
		element.click();
	}

	public void clickOnMonthlyPlan() {
		emi.monthlyPlan.click();
	}

	public void clickOnNext() {
		emi.nextButton.click();
	}

	public void enterCardNumber(String cardNumber) throws InterruptedException {
		Thread.sleep(2000);
		emi.switchToFrame(emi.cardIframe);
		emi.inputCardNumber.sendKeys(cardNumber);
		emi.switchToParentFrame();
		Thread.sleep(2000);
	}

	public void enterMonthAndYear(String month,String year) throws InterruptedException {
		emi.switchToFrame(emi.monthIframe);
		Thread.sleep(2000);
		emi.month.sendKeys(month);
		emi.switchToParentFrame();
		emi.switchToFrame(emi.yearIframe);
		Thread.sleep(2000);
		emi.year.sendKeys(year);
		emi.switchToParentFrame();
	}

	public void enterCvv(String cvv) throws InterruptedException {
		Thread.sleep(2000);
		emi.switchToFrame(emi.cvvIframe);
		emi.cvv.sendKeys(cvv);
		emi.switchToParentFrame();
		Thread.sleep(2000);
	}

	public void enterNameOnCard(String name) throws InterruptedException {
		emi.switchToFrame(emi.nameIframe);
		emi.name.sendKeys(name);
		emi.switchToParentFrame();
		Thread.sleep(2000);
	} 
	public void clickOnPayButton() {
		emi.payButton.click();
	}
	
	public boolean verifyResult() {
		String actualResult = "";
		String expectedResult = "";
		return expectedResult.toLowerCase().contains(actualResult.toLowerCase());
	}
}

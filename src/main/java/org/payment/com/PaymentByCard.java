package org.payment.com;

import org.excel.com.Excel;
import org.pages.com.Card;

public class PaymentByCard {
	private Card card;
	private Excel excel;
	public PaymentByCard() throws Exception {
		card=new Card();
		excel = new Excel();
		excel.readExcel(1);
	}
	
	public void enterCardNumber() {
		card.switchToFrame(card.cardNumberIframe);
		card.cardNumber.sendKeys(excel.getData(0, 1).replace("a",""));
		card.switchToParentFrame();
	}
	
	public void enterMonth() {
		card.switchToFrame(card.monthIframe);
		card.month.sendKeys(excel.getData(1, 1).replace("#", ""));
		card.switchToParentFrame();
	}
	
	public void enterYear() {
		card.switchToFrame(card.yearIframe);
		card.year.sendKeys(excel.getData(2, 1));
		card.switchToParentFrame();
	}
	
	public void enterCvv() {
		card.switchToFrame(card.cvvIframe);
		card.cvv.sendKeys(excel.getData(3, 1).replace("#", ""));
		card.switchToParentFrame();
	}
	public void enterName() {
		card.switchToFrame(card.nameIframe);
		card.name.sendKeys(excel.getData(4, 1));
		card.switchToParentFrame();
	}
	public void clickOnPayButton() throws InterruptedException {
		card.switchToFrame(card.cardNumberIframe);
		card.cardNumber.click();
		card.switchToParentFrame();
		card.payButton.click();
		Thread.sleep(3000);
	}
}

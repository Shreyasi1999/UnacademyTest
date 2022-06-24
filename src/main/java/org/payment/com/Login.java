package org.payment.com;

import java.io.IOException;

import org.excel.com.Excel;
import org.pages.com.HomePage;

public class Login {
	private HomePage home;
	private Excel excel;
	
	public Login() throws IOException {
		 home = new HomePage();
		 excel = new Excel();
		 excel.readExcel(0);
	}
	
	public void clickOnHomePageLoginButton() throws InterruptedException {
		home.homepageLoginButton.click();
		Thread.sleep(3000);
	}
	
	public void enterMobileNumber() throws InterruptedException {
		String mobile=excel.getData(0, 1).split("E")[0].replace(".", "");
		home.mobileInput.sendKeys(mobile);
		Thread.sleep(2000);
	}
	
	public void cilckOnPopupLogin() {
		home.PopuploginButton.get(1).click();
	}
	public void clickOnVerifyOtpBotton() throws InterruptedException {
		home.verifyOtpButton.click();
		Thread.sleep(5000);
	}
	public void clickOnPopupAcception() {
		home.popupAcception.click();
	}
	public void clickOnGetSubscriptionButton() {
		home.getSubscriptionButton.click();
	}
	public void clickOnSubscription() {
		home.waitForElement(home.clickSubscription, 5000L);
		home.clickSubscription.click();
	}
	public void clickOnMonthlySubscriptionPlan() {
		home.monthlySubscriptionPlan.click();
	}
	public void ClickOnproceedToPayBtn() throws InterruptedException {
		home.waitForElement(home.proceedToPayBtn, 3000L);
		home.proceedToPayBtn.click();
		Thread.sleep(3000);
	}
}

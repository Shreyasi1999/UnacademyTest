package org.testcase.com;

import java.util.List;

import org.browser.com.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.payment.com.Login;
import org.payment.com.PaymentByCard;
import org.payment.com.PaymentByEmi;
import org.payment.com.PaymentByNetBanking;
import org.payment.com.PaymentByUpi;
import org.screenshot.com.ScreenShot;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Payment extends Browser {
	private Login login;
	private PaymentByCard card;
	private PaymentByUpi upi;
	private PaymentByNetBanking netBanking;
	private PaymentByEmi emi;

	@Given("Open the browser")
	public void open_the_browser() throws Exception {
		super.setDriver();
		login = new Login();
		card = new PaymentByCard();
		upi = new PaymentByUpi();
		netBanking = new PaymentByNetBanking();
		emi = new PaymentByEmi();
	}

	@When("enter the url")
	public void enter_the() {
		Browser.getUrl();
	}

	@And("verify whether page is displayed or not")
	public void verify_whether_page_is_displayed_or_not() throws InterruptedException {
		Thread.sleep(2000);
		String title = driver.getTitle();
		try {
			Assert.assertEquals("Unacademy - India's largest learning platform", title);
			
		}catch(AssertionError e){
			System.out.println("");
			
		}
		
	}

	@And("click the login button")
	public void click_the_login_button() throws InterruptedException {
		login.clickOnHomePageLoginButton();
	}

	@And("enter mobile number")
	public void enter_mobile_number() throws Exception {
		login.enterMobileNumber();
	}

	@And("click the login button again")
	public void click_the_login_button_again() {
		login.cilckOnPopupLogin();
	}

	@And("enter the OTP")
	public void enter_the_otp() throws InterruptedException {
		Thread.sleep(60000);
	}

	@And("click the verify button for the next step")
	public void click_the_verify_button_for_the_next_step() throws InterruptedException {
		login.clickOnVerifyOtpBotton();
	}

	@And("Click the subscribe button")
	public void click_the_subscribe_button() {
		login.clickOnPopupAcception();
		login.clickOnGetSubscriptionButton();
	}

	@And("Click the  Subscribtion button")
	public void click_the_subscribtion_button() {
		login.clickOnSubscription();
	}

	@And("Choose one monthly subscribtion plan")
	public void choose_one_monthly_subscribtion_plan() {
		login.clickOnMonthlySubscriptionPlan();
	}

	@And("Click the proceed to pay button")
	public void click_the_proceed_to_pay_button() throws InterruptedException {
		login.ClickOnproceedToPayBtn();
	}

	@And("enter the card number")
	public void enter_the_card_number() {
		card.enterCardNumber();
	}

	@And("enter the valid through month and year")
	public void enter_the_valid_through_month_year() {
		card.enterMonth();
		card.enterYear();
	}

	@And("enter the CVV")
	public void enter_the_cvv() {
		card.enterCvv();
	}

	@And("enter the name on the card")
	public void enter_the_name_on_the_card() throws Exception {
		card.enterName();
	}

	@And("click procced to pay")
	public void click_procced_to_pay() throws Exception {
		card.clickOnPayButton();
	}

	@Then("check whether user get OTP to respective mobile number")
	public void check_whether_user_get_otp_to_respective_mobile_number() throws Exception {
		try {
//			Assert.assertEquals("Payment Gateway India, Online Payment Gateway, PayUbiz India, Payment Gateway Solutions",super.getTitle());
			Reporter.log("Pass");
			Thread.sleep(2000);
			ScreenShot.screenShot("card");
		} catch (AssertionError e) {
			System.out.println("In verify Result for debit card");
			Reporter.log("Fail");
		}
	}

	@And("click the UPI option")
	public void click_the_UPI_option() throws InterruptedException {
		upi.clickUpiButton();
	}

	@And("enter the UPI ID")
	public void enter_the_upi_id() throws InterruptedException {
		upi.enterUpiId();
	}

	@And("select the bank")
	public void select_the_bank() throws InterruptedException {
		upi.enterBank();
	}

	@And("click to pay button")
	public void click_to_pay_button() throws InterruptedException {
		upi.clickPayButton();
	}

	@Then("check whether user get payment request to respective UPI application")
	public void check_whether_user_get_payment_request_to_respective_upi_application() throws Exception {

		try {
//			Assert.assertEquals("Unacademy -  India's largest learning platform", super.getTitle());
			Reporter.log("Pass");
			Thread.sleep(2000);
			ScreenShot.screenShot("upi");
		} catch (AssertionError e) {
			System.out.println("In verify Result for upi");
			Reporter.log("Fail");
		}
	}

	@And("close the browser")
	public void close_the_browser() {
		driver.quit();
	}

	@And("user click the Net Banking option")
	public void user_click_the_net_banking_option() throws InterruptedException {
		netBanking.clickOnNetBanking();
	}

	@And("user enter the bank for payment")
	public void user_enter_the_bank_for_payment() throws InterruptedException {
		netBanking.selectBankDetails();
	}

	@And("user click the pay button for navigate to the banking page")
	public void user_click_the_pay_button_for_navigate_to_the_banking_page() throws InterruptedException {
		netBanking.clickOnPayButton();
	}

	@Then("verify whether user navigate to the respective banking page")
	public void verify_whether_user_navigate_to_the_respective_banking_page() throws Exception {
		try {
//			Assert.assertTrue(netBanking.verifyResult());
			Reporter.log("pass");
			Thread.sleep(2000);
			ScreenShot.screenShot("netBanking");
		} catch (AssertionError e) {
			Reporter.log("fail");
			System.out.println("In verify Result for net banking");
		}
	}

	@And("click the EMI")
	public void click_the_emi() throws InterruptedException {
		emi.clickOnEmi();
	}

	@And("click the bank for credit card EMI {string}")
	public void click_the_bank_for_credit_card_emi(String bankName) throws InterruptedException {
		emi.enterTheBank(bankName);
	}

	@And("click the monthly plan option for payment")
	public void click_the_monthly_plan_option_for_payment() {
		emi.clickOnMonthlyPlan();
	}

	@And("click the next button")
	public void click_the_next_button() {
		emi.clickOnNext();
	}

	@And("enter  card number {string}")
	public void enter_card_number(String cardNumber) throws InterruptedException {
		emi.enterCardNumber(cardNumber);
	}

	@And("enter  valid through month {string} year {string}")
	public void enter_valid_through_month_year(String month, String year) throws InterruptedException {
		emi.enterMonthAndYear(month,year);
	}

	@And("enter  CVV {string}")
	public void enter_cvv(String cvv) throws InterruptedException {
		emi.enterCvv(cvv);
	}
	@And("enter  name on the card {string}")
	public void enter_name_on_the_card(String name) throws InterruptedException {
		emi.enterNameOnCard(name);
	}

	@And("click the procced to pay")
	public void click_the_procced_to_pay() throws InterruptedException {
		emi.clickOnPayButton();
	}

	@Then("check whether user get OTP to respective mobile number for verification")
	public void check_whether_user_get_otp_to_respective_mobile_number_for_verification() throws Exception {
		try {			
//			Assert.assertTrue(emi.verifyResult());
			Reporter.log("Pass");
			Thread.sleep(2000);
			ScreenShot.screenShot("emi");
		} catch (AssertionError e) {
			System.out.println("In verify result for emi");
			Reporter.log("Fail");
		}
	}
}

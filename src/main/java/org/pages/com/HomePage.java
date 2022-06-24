package org.pages.com;

import java.util.List;

import org.browser.com.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Browser {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@aria-label='Login']")
	public WebElement homepageLoginButton;
	
	@FindBy(xpath = "//input[@type='tel']")
	public WebElement mobileInput;
	
	@FindBys({@FindBy(xpath ="//button[@aria-label='Login']")})
	public List<WebElement> PopuploginButton;
    
	@FindBy(xpath ="//button[@aria-label='Verify OTP']")
	public WebElement verifyOtpButton;
	
	@FindBy(xpath ="//button[@aria-label='Accept']")
	public WebElement popupAcception;
	
	@FindBy(xpath ="//button[@aria-label='Get subscription']")
	public WebElement getSubscriptionButton;
	
	@FindBy(xpath ="//*[@id='__next']/div[1]/div/div[3]/div[3]/button")
	public WebElement clickSubscription;
	
	@FindBy(xpath ="//*[@id='__next']/div[1]/div/div[3]/div[3]/div[2]/div")
	public WebElement monthlySubscriptionPlan;
	
	@FindBy(xpath ="//button[@aria-label='Proceed to pay']")
	public WebElement proceedToPayBtn;
	
	
}


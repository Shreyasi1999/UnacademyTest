package org.pages.com;

import java.util.List;

import org.browser.com.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class  NetBanking extends Browser {
	public  NetBanking() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//div[@data-id='NET_BANKING']")
	public WebElement clickOnNetBanking  ;
	
	@FindBy(xpath ="//input[@placeholder='Select a bank']")
	public WebElement selectBank;
	
	@FindBys({@FindBy(xpath ="//*[@id='payment_form_nb']/div/div[5]/div/div[2]/div")})
	public List<WebElement> bankPath ;
	
	@FindBy(xpath ="//button[@aria-label='Pay']")
	public WebElement payButton ;
	
	
}

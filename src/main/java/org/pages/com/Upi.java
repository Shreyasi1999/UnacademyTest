package org.pages.com;

import java.util.List;

import org.browser.com.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Upi extends Browser {
		public Upi() {
			PageFactory.initElements(driver, this);
 
		}
		@FindBy(xpath ="//*[@id='__next']/div[1]/div/div[2]/div[2]/div/div[1]/div[4]/p")
		public WebElement clickUpiOption ;
		
		
		@FindBy(xpath ="//*[@id='payment_form_upi']/div[1]/div/input")
		public WebElement enterUpiId ;
		

		@FindBys({@FindBy(xpath ="//*[@id='payment_form_upi']/div[1]/div/div/div/div[2]/div[2]/div")})
		public List<WebElement> selectBank;
		
		@FindBy(xpath ="//input[@placeholder='Select a bank']")
		public WebElement enterBankInput ;
		
		@FindBy(xpath ="//button[@aria-label='Pay']")
		public WebElement payButton ;
}
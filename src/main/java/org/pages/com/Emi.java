package org.pages.com;

import java.util.List;

import org.browser.com.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
	public class Emi extends Browser {
		public Emi() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath ="//div[@data-id='EMI']")
		public WebElement clickEmi ;
		
		@FindBys({@FindBy(xpath ="//div[@class='css-1czgpvb-Flex-ItemWrapper e1bear363']")})
		public List<WebElement> clickBankForcreditCardEmi ;
		
		@FindBy(xpath ="//*[@id='__next']/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div")
		public WebElement monthlyPlan ;
		
		@FindBy(xpath ="//*[@id='__next']/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/button")
		public WebElement nextButton ;
		
		@FindBy(xpath ="//iframe[@class='card_number_iframe']")
		public WebElement cardIframe ;
		
		@FindBy(xpath ="//input[@id='card_number']")
		public WebElement inputCardNumber ;
		
		@FindBy(xpath ="//iframe[@class='card_exp_month_iframe']")
		public WebElement monthIframe ;
		
		@FindBy(xpath ="//input[@name='card_exp_month']")
		public WebElement month ;
		

		@FindBy(xpath ="//iframe[@class='card_exp_year_iframe']")
		public WebElement yearIframe ;
		
		@FindBy(xpath ="//input[@name='card_exp_year']")
		public WebElement year ;
		
		@FindBy(xpath ="//*[@id='payment_form_new_card_2']/div[2]/div[2]/div/iframe")
		public WebElement cvvIframe ;
		
		@FindBy(xpath ="//input[@name='security_code']")
		public WebElement cvv ;
		
		@FindBy(xpath ="//*[@id='payment_form_new_card_2']/div[3]/div/iframe")
		public WebElement nameIframe ;
		
		@FindBy(xpath ="//input[@id='name_on_card']")
		public WebElement name ;
		
		@FindBy(xpath ="//button[@aria-label='Pay']")
		public WebElement payButton ;
		
		

}

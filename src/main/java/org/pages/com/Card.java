package org.pages.com;

import org.browser.com.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Card extends Browser {
	public Card() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//iframe[@class='card_number_iframe']")
	public WebElement cardNumberIframe;
	
	@FindBy(xpath ="//input[@id='card_number']")
	public WebElement cardNumber;
	 
    @FindBy(xpath ="//iframe[@class='card_exp_month_iframe']")
    public WebElement monthIframe;
      
    @FindBy(xpath ="//iframe[@class='card_exp_year_iframe']")
    public WebElement yearIframe;
    
    @FindBy(xpath ="//input[@id='card_exp_month']")
    public WebElement month;
    
    @FindBy(xpath ="//input[@id='card_exp_year']")
    public WebElement year;
    
    @FindBy(xpath ="//iframe[@class='security_code_iframe']")
    public WebElement cvvIframe;
    
    @FindBy(xpath ="//input[@id='security_code']")
    public WebElement cvv;
    
    @FindBy(xpath ="//iframe[@class='name_on_card_iframe']")
    public WebElement nameIframe;
    
    @FindBy(xpath ="//input[@id='name_on_card']")
    public WebElement name;
    
    @FindBy(xpath ="//button[@aria-label='Pay']")
    public WebElement payButton;
    
    
    
}

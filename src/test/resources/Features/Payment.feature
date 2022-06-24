Feature: feature to test Payment functionality
  As a, User
  I want to check payment functionality,
  So,that I can pay successfully.

  Background: 
    Given Open the browser
    When enter the url
    And verify whether page is displayed or not
    And click the login button
    And enter mobile number
    And click the login button again
    And enter the OTP
    And click the verify button for the next step
    And Click the subscribe button
    And Click the  Subscribtion button
    And Choose one monthly subscribtion plan
    And Click the proceed to pay button

  Scenario: Payment by Debit card method
    And enter the card number
    And enter the valid through month and year
    And enter the CVV
    And enter the name on the card
    And click procced to pay
    Then check whether user get OTP to respective mobile number
    And close the browser
    

  Scenario: Payment by UPI Method
    And click the UPI option
    And enter the UPI ID
    And select the bank
    And click to pay button
    Then check whether user get payment request to respective UPI application
    And close the browser

  Scenario: Payment By Net Banking
    And user click the Net Banking option
    And user enter the bank for payment
    And user click the pay button for navigate to the banking page
    Then verify whether user navigate to the respective banking page
    And close the browser

  Scenario Outline: Payment by EMI method
    And click the EMI
    And click the bank for credit card EMI '<BankName>'
    And click the monthly plan option for payment
    And click the next button
    And enter  card number '<card_number>'
    And enter  valid through month '<month>' year '<year>'
    And enter  CVV '<cvv>'
    And enter  name on the card '<name>'
    And click the procced to pay
    Then check whether user get OTP to respective mobile number for verification

    Examples: 
      | BankName                | card_number      | month | year | cvv | name                 |
      | HDFC Bank - Credit card | 5689073490776587 |    05 |   25 | 345 | Shreyasi Das |

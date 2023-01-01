Feature: Retail Account Page

Background:
Given User is on retail website
When User click on Sign in option
And User enter email 'Test@tek.com' and password 'Tek&2025'
And User click on login button
And User should be logged in into Account
When User click on Account option
@accountupdate
Scenario: Verify User can update Profile Information
And User update Name 'Sam' and Phone '9874214444'
And User click on Update button
Then user profile information should be updated  
@changepassword
Scenario: Verify User can Update password 
And User enter below information
|previousPassword            | newPassword          |confirmPassword         |
|Tek&2025                        |Tek&2020                |Tek&2020                   |
And User click on Change Password button 
Then a message should be displayed 'Password Updated Successfully'
@addPaymentMethod
Scenario: Verify User can add a payment method 
And User click on Add a payment method link 
And User fill Debit or credit card information 
|cardNumber     |nameOnCard      |expirationMonth|expirationYear   |securityCode|
|1234567897777778  |Tahir            |12                     |2024                 |322               |
And User click on Add your card button 
Then a message should be displayed 'Payment Method added successfully'
@editpaymentmethod
Scenario: Verify User can edit Debit or Credit card 
And User click on Edit option of card section
And user edit information with below data 
|cardNumber				|nameOnCard|expirationMonth|expirationYear|securityCode|
|1122334455655555 |Tela  |12             |2027          |666         |

And user click on Update Your Card button 
Then a message should be displayed 'Payment Method updated Successfully'

@removecard
Scenario: Verify User can remove Debit or Credit card 
And User click on remove option of card section
Then payment details should be removed

@addaddress
Scenario: Verify User can add an Address 
And User click on Add address option 
And user fill new address form with below information 
|country      |fullName		 |phoneNumber						|streetAddress			     |apt  |city   |state     |zipCode	 |
|United States	|Safi		     |2023214567            |101 unkown PO BOX 12345| 100 | Loudon |Virginia  |12345    |

And User click Add Your Address button 
Then a message should be displayed 'Address Added Successfully'

@editaddress
Scenario: Verify User can edit an Address added on account
And User click on edit address option 
And user fill new address form with below information 
|country       |fullName    |phoneNumber              |streetAddress     |apt      |city     |state   |zipCode|
|Afghanistan	 |Sohrab      |8551234567               |1005 Street       |900      |Phase5   |Kabul   |5555  |

And User click update Your Address button 
Then a message should be displayed 'Address Updated Successfully'
@removeaddress
Scenario: Verify User can remove Address from Account 
And User click on remove option of Address section
Then Address details should be removed

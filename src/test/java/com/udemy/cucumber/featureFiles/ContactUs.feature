@ContactUs
Feature: Validate contactUs page of WebDriverUniversity website with valid inputs

Background: 
Given enter the given application url
|http://www.webdriveruniversity.com|     
And click on contact us link

@ValidateSubmit
Scenario Outline: provide the required input parameter for contactUs page in order to successfull submit action
And User detail <FirstName>,<LastName>,<Email> and <Comments> are provided    
When User click on submit button
Then Validate the confirmation message from app <Message>    

Examples:
|FirstName |LastName |     Email      |          Comments     |           Message         |url|
| "Sarvesh"  | "Sinha"   | "sas@gmail.com"  |"here is the sample text"|"Thank You for your Message!"|"http://www.webdriveruniversity.com"|

@ValidateReset
Scenario Outline: provide the required input parameter for contactUs page in order to to verify reset functionality
And User detail <FirstName>,<LastName>,<Email> and <Comments> are provided  
When User click on reset button
Then Validate the confirmation message from app <Message>   

Examples:
|FirstName |LastName |     Email      |          Comments     |           Message         |url|
| "Sarvesh"  | "Sinha"   | "sas@gmail.com"  |"here is the sample text"|"Thank You for your Message!"|"http://www.webdriveruniversity.com"|
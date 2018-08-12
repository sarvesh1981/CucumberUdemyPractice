Feature: Validate Basic Authentic popup using selenium

Scenario: validate Login to app having authentic popup
Given application URL having authentication using popup
|http://admin:admin@the-internet.herokuapp.com/basic_auth|
Then verify the welcome message 
|Congratulations! You must have the proper credentials.|
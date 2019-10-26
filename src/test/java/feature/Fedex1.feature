Feature: Login page validation 

Scenario Outline: Login page shall accessable 
Given user is on login page
When user shall enter required details on sign up page
Then user shall able to sign up sucessfully 
And user shall able to sign into application with created <Username> and <Password>

Examples:
|Username |Password |

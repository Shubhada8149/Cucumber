Feature: Free CRM login feature

#without examples keyword
#Scenario: Free CRM login feature scenario

#Given user is on Free CRM Login Page
#Then user enters username
#Then user enters "otari.shubhada@gmail.com" and "Test@123"
#Then user enters password
#Then user clicks on sign in button
#Then user is on home page
#And user close the browser 

#with examples keyword
Scenario Outline: Free CRM login feature scenario

Given user is on Free CRM Login Page
Then user enters "<username>" and "<password>"
Then user clicks on sign in button
Then user is on home page
And user close the browser 

Examples: 
|username|password|
|otari.shubhada@gmail.com|Test@123|
|shubhada|Test@123|			
Feature: Deal Data Creation

Scenario: Create a new deal

Given user is on Free CRM Login Page
Then user enters username and password
|otari.shubhada@gmail.com|Test@123|

Then user clicks on sign in button
Then user is on home page
Then user click on deal menu
Then user click on New button

Then user enters title,description,amount 
|test deal|test description |5000||

Then user click on save button
And user close the browser 
 
Feature: Deal Data Creation 

Scenario: Create a new deal 

	Given user is on Free CRM Login Page 
	Then user enters username and password 
		|username|password|
		|otari.shubhada@gmail.com|Test@123|
		
	Then user clicks on sign in button 
	Then user is on home page 
	Then user click on deal menu 
	Then user click on New button 
	
	Then user enters title,description,amount 
		|title|description|amount| 
		|test deal|test description |5000|
		|test deal 1|test description 1|6000|
		|test deal 2|test description 2|7000|
		
	Then user click on save button 
	 
	And user close the browser 
 
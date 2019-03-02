Feature: 

	#|Go to search bar on upper right corner and search for
	#"Natig Bakhishov" and click on 'Search...'|
	#|Click on contact Natig Bakhishov|
	#|Click 'Contacts' on the left upper side of the black header|
	#|Go to search bar on upper right corner and search for
	#"Natig" and click on 'Search...'|
	#|Click on contact Natig Bakhishov|
	#|Click 'Contacts' on the left upper side of the black header|
	#|Go to search bar on upper right corner and search for
	#"Bakhishov" and click on 'Search...'|
	#|Click on contact Natig Bakhishov|
	@cheris
	Scenario: Cucumber- As an Inventory Manager 3 I should be able to search for contact using name
		Given User logs in to Contacts Page as Manager
		When User searches for contact using full name
		Then User clicks on contact
		Then User clicks on contact module
		Then User searches for contact using first name only
		Then User clicks on contact
		Then User clicks on contact module
		Then User searches for contact using last name only 
		Then User clicks on contact
		
		
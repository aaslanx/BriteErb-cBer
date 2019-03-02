Feature: 

	#|Go to search bar on upper right corner and search for
	# "NatigBakhishov@gmail.com" and click on 'Search...'|
	#|Click on contact Natig Bakhishov|

@cheris
	Scenario: Cucumber- As an Inventory Manager 3 I should be able to search for contact using email address
		Given User logs in to Contacts Page as Manager
		When User searches for contact using email address
		Then User clicks on contact
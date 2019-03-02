Feature: 

	#|Go to search bar on upper right corner and search for
	# "Tang Tsui" and click on 'Search...'|
	#|Click on contact the copy of Tang Tsui|
	#|Click on 'Action' dropdown in upper middle of the page|
	#|Click on 'Delete'|
	#|Click on 'ok'|
	 @cheris
	Scenario: Cucumber - As an Inventory Manager 3 I should be able to delete contact
		Given User logs in to Contacts Page as Manager
		When User searches for contact
		Then User clicks on the copy of the contact
		Then User selects Delete from the Action dropdown
		Then User clicks on ok
		
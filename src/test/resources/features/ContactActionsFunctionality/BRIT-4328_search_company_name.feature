Feature: 

	#|Go to search bar on upper right corner and search for
	#"Think Big Systems" and click on 'Search...'|
	#|Click on third contact Natig Bakhishov|
	@cheris
	Scenario: Cucumber- As an Inventory Manager 3 I should be able to search for contact using company name
		Given User logs in to Contacts Page as Manager
		When User searches for contact using comany name
		Then User clicks on third contact
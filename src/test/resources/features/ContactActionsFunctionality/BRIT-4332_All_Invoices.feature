Feature: 

	#|Click on contact 'Joseph Walters' |
	#|Click on 'Action' dropdown in upper middle of the page|
	#|Click on 'All Invoices'|
	#|Click on invoice|
	@cheris
	Scenario: Cucumber - As an Inventory Manager 3 I should be able to view contact's invoices
		Given User logs in to Contacts Page as Manager
		When User searches for new contact
		Then User clicks on contact Joseph Walters 
		Then User selects All Invoices from dropdown menu
		Then User clicks on invoice
		
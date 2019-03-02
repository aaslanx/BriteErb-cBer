Feature: 

	#|Click on contact 'Joseph Walters' |
	#|Click on 'Print' dropdown in upper middle of the
	# page|
	#|Click on 'Due Payments'|
	@cheris
	Scenario: Cucumber - As an Inventory Manager 3 I should be able to print due payments 
		Given User logs in to Contacts Page as Manager
		When User searches for new contact
		Then User clicks on contact Joseph Walters 
		Then User selects Due Payments from Print dropdown menu
		
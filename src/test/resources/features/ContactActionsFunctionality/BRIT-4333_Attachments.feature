Feature: 

	#|Click on contact 'Joseph Walters' |
	#|Click on 'Attachment(s)' dropdown in upper middle of the
	# page|
	#|Click on 'Add...'|
	#|Click on file you want to add and click on 'open'|
	#|Click on 'Attachment(s)' dropdown in upper middle of the
	# page|
	@cheris
	Scenario: Cucumber - As an Inventory Manager 3 I should be able to attach file(s) to contact 
		Given User logs in to Contacts Page as Manager
		When User searches for new contact
		Then User clicks on contact Joseph Walters 
		Then User selects Attachment from dropdown menu
		Then User clicks on Add...
		Then User adds file
		And verify file is attachmented

		
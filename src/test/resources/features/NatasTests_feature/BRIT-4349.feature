Feature: 

	#|Click on "contacts" functionality on left top side of a webpage|
	#|The system should navigate to a new page with all contacts|
	#|Click on the desired contact person|
	#|Right information to be able to contact the person|
	#| |
	@BRIT-4349 @BugSquashers @Contacts @Online1
	Scenario: CLONE - Verifying manager can access person's information
		Given User logs in to BriteERP
		Given User logs in to Contacts Page as "Manager"
		When "Manager" clicks "Contacts" 
		Then System should navigate to a new page with all contacts
		When "Manager" clicks on the "desired contact" person
		Then "Manager" gets information of contact the person
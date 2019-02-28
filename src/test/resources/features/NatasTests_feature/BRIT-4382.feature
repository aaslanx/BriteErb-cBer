Feature: 

	#|Click on "contacts" functionality on left top side of a webpage|
	#|A system should navigate to a new page with all contacts|
	#|Navigate to 'Conversations' functionality and click|
	#|A system should display a dropdown list of 'Conversations|
	@BRIT-4382 @BugSquashers @Contacts @Online1
	Scenario: CLONE - verify Manager can see a dropDown list
		Given User logs in to Contacts Page as Manager
		When "Manager" clicks "Contacts"
		Then System should display "AllContactsHeaderOfAPage"
		When "Manager" clicks "Conversations"
		Then System should display "dropdown"
		
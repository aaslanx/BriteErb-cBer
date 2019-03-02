Feature: 

	#|Click on "contacts" functionality on left top side of a webpage|
	#|The system should navigate to a new page with all contacts|
	#| |
	@BRIT-4350 @BugSquashers @Contacts @Online1
	Scenario: CLONE - Verifying from Manager perspective 'Contact' functionality working properly
		Given User logs in to Contacts Page as Manager
		When "Manager" clicks "Contacts" 
		Then System should navigate to a new page with all contacts
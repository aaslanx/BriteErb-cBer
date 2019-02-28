Feature: 

	#|Click on "contacts" functionality on left top side of a webpage|
	#|A system should navigate to a new page with all contacts|
	#|Click on the desired contact person|
	#|A system should navigate to the desired person's file|
	#|Contact person via TextMsg. Click on envelope functionality|
	#|A system should navigate to 'Send SMS' page|
	#| |
	@BRIT-4378 @BugSquashers @Contacts @Online1
	Scenario: CLONE - System should navigate Manager to 'Send SMS' page
		Given User logs in to Contacts Page as Manager
		When "Manager" clicks "Contacts"
		Then System should display "AllContactsHeaderOfAPage"
		When "Manager" clicks "contactEphrem"
		Then System should display "contactInfo"
		And "Manager" clicks "envelope"
		Then System should display"'Send SMS' page"
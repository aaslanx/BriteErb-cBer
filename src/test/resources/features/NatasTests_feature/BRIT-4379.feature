Feature: 

	#|Click on "contacts" functionality on left top side of a webpage|
	#|A system should display 'Contacts' page|
	#|Click on the desired contact person|
	#|A system should navigate to the desired person's file|
	#|Contact person via TextMsg. Click on envelope functionality|
	#|A system should navigate to 'Send SMS' page|
	#|Click and type message|
	#|Click the 'Send' button|
	#|System should navigate to a pop up window of 'Warning|
	@BRIT-4379 @BugSquashers @Contacts @Online1
	Scenario: CLONE - Verifying from manager perspective, that manager CANNOT send SMS with NOT-Valid phone credentials
		Given User logs in to Contacts Page as Manager
		When "Manager" clicks "Contacts"
		Then System should display "AllContactsHeaderOfAPage"
		When "Manager" clicks "contactEphrem"
		Then System should display "contactInfo"
		And "Manager" clicks "envelope"
		Then System should display "Send SMS"
		And "Manager" clicks and type message
		When "Manager" clicks "Send" button
		Then System should display "Warning"
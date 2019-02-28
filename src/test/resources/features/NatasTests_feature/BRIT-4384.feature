Feature: 

	#|Click on "contacts" functionality on left top side of a webpage|
	#|System should navigate to a new page with all contacts|
	#|Navigate to 'Conversations' functionality and click|
	#|System should display a dropdown list of 'Conversations'|
	#|Click on SalesManager4|
	#|System should navigate to a conversation window to reply|
	#|CLICK on 'Write Something', TYPE a message and SUBMIT|
	@BRIT-4384 @BugSquashers @Contacts @Online1
	Scenario: CLONE - Verifying from Manager perspective that Manager can SUBMIT a message on conversation successfully
		Given User logs in to Contacts Page as Manager
		When "Manager" clicks "Contacts"
		Then System should display "AllContactsHeaderOfAPage"
		When "Manager" clicks "conversationBox"
		Then System should display "mailDropdown"
		When "Manager" clicks "SalesManager4"
		Then System should display "conversationWindow"
		Then "Manager" clicks "writeSomething"
		And "Manager" types "message"
		Then "Manager" submits message
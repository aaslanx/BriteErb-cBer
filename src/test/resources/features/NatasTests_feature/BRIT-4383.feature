Feature: 

	#|Click on "contacts" functionality on left top side of a webpage|
	#|A system should navigate to a new page with all contacts|
	#|Navigate to 'Conversations' functionality and click|
	#|A system should display a dropdown list of 'Conversations'|
	#|Click on SalesManager4|
	#|A system should navigate to a conversation window to reply|
	#|Click on 'Write Something'|
	@BRIT-4383 @BugSquashers @Contacts @Online1
	Scenario: CLONE - Verifying from Manager perspective that Manager can type a message on conversation successfully
		Given User logs in to Contacts Page as Manager
		When "Manager" clicks "Contacts"
		Then System should display "AllContactsHeaderOfAPage"
		When "Manager" clicks "conversationBox"
		Then System should display "mailDropdown"
		When "Manager" clicks "SalesManager4"
		Then System should display "conversationWindow"
		Then "Manager" clicks "Write Something"
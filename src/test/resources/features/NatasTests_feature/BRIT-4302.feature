Feature: 

	#|Click on "contacts" functionality on left top side of a webpage|
	#|A system should navigate to a new page with all contacts|
	#|Navigate to 'Conversations' functionality and click|
	#|A system should display a dropdown list of 'Conversations|
	#|Click on SalesManager4|
	#|System should navigate to a conversation window to reply|
	@BRIT-4302 @BugSquashers @Contacts @Online1
	Scenario: Cucumber - Verify from Manager perspective that 'Conversation' functionality works properly
		Given User logs in to Contacts Page as Manager
		When "Manager" clicks "Contacts"
		Then System should display "AllContactsHeaderOfAPage"
		When "Manager" clicks "conversationBox"
		Then System should display "mailDropdown"
		When "Manager" clicks on "SalesManager4"
		Then System should navigate to a "conversation window" to reply
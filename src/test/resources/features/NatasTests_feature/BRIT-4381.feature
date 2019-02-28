Feature: 

	#|Click on "contacts" functionality on left top side of a webpage|
	#|System should navigate to a new page with all contacts|
	#|Click on desired contact person|
	#|Click on email|
	#|System should navigate Manager to Manager's email|
	@BRIT-4381 @BugSquashers @Contacts @Online1
	Scenario: CLONE - verify website link of a company
		Given User logs in to Contacts Page as Manager
		When "Manager" clicks "Contacts"
		Then System should display "AllContactsHeaderOfAPage"
		Then "Manager" clicks "contactJoseph"
		When "Manager" clicks "email"
		Then System should display "ManagerEmail"
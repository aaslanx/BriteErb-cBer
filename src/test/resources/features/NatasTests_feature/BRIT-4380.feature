Feature: 

	#|Click on "contacts" functionality on left top side of a webpage|
	#|System should display 'Contacts' page|
	#|Click on desired contact person|
	#|System should navigate to desired person's file|
	@BRIT-4380 @BugSquashers @Contacts @Online1
	Scenario: CLONE - System should navigate Manager to a persons information page
		Given User logs in to Contacts Page as Manager
		When "Manager" clicks "Contacts"
		Then System should display "AllContactsHeaderOfAPage"
		Then "Manager" clicks "contactJoseph"
		
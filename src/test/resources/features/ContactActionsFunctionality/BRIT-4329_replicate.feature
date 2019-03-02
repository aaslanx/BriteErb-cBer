Feature: 

	#|Click on contact "Tang Tsui" (on or around row 3)|
	#|Click on 'Action' dropdown in upper middle of the page|
	#|Click on 'Duplicate'|
	#|Click on 'Save' on the left upper side of the screen|
	@cheris
	Scenario: Cucumber - As an Inventory Manager 3 I should be able to  replicate contact
		Given User logs in to Contacts Page as Manager
		When User searches for contact
		Then User clicks on searchable contact
		Then User selects Duplicate from the Action dropdown
		Then User click on Save
		
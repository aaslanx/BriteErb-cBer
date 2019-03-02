Feature: 

	#|Click on 'Create' on the left upper side of the screen|
	#|Click on 'Save' on the left upper side of the screen|
	#|Click on 'Discard' on the left upper side of the screen|

@cheris
	Scenario: Cucumber - As an Inventory Manager 3 I should not be able to create and save contact with adding name
		 Given User logs in to Contacts Page as Manager
		    When User clicks on create button
		    Then User clicks on save button
		    And User sees error message
		    Then User clicks on discard button
		
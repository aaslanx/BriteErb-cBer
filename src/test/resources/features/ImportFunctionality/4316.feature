Feature: 

	#Click on “Contacts” on upper left corner
	#
	#Click on “Create” tab
	#
	#InventoryUser3 click radio button “Company”
	#
	#Click on “Create” without providing company name, save and close, see error message
  @BRIT-4316
  Scenario: Cucumber- Verify that InventoryUser3 is NOT able to create and  save contacts without providing Company Name (Negative Scenario)
    Given User logs in to Contacts Page
    When User clicks to create button
    Then User clicks to Company radio button
    And click on Create button without providing name, save and close and see error message

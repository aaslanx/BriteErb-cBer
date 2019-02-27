Feature: 

	#Click on “Contacts” on upper left corner
	#
	#Click on “Import” tab
	#
	#Verify cancel button is clickable
  @BRIT-4307

  Scenario: Cucumber - Verify that InventoryUser3 should be able to cancel while in import page
    Given User logs in to Contacts Page
    When User clicks to import button
    And User clicks to cancel button

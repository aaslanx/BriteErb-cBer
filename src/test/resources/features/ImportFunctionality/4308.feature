Feature: 

	#Click on “Contacts” on upper left corner
	#
	#Click on “Import” tab
	#
	#Click on "Cancel" button
	#
	#After clicking “Cancel” button user should see Contacts homepage
  @BRIT-4308
  Scenario: Cucumber - Verify that InventoryUser3 is able to click on “Cancel” button and see 'Contacts' header

    Given User logs in to Contacts Page
    When User clicks to import button
    And User clicks to cancel button
    Then User should see Contacts homepage

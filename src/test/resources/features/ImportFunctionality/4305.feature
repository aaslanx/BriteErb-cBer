Feature: 

	#|Click on “Contacts” tab on upper left corner|
	#|Click on "Import" tab|
	#|Click on "Load File"|
	#| |
  @BRIT-4305

  Scenario: Cucumber - Verify that InventoryUser3 should  be able to click on Load file button

    Given User logs in to Contacts Page
    When User clicks to import button
    And User clicks to Load File

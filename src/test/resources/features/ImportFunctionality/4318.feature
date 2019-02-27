Feature: 

	#Click on “Contacts” on upper left corner
	#
	#Click on “Create” tab
	#
	#InventoryUser3 click radio button “Company”
	#
	#InventoryUser3 should enter Company “Name”
	#
	#InventoryUser3 should enter address
	#
	#InventoryUser3 should enter phone number
	#
	#Click on “Image” icon on top left
  @BRIT-4318
  Scenario: Cucumber - Verify that InventoryUser3 is able to click to delete button from an image icon of the company
    Given User logs in to Contacts Page
    When User clicks to create button
    Then User clicks to Company radio button
    And User enters Company name
    Then User enters address
    And enters phone number
    Then User clicks to Delete icon
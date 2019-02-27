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
	#Click “Create”
	#
	#Enter Contact Name ,save and close

  @BRIT-4315
  Scenario: Cucumber - Verify that InventoryUser3 is able to create and save  contacts with providing Company Name , address,  phone number
    Given User logs in to Contacts Page
    When User clicks to create button
    Then User clicks to Company radio button
    And User enters Company name
    Then User enters address
    And enters phone number
    Then click Create button
    Then enter name
    And save and close


Feature: 

	#Click on “Contacts” on upper left corner
	#
	#Click on “Create” tab
	#
	#Click on “Company” radio button
	#
	#Enter company name
	#
	#Enter “Contact name”
	#
	#Click “Discard” button
	#
	#Warning pop up
  @BRIT-4319
  Scenario: Cucumber - Verify that InventoryUser3  is  able to click on Discard button  when created company contact name is no longer needed
    Given User logs in to Contacts Page
    When User clicks to create button
    Then User clicks to Company radio button
    And User enters Company name MO LLC
    Then click Create button
    When User enters Contact name MO
    Then save and close
    And User should see a Contacts/New page and under that title user needs to click to Discard button
    Then User should see the popup message with "The record has been modified, your changes will be discarded" and user needs to click OK button

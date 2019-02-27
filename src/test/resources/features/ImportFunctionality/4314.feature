Feature: 

	#Click on “Contacts” on upper left corner
	#
	#Click on “Import” tab
	#
	#'Help' icon should be displayed on upper right side
	#
	#'How to start' button should be displayed on left side
  @BRIT-4314
  Scenario: Cucumber - Verify that InventoryUser3 should be able to click on 'How to start' button from Odoo import page
    Given User logs in to Contacts Page
    When User clicks to import button
    Then User clicks to Help botton
    Then User switch page to "How to import data into Odoo — Odoo 11.0 documentation"
    And User should click on How to start button

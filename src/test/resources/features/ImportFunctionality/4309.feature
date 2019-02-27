Feature: 

	#Click on “Contacts” on upper left corner
	#
	#Click on “Import” tab
	#
	#“Help” icon should be displayed on upper right side
	#
	#After clicking “Help” button

  @BRIT-4309
  Scenario: Cucumber - Verify that InventoryUser3 is able to click on “Help”  button and see new page “How to import data into Odoo”
    Given User logs in to Contacts Page
    When User clicks to import button
    Then User clicks to Help botton
    Then User switch page to "How to import data into Odoo — Odoo 11.0 documentation"
    And User should see new page "How to import data into Odoo"

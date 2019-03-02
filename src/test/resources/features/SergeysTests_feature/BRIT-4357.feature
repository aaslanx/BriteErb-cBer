Feature:

    #|Click on "Contacts" on upper left corner|
    #|Click on "Create" on upper left corner|
    #|Click on "Safe" on upper left corner|
    #
  @BRIT-4357 @BugSquashers @Contacts @online1
  Scenario: CLONE - Verify that InventoryUser3 should be able to click on safe to see a pop up error: " ! The following fields are invalid: *Name "
    Given User logs in to Contacts Page
    When User clicks "CreateButton"
    Then User clicks "SaveButton"
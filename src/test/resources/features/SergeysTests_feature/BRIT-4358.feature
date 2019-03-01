Feature:
    #|Click on "Contacts" on upper left corner|
    #|Click on "Create" on upper left corner|
    #|Click on "Safe" on upper left corner|
    #|Click on "Discard" on upper left corner|
  @BRIT-4358 @BugSquashers @Contacts @online1
  Scenario: CLONE - Verify that InventoryUser3 should be able to click on "Discard"
    Given User logs in to Contacts Page
    When User clicks "CreateButton"
    Then User clicks "SaveButton"
    Then User clicks "DiscardButton"
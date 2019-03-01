Feature:
    #|Click on "Contacts" on upper right corner|
    #|Click on "Create" on upper right corner|
  @BRIT-4345 Verify that InventoryUser3 should be able to click on Create
  Scenario:
    Given User logs in to Contacts Page
    When User clicks "CreateButton"
Feature:

    #|Click on "Contacts" on upper left corner|
    #|Click on "Create" on upper left corner|
    #|Type a name and click on "Sales and Purchases"|
  @BRIT-4353 Verify that InventoryUser3 should be able to type a name and click on "Sales and Purchases"
  Scenario:
    Given User logs in to Contacts Page
    When User clicks "CreateButton"
    Then User clicks "SaleAndPurchace"
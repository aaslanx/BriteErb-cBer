Feature:

    #|Click on "Contacts" on upper left corner|
    #|Click on "Create" on upper left corner|
    #|Type a name and click on "Sales and Purchases"|
    #|Click on "0 Bank Accounts" at a bottom under Payments header|
    #|Click on "Create" on upper left corner to create a bank account|
  @BRIT-4355 @BugSquashers @Contacts @Online1
  Scenario: CLONE - InventoryUser3 should be able to click on "Create"
    Given User logs in to Contacts Page
    When User clicks "CreateButton"
    Then User clicks "SaleAndPurchace"
    Then User clicks "PaymentBank"
    Then User clicks "CreateAdd"
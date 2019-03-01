Feature:

    #|Click on "Contacts" on upper left corner|
    #|Click on "Create" on upper left corner|
    #|Type a name and click on "Sales and Purchases"|
    #|Click on "0 Bank Accounts" at a bottom under Payments header|
    #|Click on "Create" on upper left corner to create a bank account|
    #|Account Number, ABA/Routing and Bank fields must be provided and click "Safe" on upper left corner|
  @BRIT-4356 @BugSquashers @Contacts @Online1
  Scenario: CLONE - Verify that InventoryUser3 should not be able to create and save bank account with invalid information
    Given User logs in to Contacts Page
    When User clicks "CreateButton"
    Then User types "Name"
    Then User clicks "SaleAndPurchace"
    Then User clicks "PaymentBank"
    Then User clicks "CreateAdd"
    Then User types "AccountNumber"
    And User types "AbaRouting"
    And User types "Bank"
    Then User clicks "Safe"

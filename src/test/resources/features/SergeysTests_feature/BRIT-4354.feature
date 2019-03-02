Feature:

    #|Click on "Contacts" on upper left corner|
    #|Click on "Create" on upper left corner|
    #|Type a name and click on "Sales and Purchases"|
    #|Click on "0 Bank Accounts" at a bottom under Payments header|
  @BRIT-4354 Verify that InventoryUser3 should be able to click on "0 Bank Accounts"
  Scenario:
    Given User logs in to Contacts Page
    When User clicks "CreateButton"
    Then User clicks "SaleAndPurchace"
    Then User clicks "PaymentBank"
Feature:
  Scenario: Verify that InventoryUser3 can add a new bank account for a contact in the database

Given "Inventory User" logs in to "BriteERPDemo"
Then "usernameUser" clicks "Search"
And "usernameUser" sendKeys "Matthew"
And "usernameUser" clicks "contact card"
Then "usernameUser" clicks "Sales & Purchases" tab
Then "usernameUser" clicks "Bank Accounts"
Then "usernameUser" clicks "Create Bank Account" button
Then "usernameUser" sendKeys "000123456789" in "Bank Account"
And "usernameUser" sendKeys "322281617" in "ABA/Routing"
And "usernameUser" sendKeys "Seven Oaks" in "bankNameField"
Then "usernameUser" clicks "Save" button
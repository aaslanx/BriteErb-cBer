Feature:

  Scenario: Verify that InventoryUser3 can update the name of the company in the Contacts section

Given "Inventory User" logs in to "BriteERPDemo"
Then "usernameUser" clicks "Contacts"
Then "usernameUser" clicks "Search"
And "usernameUser" sendKeys "ADA"
And "usernameUser" clicks "contact card"
Then "usernameUser" clicks "Edit" button
Then "usernameUser" clicks "nameField" to edit name
Then "usernameUser" clears "nameField"
Then "usernameUser" sendKeys "ADALET" in "nameField"
Then "usernameUser" clicks "Save" button
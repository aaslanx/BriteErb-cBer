Feature:
#Verify that InventoryUser3 can view all contacts in the Contacts section and change layout from table to list

  @BRIT-4341
  Scenario:Verify that InventoryUser3 can view all contacts in the Contacts section and change layout from table to list

    Given "Inventory User" logs in to "BriteERPDemo"
Then "usernameUser" clicks "Contacts"
Then "usernameUser" scrolls down to ensure the contacts are loaded and displayed
Then "usernameUser" clicks "List" button to change layout of page
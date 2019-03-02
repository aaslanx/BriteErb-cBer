Feature:

  Scenario: Verify that InventoryUser3 can publish the unpublished contact on the website

    Given "Inventory User" logs in to "BriteERPDemo"
    Then "usernameUser" clicks "Contacts"
    Then "usernameUser" clicks "Random Contact" in the list
    And "usernameUser" clicks "unpublished" button


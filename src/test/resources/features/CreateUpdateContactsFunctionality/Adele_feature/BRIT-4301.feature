Feature:
#Negative test

	#|Search for contact using Search bar: "Matthew" to add or edit contacts bank information|
	#|Click on "Sales & Purchases" tab in the lower part of the Contacts card|
	#|Click on "2 Bank Account(s)"|
	#|Click on "Create" button in the top left of the page|
	#|Populate required data with information, entering invalid bank account number consisting of 5 digits (instead of required 8-10)|

@BRIT-4301
  Scenario: Verify that InventoryUser3 cannot add a new bank account for a contact in the database using an invalid routing number  || NEGATIVE TEST SCENARIO
#Given "Inventory User" opens "http://52.39.162.23" url
#When "Inventory User" clicks "BriteErpDemo" button
#Then "Inventory User" logs in as "<usernameUser>" using "in3@info.com" and "alsfuh7we72"
  Given "Inventory User" logs in to "BriteERPDemo"
Then "usernameUser" clicks "Search" box
Then "usernameUser" sendKeys "Matthew"
Then "usernameUser" clicks "Contact card" box
Then "usernameUser" clicks "Sales & Purchases" button
Then "usernameUser" clicks "Bank Accounts" button
Then "usernameUser" clicks "Create Bank Account" button
Then "usernameUser" sendKeys "123456789000" in "Bank Account"
And "usernameUser" sendKeys "12345" in "ABA/Routing"
Then "usernameUser" clicks "Save" button

Feature:

    #|Click on "contacts" functionality on left top side of a webpage|
    #|Click on "Conversations" functionality on upper right corner|
    #|Click on a receiving message|
  @BRIT-4360 @BugSquashers @Contacts @Online1
  Scenario: CLONE - Testing from InventoryUser3 perspective to verify InventoryUser3 can get a proper help from Helpdesk
    Given User logs in to Contacts Page
    When User clicks "ConversationButton"
    Then User should receive message
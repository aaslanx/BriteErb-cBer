Feature:

    #|Click on "contacts" functionality on left top side of a webpage|
    #|Click on "Conversations" functionality on upper right corner|
  @BRIT-2948
  Scenario: Verify that InventoryUser3 should be able to click "Conversation functionality"
    Given User logs in to Contacts Page
    When User clicks "ConversationButton"
Feature: 

	#|Click on eigth contact "Tang Tsui"|
	#|Click on 'Action' dropdown in upper middle of the page|
	#|Click on 'Send SMS'|
	#|Type phone number in '+### ### ####' format next to 
	#'Recieptants'|
	#|Type message in box next to 'Message'|
	#|Click 'Send' on left corner of 'Send SMS' box|
	@cheris
	Scenario: Cucumber - As an Inventory Manager 3 should be able to send contact a SMS message
		Given User logs in to Contacts Page as Manager
		When User searches for contact
		Then User clicks on searchable contact
		Then User selects Send SMS from the Action dropdown
		Then User adds phone number
		Then User adds message
		Then User clicks Send
		
package step_definitions;

import cucumber.api.java.en.*;
import pages.ContactsPage;
import utilities.Pages;


public class Common_steps {

    ContactsPage cpObj = new ContactsPage();

    @Given("User logs in to Contacts Page")
    public void user_logs_in_to_Contacts_Page() {
        cpObj.login("User");
    }

    @Given("User logs in to Contacts Page as Manager")
    public void user_logs_in_to_Contacts_Page_as_Manager() {
        cpObj.login("Manager");
    }

    @When("User clicks to create button")
    public void user_clicks_to_create_button() {
        cpObj.createButton.click();

    }






}

package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ContactActions;
import utilities.BrowserUtils;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CherisTest_steps extends BrowserUtils {

    ContactActions contactActions = new ContactActions();

    public CherisTest_steps() {
    }

    @When("User clicks on create button")
    public void user_clicks_on_create_button() {

        contactActions.create_button.click();
    }

    @Then("User clicks on save button")
    public void user_clicks_on_save_button() {

        contactActions.save_button.click();
    }

    @And("User sees error message")
    public void user_closes_error_message() {

        Assert.assertEquals(contactActions.error_message.getText().trim(), "The following fields are invalid:\n" + "Name");
    }

    @Then("User clicks on discard button")
    public void user_clicks_on_discard_button() {

        contactActions.discard_button.click();
    }

    @When("User searches for contact using email address")
    public void user_searches_for_contact_using_email_address() {

        contactActions.search_box.sendKeys("NatigBakhishov@gmail.com" + Keys.ENTER);
    }

    @Then("User clicks on contact")
    public void user_clicks_on_contact() {

        BrowserUtils.wait(3);
        contactActions.NB_contact.click();

        Assert.assertTrue(contactActions.NB_title.getText().contains("Natig Bakhishov"));

    }

    @When("User searches for contact using full name")
    public void user_searches_for_contact_using_full_name() {

        contactActions.search_box.sendKeys("Natig Bakhishov" + Keys.ENTER);

    }

    @Then("User clicks on contact module")
    public void user_clicks_on_contact_module() {

        contactActions.contactsTopButton.click();

    }

    @Then("User searches for contact using first name only")
    public void user_searches_for_contact_using_first_name_only() {

        BrowserUtils.wait(3);
        contactActions.search_box.click();
        contactActions.search_box.sendKeys("Natig" + Keys.ENTER);

    }

    @Then("User searches for contact using last name only")
    public void user_searches_for_contact_using_last_name_only() {

        BrowserUtils.wait(3);
        contactActions.search_box.click();
        contactActions.search_box.sendKeys("Bakhishov" + Keys.ENTER);

    }

    @When("User searches for contact using comany name")
    public void user_searches_for_contact_using_comany_name() {

        contactActions.search_box.sendKeys("Think Big Systems" + Keys.ENTER);

    }

    @Then("User clicks on third contact")
    public void user_clicks_on_third_contact() {

        BrowserUtils.wait(3);
        contactActions.NBCompany_contact.click();

        Assert.assertTrue(contactActions.NB_title.getText().contains("Natig Bakhishov"));
    }

    @When("User searches for contact")
    public void user_searches_for_contact() {

        contactActions.search_box.sendKeys("Tang Tsui" + Keys.ENTER);

    }

    @Then("User clicks on searchable contact")
    public void user_clicks_on_searchable_contact() {

        BrowserUtils.wait(2);
        contactActions.TT_Contact.click();



    }

    @Then("User selects Duplicate from the Action dropdown")
    public void user_selects_Duplicate_from_the_Action_dropdown() {

        contactActions.actions_menu.click();

        contactActions.duplicate_option.click();

    }

    @Then("User click on Save")
    public void user_click_on_Save() {

        BrowserUtils.wait(2);
        contactActions.save_button.click();

        BrowserUtils.wait(2);
        Assert.assertTrue(contactActions.TT_title.getText().contains("copy"));

    }


    @Then("User clicks on the copy of the contact")
    public void user_clicks_on_the_copy_of_the_contact() {

        BrowserUtils.wait(2);
        contactActions.contact_copy.click();

        BrowserUtils.wait(2);
        Assert.assertTrue(contactActions.TT_title.getText().contains("copy"));

    }

    @Then("User selects Delete from the Action dropdown")
    public void user_selects_Delete_from_the_Action_dropdown() {

        BrowserUtils.wait(2);
        contactActions.actions_menu.click();

        BrowserUtils.wait(2);
        contactActions.delete_option.click();

    }

    @Then("User clicks on ok")
    public void user_clicks_on_ok() {

        BrowserUtils.wait(2);
        contactActions.ok_button.click();

        Assert.assertTrue(contactActions.TT_title.getText().contains("Tang Tsui"));

    }

    @When("User searches for new contact")
    public void user_searches_for_new_contact() {

        contactActions.search_box.sendKeys("Joseph Walters" + Keys.ENTER);

    }

    @Then("User clicks on contact Joseph Walters")
    public void user_clicks_on_contact_Joseph_Walters() {

        BrowserUtils.wait(2);
        contactActions.JW_contact.click();

    }

    @Then("User selects All Invoices from dropdown menu")
    public void user_selects_All_Invoices_from_dropdown_menu() {

        BrowserUtils.wait(2);
        contactActions.actions_menu.click();

        BrowserUtils.wait(2);
        contactActions.invoice_option.click();

    }

    @Then("User clicks on invoice")
    public void user_clicks_on_invoice() {

        BrowserUtils.wait(2);
        contactActions.select_invoice.click();

        Assert.assertTrue(contactActions.bill_name.getText().contains("Invoice DC store/0004"));

    }

    @Then("User selects Attachment from dropdown menu")
    public void user_selects_Attachment_s_from_dropdown_menu() {

        contactActions.attachments_menu.click();

    }

    @Then("User clicks on Add...")
    public void user_clicks_on_Add() {

        contactActions.add_option.click();

    }

    @Then("User adds file")
    public void user_adds_file() {

       String path = "/Users/cherisnatig/Desktop/SalesJan2009.csv";

        contactActions.add_option.sendKeys(path);

    }

    @Then("verify file is attachmented")
    public void verify_file_is_attachmented() {

        BrowserUtils.wait(2);
        contactActions.attachments_menu.click();

        String expected = contactActions.attachments_menu.getText();
        String actual = contactActions.attachments_menu.getText();

        wait(2);
        Assert.assertEquals(expected, actual);

    }

    @Then("User selects Due Payments from Print dropdown menu")
    public void user_selects_Due_Payments_from_Print_dropdown_menu() {

        BrowserUtils.wait(2);
        contactActions.print_menu.click();

        BrowserUtils.wait(2);
        contactActions.duePayments_option.click();

    }

    @Then("User selects Send SMS from the Action dropdown")
    public void user_selects_Send_SMS_from_the_Action_dropdown() {

        BrowserUtils.wait(2);
        contactActions.actions_menu.click();

        BrowserUtils.wait(2);
        contactActions.SMSMessage.click();

    }

    @Then("User adds phone number")
    public void user_adds_phone_number() {

        contactActions.recipients_box.sendKeys("+11155256325");

    }

    @Then("User adds message")
    public void user_adds_message() {

        contactActions.message_box.sendKeys("testing");

    }

    @Then("User clicks Send")
    public void user_clicks_Send() {

        contactActions.message_send.click();

    }



}

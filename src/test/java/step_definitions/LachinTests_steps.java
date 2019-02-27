package step_definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ImportUserPage;
import utilities.ApplicationConstants;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.Pages;


public class LachinTests_steps extends BrowserUtils {

    ImportUserPage importUserPage = new ImportUserPage();

    @When("User clicks to Load File")
    public void user_clicks_to_Load_File() {
        importUserPage.loadFileTab.click();
    }

    @When("User clicks to cancel button")
    public void user_clicks_to_cancel_button() {
        importUserPage.cancelButtonInImportPage.click();
    }

    @Then("User should see Contacts homepage")
    public void user_should_see_Contacts_homepage() {
        Assert.assertEquals(importUserPage.contactsHeaderrr.getText(), "Contacts");
    }

    @Then("User clicks to Help botton")
    public void user_clicks_to_Help_botton() {
        importUserPage.helpIcon.click();
    }


    @Then("User should see new page {string}")
    public void user_should_see_new_page(String header) {
        BrowserUtils.wait(3);
        BrowserUtils.switchToWindow(header);
        Assert.assertEquals(importUserPage.odooHeader.getText(), header);
    }

    @When("User clicks to import button")
    public void user_clicks_to_import_button() {
        BrowserUtils.waitForClickablility(importUserPage.importTab, 10);
        importUserPage.importTab.click();
    }

    @Then("User switch page to {string}")
    public void user_switch_page_to(String actualTitle) {
        BrowserUtils.wait(2);
        BrowserUtils.switchToWindow(actualTitle);
    }

    @Then("User should click on How to start button")
    public void user_should_click_on_How_to_start_button() {
        importUserPage.howToStart.click();
    }

    @Then("User clicks to Company radio button")
    public void user_clicks_to_Company_radio_button() {
        importUserPage.companyRadioButton.click();
    }


    @Then("User enters Company name")
    public void user_enters_Company_name() {
        importUserPage.companyName.sendKeys("Jasmina LLC");
    }

    @Then("User enters address")
    public void user_enters_address() {
        importUserPage.streetName.sendKeys("18 Richland Avenue");
        importUserPage.cityName.sendKeys("Sugar Land");
        importUserPage.stateName.sendKeys("IL");
        importUserPage.countryName.sendKeys("United States");
        importUserPage.cancelpopButton.click();
        importUserPage.zip.sendKeys("77487");
    }

    @Then("enters phone number")
    public void enters_phone_number() {
        importUserPage.phoneTab.sendKeys("2813252933");
    }

    @Then("click Create button")
    public void click_Create_button() {
        importUserPage.createCompanyButton.click();
        BrowserUtils.wait(2);
    }

    @Then("enter name")
    public void enter_name() {
        importUserPage.contactNameTab.sendKeys("Jasmina Jones");
        BrowserUtils.wait(2);
    }


    @Then("save and close")
    public void save_and_close() {
        importUserPage.saveAndClose.click();
    }

    @Then("click on Create button without providing name, save and close and see error message")
    public void click_on_Create_button_without_providing_name_save_and_close_and_see_error_message() {
        importUserPage.createCompanyButton.click();
        importUserPage.saveAndClose.click();

    }
    @Then("User should be able to click on Image looking icon on top left")
    public void user_should_be_able_to_click_on_Image_looking_icon_on_top_left() {
       importUserPage.pencilIcon.click();
    }
    @Then("User clicks to Delete icon")
    public void user_clicks_to_Delete_icon() {
       importUserPage.trashIcon.click();
    }

    @Then("User enters Company name MO LLC")
    public void user_enters_Company_name_MO_LLC() {
        importUserPage.companyName.sendKeys("MO LLC");
    }

    @When("User enters Contact name MO")
    public void user_enters_Contact_name_MO() {
      importUserPage.contactNameTab.sendKeys("MO");
      importUserPage.saveButton.click();
    }

    @Then("User should see a Contacts\\/New page and under that title user needs to click to Discard button")
    public void user_should_see_a_Contacts_New_page_and_under_that_title_user_needs_to_click_to_Discard_button() {
       importUserPage.discardButtonbutton.click();
       BrowserUtils.wait(2);
    }

    @Then("User should see the popup message with {string} and user needs to click OK button")
    public void user_should_see_the_popup_message_with_and_user_needs_to_click_OK_button(String string) {
       importUserPage.okButton.click();
    }



}



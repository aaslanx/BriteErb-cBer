package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BrowserUtils;
import utilities.Pages;

public class UniversalStepDefinitions  extends BrowserUtils {
    Pages pages = new Pages();


    @Then("{string} clicks {string} box")
    public void clicks_box(String string, String box) {
        switch (box) {
            case "Search":
                waitForClickablility(pages.homePage().searchBox, 10);
                pages.homePage().searchBox.click();
                break;
            case "Contact card":
                waitForClickablility(pages.contactsPage().contactCard, 10);
                pages.contactsPage().contactCard.click();
                break;

        }
    }

    //===================================================================================

    @When("{string} clicks {string} button")
    public void clicks_button(String username, String button) {
        switch (button) {

            case "BriteErpDemo":
                waitForClickablility(pages.homePage().briteErpDemoButton, 10);
                pages.homePage().briteErpDemoButton.click();
                break;
            case "logInButton":
                waitForClickablility(pages.homePage().logInButton, 10);
                pages.homePage().logInButton.click();
                break;
            case "Contact card":
                waitForClickablility(pages.homePage().logInButton, 10);
                pages.contactsPage().contactCard.click();
                break;
            case "Sales & Purchases":
                waitForClickablility(pages.homePage().logInButton, 10);
                pages.contactsPage().sales_purcases_tab.click();
                break;
            case "Bank Accounts":
                waitForClickablility(pages.contactsPage().bankAccounts, 10);
                pages.contactsPage().bankAccounts.click();
                break;
            case "Create Bank Account":
                waitForClickablility(pages.contactsPage().createBankAcctButton, 10);
                pages.contactsPage().createBankAcctButton.click();
                break;
            case "Save":
                waitForClickablility(pages.contactsPage().saveBankDetails, 10);
                pages.contactsPage().saveBankDetails.click();
                break;
        }
    }
}

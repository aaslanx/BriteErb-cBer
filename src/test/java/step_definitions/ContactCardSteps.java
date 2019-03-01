package step_definitions;

import cucumber.api.java.en.Then;
import utilities.BrowserUtils;
import utilities.Pages;

public class ContactCardSteps extends BrowserUtils {
    Pages pages = new Pages();



    @Then("{string} clicks {string} tab")
    public void clicks_tab(String string, String string2) {
        pages.contactsPage().sales_purcases_tab.click();
    }

    @Then("{string} sendKeys {string} in {string}")
    public void sendkeys_in(String string, String string2, String string3) {
        pages.contactsPage().accountNumberField.sendKeys("123456789000");
        pages.contactsPage().routingNumberField.sendKeys("12345");
    }
}

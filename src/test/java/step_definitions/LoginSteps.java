package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.*;

public class LoginSteps extends BrowserUtils implements ApplicationConstants {
    Pages pages = new Pages();

    @Given("{string} logs in to {string}")
    public void logs_in_to(String string, String string2) {
        pages.contactsPage().login();

    }
    @Then("{string} logs in as {string} using {string} and {string}")
    public void logs_in_as_using_and(String string, String string2, String usernameUser, String passwordUser) {
        pages.login().emailBox.sendKeys(ConfigReader.getProperties("usernameUser"));
        pages.login().passwordBox.sendKeys(ConfigReader.getProperties("passwordUser"));
        pages.login().login_button.click();
    }
}

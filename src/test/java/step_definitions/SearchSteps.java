package step_definitions;

import cucumber.api.java.en.Then;
import org.openqa.selenium.Keys;
import utilities.BrowserUtils;
import utilities.Pages;

public class SearchSteps extends BrowserUtils {
    Pages pages = new Pages();

    @Then("{string} clicks {string}")
    public void clicks(String string, String string2) {
        pages.homePage().searchBox.click();
    }



    @Then("{string} sendKeys {string}")
    public void sendkeys(String string, String Matthew) {
        pages.homePage().searchBox.sendKeys("Matthew");
        pages.homePage().searchBox.sendKeys(Keys.RETURN);
        pages.contactsPage().contactCard.click();
    }
}

package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ContactLoginPage;
import pages.ContactsPage;

public class SergeysStepDefinitions {

    ContactLoginPage contactLoginPage = new ContactLoginPage();

    @When("User clicks {string}")
    public void user_clicks(String button) {
        switch (button){
            case "CreateButton":
                contactLoginPage.CreateButton.click();
                break;
            case "SaleAndPurchace":
                contactLoginPage.SaleAndPurchace.click();
                break;
            case "PaymentBank":
                contactLoginPage.PaymentBank.click();
                break;
            case "CreateAdd":
                contactLoginPage.CreateAdd.click();
                break;
            case "Safe":
                contactLoginPage.Safe.click();
                break;
            case "SaveButton":
                contactLoginPage.SaveButton.click();
                break;
            case "DiscardButton":
                contactLoginPage.DiscardButton.click();
                break;
            case "ConversationButton":
                contactLoginPage.ConversationButton.click();
                break;
            case "Chat":
                contactLoginPage.Chat.click();
                break;


        }

    }

    @Then("User types {string}")
    public void user_types(String option) {
        switch (option){
            case "Name":
                contactLoginPage.Name.sendKeys("Nathan");
                break;
            case "AccountNumber":
                contactLoginPage.AccountNumber.sendKeys("15646");
                break;
            case "AbaRouting":
                contactLoginPage.AbaRouting.sendKeys("213456789");
                break;
            case "Bank":
                contactLoginPage.Bank.sendKeys("sdjkskd");
                break;
        }

    }
}
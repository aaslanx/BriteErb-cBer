package step_definitions.NatasStep_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.ContactsPage;
import pages.SystemNavigatesToPage;

public class BRIT_4350_Step_definition {

    SystemNavigatesToPage systemNavigatesToPage = new SystemNavigatesToPage();

    @When("{string} clicks {string}")
    public void clicks(String username, String button) {
        switch(button){
            case "BriteErpButton":
                systemNavigatesToPage.BriteErpButton.click();
                break;
            case "contactEphrem":
                systemNavigatesToPage.contactEphrem.click();
                break;
            case "envelope":
                systemNavigatesToPage.envelope.click();
                break;
            case "typeMessage":
                systemNavigatesToPage.typeMessage.click();
                break;
            case "send":
                systemNavigatesToPage.send.click();
                break;
            case "contactJoseph":
                systemNavigatesToPage.contactJoseph.click();
                break;
            case "emailJoseph":
                systemNavigatesToPage.emailJoseph.click();
                break;
            case "conversationBox":
                systemNavigatesToPage.conversationBox.click();
                break;
            case "SalesManager4":
                systemNavigatesToPage.SalesManager4.click();
                break;
            case "writeSomething":
                systemNavigatesToPage.writeSomething.click();
                break;


        }
    }

    @Then("System should display {string}")
    public void system_should_display(String display) {
        switch(display){
            case "AllContactsHeaderOfAPage":
                Assert.assertEquals(systemNavigatesToPage.AllContactsHeaderOfAPage.getText(), "Contacts");
                break;
            case "contactInfo":
                Assert.assertEquals(systemNavigatesToPage.contactInfo.isDisplayed(), "ephrem ketema");
                break;
            case "headerSendSMS":
                Assert.assertEquals(systemNavigatesToPage.headerSendSMS.isDisplayed(), "Send SMS");
                break;
            case "dialogWarning":
                Assert.assertEquals(systemNavigatesToPage.dialogWarning.isDisplayed(), "The number dagfda is not correct. It must be in international format (E.164). No SMS were sent");
                break;
            case "mailDropdown":
                Assert.assertEquals(systemNavigatesToPage.mailDropdown.isDisplayed(), "All Chat Channels\n" + "New message");
                break;
            case "conversationWindow":// will probably find a new path
                Assert.assertEquals(systemNavigatesToPage.conversationWindow.isDisplayed(), "SalesManager4");
                break;
        }

    }

    @Then("{string} types {string}")
    public void types(String user, String message) {
        systemNavigatesToPage.writeSomething.sendKeys("Hi, how are your test cases are going?");
    }

    @Then("{string} submits message")
    public void submits_message(String string) {
        systemNavigatesToPage.writeSomething.submit();
    }

  //typeMessage

}

package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ContactsPage;
import pages.SystemNavigatesToPage;
import utilities.BrowserUtils;

public class NatasStepDefinitions {

    SystemNavigatesToPage systemNavigatesToPage = new SystemNavigatesToPage();

    @When("{string} clicks {string}")
    public void clicks(String username, String button) {
        switch(button){
            case "BriteErpButton":
                systemNavigatesToPage.briteErpButton.click();
                BrowserUtils.wait(10);
                break;
            case "contactEphrem":
                systemNavigatesToPage.contactEphrem.click();
                BrowserUtils.wait(10);
                break;
            case "envelope":
                systemNavigatesToPage.envelope.click();
                BrowserUtils.wait(10);
                break;
            case "typeMessage":
                systemNavigatesToPage.typeMessage.click();
                BrowserUtils.wait(10);
                break;
            case "send":
                systemNavigatesToPage.send.click();
                BrowserUtils.wait(10);
                break;
            case "contactJoseph":
                systemNavigatesToPage.contactJoseph.click();
                BrowserUtils.wait(10);
                break;
            case "emailJoseph":
                systemNavigatesToPage.emailJoseph.click();
                BrowserUtils.wait(10);
                break;
            case "conversationBox":
                systemNavigatesToPage.conversationBox.click();
                BrowserUtils.wait(10);
                break;
            case "SalesManager4":
                systemNavigatesToPage.general.click();
                BrowserUtils.wait(10);
                break;
            case "writeMessage":
                systemNavigatesToPage.writeMessage.click();
                BrowserUtils.wait(10);
                break;
            case "writeSomething":
                systemNavigatesToPage.writeSomething.click();
                BrowserUtils.wait(10);
                break;


        }
    }

    @Then("System should display {string}")
    public void system_should_display(String display) {
        switch(display){
            case "AllContactsHeaderOfAPage":
                Assert.assertEquals(systemNavigatesToPage.AllContactsHeaderOfAPage.getText(), "Contacts");
                BrowserUtils.wait(10);
                break;
            case "contactInfo":
                Assert.assertEquals(systemNavigatesToPage.contactInfo.getText(), "ephrem ketema");
                BrowserUtils.wait(10);
                break;
            case "headerSendSMS":
                Assert.assertEquals(systemNavigatesToPage.headerSendSMS.getText(), "Send SMS");
                BrowserUtils.wait(10);
                break;
            case "dialogWarning":
                Assert.assertEquals(systemNavigatesToPage.dialogWarning.getText(), "The number dagfda is not correct. It must be in international format (E.164). No SMS were sent.");
                BrowserUtils.wait(10);
                break;
            case "newMessage":
                Assert.assertEquals(systemNavigatesToPage.newMessage.getText(), "New message");
                BrowserUtils.wait(10);
                break;
            case "conversationWindow":// will probably find a new path
                Assert.assertEquals(systemNavigatesToPage.conversationWindow.getText(), "#general");
                BrowserUtils.wait(10);
                break;
        }

    }

    @Then("{string} types {string}")
    public void types(String user, String writeMessage) {
        systemNavigatesToPage.writeMessage.sendKeys("Hi");
        BrowserUtils.wait(2);
    }


    @Then("{string} types and submits {string}")
    public void types_and_submits(String string, String writeSomething) {
        systemNavigatesToPage.writeSomething.sendKeys("How are your test cases?" + Keys.ENTER);
        BrowserUtils.wait(2);
    }




}


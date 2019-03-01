package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.BrowserUtils.waitForClickablility;

public class ContactActions {

    public ContactActions() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@class='list-group']//a[2]")
    public WebElement britErpDemoButton;

    @FindBy(css = "input#login")
    public WebElement login_box;

    @FindBy(css = "input#password")
    public WebElement password_box;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement login_button;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[4]")
    public WebElement contactsTopButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement create_button;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement save_button;

    @FindBy(xpath = "//div[@class='o_notification undefined o_error']")
    public WebElement error_message;

    @FindBy(xpath = "//button[@class='btn btn-default btn-sm o_form_button_cancel']")
    public WebElement discard_button;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement search_box;

    @FindBy(xpath = "//li[@class='o_text_overflow']")
    public WebElement NB_contact;

    @FindBy(xpath = "//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']/div[15]")
    public WebElement NBGmail_contact;

    @FindBy(xpath = "//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']/div[3]")
    public WebElement NBCompany_contact;

    @FindBy(css = "div.o_searchview_facet")
    public WebElement searchTermTag_Value;

    @FindBy(xpath = "//li[@class='o_text_overflow']")
    public WebElement TT_Contact;

    @FindBy(xpath = "//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']/div[2]")
    public WebElement contact_copy;

    @FindBy(xpath = "//div[@class='btn-group']/div[3]")
    public WebElement actions_menu;

    @FindBy(xpath = "//div[@class='btn-group']/div[3]/ul/li[2]")
    public WebElement duplicate_option;

    @FindBy(xpath = "//div[@class='btn-group']/div[3]/ul/li[1]")
    public WebElement delete_option;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement ok_button;

    @FindBy(xpath = "//div[@class='btn-group']/div[3]/ul/li[7]")
    public WebElement SMSMessage;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement recipients_box;

    @FindBy(xpath = "//textarea[@class='o_input']")
    public WebElement message_box;

    @FindBy(xpath = "//button[@class='btn btn-sm oe_highlight']")
    public WebElement message_send;

    @FindBy(xpath = "//div[@class='o_dialog_warning modal-body']")
    public WebElement SMS_errorMessage;

    @FindBy(xpath = "//li[@class='o_text_overflow']")
    public WebElement JW_contact;

    @FindBy(xpath = "//div[@class='btn-group']/div[3]/ul/li[4]")
    public WebElement invoice_option;

    @FindBy(xpath = "//tbody[@class='ui-sortable']/tr")
    public WebElement select_invoice;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li[4]")
    public WebElement bill_name;

    @FindBy(xpath = "//div[@class='btn-group']/div[2]")
    public WebElement attachments_menu;

    @FindBy(xpath = "//input[@class='o_input_file']")
    public WebElement add_option;

    @FindBy(xpath = "//div[@class='btn-group']/div")
    public WebElement print_menu;

    @FindBy(xpath = "//div[@class='btn-group']/div[1]/ul")
    public WebElement duePayments_option;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li[3]")
    public WebElement payment_name;

    public void login(){
        Driver.getDriver().get(ConfigReader.getProperties("url"));
        waitForClickablility (britErpDemoButton, 5);
        britErpDemoButton.click ();
        login_box.sendKeys(ConfigReader.getProperties("usernameManager"));
        password_box.sendKeys(ConfigReader.getProperties("passwordManager"));
        login_button.click();
        contactsTopButton.click();
    }
}

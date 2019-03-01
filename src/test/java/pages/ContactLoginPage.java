package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactLoginPage {


    public ContactLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // ELEMENTS

    @FindBy(css = "div.list-group>a:nth-of-type(2)")
    public WebElement BriteErpDemo_button;

    @FindBy(xpath = "//div[@class='form-group field-login']/input")
    public WebElement emailBox;

    @FindBy(xpath = "//div[@class='form-group field-password']/input")
    public WebElement passwordBox;

    @FindBy(xpath = "//div[@class='clearfix oe_login_buttons']/button")
    public WebElement login_button;

    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li[4]/a/span")
    public WebElement ContactsButton;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement CreateButton;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement SaveButton;

    @FindBy(xpath = "//*[@class='btn btn-default btn-sm o_form_button_cancel']")
    public WebElement DiscardButton;

    @FindBy(xpath = "//*[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement NewName;

    @FindBy(xpath = "//div[5]/ul/li[3]/a")
    public WebElement SaleAndPurchace;

    @FindBy(xpath = "//*[@class='btn btn-sm btn-link']")
    public WebElement PaymentBank;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement CreateAdd;

    @FindBy(xpath = "//*[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement AccountNumber;

    @FindBy(xpath = "//*[@class='o_field_char o_field_widget o_input']")
    public WebElement AbaRouting;

    @FindBy(xpath = "//*[@class='o_input ui-autocomplete-input']")
    public WebElement Bank;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement Safe;

    @FindBy(css = "div.navbar-collapse.collapse>ul:nth-of-type(3)>li:nth-of-type(2)>a")
    public WebElement ConversationButton;

    @FindBy(css = "div.navbar-collapse.collapse>ul:nth-of-type(3)>li:nth-of-type(2)>ul>li:nth-of-type(2)>div:nth-of-type(4)")
    public WebElement General;

    @FindBy(xpath = "//*[@class = 'btn btn-sm o_filter_button active']")
    public WebElement Chat;


    @FindBy(xpath = "//*[@class = 'o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement Name;

}
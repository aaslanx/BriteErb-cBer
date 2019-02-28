package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePage {


    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // ELEMENTS

    @FindBy(xpath = "//div[@class='list-group']//a[2]")
    public WebElement briteErpDemoButton;

    @FindBy(css = "input#login")
    public WebElement email_box;

    @FindBy(css = "input#password")
    public WebElement password_box;

    @FindBy(xpath = "//button[@type='submit']")
    //CSS would look like: div.clearfix.oe_login_buttons>button (where button is a child)
    public WebElement logInButton;

    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li[4]/a/span")
    public WebElement contactsButton;

    @FindBy(css = "input.o_searchview_input")
    public WebElement searchBox;

    @FindBy (xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox2;

    @FindBy(css = "div.o_searchview>input")
    public WebElement searchButton;

    @FindBy(css = "div.o_searchview_facet")
    public WebElement searchName;

    //==========================================================NATA's ELEMENTS=================================================

    @FindBy(xpath = "//html/body/div/div[2]/div/ol/li")
    public WebElement headerOfAPage;

    @FindBy(xpath = "//html/body//../../..//../span[text()='ASUSTeK, ephrem ketema']")
    public WebElement contactEphrem;

    @FindBy(xpath = "//*[@class='o_field_char o_field_widget o_required_modifier']")
    public WebElement contactInfo;

    @FindBy(xpath = "(//div[@class='o_group']/table)[2]/tbody/tr[3]/td[2]/div/button")
    public WebElement envelope;

    @FindBy(tagName = "h4")
    public WebElement headerSendSMS;

    @FindBy(xpath = "//*[@class='o_input']")
    public WebElement typeMessage;

    @FindBy(xpath = "//*[@class='btn btn-sm oe_highlight']")
    public WebElement send;

    @FindBy(xpath = "//*[@class='o_dialog_warning modal-body']")
    public WebElement dialogWarning;

    @FindBy(xpath = "//span[text()='ASUSTeK, Joseph Walters']")
    public WebElement contactJoseph;

    @FindBy(xpath = "//*[@class='o_field_email o_field_widget o_form_uri o_text_overflow']")
    public WebElement emailJoseph;

    @FindBy(xpath = "//ul[3]/li[2]")
    public WebElement conversationBox;

    @FindBy(xpath = "//*[@class='o_mail_navbar_dropdown_top']")
    public WebElement mailDropdown;

    @FindBy(xpath = "(//div[@class='o_channel_title'])[4]")
    public WebElement SalesManager4;

    @FindBy(xpath = "//*[@class='o_chat_title']")
    public WebElement conversationOpens;

    @FindBy(css = "div.o_composer_container>div>div>textarea")
    public WebElement writeSomething;

    @FindBy(css = "div.navbar-collapse.collapse>ul>li:nth-of-type(4)>a>span")
    public WebElement ContactsHeader;

    //    TestCase1
//    @FindBy(xpath = "//div[@class='list-group']//a[2]")
//    public WebElement briteErpButton;
//
//    @FindBy(id = "login")
//    public WebElement eMail;
//
//    @FindBy(id = "password")
//    public WebElement password;
//
//    @FindBy(css = "div.clearfix.oe_login_buttons>button")
//    public WebElement loginButton;
//
//    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li[4]/a/span")
//    public WebElement contactsTopButton;


}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    // ELEMENTS

    @FindBy(xpath = "//div[@class='form-group field-login']/input")
    public WebElement emailBox;

    @FindBy(xpath = "//div[@class='form-group field-password']/input")
    public WebElement passwordBox;

    @FindBy(xpath = "//div[@class='clearfix oe_login_buttons']/button")
    public WebElement login_button;


    @FindBy(css = "div.list-group>a:nth-of-type(2)")
    public WebElement briteButton;


}

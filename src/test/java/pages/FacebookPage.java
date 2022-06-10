package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@placeholder='Email address or phone number']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;
    @FindBy(xpath = "(//*[text()='Log In'])[1]")
    public WebElement loginButton;
    @FindBy(xpath = "(//*[text()='Log in to Facebook'])[2]")
    public WebElement basarisizGirisMesaji;

}

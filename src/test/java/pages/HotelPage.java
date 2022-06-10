package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelPage {
    public HotelPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement loginButton;
    @FindBy(xpath = "//input[@class='form-control required']")
    public WebElement usernameTextBox;
    @FindBy(xpath = "//input[@class='form-control required password']")
    public WebElement passwordTextBox;
    @FindBy(id="btnSubmit")
    public WebElement loginButton2;
    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement managementButton;
    @FindBy(xpath = "//a[@href='/admin/HotelRoomAdmin']")
    public WebElement hotelRoomsButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div[3]/div/div/div[1]/div[2]/a/span")
    public WebElement addRoomButton;
}

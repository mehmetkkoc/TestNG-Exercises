package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebDriverUni {
    public WebDriverUni(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[text()='Hover Over Me First!']")
    public WebElement HoverOverMeFirst;

    @FindBy(xpath="(//a[@class='list-alert'])[1]")
    public WebElement FirstLink1;
    @FindBy(xpath = "//*[text()='Click and Hold!']")
    public WebElement ClickAndHold;
    @FindBy(xpath = "//div[@id='click-box']")
    public WebElement ClickAndHoldSonuc;
    @FindBy(xpath = "//*[@id='double-click']")
    public WebElement DoubleClick;
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement DropDown;

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@data-asin='B008TMIO2M']")
    public WebElement ilkUrun;
    @FindBy(xpath = "//*[text()='USD - U.S. Dollar']")
    public WebElement paraBirimi;
}

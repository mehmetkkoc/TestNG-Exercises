package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuappPage {

    public HerokuappPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='LambdaTest.txt']")
    public WebElement LambdaTest;

    @FindBy(xpath ="//*[text()='File Download']" )
    public WebElement FileDownload;
    @FindBy(xpath = "//*[text()='File Upload']")
    public WebElement FileUpload;
    @FindBy(id = "file-upload")
    public WebElement ChooseButton;
    @FindBy(id = "file-submit")
    public WebElement UploadButton;
    @FindBy(tagName = "h3")
    public WebElement UploadResult;
}

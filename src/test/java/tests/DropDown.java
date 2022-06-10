package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class DropDown {

    AmazonPage amazonPage=new AmazonPage();
    @Test
    public void test01() {

        //amazon gi din
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //2 Arama kutusunun solundaki drop down menuyu handle edip listesini ekrana yazdırın
        Select options=new Select(amazonPage.DropDown);
        List<WebElement> ddMenu=options.getOptions();
        for (WebElement each:ddMenu
             ) {
            System.out.print(each.getText()+" ");

        }

        //3 drop down menude 28 eleman olduğunu doğrulayın
        int expectedDDAdet=28;
        int actualDDAdet=ddMenu.size();
        Assert.assertEquals(expectedDDAdet,actualDDAdet);
        Driver.closeDriver();

    }
}

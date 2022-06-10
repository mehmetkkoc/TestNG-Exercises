package tests;

import org.testng.annotations.Test;
import pages.WebDriverUni;
import utilities.Driver;

public class Actions {

    WebDriverUni webDriverUni=new WebDriverUni();
    @Test
    public void test01() {

        //--"http://webdriveruniversity.com/Actions" sayfasina gidin
        Driver.getDriver().get("http://webdriveruniversity.com/Actions");
        //Hover over Me First" kutusunun ustune gelin
        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(Driver.getDriver());
        actions.moveToElement(webDriverUni.HoverOverMeFirst).perform();
        //Link 1" e tiklayin
        webDriverUni.FirstLink1.click();
        //P opup mesajini yazdirin
        System.out.println(Driver.getDriver().switchTo().alert().getText());
        //P opup'i tamam diyerek kapatin
        Driver.getDriver().switchTo().alert().accept();
        //--“Click and hold" kutusuna basili tutun
        actions.clickAndHold(webDriverUni.ClickAndHold).perform();
        //--“Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(webDriverUni.ClickAndHoldSonuc.getText());
        //--“Double click me" butonunu cift tiklayin
        actions.doubleClick(webDriverUni.DoubleClick);
        Driver.closeDriver();

    }
}

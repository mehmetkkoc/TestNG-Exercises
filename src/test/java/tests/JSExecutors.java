package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class JSExecutors {

    AmazonPage amazonPage=new AmazonPage();
    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",amazonPage.paraBirimi);
        jse.executeScript("arguments[0].click()",amazonPage.paraBirimi);

    }
}

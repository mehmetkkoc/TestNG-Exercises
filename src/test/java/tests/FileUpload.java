package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuappPage;
import utilities.ConfigReader;
import utilities.Driver;

public class FileUpload {

    HerokuappPage herokuapp=new HerokuappPage();
    @Test
    public void test01() throws InterruptedException {

        //https://the internet.herokuapp.com/upload adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("heroUrl"));
        herokuapp.FileUpload.click();
        //chooseFile butonuna basalim
        String dosyaYolu="C:\\Users\\Mehmet\\Downloads\\LambdaTest.txt";
        herokuapp.ChooseButton.sendKeys(dosyaYolu);


        Thread.sleep(2000);

        //Yuklemek istediginiz dosyayi sec elim

        //Upload butonuna bas alim
        herokuapp.UploadButton.click();

        //6.“File Uploaded!” textinin goruntulendigini test edelim
        Assert.assertTrue(herokuapp.UploadResult.isDisplayed());
        Driver.closeDriver();

    }
}

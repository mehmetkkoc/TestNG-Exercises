package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenShot {

    AmazonPage amazonPage=new AmazonPage();
    @Test
    public void test01() throws IOException, InterruptedException {

        //amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //amazon anasayfaya gittiginizi test edin ve tum sayfanin goruntusunu kaydedin
        TakesScreenshot ts= (TakesScreenshot) Driver.getDriver();
        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String tarih=date.format(dtf);
        File tumSayfaResim=new File("target/ekranGoruntuleri/"+tarih+".jpeg");
        File geciciDosya=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciDosya,tumSayfaResim);


    }

    @Test
    public void test02() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //amazon anasayfaya gittiginizi test edin ve tum sayfanin goruntusunu kaydedin
        TakesScreenshot ts= (TakesScreenshot) Driver.getDriver();
        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String tarih=date.format(dtf);
        //Nutella icin arama yapin
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        //sonucun Nutella icerdigini test edin ve ilk urunun goruntusunu alin
        File ilkElementSS=new File("target/ekranGoruntuleri/"+tarih+".jpeg");
        File temp=amazonPage.ilkUrun.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(temp,ilkElementSS);
        Driver.closeDriver();

    }
}

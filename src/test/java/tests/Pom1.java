package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Pom1 {

    FacebookPage facebookPage=new FacebookPage();
    @Test
    public void test01() {

        //https://www.facebook.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        //POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        //Faker class’ini kullanarak email ve sifre degerlerini
        Faker faker = new Faker();
        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passwordTextBox.sendKeys(faker.internet().password());
        //yazdirip, giris butonuna basin
        facebookPage.loginButton.click();
        //Basarili giris yapilamadigini test edin

        Assert.assertTrue(facebookPage.basarisizGirisMesaji.isDisplayed());
    }
}

package tests;

import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebDriverUni;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Cookies {

    WebDriverUni webDriverUni=new WebDriverUni();
    @Test
    public void test01() {


        //Amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //tum cookie’leri listeleyin
        Set<Cookie> cookieList=Driver.getDriver().manage().getCookies();
        System.out.println(cookieList);

        //Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        Assert.assertTrue(cookieList.size()>5);
        //ismi i18n prefs olan cookie degerinin USD oldugunu test edin
        String value="";
        for (Cookie each:cookieList
             ) {
            if (each.getName().equals("i18n-prefs")){
                value=each.getValue();
            }

        }
        String expectedName="USD";
        Assert.assertEquals(value,expectedName);
        //ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
        Cookie cookie=new Cookie("en sevdigim cookie","cikolatali");
        Driver.getDriver().manage().addCookie(cookie);
        //eklediginiz cookie’nin sayfaya eklendigini test edin
        cookieList=Driver.getDriver().manage().getCookies();
        Assert.assertTrue(cookieList.contains(cookie));
        //ismi skin olan cookie’yi silin ve silindigini test edin
        Cookie aranan = null;
        for (Cookie each:cookieList
             ) {
            if (each.getName().equals("skin")){
                Driver.getDriver().manage().deleteCookie(each);
                aranan=each;
            }
        }
        cookieList=Driver.getDriver().manage().getCookies();
        Assert.assertFalse(cookieList.contains(aranan));
        //tum cookie’leri silin ve silindigini test edin
        Driver.getDriver().manage().deleteAllCookies();
        cookieList=Driver.getDriver().manage().getCookies();
        Assert.assertTrue(cookieList.size()==0);
        Driver.closeDriver();
    }
}

package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class WebTables {
    @Test
    public void test01() throws InterruptedException {

        //●https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //○Username : manager
        //○Password : Manager 1
        Driver.getDriver().get("https://www.hotelmycamp.com");
        Driver.getDriver().findElement(By.linkText("Log in")).click();
        org.openqa.selenium.interactions.Actions actions = new Actions(Driver.getDriver());
        WebElement username = Driver.getDriver().findElement(By.id("UserName"));
        actions.click(username).
                sendKeys("manager").
                sendKeys(Keys.TAB).
                sendKeys("Manager1!").
                sendKeys(Keys.ENTER).
                perform();
        Thread.sleep(2000);

        //○Tüm table body’sinin boyutunu(s utun sayisi ) bulun. /tbody
        List<WebElement> sutunBasliklariListesi=Driver.getDriver().findElements(By.xpath("//thead//tr[1]//th"));
        System.out.println("Sutun sayisi : "+sutunBasliklariListesi.size());
        //○Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        WebElement tumBody=Driver.getDriver().findElement(By.xpath("//tbody"));
        System.out.println(tumBody.getText());
        //●printRows(printRows() metodu oluşturun //tr
        //○table body’sinde bulunan toplam satir(row) sayısını bulun.
        List<WebElement> satir=Driver.getDriver().findElements(By.xpath("//tbody//tr"));
        System.out.println("satir sayisi : " + satir.size());
        //○Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        for (WebElement each:satir
             ) {
            System.out.println(each.getText());
        }
        //○4.satirdaki(row) elementleri konsolda yazdırın.
        System.out.println(satir.get(3).getText());

        // Email basligindaki tum elementleri(sutun) konsolda yazdırın.
        // once email basliginin kacinci sutunda oldugunu bulalim
        int sutunNo=0;
        for (int i = 0; i < sutunBasliklariListesi.size(); i++) {

            if (sutunBasliklariListesi.get(i).getText().equals("Email")){
                sutunNo=i+1;
            }
        }
        for (int i = 1; i < 8; i++) {
            System.out.println(Driver.getDriver().findElement(By.xpath("//tbody//tr[" + i + "]//td[" + sutunNo + "]")).getText());

        }
        Driver.closeDriver();

    }
}

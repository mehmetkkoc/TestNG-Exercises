package tests;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReadExcel {
    @Test
    public void test01() throws IOException {

        //1.satirdaki 2.hucreye gidelim ve yazdiralim
        String dosyaYolu = "src/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("Sayfa1");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(1);
        System.out.println(cell.toString());
        //1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
        String bireIki = cell.toString();
        System.out.println(bireIki);
        //2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
        row = sheet.getRow(1);
        String actualData1 = row.getCell(3).toString();
        String expectedData1 = "Kabil";
        Assert.assertEquals(actualData1, expectedData1);
        //Satir sayisini bulalim
        System.out.println("satir sayisi : " + (sheet.getLastRowNum() + 1));
        //Fiziki olarak kullanilan satir sayisini bulun

        //Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim
        Map<String, String> ulkeBaskent = new HashMap<>();
        for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
            for (int j = 0; j < 2; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                ulkeBaskent.put(row.toString(), cell.toString());
            }
        }
        Driver.closeDriver();
    }
}
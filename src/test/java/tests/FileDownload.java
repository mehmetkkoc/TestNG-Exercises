package tests;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuappPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownload {

    HerokuappPage herokuapp=new HerokuappPage();
    @Test
    public void test01() throws IOException, InterruptedException {

        //https://the-internet.herokuapp.com/download adresine gid elim
        Driver.getDriver().get(ConfigReader.getProperty("heroUrl"));
        herokuapp.FileDownload.click();
        //LamdaTest.txt dosyasını indir elim
        herokuapp.LambdaTest.click();
        //. D osyanın başarıyla indirilip indirilmediğini test edelim
        String dosyaYolu="C:\\Users\\Mehmet\\Downloads\\LambdaTest.txt";
        Thread.sleep(2000);
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}

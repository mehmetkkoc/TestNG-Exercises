package pages;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Pom2 {

    HotelPage hotelPage=new HotelPage();
    @Test
    public void test01(){

        //1. Tests packagenin altına class olusturun: D18_HotelRoomCreation
        //2. Bir metod olusturun: RoomCreateTest()
        //3. https://www.hotelmycamp.com adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        //4. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
        hotelPage.loginButton.click();
        //a. Username
        //: manager b. Password : Manager 1
        //5. Login butonuna tıklayın.
        hotelPage.usernameTextBox.sendKeys("manager");
        hotelPage.passwordTextBox.sendKeys("Manager1!");
        hotelPage.loginButton2.click();
        //6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
        hotelPage.addRoomButton.click();
         //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.

        //8. Save butonuna basin.
        //9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
        //10. OK butonuna tıklayın.
        //11. Hotel rooms linkine tıklayın.
        //12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..
    }
}

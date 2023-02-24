package JUNIT;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class upload extends Junit08 {

    //https://the-internet.herokuapp.com/upload adresine gidelim
    //chooseFile butonuna basalim
    //Yuklemek istediginiz dosyayi secelim.
    //Downloads'a indirdigimiz logo.png dosyasini yukleyelim



    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/upload");
        String dosyayolu=System.getProperty("user.home")+"/Downloads/logo.png";

        WebElement button=driver.findElement(By.id("file-upload"));
        button.sendKeys(dosyayolu);


    }

}

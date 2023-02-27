package mehmetwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class work17 extends testbase {

    @Test
    public void test01(){

        //2. https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
        //3. chooseFile butonuna basalim

        //4. Yuklemek istediginiz dosyayi secelim.
        String dosyayolu=System.getProperty("user.home")+"/Desktop/TheDelta.docx";
        driver.findElement(By.id("file-upload")).sendKeys(dosyayolu);

        //5. Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();
        //6. “File Uploaded!” textinin goruntulendigini test edelim.
        WebElement element= driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        Assert.assertTrue(element.isDisplayed());
    }



}

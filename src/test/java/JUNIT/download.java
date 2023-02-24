package JUNIT;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class download extends Junit08 {
    //2. https://the-internet.herokuapp.com/download adresine gidelim.
    //3. logo.png dosyasını indirelim
    //4. Dosyanın başarıyla indirilip indirilmediğini test edelim

    // dosya downloads'a inecegi icin dinamik dosya yolu olusturalim

    @Test
    public void test01(){
        driver.get(" https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[text()=\"logo.png\"]")).click();
        String dosyayolu=System.getProperty("user.home")+"/Downloads/logo.png";
        Assert.assertTrue(Files.exists(Paths.get(dosyayolu)));
    }
}

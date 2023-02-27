package mehmetwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class work15 extends testbase {

    @Test
    public void test01(){
        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get(" https://the-internet.herokuapp.com/download");
        //3. logo.png dosyasını indirelim
        driver.findElement(By.linkText("avatar.png")).click();
        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim
      String dosyayolu=System.getProperty("user.home")+ "/Downloads/avatar.png";
      boolean sonuç=Files.exists(Paths.get(dosyayolu));
        Assert.assertTrue(Files.exists(Paths.get(dosyayolu)));


    }
}

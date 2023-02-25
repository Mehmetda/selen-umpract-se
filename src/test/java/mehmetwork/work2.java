package mehmetwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class work2 extends testbase {
    @Test
    public void test01(){
        //1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get("https://the-internet.herokuapp.com/iframe ");
        WebElement yazı=driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        Assert.assertTrue(yazı.isEnabled());
        System.out.println(yazı.getText());
        //2 ) Bir metod olusturun: iframeTest
        //- “An IFrame containing….” textinin erisilebilir oldugunu test edin ve
        //konsolda yazdirin.
        //- Text Box’a “Merhaba Dunya!” yazin.
        WebElement ıframe= driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));

        driver.switchTo().frame(ıframe);
        WebElement kutu= driver.findElement(By.xpath("//body[@id='tinymce']"));
        kutu.sendKeys("merhaba dunya");
        bekle(2000);


        //- TextBox’in altinda bulunan “Elemental Selenium” linkini textinin
        //gorunur oldugunu dogrulayin ve konsolda yazdirin.
        driver.switchTo().defaultContent();
       WebElement link= driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
        Assert.assertTrue(link.isDisplayed());




    }
}

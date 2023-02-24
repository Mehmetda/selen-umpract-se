package JUNIT;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdown extends Junit08 {
    // https://the-internet.herokuapp.com/dropdown adresine gidin.
    //1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    //2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
    //3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    //4.Tüm dropdown değerleri(value) yazdırın
    //5. Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True ,
    //degilse False yazdırın.
    @Test
    public void test01() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement ddm= driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select select=new Select(ddm);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByIndex(2);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());
        List<WebElement> elementlerim=select.getOptions();
        for (WebElement each:elementlerim
             ) {
            System.out.println(each.getText());

        }
        int boyut=elementlerim.size();
        Assert.assertTrue(boyut==3);
        bekle(2000);



    }
}

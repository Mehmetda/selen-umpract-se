package mehmetwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class work12 extends testbase {
    @Test
    public void test01(){
//1- amazon gidin
        driver.get("https://www.amazon.com");
//2- Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
        WebElement ddm= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        List<WebElement>listem=select.getOptions();
        for (WebElement each:listem
             ) {
            System.out.println(each.getText());

        }
//3- dropdown menude 40 eleman olduğunu doğrulayın

        int sayı=40;
        int actuel= listem.size();
        Assert.assertFalse(sayı==actuel);
        System.out.println(actuel);

    }
}

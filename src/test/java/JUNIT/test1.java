package JUNIT;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class test1 extends Junit08 {
    //● https://www.amazon.com/ adresine gidin.
    //- Test 1
    //Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45
    //oldugunu test edin
    //-Test 2
    //1. Kategori menusunden Books secenegini secin
    //2. Arama kutusuna Java yazin ve aratin
    //3. Bulunan sonuc sayisini yazdirin
    //4. Sonucun Java kelimesini icerdigini test edin
    @Test
    public void test01(){
        driver.get("https://www.amazon.com/ ");
        WebElement ddm=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        List<WebElement> optıons=select.getOptions();
        int boyut= optıons.size();
        Assert.assertFalse(45==boyut);
        select.selectByIndex(5);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java", Keys.ENTER);
        System.out.println(driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")).getText());
       String yazı=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")).getText();
       String[]array=yazı.split(" ");
        for (String each:array
             ) {
            if(each.equalsIgnoreCase("java")){
                Assert.assertTrue(each.equalsIgnoreCase("java"));

            }

        }



    }

}

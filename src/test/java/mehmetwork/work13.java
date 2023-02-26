package mehmetwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class work13 extends testbase {
    @Test
    public void test01(){
        //1- dropdown menuden elektronik bölümü seçin
        driver.get("https://www.amazon.com");
        WebElement ddm= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        select.selectByIndex(10);
        //2- arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
        WebElement arama= driver.findElement(By.id("twotabsearchtextbox"));
        arama.sendKeys("iphone", Keys.ENTER);

        //3- sonuc sayisi bildiren yazinin iphone icerdigini test edin
        String yazı=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")).getText();
        String expected="iphone";
        Assert.assertTrue(yazı.contains(expected));
        //4- ikinci ürüne relative locater kullanarak tıklayin
        WebElement resim= driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
        driver.findElement(RelativeLocator.with(By.className("s-image")).toRightOf(resim)).click();
        //5- ürünün title'ni ve fiyatını variable’a assign edip ürünü sepete ekleyelim
        String fiyat=driver.findElement(By.xpath("//span[@class='a-size-base a-color-price']")).getText();
        System.out.println(fiyat);
        String marka=driver.findElement(By.xpath("(//span[@class='a-size-base po-break-word'])[1]")).getText();
        System.out.println(marka);
        driver.findElement(By.xpath("//a[@title='Add to List']")).click();


    }
}

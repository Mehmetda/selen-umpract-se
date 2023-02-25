package mehmetwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class work4 extends testbase {
    @Test
    public void test01(){
        //● Yeni bir class olusturun: WindowHandle
        //● Amazon anasayfa adresine gidin.
        driver.get("https://www.amazon.com");
        String window= driver.getWindowHandle();
        //● Sayfa’nin window handle degerini String bir degiskene atayin
        String windowhandle= driver.getWindowHandle();
        //● Sayfa title’nin “Amazon” icerdigini test edin
        String içerik="Amazon";
        String actueltitle= driver.getTitle();
        Assert.assertTrue(actueltitle.contains(içerik));
        //● Yeni bir tab olusturup, acilan tab’da wisequarter.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");
        //● Sayfa title’nin “wisequarter” icerdigini test edin
        içerik="wisequarter";
        actueltitle= driver.getTitle();
        Assert.assertFalse(actueltitle.contains(içerik));
        //● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.walmart.com");
        //● Sayfa title’nin “Walmart” icerdigini test edin
        içerik="walmart";
        actueltitle= driver.getTitle();
        Assert.assertFalse(actueltitle.contains(içerik));
        //● Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
        driver.switchTo().window(window);
        WebElement simge= driver.findElement(By.id("nav-logo-sprites"));
        Assert.assertTrue(simge.isDisplayed());


    }




}

package mehmetwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class work14 extends testbase {

    @Test
    public void test01(){

        //1- yeni bir sekme açarak amazon anasayfaya gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");

        //2-dropdown’dan bebek bölümüne secin
        WebElement ddm= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        select.selectByIndex(3);
        //3-bebek puset aratıp bulundan sonuç sayısını yazdırın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bebek puset", Keys.ENTER);
        System.out.println(driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")).getText());
        //4-sonuç yazsının puset içerdiğini test edin
        String yazı=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")).getText();
        Assert.assertTrue(yazı.contains("puset"));
        //5-üçüncü ürüne relative locater kullanarak tıklayin
        WebElement element= driver.findElement(By.xpath("//section[@aria-label='1 Star & Up']"));
        driver.findElement(RelativeLocator.with(By.className("s-image")).toRightOf(element)).click();
        //6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin
        System.out.println(driver.findElement(By.xpath("(//span[@class='a-size-base a-color-secondary'])[1]")).getText());
        driver.findElement(By.xpath("//a[@id='nav-cart']")).click();

    }
}

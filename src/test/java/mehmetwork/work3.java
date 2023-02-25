package mehmetwork;

import JUNIT.Junit08;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class work3 extends testbase {

    @Test
    public void test01(){
        //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");

        //2) sayfadaki iframe sayısını bulunuz.
        List<WebElement> listem=driver.findElements(By.tagName("iframe"));
        System.out.println(listem.size());
        //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        WebElement iframe=driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
        bekle(3000);
        //4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().defaultContent();
        //5) ikinci iframe'deki (Jmeter Made Easy) linke
        //(https://www.guru99.com/live-selenium-project.html) tıklayınız
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN);
        WebElement jmeter= driver.findElement(By.id("a077aa5e"));
        driver.switchTo().frame(jmeter);
        driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
        bekle(3000);



    }
}

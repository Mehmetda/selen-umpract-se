package JUNIT;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class junitsoru extends Junit08 {

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://html.com/tags/iframe/");
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        WebElement frame= driver.findElement(By.xpath("//iframe[@width='560']"));

        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
        // driver.switchTo().defaultContent();

         WebElement play= driver.findElement(By.xpath("//button[@title='Duraklat (k)']"));
        actions.moveToElement(play).perform();
        Assert.assertTrue(play.isEnabled());
        Thread.sleep(3000);


    }
    //1- Bir Class olusturalim KeyboardActions2
    //2- https://html.com/tags/iframe/ sayfasina gidelim

    //3- video'yu gorecek kadar asagi inin
    //4- videoyu izlemek icin Play tusuna basin
    //5- videoyu calistirdiginizi test edin


}

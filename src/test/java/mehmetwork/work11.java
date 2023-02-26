package mehmetwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class work11 extends testbase {
    @Test
    public void test01(){

        //2- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/ ");
        //3- video’yu gorecek kadar asagi inin
        Actions action=new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        //4- videoyu izlemek icin Play tusuna basin
        WebElement iframe= driver.findElement(By.xpath("//iframe[@width='560']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
        //5- videoyu calistirdiginizi test edin
        WebElement duraklat= driver.findElement(By.xpath("//button[@aria-label='Duraklat klavye kısayolu k']"));
        Assert.assertTrue(duraklat.isDisplayed());
    }
}

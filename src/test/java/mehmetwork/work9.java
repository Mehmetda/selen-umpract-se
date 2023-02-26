package mehmetwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class work9 extends testbase {
    @Test
    public void test01(){

        //2- https://www.amazon.com sayfasina gidelim
        driver.get(" https://www.amazon.com");
        //3- Arama kutusuna actions method’larine kullanarak Samsung A71 yazdirin ve
        //Enter’a basarak arama yaptirin
        WebElement arama=driver.findElement(By.id("twotabsearchtextbox"));

        arama.sendKeys("Samsung A71",Keys.ENTER);
        //4- aramanin gerceklestigini test edin
        WebElement yazı= driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        Assert.assertTrue(yazı.isDisplayed());
    }
}

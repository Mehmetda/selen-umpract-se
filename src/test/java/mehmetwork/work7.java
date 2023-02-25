package mehmetwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class work7 extends testbase {
    @Test
    public void test01(){

        //1- https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");
        //2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        WebElement dragme= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropme= driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        Actions action=new Actions(driver);
        action.dragAndDrop(dragme,dropme).perform();
        //3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
        WebElement dropped= driver.findElement(By.xpath("//p[text()='Dropped!']"));
        Assert.assertTrue(dropped.isDisplayed());
    }
}

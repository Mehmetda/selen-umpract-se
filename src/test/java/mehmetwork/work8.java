package mehmetwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class work8 extends testbase {

    @Test
    public void test01(){
        //1- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin
        //mouse’u bu menunun ustune getirin
        WebElement element= driver.findElement(By.xpath("//span[text()='Account & Lists']"));
        Actions action=new Actions(driver);
        action.moveToElement(element).perform();

        //3- “Create a list” butonuna basin
        driver.findElement(By.xpath("//span[text()='Create a List']")).click();
        //4- Acilan sayfada “Your Lists” yazisi oldugunu test edin
        WebElement yazı= driver.findElement(By.xpath("//div[@role='heading']"));
        Assert.assertTrue(yazı.isDisplayed());



    }
}

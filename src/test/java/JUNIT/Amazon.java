package JUNIT;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Amazon extends Junit08 {
    @Test
    public void test01(){

        driver.get("https://www.amazon.com");
        Actions action=new Actions(driver);
        WebElement liste= driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
        action.moveToElement(liste).perform();
        driver.findElement(By.xpath("//span[text()='Create a List']")).click();
        WebElement yazı= driver.findElement(By.xpath("//div[@role='heading']"));
        Assert.assertTrue(yazı.isDisplayed());
    }
}

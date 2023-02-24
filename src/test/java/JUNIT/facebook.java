package JUNIT;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class facebook extends Junit08 {

    @Test
    public void test01(){
        Faker fake=new Faker();
        Actions actions=new Actions (driver);

        driver.get("https:\\www.facebook.com");
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        WebElement isimkutusu=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        actions.click(isimkutusu).sendKeys(fake.name().firstName()).sendKeys(Keys.TAB).sendKeys(fake.name().

                lastName()).sendKeys(Keys.TAB).perform();

    }
}

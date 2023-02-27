package mehmetwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class work18 extends testbase {
    @Test
    public void test01(){

   //2. Iki tane metod olusturun : implicitWait() , explicitWait()
        //Iki metod icin de asagidaki adimlari test edin.
        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //4. Remove butonuna basin.
        driver.findElement(By.xpath("(//button[@autocomplete='off'])[1]")).click();
        //5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
        WebElement element= driver.findElement(By.xpath("//p[@id='message']"));
        Assert.assertTrue(element.isDisplayed());
        //6. Add buttonuna basin
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
        //7. It’s back mesajinin gorundugunu test edin
        WebElement tuş= driver.findElement(By.xpath("//p[@id='message']"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(tuş));

        Assert.assertTrue(tuş.isDisplayed());
    }
}

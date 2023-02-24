package JUNIT;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class test2 extends Junit08 {

    @Test
    public void test01(){
        //1. http://zero.webappsecurity.com/ Adresine gidin
        driver.get(" http://zero.webappsecurity.com/ ");
        //2. Sign in butonuna basin
        //3. Login kutusuna “username” yazin
        //4. Password kutusuna “password.” yazin
        //5. Sign in tusuna basin
        //6. Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.id("pay_bills_link")).click();
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.id("pay_bills_link")).click();
        driver.findElement(By.linkText("Purchase Foreign Currency")).click();
        WebElement ddm= driver.findElement(By.id("pc_currency"));
        Select select=new Select(ddm);
        select.selectByIndex(6);
        driver.findElement(By.id("pc_amount")).sendKeys("100");
        WebElement dolar= driver.findElement(By.id("pc_inDollars_true"));
        Assert.assertFalse(dolar.isSelected());
        driver.findElement(By.id("pc_inDollars_false")).click();
        driver.findElement(By.id("pc_calculate_costs")).click();

        driver.findElement(By.id("purchase_cash")).click();
        WebElement yazı= driver.findElement(By.id("alert_content"));
        Assert.assertTrue(yazı.isDisplayed());

        bekle(3000);



        //driver.findElement(By.linkText("Purchase Foreign Currency")).click();

        //7. “Purchase Foreign Currency” tusuna basin
        //8. “Currency” drop down menusunden Eurozone’u secin

        //9. “amount” kutusuna bir sayi girin
        //10. “US Dollars” in secilmedigini test edin
        //11. “Selected currency” butonunu secin
        //12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
        //13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini
        //kontrol edin.




    }

}

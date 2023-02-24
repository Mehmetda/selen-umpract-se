package JUNIT;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static java.awt.SystemColor.window;

public class junit09 extends Junit08 {

    @Test
    public void test01() throws InterruptedException {

        /* ...Exercise3...
    go to url : https://www.techlistic.com/p/selenium-practice-form.html
    fill the firstname
    fill the lastname
    check the gender
    check the experience
    fill the date
    choose your profession -> Automation Tester
    choose your tool -> Selenium Webdriver
    choose your continent -> Antartica
    choose your command  -> Browser Commands
    click submit button
 */



        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("mehmet");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("dağ");
        //JavascriptExecutor js = (JavascriptExecutor) sürücüsü;js.executeScript (Komut Dosyası, Bağımsız Değişkenler);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,675.5555419921875)");
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        driver.findElement(By.xpath("//input[@id='exp-2']")).click();
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("15.12.2023");
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        WebElement ddm= driver.findElement(By.xpath("//select[@id='continents']"));
        Select select=new Select(ddm);
        select.selectByIndex(6);
        driver.findElement(By.xpath("(//option[@style='margin: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px;'])[8]")).click();
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(3000);




    }




}

package mehmetwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Set;

public class work6 extends testbase {

    @Test
    public void test01(){
        //1- Yeni bir class olusturalim: MouseActions1
        //2- https://the-internet.herokuapp.com/context_menu sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");
        String handle1= driver.getWindowHandle();
        //3- Cizili alan uzerinde sag click yapin
        WebElement çizik= driver.findElement(By.id("hot-spot"));
        Actions action=new Actions(driver);
        action.contextClick(çizik).perform();

        //4- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
        String expected="You selected a context menu";
        String actuel= driver.switchTo().alert().getText();
        Assert.assertTrue(expected.equals(actuel));


        //5- Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();
        //6- Elemental Selenium linkine tiklayalim
        driver.findElement(By.linkText("Elemental Selenium")).click();
        //7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
        String handle2="";
        Set<String> setim=driver.getWindowHandles();
        for (String each:setim
             ) {
            if(!each.equals(handle1)){
                handle2=each;
            }

        }
        driver.switchTo().window(handle2);
        WebElement yazı= driver.findElement(By.xpath("//h1[text()='Elemental Selenium']"));
        Assert.assertTrue(yazı.isDisplayed());


    }



}

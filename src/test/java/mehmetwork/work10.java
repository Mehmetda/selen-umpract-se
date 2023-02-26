package mehmetwork;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class work10 extends testbase {

    @Test
    public void test01(){

       //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
        //2- Hover over Me First" kutusunun ustune gelin
        WebElement element = driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
        Actions action=new Actions(driver);
        action.moveToElement(element).perform();


        //3- Link 1" e tiklayin
        driver.findElement(By.xpath("(//div[@class='dropdown-content'])[1]")).click();
        //4- Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());
        //5- Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
        //6- “Click and hold" kutusuna basili tutun
        WebElement element1= driver.findElement(By.id("click-box"));
        action.clickAndHold(element1);


        //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(driver.findElement(By.id("click-box")).getText());
        //8- “Double click me" butonunu cift tiklayin

        WebElement çift= driver.findElement(By.xpath("//h2[text()='Double Click Me!']"));
        action.doubleClick(çift);
    }
}

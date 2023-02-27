package work2;

import mehmetwork.testbase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class work22 extends testbase {

    @Test
    public void test01(){
        //1."https://www.amazon.com" adresine gidin
        driver.get("https://www.amazon.com");
        //2.Sayfanin en altina inin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        bekle(2000);
        //3.Web table tum body’sini yazdirin
        WebElement table= driver.findElement(By.xpath("//table[@class='navFooterMoreOnAmazon']"));
        System.out.println(table.getText());

        //4.Web table’daki satir sayisinin 9 oldugunu test edin
        List<WebElement> row=driver.findElements(By.xpath("//tbody/tr"));
        Assert.assertTrue(row.size()==9);
        //5.Tum satirlari yazdirin
        //6. Web table’daki sutun sayisinin 13 olduğunu test edin
        //7. 5.sutunu yazdirin
        //8.Satir ve sutun sayisini parametre olarak alip, hucredeki bilgiyi
        //döndüren bir method olusturun




    }
}

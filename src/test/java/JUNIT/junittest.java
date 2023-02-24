package JUNIT;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class junittest extends Junit08 {

    //- Test 1
    //Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45
    //oldugunu test edin

    @Test
    public void test01(){


            driver.get(" https://www.amazon.com");
           WebElement ddm=driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"));
            Select select=new Select(ddm);
            List <WebElement> optionlist=select.getOptions();
            System.out.println(optionlist.size());
            Assert.assertTrue(45==optionlist.size());


        }



}

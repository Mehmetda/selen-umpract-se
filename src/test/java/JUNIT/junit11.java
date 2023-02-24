package JUNIT;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class junit11 extends Junit08 {

    // .......Exercise5........
    //
    //Navigate to website https://testpages.herokuapp.com/styled/index.html
    @Test
    public void test01(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        String handle1= driver.getWindowHandle();
// Under the ORIGINAL CONTENTS
        // click on Alerts
driver.findElement(By.xpath("//a[@id='alerts']")).click();
        //print the URL
        Set<String> handles=driver.getWindowHandles();
        String handle2="";
        for (String each:handles
             ) {
            if(!each.equals(handle1)){
                handle2=each;

            }

        }
        driver.switchTo().window(handle2);
        System.out.println(driver.getCurrentUrl());


        //navigate back
        driver.navigate().back();
        // print the URL
        System.out.println(driver.getCurrentUrl());
        //Click on Basic Ajax
        String handle3= driver.getWindowHandle();
        driver.findElement(By.id("basicajax")).click();
        //print the URL
        Set<String> handles2=driver.getWindowHandles();
        for (String each:handles2
        ) {
            if(!each.equals(handle3)){
                handle2=each;

            }

        }
        driver.switchTo().window(handle2);
        System.out.println(driver.getCurrentUrl());

        // enter value 20 and ENTER
        driver.findElement(By.id("lteq30")).sendKeys("20", Keys.ENTER);
        //and then verify Submitted Values is displayed open page
        Set<String> handles3=driver.getWindowHandles();
        for (String each:handles3
        ) {
            if(!each.equals(handle3)){
                handle2=each;

            }
            driver.switchTo().window(handle2);

        }
        WebElement values1=driver.findElement(By.id("_valueid"));
        WebElement values2=driver.findElement(By.id("_valuelanguage_id"));
        WebElement values3=driver.findElement(By.id("_valuesubmitbutton"));
        Assert.assertTrue(values1.isDisplayed());
        Assert.assertTrue(values2.isDisplayed());
        Assert.assertTrue(values3.isDisplayed());



        //close driver
    }







}

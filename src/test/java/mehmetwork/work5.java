package mehmetwork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class work5 extends testbase {

    @Test
    public void test01(){
        //● Tests package’inda yeni bir class olusturun: WindowHandle2
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        String handle1= driver.getWindowHandle();
        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement yazı= driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
       String expected="Opening a new window";
       String actuel= yazı.getText();
        Assert.assertTrue(expected.equals(actuel));
        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
         actuel= driver.getTitle();
        Assert.assertTrue("The Internet".equals(actuel));
        //● Click Here butonuna basın.
        driver.findElement(By.linkText("Click Here")).click();
        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu
        //dogrulayin.
        Set <String> setim=driver.getWindowHandles();
        String handle2="";
        for (String each:setim
             ) {
            if(!handle1.equals(each)){
                handle2=each;
            }

        }
        driver.switchTo().window(handle2);
        actuel= driver.getTitle();
        expected="New Window";
        Assert.assertTrue(expected.equals(actuel));


        //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        WebElement yazı3= driver.findElement(By.xpath("//h3[text()='New Window']"));
        actuel= yazı3.getText();
        Assert.assertTrue(expected.equals(actuel));
        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet”
        //olduğunu doğrulayın.
        driver.navigate().back();

        actuel= driver.getTitle();
        expected="The Internet";
        Assert.assertFalse(expected.equals(actuel));
        System.out.println(actuel);


    }
}

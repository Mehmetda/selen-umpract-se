package JUNIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.time.Duration;

public class Junit07 {
    static WebDriver driver;
   // a. Verilen web sayfasına gidin.
   //https://the-internet.herokuapp.com/checkboxes
    @Test
    public  void test01(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }
   //b. Checkbox1 ve checkbox2 elementlerini locate edin.
   //c. Checkbox1 seçili değilse onay kutusunu tıklayın
    @Test
    public void test02(){
        WebElement checkbox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if(!(checkbox1.isSelected())){
            checkbox1.click();
        }
    }
    //d. Checkbox2 seçili değilse onay kutusunu tıklayın

    @Test
    public void test03(){
        WebElement checkbox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if(!(checkbox2.isSelected())){
            checkbox2.click();
        }
    }
    @BeforeClass
    public static void setup(){
        WebDriverManager .chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void teardown(){
        driver.close();
    }

}

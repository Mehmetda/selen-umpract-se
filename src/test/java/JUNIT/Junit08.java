package JUNIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Junit08 {
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void teardown(){
        driver.close();
    }
    public void bekle(int sayı){

        try {
            Thread.sleep(sayı);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //a. Verilen web sayfasına gidin.
    //https://facebook.com

    // b. Cookies’i kabul edin
    //c. Create an account buton’una basin
    // d. Radio button elementlerini locate edin ve size uygun olani secin

}

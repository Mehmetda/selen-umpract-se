package JUNIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class junıt01 {
    @Test
    public  void test01(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com");
        driver.close();

    }
    @Test
    public void test02(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
        driver.close();


    }



        // 1) Bir class oluşturun: BestBuyAssertions
        //2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak
        // asagidaki testleri yapin
       //○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
        //○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
        //○ logoTest => BestBuy logosunun görüntülendigini test edin
        //○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin










}

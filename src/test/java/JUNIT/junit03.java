package JUNIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class junit03 {
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01(){

        driver.get("https://www.bestbuy.com");
        String url= driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.bestbuy.com/");

    }
    @Test
    public void test02(){

        String başlık=driver.getTitle();
        Assert.assertFalse(başlık.contains("Rest"));

    }
    @AfterClass
    public static void teardown(){
        driver.close();



    }
    //2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak
    //asagidaki testleri yapin
//○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin

    // ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
//○ logoTest => BestBuy logosunun görüntülendigini test edin
    @Test

    public void test03(){
        WebElement logo= driver.findElement(By.xpath("(//img[@src='https://www.bestbuy.com/~assets/bby/_com/header-footer/images/bby_logo-a7e90594729ed2e119331378def6c97e.png'])[1]"));
Assert.assertTrue(logo.isDisplayed());

    }
//○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
}

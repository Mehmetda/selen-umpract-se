import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class selenıum05 {
    public static void main(String[] args) {
        //1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        // (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi
        //yazdirin.
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");
        String expectedtitle="facebook";
        String actueltitle=driver.getTitle();
        if(expectedtitle.equalsIgnoreCase(actueltitle)){
            System.out.println("test passed");
        }
        else{
            System.out.println("test faıled");
            System.out.println(actueltitle);
        }
        // 3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
        //“actual” URL’i yazdirin.
        String expectedurl="facebook";
        String actuelurl= driver.getCurrentUrl();
        if(actuelurl.contains(expectedurl)){
            System.out.println("test passed");
        }
        else{
            System.out.println("test faıled");
            System.out.println(actuelurl);
        }
        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");
        //  5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedtitle1="Walmart.com";
        String actueltitle1= driver.getTitle();
        if(actueltitle1.contains(expectedtitle)){
            System.out.println("test passed");
        }
        // 6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        // 9.Browser’i kapatin
        driver.close();

    }
}

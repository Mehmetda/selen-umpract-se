import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class selenium01 {
    public static void main(String[] args) {
       // 1. Yeni bir package olusturalim :
      // 2. Yeni bir class olusturalim : C03_GetMethods
       // 3. Amazon sayfasina gidelim. https://www.amazon.com/
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://www.amazon.com/");

       // 4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        //  5. Sayfa basliginin “Amazon” icerdigini test edin
        String expected="Amazon";
        String actuel=driver.getTitle();
        if(actuel.contains(expected)){
            System.out.println("TEST PASSED");
        }
        else{
            System.out.println("test faıled");
        }
       // 6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        // 7. Sayfa url’inin “amazon” icerdigini test edin.
        String expectedurl="amazon";
        String actuelurl=driver.getCurrentUrl();
        if(actuelurl.contains(expectedurl)){
            System.out.println("TEST PASSED");
        }
        else{
            System.out.println("TEST FAILED");
        }

       // 8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String expectedhtml="alışveriş";
        String htmlkod=driver.getPageSource();
        if(htmlkod.contains(expectedhtml)){
            System.out.println("TEST PASSED");
        }
        else{
            System.out.println("TEST FAILED");
        }
       // 10. Sayfayi kapatin.
        driver.close();

    }
}

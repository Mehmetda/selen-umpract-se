import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenıum06 {
    public static void main(String[] args) {
        //1. Yeni bir class olusturun (TekrarTesti)
        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.youtube.com");
        String expected="youtube";
        String actuel=driver.getTitle();
        if(expected.equals(actuel)){
            System.out.println("test passed");
        }
        else{
            System.out.println("test faıled");
            System.out.println(actuel);
        }
        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        // doğru URL'yi yazdırın.
        String expected1="youtube";
        String actuel1=driver.getCurrentUrl();
        if(actuel1.contains(expected1)){
            System.out.println("test passed");
        }
        else{
            System.out.println("test faıled");
            System.out.println(actuel1);
        }

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        // 8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        String expected2="amazon";
        String actuel2=driver.getTitle();
        if(actuel2.contains(expected2)){
            System.out.println("test passed");
        }
        else{
            System.out.println("test faıled");
            System.out.println(actuel2);
        }
        // Yoksa doğru başlığı(Actual Title) yazdırın.
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse
        //doğru URL'yi yazdırın
        String expectedurl="https://www.amazon.com";
        String actuelurl=driver.getCurrentUrl();
        if(actuelurl.equals(expectedurl)){
            System.out.println("test passed");
        }
        else{
            System.out.println("test faıled");
            System.out.println(actuelurl);
        }
        //11.Sayfayi kapatin
        driver.close();
    }
}

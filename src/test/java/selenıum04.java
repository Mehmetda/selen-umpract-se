import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class selenıum04 {
    public static void main(String[] args) {
        //1. Yeni bir Class olusturalim.C07_ManageWindowSet
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(45,56));
        driver.manage().window().setSize(new Dimension(35,56));

        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //8. Sayfayi kapatin
        driver.close();
    }
}

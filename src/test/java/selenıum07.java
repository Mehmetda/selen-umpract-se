import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class selenıum07 {
    public static void main(String[] args) throws InterruptedException {
        //Amazon Arama Testi
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.amazon.com adresine gidin
        driver.get("https://www.amazon.com");
        //3- amazon arama kutusunu locate edin
        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("Nutella", Keys.ENTER);
        //4- arama kutusuna “Nutella” yazdirin
        //5- arama islemini yapabilmek icin ENTER tusuna basin
        Thread.sleep(5000);
        driver.close();

    }
}

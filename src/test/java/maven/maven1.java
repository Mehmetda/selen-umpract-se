package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class maven1 {
    public static void main(String[] args) {
        //1- https://www.amazon.com/ sayfasina gidelim
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");


        //2- arama kutusunu locate edelim
        WebElement aramakutusu=driver.findElement(By.xpath("//input[@type='text']"));
        // 3- “Samsung headphones” ile arama yapalim
        aramakutusu.sendKeys("Samsung headphones", Keys.ENTER);
        // 4- Bulunan sonuc sayisini yazdiralim
        System.out.println(driver.findElement(By.xpath("//span[text()='1-16 of 231 results for']")).getText());
        //5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//img[@src='https://m.media-amazon.com/images/I/51O0iIuohnL._AC_UY218_.jpg'])[1]")).click();
        //6- Sayfadaki tum basliklari yazdiralim
        List<WebElement> listem=driver.findElements(By.className("nav-a"));
        int numara=1;
        for (WebElement each:listem
             ) {
            System.out.println(numara+"----------"+each.getText());
            numara++;

        }
        driver.close();
    }
}

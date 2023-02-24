import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class selenıum09 {
    public static void main(String[] args) throws InterruptedException {
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com");
        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> listem=driver.findElements(By.tagName("a"));
        int expectedLinkSayisi=147;
        int actualLinkSayisi= listem.size();
        if(expectedLinkSayisi==actualLinkSayisi){
            System.out.println("test passed");

        }
        else{
            System.out.println("test faıled");
            System.out.println(actualLinkSayisi);
        }
        //4- Products linkine tiklayin
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();

        //5- special offer yazisinin gorundugunu test edin
        WebElement specıaloffer=driver.findElement(By.xpath("//*[@id='sale_image']"));
        if(specıaloffer.isDisplayed()){
            System.out.println("test passed");
        }
        else{
            System.out.println("test faıled");
        }

        //6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }
}

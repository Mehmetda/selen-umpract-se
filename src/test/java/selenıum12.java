import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class selenıum12 {
    public static void main(String[] args) {
        //1- bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
        // 3- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectediçerik="Spend less";
        String actueliçerik=driver.getTitle();
        if(actueliçerik.contains(expectediçerik)){
            System.out.println("test passed");
        }
        else{
            System.out.println("test faıled");
        }
        //6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
        //7- Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday']")).click();
        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();
        //9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement ücret=driver.findElement(By.id("gc-live-preview-amount-container"));
        if(ücret.getText().equals("25$")){
            System.out.println("test passed");
        }
        else {
            System.out.println("test faıled");
            System.out.println(ücret.getText());
        }
        //11-Sayfayi kapatin
        driver.close();




    }
}

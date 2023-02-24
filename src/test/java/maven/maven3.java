package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.spec.RSAPrivateCrtKeySpec;
import java.time.Duration;

public class maven3 {
    public static void main(String[] args) {
       // 2- https://www.google.com/ adresine gidin
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com");


        //3- cookies uyarisini kabul ederek kapatin
        // 4- Sayfa basliginin “Google” ifadesi icerdigini test edin

        String expected="google";
        String actuel=driver.getTitle();
        if(actuel.contains(expected)){
            System.out.println("test passed");
        }
        else{
            System.out.println("test faıled");
        }
        // 5- Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("nutella", Keys.ENTER);
        //6- Bulunan sonuc sayisini yazdirin
        WebElement sonuç=driver.findElement(By.id("result-stats"));
        System.out.println(driver.findElement(By.id("result-stats")).getText());
        // 7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String yazı=sonuç.getText();
        String[]dizim=yazı.split(" ");
        String sayı=dizim[1];
        sayı=sayı.replaceAll("\\D","");

        Double ram=Double.parseDouble(sayı);
       if(ram>=10000000){
           System.out.println("test passed");
       }
       else{
           System.out.println("test faıled");
       }

        //8- Sayfayi kapatin
        driver.close();
    }
}

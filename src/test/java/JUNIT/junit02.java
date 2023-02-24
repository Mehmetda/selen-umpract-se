package JUNIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class junit02 {

    public static void main(String[] args) {

        //1. “https://www.saucedemo.com” Adresine gidin
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.saucedemo.com");
        //2. Username kutusuna “standard_user” yazdirin
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
        //3. Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
        // 4. Login tusuna basin
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        System.out.println(driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText());
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();


        //6. Add to Cart butonuna basin
        driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).click();
        //7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        // 8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement remove=driver.findElement(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));
        if(remove.isDisplayed()){
            System.out.println("sepete eklendi");
        }
        //9. Sayfayi kapatin
        driver.close();

        

    }
}

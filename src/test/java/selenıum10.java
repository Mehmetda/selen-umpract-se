import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class selenıum10 {
    public static void main(String[] args) throws InterruptedException {
        //1- https://www.amazon.com/ sayfasına gidin.
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        //2- Arama kutusuna “city bike” yazip aratin
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("city bike", Keys.ENTER);
        //3- Görüntülenen sonuçların sayısını yazdırın
        WebElement sayı=driver.findElement(By.xpath("//span[text()='1-16 of 100 results for']"));
        System.out.println(sayı.getText());
        //4- Listeden ilk urunun resmine tıklayın.
        driver.findElement(By.xpath("(//img[@class='s-image'])[3]")).click();
        Thread.sleep(3000);
        driver.close();







    }
}

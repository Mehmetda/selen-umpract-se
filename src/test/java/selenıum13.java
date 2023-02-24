import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class selenıum13 {
    public static void main(String[] args) {
       // 1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html
        // adresine gidin
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        // 2 ) Berlin’i 3 farkli relative locator ile locate edin
        WebElement nyc=driver.findElement(By.xpath("//img[@id='pid3_thumb']"));
        WebElement bayaleca=driver.findElement(By.xpath("//img[@id='pid8_thumb']"));
        WebElement boston=driver.findElement(By.xpath("//img[@id='pid6_thumb']"));
        WebElement sailor=driver.findElement(By.xpath("//img[@id='pid11_thumb']"));
        WebElement berlin1=driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).above(sailor));
        WebElement berlin2=driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).toRightOf(boston));
        WebElement berlin3=driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).below(nyc));
        WebElement berlin4=driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).toLeftOf(bayaleca));




        // 3 ) Relative locator’larin dogru calistigini test edin
        System.out.println(berlin1.getAttribute("id"));
        System.out.println(berlin2.getAttribute("id"));
        System.out.println(berlin3.getAttribute("id"));
        System.out.println(berlin4.getAttribute("id"));
        driver.close();
    }
}

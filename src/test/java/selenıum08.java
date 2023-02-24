import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class selenıum08 {
    public static void main(String[] args) {
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com");
        //3- Category bolumundeki elementleri locate edin
        List<WebElement> listem=driver.findElements(By.className("panel-title"));
        //4- Category bolumunde 3 element oldugunu test edin
        if(listem.size()==3){
            System.out.println("test passed");
        }
        else{
            System.out.println("test faıled");
        }
        //5- Category isimlerini yazdirin
        int numara=1;
        for (WebElement each:listem
        ) {
            System.out.println(numara+"------"+each.getText());
            numara++;

        }
        //6- Sayfayi kapatin
        driver.close();
    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class selenıum11 {
    public static void main(String[] args) throws InterruptedException {
       // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2- Add Element butonuna basin
        WebElement element1=driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        element1.click();

        //  3- Delete butonu’nun gorunur oldugunu test edin
        WebElement delete= driver.findElement(By.xpath("//button[@class='added-manually']"));
        if(delete.isDisplayed()){
            System.out.println("test passed");
        }
        else{
            System.out.println("test faıled");
        }
        // 4- Delete tusuna basin
        delete.click();
        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement element=driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));
        if(element.isDisplayed()){
            System.out.println("test passed");
        }
        else{
            System.out.println("test faıled");
        }
        Thread.sleep(3000);
        driver.close();
    }
}

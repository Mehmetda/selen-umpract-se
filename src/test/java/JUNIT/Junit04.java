package JUNIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit04 {
    static WebDriver driver;
    @BeforeClass
    public  static void test01(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");

    }
    @AfterClass
    public static void test02(){
        driver.close();

    }
    @Test
    public void test03(){

        Assert.assertTrue(driver.getTitle().equals("YouTube"));

    }
    @Test
    public void test04(){
        WebElement youtube= driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        Assert.assertTrue(youtube.isDisplayed());
    }
    @Test
    public void test05(){
        WebElement search= driver.findElement(By.xpath("//input[@id='search']"));
        Assert.assertTrue(search.isEnabled());

    }
   // 1) Bir class oluşturun: YoutubeAssertions
//2) https://www.youtube.com adresine gidin
           // 3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
// ○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
// ○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
// ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    //  ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
    @Test
    public void test06(){
         Assert.assertFalse(driver.getTitle().equals("youtube"));


    }







}

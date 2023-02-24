package JUNIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit06  {
    static WebDriver driver;
    @BeforeClass
    public static void test01(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void test02(){

        driver.close();
    }


    //2. http://automationpractice.com/index.php sayfasina gidelim

    //3. Sign in butonuna basalim
    @Test
    public void test03(){
        driver.get("https://www.skype.com/");
        driver.findElement(By.xpath("(//span[text()='Skype’ı tarayıcınızda açın'])[1]")).click();
        driver.findElement(By.xpath("(//span[text()='Skype’ı tarayıcınızda açın'])[1]")).click();
        driver.findElement(By.id("i0116")).sendKeys("sdf", Keys.ENTER);


    }
//4. Email kutusuna @isareti olmayan bir mail yazip enter’a bastigimizda “Invalid
    //email address” uyarisi ciktigini test edelim
    @Test
    public void test04(){
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='col-md-24 error ext-error']")).isDisplayed());
    }
}

package JUNIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class junit05 {

    @BeforeClass
    public  void test01(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterClass
    public void test02(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.close();

    }

//2. http://automationpractice.com/index.php sayfasina gidelim
    // 3. Sign in butonuna basalim
//4. Email kutusuna @isareti olmayan bir mail yazip enter’a bastigimizda “Invalid
    //email address” uyarisi ciktigini test edelim


}

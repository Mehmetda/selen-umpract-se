package JUNIT;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class junit10 extends Junit08 {

// ...Exercise4...
//Navigate to  https://testpages.herokuapp.com/styled/index.html
@Test
    public void test01(){
    driver.get("https://testpages.herokuapp.com/styled/index.html");
    String ilkhandle=driver.getWindowHandle();
    driver.findElement(By.id("calculatetest")).click();
    Set<String> handles=driver.getWindowHandles();
    String ikincihandle="";
    for (String each:handles
         ) {
        if(!each.equals(ilkhandle)){
            ikincihandle=each;
        }

    }
    driver.switchTo().window(ikincihandle);
    driver.findElement(By.id("number1")).sendKeys("5224");
    WebElement ddm=driver.findElement(By.id("function"));
    Select seç=new Select(ddm);
    seç.selectByIndex(1);
    driver.findElement(By.id("number2")).sendKeys("5221");
    driver.findElement(By.id("calculate")).click();
    WebElement sonuç= driver.findElement(By.id("answer"));
    System.out.println(sonuç.getText());


}
//Click on  Calculater under Micro Apps
//Type any number in the first input
//Type any number in the second input
//Click on Calculate
//Get the result
//Print the result


}

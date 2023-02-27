package work2;


import mehmetwork.testbase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class work21 extends testbase {

    @Test
    public void test01(){

        //1- Amazon anasayfaya gidin

        driver.get("https://www.amazon.com");
        //2- tum cookie’leri listeleyin
        Set<Cookie> cookies=driver.manage().getCookies();
        for (Cookie each:cookies
             ) {
            System.out.println(each.toString());

        }
        //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        Assert.assertTrue(cookies.size()>5);
        //4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        String actuelvalue=driver.manage().getCookieNamed("i18n-prefs").getValue();
        String expected="USD";
        Assert.assertTrue(expected.equals(actuelvalue));
        //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie
        //olusturun ve sayfaya ekleyin
        Cookie benimcookie=new Cookie("en sevdiğim cookie","çikolatalı");
        driver.manage().addCookie(benimcookie);
        //6- eklediginiz cookie’nin sayfaya eklendigini test edin
        cookies=driver.manage().getCookies();
        int sırano=1;
        for (Cookie each:cookies
             ) {
            System.out.println(sırano+"====="+each.toString());
            sırano++;

        }

        //7- ismi skin olan cookie’yi silin ve silindigini test edin
        driver.manage().deleteCookieNamed("skin");
        cookies=driver.manage().getCookies();
        for (Cookie each:cookies
             ) {
            Assert.assertFalse(each.getName().equals("skin"));

        }

        //8- tum cookie’leri silin ve silindigini test edin
        driver.manage().deleteAllCookies();
        cookies=driver.manage().getCookies();
        Assert.assertTrue(cookies.size()==0);
    }
}

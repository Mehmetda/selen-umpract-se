package mehmetwork;

import JUNIT.Junit08;
import org.junit.Test;

public class work1 extends testbase {

    @Test
    public void test01(){
        //1- Bir class olusturun : BasicAuthentication
        //2- https://the-internet.herokuapp.com/basic_auth
        //sayfasina gidin
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        bekle(3000);

        //3- asagidaki yontem ve test datalarini kullanarak
        //authentication’i yapin
        //Html komutu : https://username:password@URL
        //Username : admin
        //password : admin
        //4- Basarili sekilde sayfaya girildigini dogrulayin


    }


}

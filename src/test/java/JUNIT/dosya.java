package JUNIT;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class dosya {
    // Calistigimiz package icerisinde
    // text.txt isimli bir file oldugunu test edin
    @Test
            public void test01(){

        //String dinamikDosyaYolu = System.getProperty("user.dir")
               // +"/src/test/java/day07_actionsClass_fileTestleri/text.txt";
        //Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));

        String dosyayolu=System.getProperty("user.dir")+"/src/test/java/JUNIT/text.txt";

  Assert.assertTrue(Files.exists(Paths.get(dosyayolu)));


    }



}

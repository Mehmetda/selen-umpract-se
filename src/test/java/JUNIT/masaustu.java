package JUNIT;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class masaustu {
    // Masaustumuzde theDelta.docx isimli bir dosya bulundugunu test edin

    @Test
    public void test01(){
        String dosyayolu=System.getProperty("user.home")+"/Desktop/TheDelta.docx";
        Assert.assertTrue(Files.exists(Paths.get(dosyayolu)));
        System.out.println(System.getProperty("user.dir"));
    }
}

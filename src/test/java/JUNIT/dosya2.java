package JUNIT;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class dosya2 {
    @Test
    public void test(){

        String dosya=System.getProperty("user.dir")+"/src/test/java/JUNIT/text1.txt";
        Assert.assertTrue(Files.exists(Paths.get(dosya)));
    }
}

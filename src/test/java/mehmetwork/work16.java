package mehmetwork;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class work16 extends testbase {

    @Test
    public void test01(){
        String dosyayolu=System.getProperty("user.dir")+"/src/test/java/mehmetwork/text.txt";
        Assert.assertTrue(Files.exists(Paths.get(dosyayolu)));


    }
}

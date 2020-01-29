import org.junit.Assert;
import org.junit.gen5.api.Test;

public class SecondTestClass extends FirstTestClass{

    @Test
    public void runTestSecond(){
        Assert.assertEquals(nameParam,"Hello world","Test on equals");

    }
}

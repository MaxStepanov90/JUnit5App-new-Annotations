import org.junit.gen5.api.BeforeAll;
import org.junit.gen5.api.Test;
import org.junit.jupiter.api.*;

public class FirstTestClass {

    public static String nameParam;
    public static int counter;

    @DisplayName("FirstTest runs")
    @BeforeAll
    public void setUp() {
        nameParam = "Hello World";
    }

    @Test
    @Disabled
    @Tag("counter")
    public void runTest() {
        for (int i = 0; i < 10; i++) {
            counter = +i;
        }
    }
    @Test
    @Tag("double counter")
    public void  runTest2(){
        for (int i = 0; i < 10; i++){
            counter =+ i*2;
        }
    }

    @AfterAll
    public void teardown() {
    }

    @AfterEach
    public void cleanUp() {
        counter = 0;
    }
}

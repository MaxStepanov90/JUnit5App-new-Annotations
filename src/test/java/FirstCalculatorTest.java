import com.example.project.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("fast")
public class FirstCalculatorTest {

    @Test
    @DisplayName("Test Calculator method add")
    void testCalculatorAdd(TestInfo testInfo){
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.add(1,1),"1+1 should equal 2");
        assertEquals("Test Calculator method add",testInfo.getDisplayName(),()->"TestInfo is injected correctly");

    }
    @Test
    @DisplayName("Test Calculator method minus")
    void testCalculatorMinus(TestInfo testInfo){
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.minus(1,1),"3-1 should equal 2");
        assertEquals("Test Calculator method minus",testInfo.getDisplayName(),()->"TestInfo is injected correctly");

    }
}

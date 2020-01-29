import com.example.project.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("NO")
public class SecondCalculatorTest {

    @Test
    @DisplayName("Should not be appeared")
    void testCalculatorAdd(TestInfo testInfo){
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.add(1,1),"1+1 should equal 2");
        assertEquals("Should not be appeared",testInfo.getDisplayName(),()->"TestInfo is injected correctly");

    }
}

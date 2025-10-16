import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Advanced_CalculatorTest {
    Advanced_Calculator advancedCalc;

    @BeforeEach
    void setUp() {
        advancedCalc = new Advanced_Calculator();
        advancedCalc.setNumbers(9,3);
    }

    @Test
    void multiply() {
        assertEquals(27,advancedCalc.multiply());
    }

    @Test
    void divide() {
        assertEquals(3,advancedCalc.divide());
    }
}
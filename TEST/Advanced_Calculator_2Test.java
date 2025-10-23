import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Advanced_Calculator_2Test {
    Advanced_Calculator_2 advancedCalc_2;


    @BeforeEach
    void setUp() {
        advancedCalc_2 = new Advanced_Calculator_2();
        advancedCalc_2.setNumbers(7,3);
    }

    @Test
    void power() {
        assertEquals(343,advancedCalc_2.power());
    }
}
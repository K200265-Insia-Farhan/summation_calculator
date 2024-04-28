import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class sumCalculatorTests {
    @Test
    public void testSumGreaterThan100() {
        assertEquals("140", sumCalculator.calculateSum(80, 60));
    }

    @Test
    public void testSumEquals100() {
        assertEquals("2100", sumCalculator.calculateSum(30, 70));
    }

    @Test
    public void testSumLessThan100() {
        assertEquals("30", sumCalculator.calculateSum(10, 40));
    }

    @Test
    public void testSameNumbers() {
        assertEquals("Error", sumCalculator.calculateSum(-20, -20));
    }
}

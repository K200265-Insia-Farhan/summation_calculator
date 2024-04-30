import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class sumCalculatorTests {
    @Test
    public void testSumGreaterThan100() {
        assertEquals("140", sumCalculator.calculateSum(80, 60,1,140));
    }

    @Test
    public void testSumEquals100() {
        assertEquals("2100", sumCalculator.calculateSum(30, 70,2,2100));
    }

    @Test
    public void testSumLessThan100() {
        assertEquals("30", sumCalculator.calculateSum(10, 40,3,30));
    }

    @Test
    public void testSameNumbers() {
        assertEquals("Error", sumCalculator.calculateSum(-20, -20,4,0));
    }
}

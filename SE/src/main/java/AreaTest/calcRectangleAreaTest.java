package AreaTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calcRectangleAreaTest {
    @Test
    public void testCalculateRectangleArea() {
        double result = calcAreaRectangle.calcRectangleArea(5, 4);
        double expected_result = 5 * 4;
        assertEquals(expected_result, result, 0.0001);
    }

    @Test
    public void testCalculateRectangleAreaWithNegativeInput() {
        try {
            calcAreaRectangle.calcRectangleArea(-5, 4);
        } catch (IllegalArgumentException e) {
            assertEquals("Length and width must be positive numbers.", e.getMessage());
        }
    }
}

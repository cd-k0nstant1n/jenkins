package AreaTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calcAreaTest {

        @Test
        public void testCalculateTriangleArea() {
            // Test with base=3 and height=4
            double result = calcAreaTriangle.calcTriangleArea(3, 4);
            double expected_result = 0.5 * 3 * 4;
            assertEquals(expected_result, result, 0.0001);
        }
}

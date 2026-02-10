package leetcode.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumAverageSubArrayITest {
    @Test
    void testBasic() {
        MaximumAverageSubArrayI maximumAverageSubarrayI = new MaximumAverageSubArrayI();
        double maxAverage = maximumAverageSubarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        assertEquals(12.75000, maxAverage);
    }
}

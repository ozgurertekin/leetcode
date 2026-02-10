package leetcode.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubArraySumTest {

    @Test
    void testBasic() {
        MinimumSizeSubArraySum minimumSizeSubarraySum = new MinimumSizeSubArraySum();
        int result = minimumSizeSubarraySum.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        assertEquals(2, result);

        int result2 = minimumSizeSubarraySum.minSubArrayLen(4, new int[]{1, 4, 4});
        assertEquals(1, result2);

        int result3 = minimumSizeSubarraySum.minSubArrayLen(2, new int[]{2, 3, 1, 2, 4, 3});
        assertEquals(1, result3);
    }
}
package leetcode.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCommonValueTest {
    @Test
    void testBasic() {
        MinimumCommonValue minimumCommonValue = new MinimumCommonValue();
        int result = minimumCommonValue.getCommon(new int[]{1, 2, 3}, new int[]{2, 4});
        assertEquals(2, result);

        int result2 = minimumCommonValue.getCommon(new int[]{1, 2, 3, 6}, new int[]{5, 6, 7});
        assertEquals(6, result2);

        int result3 = minimumCommonValue.getCommon(new int[]{1, 2, 3}, new int[]{5, 6, 7});
        assertEquals(-1, result3);
    }
}
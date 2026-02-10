package leetcode.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquaresSortedArrayTest {
    @Test
    void testBasic() {
        SquaresSortedArray squaresSortedArray = new SquaresSortedArray();
        int[] result = squaresSortedArray.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, result);

        int[] result2 = squaresSortedArray.sortedSquares(new int[]{});
        assertArrayEquals(new int[]{}, result2);
    }
}

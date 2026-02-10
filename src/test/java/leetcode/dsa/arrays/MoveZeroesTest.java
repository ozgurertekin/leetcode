package leetcode.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {
    @Test
    void testBasic() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] result = moveZeroes.moveZeroes(new int[]{0, 1, 0, 3, 12});
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, result);
    }
}
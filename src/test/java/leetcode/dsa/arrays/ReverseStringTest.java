package leetcode.dsa.arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseStringTest {
    @Test
    void testBasic() {
        ReverseString reverseString = new ReverseString();
        char[] chars = reverseString.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, chars);

        char[] chars2 = reverseString.reverseString(new char[]{'h', 'e', 'l', 'o'});
        assertArrayEquals(new char[]{'o', 'l', 'e', 'h'}, chars2);

    }
}

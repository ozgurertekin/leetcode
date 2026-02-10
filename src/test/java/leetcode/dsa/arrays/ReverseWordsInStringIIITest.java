package leetcode.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInStringIIITest {
    @Test
    void testBasic() {
        ReverseWordsInStringIII reverseWordsInStringIII = new ReverseWordsInStringIII();
        String result = reverseWordsInStringIII.reverseWords("Let's take LeetCode contest");
        assertEquals("s'teL ekat edoCteeL tsetnoc", result);
    }
}
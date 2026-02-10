package leetcode.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfVowelsSubstringGiveLengthTest {
    @Test
    void testBasic() {
        MaximumNumberOfVowelsSubstringGiveLength maximumNumberOfVowelsSubstringGiveLength = new MaximumNumberOfVowelsSubstringGiveLength();

        int result = maximumNumberOfVowelsSubstringGiveLength.maxVowels("abciiidef", 3);
        assertEquals(3, result);

        int result2 = maximumNumberOfVowelsSubstringGiveLength.maxVowels("abciidef", 3);
        assertEquals(2, result2);

        int result3 = maximumNumberOfVowelsSubstringGiveLength.maxVowels("tryhard", 4);
        assertEquals(1, result3);

        int result4 = maximumNumberOfVowelsSubstringGiveLength.maxVowels("a", 1);
        assertEquals(1, result4);

    }

}
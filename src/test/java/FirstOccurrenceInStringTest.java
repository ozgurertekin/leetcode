import leetcode.general.FirstOccurrenceInString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstOccurrenceInStringTest {
    @Test
    void testBasic(){
        FirstOccurrenceInString firstOccurrenceInString = new FirstOccurrenceInString();
        int result = firstOccurrenceInString.strStr("sadbutsad", "sad");
        assertEquals(0, result);

        int result2 = firstOccurrenceInString.strStr("hello", "ll");
        assertEquals(2, result2);


        int result3 = firstOccurrenceInString.strStr("leetcode", "leeto");
        assertEquals(-1, result3);

        int result4 = firstOccurrenceInString.strStr("heeeell", "ll");
        assertEquals(5, result4);

    }
}

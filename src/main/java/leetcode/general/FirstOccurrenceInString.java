package leetcode.general;

/**
 * 28 Find the Index of the First Occurrence in a String
 *  EASY
 * Two Pointers
 * String
 * String Matching
 */
public class FirstOccurrenceInString {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length()  ; i++) {
            if(haystack.startsWith(needle, i)){
                return i;
            }
        }
        return -1;
    }
}

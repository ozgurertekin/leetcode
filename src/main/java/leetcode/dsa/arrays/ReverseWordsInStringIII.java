package leetcode.dsa.arrays;

/**
 * 557. Reverse Words in a String III
 * Two Pointers
 * String
 */
public class ReverseWordsInStringIII {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int j = 0;
        StringBuilder temp = new StringBuilder();
        while (j <= s.length() - 1) {
            if (Character.isWhitespace(s.charAt(j))) {
                ans.append(temp.reverse());
                temp = new StringBuilder();
                ans.append(s.charAt(j++));
            } else {
                temp.append(s.charAt(j++));
            }
        }
        return ans.append(temp.reverse()).toString();
    }
}

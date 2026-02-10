package leetcode.dsa.arrays;

import java.util.Set;

/**
 * 1456. Maximum Number of Vowels in a Substring of Given Length
 * MEDIUM
 * String
 * Sliding Window
 */
public class MaximumNumberOfVowelsSubstringGiveLength {
    public int maxVowels(String s, int k) {
        int ans, curr = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                curr++;
            }
        }
        ans = curr;
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k))) {
                curr--;
            }
            if (vowels.contains(s.charAt(i))) {
                curr++;
            }
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}

package leetcode.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * 1189. Maximum Number of Balloons
 * EASY
 * Hash Table
 * String
 * Counting
 */
public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int result = 0;
        String balloon = "balloon";
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char letter : text.toCharArray()) {
            frequencyMap.put(letter, frequencyMap.getOrDefault(letter, 0) + 1);
        }

        while (!frequencyMap.containsValue(0)) {
            for (char letter : balloon.toCharArray()) {
                Integer count = frequencyMap.getOrDefault(letter, 0);
                if(count == 0){
                    return result;
                }
                frequencyMap.put(letter, --count);
            }
            result++;
        }
        return result;
    }
}

package leetcode.dsa.arrays;

/**
 * 209. Minimum Size Sub Array Sum
 * MEDIUM
 * Array
 * Binary Search
 * Sliding Window
 * Prefix Sum
 */
public class MinimumSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, curr = 0, ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            while (curr >= target) {
                ans = Math.min(ans, i - left + 1);
                curr -= nums[left];
                left++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}

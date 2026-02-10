package leetcode.dsa.arrays;

/**
 * 643. Maximum Average Sub Array I
 * EASY
 * Array
 * Sliding Window
 */
public class MaximumAverageSubArrayI {
    public double findMaxAverage(int[] nums, int k) {
        double ans, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        ans = sum;
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            ans = Math.max(ans, sum);
        }
        return ans / k;
    }
}

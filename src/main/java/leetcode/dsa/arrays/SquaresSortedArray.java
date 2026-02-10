package leetcode.dsa.arrays;

/**
 * 977. Squares of a Sorted Array
 * EASY
 * Array
 * Two Pointers
 * Sorting
 */
public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int resultIndex = nums.length - 1;
        while (right >= left) {
            if (Math.abs(nums[right]) >= Math.abs(nums[left])) {
                result[resultIndex--] = nums[right] * nums[right];
                right--;
            } else {
                result[resultIndex--] = nums[left] * nums[left];
                left++;
            }
        }
        return result;
    }
}

package leetcode.dsa.arrays;

/**
 * 283. Move Zeroes
 * Array
 * Two Pointers
 */
public class MoveZeroes {
    public int[] moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0, i = 0;

        while (i < nums.length) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = temp;
                lastNonZeroFoundAt++;
            }
            i++;
        }
        return nums;
    }
}

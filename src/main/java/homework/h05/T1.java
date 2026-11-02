package homework.h05;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
public class T1 {
  public static int maxProductDifference(int[] nums) {
    Arrays.sort(nums);
    int arrayLength = nums.length;
    return nums[arrayLength - 1] * nums[arrayLength - 2] - nums[0] * nums[1];
  }
}

package com.guo.leetcode.practice;

import com.guo.leetcode.annitation.Practice;

public class FindShortestSubArray {

    @Practice(name = "数组的度", url = "https://leetcode-cn.com/problems/degree-of-an-array/")
    public static int findShortestSubArray(int[] nums) {

        return 1;
    }

    public static int[] sort1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 9, 8, 3, 2, 4655, 445};
        nums = sort1(nums);
        for (int num : nums) {
            System.out.println(num);
        }

    }
}

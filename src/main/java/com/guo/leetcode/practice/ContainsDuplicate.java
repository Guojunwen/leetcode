package com.guo.leetcode.practice;

import com.guo.leetcode.annitation.Practice;

import java.util.*;

public class ContainsDuplicate {
    /**
     * 给定一个整数数组，判断是否存在重复元素。
     * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
     */
    @Practice(name = "存在重复元素",url = "https://leetcode-cn.com/problems/contains-duplicate/")
    public static boolean containsDuplicate(int[] nums) {
//        List<Integer> temp=new ArrayList<>();
//        for (int num:nums){
//            if (!temp.contains(num)){
//                temp.add(num);
//            }else {
//                return true;
//            }
//        }
//        return false;
        //排序，判断是否有相邻两个相同的数
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,4,2}));
    }
}

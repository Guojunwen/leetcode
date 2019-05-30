package com.guo.leetcode.practice;

import com.guo.leetcode.annitation.Practice;

public class IsPalindrome {

    @Practice(name = "回文数",url = "https://leetcode-cn.com/problems/palindrome-number/")
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }else {
            String num= String.valueOf(x);
            char[] nums=num.toCharArray();
            int len=nums.length;
            for (int i = 0; i <len/2; i++) {
                if (nums[i]!=nums[len-i-1]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}

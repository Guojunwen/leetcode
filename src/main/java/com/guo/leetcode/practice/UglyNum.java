package com.guo.leetcode.practice;

import com.guo.leetcode.annitation.Practice;

public class UglyNum {
    /**
     * 编写一个程序判断给定的数是否为丑数。
     * 丑数就是只包含质因数 2, 3, 5 的正整数。
     */
    @Practice(name = "丑数", url = "https://leetcode-cn.com/problems/ugly-number/")
    public static boolean isUgly(int num) {
        if (num == 1) {
            return true;
        }
        if (num <= 0) {
            return false;
        }
        while (num > 1) {
            if (num == 2 || num == 3 || num == 5) {
                return true;
            } else if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 3 == 0) {
                num = num / 3;
            } else if (num % 5 == 0) {
                num = num / 5;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(6));//true
        System.out.println(isUgly(8));//true
        System.out.println(isUgly(14));//false
        System.out.println(isUgly(16));//true
    }
}
